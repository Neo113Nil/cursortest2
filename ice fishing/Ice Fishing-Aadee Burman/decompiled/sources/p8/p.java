package p8;

import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39869n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f39870u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f39871v;

    public /* synthetic */ p(int i, Object obj, Object obj2) {
        this.f39869n = i;
        this.f39870u = obj;
        this.f39871v = obj2;
    }

    @Override // I7.a
    public final Object invoke() {
        long a9;
        int i;
        z[] zVarArr;
        switch (this.f39869n) {
            case 0:
                r rVar = (r) this.f39870u;
                z zVar = (z) this.f39871v;
                try {
                    rVar.f39892n.b(zVar);
                } catch (IOException e9) {
                    s8.f fVar = s8.f.f40497a;
                    s8.f.f40497a.j(4, "Http2Connection.Listener failure for " + rVar.f39894v, e9);
                    try {
                        zVar.c(EnumC4856b.f39817w, e9);
                    } catch (IOException unused) {
                    }
                }
                return u7.v.f41350a;
            case 1:
                q qVar = (q) this.f39870u;
                D d2 = (D) this.f39871v;
                kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                r rVar3 = qVar.f39873u;
                synchronized (rVar3.f39889P) {
                    synchronized (rVar3) {
                        try {
                            D d9 = rVar3.f39884K;
                            D d10 = new D();
                            d10.b(d9);
                            d10.b(d2);
                            rVar2.f38717n = d10;
                            a9 = d10.a() - d9.a();
                            if (a9 != 0 && !rVar3.f39893u.isEmpty()) {
                                zVarArr = (z[]) rVar3.f39893u.values().toArray(new z[0]);
                                D d11 = (D) rVar2.f38717n;
                                kotlin.jvm.internal.h.e(d11, "<set-?>");
                                rVar3.f39884K = d11;
                                l8.c.c(rVar3.f39877C, rVar3.f39894v + " onSettings", new p(2, rVar3, rVar2));
                            }
                            zVarArr = null;
                            D d112 = (D) rVar2.f38717n;
                            kotlin.jvm.internal.h.e(d112, "<set-?>");
                            rVar3.f39884K = d112;
                            l8.c.c(rVar3.f39877C, rVar3.f39894v + " onSettings", new p(2, rVar3, rVar2));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar3.f39889P.a((D) rVar2.f38717n);
                    } catch (IOException e10) {
                        EnumC4856b enumC4856b = EnumC4856b.f39817w;
                        rVar3.a(enumC4856b, enumC4856b, e10);
                    }
                }
                if (zVarArr != null) {
                    for (z zVar2 : zVarArr) {
                        synchronized (zVar2) {
                            zVar2.f39938x += a9;
                            if (a9 > 0) {
                                zVar2.notifyAll();
                            }
                        }
                    }
                }
                return u7.v.f41350a;
            default:
                r rVar4 = (r) this.f39870u;
                rVar4.f39892n.a(rVar4, (D) ((kotlin.jvm.internal.r) this.f39871v).f38717n);
                return u7.v.f41350a;
        }
    }
}
