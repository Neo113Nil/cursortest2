package g7;

import com.google.android.gms.internal.ads.Wv;
import java.util.logging.Level;
import java.util.logging.Logger;
import p6.C4840a;

/* loaded from: classes2.dex */
public class q extends a implements m6.l {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f37707w = Logger.getLogger(q.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final a7.l f37708u;

    /* renamed from: v, reason: collision with root package name */
    public final s f37709v;

    public q(k7.b bVar, s sVar) {
        super(bVar);
        this.f37708u = new a7.l(f37707w);
        this.f37709v = sVar;
    }

    @Override // m6.l
    public final void b(long j6, f6.c cVar) {
        C4840a a9 = C4840a.a();
        if (j6 >= 0) {
            this.f37709v.b(j6, cVar, a9);
            return;
        }
        this.f37708u.a(Level.WARNING, Wv.i(new StringBuilder("Counters can only increase. Instrument "), this.f37684n.f38621b, " has recorded a negative value."), null);
    }
}
