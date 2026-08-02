package Z7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4202b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4203c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4204d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4205e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f4206a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4203c;
        if (atomicIntegerFieldUpdater.get(this) - f4204d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f4191u.f2062u == 1) {
            f4205e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & com.anythink.expressad.video.module.a.a.f22515R;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f4206a;
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
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4204d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f4203c.get(this) == 0) {
                return null;
            }
            int i4 = i & com.anythink.expressad.video.module.a.a.f22515R;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (iVar = (i) this.f4206a.getAndSet(i4, null)) != null) {
                if (iVar.f4191u.f2062u == 1) {
                    f4205e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i, boolean z6) {
        int i4 = i & com.anythink.expressad.video.module.a.a.f22515R;
        AtomicReferenceArray atomicReferenceArray = this.f4206a;
        i iVar = (i) atomicReferenceArray.get(i4);
        if (iVar != null) {
            if ((iVar.f4191u.f2062u == 1) == z6) {
                while (!atomicReferenceArray.compareAndSet(i4, iVar, null)) {
                    if (atomicReferenceArray.get(i4) != iVar) {
                    }
                }
                if (z6) {
                    f4205e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
