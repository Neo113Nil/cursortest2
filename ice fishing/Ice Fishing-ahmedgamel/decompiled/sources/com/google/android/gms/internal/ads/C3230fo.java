package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.fo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3230fo {

    /* renamed from: a, reason: collision with root package name */
    public final C3391io f31215a;

    /* renamed from: b, reason: collision with root package name */
    public final RD f31216b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f31217c;

    public C3230fo(C3391io c3391io, RD rd) {
        this.f31215a = c3391io;
        c3391io.getClass();
        this.f31217c = new HashMap(c3391io.f31897a);
        this.f31216b = rd;
    }

    public final S0.e a() {
        S0.e eVar = new S0.e(this);
        ((ConcurrentHashMap) eVar.f2908u).putAll(((C3230fo) eVar.f2909v).f31217c);
        return eVar;
    }

    public final void b() {
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.bd)).booleanValue()) {
            S0.e a9 = a();
            a9.M(NativeAdvancedJsUtils.f18693p, "pecr");
            a9.N();
        }
    }
}
