package g7;

import com.google.android.gms.internal.ads.Wv;
import java.util.logging.Level;
import java.util.logging.Logger;
import p6.C4840a;

/* loaded from: classes2.dex */
public class p extends a implements m6.j {

    /* renamed from: w, reason: collision with root package name */
    public static final Logger f37704w = Logger.getLogger(p.class.getName());

    /* renamed from: u, reason: collision with root package name */
    public final a7.l f37705u;

    /* renamed from: v, reason: collision with root package name */
    public final s f37706v;

    public p(k7.b bVar, s sVar) {
        super(bVar);
        this.f37705u = new a7.l(f37704w);
        this.f37706v = sVar;
    }

    @Override // m6.j
    public final void f(double d9, f6.c cVar) {
        C4840a a9 = C4840a.a();
        if (d9 >= 0.0d) {
            this.f37706v.a(d9, cVar, a9);
            return;
        }
        this.f37705u.a(Level.WARNING, Wv.i(new StringBuilder("Histograms can only record non-negative values. Instrument "), this.f37684n.f38621b, " has recorded a negative value."), null);
    }
}
