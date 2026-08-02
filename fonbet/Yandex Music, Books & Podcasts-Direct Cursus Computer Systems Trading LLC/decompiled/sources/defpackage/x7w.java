package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* loaded from: classes4.dex */
public final class x7w {
    public final /* synthetic */ y7w a;

    public x7w(y7w y7wVar) {
        this.a = y7wVar;
    }

    @JavascriptInterface
    public final void challengeFinished() {
        new Handler(Looper.getMainLooper()).post(new bhp(25, this.a));
    }
}
