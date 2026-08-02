package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import x2.C5189a;

/* loaded from: classes2.dex */
public final class Or implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27446a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27447b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27448c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f27449d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f27450e;

    public Or(Context context, C3383ig c3383ig, C3075cu c3075cu, C5189a c5189a) {
        this.f27446a = 6;
        this.f27448c = context;
        this.f27449d = c3383ig;
        this.f27447b = c3075cu;
        this.f27450e = c5189a;
    }

    public static final int a(float f2, int i) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f2);
    }

    public static final G.e b(G.e eVar, float f2) {
        return f2 == 0.0f ? G.e.f1030e : G.e.b((int) Math.ceil(eVar.f1031a / f2), (int) Math.ceil(eVar.f1032b / f2), (int) Math.ceil(eVar.f1033c / f2), (int) Math.ceil(eVar.f1034d / f2));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        C2966as c2966as;
        switch (this.f27446a) {
            case 0:
                AbstractC3592ma.a((Context) this.f27448c);
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(7, this));
            case 1:
                return QC.u(((C3718os) this.f27449d).c(), new C2742Pe(3, this), AbstractC3436jg.f32062h);
            case 2:
                C3324ha c3324ha = AbstractC3592ma.cd;
                s2.r rVar = s2.r.f40506e;
                boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
                C3020bs c3020bs = (C3020bs) this.f27450e;
                if (booleanValue && (c2966as = c3020bs.f30128b) != null) {
                    return QC.c(c2966as);
                }
                C3324ha c3324ha2 = AbstractC3592ma.f32956Y1;
                SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
                if (SK.n((String) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha2)) || (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(c3324ha)).booleanValue() && (c3020bs.f30127a.get() || !((C2531Co) this.f27447b).f24967b))) {
                    return QC.c(new C2966as(0, new Bundle()));
                }
                c3020bs.f30127a.set(true);
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(9, this));
            case 3:
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(15, this));
            case 4:
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(19, this));
            case 5:
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(21, this));
            case 6:
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(24, this));
            case 7:
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(26, this));
            default:
                return ((C3383ig) this.f27449d).b(new CallableC3572m7(29, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f27446a) {
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

    public /* synthetic */ Or(C3383ig c3383ig, Object obj, Object obj2, Object obj3, int i) {
        this.f27446a = i;
        this.f27449d = c3383ig;
        this.f27448c = obj;
        this.f27447b = obj2;
        this.f27450e = obj3;
    }

    public /* synthetic */ Or(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f27446a = i;
        this.f27449d = obj;
        this.f27447b = obj2;
        this.f27448c = obj3;
        this.f27450e = obj4;
    }
}
