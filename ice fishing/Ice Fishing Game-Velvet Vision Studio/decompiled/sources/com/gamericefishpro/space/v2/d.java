package com.gamericefishpro.space.v2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends l implements Function1 {
    public static final d e;
    public static final d i;
    public final /* synthetic */ int d;

    static {
        int i2 = 1;
        e = new d(i2, 0);
        i = new d(i2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Unit.a;
            default:
                throw null;
        }
    }
}
