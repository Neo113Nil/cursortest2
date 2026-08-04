package com.gamericefishpro.space.l7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.o1.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ g(int i, boolean z) {
        this.d = i;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                h0 graphicsLayer = (h0) obj;
                Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.i(this.e ? -1.0f : 1.0f);
                return Unit.a;
            case 1:
                h0 graphicsLayer2 = (h0) obj;
                Intrinsics.checkNotNullParameter(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.i(this.e ? -1.0f : 1.0f);
                return Unit.a;
            default:
                return com.gamericefishpro.space.v7.g.a((com.gamericefishpro.space.v7.g) obj, 0, this.e, 1);
        }
    }
}
