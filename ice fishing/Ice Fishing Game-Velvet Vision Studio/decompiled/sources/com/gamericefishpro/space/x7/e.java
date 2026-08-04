package com.gamericefishpro.space.x7;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h2.h0;
import com.gamericefishpro.space.i2.b1;
import com.gamericefishpro.space.i2.j0;
import com.gamericefishpro.space.t0.i;
import com.gamericefishpro.space.t0.l1;
import com.gamericefishpro.space.t0.t2;
import com.gamericefishpro.space.y.c1;
import com.gamericefishpro.space.y.m;
import com.gamericefishpro.space.y.n;
import com.gamericefishpro.space.y.w0;
import com.gamericefishpro.space.y.x0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ e(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.a;
            case 1:
                ((h0) obj).a();
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                l1 l1Var = (l1) obj;
                int i = n.a;
                t2 t2Var = j0.b;
                l1Var.getClass();
                Context context = (Context) i.w(l1Var, t2Var);
                com.gamericefishpro.space.c3.c cVar = (com.gamericefishpro.space.c3.c) i.w(l1Var, b1.h);
                w0 w0Var = (w0) i.w(l1Var, x0.a);
                if (w0Var == null) {
                    return null;
                }
                return new m(context, cVar, w0Var.a, w0Var.b);
            case 4:
                return new c1(((Integer) obj).intValue());
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                l1 l1Var2 = (l1) obj;
                t2 t2Var2 = j0.b;
                l1Var2.getClass();
                if (((Context) i.w(l1Var2, t2Var2)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return com.gamericefishpro.space.z.e.b;
                }
                com.gamericefishpro.space.z.c.a.getClass();
                return com.gamericefishpro.space.z.b.c;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Long) obj).longValue();
                return Unit.a;
            default:
                return Boolean.valueOf(!false);
        }
    }
}
