package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import v2.C5110a;

/* loaded from: classes2.dex */
public final class Or implements Ps {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26663a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26664b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26665c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f26666d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f26667e;

    public Or(Context context, C3360ig c3360ig, C3052cu c3052cu, C5110a c5110a) {
        this.f26663a = 6;
        this.f26665c = context;
        this.f26666d = c3360ig;
        this.f26664b = c3052cu;
        this.f26667e = c5110a;
    }

    public static final int a(float f3, int i) {
        if (f3 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f3);
    }

    public static final G.e b(G.e eVar, float f3) {
        return f3 == 0.0f ? G.e.f1004e : G.e.b((int) Math.ceil(eVar.f1005a / f3), (int) Math.ceil(eVar.f1006b / f3), (int) Math.ceil(eVar.f1007c / f3), (int) Math.ceil(eVar.f1008d / f3));
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        C2943as c2943as;
        switch (this.f26663a) {
            case 0:
                AbstractC3569ma.a((Context) this.f26665c);
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(7, this));
            case 1:
                return QC.u(((C3695os) this.f26666d).c(), new C2722Pe(3, this), AbstractC3413jg.f31275h);
            case 2:
                C3301ha c3301ha = AbstractC3569ma.cd;
                q2.r rVar = q2.r.f40204e;
                boolean booleanValue = ((Boolean) rVar.f40207c.a(c3301ha)).booleanValue();
                C2997bs c2997bs = (C2997bs) this.f26667e;
                if (booleanValue && (c2943as = c2997bs.f29340b) != null) {
                    return QC.c(c2943as);
                }
                C3301ha c3301ha2 = AbstractC3569ma.f32177Y1;
                SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40207c;
                if (SK.n((String) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha2)) || (!((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(c3301ha)).booleanValue() && (c2997bs.f29339a.get() || !((C2494Bo) this.f26664b).f23954b))) {
                    return QC.c(new C2943as(0, new Bundle()));
                }
                c2997bs.f29339a.set(true);
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(9, this));
            case 3:
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(15, this));
            case 4:
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(19, this));
            case 5:
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(21, this));
            case 6:
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(24, this));
            case 7:
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(26, this));
            default:
                return ((C3360ig) this.f26666d).b(new CallableC3549m7(29, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        switch (this.f26663a) {
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

    public /* synthetic */ Or(C3360ig c3360ig, Object obj, Object obj2, Object obj3, int i) {
        this.f26663a = i;
        this.f26666d = c3360ig;
        this.f26665c = obj;
        this.f26664b = obj2;
        this.f26667e = obj3;
    }

    public /* synthetic */ Or(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f26663a = i;
        this.f26666d = obj;
        this.f26664b = obj2;
        this.f26665c = obj3;
        this.f26667e = obj4;
    }
}
