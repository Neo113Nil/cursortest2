package g7;

import java.util.logging.Level;
import java.util.logging.Logger;
import p6.C4840a;

/* loaded from: classes2.dex */
public class p extends a implements m6.j {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f37679w = Logger.getLogger(p.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final a7.l f37680u;

    /* renamed from: v, reason: collision with root package name */
    public final s f37681v;

    public p(k7.b bVar, s sVar) {
        super(bVar);
        this.f37680u = new a7.l(f37679w);
        this.f37681v = sVar;
    }

    @Override // m6.j
    public final void f(double d2, f6.c cVar) {
        C4840a a9 = C4840a.a();
        if (d2 >= 0.0d) {
            this.f37681v.a(d2, cVar, a9);
            return;
        }
        this.f37680u.a(Level.WARNING, u1.h.g(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.f37659n.f38694b, " has recorded a negative value."), null);
    }
}
