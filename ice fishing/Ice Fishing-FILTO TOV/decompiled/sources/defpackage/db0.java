package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class db0 {
    public static final ps0 GWasM1elztuh;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if ((r1 instanceof defpackage.ps0) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        r1 = (defpackage.ps0) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = null;
     */
    static {
        Object su0Var;
        try {
            ClassLoader classLoader = yw0.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof jl) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Throwable th) {
            su0Var = new su0(th);
        }
        ps0 ps0Var = (ps0) (su0Var instanceof su0 ? null : su0Var);
        if (ps0Var == null) {
            ps0Var = new v51(new sb9fmtV8A(22));
        }
        GWasM1elztuh = ps0Var;
    }
}
