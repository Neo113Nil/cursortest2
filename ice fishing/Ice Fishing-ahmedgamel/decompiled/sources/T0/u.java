package T0;

import g1.C4523c;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3070e = J0.s.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final C4523c f3071a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3072b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3073c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3074d = new Object();

    public u(C4523c c4523c) {
        this.f3071a = c4523c;
    }

    public final void a(S0.j jVar) {
        synchronized (this.f3074d) {
            try {
                if (((t) this.f3072b.remove(jVar)) != null) {
                    J0.s.d().a(f3070e, "Stopping timer for " + jVar);
                    this.f3073c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
