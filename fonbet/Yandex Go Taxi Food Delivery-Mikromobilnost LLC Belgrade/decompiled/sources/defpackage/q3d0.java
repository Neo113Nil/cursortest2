package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes3.dex */
public final class q3d0 implements x3x {
    public final p3d0 a;

    public q3d0(p3d0 p3d0Var) {
        this.a = p3d0Var;
    }

    @Override // defpackage.x3x
    public final String a() {
        return "__plusSDKMobileCompat";
    }

    @JavascriptInterface
    public final void onMessage(String str) {
        this.a.onMessage(str);
    }
}
