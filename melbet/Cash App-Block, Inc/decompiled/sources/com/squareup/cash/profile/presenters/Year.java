package com.squareup.cash.profile.presenters;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class Year implements Comparable {
    public final Integer year;

    public Year(Integer num) {
        this.year = num;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Year year = (Year) obj;
        year.getClass();
        Integer num = year.year;
        Integer num2 = this.year;
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
        return (obj instanceof Year) && Intrinsics.areEqual(this.year, ((Year) obj).year);
    }

    public final int hashCode() {
        Integer num = this.year;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Year(year=" + this.year + ")";
    }
}
