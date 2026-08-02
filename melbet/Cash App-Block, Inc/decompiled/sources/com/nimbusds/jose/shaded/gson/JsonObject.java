package com.nimbusds.jose.shaded.gson;

import com.miteksystems.misnap.camera.a.b;
import com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap;

/* loaded from: classes5.dex */
public final class JsonObject extends JsonElement {
    public final LinkedTreeMap members;

    public JsonObject() {
        b.C0008b c0008b = LinkedTreeMap.NATURAL_ORDER;
        this.members = new LinkedTreeMap(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).members.equals(this.members);
        }
        return true;
    }

    public final int hashCode() {
        return this.members.hashCode();
    }
}
