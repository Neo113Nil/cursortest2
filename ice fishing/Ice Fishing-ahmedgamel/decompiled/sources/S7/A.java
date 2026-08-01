package S7;

/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final C f2911a;

    static {
        String str;
        C c9;
        int i = X7.v.f3862a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            Z7.e eVar = F.f2915a;
            T7.e eVar2 = X7.o.f3856a;
            T7.e eVar3 = eVar2.f3100x;
            c9 = eVar2;
            if (eVar2 == null) {
                c9 = RunnableC0407z.f3016C;
            }
        } else {
            c9 = RunnableC0407z.f3016C;
        }
        f2911a = c9;
    }
}
