package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import r2.C4906k;
import r2.RunnableC4901f;

/* renamed from: com.google.android.gms.internal.ads.co, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3069co {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f30367a;

    /* renamed from: b, reason: collision with root package name */
    public final C3222fg f30368b;

    /* renamed from: c, reason: collision with root package name */
    public final C3075cu f30369c;

    /* renamed from: d, reason: collision with root package name */
    public final C3464k7 f30370d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f30371e = new Bundle();

    public C3069co(Context context, C3391io c3391io, C3222fg c3222fg, C3075cu c3075cu, String str, String str2, C3464k7 c3464k7, D2.d dVar) {
        ActivityManager.MemoryInfo i;
        c3391io.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3391io.f31897a);
        this.f30367a = concurrentHashMap;
        this.f30368b = c3222fg;
        this.f30369c = c3075cu;
        this.f30370d = c3464k7;
        concurrentHashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str2.toUpperCase(Locale.ROOT));
        d();
        C3324ha c3324ha = AbstractC3592ma.f32828J2;
        s2.r rVar = s2.r.f40506e;
        boolean booleanValue = ((Boolean) rVar.f40509c.a(c3324ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3484ka sharedPreferencesOnSharedPreferenceChangeListenerC3484ka = rVar.f40509c;
        if (booleanValue) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(C4906k.f40186C.f40196h.f30311k.get()));
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32905S2)).booleanValue() && (i = x2.d.i(context)) != null) {
                b("mem_avl", String.valueOf(i.availMem));
                b("mem_tt", String.valueOf(i.totalMem));
                b("low_m", true != i.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32965Z2)).booleanValue()) {
            b("ad_unit_id", c3075cu.f30396g);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32914T2)).booleanValue()) {
            b("mem_tier", ((D2.a) dVar.f600c.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32923U2)).booleanValue()) {
            b("proc_tier", ((D2.c) dVar.f602e.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3484ka.a(AbstractC3592ma.f32893Q7)).booleanValue()) {
            int B3 = t8.g.B(c3075cu) - 1;
            if (B3 == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (B3 == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (B3 == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (B3 != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            s2.c1 c1Var = c3075cu.f30393d;
            b("ragent", c1Var.f40404I);
            b("rtype", t8.g.s(t8.g.u(c1Var)));
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
        this.f30367a.put(str, str2);
    }

    public final synchronized void c(String str, long j6) {
        this.f30371e.putLong(str, j6);
    }

    public final void d() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ra)).booleanValue()) {
            InterfaceC3358i7 interfaceC3358i7 = this.f30370d.f32160b;
            boolean z6 = interfaceC3358i7 instanceof RunnableC4901f;
            ConcurrentHashMap concurrentHashMap = this.f30367a;
            if (z6) {
                int i = ((RunnableC4901f) interfaceC3358i7).f40161H;
                int i4 = i - 1;
                if (i == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i4 != 0 ? "2" : "1");
                return;
            }
            if (!(interfaceC3358i7 instanceof C2879Xh)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            Ly ly = (Ly) ((Yx) ((C2879Xh) interfaceC3358i7).f29323u.f33740u).f29546b.f27682f.get();
            int h3 = (ly == null ? 1 : ly.h()) - 1;
            concurrentHashMap.put("asv", h3 != 1 ? h3 != 2 ? h3 != 3 ? "uns" : "3.0" : j.e.f13223b : j.e.f13222a);
        }
    }
}
