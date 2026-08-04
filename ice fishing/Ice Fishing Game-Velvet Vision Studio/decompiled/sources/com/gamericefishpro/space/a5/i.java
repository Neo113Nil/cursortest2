package com.gamericefishpro.space.a5;

import com.gamericefishpro.space.oh.n;
import com.gamericefishpro.space.oh.o;
import com.gamericefishpro.space.oh.p;
import com.gamericefishpro.space.t0.o1;
import com.gamericefishpro.space.t0.t2;
import com.gamericefishpro.space.z4.u;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final o1 a;

    static {
        Object objQ;
        try {
            n nVar = p.d;
            ClassLoader classLoader = u.class.getClassLoader();
            Intrinsics.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof o1) {
                        objQ = (o1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof com.gamericefishpro.space.oh.a)) {
                    i++;
                }
                objQ = null;
                break;
            }
        } catch (Throwable th) {
            n nVar2 = p.d;
            objQ = com.gamericefishpro.space.wa.b.q(th);
        }
        n nVar3 = p.d;
        o1 t2Var = (o1) (objQ instanceof o ? null : objQ);
        if (t2Var == null) {
            t2Var = new t2(new h(0));
        }
        a = t2Var;
    }
}
