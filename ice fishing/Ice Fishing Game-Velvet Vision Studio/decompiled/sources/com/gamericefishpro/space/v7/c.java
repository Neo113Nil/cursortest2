package com.gamericefishpro.space.v7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f0.t;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.z4.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ i e;

    public /* synthetic */ c(i iVar, int i) {
        this.d = i;
        this.e = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                i iVar = this.e;
                a0.u(m0.h(iVar), null, new com.gamericefishpro.space.f7.i(iVar, zBooleanValue, null, 1), 3);
                break;
            default:
                this.e.e(new t(((Integer) obj).intValue(), 5));
                break;
        }
        return Unit.a;
    }
}
