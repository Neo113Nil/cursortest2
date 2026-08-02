package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import r2.C4906k;
import x2.C5189a;

/* renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3180es implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30778a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30779b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30780c;

    public /* synthetic */ C3180es(int i, Object obj, Object obj2) {
        this.f30778a = i;
        this.f30779b = obj;
        this.f30780c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        switch (this.f30778a) {
            case 0:
                return ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32853M3)).booleanValue() ? QC.c(new Xr(1, null)) : QC.u(((C3061cg) this.f30780c).h(), L2.f26830l, (RD) this.f30779b);
            case 1:
                return ((C3383ig) this.f30779b).b(new CallableC3572m7(12, this));
            case 2:
                w2.z.k("HsdpMigrationSignal.produce");
                if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.me)).booleanValue()) {
                    return QC.c(new C4257ys(null, 1));
                }
                boolean z6 = false;
                try {
                    if (((Intent) this.f30780c).resolveActivity(((Context) this.f30779b).getPackageManager()) != null) {
                        w2.z.k("HSDP intent is supported");
                        z6 = true;
                    }
                } catch (Exception e9) {
                    C4906k.f40186C.f40196h.d("HsdpMigrationSignal.isHsdpMigrationSupported", e9);
                }
                return QC.c(new C4257ys(Boolean.valueOf(z6), 1));
            case 3:
                return ((C3383ig) this.f30779b).b(new CallableC3572m7(20, this));
            case 4:
                return ((C3383ig) this.f30779b).b(new CallableC3572m7(23, this));
            case 5:
                ND c9 = QC.c((String) this.f30780c);
                L2 l22 = L2.f26832n;
                RD rd = (RD) this.f30779b;
                return QC.r(QC.u(c9, l22, rd), Throwable.class, new C4187xc(10, this), rd);
            default:
                return ((C3383ig) this.f30779b).b(new Ts(2, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f30778a) {
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

    public C3180es(C5189a c5189a, C3383ig c3383ig) {
        this.f30778a = 1;
        this.f30780c = c5189a;
        this.f30779b = c3383ig;
    }
}
