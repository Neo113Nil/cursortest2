package com.gamericefishpro.space.g3;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.ei.l implements Function0 {
    public static final f e;
    public static final f i;
    public static final f v;
    public final /* synthetic */ int d;

    static {
        int i2 = 0;
        e = new f(i2, 0);
        i = new f(i2, 1);
        v = new f(i2, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            default:
                return "DEFAULT_TEST_TAG";
        }
    }
}
