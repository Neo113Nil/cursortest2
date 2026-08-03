package pb;

import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {
    private final c current;

    public b(c cVar) {
        j.e(cVar, "current");
        this.current = cVar;
    }

    public final c getCurrent() {
        return this.current;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("current", this.current.toJSONObject());
        j.d(put, "JSONObject()\n           …, current.toJSONObject())");
        return put;
    }
}
