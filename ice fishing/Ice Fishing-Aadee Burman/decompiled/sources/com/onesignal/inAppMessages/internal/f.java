package com.onesignal.inAppMessages.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f {
    public static final a Companion = new a(null);
    private static final String OUTCOME_NAME = "name";
    private static final String OUTCOME_UNIQUE = "unique";
    private static final String OUTCOME_WEIGHT = "weight";
    private boolean isUnique;
    private String name;
    private float weight;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public f(JSONObject json) {
        kotlin.jvm.internal.h.e(json, "json");
        String string = json.getString("name");
        kotlin.jvm.internal.h.d(string, "getString(...)");
        this.name = string;
        this.weight = json.has(OUTCOME_WEIGHT) ? (float) json.getDouble(OUTCOME_WEIGHT) : 0.0f;
        this.isUnique = json.has(OUTCOME_UNIQUE) && json.getBoolean(OUTCOME_UNIQUE);
    }

    public final String getName() {
        return this.name;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnique() {
        return this.isUnique;
    }

    public final void setName(String str) {
        kotlin.jvm.internal.h.e(str, "<set-?>");
        this.name = str;
    }

    public final void setUnique(boolean z3) {
        this.isUnique = z3;
    }

    public final void setWeight(float f3) {
        this.weight = f3;
    }

    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.name);
            jSONObject.put(OUTCOME_WEIGHT, this.weight);
            jSONObject.put(OUTCOME_UNIQUE, this.isUnique);
            return jSONObject;
        } catch (JSONException e9) {
            e9.printStackTrace();
            return jSONObject;
        }
    }

    public String toString() {
        return "OSInAppMessageOutcome{name='" + this.name + "', weight=" + this.weight + ", unique=" + this.isUnique + '}';
    }
}
