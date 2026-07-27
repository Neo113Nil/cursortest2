package y8;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final s f41991a = new s(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f41992b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f41993c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f41992b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f41993c = atomicReferenceArr;
    }

    public static final void a(s segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        if (segment.f41989f != null || segment.f41990g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f41987d) {
            return;
        }
        AtomicReference atomicReference = f41993c[(int) (Thread.currentThread().getId() & (f41992b - 1))];
        s sVar = f41991a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return;
        }
        int i = sVar2 != null ? sVar2.f41986c : 0;
        if (i >= 65536) {
            atomicReference.set(sVar2);
            return;
        }
        segment.f41989f = sVar2;
        segment.f41985b = 0;
        segment.f41986c = i + 8192;
        atomicReference.set(segment);
    }

    public static final s b() {
        AtomicReference atomicReference = f41993c[(int) (Thread.currentThread().getId() & (f41992b - 1))];
        s sVar = f41991a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return new s();
        }
        if (sVar2 == null) {
            atomicReference.set(null);
            return new s();
        }
        atomicReference.set(sVar2.f41989f);
        sVar2.f41989f = null;
        sVar2.f41986c = 0;
        return sVar2;
    }
}
