package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m {
    private final a kind;
    private final b operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM(na.c.PAYLOAD_OS_ROOT_CUSTOM),
        UNKNOWN("unknown");

        public static final C0030a Companion = new C0030a(null);
        private final String value;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.inAppMessages.internal.m$a$a, reason: collision with other inner class name */
        public static final class C0030a {
            public /* synthetic */ C0030a(pc.f fVar) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (xc.h.o(aVar.value, str)) {
                        return aVar;
                    }
                }
                return a.UNKNOWN;
            }

            private C0030a() {
            }
        }

        a(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public enum b {
        GREATER_THAN("greater"),
        LESS_THAN("less"),
        EQUAL_TO("equal"),
        NOT_EQUAL_TO("not_equal"),
        LESS_THAN_OR_EQUAL_TO("less_or_equal"),
        GREATER_THAN_OR_EQUAL_TO("greater_or_equal"),
        EXISTS("exists"),
        NOT_EXISTS("not_exists"),
        CONTAINS("in");

        public static final a Companion = new a(null);
        private final String text;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a {
            public /* synthetic */ a(pc.f fVar) {
                this();
            }

            public final b fromString(String str) {
                for (b bVar : b.values()) {
                    if (xc.h.o(bVar.text, str)) {
                        return bVar;
                    }
                }
                return b.EQUAL_TO;
            }

            private a() {
            }
        }

        b(String str) {
            this.text = str;
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public m(JSONObject jSONObject) {
        pc.j.e(jSONObject, "json");
        String string = jSONObject.getString("id");
        pc.j.d(string, "json.getString(\"id\")");
        this.triggerId = string;
        this.kind = a.Companion.fromString(jSONObject.getString("kind"));
        this.property = jSONObject.optString("property", null);
        this.operatorType = b.Companion.fromString(jSONObject.getString("operator"));
        this.value = jSONObject.opt("value");
    }

    public final a getKind() {
        return this.kind;
    }

    public final b getOperatorType() {
        return this.operatorType;
    }

    public final String getProperty() {
        return this.property;
    }

    public final String getTriggerId() {
        return this.triggerId;
    }

    public final Object getValue() {
        return this.value;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.triggerId);
            jSONObject.put("kind", this.kind);
            jSONObject.put("property", this.property);
            jSONObject.put("operator", this.operatorType.toString());
            jSONObject.put("value", this.value);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + '}';
    }
}
