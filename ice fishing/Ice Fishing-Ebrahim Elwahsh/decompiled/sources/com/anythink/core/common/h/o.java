package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o extends av {

    /* renamed from: a, reason: collision with root package name */
    public int f14189a;

    /* renamed from: b, reason: collision with root package name */
    public bu f14190b;

    /* renamed from: c, reason: collision with root package name */
    public long f14191c;

    @Override // com.anythink.core.common.h.av
    public final JSONObject a() {
        JSONObject O8 = this.f14190b.O(this.f14189a);
        if (O8 != null) {
            try {
                O8.put("sdk_time", this.f14191c);
                return O8;
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
        return O8;
    }
}
