package defpackage;

import android.opengl.GLES20;

/* loaded from: classes4.dex */
public final /* synthetic */ class l4r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4r b;
    public final /* synthetic */ osu c;

    public /* synthetic */ l4r(p4r p4rVar, osu osuVar, int i) {
        this.a = i;
        this.b = p4rVar;
        this.c = osuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p4r p4rVar = this.b;
                int i = p4rVar.M;
                float[] fArr = p4rVar.e;
                GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
                p4rVar.i(this.c);
                break;
            default:
                this.b.i(this.c);
                break;
        }
    }
}
