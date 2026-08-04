package com.gamericefishpro.space.h0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ u0 e;

    public /* synthetic */ r0(u0 u0Var, int i) {
        this.d = i;
        this.e = u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z zVar = (z) this.e.H.invoke();
                int iA = zVar.a();
                int i = 0;
                while (i < iA) {
                    if (zVar.b(i).equals(obj)) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                i = -1;
                return Integer.valueOf(i);
            default:
                int iIntValue = ((Integer) obj).intValue();
                u0 u0Var = this.e;
                z zVar2 = (z) u0Var.H.invoke();
                if (iIntValue < 0 || iIntValue >= zVar2.a()) {
                    StringBuilder sbK = com.gamericefishpro.space.m5.a.k(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbK.append(zVar2.a());
                    sbK.append(')');
                    com.gamericefishpro.space.c0.a.a(sbK.toString());
                }
                com.gamericefishpro.space.pi.a0.u(u0Var.o0(), null, new t0(u0Var, iIntValue, null), 3);
                return Boolean.TRUE;
        }
    }
}
