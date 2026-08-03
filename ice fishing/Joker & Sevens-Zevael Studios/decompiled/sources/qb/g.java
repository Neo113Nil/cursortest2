package qb;

import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: id, reason: collision with root package name */
    private final String f5819id;
    private final boolean optedIn;
    private final String token;

    public g(String str, String str2, boolean z10) {
        j.e(str, "id");
        j.e(str2, "token");
        this.f5819id = str;
        this.token = str2;
        this.optedIn = z10;
    }

    public final String getId() {
        return this.f5819id;
    }

    public final boolean getOptedIn() {
        return this.optedIn;
    }

    public final String getToken() {
        return this.token;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.f5819id).put("token", this.token).put("optedIn", this.optedIn);
        j.d(put, "JSONObject()\n           … .put(\"optedIn\", optedIn)");
        return put;
    }
}
