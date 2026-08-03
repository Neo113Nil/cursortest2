package l7;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements t7.b, t7.a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4239a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f4240b;

    /* renamed from: c, reason: collision with root package name */
    public final m7.l f4241c;

    public l() {
        m7.l lVar = m7.l.f4967g;
        this.f4239a = new HashMap();
        this.f4240b = new ArrayDeque();
        this.f4241c = lVar;
    }

    public final void a(d6.f fVar) {
        m7.l lVar = this.f4241c;
        synchronized (this) {
            try {
                lVar.getClass();
                if (!this.f4239a.containsKey(i7.b.class)) {
                    this.f4239a.put(i7.b.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f4239a.get(i7.b.class)).put(fVar, lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
