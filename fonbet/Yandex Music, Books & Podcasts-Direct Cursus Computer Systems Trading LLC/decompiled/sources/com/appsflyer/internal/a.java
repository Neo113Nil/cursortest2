package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AFa1zSDK.getCurrencyIso4217Code((AFc1fSDK) this.b);
                break;
            default:
                ((AFd1qSDK) this.b).getCurrencyIso4217Code();
                break;
        }
    }
}
