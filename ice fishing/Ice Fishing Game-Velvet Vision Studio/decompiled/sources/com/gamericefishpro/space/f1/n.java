package com.gamericefishpro.space.f1;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 i;

    public /* synthetic */ n(Function1 function1, Function1 function2, int i) {
        this.d = i;
        this.e = function1;
        this.i = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.invoke(obj);
                this.i.invoke(obj);
                break;
            default:
                this.e.invoke(obj);
                this.i.invoke(obj);
                break;
        }
        return Unit.a;
    }
}
