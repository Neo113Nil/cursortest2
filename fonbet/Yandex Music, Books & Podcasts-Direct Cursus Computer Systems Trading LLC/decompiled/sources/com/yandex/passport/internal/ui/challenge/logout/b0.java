package com.yandex.passport.internal.ui.challenge.logout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 implements c0 {
    public final com.yandex.passport.internal.ui.challenge.webview.i a;

    public b0(com.yandex.passport.internal.ui.challenge.webview.i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        com.yandex.passport.internal.ui.challenge.webview.i iVar = this.a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "WebViewParams(webViewParams=" + this.a + ')';
    }
}
