package n7;

import a7.l;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import m6.u;
import u1.h;

/* loaded from: classes2.dex */
public final class e implements u {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f39509d = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final l f39510a = new l(f39509d);

    /* renamed from: b, reason: collision with root package name */
    public final k7.b f39511b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f39512c;

    public e(k7.b bVar, ArrayList arrayList) {
        this.f39511b = bVar;
        this.f39512c = arrayList;
    }

    @Override // m6.u
    public final void a() {
        this.f39510a.a(Level.FINE, h.g(new StringBuilder("Measurement recorded for instrument "), this.f39511b.f38694b, " outside callback registered to instrument. Dropping measurement."), null);
    }
}
