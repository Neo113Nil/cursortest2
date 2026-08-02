package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AFj1zSDK b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ p(AFj1zSDK aFj1zSDK, Runnable runnable, int i) {
        this.a = i;
        this.b = aFj1zSDK;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.AFAdRevenueData(this.c);
                break;
            case 1:
                this.b.getCurrencyIso4217Code(this.c);
                break;
            case 2:
                this.b.getRevenue(this.c);
                break;
            default:
                this.b.component2(this.c);
                break;
        }
    }
}
