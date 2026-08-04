package com.gamericefishpro.space.u1;

import android.graphics.PathMeasure;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.gamericefishpro.space.ei.l implements Function0 {
    public static final g e;
    public static final g i;
    public final /* synthetic */ int d;

    static {
        int i2 = 0;
        e = new g(i2, 0);
        i = new g(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new com.gamericefishpro.space.o1.i(new PathMeasure());
            default:
                return Unit.a;
        }
    }
}
