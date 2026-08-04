package com.gamericefishpro.space.o9;

import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final b a;
    public static final com.gamericefishpro.space.t8.c b;

    static {
        com.gamericefishpro.space.t8.b bVar = new com.gamericefishpro.space.t8.b();
        b bVar2 = new b(0);
        a = bVar2;
        new Scope(1, "profile");
        new Scope(1, "email");
        b = new com.gamericefishpro.space.t8.c("SignIn.API", bVar2, bVar);
    }
}
