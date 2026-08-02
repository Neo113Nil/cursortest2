package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class a44 {
    public final LinkedHashMap a;
    public final LinkedHashMap b;

    public a44(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.a = linkedHashMap;
        this.b = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a44)) {
            return false;
        }
        a44 a44Var = (a44) obj;
        return this.a.equals(a44Var.a) && this.b.equals(a44Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CarouselOrderState(pins=" + this.a + ", actions=" + this.b + ")";
    }
}
