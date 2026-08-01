package K5;

import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class b {
    public static final a Companion = new a(null);
    public static final String INFLUENCE_CHANNEL = "influence_channel";
    public static final String INFLUENCE_IDS = "influence_ids";
    public static final String INFLUENCE_TYPE = "influence_type";
    private JSONArray ids;
    private c influenceChannel;
    private d influenceType;

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public b(String jsonString) {
        h.e(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString(INFLUENCE_CHANNEL);
        String string2 = jSONObject.getString(INFLUENCE_TYPE);
        String string3 = jSONObject.getString(INFLUENCE_IDS);
        this.influenceChannel = c.Companion.fromString(string);
        this.influenceType = d.Companion.fromString(string2);
        h.b(string3);
        this.ids = string3.length() == 0 ? null : new JSONArray(string3);
    }

    public final b copy() {
        return new b(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class.equals(obj.getClass())) {
            b bVar = (b) obj;
            if (this.influenceChannel == bVar.influenceChannel && this.influenceType == bVar.influenceType) {
                return true;
            }
        }
        return false;
    }

    public final String getDirectId() {
        JSONArray jSONArray = this.ids;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        return jSONArray.getString(0);
    }

    public final JSONArray getIds() {
        return this.ids;
    }

    public final c getInfluenceChannel() {
        return this.influenceChannel;
    }

    public final d getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        return this.influenceType.hashCode() + (this.influenceChannel.hashCode() * 31);
    }

    public final void setIds(JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(d dVar) {
        h.e(dVar, "<set-?>");
        this.influenceType = dVar;
    }

    public final String toJSONString() {
        JSONObject put = new JSONObject().put(INFLUENCE_CHANNEL, this.influenceChannel.toString()).put(INFLUENCE_TYPE, this.influenceType.toString());
        JSONArray jSONArray = this.ids;
        String jSONObject = put.put(INFLUENCE_IDS, jSONArray != null ? String.valueOf(jSONArray) : "").toString();
        h.d(jSONObject, "toString(...)");
        return jSONObject;
    }

    public String toString() {
        return "SessionInfluence{influenceChannel=" + this.influenceChannel + ", influenceType=" + this.influenceType + ", ids=" + this.ids + '}';
    }

    public b(c influenceChannel, d influenceType, JSONArray jSONArray) {
        h.e(influenceChannel, "influenceChannel");
        h.e(influenceType, "influenceType");
        this.influenceChannel = influenceChannel;
        this.influenceType = influenceType;
        this.ids = jSONArray;
    }
}
