package com.yandex.passport.sloth.ui;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1 implements x1 {
    public final com.yandex.passport.sloth.ui.webview.f a;

    public t1(com.yandex.passport.sloth.ui.webview.f fVar) {
        fVar.getClass();
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && Intrinsics.d(this.a, ((t1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnWebViewError(error=" + this.a + ')';
    }
}
