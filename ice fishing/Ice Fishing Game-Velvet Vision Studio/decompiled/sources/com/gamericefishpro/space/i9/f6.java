package com.gamericefishpro.space.i9;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f6 {
    public static final f6 c = new f6();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final v5 a = new v5(0);

    public final i6 a(Class cls) {
        i6 i6VarU;
        Charset charset = n5.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        i6 i6Var = (i6) concurrentHashMap.get(cls);
        if (i6Var != null) {
            return i6Var;
        }
        v5 v5Var = this.a;
        v5Var.getClass();
        e5 e5Var = j6.a;
        g5.class.isAssignableFrom(cls);
        h6 h6VarB = ((v5) v5Var.d).b(cls);
        if ((h6VarB.d & 2) == 2) {
            e5 e5Var2 = j6.a;
            e5 e5Var3 = a5.a;
            i6VarU = new c6(e5Var2, h6VarB.a);
        } else {
            int i = d6.a;
            int i2 = s5.a;
            e5 e5Var4 = j6.a;
            e5 e5Var5 = h6VarB.a() + (-1) != 1 ? a5.a : null;
            int i3 = y5.a;
            i6VarU = b6.u(h6VarB, e5Var4, e5Var5);
        }
        i6 i6Var2 = (i6) concurrentHashMap.putIfAbsent(cls, i6VarU);
        return i6Var2 != null ? i6Var2 : i6VarU;
    }
}
