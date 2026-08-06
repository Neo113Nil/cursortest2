package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ge, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433ge {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6077a;

    public C0433ge() {
        HashMap hashMap = new HashMap();
        this.f6077a = hashMap;
        hashMap.put("google_aid", "g");
        hashMap.put("huawei_oaid", "h");
        hashMap.put("sim_info", "si");
        hashMap.put("features_collecting", "fc");
        hashMap.put("permissions_collecting", "pc");
        hashMap.put("retry_policy", "rp");
        hashMap.put("cache_control", "cc");
        hashMap.put("attribution", "at");
        hashMap.put("startup_update", "su");
        hashMap.put("ssl_pinning", "sp");
        hashMap.put("external_attribution", "exta");
    }

    public final String a(String str) {
        return this.f6077a.containsKey(str) ? (String) this.f6077a.get(str) : str;
    }
}
