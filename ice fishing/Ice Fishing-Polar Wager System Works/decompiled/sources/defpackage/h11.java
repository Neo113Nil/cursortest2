package defpackage;

/* loaded from: classes.dex */
public final class h11 {
    private volatile java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> array;

    public h11(int i) {
        this.array = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
    }

    public final int IHQe1A4L2xu() {
        return this.array.length();
    }

    public final java.lang.Object oh6vYeIP(int i) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    public final void r1MBDhnF(int i, defpackage.rj rjVar) {
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, rjVar);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new java.util.concurrent.atomic.AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, rjVar);
        this.array = atomicReferenceArray2;
    }
}
