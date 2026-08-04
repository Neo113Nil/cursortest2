package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final l a = new l();
    public static final l b;

    static {
        q0 q0Var = q0.c;
        l lVar = null;
        try {
            lVar = (l) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = lVar;
    }
}
