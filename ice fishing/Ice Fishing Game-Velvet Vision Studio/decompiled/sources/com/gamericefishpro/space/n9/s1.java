package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ s1(y1 y1Var, Object obj, int i) {
        this.d = i;
        this.i = obj;
        this.e = y1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y1 y1Var = (y1) this.e;
                y1Var.d.B();
                m mVar = y1Var.d.i;
                m4.T(mVar);
                return mVar.m0((String) this.i);
            case 1:
                y1 y1Var2 = (y1) this.e;
                y1Var2.d.B();
                return new i(y1Var2.d.o0(((t4) this.i).d));
            default:
                t4 t4Var = (t4) this.i;
                String str = t4Var.d;
                com.gamericefishpro.space.v8.c0.g(str);
                m4 m4Var = (m4) this.e;
                e2 e2VarB = m4Var.b(str);
                d2 d2Var = d2.ANALYTICS_STORAGE;
                if (e2VarB.i(d2Var) && e2.c(100, t4Var.L).i(d2Var)) {
                    return m4Var.b0(t4Var).E();
                }
                m4Var.a().G.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public s1(m4 m4Var, t4 t4Var) {
        this.d = 2;
        this.i = t4Var;
        Objects.requireNonNull(m4Var);
        this.e = m4Var;
    }
}
