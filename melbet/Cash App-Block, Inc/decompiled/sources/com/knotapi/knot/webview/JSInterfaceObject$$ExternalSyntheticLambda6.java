package com.knotapi.knot.webview;

/* loaded from: classes4.dex */
public final /* synthetic */ class JSInterfaceObject$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JSInterfaceObject f$0;

    public /* synthetic */ JSInterfaceObject$$ExternalSyntheticLambda6(JSInterfaceObject jSInterfaceObject, int i) {
        this.$r8$classId = i;
        this.f$0 = jSInterfaceObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        JSInterfaceObject jSInterfaceObject = this.f$0;
        switch (i) {
            case 0:
                jSInterfaceObject.lambda$onUserActionRequired$12();
                break;
            case 1:
                jSInterfaceObject.lambda$userIsLoggedIn$9();
                break;
            case 2:
                jSInterfaceObject.lambda$onStartLoading$4();
                break;
            case 3:
                jSInterfaceObject.lambda$onStopLoading$6();
                break;
            case 4:
                jSInterfaceObject.lambda$onCardSwitchSuccess$0();
                break;
            default:
                jSInterfaceObject.lambda$onSendWebappError$5();
                break;
        }
    }
}
