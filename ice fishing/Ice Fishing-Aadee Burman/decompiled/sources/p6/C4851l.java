package p6;

import java.util.logging.Level;

/* renamed from: p6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4851l implements InterfaceC4845f {

    /* renamed from: n, reason: collision with root package name */
    public final C4840a f39789n;

    /* renamed from: u, reason: collision with root package name */
    public final C4840a f39790u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39791v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EnumC4852m f39792w;

    public C4851l(EnumC4852m enumC4852m, C4840a c4840a, C4840a c4840a2) {
        this.f39792w = enumC4852m;
        this.f39789n = c4840a;
        this.f39790u = c4840a2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f39791v || this.f39792w.j() != this.f39790u) {
            EnumC4852m.f39794u.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f39791v = true;
            EnumC4852m.f39795v.set(this.f39789n);
        }
    }
}
