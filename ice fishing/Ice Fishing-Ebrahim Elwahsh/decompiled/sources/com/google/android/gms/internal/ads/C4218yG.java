package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.yG, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4218yG {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35335a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35336b;

    public /* synthetic */ C4218yG(C2593Hm c2593Hm) {
        this.f35335a = new HashMap((HashMap) c2593Hm.f25417v);
        this.f35336b = new HashMap((HashMap) c2593Hm.f25416u);
    }

    public final Object a(XC xc, Class cls) {
        C4110wG c4110wG = new C4110wG(xc.getClass(), cls);
        HashMap hashMap = this.f35335a;
        if (hashMap.containsKey(c4110wG)) {
            return ((C4002uG) hashMap.get(c4110wG)).f34577c.c(xc);
        }
        String c4110wG2 = c4110wG.toString();
        throw new GeneralSecurityException(D.y.o(new StringBuilder(c4110wG2.length() + 102), "No PrimitiveConstructor for ", c4110wG2, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
