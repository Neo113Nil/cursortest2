package com.nimbusds.jose.shaded.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class JsonArray extends JsonElement implements Iterable {
    public final ArrayList elements = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).elements.equals(this.elements);
        }
        return true;
    }

    public final int hashCode() {
        return this.elements.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.elements.iterator();
    }
}
