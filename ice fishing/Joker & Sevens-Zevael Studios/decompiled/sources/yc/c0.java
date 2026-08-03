package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f8836a;

    static {
        String str;
        f0 f0Var;
        int i10 = dd.x.f1888a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            fd.e eVar = i0.f8859a;
            zc.d dVar = dd.o.f1880a;
            zc.d dVar2 = dVar.f9182l;
            f0Var = dVar;
            if (dVar == null) {
                f0Var = b0.f8832p;
            }
        } else {
            f0Var = b0.f8832p;
        }
        f8836a = f0Var;
    }
}
