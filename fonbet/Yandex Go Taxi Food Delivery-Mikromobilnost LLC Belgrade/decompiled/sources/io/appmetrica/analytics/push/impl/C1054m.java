package io.appmetrica.analytics.push.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1054m extends C1039i {
    public final String b;
    public final String c;

    public C1054m(String str, String str2) {
        super(7);
        this.b = str;
        this.c = str2;
    }

    @Override // io.appmetrica.analytics.push.impl.C1039i
    public final JSONObject a() {
        return super.a().put("category", this.b).put("details", this.c);
    }
}
