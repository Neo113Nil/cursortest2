package j7;

import W6.l;
import i6.u;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class e implements u {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f38586d = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f38587a = new l(f38586d);

    /* renamed from: b, reason: collision with root package name */
    public final g7.b f38588b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f38589c;

    public e(g7.b bVar, ArrayList arrayList) {
        this.f38588b = bVar;
        this.f38589c = arrayList;
    }

    @Override // i6.u
    public final void a() {
        this.f38587a.a(Level.FINE, AbstractC5051n.g(new StringBuilder("Measurement recorded for instrument "), this.f38588b.f37940b, " outside callback registered to instrument. Dropping measurement."), null);
    }
}
