package T0;

import i1.C4586c;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3153e = J0.r.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final C4586c f3154a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3155b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3156c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3157d = new Object();

    public u(C4586c c4586c) {
        this.f3154a = c4586c;
    }

    public final void a(S0.j jVar) {
        synchronized (this.f3157d) {
            try {
                if (((t) this.f3155b.remove(jVar)) != null) {
                    J0.r.d().a(f3153e, "Stopping timer for " + jVar);
                    this.f3156c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
