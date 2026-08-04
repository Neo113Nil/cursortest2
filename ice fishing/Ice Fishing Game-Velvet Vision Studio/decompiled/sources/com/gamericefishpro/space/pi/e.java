package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.b).getClass().getSimpleName() + '@' + a0.m(this) + ']';
            default:
                return "DisposeOnCancel[" + ((m0) this.b) + ']';
        }
    }
}
