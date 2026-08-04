package com.gamericefishpro.space.c8;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static volatile k e;
    public final com.gamericefishpro.space.l8.a a;
    public final com.gamericefishpro.space.l8.a b;
    public final com.gamericefishpro.space.h8.c c;
    public final com.gamericefishpro.space.i8.h d;

    public r(com.gamericefishpro.space.l8.a aVar, com.gamericefishpro.space.l8.a aVar2, com.gamericefishpro.space.h8.c cVar, com.gamericefishpro.space.i8.h hVar, com.gamericefishpro.space.u6.n nVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = cVar;
        this.d = hVar;
        ((Executor) nVar.d).execute(new com.appsflyer.a(5, nVar));
    }

    public static r a() {
        k kVar = e;
        if (kVar != null) {
            return (r) kVar.y.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (r.class) {
                try {
                    if (e == null) {
                        com.gamericefishpro.space.b9.b bVar = new com.gamericefishpro.space.b9.b();
                        context.getClass();
                        bVar.a = context;
                        e = bVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q c(l lVar) {
        byte[] bytes;
        Set setUnmodifiableSet = lVar != null ? Collections.unmodifiableSet(com.gamericefishpro.space.a8.a.d) : Collections.singleton(new com.gamericefishpro.space.z7.c("proto"));
        com.gamericefishpro.space.a8.c cVarA = j.a();
        lVar.getClass();
        cVarA.v = "cct";
        com.gamericefishpro.space.a8.a aVar = (com.gamericefishpro.space.a8.a) lVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ("1$" + str + "\\" + str2).getBytes(Charset.forName("UTF-8"));
        }
        cVarA.e = bytes;
        return new q(setUnmodifiableSet, cVarA.e(), this);
    }
}
