package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class g2x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2x b;

    public /* synthetic */ g2x(s2x s2xVar, int i) {
        this.a = i;
        this.b = s2xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s2x s2xVar = this.b;
                nur nurVar = s2xVar.f;
                if (((krh) nurVar.c) == null) {
                    nurVar.c = krh.d((Context) nurVar.b);
                }
                krh krhVar = (krh) nurVar.c;
                if (krhVar != null) {
                    krhVar.i(s2xVar);
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
