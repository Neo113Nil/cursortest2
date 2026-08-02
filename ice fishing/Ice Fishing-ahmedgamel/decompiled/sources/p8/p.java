package p8;

import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39919n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f39920u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f39921v;

    public /* synthetic */ p(int i, Object obj, Object obj2) {
        this.f39919n = i;
        this.f39920u = obj;
        this.f39921v = obj2;
    }

    @Override // I7.a
    public final Object invoke() {
        long a9;
        int i;
        z[] zVarArr;
        switch (this.f39919n) {
            case 0:
                r rVar = (r) this.f39920u;
                z zVar = (z) this.f39921v;
                try {
                    rVar.f39942n.b(zVar);
                } catch (IOException e9) {
                    s8.f fVar = s8.f.f40554a;
                    s8.f.f40554a.j(4, "Http2Connection.Listener failure for " + rVar.f39944v, e9);
                    try {
                        zVar.c(EnumC4856b.f39867w, e9);
                    } catch (IOException unused) {
                    }
                }
                return u7.v.f41073a;
            case 1:
                q qVar = (q) this.f39920u;
                D d9 = (D) this.f39921v;
                kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                r rVar3 = qVar.f39923u;
                synchronized (rVar3.f39939P) {
                    synchronized (rVar3) {
                        try {
                            D d10 = rVar3.f39934K;
                            D d11 = new D();
                            d11.b(d10);
                            d11.b(d9);
                            rVar2.f38644n = d11;
                            a9 = d11.a() - d10.a();
                            if (a9 != 0 && !rVar3.f39943u.isEmpty()) {
                                zVarArr = (z[]) rVar3.f39943u.values().toArray(new z[0]);
                                D d12 = (D) rVar2.f38644n;
                                kotlin.jvm.internal.h.e(d12, "<set-?>");
                                rVar3.f39934K = d12;
                                l8.c.c(rVar3.f39927C, rVar3.f39944v + " onSettings", new p(2, rVar3, rVar2));
                            }
                            zVarArr = null;
                            D d122 = (D) rVar2.f38644n;
                            kotlin.jvm.internal.h.e(d122, "<set-?>");
                            rVar3.f39934K = d122;
                            l8.c.c(rVar3.f39927C, rVar3.f39944v + " onSettings", new p(2, rVar3, rVar2));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        rVar3.f39939P.a((D) rVar2.f38644n);
                    } catch (IOException e10) {
                        EnumC4856b enumC4856b = EnumC4856b.f39867w;
                        rVar3.a(enumC4856b, enumC4856b, e10);
                    }
                }
                if (zVarArr != null) {
                    for (z zVar2 : zVarArr) {
                        synchronized (zVar2) {
                            zVar2.f39988x += a9;
                            if (a9 > 0) {
                                zVar2.notifyAll();
                            }
                        }
                    }
                }
                return u7.v.f41073a;
            default:
                r rVar4 = (r) this.f39920u;
                rVar4.f39942n.a(rVar4, (D) ((kotlin.jvm.internal.r) this.f39921v).f38644n);
                return u7.v.f41073a;
        }
    }
}
