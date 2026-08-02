package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class AFb1iSDK$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AFb1iSDK$$ExternalSyntheticLambda1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                AFb1iSDK.getMonetizationNetwork((AFb1iSDK) obj2, (AFh1qSDK) obj);
                break;
            case 1:
                ((AFj1nSDK) obj2).G_((SensorEvent) obj);
                break;
            case 2:
                AFj1rSDK.getRevenue((AFj1rSDK) obj2, (Context) obj);
                break;
            case 3:
                ((AFj1wSDK) obj2).getRevenue((Context) obj);
                break;
            default:
                AFj1ySDK.getMonetizationNetwork((AFj1ySDK) obj2, (Context) obj);
                break;
        }
    }
}
