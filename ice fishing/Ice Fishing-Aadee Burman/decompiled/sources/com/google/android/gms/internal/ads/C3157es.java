package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import p2.C4835j;
import v2.C5110a;

/* renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3157es implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29989a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29990b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f29991c;

    public /* synthetic */ C3157es(int i, Object obj, Object obj2) {
        this.f29989a = i;
        this.f29990b = obj;
        this.f29991c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        switch (this.f29989a) {
            case 0:
                return ((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32074M3)).booleanValue() ? QC.c(new Xr(1, null)) : QC.u(((C3038cg) this.f29991c).h(), L2.f26030l, (RD) this.f29990b);
            case 1:
                return ((C3360ig) this.f29990b).b(new CallableC3549m7(12, this));
            case 2:
                u2.z.k("HsdpMigrationSignal.produce");
                if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.me)).booleanValue()) {
                    return QC.c(new C4234ys(null, 1));
                }
                boolean z3 = false;
                try {
                    if (((Intent) this.f29991c).resolveActivity(((Context) this.f29990b).getPackageManager()) != null) {
                        u2.z.k("HSDP intent is supported");
                        z3 = true;
                    }
                } catch (Exception e9) {
                    C4835j.f39730C.f39740h.d("HsdpMigrationSignal.isHsdpMigrationSupported", e9);
                }
                return QC.c(new C4234ys(Boolean.valueOf(z3), 1));
            case 3:
                return ((C3360ig) this.f29990b).b(new CallableC3549m7(20, this));
            case 4:
                return ((C3360ig) this.f29990b).b(new CallableC3549m7(23, this));
            case 5:
                ND c9 = QC.c((String) this.f29991c);
                L2 l22 = L2.f26032n;
                RD rd = (RD) this.f29990b;
                return QC.r(QC.u(c9, l22, rd), Throwable.class, new C4164xc(10, this), rd);
            default:
                return ((C3360ig) this.f29990b).b(new Ts(2, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f29989a) {
            case 0:
                return 10;
            case 1:
                return 54;
            case 2:
                return 60;
            case 3:
                return 23;
            case 4:
                return 62;
            case 5:
                return 41;
            default:
                return 48;
        }
    }

    public C3157es(C5110a c5110a, C3360ig c3360ig) {
        this.f29989a = 1;
        this.f29991c = c5110a;
        this.f29990b = c3360ig;
    }
}
