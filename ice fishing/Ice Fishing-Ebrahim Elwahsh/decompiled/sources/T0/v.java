package T0;

import g1.C4524d;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final String f3086e = J0.s.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final C4524d f3087a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3088b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f3089c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f3090d = new Object();

    public v(C4524d c4524d) {
        this.f3087a = c4524d;
    }

    public final void a(S0.j jVar) {
        synchronized (this.f3090d) {
            try {
                if (((u) this.f3088b.remove(jVar)) != null) {
                    J0.s.d().a(f3086e, "Stopping timer for " + jVar);
                    this.f3089c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
