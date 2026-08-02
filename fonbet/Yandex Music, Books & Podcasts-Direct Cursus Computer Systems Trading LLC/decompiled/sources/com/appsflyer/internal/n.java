package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFj1uSDK b;

    public /* synthetic */ n(AFj1uSDK aFj1uSDK, int i) {
        this.a = i;
        this.b = aFj1uSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.component3();
                break;
            case 1:
                this.b.component2();
                break;
            default:
                this.b.component1();
                break;
        }
    }
}
