package com.gamericefishpro.space.f3;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends com.gamericefishpro.space.ei.l implements Function0 {
    public static final h e;
    public static final h i;
    public static final h v;
    public final /* synthetic */ int d;

    static {
        int i2 = 0;
        e = new h(i2, 0);
        i = new h(i2, 1);
        v = new h(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                break;
            case 1:
                break;
        }
        return Unit.a;
    }
}
