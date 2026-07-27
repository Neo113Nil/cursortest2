package l;

import a.AbstractC0069a;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194e extends AbstractC0069a {
    @Override // a.AbstractC0069a
    public final boolean c(AbstractFutureC0196g abstractFutureC0196g, C0192c c0192c) {
        C0192c c0192c2 = C0192c.f2677b;
        synchronized (abstractFutureC0196g) {
            try {
                if (abstractFutureC0196g.f2692b != c0192c) {
                    return false;
                }
                abstractFutureC0196g.f2692b = c0192c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0069a
    public final boolean d(AbstractFutureC0196g abstractFutureC0196g, Object obj, Object obj2) {
        synchronized (abstractFutureC0196g) {
            try {
                if (abstractFutureC0196g.f2691a != obj) {
                    return false;
                }
                abstractFutureC0196g.f2691a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0069a
    public final boolean e(AbstractFutureC0196g abstractFutureC0196g, C0195f c0195f, C0195f c0195f2) {
        synchronized (abstractFutureC0196g) {
            try {
                if (abstractFutureC0196g.f2693c != c0195f) {
                    return false;
                }
                abstractFutureC0196g.f2693c = c0195f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0069a
    public final void y(C0195f c0195f, C0195f c0195f2) {
        c0195f.f2686b = c0195f2;
    }

    @Override // a.AbstractC0069a
    public final void z(C0195f c0195f, Thread thread) {
        c0195f.f2685a = thread;
    }
}
