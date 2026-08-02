package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes15.dex */
public final /* synthetic */ class zdb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ heb b;

    public /* synthetic */ zdb(heb hebVar, int i) {
        this.a = i;
        this.b = hebVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        heb hebVar = this.b;
        switch (i) {
            case 0:
                p370 p370Var = hebVar.r;
                p370Var.getClass();
                jl40.m();
                h790 h790Var = (h790) p370Var.w;
                if (h790Var != null) {
                    h790Var.f = Long.valueOf(SystemClock.elapsedRealtime());
                }
                hebVar.j(deb.a);
                return zy11.a;
            case 1:
                return hebVar.a.g;
            case 2:
                return new nax(hebVar.c.a, hebVar.h, new e48(24, hebVar));
            case 3:
                Looper looper = hebVar.f;
                hebVar.e();
                c9v c9vVar = hebVar.C;
                ew2 ew2Var = hebVar.g;
                new zdb(hebVar, 6);
                hjw0 hjw0Var = new hjw0();
                new Handler(looper);
                return hjw0Var;
            case 4:
                hebVar.i("reload", null);
                return zy11.a;
            case 5:
                if (hebVar.B) {
                    hebVar.j(deb.a);
                }
                return zy11.a;
            default:
                return hebVar.O;
        }
    }
}
