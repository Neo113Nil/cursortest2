package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.tG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3935tG {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f34257a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f34258b;

    public /* synthetic */ C3935tG(S0.l lVar) {
        this.f34257a = new HashMap((HashMap) lVar.f2797u);
        this.f34258b = new HashMap((HashMap) lVar.f2798v);
    }

    public final Object a(WC wc, Class cls) {
        C3881sG c3881sG = new C3881sG(wc.getClass(), cls);
        HashMap hashMap = this.f34257a;
        if (hashMap.containsKey(c3881sG)) {
            return ((C3774qG) hashMap.get(c3881sG)).f33229c.b(wc);
        }
        String c3881sG2 = c3881sG.toString();
        throw new GeneralSecurityException(D.y.s(new StringBuilder(c3881sG2.length() + 102), "No PrimitiveConstructor for ", c3881sG2, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
