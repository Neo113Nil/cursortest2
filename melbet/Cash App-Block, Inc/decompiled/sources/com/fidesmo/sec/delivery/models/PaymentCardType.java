package com.fidesmo.sec.delivery.models;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\"\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J@\u0010\u0012\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR'\u0010\u0002\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/fidesmo/sec/delivery/models/PaymentCardType;", "", "ranges", "", "Lkotlin/Pair;", "", "minLength", "maxLength", "([Lkotlin/Pair;II)V", "getMaxLength", "()I", "getMinLength", "getRanges", "()[Lkotlin/Pair;", "[Lkotlin/Pair;", "component1", "component2", "component3", "copy", "([Lkotlin/Pair;II)Lcom/fidesmo/sec/delivery/models/PaymentCardType;", "equals", "", "other", "hashCode", "toString", "", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentCardType {
    private final int maxLength;
    private final int minLength;
    private final Pair<Integer, Integer>[] ranges;

    public PaymentCardType(Pair<Integer, Integer>[] pairArr, int i, int i2) {
        pairArr.getClass();
        this.ranges = pairArr;
        this.minLength = i;
        this.maxLength = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentCardType copy$default(PaymentCardType paymentCardType, Pair[] pairArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            pairArr = paymentCardType.ranges;
        }
        if ((i3 & 2) != 0) {
            i = paymentCardType.minLength;
        }
        if ((i3 & 4) != 0) {
            i2 = paymentCardType.maxLength;
        }
        return paymentCardType.copy(pairArr, i, i2);
    }

    public final Pair<Integer, Integer>[] component1() {
        return this.ranges;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinLength() {
        return this.minLength;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMaxLength() {
        return this.maxLength;
    }

    public final PaymentCardType copy(Pair<Integer, Integer>[] ranges, int minLength, int maxLength) {
        ranges.getClass();
        return new PaymentCardType(ranges, minLength, maxLength);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentCardType)) {
            return false;
        }
        PaymentCardType paymentCardType = (PaymentCardType) other;
        return Intrinsics.areEqual(this.ranges, paymentCardType.ranges) && this.minLength == paymentCardType.minLength && this.maxLength == paymentCardType.maxLength;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    public final Pair<Integer, Integer>[] getRanges() {
        return this.ranges;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxLength) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minLength, Arrays.hashCode(this.ranges) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentCardType(ranges=");
        sb.append(Arrays.toString(this.ranges));
        sb.append(", minLength=");
        sb.append(this.minLength);
        sb.append(", maxLength=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.maxLength, ')');
    }
}
