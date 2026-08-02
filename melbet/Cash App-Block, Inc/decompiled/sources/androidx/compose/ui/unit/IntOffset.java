package androidx.compose.ui.unit;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class IntOffset {
    public final long packedValue;

    public /* synthetic */ IntOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: copy-iSbpLlY$default, reason: not valid java name */
    public static long m1046copyiSbpLlY$default(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & BodyPartID.bodyIdMax);
        }
        return (i2 & BodyPartID.bodyIdMax) | (i << 32);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1047equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: minus-qkQi6aY, reason: not valid java name */
    public static final long m1048minusqkQi6aY(long j, long j2) {
        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) << 32) | ((((int) (j & BodyPartID.bodyIdMax)) - ((int) (j2 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
    }

    /* renamed from: plus-qkQi6aY, reason: not valid java name */
    public static final long m1049plusqkQi6aY(long j, long j2) {
        return ((((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | ((((int) (j & BodyPartID.bodyIdMax)) + ((int) (j2 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1050toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, (int) (j & BodyPartID.bodyIdMax), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IntOffset) {
            return this.packedValue == ((IntOffset) obj).packedValue;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m1050toStringimpl(this.packedValue);
    }
}
