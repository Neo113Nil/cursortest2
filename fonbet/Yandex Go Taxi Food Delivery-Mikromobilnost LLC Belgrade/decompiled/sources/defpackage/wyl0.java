package defpackage;

import android.app.Activity;
import android.content.res.AssetManager;
import android.media.Image;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import com.google.ar.core.Anchor;
import com.google.ar.core.Camera;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.DepthPoint;
import com.google.ar.core.Frame;
import com.google.ar.core.HitResult;
import com.google.ar.core.InstantPlacementPoint;
import com.google.ar.core.Plane;
import com.google.ar.core.Point;
import com.google.ar.core.PointCloud;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.Trackable;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.NotYetAvailableException;
import com.yandex.smartcamera.arscene.ar_core.helpers.TapHelper;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Mesh$PrimitiveMode;
import defpackage.a801;
import defpackage.azh0;
import defpackage.cn91;
import defpackage.cob1;
import defpackage.g8e;
import defpackage.gpt0;
import defpackage.gw00;
import defpackage.hsu0;
import defpackage.kbs;
import defpackage.kcz0;
import defpackage.l1;
import defpackage.mhc0;
import defpackage.nhc0;
import defpackage.ooc;
import defpackage.pva1;
import defpackage.r100;
import defpackage.r2x0;
import defpackage.r33;
import defpackage.rvr;
import defpackage.s33;
import defpackage.tkb1;
import defpackage.tls;
import defpackage.uxj;
import defpackage.vyl0;
import defpackage.w511;
import defpackage.wyl0;
import defpackage.yfr0;
import defpackage.yh4;
import defpackage.z701;
import defpackage.zi6;
import defpackage.zr10;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class wyl0 {
    public final AssetManager a;
    public int b = 1;
    public int c = 1;

    public wyl0(GLSurfaceView gLSurfaceView, final vyl0 vyl0Var, AssetManager assetManager) {
        this.a = assetManager;
        gLSurfaceView.setEGLConfigChooser(new GLSurfaceView.EGLConfigChooser() { // from class: com.yandex.smartcamera.arscene.ar_core.samplerender.SampleRender$1
            @Override // android.opengl.GLSurfaceView.EGLConfigChooser
            public EGLConfig chooseConfig(EGL10 egl, EGLDisplay display) {
                int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, 4, 12344};
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (egl != null) {
                    egl.eglChooseConfig(display, iArr, eGLConfigArr, 1, iArr2);
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                if (eGLConfig != null) {
                    return eGLConfig;
                }
                kbs.g("No valid EGL config found");
                return null;
            }
        });
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        try {
            gLSurfaceView.setEGLContextClientVersion(3);
        } catch (Exception unused) {
            Log.e("wyl0", "GLES3 not supported, falling back to GLES2");
            gLSurfaceView.setEGLContextClientVersion(2);
        }
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        gLSurfaceView.setRenderer(new GLSurfaceView.Renderer() { // from class: com.yandex.smartcamera.arscene.ar_core.samplerender.SampleRender$2
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:271:0x01cd  */
            /* JADX WARN: Removed duplicated region for block: B:284:0x01fa  */
            /* JADX WARN: Removed duplicated region for block: B:293:0x0101  */
            /* JADX WARN: Removed duplicated region for block: B:302:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:322:0x014e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:324:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0216  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x022c  */
            /* JADX WARN: Type inference failed for: r3v102 */
            /* JADX WARN: Type inference failed for: r3v94, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v95 */
            /* JADX WARN: Type inference failed for: r3v96 */
            /* JADX WARN: Type inference failed for: r3v97 */
            /* JADX WARN: Type inference failed for: r3v98 */
            @Override // android.opengl.GLSurfaceView.Renderer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onDrawFrame(GL10 gl) {
                float[] fArr;
                float[] fArr2;
                float[] fArr3;
                MotionEvent poll;
                Iterator it;
                float f;
                Object obj;
                HitResult hitResult;
                Iterator it2;
                final kcz0 kcz0Var;
                TrackingState trackingState;
                TrackingState trackingState2;
                TrackingState trackingState3;
                int i;
                nhc0 nhc0Var;
                float f2;
                Camera camera;
                float[] fArr4;
                float[] fArr5;
                float[] fArr6;
                String str;
                float[] fArr7;
                l1 l1Var;
                float[] fArr8;
                float f3;
                Object obj2;
                float[] fArr9;
                float[] fArr10;
                HashMap hashMap;
                float f4;
                hsu0 hsu0Var;
                yh4 yh4Var;
                ArrayList arrayList;
                Plane plane;
                Plane plane2;
                Collection allTrackables;
                yh4 yh4Var2;
                yfr0 yfr0Var;
                uxj uxjVar;
                this.a(null, 1.0f);
                vyl0 vyl0Var2 = vyl0.this;
                wyl0 wyl0Var = this;
                s33 s33Var = (s33) vyl0Var2;
                float[] fArr11 = s33Var.Z;
                float[] fArr12 = s33Var.Z;
                float[] fArr13 = s33Var.W;
                float[] fArr14 = s33Var.U;
                float[] fArr15 = s33Var.V;
                tls tlsVar = s33Var.x;
                Activity activity = s33Var.a;
                float[] fArr16 = s33Var.T;
                l1 l1Var2 = s33Var.b;
                Session session = l1Var2.w;
                if (session == null) {
                    return;
                }
                if (s33Var.L) {
                    s33Var.L = false;
                    try {
                        zr10 zr10Var = s33Var.N;
                        if (zr10Var != null) {
                            zr10Var.close();
                        }
                        s33Var.N = tkb1.b(s33Var.M);
                    } catch (Exception unused2) {
                    }
                }
                if (!s33Var.G) {
                    yh4 yh4Var3 = s33Var.E;
                    if (yh4Var3 != null && (uxjVar = yh4Var3.g) != null) {
                        session.setCameraTextureNames(new int[]{((int[]) uxjVar.c)[0]});
                    }
                    s33Var.G = true;
                }
                s33Var.a0.updateSessionIfNeeded(session);
                try {
                    Frame update = session.update();
                    Camera camera2 = update.getCamera();
                    try {
                        yh4 yh4Var4 = s33Var.E;
                        if (yh4Var4 != null) {
                            yfr0 yfr0Var2 = yh4Var4.d;
                            if (yfr0Var2 != null) {
                                yfr0Var2.close();
                                yh4Var4.d = null;
                            }
                            fArr = fArr12;
                            fArr2 = fArr13;
                            yfr0 D = r100.D(wyl0Var, "shaders/background_show_camera.vert", "shaders/background_show_camera.frag", null);
                            D.k("u_CameraColorTexture", yh4Var4.g);
                            D.y = false;
                            D.z = false;
                            yh4Var4.d = D;
                        } else {
                            fArr = fArr12;
                            fArr2 = fArr13;
                        }
                        yh4 yh4Var5 = s33Var.E;
                        if (yh4Var5 != null) {
                            yh4Var5.a(wyl0Var);
                        }
                        yh4 yh4Var6 = s33Var.E;
                        if (yh4Var6 != null) {
                            FloatBuffer floatBuffer = yh4Var6.a;
                            if (update.hasDisplayGeometryChanged()) {
                                fArr3 = fArr16;
                                update.transformCoordinates2d(Coordinates2d.OPENGL_NORMALIZED_DEVICE_COORDINATES, yh4.j, Coordinates2d.TEXTURE_NORMALIZED, floatBuffer);
                                yh4Var6.c.a(floatBuffer);
                                if (camera2.getTrackingState() == TrackingState.TRACKING) {
                                    try {
                                        Image acquireDepthImage16Bits = update.acquireDepthImage16Bits();
                                        yh4 yh4Var7 = s33Var.E;
                                        if (yh4Var7 != null) {
                                            yh4Var7.b(acquireDepthImage16Bits);
                                        }
                                        acquireDepthImage16Bits.close();
                                    } catch (NotYetAvailableException | IllegalStateException unused3) {
                                    }
                                }
                                TapHelper tapHelper = s33Var.c;
                                if (camera2.getTrackingState() == TrackingState.TRACKING && (poll = tapHelper.poll()) != null) {
                                    it = update.hitTest(poll).iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            f = 0.0f;
                                            obj = null;
                                            break;
                                        }
                                        obj = it.next();
                                        HitResult hitResult2 = (HitResult) obj;
                                        f = 0.0f;
                                        Trackable trackable = hitResult2.getTrackable();
                                        it2 = it;
                                        if (trackable instanceof Plane) {
                                            if (((Plane) trackable).isPoseInPolygon(hitResult2.getHitPose())) {
                                                float f5 = nhc0.n;
                                                if (cn91.d(hitResult2.getHitPose(), camera2.getPose()) > 0.0f) {
                                                    break;
                                                }
                                            } else {
                                                continue;
                                            }
                                            it = it2;
                                        } else if (!(trackable instanceof Point)) {
                                            if ((trackable instanceof InstantPlacementPoint) || (trackable instanceof DepthPoint)) {
                                                break;
                                            } else {
                                                it = it2;
                                            }
                                        } else if (((Point) trackable).getOrientationMode() == Point.OrientationMode.ESTIMATED_SURFACE_NORMAL) {
                                            break;
                                        } else {
                                            it = it2;
                                        }
                                    }
                                    hitResult = (HitResult) obj;
                                    if (hitResult != null) {
                                        Anchor anchor = s33Var.Q;
                                        if (anchor != null) {
                                            anchor.detach();
                                        }
                                        s33Var.Q = hitResult.createAnchor();
                                        tapHelper.setObjectPlaced(true);
                                        s33Var.y.invoke();
                                    }
                                } else {
                                    f = 0.0f;
                                }
                                kcz0Var = s33Var.b0;
                                trackingState = camera2.getTrackingState();
                                Activity activity2 = (Activity) kcz0Var.a;
                                if (trackingState != ((TrackingState) kcz0Var.b)) {
                                    kcz0Var.b = trackingState;
                                    int i2 = a801.a[trackingState.ordinal()];
                                    final int i3 = 1;
                                    if (i2 == 1 || i2 == 2) {
                                        final int i4 = 0;
                                        activity2.runOnUiThread(new Runnable() { // from class: y701
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i5 = i4;
                                                kcz0 kcz0Var2 = kcz0Var;
                                                switch (i5) {
                                                    case 0:
                                                        ((Activity) kcz0Var2.a).getWindow().clearFlags(128);
                                                        break;
                                                    default:
                                                        ((Activity) kcz0Var2.a).getWindow().addFlags(128);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        if (i2 != 3) {
                                            w511.b();
                                            return;
                                        }
                                        activity2.runOnUiThread(new Runnable() { // from class: y701
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i5 = i3;
                                                kcz0 kcz0Var2 = kcz0Var;
                                                switch (i5) {
                                                    case 0:
                                                        ((Activity) kcz0Var2.a).getWindow().clearFlags(128);
                                                        break;
                                                    default:
                                                        ((Activity) kcz0Var2.a).getWindow().addFlags(128);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                                s33Var.z.invoke(Boolean.valueOf(s33.b(session)));
                                trackingState2 = camera2.getTrackingState();
                                trackingState3 = TrackingState.PAUSED;
                                if (trackingState2 != trackingState3 && camera2.getTrackingFailureReason() == TrackingFailureReason.NONE) {
                                    i = azh0.smartcamera_ar_hint_searching_for_planes;
                                } else if (camera2.getTrackingState() == trackingState3) {
                                    switch (z701.a[camera2.getTrackingFailureReason().ordinal()]) {
                                        case 1:
                                            i = -1;
                                            break;
                                        case 2:
                                            i = azh0.smartcamera_ar_tracking_failure_bad_state;
                                            break;
                                        case 3:
                                            if (Build.VERSION.SDK_INT < 31) {
                                                i = azh0.smartcamera_ar_tracking_failure_insufficient_light;
                                                break;
                                            } else {
                                                i = azh0.smartcamera_ar_tracking_failure_insufficient_light_android_s;
                                                break;
                                            }
                                        case 4:
                                            i = azh0.smartcamera_ar_tracking_failure_excessive_motion;
                                            break;
                                        case 5:
                                            i = azh0.smartcamera_ar_tracking_failure_insufficient_features;
                                            break;
                                        case 6:
                                            i = azh0.smartcamera_ar_tracking_failure_camera_unavailable;
                                            break;
                                        default:
                                            w511.b();
                                            return;
                                    }
                                } else {
                                    i = s33.b(session) ? azh0.smartcamera_ar_hint_tap_to_add_model : azh0.smartcamera_ar_hint_searching_for_planes;
                                }
                                tlsVar.invoke(activity.getString(i));
                                if (update.getTimestamp() != 0 && (yh4Var2 = s33Var.E) != null && (yfr0Var = yh4Var2.d) != null) {
                                    wyl0Var.b(yh4Var2.b, yfr0Var, null);
                                }
                                if (camera2.getTrackingState() == trackingState3) {
                                    return;
                                }
                                camera2.getProjectionMatrix(fArr15, 0, 0.1f, 100.0f);
                                camera2.getViewMatrix(fArr14, 0);
                                PointCloud acquirePointCloud = update.acquirePointCloud();
                                try {
                                    if (acquirePointCloud.getTimestamp() > s33Var.K) {
                                        r2x0 r2x0Var = s33Var.H;
                                        if (r2x0Var != null) {
                                            r2x0Var.a(acquirePointCloud.getPoints());
                                        }
                                        s33Var.K = acquirePointCloud.getTimestamp();
                                    }
                                    float[] fArr17 = fArr14;
                                    float[] fArr18 = fArr;
                                    Matrix.multiplyMM(fArr18, 0, fArr15, 0, fArr17, 0);
                                    yfr0 yfr0Var3 = s33Var.J;
                                    if (yfr0Var3 != null) {
                                        yfr0Var3.e("u_ModelViewProjection", fArr11);
                                    }
                                    char c = 3;
                                    wyl0Var.b(s33Var.I, s33Var.J, null);
                                    acquirePointCloud.close();
                                    if ((!s33.b(session) || s33Var.Q == null) && (nhc0Var = s33Var.D) != null) {
                                        f2 = 0.1f;
                                        yfr0 yfr0Var4 = nhc0Var.d;
                                        Collection<Plane> allTrackables2 = session.getAllTrackables(Plane.class);
                                        int i5 = 2;
                                        Pose displayOrientedPose = camera2.getDisplayOrientedPose();
                                        float[] fArr19 = nhc0Var.h;
                                        float[] fArr20 = nhc0Var.l;
                                        HashMap hashMap2 = nhc0Var.m;
                                        float[] fArr21 = nhc0Var.k;
                                        camera = camera2;
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Plane plane3 : allTrackables2) {
                                            float[] fArr22 = fArr18;
                                            float[] fArr23 = fArr15;
                                            float[] fArr24 = fArr17;
                                            if (plane3.getTrackingState() == TrackingState.TRACKING && plane3.getSubsumedBy() == null) {
                                                float f6 = nhc0.n;
                                                float d = cn91.d(plane3.getCenterPose(), displayOrientedPose);
                                                if (d >= f) {
                                                    arrayList2.add(new mhc0(d, plane3));
                                                }
                                            }
                                            fArr15 = fArr23;
                                            fArr18 = fArr22;
                                            fArr17 = fArr24;
                                        }
                                        fArr4 = fArr18;
                                        fArr5 = fArr15;
                                        fArr6 = fArr17;
                                        Collections.sort(arrayList2, new rvr(12));
                                        int i6 = 0;
                                        displayOrientedPose.inverse().toMatrix(nhc0Var.g, 0);
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            Plane plane4 = ((mhc0) it3.next()).b;
                                            float[] fArr25 = new float[16];
                                            plane4.getCenterPose().toMatrix(fArr25, i6);
                                            Iterator it4 = it3;
                                            l1 l1Var3 = l1Var2;
                                            plane4.getCenterPose().getTransformedAxis(1, 1.0f, fArr20, i6);
                                            float extentX = plane4.getExtentX();
                                            float extentZ = plane4.getExtentZ();
                                            FloatBuffer polygon = plane4.getPolygon();
                                            System.arraycopy(fArr25, i6, fArr19, i6, 16);
                                            if (polygon == null) {
                                                nhc0Var.e.limit(i6);
                                                nhc0Var.f.limit(i6);
                                                fArr10 = fArr11;
                                                hashMap = hashMap2;
                                                fArr9 = fArr19;
                                            } else {
                                                polygon.rewind();
                                                int limit = polygon.limit() / 2;
                                                int i7 = limit * 3;
                                                int i8 = limit * 6;
                                                if (nhc0Var.e.capacity() < i8) {
                                                    int capacity = nhc0Var.e.capacity();
                                                    while (capacity < i8) {
                                                        capacity *= 2;
                                                    }
                                                    fArr9 = fArr19;
                                                    nhc0Var.e = ByteBuffer.allocateDirect(capacity * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                                                } else {
                                                    fArr9 = fArr19;
                                                }
                                                nhc0Var.e.rewind();
                                                nhc0Var.e.limit(i8);
                                                if (nhc0Var.f.capacity() < i7) {
                                                    int capacity2 = nhc0Var.f.capacity();
                                                    while (capacity2 < i7) {
                                                        capacity2 *= 2;
                                                    }
                                                    nhc0Var.f = ByteBuffer.allocateDirect(capacity2 * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
                                                }
                                                nhc0Var.f.rewind();
                                                nhc0Var.f.limit(i7);
                                                fArr10 = fArr11;
                                                hashMap = hashMap2;
                                                float max = (float) Math.max((extentX - 0.5f) / extentX, 0.0d);
                                                float max2 = (float) Math.max((extentZ - 0.5f) / extentZ, 0.0d);
                                                while (polygon.hasRemaining()) {
                                                    float f7 = polygon.get();
                                                    float f8 = polygon.get();
                                                    nhc0Var.e.put(f7);
                                                    nhc0Var.e.put(f8);
                                                    float f9 = max2;
                                                    nhc0Var.e.put(f);
                                                    nhc0Var.e.put(f7 * max);
                                                    nhc0Var.e.put(f8 * f9);
                                                    nhc0Var.e.put(1.0f);
                                                    max2 = f9;
                                                }
                                                int i9 = limit - 1;
                                                nhc0Var.f.put((short) (i9 * 2));
                                                int i10 = 0;
                                                while (true) {
                                                    IntBuffer intBuffer = nhc0Var.f;
                                                    if (i10 < limit) {
                                                        int i11 = i10 * 2;
                                                        intBuffer.put((short) i11);
                                                        nhc0Var.f.put((short) (i11 + 1));
                                                        i10++;
                                                    } else {
                                                        int i12 = 1;
                                                        intBuffer.put(1);
                                                        int i13 = limit / 2;
                                                        int i14 = 1;
                                                        while (i14 < i13) {
                                                            nhc0Var.f.put((short) g8e.d(i9, i14, i5, i12));
                                                            nhc0Var.f.put((short) ((i14 * 2) + i12));
                                                            i14++;
                                                            i13 = i13;
                                                            i12 = 1;
                                                            i5 = 2;
                                                        }
                                                        int i15 = i13;
                                                        if (limit % 2 != 0) {
                                                            nhc0Var.f.put((short) ((i15 * 2) + 1));
                                                        }
                                                    }
                                                }
                                            }
                                            Integer num = (Integer) hashMap.get(plane4);
                                            if (num == null) {
                                                num = Integer.valueOf(hashMap.size());
                                                hashMap.put(plane4, num);
                                            }
                                            float f10 = nhc0.n * 10.0f;
                                            double intValue = num.intValue() * 0.144f;
                                            fArr21[0] = ((float) Math.cos(intValue)) * 10.0f;
                                            fArr21[1] = (-((float) Math.sin(intValue))) * f10;
                                            fArr21[2] = ((float) Math.sin(intValue)) * 10.0f;
                                            fArr21[c] = ((float) Math.cos(intValue)) * f10;
                                            Matrix.multiplyMM(nhc0Var.i, 0, nhc0Var.g, 0, nhc0Var.h, 0);
                                            float[] fArr26 = fArr20;
                                            float[] fArr27 = fArr3;
                                            HashMap hashMap3 = hashMap;
                                            float[] fArr28 = fArr9;
                                            Matrix.multiplyMM(nhc0Var.j, 0, fArr5, 0, nhc0Var.i, 0);
                                            yfr0Var4.e("u_Model", fArr28);
                                            yfr0Var4.e("u_ModelViewProjection", nhc0Var.j);
                                            yfr0Var4.d(fArr21);
                                            yfr0Var4.n("u_Normal", fArr26);
                                            nhc0Var.c.a(nhc0Var.e);
                                            ((zi6) nhc0Var.b.b).m(nhc0Var.f);
                                            wyl0Var.b(nhc0Var.a, yfr0Var4, null);
                                            f = 0.0f;
                                            l1Var2 = l1Var3;
                                            fArr19 = fArr28;
                                            fArr20 = fArr26;
                                            hashMap2 = hashMap3;
                                            it3 = it4;
                                            i6 = 0;
                                            c = 3;
                                            i5 = 2;
                                            fArr3 = fArr27;
                                            fArr11 = fArr10;
                                        }
                                        str = "HelloArRenderer";
                                        fArr7 = fArr11;
                                        l1Var = l1Var2;
                                        fArr8 = fArr3;
                                        f3 = f;
                                        obj2 = Plane.class;
                                    } else {
                                        f2 = 0.1f;
                                        camera = camera2;
                                        fArr7 = fArr11;
                                        fArr4 = fArr18;
                                        fArr5 = fArr15;
                                        fArr6 = fArr17;
                                        obj2 = Plane.class;
                                        l1Var = l1Var2;
                                        fArr8 = fArr3;
                                        f3 = f;
                                        str = "HelloArRenderer";
                                    }
                                    wyl0Var.a(s33Var.F, f3);
                                    Anchor anchor2 = s33Var.Q;
                                    if (anchor2 != null) {
                                        int i16 = r33.a[anchor2.getTrackingState().ordinal()];
                                        if (i16 == 1) {
                                            anchor2.getPose().toMatrix(fArr8, 0);
                                            boolean z = s33Var.C;
                                            float[] fArr29 = s33Var.A;
                                            if (z) {
                                                float f11 = f3;
                                                for (int i17 = 12; i17 < 15; i17++) {
                                                    f11 += Math.abs(fArr8[i17] - fArr29[i17]);
                                                }
                                                if (f11 > 0.05f) {
                                                    s33Var.C = false;
                                                    s33Var.B = 0;
                                                } else if (f11 > 0.02f) {
                                                    for (int i18 = 12; i18 < 15; i18++) {
                                                        fArr29[i18] = (fArr8[i18] * f2) + (0.9f * fArr29[i18]);
                                                    }
                                                    System.arraycopy(fArr29, 0, fArr8, 0, 16);
                                                }
                                            } else {
                                                float f12 = f3;
                                                for (int i19 = 12; i19 < 15; i19++) {
                                                    f12 += Math.abs(fArr8[i19] - fArr29[i19]);
                                                }
                                                if (f12 < 0.01f) {
                                                    int i20 = s33Var.B + 1;
                                                    s33Var.B = i20;
                                                    if (i20 >= 10) {
                                                        s33Var.C = true;
                                                        System.arraycopy(fArr8, 0, fArr29, 0, 16);
                                                    }
                                                } else {
                                                    s33Var.B = 0;
                                                    System.arraycopy(fArr8, 0, fArr29, 0, 16);
                                                }
                                            }
                                            Matrix.multiplyMM(fArr8, 0, fArr8, 0, s33Var.c0.d, 0);
                                            f4 = 100.0f;
                                            Matrix.multiplyMM(fArr2, 0, fArr6, 0, fArr8, 0);
                                            float[] fArr30 = fArr2;
                                            Matrix.multiplyMM(fArr4, 0, fArr5, 0, fArr30, 0);
                                            yfr0 yfr0Var5 = s33Var.O;
                                            if (yfr0Var5 != null) {
                                                yfr0Var5.e("u_ModelView", fArr30);
                                            }
                                            yfr0 yfr0Var6 = s33Var.O;
                                            if (yfr0Var6 != null) {
                                                yfr0Var6.e("u_ModelViewProjection", fArr7);
                                            }
                                            wyl0Var.b(s33Var.N, s33Var.O, s33Var.F);
                                            hsu0Var = s33Var.F;
                                            if (hsu0Var != null || (yh4Var = s33Var.E) == null) {
                                                return;
                                            }
                                            yh4Var.e.k("u_VirtualSceneColorTexture", (uxj) hsu0Var.c);
                                            if (yh4Var.h) {
                                                yfr0 yfr0Var7 = yh4Var.e;
                                                yfr0Var7.k("u_VirtualSceneDepthTexture", (uxj) hsu0Var.w);
                                                yfr0Var7.c(f2, "u_ZNear");
                                                yfr0Var7.c(f4, "u_ZFar");
                                            }
                                            wyl0Var.b(yh4Var.b, yh4Var.e, null);
                                            return;
                                        }
                                        if (i16 != 2) {
                                            if (i16 != 3) {
                                                w511.b();
                                                return;
                                            }
                                            if (camera.getTrackingState() == TrackingState.TRACKING) {
                                                Session session2 = l1Var.w;
                                                if (session2 == null || (allTrackables = session2.getAllTrackables(obj2)) == null) {
                                                    arrayList = null;
                                                } else {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    for (Object obj3 : allTrackables) {
                                                        Plane plane5 = (Plane) obj3;
                                                        if (plane5.getTrackingState() == TrackingState.TRACKING && plane5.getType() == Plane.Type.HORIZONTAL_UPWARD_FACING) {
                                                            arrayList3.add(obj3);
                                                        }
                                                    }
                                                    arrayList = arrayList3;
                                                }
                                                if (arrayList != null) {
                                                    Iterator it5 = arrayList.iterator();
                                                    if (it5.hasNext()) {
                                                        ?? next = it5.next();
                                                        if (it5.hasNext()) {
                                                            float a = s33Var.a(((Plane) next).getCenterPose());
                                                            do {
                                                                Object next2 = it5.next();
                                                                float a2 = s33Var.a(((Plane) next2).getCenterPose());
                                                                next = next;
                                                                if (Float.compare(a, a2) > 0) {
                                                                    next = next2;
                                                                    a = a2;
                                                                }
                                                            } while (it5.hasNext());
                                                        }
                                                        plane2 = next;
                                                    } else {
                                                        plane2 = null;
                                                    }
                                                    plane = plane2;
                                                } else {
                                                    plane = null;
                                                }
                                                if (plane != null) {
                                                    Pose centerPose = plane.getCenterPose();
                                                    if (plane.isPoseInPolygon(centerPose)) {
                                                        Anchor anchor3 = s33Var.Q;
                                                        if (anchor3 != null) {
                                                            anchor3.detach();
                                                        }
                                                        Session session3 = l1Var.w;
                                                        s33Var.Q = session3 != null ? session3.createAnchor(centerPose) : null;
                                                        Log.i(str, "Anchor recreated on new stable plane");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    f4 = 100.0f;
                                    hsu0Var = s33Var.F;
                                    if (hsu0Var != null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        ooc.g(acquirePointCloud, th);
                                        throw th2;
                                    }
                                }
                            }
                        }
                        fArr3 = fArr16;
                        if (camera2.getTrackingState() == TrackingState.TRACKING) {
                        }
                        TapHelper tapHelper2 = s33Var.c;
                        if (camera2.getTrackingState() == TrackingState.TRACKING) {
                            it = update.hitTest(poll).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                                it = it2;
                            }
                            hitResult = (HitResult) obj;
                            if (hitResult != null) {
                            }
                            kcz0Var = s33Var.b0;
                            trackingState = camera2.getTrackingState();
                            Activity activity22 = (Activity) kcz0Var.a;
                            if (trackingState != ((TrackingState) kcz0Var.b)) {
                            }
                            s33Var.z.invoke(Boolean.valueOf(s33.b(session)));
                            trackingState2 = camera2.getTrackingState();
                            trackingState3 = TrackingState.PAUSED;
                            if (trackingState2 != trackingState3) {
                            }
                            if (camera2.getTrackingState() == trackingState3) {
                            }
                            tlsVar.invoke(activity.getString(i));
                            if (update.getTimestamp() != 0) {
                                wyl0Var.b(yh4Var2.b, yfr0Var, null);
                            }
                            if (camera2.getTrackingState() == trackingState3) {
                            }
                        }
                        f = 0.0f;
                        kcz0Var = s33Var.b0;
                        trackingState = camera2.getTrackingState();
                        Activity activity222 = (Activity) kcz0Var.a;
                        if (trackingState != ((TrackingState) kcz0Var.b)) {
                        }
                        s33Var.z.invoke(Boolean.valueOf(s33.b(session)));
                        trackingState2 = camera2.getTrackingState();
                        trackingState3 = TrackingState.PAUSED;
                        if (trackingState2 != trackingState3) {
                        }
                        if (camera2.getTrackingState() == trackingState3) {
                        }
                        tlsVar.invoke(activity.getString(i));
                        if (update.getTimestamp() != 0) {
                        }
                        if (camera2.getTrackingState() == trackingState3) {
                        }
                    } catch (IOException e) {
                        Log.e("HelloArRenderer", "Failed to read a required asset file", e);
                    }
                } catch (CameraNotAvailableException e2) {
                    Log.e("HelloArRenderer", "Camera not available during onDrawFrame", e2);
                    tlsVar.invoke(activity.getString(azh0.smartcamera_ar_hint_camera_not_available));
                }
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceChanged(GL10 gl, int w, int h) {
                wyl0 wyl0Var = this;
                wyl0Var.b = w;
                wyl0Var.c = h;
                s33 s33Var = (s33) vyl0.this;
                s33Var.a0.onSurfaceChanged(w, h);
                hsu0 hsu0Var = s33Var.F;
                if (hsu0Var != null) {
                    hsu0Var.d(w, h);
                }
            }

            @Override // android.opengl.GLSurfaceView.Renderer
            public void onSurfaceCreated(GL10 gl, EGLConfig config) {
                yfr0 yfr0Var;
                uxj uxjVar;
                yfr0 yfr0Var2;
                GLES20.glEnable(3042);
                pva1.i("Failed to enable blending", "glEnable");
                vyl0 vyl0Var2 = vyl0.this;
                wyl0 wyl0Var = this;
                s33 s33Var = (s33) vyl0Var2;
                s33Var.getClass();
                try {
                    s33Var.D = new nhc0(wyl0Var);
                    s33Var.E = new yh4();
                    s33Var.F = new hsu0();
                    s33Var.S = new gpt0(wyl0Var);
                    Texture$Target texture$Target = Texture$Target.TEXTURE_2D;
                    Texture$WrapMode texture$WrapMode = Texture$WrapMode.CLAMP_TO_EDGE;
                    s33Var.R = new uxj(texture$Target, texture$WrapMode, false);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16384);
                    InputStream open = s33Var.a.getAssets().open("models/dfg.raw");
                    try {
                        open.read(allocateDirect.array());
                        open.close();
                        uxj uxjVar2 = s33Var.R;
                        if (uxjVar2 != null) {
                            GLES20.glBindTexture(3553, ((int[]) uxjVar2.c)[0]);
                        }
                        pva1.i("Failed to bind DFG texture", "glBindTexture");
                        GLES20.glTexImage2D(3553, 0, 33327, 64, 64, 0, 33319, 5131, allocateDirect);
                        pva1.i("Failed to populate DFG texture", "glTexImage2D");
                        yfr0 D = r100.D(wyl0Var, "shaders/point_cloud.vert", "shaders/point_cloud.frag", null);
                        D.o("u_Color", new float[]{0.12156863f, 0.7372549f, 0.8235294f, 1.0f});
                        D.c(5.0f, "u_PointSize");
                        s33Var.J = D;
                        r2x0 r2x0Var = new r2x0(4, null);
                        s33Var.H = r2x0Var;
                        s33Var.I = new zr10(Mesh$PrimitiveMode.POINTS, null, new r2x0[]{r2x0Var});
                        s33Var.N = tkb1.b(s33Var.w);
                        s33Var.P = cob1.c(wyl0Var, "models/cube_texture.png", texture$WrapMode, Texture$ColorFormat.SRGB);
                        gpt0 gpt0Var = s33Var.S;
                        yfr0 D2 = r100.D(wyl0Var, "shaders/environmental_hdr.vert", "shaders/environmental_hdr.frag", gw00.e(new Pair("NUMBER_OF_MIPMAP_LEVELS", String.valueOf(gpt0Var != null ? Integer.valueOf(gpt0Var.a) : null))));
                        s33Var.O = D2;
                        uxj uxjVar3 = s33Var.P;
                        if (uxjVar3 != null) {
                            D2.k("u_AlbedoTexture", uxjVar3);
                        }
                        gpt0 gpt0Var2 = s33Var.S;
                        if (gpt0Var2 != null && (uxjVar = gpt0Var2.c) != null && (yfr0Var2 = s33Var.O) != null) {
                            yfr0Var2.k("u_Cubemap", uxjVar);
                        }
                        uxj uxjVar4 = s33Var.R;
                        if (uxjVar4 == null || (yfr0Var = s33Var.O) == null) {
                            return;
                        }
                        yfr0Var.k("u_DfgTexture", uxjVar4);
                    } finally {
                    }
                } catch (IOException e) {
                    Log.e("HelloArRenderer", "Failed to read a required asset file", e);
                }
            }
        });
        gLSurfaceView.setRenderMode(1);
        gLSurfaceView.setWillNotDraw(false);
    }

    public final void a(hsu0 hsu0Var, float f) {
        c(hsu0Var);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, f);
        pva1.i("Failed to set clear color", "glClearColor");
        GLES20.glDepthMask(true);
        pva1.i("Failed to set depth write mask", "glDepthMask");
        GLES20.glClear(16640);
        pva1.i("Failed to clear framebuffer", "glClear");
    }

    public final void b(zr10 zr10Var, yfr0 yfr0Var, hsu0 hsu0Var) {
        ArrayList arrayList;
        Integer num;
        c(hsu0Var);
        if (yfr0Var != null) {
            HashMap hashMap = yfr0Var.b;
            int i = yfr0Var.a;
            if (i == 0) {
                ny61.r("Attempted to use freed shader");
                return;
            }
            GLES20.glUseProgram(i);
            pva1.i("Failed to use shader program", "glUseProgram");
            GLES20.glBlendFuncSeparate(yfr0Var.B.getGlesEnum(), yfr0Var.C.getGlesEnum(), yfr0Var.D.getGlesEnum(), yfr0Var.E.getGlesEnum());
            pva1.i("Failed to set blend mode", "glBlendFuncSeparate");
            GLES20.glDepthMask(yfr0Var.z);
            pva1.i("Failed to set depth write mask", "glDepthMask");
            if (yfr0Var.y) {
                GLES20.glEnable(2929);
                pva1.i("Failed to enable depth test", "glEnable");
            } else {
                GLES20.glDisable(2929);
                pva1.i("Failed to disable depth test", "glDisable");
            }
            if (yfr0Var.A) {
                GLES20.glEnable(2884);
                pva1.i("Failed to enable backface culling", "glEnable");
            } else {
                GLES20.glDisable(2884);
                pva1.i("Failed to disable backface culling", "glDisable");
            }
            try {
                ArrayList arrayList2 = new ArrayList(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    try {
                        Integer num2 = (Integer) entry.getKey();
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            wfr0 wfr0Var = (wfr0) entry.getValue();
                            if (wfr0Var != null) {
                                wfr0Var.a(intValue);
                            }
                        }
                        if (!(entry.getValue() instanceof xfr0)) {
                            arrayList2.add(entry.getKey());
                        }
                    } catch (GLException e) {
                        throw new IllegalArgumentException("Error setting uniform `" + ((String) yfr0Var.x.get(entry.getKey())) + "'", e);
                    }
                }
                hashMap.keySet().removeAll(arrayList2);
                GLES20.glActiveTexture(33984);
                pva1.h("yfr0", "Failed to set active texture", "glActiveTexture");
            } catch (Throwable th) {
                GLES20.glActiveTexture(33984);
                pva1.h("yfr0", "Failed to set active texture", "glActiveTexture");
                throw th;
            }
        }
        if (zr10Var != null) {
            Mesh$PrimitiveMode mesh$PrimitiveMode = (Mesh$PrimitiveMode) zr10Var.c;
            ern ernVar = (ern) zr10Var.w;
            r2x0[] r2x0VarArr = (r2x0[]) zr10Var.x;
            int i2 = ((int[]) zr10Var.b)[0];
            if (i2 == 0) {
                ny61.r("Tried to draw a freed Mesh");
                return;
            }
            GLES30.glBindVertexArray(i2);
            pva1.i("Failed to bind vertex array object", "glBindVertexArray");
            if (ernVar != null) {
                GLES20.glDrawElements(mesh$PrimitiveMode.getGlesEnum(), ((zi6) ernVar.b).w, 5125, 0);
                pva1.i("Failed to draw vertex array object with indices", "glDrawElements");
                return;
            }
            r2x0 r2x0Var = r2x0VarArr[0];
            int i3 = ((zi6) r2x0Var.c).w / r2x0Var.b;
            int length = r2x0VarArr.length;
            for (int i4 = 1; i4 < length; i4++) {
                r2x0 r2x0Var2 = r2x0VarArr[i4];
                int i5 = ((zi6) r2x0Var2.c).w / r2x0Var2.b;
                if (i5 != i3) {
                    throw new IllegalStateException(String.format("Vertex buffers have mismatching numbers of vertices ([0] has %d but [%d] has %d)", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, 3)).toString());
                }
            }
            GLES20.glDrawArrays(mesh$PrimitiveMode.getGlesEnum(), 0, i3);
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(Integer.valueOf(glGetError));
                while (true) {
                    int glGetError2 = GLES20.glGetError();
                    if (glGetError2 == 0) {
                        break;
                    } else {
                        arrayList3.add(Integer.valueOf(glGetError2));
                    }
                }
                arrayList = arrayList3;
            }
            if (arrayList != null && (num = (Integer) arrayList.get(0)) != null) {
                throw new GLException(num.intValue(), pva1.f("Failed to draw vertex array object", "glDrawArrays", arrayList));
            }
        }
    }

    public final void c(hsu0 hsu0Var) {
        int i;
        int i2;
        int i3;
        if (hsu0Var == null) {
            i2 = this.b;
            i3 = this.c;
            i = 0;
        } else {
            i = ((int[]) hsu0Var.b)[0];
            i2 = hsu0Var.x;
            i3 = hsu0Var.y;
        }
        GLES20.glBindFramebuffer(36160, i);
        pva1.i("Failed to bind framebuffer", "glBindFramebuffer");
        GLES20.glViewport(0, 0, i2, i3);
        pva1.i("Failed to set viewport dimensions", "glViewport");
    }
}
