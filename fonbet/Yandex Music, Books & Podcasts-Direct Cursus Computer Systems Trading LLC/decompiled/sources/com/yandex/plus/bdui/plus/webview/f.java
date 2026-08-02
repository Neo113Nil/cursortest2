package com.yandex.plus.bdui.plus.webview;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements g {
    public final com.yandex.plus.webview.core.d a;

    public f(com.yandex.plus.webview.core.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(webViewController=" + this.a + ')';
    }
}
