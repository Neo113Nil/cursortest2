package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o extends av {

    /* renamed from: a, reason: collision with root package name */
    public int f14818a;

    /* renamed from: b, reason: collision with root package name */
    public bu f14819b;

    /* renamed from: c, reason: collision with root package name */
    public long f14820c;

    @Override // com.anythink.core.common.h.av
    public final JSONObject a() {
        JSONObject O8 = this.f14819b.O(this.f14818a);
        if (O8 != null) {
            try {
                O8.put("sdk_time", this.f14820c);
                return O8;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        return O8;
    }
}
