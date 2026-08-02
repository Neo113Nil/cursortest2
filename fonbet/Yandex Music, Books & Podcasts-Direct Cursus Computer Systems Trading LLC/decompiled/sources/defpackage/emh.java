package defpackage;

import android.os.Bundle;
import android.os.Looper;

/* loaded from: classes.dex */
public final /* synthetic */ class emh implements fmh, kth {
    public final /* synthetic */ Bundle a;

    public /* synthetic */ emh(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.kth
    public void a(vrh vrhVar, int i) {
        vrhVar.g(i, this.a);
    }

    @Override // defpackage.fmh
    public void f(ulh ulhVar) {
        kkh kkhVar = ulhVar.a;
        if (ulhVar.isConnected()) {
            qsn qsnVar = ulhVar.s;
            qsn qsnVar2 = ulhVar.t;
            Bundle bundle = this.a;
            ulhVar.I = bundle;
            qsn m1 = ulh.m1(ulhVar.r, ulhVar.q, ulhVar.u, ulhVar.x, bundle);
            ulhVar.s = m1;
            ulhVar.t = ulh.l1(m1, ulhVar.q, ulhVar.I, ulhVar.u, ulhVar.x);
            boolean equals = ulhVar.s.equals(qsnVar);
            ulhVar.t.equals(qsnVar2);
            kkhVar.getClass();
            vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
            ikh ikhVar = kkhVar.d;
            ikhVar.getClass();
            if (equals) {
                return;
            }
            ikhVar.d();
        }
    }
}
