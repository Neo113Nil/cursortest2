package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2607Ij implements LD {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f25585n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f25586u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C2658Lj f25587v;

    public C2607Ij(C2658Lj c2658Lj, r rVar, int i) {
        this.f25585n = i;
        switch (i) {
            case 1:
                this.f25586u = rVar;
                Objects.requireNonNull(c2658Lj);
                this.f25587v = c2658Lj;
                break;
            default:
                this.f25586u = rVar;
                this.f25587v = c2658Lj;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    /* renamed from: l */
    public final void mo7l(Object obj) {
        switch (this.f25585n) {
            case 0:
                List list = ((C2590Hj) obj).f25413a;
                C2658Lj c2658Lj = this.f25587v;
                SD sd = c2658Lj.f26197a;
                r rVar = this.f25586u;
                if (list != null && !list.isEmpty()) {
                    J3.a aVar = OD.f26665u;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aVar = C3686oN.y(C3686oN.v(aVar, Throwable.class, new C3907sc(3, rVar), sd), new C2624Jj(c2658Lj, rVar, (J3.a) it.next(), 0), sd);
                    }
                    aVar.c(new MD(0, aVar, new C2607Ij(c2658Lj, rVar, 1)), sd);
                    break;
                } else {
                    sd.execute(new RunnableC2641Kj(rVar, 0));
                    break;
                }
                break;
            default:
                C2658Lj c2658Lj2 = this.f25587v;
                c2658Lj2.getClass();
                AbstractC3212fg.f30743f.execute(new RunnableC3376ij(1, c2658Lj2));
                this.f25586u.mo7l((AbstractC2539Ej) obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.LD
    public final void q(Throwable th) {
        switch (this.f25585n) {
            case 0:
                this.f25586u.q(th);
                C2658Lj c2658Lj = this.f25587v;
                c2658Lj.getClass();
                AbstractC3212fg.f30743f.execute(new RunnableC3376ij(1, c2658Lj));
                break;
            default:
                C2658Lj c2658Lj2 = this.f25587v;
                c2658Lj2.getClass();
                AbstractC3212fg.f30743f.execute(new RunnableC3376ij(1, c2658Lj2));
                this.f25586u.q(th);
                break;
        }
    }
}
