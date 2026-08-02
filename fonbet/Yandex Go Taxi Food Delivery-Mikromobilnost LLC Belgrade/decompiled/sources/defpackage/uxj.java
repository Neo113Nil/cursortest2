package defpackage;

import android.opengl.GLES20;
import com.google.android.gms.gcm.Task;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$Target;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$WrapMode;
import java.io.Closeable;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class uxj implements Closeable {
    public static final /* synthetic */ int w = 0;
    public final /* synthetic */ int a = 1;
    public final Serializable b;
    public final Object c;

    public uxj(Texture$Target texture$Target, Texture$WrapMode texture$WrapMode, boolean z) {
        this.b = texture$Target;
        int[] iArr = {0};
        this.c = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        pva1.i("Texture creation failed", "glGenTextures");
        int i = z ? 9987 : 9729;
        try {
            GLES20.glBindTexture(texture$Target.getGlesEnum(), iArr[0]);
            pva1.i("Failed to bind texture", "glBindTexture");
            GLES20.glTexParameteri(texture$Target.getGlesEnum(), 10241, i);
            pva1.i("Failed to set texture parameter", "glTexParameteri");
            GLES20.glTexParameteri(texture$Target.getGlesEnum(), Task.EXTRAS_LIMIT_BYTES, 9729);
            pva1.i("Failed to set texture parameter", "glTexParameteri");
            GLES20.glTexParameteri(texture$Target.getGlesEnum(), 10242, texture$WrapMode.getGlesEnum());
            pva1.i("Failed to set texture parameter", "glTexParameteri");
            GLES20.glTexParameteri(texture$Target.getGlesEnum(), 10243, texture$WrapMode.getGlesEnum());
            pva1.i("Failed to set texture parameter", "glTexParameteri");
        } catch (Throwable th) {
            close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                for (InputStream inputStream : (InputStream[]) this.b) {
                    Charset charset = sw21.a;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                        }
                    }
                }
                return;
            default:
                int[] iArr = (int[]) this.c;
                if (iArr[0] != 0) {
                    GLES20.glDeleteTextures(1, iArr, 0);
                    pva1.h("uxj", "Failed to free texture", "glDeleteTextures");
                    iArr[0] = 0;
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uxj(InputStream[] inputStreamArr, long[] jArr) {
        this.b = inputStreamArr;
        this.c = jArr;
    }
}
