package com.yandex.plus.bdui.plus.webview;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements g {
    public final com.yandex.plus.webview.core.d a;
    public final Exception b;
    public final Function0 c;

    public e(com.yandex.plus.webview.core.d dVar, Exception exc, Function0 function0) {
        dVar.getClass();
        this.a = dVar;
        this.b = exc;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.a, eVar.a) && this.b.equals(eVar.b) && Intrinsics.d(this.c, eVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Function0 function0 = this.c;
        return hashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        return "Error(webViewController=" + this.a + ", error=" + this.b + ", retry=" + this.c + ')';
    }
}
