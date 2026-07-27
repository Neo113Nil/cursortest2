package u8;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final s f41318a = new s(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f41319b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f41320c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f41319b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f41320c = atomicReferenceArr;
    }

    public static final void a(s segment) {
        kotlin.jvm.internal.h.e(segment, "segment");
        if (segment.f41316f != null || segment.f41317g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f41314d) {
            return;
        }
        AtomicReference atomicReference = f41320c[(int) (Thread.currentThread().getId() & (f41319b - 1))];
        s sVar = f41318a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return;
        }
        int i = sVar2 != null ? sVar2.f41313c : 0;
        if (i >= 65536) {
            atomicReference.set(sVar2);
            return;
        }
        segment.f41316f = sVar2;
        segment.f41312b = 0;
        segment.f41313c = i + 8192;
        atomicReference.set(segment);
    }

    public static final s b() {
        AtomicReference atomicReference = f41320c[(int) (Thread.currentThread().getId() & (f41319b - 1))];
        s sVar = f41318a;
        s sVar2 = (s) atomicReference.getAndSet(sVar);
        if (sVar2 == sVar) {
            return new s();
        }
        if (sVar2 == null) {
            atomicReference.set(null);
            return new s();
        }
        atomicReference.set(sVar2.f41316f);
        sVar2.f41316f = null;
        sVar2.f41313c = 0;
        return sVar2;
    }
}
