package io.appmetrica.analytics.push.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1051l extends C1039i {
    public final String b;

    public C1051l(String str) {
        super(8);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.push.impl.C1039i
    public final JSONObject a() {
        return super.a().put("category", this.b);
    }
}
