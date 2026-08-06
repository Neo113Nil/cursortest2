package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class n1 extends defpackage.s0TASMVLSWD5 implements defpackage.mm {
    private volatile java.lang.Object _preHandler;

    public n1() {
        super(defpackage.jVUAPb5NnIYW.blKFvluuDQOf);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    @Override // defpackage.mm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WmetiUbpKU9I(defpackage.jm jmVar, java.lang.Throwable th) {
        java.lang.reflect.Method method;
        int i = android.os.Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        java.lang.Object obj = this._preHandler;
        if (obj != this) {
            method = (java.lang.reflect.Method) obj;
        } else {
            try {
                method = java.lang.Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (java.lang.reflect.Modifier.isPublic(method.getModifiers())) {
                }
            } catch (java.lang.Throwable unused) {
            }
            method = null;
            this._preHandler = method;
        }
        java.lang.Object invoke = method != null ? method.invoke(null, null) : null;
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof java.lang.Thread.UncaughtExceptionHandler ? (java.lang.Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(java.lang.Thread.currentThread(), th);
        }
    }
}
