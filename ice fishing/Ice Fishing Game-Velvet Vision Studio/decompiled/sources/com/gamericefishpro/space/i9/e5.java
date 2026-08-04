package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 implements z5 {
    public static final e5 e = new e5(0);
    public final /* synthetic */ int d;

    public /* synthetic */ e5(int i) {
        this.d = i;
    }

    public static final x5 c(Object obj, Object obj2) {
        x5 x5VarA = (x5) obj;
        x5 x5Var = (x5) obj2;
        if (!x5Var.isEmpty()) {
            if (!x5VarA.d) {
                x5VarA = x5VarA.a();
            }
            x5VarA.c();
            if (!x5Var.isEmpty()) {
                x5VarA.putAll(x5Var);
            }
        }
        return x5VarA;
    }

    @Override // com.gamericefishpro.space.i9.z5
    public boolean a(Class cls) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return g5.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.gamericefishpro.space.i9.z5
    public h6 b(Class cls) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (!g5.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (h6) g5.l(cls.asSubclass(g5.class)).o(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
