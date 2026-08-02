package defpackage;

import com.yandex.plus.home.feature.webviews.internal.smart.PlusSmartWebView;

/* loaded from: classes2.dex */
public final /* synthetic */ class zld0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusSmartWebView b;

    public /* synthetic */ zld0(PlusSmartWebView plusSmartWebView, int i) {
        this.a = i;
        this.b = plusSmartWebView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 showContent$lambda$4;
        wu41 wu41Var;
        npu errorViewController_delegate$lambda$1;
        tzs0 webViewController_delegate$lambda$3;
        int i = this.a;
        PlusSmartWebView plusSmartWebView = this.b;
        switch (i) {
            case 0:
                showContent$lambda$4 = PlusSmartWebView.showContent$lambda$4(plusSmartWebView);
                return showContent$lambda$4;
            case 1:
                wu41Var = PlusSmartWebView.toolbarController_delegate$lambda$0(plusSmartWebView);
                return wu41Var;
            case 2:
                errorViewController_delegate$lambda$1 = PlusSmartWebView.errorViewController_delegate$lambda$1(plusSmartWebView);
                return errorViewController_delegate$lambda$1;
            default:
                webViewController_delegate$lambda$3 = PlusSmartWebView.webViewController_delegate$lambda$3(plusSmartWebView);
                return webViewController_delegate$lambda$3;
        }
    }
}
