package com.gamericefishpro.space.h2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.m1.m {
    public static final c a = new c();
    public static Boolean b;

    @Override // com.gamericefishpro.space.m1.m
    public final boolean b() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw com.gamericefishpro.space.m5.a.e("canFocus is read before it is written");
    }

    @Override // com.gamericefishpro.space.m1.m
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }
}
