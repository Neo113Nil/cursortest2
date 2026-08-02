package com.knotapi.knot.services;

import com.knotapi.knot.webview.JSInterfaceObject;

/* loaded from: classes4.dex */
public final /* synthetic */ class SentryClient$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ SentryClient$$ExternalSyntheticLambda0(String str, String str2, String str3, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SentryClient.lambda$sendLog$0(this.f$0, this.f$1, this.f$2);
                break;
            default:
                JSInterfaceObject.lambda$storeBreadcrumb$14(this.f$0, this.f$1, this.f$2);
                break;
        }
    }
}
