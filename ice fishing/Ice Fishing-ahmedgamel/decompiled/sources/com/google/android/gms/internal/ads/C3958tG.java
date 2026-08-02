package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.tG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3958tG {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35043a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35044b;

    public /* synthetic */ C3958tG(S0.l lVar) {
        this.f35043a = new HashMap((HashMap) lVar.f2926u);
        this.f35044b = new HashMap((HashMap) lVar.f2927v);
    }

    public final Object a(WC wc, Class cls) {
        C3904sG c3904sG = new C3904sG(wc.getClass(), cls);
        HashMap hashMap = this.f35043a;
        if (hashMap.containsKey(c3904sG)) {
            return ((C3797qG) hashMap.get(c3904sG)).f34013c.b(wc);
        }
        String c3904sG2 = c3904sG.toString();
        throw new GeneralSecurityException(D.x.p(new StringBuilder(c3904sG2.length() + 102), "No PrimitiveConstructor for ", c3904sG2, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
