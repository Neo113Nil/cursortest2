package S7;

/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final C f2994a;

    static {
        String str;
        C c9;
        int i = X7.v.f3817a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            Z7.e eVar = F.f2998a;
            T7.e eVar2 = X7.o.f3811a;
            T7.e eVar3 = eVar2.f3217x;
            c9 = eVar2;
            if (eVar2 == null) {
                c9 = RunnableC0411z.f3099C;
            }
        } else {
            c9 = RunnableC0411z.f3099C;
        }
        f2994a = c9;
    }
}
