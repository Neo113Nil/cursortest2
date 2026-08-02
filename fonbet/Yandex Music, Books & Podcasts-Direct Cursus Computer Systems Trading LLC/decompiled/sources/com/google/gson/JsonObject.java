package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* loaded from: classes3.dex */
public final class JsonObject extends JsonElement {
    public final LinkedTreeMap a = new LinkedTreeMap(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void r(String str, JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.a;
        }
        this.a.put(str, jsonElement);
    }

    public final void s(Number number, String str) {
        r(str, new JsonPrimitive(number));
    }

    public final void t(String str, Boolean bool) {
        r(str, new JsonPrimitive(bool));
    }

    public final void u(String str, String str2) {
        r(str, str2 == null ? JsonNull.a : new JsonPrimitive(str2));
    }

    public final JsonElement v(String str) {
        return (JsonElement) this.a.get(str);
    }

    public final JsonPrimitive w(String str) {
        return (JsonPrimitive) this.a.get(str);
    }
}
