package N1;

import J1.x;
import J1.y;
import J1.z;
import Q1.C0078a;
import Q1.E;
import Q1.EnumC0079b;
import W1.q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1167a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1168b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1169c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1170d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1171e;

    public e(String str, String str2, String str3, String str4, boolean z2) {
        this.f1168b = str == null ? "libapp.so" : str;
        this.f1169c = str2 == null ? "flutter_assets" : str2;
        this.f1171e = str4;
        this.f1170d = str3 == null ? "" : str3;
        this.f1167a = z2;
    }

    public IOException a(boolean z2, boolean z3, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        i call = (i) this.f1168b;
        if (z3) {
            if (iOException != null) {
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        if (z2) {
            if (iOException != null) {
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        return call.f(this, z3, z2, iOException);
    }

    public z b(y yVar) {
        O1.e eVar = (O1.e) this.f1170d;
        try {
            y.a(yVar, "Content-Type");
            long c2 = eVar.c(yVar);
            return new z(c2, new q(new d(this, eVar.b(yVar), c2)), 1);
        } catch (IOException e2) {
            i call = (i) this.f1168b;
            kotlin.jvm.internal.i.e(call, "call");
            d(e2);
            throw e2;
        }
    }

    public x c(boolean z2) {
        try {
            x g2 = ((O1.e) this.f1170d).g(z2);
            if (g2 != null) {
                g2.f999m = this;
            }
            return g2;
        } catch (IOException e2) {
            i call = (i) this.f1168b;
            kotlin.jvm.internal.i.e(call, "call");
            d(e2);
            throw e2;
        }
    }

    public void d(IOException iOException) {
        this.f1167a = true;
        ((f) this.f1169c).c(iOException);
        k h2 = ((O1.e) this.f1170d).h();
        i call = (i) this.f1168b;
        synchronized (h2) {
            try {
                kotlin.jvm.internal.i.e(call, "call");
                if (!(iOException instanceof E)) {
                    if (!(h2.f1204g != null) || (iOException instanceof C0078a)) {
                        h2.f1207j = true;
                        if (h2.f1210m == 0) {
                            k.d(call.f1183a, h2.f1199b, iOException);
                            h2.f1209l++;
                        }
                    }
                } else if (((E) iOException).f1563a == EnumC0079b.REFUSED_STREAM) {
                    int i2 = h2.f1211n + 1;
                    h2.f1211n = i2;
                    if (i2 > 1) {
                        h2.f1207j = true;
                        h2.f1209l++;
                    }
                } else if (((E) iOException).f1563a != EnumC0079b.CANCEL || !call.f1195m) {
                    h2.f1207j = true;
                    h2.f1209l++;
                }
            } finally {
            }
        }
    }

    public e(i call, f finder, O1.e eVar) {
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(finder, "finder");
        this.f1168b = call;
        this.f1169c = finder;
        this.f1170d = eVar;
        this.f1171e = eVar.h();
    }
}
