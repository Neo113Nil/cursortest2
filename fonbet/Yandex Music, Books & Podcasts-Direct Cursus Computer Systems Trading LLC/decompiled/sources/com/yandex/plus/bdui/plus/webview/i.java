package com.yandex.plus.bdui.plus.webview;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements k {
    public final g a;

    public i(g gVar) {
        gVar.getClass();
        this.a = gVar;
    }

    @Override // com.yandex.plus.bdui.plus.webview.k
    public final g a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.a, ((i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotRetried(loadingResult=" + this.a + ')';
    }
}
