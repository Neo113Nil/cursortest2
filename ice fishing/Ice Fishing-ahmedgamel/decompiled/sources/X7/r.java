package X7;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class r {
    private volatile AtomicReferenceArray<Object> array;

    public r(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void c(int i, Z7.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, aVar);
            return;
        }
        int i4 = i + 1;
        int i6 = length * 2;
        if (i4 < i6) {
            i4 = i6;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i4);
        for (int i9 = 0; i9 < length; i9++) {
            atomicReferenceArray2.set(i9, atomicReferenceArray.get(i9));
        }
        atomicReferenceArray2.set(i, aVar);
        this.array = atomicReferenceArray2;
    }
}
