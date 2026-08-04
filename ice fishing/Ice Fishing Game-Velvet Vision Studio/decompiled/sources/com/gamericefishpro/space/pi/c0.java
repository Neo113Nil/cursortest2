package com.gamericefishpro.space.pi;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final f0 a;

    static {
        String property;
        com.gamericefishpro.space.qi.d dVar;
        f0 f0Var;
        int i = com.gamericefishpro.space.ui.s.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            com.gamericefishpro.space.wi.e eVar = k0.a;
            dVar = com.gamericefishpro.space.ui.m.a;
            com.gamericefishpro.space.qi.d dVar2 = dVar.y;
            if (dVar == null) {
                f0Var = dVar;
                f0Var = b0.C;
            }
        } else {
            f0Var = b0.C;
        }
        f0Var = dVar;
        a = f0Var;
    }
}
