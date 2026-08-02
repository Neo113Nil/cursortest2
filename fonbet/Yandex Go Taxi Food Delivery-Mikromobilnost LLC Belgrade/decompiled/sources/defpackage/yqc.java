package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public interface yqc extends in41, x3x {
    @Override // defpackage.x3x
    default String a() {
        return "__plusSDKMobileCompat";
    }

    @JavascriptInterface
    void onMessage(String str);
}
