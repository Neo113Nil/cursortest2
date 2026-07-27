package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.gs, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3278gs implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31111a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31112b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31113c;

    public /* synthetic */ C3278gs(int i, Object obj, Object obj2) {
        this.f31111a = i;
        this.f31112b = obj;
        this.f31113c = obj2;
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        switch (this.f31111a) {
            case 0:
                return ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31495M3)).booleanValue() ? C3686oN.c(new C2951as(1, null)) : C3686oN.A(((C2892Zf) this.f31113c).h(), J2.f25700l, (SD) this.f31112b);
            case 1:
                return ((C3157eg) this.f31112b).b(new CallableC3454k7(12, this));
            case 2:
                t2.C.k("HsdpMigrationSignal.produce");
                if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.me)).booleanValue()) {
                    return C3686oN.c(new Bs(null, 1));
                }
                boolean z8 = false;
                try {
                    if (((Intent) this.f31113c).resolveActivity(((Context) this.f31112b).getPackageManager()) != null) {
                        t2.C.k("HSDP intent is supported");
                        z8 = true;
                    }
                } catch (Exception e6) {
                    p2.j.f39798C.f39808h.d("HsdpMigrationSignal.isHsdpMigrationSupported", e6);
                }
                return C3686oN.c(new Bs(Boolean.valueOf(z8), 1));
            case 3:
                return ((C3157eg) this.f31112b).b(new CallableC3454k7(20, this));
            case 4:
                return ((C3157eg) this.f31112b).b(new CallableC3454k7(23, this));
            case 5:
                OD c4 = C3686oN.c((String) this.f31113c);
                J2 j22 = J2.f25702n;
                SD sd = (SD) this.f31112b;
                return C3686oN.v(C3686oN.A(c4, j22, sd), Throwable.class, new C3907sc(10, this), sd);
            default:
                return ((C3157eg) this.f31112b).b(new Vs(2, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f31111a) {
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

    public C3278gs(C5107a c5107a, C3157eg c3157eg) {
        this.f31111a = 1;
        this.f31113c = c5107a;
        this.f31112b = c3157eg;
    }
}
