package com.gamericefishpro.space.b1;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m extends CancellationException {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(String str, int i) {
        super(str);
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                setStackTrace(n.a);
                break;
            case 1:
                setStackTrace(com.gamericefishpro.space.c0.b.a);
                break;
            default:
                setStackTrace(com.gamericefishpro.space.e2.b.a);
                break;
        }
        return this;
    }
}
