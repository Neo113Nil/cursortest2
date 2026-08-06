package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class li0 {
    public static final defpackage.t21 ZpBGe2uQfcn8;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if ((r1 instanceof defpackage.t21) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r1 = (defpackage.t21) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = null;
     */
    static {
        java.lang.Object g51Var;
        try {
            java.lang.ClassLoader classLoader = defpackage.b81.class.getClassLoader();
            classLoader.getClass();
            java.lang.reflect.Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            java.lang.annotation.Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof defpackage.mp) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (java.lang.Throwable th) {
            g51Var = new defpackage.g51(th);
        }
        defpackage.t21 t21Var = (defpackage.t21) (g51Var instanceof defpackage.g51 ? null : g51Var);
        if (t21Var == null) {
            t21Var = new defpackage.ng1(new defpackage.ji0(1));
        }
        ZpBGe2uQfcn8 = t21Var;
    }
}
