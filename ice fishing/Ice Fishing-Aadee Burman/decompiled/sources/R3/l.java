package R3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l implements Z3.b, Z3.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2740a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f2741b;

    /* renamed from: c, reason: collision with root package name */
    public final S3.k f2742c;

    public l() {
        S3.k kVar = S3.k.f2886n;
        this.f2740a = new HashMap();
        this.f2741b = new ArrayDeque();
        this.f2742c = kVar;
    }

    public final void a(d4.f fVar) {
        S3.k kVar = this.f2742c;
        synchronized (this) {
            try {
                kVar.getClass();
                if (!this.f2740a.containsKey(O3.b.class)) {
                    this.f2740a.put(O3.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f2740a.get(O3.b.class)).put(fVar, kVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
