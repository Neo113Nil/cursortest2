package com.squareup.cash.multiplatform.investing;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PriceValue implements Comparable {
    public final long value;

    public /* synthetic */ PriceValue(long j) {
        this.value = j;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PriceValue m3662boximpl(long j) {
        return new PriceValue(j);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3663equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3664toStringimpl(long j) {
        return Boxes$$ExternalSyntheticOutline1.m(j, "PriceValue(value=", ")");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.value, ((PriceValue) obj).value);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PriceValue) {
            return this.value == ((PriceValue) obj).value;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.value);
    }

    public final String toString() {
        return m3664toStringimpl(this.value);
    }
}
