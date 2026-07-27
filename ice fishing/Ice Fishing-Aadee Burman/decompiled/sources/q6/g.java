package q6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class g extends AbstractRunnableC4931d {

    /* renamed from: v, reason: collision with root package name */
    public static final L7.b f40250v = new L7.b(14);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f40251u;

    static {
        new AtomicLong();
    }

    public g(boolean z3, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f40251u = z3;
    }

    @Override // q6.AbstractRunnableC4931d
    public e c(Object obj) {
        e eVar = this.f40251u ? (e) f40250v.get() : new e();
        eVar.f40248a = obj;
        eVar.f40249b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // q6.AbstractRunnableC4931d
    public void e(Object obj) {
        e eVar = (e) obj;
        eVar.f40248a = null;
        eVar.f40249b = 0;
    }
}
