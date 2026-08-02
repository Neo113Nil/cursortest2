package app.cash.local.backend;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class CartBuilderSeed {
    public final ArrayList discountCodes;
    public final ArrayList entries;

    public CartBuilderSeed(ArrayList arrayList, ArrayList arrayList2) {
        this.entries = arrayList;
        this.discountCodes = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartBuilderSeed)) {
            return false;
        }
        CartBuilderSeed cartBuilderSeed = (CartBuilderSeed) obj;
        return this.entries.equals(cartBuilderSeed.entries) && this.discountCodes.equals(cartBuilderSeed.discountCodes);
    }

    public final int hashCode() {
        return this.discountCodes.hashCode() + (this.entries.hashCode() * 31);
    }

    public final String toString() {
        return "CartBuilderSeed(entries=" + this.entries + ", discountCodes=" + this.discountCodes + ")";
    }
}
