package Z7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4224b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4225c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4226d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4227e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f4228a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4225c;
        if (atomicIntegerFieldUpdater.get(this) - f4226d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f4213u.f1974u == 1) {
            f4227e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & com.anythink.expressad.video.module.a.a.f21728R;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f4228a;
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
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4226d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f4225c.get(this) == 0) {
                return null;
            }
            int i6 = i & com.anythink.expressad.video.module.a.a.f21728R;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (iVar = (i) this.f4228a.getAndSet(i6, null)) != null) {
                if (iVar.f4213u.f1974u == 1) {
                    f4227e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i, boolean z3) {
        int i6 = i & com.anythink.expressad.video.module.a.a.f21728R;
        AtomicReferenceArray atomicReferenceArray = this.f4228a;
        i iVar = (i) atomicReferenceArray.get(i6);
        if (iVar != null) {
            if ((iVar.f4213u.f1974u == 1) == z3) {
                while (!atomicReferenceArray.compareAndSet(i6, iVar, null)) {
                    if (atomicReferenceArray.get(i6) != iVar) {
                    }
                }
                if (z3) {
                    f4227e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
