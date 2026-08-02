package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes8.dex */
public final class ui3 {
    public final zwf0 a;

    public ui3(zwf0 zwf0Var, id41 id41Var) {
        this.a = zwf0Var;
    }

    @JavascriptInterface
    public final void authInvalid() {
        this.a.c("AuthEventHandlerBridge", "Got web event: onAuthInvalid");
    }
}
