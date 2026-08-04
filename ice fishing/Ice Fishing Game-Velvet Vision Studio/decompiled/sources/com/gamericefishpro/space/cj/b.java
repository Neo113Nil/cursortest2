package com.gamericefishpro.space.cj;

import com.gamericefishpro.space.a5.h;
import com.gamericefishpro.space.t0.a0;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t0.r0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final a0 a;

    static {
        new r0(new h(3));
        a = new a0(new h(4));
    }

    public static final com.gamericefishpro.space.pj.a a(r rVar) {
        com.gamericefishpro.space.pj.a aVar;
        a0 a0Var = a;
        rVar.a0(1668867238);
        try {
            a aVar2 = (a) rVar.j(a0Var);
            if (aVar2.b == null) {
                aVar2.b = aVar2.a.invoke();
            }
            Object obj = aVar2.b;
            if (obj == null) {
                throw new IllegalStateException("Can't retrieve value for ");
            }
            aVar = (com.gamericefishpro.space.pj.a) obj;
            rVar.p(false);
            return aVar;
        } catch (Exception e) {
            a aVar3 = (a) rVar.j(a0Var);
            Object objInvoke = aVar3.a.invoke();
            aVar3.b = objInvoke;
            com.gamericefishpro.space.pj.a aVar4 = (com.gamericefishpro.space.pj.a) objInvoke;
            if (aVar4 == null) {
                throw new IllegalStateException(("Can't get Koin scope due to error: " + e).toString());
            }
            aVar = aVar4;
        }
    }
}
