package g7;

import java.util.logging.Level;
import java.util.logging.Logger;
import p6.C4840a;

/* loaded from: classes2.dex */
public class q extends a implements m6.l {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f37682w = Logger.getLogger(q.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final a7.l f37683u;

    /* renamed from: v, reason: collision with root package name */
    public final s f37684v;

    public q(k7.b bVar, s sVar) {
        super(bVar);
        this.f37683u = new a7.l(f37682w);
        this.f37684v = sVar;
    }

    @Override // m6.l
    public final void b(long j6, f6.c cVar) {
        C4840a a9 = C4840a.a();
        if (j6 >= 0) {
            this.f37684v.b(j6, cVar, a9);
            return;
        }
        this.f37683u.a(Level.WARNING, u1.h.g(new StringBuilder("Counters can only increase. Instrument "), this.f37659n.f38694b, " has recorded a negative value."), null);
    }
}
