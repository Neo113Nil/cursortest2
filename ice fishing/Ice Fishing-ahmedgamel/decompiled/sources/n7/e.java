package n7;

import a7.l;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m6.u;

/* loaded from: classes2.dex */
public final class e implements u {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f39676d = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f39677a = new l(f39676d);

    /* renamed from: b, reason: collision with root package name */
    public final k7.b f39678b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f39679c;

    public e(k7.b bVar, ArrayList arrayList) {
        this.f39678b = bVar;
        this.f39679c = arrayList;
    }

    @Override // m6.u
    public final void a() {
        this.f39677a.a(Level.FINE, Wv.i(new StringBuilder("Measurement recorded for instrument "), this.f39678b.f38621b, " outside callback registered to instrument. Dropping measurement."), null);
    }
}
