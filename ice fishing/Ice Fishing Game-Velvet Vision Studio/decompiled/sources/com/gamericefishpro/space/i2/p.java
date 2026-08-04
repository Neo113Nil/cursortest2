package com.gamericefishpro.space.i2;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends com.gamericefishpro.space.ei.l implements Function1 {
    public static final p e;
    public static final p i;
    public static final p v;
    public static final p w;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new p(i2, 0);
        i = new p(i2, 1);
        v = new p(i2, 2);
        w = new p(i2, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.TRUE;
            case 1:
                com.gamericefishpro.space.o2.l lVarK = ((com.gamericefishpro.space.o2.o) obj).k();
                return Boolean.valueOf(lVarK.d.c(com.gamericefishpro.space.o2.s.z));
            case 2:
                com.gamericefishpro.space.t0.l1 l1Var = (com.gamericefishpro.space.t0.l1) obj;
                com.gamericefishpro.space.t0.a0 a0Var = j0.a;
                l1Var.getClass();
                com.gamericefishpro.space.t0.i.w(l1Var, a0Var);
                return ((Context) com.gamericefishpro.space.t0.i.w(l1Var, j0.b)).getResources();
            default:
                return Boolean.valueOf(f0.e(obj));
        }
    }
}
