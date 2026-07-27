package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o extends av {

    /* renamed from: a, reason: collision with root package name */
    public int f14032a;

    /* renamed from: b, reason: collision with root package name */
    public bu f14033b;

    /* renamed from: c, reason: collision with root package name */
    public long f14034c;

    @Override // com.anythink.core.common.h.av
    public final JSONObject a() {
        JSONObject O8 = this.f14033b.O(this.f14032a);
        if (O8 != null) {
            try {
                O8.put("sdk_time", this.f14034c);
                return O8;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return O8;
    }
}
