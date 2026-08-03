package f4;

import ac.k;
import e.b;
import e4.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import m0.u1;
import m0.x2;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f2312a;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof m0.u1) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (m0.u1) r1;
     */
    static {
        Object s10;
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            j.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            j.d(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (annotations[i10] instanceof ac.a) {
                    break;
                } else {
                    i10++;
                }
            }
            s10 = null;
        } catch (Throwable th) {
            s10 = v6.a.s(th);
        }
        u1 u1Var = (u1) (s10 instanceof k ? null : s10);
        if (u1Var == null) {
            u1Var = new x2(new b(3));
        }
        f2312a = u1Var;
    }
}
