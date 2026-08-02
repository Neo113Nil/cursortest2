package defpackage;

import android.opengl.GLES20;

/* loaded from: classes4.dex */
public final /* synthetic */ class n4r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4r b;

    public /* synthetic */ n4r(p4r p4rVar, int i) {
        this.a = i;
        this.b = p4rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                GLES20.glUniform1i(this.b.T, 2);
                break;
            default:
                p4r p4rVar = this.b;
                p4rVar.m = 100L;
                p4rVar.n = true;
                break;
        }
    }
}
