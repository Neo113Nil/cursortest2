package defpackage;

import android.media.Image;
import android.opengl.GLES20;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Mesh$PrimitiveMode;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Shader$BlendFactor;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$Target;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$WrapMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes2.dex */
public final class yh4 {
    public static final FloatBuffer j;
    public static final FloatBuffer k;
    public final FloatBuffer a = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
    public final zr10 b;
    public final r2x0 c;
    public yfr0 d;
    public yfr0 e;
    public final uxj f;
    public final uxj g;
    public boolean h;
    public float i;

    static {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        j = asFloatBuffer;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        k = asFloatBuffer2;
        asFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        asFloatBuffer2.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }

    public yh4() {
        Texture$Target texture$Target = Texture$Target.TEXTURE_2D;
        Texture$WrapMode texture$WrapMode = Texture$WrapMode.CLAMP_TO_EDGE;
        this.f = new uxj(texture$Target, texture$WrapMode, false);
        this.g = new uxj(Texture$Target.TEXTURE_EXTERNAL_OES, texture$WrapMode, false);
        r2x0 r2x0Var = new r2x0(2, j);
        r2x0 r2x0Var2 = new r2x0(2, null);
        this.c = r2x0Var2;
        this.b = new zr10(Mesh$PrimitiveMode.TRIANGLE_STRIP, null, new r2x0[]{r2x0Var, r2x0Var2, new r2x0(2, k)});
    }

    public final void a(wyl0 wyl0Var) {
        yfr0 yfr0Var = this.e;
        if (yfr0Var != null) {
            if (this.h) {
                return;
            }
            yfr0Var.close();
            this.e = null;
            this.h = true;
        }
        yfr0 D = r100.D(wyl0Var, "shaders/occlusion.vert", "shaders/occlusion.frag", b.h(new Pair("USE_OCCLUSION", "1")));
        D.y = false;
        D.z = false;
        Shader$BlendFactor shader$BlendFactor = Shader$BlendFactor.SRC_ALPHA;
        Shader$BlendFactor shader$BlendFactor2 = Shader$BlendFactor.ONE_MINUS_SRC_ALPHA;
        D.B = shader$BlendFactor;
        D.C = shader$BlendFactor2;
        D.D = shader$BlendFactor;
        D.E = shader$BlendFactor2;
        this.e = D;
        D.k("u_CameraDepthTexture", this.f);
        D.c(this.i, "u_DepthAspectRatio");
    }

    public final void b(Image image) {
        GLES20.glBindTexture(3553, ((int[]) this.f.c)[0]);
        GLES20.glTexImage2D(3553, 0, 33323, image.getWidth(), image.getHeight(), 0, 33319, 5121, image.getPlanes()[0].getBuffer());
        if (this.h) {
            float width = image.getWidth() / image.getHeight();
            this.i = width;
            this.e.c(width, "u_DepthAspectRatio");
        }
    }
}
