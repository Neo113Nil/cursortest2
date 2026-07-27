package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import u2.C5107a;

/* loaded from: classes2.dex */
public final class Qr implements Rs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27257a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27258b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27259c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27260d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f27261e;

    public Qr(Context context, C3157eg c3157eg, C3226fu c3226fu, C5107a c5107a) {
        this.f27257a = 6;
        this.f27259c = context;
        this.f27260d = c3157eg;
        this.f27258b = c3226fu;
        this.f27261e = c5107a;
    }

    public static final int b(float f6, int i) {
        if (f6 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f6);
    }

    public static final G.e c(G.e eVar, float f6) {
        return f6 == 0.0f ? G.e.f1150e : G.e.b((int) Math.ceil(eVar.f1151a / f6), (int) Math.ceil(eVar.f1152b / f6), (int) Math.ceil(eVar.f1153c / f6), (int) Math.ceil(eVar.f1154d / f6));
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final J3.a a() {
        C3060cs c3060cs;
        switch (this.f27257a) {
            case 0:
                AbstractC3368ia.a((Context) this.f27259c);
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(7, this));
            case 1:
                return C3686oN.A(((C3869rs) this.f27260d).a(), new C2670Me(3, this), AbstractC3212fg.f30745h);
            case 2:
                C3151ea c3151ea = AbstractC3368ia.cd;
                q2.r rVar = q2.r.f40116e;
                boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
                C3114ds c3114ds = (C3114ds) this.f27261e;
                if (booleanValue && (c3060cs = c3114ds.f30251b) != null) {
                    return C3686oN.c(c3060cs);
                }
                C3151ea c3151ea2 = AbstractC3368ia.f31597Y1;
                SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
                if (AbstractC3217fl.q((String) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)) || (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue() && (c3114ds.f30250a.get() || !((C2527Do) this.f27258b).f24556b))) {
                    return C3686oN.c(new C3060cs(0, new Bundle()));
                }
                c3114ds.f30250a.set(true);
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(9, this));
            case 3:
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(15, this));
            case 4:
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(19, this));
            case 5:
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(21, this));
            case 6:
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(24, this));
            case 7:
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(26, this));
            default:
                return ((C3157eg) this.f27260d).b(new CallableC3454k7(29, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Rs
    public final int d() {
        switch (this.f27257a) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            case 7:
                return 35;
            default:
                return 38;
        }
    }

    public /* synthetic */ Qr(C3157eg c3157eg, Object obj, Object obj2, Object obj3, int i) {
        this.f27257a = i;
        this.f27260d = c3157eg;
        this.f27259c = obj;
        this.f27258b = obj2;
        this.f27261e = obj3;
    }

    public /* synthetic */ Qr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f27257a = i;
        this.f27260d = obj;
        this.f27258b = obj2;
        this.f27259c = obj3;
        this.f27261e = obj4;
    }
}
