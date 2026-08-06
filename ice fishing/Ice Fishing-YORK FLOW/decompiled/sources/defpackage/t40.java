package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class t40 {
    public static final /* synthetic */ int ZpBGe2uQfcn8 = 0;
    private static volatile android.view.Choreographer choreographer;

    static {
        java.lang.Object g51Var;
        try {
            g51Var = new defpackage.s40(ZpBGe2uQfcn8(android.os.Looper.getMainLooper()));
        } catch (java.lang.Throwable th) {
            g51Var = new defpackage.g51(th);
        }
        if (g51Var instanceof defpackage.g51) {
            g51Var = null;
        }
    }

    public static final android.os.Handler ZpBGe2uQfcn8(android.os.Looper looper) {
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
