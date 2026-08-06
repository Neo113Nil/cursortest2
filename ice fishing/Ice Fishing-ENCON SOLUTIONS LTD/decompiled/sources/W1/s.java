package W1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f1905a = new r(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1906b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f1907c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1906b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f1907c = atomicReferenceArr;
    }

    public static final void a(r segment) {
        kotlin.jvm.internal.i.e(segment, "segment");
        if (segment.f1903f != null || segment.f1904g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f1901d) {
            return;
        }
        AtomicReference atomicReference = f1907c[(int) (Thread.currentThread().getId() & (f1906b - 1))];
        r rVar = f1905a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return;
        }
        int i2 = rVar2 != null ? rVar2.f1900c : 0;
        if (i2 >= 65536) {
            atomicReference.set(rVar2);
            return;
        }
        segment.f1903f = rVar2;
        segment.f1899b = 0;
        segment.f1900c = i2 + 8192;
        atomicReference.set(segment);
    }

    public static final r b() {
        AtomicReference atomicReference = f1907c[(int) (Thread.currentThread().getId() & (f1906b - 1))];
        r rVar = f1905a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set(null);
            return new r();
        }
        atomicReference.set(rVar2.f1903f);
        rVar2.f1903f = null;
        rVar2.f1900c = 0;
        return rVar2;
    }
}
