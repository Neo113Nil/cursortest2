package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.bo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3002bo {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f29588a;

    /* renamed from: b, reason: collision with root package name */
    public final C2994bg f29589b;

    /* renamed from: c, reason: collision with root package name */
    public final C3226fu f29590c;

    /* renamed from: d, reason: collision with root package name */
    public final C3348i7 f29591d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f29592e = new Bundle();

    public C3002bo(Context context, C3381io c3381io, C2994bg c2994bg, C3226fu c3226fu, String str, String str2, C3348i7 c3348i7, A2.d dVar) {
        ActivityManager.MemoryInfo i;
        c3381io.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3381io.f31998a);
        this.f29588a = concurrentHashMap;
        this.f29589b = c2994bg;
        this.f29590c = c3226fu;
        this.f29591d = c3348i7;
        concurrentHashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str2.toUpperCase(Locale.ROOT));
        d();
        C3151ea c3151ea = AbstractC3368ia.f31467J2;
        q2.r rVar = q2.r.f40116e;
        boolean booleanValue = ((Boolean) rVar.f40119c.a(c3151ea)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
        if (booleanValue) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(p2.j.f39798C.f39808h.f29021k.get()));
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31546S2)).booleanValue() && (i = u2.d.i(context)) != null) {
                b("mem_avl", String.valueOf(i.availMem));
                b("mem_tt", String.valueOf(i.totalMem));
                b("low_m", true != i.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31607Z2)).booleanValue()) {
            b("ad_unit_id", c3226fu.f30904g);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31555T2)).booleanValue()) {
            b("mem_tier", ((A2.a) dVar.f30c.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31564U2)).booleanValue()) {
            b("proc_tier", ((A2.c) dVar.f32e.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.f31533Q7)).booleanValue()) {
            int M8 = K3.b.M(c3226fu) - 1;
            if (M8 == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (M8 == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (M8 == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (M8 != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            q2.d1 d1Var = c3226fu.f30901d;
            b("ragent", d1Var.f40016I);
            b("rtype", K3.b.I(K3.b.J(d1Var)));
        }
    }

    public final void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            b("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            b("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f29588a.put(str, str2);
    }

    public final synchronized void c(String str, long j9) {
        this.f29592e.putLong(str, j9);
    }

    public final void d() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ra)).booleanValue()) {
            InterfaceC3240g7 interfaceC3240g7 = this.f29591d.f31319b;
            boolean z8 = interfaceC3240g7 instanceof p2.e;
            ConcurrentHashMap concurrentHashMap = this.f29588a;
            if (z8) {
                int i = ((p2.e) interfaceC3240g7).f39773H;
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i4 != 0 ? "2" : "1");
                return;
            }
            if (!(interfaceC3240g7 instanceof C2792Th)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            Ny ny = (Ny) ((Zx) ((C2792Th) interfaceC3240g7).f27801u.f33523u).f29116b.f27454f.get();
            int e6 = (ny == null ? 1 : ny.e()) - 1;
            concurrentHashMap.put("asv", e6 != 1 ? e6 != 2 ? e6 != 3 ? "uns" : "3.0" : j.e.f12594b : j.e.f12593a);
        }
    }
}
