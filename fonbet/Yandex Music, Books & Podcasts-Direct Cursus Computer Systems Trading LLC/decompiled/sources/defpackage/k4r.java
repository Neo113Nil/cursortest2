package defpackage;

import android.opengl.GLES20;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final /* synthetic */ class k4r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4r b;
    public final /* synthetic */ float c;

    public /* synthetic */ k4r(p4r p4rVar, float f, int i) {
        this.a = i;
        this.b = p4rVar;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p4r p4rVar = this.b;
                GLES20.glUniform1f(p4rVar.S, this.c);
                break;
            case 1:
                p4r p4rVar2 = this.b;
                float f = this.c;
                p4rVar2.y = f;
                GLES20.glUniform1f(p4rVar2.H, f);
                break;
            case 2:
                p4r p4rVar3 = this.b;
                p4rVar3.q = this.c;
                GLES20.glUniform1f(p4rVar3.F, p4rVar3.q);
                break;
            case 3:
                p4r p4rVar4 = this.b;
                float f2 = this.c;
                p4rVar4.z = f2;
                GLES20.glUniform1f(p4rVar4.I, f2);
                break;
            default:
                p4r p4rVar5 = this.b;
                float f3 = this.c;
                ktp ktpVar = p4rVar5.k;
                ktpVar.a = ktpVar.c;
                p4rVar5.k.b = f3;
                p4rVar5.l = 0L;
                p4rVar5.m = p4rVar5.c;
                p4rVar5.n = false;
                rar rarVar = p4rVar5.e0;
                Continuation continuation = null;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                p4rVar5.e0 = x97.y(p4rVar5.d0, null, null, new glp(p4rVar5, continuation, 14), 3);
                break;
        }
    }
}
