package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import p2.C4835j;
import p2.RunnableC4830e;

/* renamed from: com.google.android.gms.internal.ads.bo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2993bo {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f29325a;

    /* renamed from: b, reason: collision with root package name */
    public final C3199fg f29326b;

    /* renamed from: c, reason: collision with root package name */
    public final C3052cu f29327c;

    /* renamed from: d, reason: collision with root package name */
    public final C3441k7 f29328d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f29329e = new Bundle();

    public C2993bo(Context context, C3315ho c3315ho, C3199fg c3199fg, C3052cu c3052cu, String str, String str2, C3441k7 c3441k7, B2.d dVar) {
        ActivityManager.MemoryInfo i;
        c3315ho.getClass();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c3315ho.f30940a);
        this.f29325a = concurrentHashMap;
        this.f29326b = c3199fg;
        this.f29327c = c3052cu;
        this.f29328d = c3441k7;
        concurrentHashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str2.toUpperCase(Locale.ROOT));
        d();
        C3301ha c3301ha = AbstractC3569ma.J2;
        q2.r rVar = q2.r.f40207e;
        boolean booleanValue = ((Boolean) rVar.f40210c.a(c3301ha)).booleanValue();
        SharedPreferencesOnSharedPreferenceChangeListenerC3461ka sharedPreferencesOnSharedPreferenceChangeListenerC3461ka = rVar.f40210c;
        if (booleanValue) {
            Runtime runtime = Runtime.getRuntime();
            b("rt_f", String.valueOf(runtime.freeMemory()));
            b("rt_m", String.valueOf(runtime.maxMemory()));
            b("rt_t", String.valueOf(runtime.totalMemory()));
            b("wv_c", String.valueOf(C4835j.f39733C.f39743h.f29526k.get()));
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32126S2)).booleanValue() && (i = v2.d.i(context)) != null) {
                b("mem_avl", String.valueOf(i.availMem));
                b("mem_tt", String.valueOf(i.totalMem));
                b("low_m", true != i.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32186Z2)).booleanValue()) {
            b("ad_unit_id", c3052cu.f29626g);
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32135T2)).booleanValue()) {
            b("mem_tier", ((B2.a) dVar.f181c.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32144U2)).booleanValue()) {
            b("proc_tier", ((B2.c) dVar.f183e.get()).name());
        }
        if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3461ka.a(AbstractC3569ma.f32113Q7)).booleanValue()) {
            int q8 = com.bumptech.glide.d.q(c3052cu) - 1;
            if (q8 == 0) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("scar", "false");
                return;
            }
            if (q8 == 1) {
                concurrentHashMap.put("request_id", str);
                concurrentHashMap.put("se", "query_g");
            } else if (q8 == 2) {
                concurrentHashMap.put("se", "r_adinfo");
            } else if (q8 != 3) {
                concurrentHashMap.put("se", "r_both");
            } else {
                concurrentHashMap.put("se", "r_adstring");
            }
            concurrentHashMap.put("scar", "true");
            q2.c1 c1Var = c3052cu.f29623d;
            b("ragent", c1Var.f40105I);
            b("rtype", com.bumptech.glide.d.m(com.bumptech.glide.d.n(c1Var)));
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
        this.f29325a.put(str, str2);
    }

    public final synchronized void c(String str, long j6) {
        this.f29329e.putLong(str, j6);
    }

    public final void d() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.Ra)).booleanValue()) {
            InterfaceC3335i7 interfaceC3335i7 = this.f29328d.f31381b;
            boolean z3 = interfaceC3335i7 instanceof RunnableC4830e;
            ConcurrentHashMap concurrentHashMap = this.f29325a;
            if (z3) {
                int i = ((RunnableC4830e) interfaceC3335i7).f39708H;
                int i6 = i - 1;
                if (i == 0) {
                    throw null;
                }
                concurrentHashMap.put("asv", i6 != 0 ? "2" : "1");
                return;
            }
            if (!(interfaceC3335i7 instanceof C2856Xh)) {
                concurrentHashMap.put("asv", "NA");
                return;
            }
            Ly ly = (Ly) ((Yx) ((C2856Xh) interfaceC3335i7).f28551u.f32954u).f28766b.f26895f.get();
            int h9 = (ly == null ? 1 : ly.h()) - 1;
            concurrentHashMap.put("asv", h9 != 1 ? h9 != 2 ? h9 != 3 ? "uns" : "3.0" : j.e.f12437b : j.e.f12436a);
        }
    }
}
