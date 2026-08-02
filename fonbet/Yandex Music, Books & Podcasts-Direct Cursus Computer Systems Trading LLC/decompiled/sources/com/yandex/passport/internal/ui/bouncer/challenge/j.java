package com.yandex.passport.internal.ui.bouncer.challenge;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j implements k {
    public final com.yandex.passport.internal.ui.challenge.webview.i a;

    public j(com.yandex.passport.internal.ui.challenge.webview.i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.a, ((j) obj).a);
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
