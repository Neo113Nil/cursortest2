package com.yandex.plus.webview.api;

import com.yandex.plus.bdui.plus.webview.o;

/* loaded from: classes5.dex */
public final class f implements g {
    public final o a;

    public f(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a.equals(((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReadyProvider(readyProvider=" + this.a + ')';
    }
}
