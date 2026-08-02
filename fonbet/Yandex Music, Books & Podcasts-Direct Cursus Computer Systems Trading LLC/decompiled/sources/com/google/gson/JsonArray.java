package com.google.gson;

import defpackage.k5r;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    public final ArrayList a;

    public JsonArray() {
        this.a = new ArrayList();
    }

    @Override // com.google.gson.JsonElement
    public final int a() {
        return u().a();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonElement> iterator() {
        return this.a.iterator();
    }

    @Override // com.google.gson.JsonElement
    public final long o() {
        return u().o();
    }

    @Override // com.google.gson.JsonElement
    public final String q() {
        return u().q();
    }

    public final void r(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.a;
        }
        this.a.add(jsonElement);
    }

    public final void s(String str) {
        this.a.add(str == null ? JsonNull.a : new JsonPrimitive(str));
    }

    public final JsonElement t(int i) {
        return (JsonElement) this.a.get(i);
    }

    public final JsonElement u() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return (JsonElement) arrayList.get(0);
        }
        xq0.q(k5r.i(size, "Array must have size 1, but has size "));
        return null;
    }

    public JsonArray(int i) {
        this.a = new ArrayList(i);
    }
}
