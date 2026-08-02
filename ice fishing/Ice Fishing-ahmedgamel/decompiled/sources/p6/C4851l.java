package p6;

import java.util.logging.Level;

/* renamed from: p6.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4851l implements InterfaceC4845f {

    /* renamed from: n, reason: collision with root package name */
    public final C4840a f39839n;

    /* renamed from: u, reason: collision with root package name */
    public final C4840a f39840u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39841v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EnumC4852m f39842w;

    public C4851l(EnumC4852m enumC4852m, C4840a c4840a, C4840a c4840a2) {
        this.f39842w = enumC4852m;
        this.f39839n = c4840a;
        this.f39840u = c4840a2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f39841v || this.f39842w.j() != this.f39840u) {
            EnumC4852m.f39844u.log(Level.FINE, " Trying to close scope which does not represent current context. Ignoring the call.");
        } else {
            this.f39841v = true;
            EnumC4852m.f39845v.set(this.f39839n);
        }
    }
}
