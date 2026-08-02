package com.appsflyer;

import com.appsflyer.internal.AFg1gSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFg1gSDK[] b;

    public /* synthetic */ a(AFg1gSDK[] aFg1gSDKArr, int i) {
        this.a = i;
        this.b = aFg1gSDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AFLogger.getMonetizationNetwork(this.b);
                break;
            default:
                AFLogger.getCurrencyIso4217Code(this.b);
                break;
        }
    }
}
