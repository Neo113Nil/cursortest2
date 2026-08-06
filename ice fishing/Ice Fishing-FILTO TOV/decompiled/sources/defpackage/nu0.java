package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nu0 {
    private volatile AtomicReferenceArray<Object> array;

    public nu0(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int GWasM1elztuh() {
        return this.array.length();
    }

    public final void X1lG3V04pd(int i, mh mhVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, mhVar);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, mhVar);
        this.array = atomicReferenceArray2;
    }

    public final Object Yi7zF1RB1(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }
}
