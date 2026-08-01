package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import p2.C4835j;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.jo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3421jo {

    /* renamed from: e, reason: collision with root package name */
    public final String f31323e;

    /* renamed from: f, reason: collision with root package name */
    public final C3315ho f31324f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31320b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f31321c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31322d = false;

    /* renamed from: a, reason: collision with root package name */
    public final C5069B f31319a = C4835j.f39733C.f39743h.g();

    public C3421jo(C3315ho c3315ho, String str) {
        this.f31323e = str;
        this.f31324f = c3315ho;
    }

    public final synchronized void a(String str) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32025G2)).booleanValue()) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f17906p, "adapter_init_started");
            e9.put("ancn", str);
            this.f31320b.add(e9);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32025G2)).booleanValue()) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f17906p, "adapter_init_finished");
            e9.put("ancn", str);
            this.f31320b.add(e9);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32025G2)).booleanValue()) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f17906p, "adapter_init_finished");
            e9.put("ancn", str);
            e9.put("rqe", str2);
            this.f31320b.add(e9);
        }
    }

    public final synchronized void d() {
        if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32025G2)).booleanValue() && !this.f31321c) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f17906p, "init_started");
            this.f31320b.add(e9);
            this.f31321c = true;
        }
    }

    public final HashMap e() {
        C3315ho c3315ho = this.f31324f;
        c3315ho.getClass();
        HashMap hashMap = new HashMap(c3315ho.f30940a);
        C4835j.f39733C.f39745k.getClass();
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        hashMap.put("tid", this.f31319a.t() ? "" : this.f31323e);
        return hashMap;
    }
}
