package defpackage;

/* loaded from: classes.dex */
public abstract class f30 {
    public static final /* synthetic */ int IHQe1A4L2xu = 0;
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object p11Var;
        try {
            p11Var = new defpackage.e30(IHQe1A4L2xu(android.os.Looper.getMainLooper()));
        } catch (java.lang.Throwable th) {
            p11Var = new defpackage.p11(th);
        }
        if (p11Var instanceof defpackage.p11) {
            p11Var = null;
        }
    }

    public static final android.os.Handler IHQe1A4L2xu(android.os.Looper looper) {
        if (android.os.Build.VERSION.SDK_INT < 28) {
            try {
                return (android.os.Handler) android.os.Handler.class.getDeclaredConstructor(android.os.Looper.class, android.os.Handler.Callback.class, java.lang.Boolean.TYPE).newInstance(looper, null, java.lang.Boolean.TRUE);
            } catch (java.lang.NoSuchMethodException unused) {
                return new android.os.Handler(looper);
            }
        }
        java.lang.Object invoke = android.os.Handler.class.getDeclaredMethod("createAsync", android.os.Looper.class).invoke(null, looper);
        invoke.getClass();
        return (android.os.Handler) invoke;
    }
}
