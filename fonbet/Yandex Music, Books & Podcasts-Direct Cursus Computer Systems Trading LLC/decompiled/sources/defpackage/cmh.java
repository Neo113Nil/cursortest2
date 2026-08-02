package defpackage;

import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class cmh implements fmh, kth {
    public final /* synthetic */ d8l a;

    public /* synthetic */ cmh(d8l d8lVar) {
        this.a = d8lVar;
    }

    @Override // defpackage.kth
    public void a(vrh vrhVar, int i) {
        vrhVar.j(i, this.a);
    }

    @Override // defpackage.fmh
    public void f(ulh ulhVar) {
        boolean z;
        boolean z2;
        kkh kkhVar = ulhVar.a;
        if (ulhVar.isConnected()) {
            d8l d8lVar = ulhVar.w;
            d8l d8lVar2 = this.a;
            if (Objects.equals(d8lVar, d8lVar2)) {
                return;
            }
            ulhVar.w = d8lVar2;
            d8l d8lVar3 = ulhVar.x;
            d8l R0 = ulh.R0(ulhVar.v, d8lVar2);
            ulhVar.x = R0;
            if (R0.equals(d8lVar3)) {
                z = false;
                z2 = false;
            } else {
                qsn qsnVar = ulhVar.s;
                qsn qsnVar2 = ulhVar.t;
                qsn m1 = ulh.m1(ulhVar.r, ulhVar.q, ulhVar.u, ulhVar.x, ulhVar.I);
                ulhVar.s = m1;
                ulhVar.t = ulh.l1(m1, ulhVar.q, ulhVar.I, ulhVar.u, ulhVar.x);
                z = !ulhVar.s.equals(qsnVar);
                z2 = !ulhVar.t.equals(qsnVar2);
                ulhVar.i.f(13, new clh(ulhVar, 12));
            }
            if (z2) {
                kkhVar.getClass();
                vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                kkhVar.d.getClass();
            }
            if (z) {
                kkhVar.getClass();
                vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                kkhVar.d.d();
            }
        }
    }
}
