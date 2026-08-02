package P1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final f f2360a = new f(0);

    /* renamed from: b, reason: collision with root package name */
    public static final f f2361b = new f(1);

    public static void a(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
