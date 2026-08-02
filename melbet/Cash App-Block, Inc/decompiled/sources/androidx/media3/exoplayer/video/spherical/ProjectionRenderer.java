package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.spherical.Projection;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.TraceParser;

/* loaded from: classes3.dex */
public final class ProjectionRenderer {
    public TimedValueQueue leftMeshData;
    public int mvpMatrixHandle;
    public int positionHandle;
    public TraceParser program;
    public int stereoMode;
    public int texCoordsHandle;
    public int textureHandle;
    public int uTexMatrixHandle;
    public static final float[] TEX_MATRIX_WHOLE = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f};
    public static final float[] TEX_MATRIX_TOP = {1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -0.5f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.5f, 1.0f};
    public static final float[] TEX_MATRIX_LEFT = {0.5f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, -1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f, 1.0f};

    public static boolean isSupported(Projection projection) {
        Projection.Mesh mesh = projection.leftMesh;
        Projection.Mesh mesh2 = projection.rightMesh;
        TimedValueQueue[] timedValueQueueArr = mesh.subMeshes;
        if (timedValueQueueArr.length == 1 && timedValueQueueArr[0].first == 0) {
            TimedValueQueue[] timedValueQueueArr2 = mesh2.subMeshes;
            if (timedValueQueueArr2.length == 1 && timedValueQueueArr2[0].first == 0) {
                return true;
            }
        }
        return false;
    }

    public final void init() {
        try {
            TraceParser traceParser = new TraceParser("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.program = traceParser;
            this.mvpMatrixHandle = GLES20.glGetUniformLocation(traceParser.state, "uMvpMatrix");
            this.uTexMatrixHandle = GLES20.glGetUniformLocation(this.program.state, "uTexMatrix");
            this.positionHandle = this.program.getAttributeArrayLocationAndEnable("aPosition");
            this.texCoordsHandle = this.program.getAttributeArrayLocationAndEnable("aTexCoords");
            this.textureHandle = GLES20.glGetUniformLocation(this.program.state, "uTexture");
        } catch (GlUtil$GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
