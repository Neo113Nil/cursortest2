package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.yandex.payment.sdk.ui.common.YB2FAObservingWebViewFragment;

/* loaded from: classes2.dex */
public final class ze51 {
    public final /* synthetic */ YB2FAObservingWebViewFragment a;

    public ze51(YB2FAObservingWebViewFragment yB2FAObservingWebViewFragment) {
        this.a = yB2FAObservingWebViewFragment;
    }

    @JavascriptInterface
    public final void challengeFinished() {
        new Handler(Looper.getMainLooper()).post(new jy31(10, this.a));
    }
}
