package com.appsflyer.internal;

import com.appsflyer.internal.AFc1bSDK;
import defpackage.iu0;
import defpackage.tqj;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements AFc1bSDK.AFa1vSDK, AFf1sSDK, tqj {
    public final /* synthetic */ Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    @Override // com.appsflyer.internal.AFc1bSDK.AFa1vSDK
    public void onConfigurationChanged(boolean z) {
        ((AFa1zSDK) this.a).getMonetizationNetwork(z);
    }

    @Override // com.appsflyer.internal.AFf1sSDK
    public void onRemoteConfigUpdateFinished(AFf1qSDK aFf1qSDK) {
        ((AFa1zSDK) this.a).getMonetizationNetwork(aFf1qSDK);
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        AFb1bSDK.getCurrencyIso4217Code((AFb1bSDK) this.a, (iu0) obj);
    }
}
