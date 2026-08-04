package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    public static final m0 a;
    public static final m0 b;

    static {
        q0 q0Var = q0.c;
        m0 m0Var = null;
        try {
            m0Var = (m0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = m0Var;
        b = new m0();
    }
}
