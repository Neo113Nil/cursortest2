package defpackage;

/* loaded from: classes.dex */
public abstract class cf0 {
    public static final defpackage.ly0 IHQe1A4L2xu;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if ((r1 instanceof defpackage.ly0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r1 = (defpackage.ly0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = null;
     */
    static {
        java.lang.Object p11Var;
        try {
            java.lang.ClassLoader classLoader = defpackage.i41.class.getClassLoader();
            classLoader.getClass();
            java.lang.reflect.Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            java.lang.annotation.Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof defpackage.vn) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (java.lang.Throwable th) {
            p11Var = new defpackage.p11(th);
        }
        defpackage.ly0 ly0Var = (defpackage.ly0) (p11Var instanceof defpackage.p11 ? null : p11Var);
        if (ly0Var == null) {
            ly0Var = new defpackage.nc1(new defpackage.g(22));
        }
        IHQe1A4L2xu = ly0Var;
    }
}
