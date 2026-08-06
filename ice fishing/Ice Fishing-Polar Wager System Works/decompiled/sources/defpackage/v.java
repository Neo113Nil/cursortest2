package defpackage;

/* loaded from: classes.dex */
public abstract class v {
    public static final java.lang.Class IHQe1A4L2xu;
    public static final boolean oh6vYeIP;

    static {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2 = null;
        try {
            cls = java.lang.Class.forName("libcore.io.Memory");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        IHQe1A4L2xu = cls;
        try {
            cls2 = java.lang.Class.forName("org.robolectric.Robolectric");
        } catch (java.lang.Throwable unused2) {
        }
        oh6vYeIP = cls2 != null;
    }

    public static boolean IHQe1A4L2xu() {
        return (IHQe1A4L2xu == null || oh6vYeIP) ? false : true;
    }
}
