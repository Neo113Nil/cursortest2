package pb;

import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    private final String externalId;
    private final String onesignalId;

    public c(String str, String str2) {
        j.e(str, "onesignalId");
        j.e(str2, "externalId");
        this.onesignalId = str;
        this.externalId = str2;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final String getOnesignalId() {
        return this.onesignalId;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("onesignalId", this.onesignalId).put("externalId", this.externalId);
        j.d(put, "JSONObject()\n           …\"externalId\", externalId)");
        return put;
    }
}
