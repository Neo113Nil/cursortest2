package androidx.compose.ui.text;

import coil3.size.SizeKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextRange {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long Zero = SizeKt.TextRange(0, 0);
    public final long packedValue;

    public /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m984contains5zctL8(long j, long j2) {
        return (m990getMinimpl(j) <= m990getMinimpl(j2)) & (m989getMaximpl(j2) <= m989getMaximpl(j));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m985equalsimpl(Object obj, long j) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).packedValue;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m986equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m987getCollapsedimpl(long j) {
        return ((int) (j >> 32)) == ((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m988getLengthimpl(long j) {
        return m989getMaximpl(j) - m990getMinimpl(j);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m989getMaximpl(long j) {
        return Math.max((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m990getMinimpl(long j) {
        return Math.min((int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m991getReversedimpl(long j) {
        return ((int) (j >> 32)) > ((int) (j & BodyPartID.bodyIdMax));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m992toStringimpl(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, (int) (j & BodyPartID.bodyIdMax), ')');
    }

    public final boolean equals(Object obj) {
        return m985equalsimpl(obj, this.packedValue);
    }

    public final int hashCode() {
        return Long.hashCode(this.packedValue);
    }

    public final String toString() {
        return m992toStringimpl(this.packedValue);
    }
}
