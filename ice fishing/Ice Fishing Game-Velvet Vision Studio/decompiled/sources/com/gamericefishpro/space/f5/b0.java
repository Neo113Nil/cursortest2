package com.gamericefishpro.space.f5;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h0.g1;
import com.gamericefishpro.space.h2.b2;
import com.gamericefishpro.space.h2.c2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.ei.a0 e;

    public /* synthetic */ b0(com.gamericefishpro.space.ei.a0 a0Var, int i) {
        this.d = i;
        this.e = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String key = (String) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                Object obj2 = this.e.d;
                if (obj2 == null) {
                    z = true;
                } else {
                    Bundle source = (Bundle) obj2;
                    Intrinsics.checkNotNullParameter(source, "source");
                    if (com.gamericefishpro.space.u6.f.n(key, source)) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                c2 c2Var = (c2) obj;
                Intrinsics.c(c2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                com.gamericefishpro.space.h0.m0 m0Var = ((g1) c2Var).H;
                com.gamericefishpro.space.ei.a0 a0Var = this.e;
                List listG = (List) a0Var.d;
                if (listG != null) {
                    listG.add(m0Var);
                } else {
                    listG = com.gamericefishpro.space.ph.x.g(m0Var);
                }
                a0Var.d = listG;
                return b2.e;
        }
    }
}
