package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.Ii, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2627Ii implements InterfaceC2508Bi {
    @Override // com.google.android.gms.internal.ads.InterfaceC2508Bi
    public final void a(HashMap hashMap) {
        if (!((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ob)).booleanValue() || hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C4906k.f40186C.f40196h.g().u(Boolean.parseBoolean(str));
    }
}
