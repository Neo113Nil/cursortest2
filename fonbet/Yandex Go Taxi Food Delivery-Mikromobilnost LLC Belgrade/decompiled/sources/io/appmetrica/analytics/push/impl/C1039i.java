package io.appmetrica.analytics.push.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C1039i {
    public final int a;

    public C1039i(int i) {
        this.a = i;
    }

    public JSONObject a() {
        return new JSONObject().put("type", AbstractC1043j.a(this.a));
    }
}
