package com.anythink.core.basead.adx.api;

import android.text.TextUtils;
import com.anythink.core.d.h;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ATAdxAdapterConfig {
    public static final int RULE_TYPE_GROUP = 1;
    public static final int RULE_TYPE_NORMAL = 2;
    boolean isDefault;
    h mAdapterStrategy;
    JSONObject mOriginJSONObject;

    private ATAdxAdapterConfig(h hVar, JSONObject jSONObject) {
        this.mAdapterStrategy = hVar;
        this.mOriginJSONObject = jSONObject;
    }

    public static ATAdxAdapterConfig parse(JSONObject jSONObject) {
        h a9 = h.a(jSONObject);
        return a9 != null ? new ATAdxAdapterConfig(a9, jSONObject) : new ATAdxAdapterConfig(true);
    }

    public int getCoolingTimes() {
        h.a b9;
        h hVar = this.mAdapterStrategy;
        if (hVar == null || (b9 = hVar.b()) == null) {
            return 5;
        }
        return b9.f17297c;
    }

    public int getGroupCount() {
        h.a b9;
        h hVar = this.mAdapterStrategy;
        if (hVar == null || (b9 = hVar.b()) == null) {
            return 3;
        }
        return b9.f17295a;
    }

    public JSONObject getOriginJSONObject() {
        return this.mOriginJSONObject;
    }

    public int getRuleType() {
        h hVar = this.mAdapterStrategy;
        if (hVar != null) {
            return hVar.a();
        }
        return 1;
    }

    public int getValuedTimes() {
        h.a b9;
        h hVar = this.mAdapterStrategy;
        if (hVar == null || (b9 = hVar.b()) == null) {
            return 3;
        }
        return b9.f17296b;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isExpired() {
        h hVar = this.mAdapterStrategy;
        if (hVar != null) {
            return hVar.c();
        }
        return true;
    }

    public String toString() {
        return "ATAdxAdapterConfig{isDefault=" + isDefault() + ", isExpired=" + isExpired() + ", getRuleType=" + getRuleType() + ", getGroupCount=" + getGroupCount() + ", getValuedTimes=" + getValuedTimes() + ", getCoolingTimes=" + getCoolingTimes() + ", getOriginJSONObject=" + this.mOriginJSONObject + '}';
    }

    private ATAdxAdapterConfig(boolean z3) {
        this.isDefault = z3;
    }

    public static ATAdxAdapterConfig parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return parse(new JSONObject(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
