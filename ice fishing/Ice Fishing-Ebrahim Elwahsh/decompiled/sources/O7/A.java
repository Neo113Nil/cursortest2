package O7;

/* loaded from: classes2.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final C f2547a;

    static {
        String str;
        C c4;
        int i = T7.w.f3171a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            V7.e eVar = F.f2551a;
            P7.e eVar2 = T7.o.f3162a;
            P7.e eVar3 = eVar2.f2693x;
            c4 = eVar2;
            if (eVar2 == null) {
                c4 = RunnableC0400z.f2652C;
            }
        } else {
            c4 = RunnableC0400z.f2652C;
        }
        f2547a = c4;
    }
}
