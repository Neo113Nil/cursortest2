package com.instagram.common.viewpoint.core;

import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class O8 {
    public final long A00;
    public final C1271Tx A01;
    public final String A02;
    public final JSONObject A03;

    public O8(JSONObject jSONObject, C1271Tx c1271Tx, String str, long j9) {
        this.A03 = jSONObject;
        this.A01 = c1271Tx;
        this.A02 = str;
        this.A00 = j9;
    }

    public final long A00() {
        return this.A00;
    }

    public final C1271Tx A01() {
        return this.A01;
    }

    public final String A02() {
        return this.A02;
    }

    public final JSONObject A03() {
        return this.A03;
    }
}
