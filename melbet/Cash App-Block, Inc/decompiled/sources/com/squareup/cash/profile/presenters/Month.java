package com.squareup.cash.profile.presenters;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Month implements Comparable {
    public final Integer month;

    public Month(Integer num) {
        this.month = num;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Month month = (Month) obj;
        month.getClass();
        Integer num = month.month;
        Integer num2 = this.month;
        if (num2 == null) {
            return 1;
        }
        if (num == null) {
            return -1;
        }
        return num2.intValue() - num.intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Month) && Intrinsics.areEqual(this.month, ((Month) obj).month);
    }

    public final int hashCode() {
        Integer num = this.month;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Month(month=" + this.month + ")";
    }
}
