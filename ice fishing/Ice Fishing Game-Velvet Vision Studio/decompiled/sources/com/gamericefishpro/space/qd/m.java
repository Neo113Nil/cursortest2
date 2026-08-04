package com.gamericefishpro.space.qd;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private final a kind;
    private final b operatorType;
    private final String property;
    private final String triggerId;
    private final Object value;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public enum a {
        TIME_SINCE_LAST_IN_APP("min_time_since"),
        SESSION_TIME("session_time"),
        CUSTOM(com.gamericefishpro.space.mf.c.PAYLOAD_OS_ROOT_CUSTOM),
        UNKNOWN("unknown");

        private final String value;
        private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());
        public static final C0043a Companion = new C0043a(null);

        /* JADX INFO: renamed from: com.gamericefishpro.space.qd.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0043a {
            public /* synthetic */ C0043a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a fromString(String str) {
                for (a aVar : a.values()) {
                    if (kotlin.text.d.g(aVar.value, str, true)) {
                        return aVar;
                    }
                }
                return a.UNKNOWN;
            }

            private C0043a() {
            }
        }

        a(String str) {
            this.value = str;
        }

        public static com.gamericefishpro.space.wh.a getEntries() {
            return $ENTRIES;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
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

        private final String text;
        private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());
        public static final a Companion = new a(null);

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b fromString(String str) {
                for (b bVar : b.values()) {
                    if (kotlin.text.d.g(bVar.text, str, true)) {
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

        public static com.gamericefishpro.space.wh.a getEntries() {
            return $ENTRIES;
        }

        public final boolean checksEquality() {
            return this == EQUAL_TO || this == NOT_EQUAL_TO;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.text;
        }
    }

    public m(JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getString("id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.triggerId = string;
        this.kind = a.Companion.fromString(json.getString("kind"));
        this.property = json.optString("property", null);
        this.operatorType = b.Companion.fromString(json.getString("operator"));
        this.value = json.opt("value");
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
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "Trigger{triggerId='" + this.triggerId + "', kind=" + this.kind + ", property='" + this.property + "', operatorType=" + this.operatorType + ", value=" + this.value + '}';
    }
}
