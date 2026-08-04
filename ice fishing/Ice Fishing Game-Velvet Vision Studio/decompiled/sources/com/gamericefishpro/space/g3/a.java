package com.gamericefishpro.space.g3;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ q e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(q qVar, int i) {
        super(1);
        this.d = i;
        this.e = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q qVar = this.e;
                qVar.show();
                return new com.gamericefishpro.space.e.c(1, qVar);
            default:
                q qVar2 = this.e;
                if (qVar2.y.a) {
                    qVar2.w.invoke();
                }
                return Unit.a;
        }
    }
}
