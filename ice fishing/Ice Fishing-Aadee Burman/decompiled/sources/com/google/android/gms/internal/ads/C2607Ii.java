package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.Ii, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2607Ii implements InterfaceC2488Bi {
    @Override // com.google.android.gms.internal.ads.InterfaceC2488Bi
    public final void a(HashMap hashMap) {
        if (!((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ob)).booleanValue() || hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C4835j.f39730C.f39740h.g().u(Boolean.parseBoolean(str));
    }
}
