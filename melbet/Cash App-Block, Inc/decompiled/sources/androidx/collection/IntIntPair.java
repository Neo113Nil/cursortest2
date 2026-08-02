package androidx.collection;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class IntIntPair {
    public final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m128constructorimpl(int i, int i2) {
        return (i2 & BodyPartID.bodyIdMax) | (i << 32);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntIntPair) {
            return this.packedValue == ((IntIntPair) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.packedValue;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, (int) (j & BodyPartID.bodyIdMax), ')');
    }
}
