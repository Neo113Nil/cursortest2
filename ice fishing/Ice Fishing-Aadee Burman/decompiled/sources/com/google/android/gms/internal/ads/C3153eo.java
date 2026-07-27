package com.google.android.gms.internal.ads;

import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.eo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3153eo {

    /* renamed from: a, reason: collision with root package name */
    public final C3315ho f29975a;

    /* renamed from: b, reason: collision with root package name */
    public final RD f29976b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f29977c;

    public C3153eo(C3315ho c3315ho, RD rd) {
        this.f29975a = c3315ho;
        c3315ho.getClass();
        this.f29977c = new HashMap(c3315ho.f30940a);
        this.f29976b = rd;
    }

    public final S0.e a() {
        S0.e eVar = new S0.e(this);
        ((ConcurrentHashMap) eVar.f2781u).putAll(((C3153eo) eVar.f2782v).f29977c);
        return eVar;
    }

    public final void b() {
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.bd)).booleanValue()) {
            S0.e a9 = a();
            a9.v(NativeAdvancedJsUtils.f17906p, "pecr");
            a9.y();
        }
    }
}
