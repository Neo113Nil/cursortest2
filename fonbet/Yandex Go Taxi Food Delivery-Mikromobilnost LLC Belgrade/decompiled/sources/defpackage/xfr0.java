package defpackage;

import android.opengl.GLES20;
import com.yandex.smartcamera.arscene.ar_core.samplerender.Texture$Target;

/* loaded from: classes2.dex */
public final class xfr0 implements wfr0 {
    public final int a;
    public final uxj b;

    public xfr0(int i, uxj uxjVar) {
        this.a = i;
        this.b = uxjVar;
    }

    @Override // defpackage.wfr0
    public final void a(int i) {
        uxj uxjVar = this.b;
        if (((int[]) uxjVar.c)[0] == 0) {
            ny61.r("Tried to draw with freed texture");
            return;
        }
        int i2 = this.a;
        GLES20.glActiveTexture(33984 + i2);
        pva1.i("Failed to set active texture", "glActiveTexture");
        GLES20.glBindTexture(((Texture$Target) uxjVar.b).getGlesEnum(), ((int[]) uxjVar.c)[0]);
        pva1.i("Failed to bind texture", "glBindTexture");
        GLES20.glUniform1i(i, i2);
        pva1.i("Failed to set shader texture uniform", "glUniform1i");
    }
}
