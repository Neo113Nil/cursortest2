package g7;

import p6.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final o f2537a = new o();

    public final void a(Object obj) {
        this.f2537a.l(obj);
    }

    public final boolean b(Exception exc) {
        o oVar = this.f2537a;
        oVar.getClass();
        u.h(exc, "Exception must not be null");
        synchronized (oVar.f2552a) {
            try {
                if (oVar.f2554c) {
                    return false;
                }
                oVar.f2554c = true;
                oVar.f2557f = exc;
                oVar.f2553b.c(oVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        o oVar = this.f2537a;
        synchronized (oVar.f2552a) {
            try {
                if (oVar.f2554c) {
                    return;
                }
                oVar.f2554c = true;
                oVar.f2556e = obj;
                oVar.f2553b.c(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
