package T3;

import b4.InterfaceC0524a;
import b4.InterfaceC0525b;
import com.anythink.core.common.n.b.A;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class l implements InterfaceC0525b, InterfaceC0524a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3195a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f3196b;

    /* renamed from: c, reason: collision with root package name */
    public final U3.j f3197c;

    public l() {
        U3.j jVar = U3.j.f3325n;
        this.f3195a = new HashMap();
        this.f3196b = new ArrayDeque();
        this.f3197c = jVar;
    }

    public final void a(A a9) {
        U3.j jVar = this.f3197c;
        synchronized (this) {
            try {
                jVar.getClass();
                if (!this.f3195a.containsKey(Q3.b.class)) {
                    this.f3195a.put(Q3.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f3195a.get(Q3.b.class)).put(a9, jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
