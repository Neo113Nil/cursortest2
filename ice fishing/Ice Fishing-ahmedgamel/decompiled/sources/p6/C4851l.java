package p6;

import java.util.logging.Level;

/* renamed from: p6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4851l implements InterfaceC4845f {

    /* renamed from: n, reason: collision with root package name */
    public final C4840a f39792n;

    /* renamed from: u, reason: collision with root package name */
    public final C4840a f39793u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39794v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EnumC4852m f39795w;

    public C4851l(EnumC4852m enumC4852m, C4840a c4840a, C4840a c4840a2) {
        this.f39795w = enumC4852m;
        this.f39792n = c4840a;
        this.f39793u = c4840a2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f39794v || this.f39795w.j() != this.f39793u) {
            EnumC4852m.f39797u.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f39794v = true;
            EnumC4852m.f39798v.set(this.f39792n);
        }
    }
}
