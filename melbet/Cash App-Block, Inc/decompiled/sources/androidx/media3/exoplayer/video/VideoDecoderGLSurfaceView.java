package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.Log;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Renderer renderer;

    public final class Renderer implements GLSurfaceView.Renderer {
        public static final String[] TEXTURE_UNIFORMS = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer TEXTURE_VERTICES = Log.createBuffer(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public TraceParser program;
        public final VideoDecoderGLSurfaceView surfaceView;
        public final int[] yuvTextures = new int[3];
        public final int[] texLocations = new int[3];
        public final int[] previousWidths = new int[3];
        public final int[] previousStrides = new int[3];
        public final AtomicReference pendingOutputBufferReference = new AtomicReference();

        public Renderer(VideoDecoderGLSurfaceView videoDecoderGLSurfaceView) {
            this.surfaceView = videoDecoderGLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.previousWidths;
                this.previousStrides[i] = -1;
                iArr[i] = -1;
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            if (this.pendingOutputBufferReference.getAndSet(null) == null) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$1();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.texLocations;
            try {
                TraceParser traceParser = new TraceParser("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.program = traceParser;
                GLES20.glVertexAttribPointer(traceParser.getAttributeArrayLocationAndEnable("in_pos"), 2, 5126, false, 0, (Buffer) TEXTURE_VERTICES);
                iArr[0] = this.program.getAttributeArrayLocationAndEnable("in_tc_y");
                iArr[1] = this.program.getAttributeArrayLocationAndEnable("in_tc_u");
                iArr[2] = this.program.getAttributeArrayLocationAndEnable("in_tc_v");
                GLES20.glGetUniformLocation(this.program.state, "mColorConversion");
                Log.checkGlError();
                setupTextures();
                Log.checkGlError();
            } catch (GlUtil$GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }

        public final void setupTextures() {
            int[] iArr = this.yuvTextures;
            try {
                GLES20.glGenTextures(3, iArr, 0);
                for (int i = 0; i < 3; i++) {
                    TraceParser traceParser = this.program;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(traceParser.state, TEXTURE_UNIFORMS[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    Log.bindTexture(3553, iArr[i]);
                }
                Log.checkGlError();
            } catch (GlUtil$GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Renderer renderer = new Renderer(this);
        this.renderer = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }

    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        Renderer renderer = this.renderer;
        if (renderer.pendingOutputBufferReference.getAndSet(videoDecoderOutputBuffer) == null) {
            renderer.surfaceView.requestRender();
        } else {
            a$$ExternalSyntheticBUOutline0.m$1();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }
}
