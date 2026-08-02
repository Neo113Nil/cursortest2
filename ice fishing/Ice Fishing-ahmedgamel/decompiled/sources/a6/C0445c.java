package a6;

import kotlin.jvm.internal.h;
import org.json.JSONObject;

/* renamed from: a6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0445c {
    private final String externalId;
    private final String onesignalId;

    public C0445c(String onesignalId, String externalId) {
        h.e(onesignalId, "onesignalId");
        h.e(externalId, "externalId");
        this.onesignalId = onesignalId;
        this.externalId = externalId;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getOnesignalId() {
        return this.onesignalId;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("onesignalId", this.onesignalId).put("externalId", this.externalId);
        h.d(put, "put(...)");
        return put;
    }
}
