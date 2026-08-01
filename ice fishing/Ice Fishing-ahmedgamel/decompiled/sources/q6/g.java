package q6;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class g extends AbstractRunnableC4931d {

    /* renamed from: v, reason: collision with root package name */
    public static final L7.b f40253v = new L7.b(14);

    /* renamed from: u, reason: collision with root package name */
    public final boolean f40254u;

    static {
        new AtomicLong();
    }

    public g(boolean z3, ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
        this.f40254u = z3;
    }

    @Override // q6.AbstractRunnableC4931d
    public e c(Object obj) {
        e eVar = this.f40254u ? (e) f40253v.get() : new e();
        eVar.f40251a = obj;
        eVar.f40252b = System.identityHashCode(obj);
        return eVar;
    }

    @Override // q6.AbstractRunnableC4931d
    public void e(Object obj) {
        e eVar = (e) obj;
        eVar.f40251a = null;
        eVar.f40252b = 0;
    }
}
