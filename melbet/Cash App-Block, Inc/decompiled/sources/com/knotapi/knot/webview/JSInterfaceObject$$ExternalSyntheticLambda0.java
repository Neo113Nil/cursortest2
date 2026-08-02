package com.knotapi.knot.webview;

/* loaded from: classes4.dex */
public final /* synthetic */ class JSInterfaceObject$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JSInterfaceObject f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ JSInterfaceObject$$ExternalSyntheticLambda0(JSInterfaceObject jSInterfaceObject, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = jSInterfaceObject;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$1;
        JSInterfaceObject jSInterfaceObject = this.f$0;
        switch (i) {
            case 0:
                jSInterfaceObject.lambda$onMerchantTracking$8(str);
                break;
            case 1:
                jSInterfaceObject.lambda$onElementMessage$10(str);
                break;
            case 2:
                jSInterfaceObject.lambda$onUpdateBackButtonBehavior$11(str);
                break;
            case 3:
                jSInterfaceObject.lambda$postStorageMessage$16(str);
                break;
            case 4:
                jSInterfaceObject.lambda$onCardSwitchLoggedIn$3(str);
                break;
            case 5:
                jSInterfaceObject.lambda$onCardSwitchError$1(str);
                break;
            case 6:
                jSInterfaceObject.lambda$onCardSwitchNativeError$2(str);
                break;
            default:
                jSInterfaceObject.lambda$onFullReverseLogin$7(str);
                break;
        }
    }
}
