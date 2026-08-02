package io.appmetrica.analytics.push.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.push.impl.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1063p extends C1039i {
    public final String b;

    public C1063p(String str) {
        super(10);
        this.b = str;
    }

    @Override // io.appmetrica.analytics.push.impl.C1039i
    public final JSONObject a() {
        return super.a().put("new_push_id", this.b);
    }
}
