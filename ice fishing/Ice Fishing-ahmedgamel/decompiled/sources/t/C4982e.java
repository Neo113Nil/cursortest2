package t;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4982e extends com.bumptech.glide.f {
    @Override // com.bumptech.glide.f
    public final boolean c(AbstractC4984g abstractC4984g, C4980c c4980c, C4980c c4980c2) {
        synchronized (abstractC4984g) {
            try {
                if (abstractC4984g.f40577u != c4980c) {
                    return false;
                }
                abstractC4984g.f40577u = c4980c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final boolean d(AbstractC4984g abstractC4984g, Object obj, Object obj2) {
        synchronized (abstractC4984g) {
            try {
                if (abstractC4984g.f40576n != obj) {
                    return false;
                }
                abstractC4984g.f40576n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final boolean e(AbstractC4984g abstractC4984g, C4983f c4983f, C4983f c4983f2) {
        synchronized (abstractC4984g) {
            try {
                if (abstractC4984g.f40578v != c4983f) {
                    return false;
                }
                abstractC4984g.f40578v = c4983f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final void q(C4983f c4983f, C4983f c4983f2) {
        c4983f.f40571b = c4983f2;
    }

    @Override // com.bumptech.glide.f
    public final void r(C4983f c4983f, Thread thread) {
        c4983f.f40570a = thread;
    }
}
