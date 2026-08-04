package com.gamericefishpro.space.a2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.h2.c2;
import com.gamericefishpro.space.m1.u;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ a0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(a0 a0Var, int i) {
        super(1);
        this.d = i;
        this.e = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.h2.i iVar = (c2) obj;
                if (((com.gamericefishpro.space.h1.l) iVar).d.G) {
                    this.e.d = iVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                this.e.d = (u) obj;
                return Boolean.TRUE;
        }
    }
}
