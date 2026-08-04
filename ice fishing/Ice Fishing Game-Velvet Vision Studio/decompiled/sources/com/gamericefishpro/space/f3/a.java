package com.gamericefishpro.space.f3;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ a(int i, Function0 function0) {
        this.d = i;
        this.e = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.invoke();
                break;
            case 1:
                this.e.invoke();
                break;
            case 2:
                this.e.invoke();
                break;
            default:
                this.e.invoke();
                break;
        }
    }
}
