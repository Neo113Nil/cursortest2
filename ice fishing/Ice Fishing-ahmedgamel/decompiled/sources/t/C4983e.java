package t;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4983e extends com.bumptech.glide.f {
    @Override // com.bumptech.glide.f
    public final boolean c(AbstractC4985g abstractC4985g, C4981c c4981c, C4981c c4981c2) {
        synchronized (abstractC4985g) {
            try {
                if (abstractC4985g.f40524u != c4981c) {
                    return false;
                }
                abstractC4985g.f40524u = c4981c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final boolean d(AbstractC4985g abstractC4985g, Object obj, Object obj2) {
        synchronized (abstractC4985g) {
            try {
                if (abstractC4985g.f40523n != obj) {
                    return false;
                }
                abstractC4985g.f40523n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final boolean e(AbstractC4985g abstractC4985g, C4984f c4984f, C4984f c4984f2) {
        synchronized (abstractC4985g) {
            try {
                if (abstractC4985g.f40525v != c4984f) {
                    return false;
                }
                abstractC4985g.f40525v = c4984f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.f
    public final void u(C4984f c4984f, C4984f c4984f2) {
        c4984f.f40518b = c4984f2;
    }

    @Override // com.bumptech.glide.f
    public final void v(C4984f c4984f, Thread thread) {
        c4984f.f40517a = thread;
    }
}
