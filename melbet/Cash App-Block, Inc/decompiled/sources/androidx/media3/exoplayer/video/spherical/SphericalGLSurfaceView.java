package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.spherical.OrientationListener;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.q4$$ExternalSyntheticLambda0;
import com.android.volley.Response;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import java.nio.Buffer;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public boolean isOrientationListenerRegistered;
    public boolean isStarted;
    public final Handler mainHandler;
    public final OrientationListener orientationListener;
    public final Sensor orientationSensor;
    public final SceneRenderer scene;
    public final SensorManager sensorManager;
    public Surface surface;
    public SurfaceTexture surfaceTexture;
    public boolean useSensorRotation;
    public final CopyOnWriteArrayList videoSurfaceListeners;

    public final class Renderer implements GLSurfaceView.Renderer, OrientationListener.Listener {
        public final float[] deviceOrientationMatrix;
        public float deviceRoll;
        public final SceneRenderer scene;
        public float touchPitch;
        public final float[] touchPitchMatrix;
        public final float[] touchYawMatrix;
        public final float[] projectionMatrix = new float[16];
        public final float[] viewProjectionMatrix = new float[16];
        public final float[] viewMatrix = new float[16];
        public final float[] tempMatrix = new float[16];

        public Renderer(SceneRenderer sceneRenderer) {
            float[] fArr = new float[16];
            this.deviceOrientationMatrix = fArr;
            float[] fArr2 = new float[16];
            this.touchPitchMatrix = fArr2;
            float[] fArr3 = new float[16];
            this.touchYawMatrix = fArr3;
            this.scene = sceneRenderer;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.deviceRoll = 3.1415927f;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            Object poll;
            synchronized (this) {
                Matrix.multiplyMM(this.tempMatrix, 0, this.deviceOrientationMatrix, 0, this.touchYawMatrix, 0);
                Matrix.multiplyMM(this.viewMatrix, 0, this.touchPitchMatrix, 0, this.tempMatrix, 0);
            }
            Matrix.multiplyMM(this.viewProjectionMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
            SceneRenderer sceneRenderer = this.scene;
            float[] fArr = this.viewProjectionMatrix;
            GLES20.glClear(16384);
            try {
                Log.checkGlError();
            } catch (GlUtil$GlException e) {
                Log.e("SceneRenderer", "Failed to draw a frame", e);
            }
            if (sceneRenderer.frameAvailable.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = sceneRenderer.surfaceTexture;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    Log.checkGlError();
                } catch (GlUtil$GlException e2) {
                    Log.e("SceneRenderer", "Failed to draw a frame", e2);
                }
                if (sceneRenderer.resetRotationAtNextFrame.compareAndSet(true, false)) {
                    Matrix.setIdentityM(sceneRenderer.rotationMatrix, 0);
                }
                long timestamp = sceneRenderer.surfaceTexture.getTimestamp();
                TimedValueQueue timedValueQueue = sceneRenderer.sampleTimestampQueue;
                synchronized (timedValueQueue) {
                    poll = timedValueQueue.poll(timestamp, false);
                }
                Long l = (Long) poll;
                if (l != null) {
                    Response response = sceneRenderer.frameRotationQueue;
                    float[] fArr2 = sceneRenderer.rotationMatrix;
                    float[] fArr3 = (float[]) ((TimedValueQueue) response.error).pollFloor(l.longValue());
                    if (fArr3 != null) {
                        float[] fArr4 = (float[]) response.cacheEntry;
                        float f = fArr3[0];
                        float f2 = -fArr3[1];
                        float f3 = -fArr3[2];
                        float length = Matrix.length(f, f2, f3);
                        if (length != RecyclerView.DECELERATION_RATE) {
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!response.intermediate) {
                            Response.computeRecenterMatrix((float[]) response.result, (float[]) response.cacheEntry);
                            response.intermediate = true;
                        }
                        Matrix.multiplyMM(fArr2, 0, (float[]) response.result, 0, (float[]) response.cacheEntry, 0);
                    }
                }
                Projection projection = (Projection) sceneRenderer.projectionQueue.pollFloor(timestamp);
                if (projection != null) {
                    ProjectionRenderer projectionRenderer = sceneRenderer.projectionRenderer;
                    projectionRenderer.getClass();
                    if (ProjectionRenderer.isSupported(projection)) {
                        projectionRenderer.stereoMode = projection.stereoMode;
                        projectionRenderer.leftMeshData = new TimedValueQueue(projection.leftMesh.subMeshes[0]);
                        if (!projection.singleMesh) {
                            TimedValueQueue timedValueQueue2 = projection.rightMesh.subMeshes[0];
                            float[] fArr5 = (float[]) timedValueQueue2.timestamps;
                            int length2 = fArr5.length;
                            Log.createBuffer(fArr5);
                            Log.createBuffer((float[]) timedValueQueue2.values);
                        }
                    }
                }
            }
            Matrix.multiplyMM(sceneRenderer.tempMatrix, 0, fArr, 0, sceneRenderer.rotationMatrix, 0);
            ProjectionRenderer projectionRenderer2 = sceneRenderer.projectionRenderer;
            int i = sceneRenderer.textureId;
            float[] fArr6 = sceneRenderer.tempMatrix;
            TimedValueQueue timedValueQueue3 = projectionRenderer2.leftMeshData;
            if (timedValueQueue3 == null) {
                return;
            }
            int i2 = projectionRenderer2.stereoMode;
            GLES20.glUniformMatrix3fv(projectionRenderer2.uTexMatrixHandle, 1, false, i2 == 1 ? ProjectionRenderer.TEX_MATRIX_TOP : i2 == 2 ? ProjectionRenderer.TEX_MATRIX_LEFT : ProjectionRenderer.TEX_MATRIX_WHOLE, 0);
            GLES20.glUniformMatrix4fv(projectionRenderer2.mvpMatrixHandle, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(projectionRenderer2.textureHandle, 0);
            try {
                Log.checkGlError();
            } catch (GlUtil$GlException e3) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.positionHandle, 3, 5126, false, 12, (Buffer) timedValueQueue3.timestamps);
            try {
                Log.checkGlError();
            } catch (GlUtil$GlException e4) {
                Log.e("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.texCoordsHandle, 2, 5126, false, 8, (Buffer) timedValueQueue3.values);
            try {
                Log.checkGlError();
            } catch (GlUtil$GlException e5) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(timedValueQueue3.size, 0, timedValueQueue3.first);
            try {
                Log.checkGlError();
            } catch (GlUtil$GlException e6) {
                Log.e("ProjectionRenderer", "Failed to render", e6);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
        public final synchronized void onOrientationChange(float f, float[] fArr) {
            float[] fArr2 = this.deviceOrientationMatrix;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.deviceRoll = f2;
            Matrix.setRotateM(this.touchPitchMatrix, 0, -this.touchPitch, (float) Math.cos(f2), (float) Math.sin(this.deviceRoll), RecyclerView.DECELERATION_RATE);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
            float f = i / i2;
            Matrix.perspectiveM(this.projectionMatrix, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f)) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.mainHandler.post(new q4$$ExternalSyntheticLambda0(6, sphericalGLSurfaceView, this.scene.init()));
        }
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoSurfaceListeners = new CopyOnWriteArrayList();
        this.mainHandler = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.sensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.orientationSensor = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        SceneRenderer sceneRenderer = new SceneRenderer();
        this.scene = sceneRenderer;
        Renderer renderer = new Renderer(sceneRenderer);
        View.OnTouchListener touchTracker = new TouchTracker(context, renderer);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.orientationListener = new OrientationListener(windowManager.getDefaultDisplay(), touchTracker, renderer);
        this.useSensorRotation = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mainHandler.post(new AFd1lSDK$$ExternalSyntheticLambda0(this, 20));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.isStarted = false;
        updateOrientationListenerRegistration();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.isStarted = true;
        updateOrientationListenerRegistration();
    }

    public void setDefaultStereoMode(int i) {
        this.scene.defaultStereoMode = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.useSensorRotation = z;
        updateOrientationListenerRegistration();
    }

    public final void updateOrientationListenerRegistration() {
        boolean z = this.useSensorRotation && this.isStarted;
        Sensor sensor = this.orientationSensor;
        if (sensor == null || z == this.isOrientationListenerRegistered) {
            return;
        }
        OrientationListener orientationListener = this.orientationListener;
        SensorManager sensorManager = this.sensorManager;
        if (z) {
            sensorManager.registerListener(orientationListener, sensor, 0);
        } else {
            sensorManager.unregisterListener(orientationListener);
        }
        this.isOrientationListenerRegistered = z;
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }
}
