package qb;

import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f {
    private final g current;
    private final g previous;

    public f(g gVar, g gVar2) {
        j.e(gVar, "previous");
        j.e(gVar2, "current");
        this.previous = gVar;
        this.current = gVar2;
    }

    public final g getCurrent() {
        return this.current;
    }

    public final g getPrevious() {
        return this.previous;
    }

    public final JSONObject toJSONObject() {
        JSONObject put = new JSONObject().put("previous", this.previous.toJSONObject()).put("current", this.current.toJSONObject());
        j.d(put, "JSONObject()\n           …, current.toJSONObject())");
        return put;
    }
}
