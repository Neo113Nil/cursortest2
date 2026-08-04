package com.gamericefishpro.space.ei;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class b0 {
    public static final c0 a;

    static {
        c0 c0Var = null;
        try {
            c0Var = (c0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c0Var == null) {
            c0Var = new c0();
        }
        a = c0Var;
    }

    public static g a(Class cls) {
        a.getClass();
        return new g(cls);
    }
}
