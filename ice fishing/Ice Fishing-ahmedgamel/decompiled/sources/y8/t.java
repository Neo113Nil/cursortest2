package y8;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final s f41965a = new s(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f41966b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f41967c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f41966b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f41967c = atomicReferenceArr;
    }

    public static final void a(s segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        if (segment.f41963f != null || segment.f41964g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f41961d) {
            return;
        }
        AtomicReference atomicReference = f41967c[(int) (Thread.currentThread().getId() & (f41966b - 1))];
        s sVar = f41965a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return;
        }
        int i = sVar2 != null ? sVar2.f41960c : 0;
        if (i >= 65536) {
            atomicReference.set(sVar2);
            return;
        }
        segment.f41963f = sVar2;
        segment.f41959b = 0;
        segment.f41960c = i + 8192;
        atomicReference.set(segment);
    }

    public static final s b() {
        AtomicReference atomicReference = f41967c[(int) (Thread.currentThread().getId() & (f41966b - 1))];
        s sVar = f41965a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return new s();
        }
        if (sVar2 == null) {
            atomicReference.set(null);
            return new s();
        }
        atomicReference.set(sVar2.f41963f);
        sVar2.f41963f = null;
        sVar2.f41960c = 0;
        return sVar2;
    }
}
