package com.gamericefishpro.space.xh;

import com.gamericefishpro.space.ph.g0;
import com.gamericefishpro.space.ph.u;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = a.b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public List b(Throwable exception) {
        Object objInvoke;
        List listB;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = a.c;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listB = u.b((Throwable[]) objInvoke)) == null) ? g0.d : listB;
    }
}
