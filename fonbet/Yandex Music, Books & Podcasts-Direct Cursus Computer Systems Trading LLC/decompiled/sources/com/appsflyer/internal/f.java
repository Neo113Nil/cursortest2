package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AFb1jSDK.getMediationNetwork((AFb1jSDK) this.b, (AFh1vSDK) this.c);
                break;
            case 1:
                AFi1cSDK.getMonetizationNetwork((AFi1cSDK) this.b, (Context) this.c);
                break;
            case 2:
                ((AFi1dSDK) this.b).getMediationNetwork((Context) this.c);
                break;
            case 3:
                ((AFj1qSDK) this.b).E_((SensorEvent) this.c);
                break;
            default:
                AFj1xSDK.getMediationNetwork((AFj1xSDK) this.b, (Context) this.c);
                break;
        }
    }
}
