package b6;

import kotlin.jvm.internal.h;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class g {
    private final String id;
    private final boolean optedIn;
    private final String token;

    public g(String id, String token, boolean z3) {
        h.e(id, "id");
        h.e(token, "token");
        this.id = id;
        this.token = token;
        this.optedIn = z3;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getOptedIn() {
        return this.optedIn;
    }

    public final String getToken() {
        return this.token;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("id", this.id).put("token", this.token).put("optedIn", this.optedIn);
        h.d(put, "put(...)");
        return put;
    }
}
