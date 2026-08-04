package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    public static final g0 a;
    public static final g0 b;

    static {
        q0 q0Var = q0.c;
        g0 g0Var = null;
        try {
            g0Var = (g0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = g0Var;
        b = new g0();
    }
}
