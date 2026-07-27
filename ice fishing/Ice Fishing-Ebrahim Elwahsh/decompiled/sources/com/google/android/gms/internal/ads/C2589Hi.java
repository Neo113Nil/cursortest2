package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Hi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2589Hi implements InterfaceC2470Ai {
    @Override // com.google.android.gms.internal.ads.InterfaceC2470Ai
    public final void a(HashMap hashMap) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ob)).booleanValue() || hashMap.isEmpty()) {
            return;
        }
        String str = (String) hashMap.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p2.j.f39798C.f39808h.g().u(Boolean.parseBoolean(str));
    }
}
