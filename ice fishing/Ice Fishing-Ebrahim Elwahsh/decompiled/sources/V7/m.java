package V7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3368b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3369c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3370d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3371e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f3372a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3369c;
        if (atomicIntegerFieldUpdater.get(this) - f3370d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f3357u.f1421u == 1) {
            f3371e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & com.anythink.expressad.video.module.a.a.f21886R;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f3372a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3370d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f3369c.get(this) == 0) {
                return null;
            }
            int i4 = i & com.anythink.expressad.video.module.a.a.f21886R;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (iVar = (i) this.f3372a.getAndSet(i4, null)) != null) {
                if (iVar.f3357u.f1421u == 1) {
                    f3371e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i, boolean z8) {
        int i4 = i & com.anythink.expressad.video.module.a.a.f21886R;
        AtomicReferenceArray atomicReferenceArray = this.f3372a;
        i iVar = (i) atomicReferenceArray.get(i4);
        if (iVar != null) {
            if ((iVar.f3357u.f1421u == 1) == z8) {
                while (!atomicReferenceArray.compareAndSet(i4, iVar, null)) {
                    if (atomicReferenceArray.get(i4) != iVar) {
                    }
                }
                if (z8) {
                    f3371e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
