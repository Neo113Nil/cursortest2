package defpackage;

import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class dmh implements fmh, kth {
    public final /* synthetic */ blp a;
    public final /* synthetic */ d8l b;

    public /* synthetic */ dmh(blp blpVar, d8l d8lVar) {
        this.a = blpVar;
        this.b = d8lVar;
    }

    @Override // defpackage.kth
    public void a(vrh vrhVar, int i) {
        vrhVar.n(i, this.a, this.b);
    }

    @Override // defpackage.fmh
    public void f(ulh ulhVar) {
        boolean z;
        boolean z2;
        boolean z3;
        kkh kkhVar = ulhVar.a;
        if (ulhVar.isConnected()) {
            d8l d8lVar = ulhVar.v;
            d8l d8lVar2 = this.b;
            boolean equals = Objects.equals(d8lVar, d8lVar2);
            blp blpVar = ulhVar.u;
            blp blpVar2 = this.a;
            boolean equals2 = Objects.equals(blpVar, blpVar2);
            if (equals && equals2) {
                return;
            }
            ulhVar.u = blpVar2;
            if (equals) {
                z = false;
            } else {
                ulhVar.v = d8lVar2;
                d8l d8lVar3 = ulhVar.x;
                d8l R0 = ulh.R0(d8lVar2, ulhVar.w);
                ulhVar.x = R0;
                z = !R0.equals(d8lVar3);
            }
            if (!equals2 || z) {
                qsn qsnVar = ulhVar.s;
                qsn qsnVar2 = ulhVar.t;
                qsn m1 = ulh.m1(ulhVar.r, ulhVar.q, blpVar2, ulhVar.x, ulhVar.I);
                ulhVar.s = m1;
                ulhVar.t = ulh.l1(m1, ulhVar.q, ulhVar.I, blpVar2, ulhVar.x);
                z2 = !ulhVar.s.equals(qsnVar);
                z3 = !ulhVar.t.equals(qsnVar2);
            } else {
                z2 = false;
                z3 = false;
            }
            if (z) {
                ulhVar.i.f(13, new clh(ulhVar, 11));
            }
            if (!equals2) {
                kkhVar.getClass();
                vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                kkhVar.d.f();
            }
            if (z3) {
                kkhVar.getClass();
                vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                kkhVar.d.getClass();
            }
            if (z2) {
                kkhVar.getClass();
                vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                kkhVar.d.d();
            }
        }
    }
}
