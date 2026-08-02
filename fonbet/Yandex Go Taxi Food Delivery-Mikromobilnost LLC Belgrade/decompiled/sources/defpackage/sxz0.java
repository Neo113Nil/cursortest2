package defpackage;

import android.view.View;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class sxz0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopupFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ sxz0(TopupFragment topupFragment, int i, int i2) {
        this.a = i2;
        this.b = topupFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        TopupFragment topupFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = topupFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (ProgressView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = topupFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (WebViewContainer) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
