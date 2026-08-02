package q6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class g extends AbstractRunnableC4880d {

    /* renamed from: v, reason: collision with root package name */
    public static final L7.b f40064v = new L7.b(14);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f40065u;

    static {
        new AtomicLong();
    }

    public g(boolean z6, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f40065u = z6;
    }

    @Override // q6.AbstractRunnableC4880d
    public e c(Object obj) {
        e eVar = this.f40065u ? (e) f40064v.get() : new e();
        eVar.f40062a = obj;
        eVar.f40063b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // q6.AbstractRunnableC4880d
    public void e(Object obj) {
        e eVar = (e) obj;
        eVar.f40062a = null;
        eVar.f40063b = 0;
    }
}
