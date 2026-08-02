package com.yandex.plus.bdui.plus.webview;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {
    public final com.yandex.plus.bdui.m a;
    public final com.yandex.plus.bdui.plus.content.r b;
    public final com.yandex.plus.bdui.action.h c;
    public final View d;

    public q(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.plus.content.r rVar, com.yandex.plus.bdui.action.h hVar, View view) {
        mVar.getClass();
        rVar.getClass();
        hVar.getClass();
        view.getClass();
        this.a = mVar;
        this.b = rVar;
        this.c = hVar;
        this.d = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.a, qVar.a) && Intrinsics.d(this.b, qVar.b) && Intrinsics.d(this.c, qVar.c) && Intrinsics.d(this.d, qVar.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() + ((this.c.a.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "WebViewBridgeArguments(engineContext=" + this.a + ", content=" + this.b + ", documentContext=" + this.c + ", containerView=" + this.d + ", payload=null)";
    }
}
