package com.google.common.primitives;

import androidx.tracing.Trace;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray EMPTY = new ImmutableIntArray(new int[0]);

    /* renamed from: array, reason: collision with root package name */
    public final int[] f1000array;
    public final int end;

    public ImmutableIntArray(int[] iArr) {
        int length = iArr.length;
        this.f1000array = iArr;
        this.end = length;
    }

    public final boolean equals(Object obj) {
        ImmutableIntArray immutableIntArray;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableIntArray) && (i2 = this.end) == (i = (immutableIntArray = (ImmutableIntArray) obj).end)) {
            for (int i3 = 0; i3 < i2; i3++) {
                Trace.checkElementIndex(i3, i2);
                int i4 = this.f1000array[i3];
                Trace.checkElementIndex(i3, i);
                if (i4 == immutableIntArray.f1000array[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.end; i2++) {
            i = (i * 31) + Integer.hashCode(this.f1000array[i2]);
        }
        return i;
    }

    public final String toString() {
        int i = this.end;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f1000array;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
