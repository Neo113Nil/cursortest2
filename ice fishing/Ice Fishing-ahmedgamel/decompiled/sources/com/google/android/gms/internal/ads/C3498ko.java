package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.ArrayList;
import java.util.HashMap;
import r2.C4906k;
import w2.C5140B;

/* renamed from: com.google.android.gms.internal.ads.ko, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3498ko {

    /* renamed from: e, reason: collision with root package name */
    public final String f32413e;

    /* renamed from: f, reason: collision with root package name */
    public final C3391io f32414f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f32410b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f32411c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32412d = false;

    /* renamed from: a, reason: collision with root package name */
    public final C5140B f32409a = C4906k.f40186C.f40196h.g();

    public C3498ko(C3391io c3391io, String str) {
        this.f32413e = str;
        this.f32414f = c3391io;
    }

    public final synchronized void a(String str) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G2)).booleanValue()) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f18693p, "adapter_init_started");
            e9.put("ancn", str);
            this.f32410b.add(e9);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G2)).booleanValue()) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f18693p, "adapter_init_finished");
            e9.put("ancn", str);
            this.f32410b.add(e9);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G2)).booleanValue()) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f18693p, "adapter_init_finished");
            e9.put("ancn", str);
            e9.put("rqe", str2);
            this.f32410b.add(e9);
        }
    }

    public final synchronized void d() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.G2)).booleanValue() && !this.f32411c) {
            HashMap e9 = e();
            e9.put(NativeAdvancedJsUtils.f18693p, "init_started");
            this.f32410b.add(e9);
            this.f32411c = true;
        }
    }

    public final HashMap e() {
        C3391io c3391io = this.f32414f;
        c3391io.getClass();
        HashMap hashMap = new HashMap(c3391io.f31897a);
        C4906k.f40186C.f40198k.getClass();
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        hashMap.put("tid", this.f32409a.t() ? "" : this.f32413e);
        return hashMap;
    }
}
