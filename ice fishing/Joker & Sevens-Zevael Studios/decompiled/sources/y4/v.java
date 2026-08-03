package y4;

import java.util.HashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final String f8782e = o4.o.f("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final m7.g f8783a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8784b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8785c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f8786d = new Object();

    public v(m7.g gVar) {
        this.f8783a = gVar;
    }

    public final void a(x4.j jVar) {
        synchronized (this.f8786d) {
            try {
                if (((u) this.f8784b.remove(jVar)) != null) {
                    o4.o.d().a(f8782e, "Stopping timer for " + jVar);
                    this.f8785c.remove(jVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
