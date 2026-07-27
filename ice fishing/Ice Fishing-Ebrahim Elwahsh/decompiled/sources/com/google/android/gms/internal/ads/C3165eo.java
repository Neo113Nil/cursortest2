package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3165eo {

    /* renamed from: a, reason: collision with root package name */
    public final C3381io f30506a;

    /* renamed from: b, reason: collision with root package name */
    public final SD f30507b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f30508c;

    public C3165eo(C3381io c3381io, SD sd) {
        this.f30506a = c3381io;
        c3381io.getClass();
        this.f30508c = new HashMap(c3381io.f31998a);
        this.f30507b = sd;
    }

    public final C2593Hm a() {
        C2593Hm c2593Hm = new C2593Hm(this);
        ((ConcurrentHashMap) c2593Hm.f25417v).putAll(((C3165eo) c2593Hm.f25416u).f30508c);
        return c2593Hm;
    }

    public final void b() {
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.bd)).booleanValue()) {
            C2593Hm a9 = a();
            a9.r(NativeAdvancedJsUtils.f18064p, "pecr");
            a9.s();
        }
    }
}
