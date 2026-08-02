package com.yandex.plus.webview.api.insets;

import defpackage.dfi;

/* loaded from: classes5.dex */
public final class c {
    public final a a;
    public final a b;
    public final boolean c;

    public c(a aVar, a aVar2, boolean z) {
        this.a = aVar;
        this.b = aVar2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a || this.b != cVar.b) {
            return false;
        }
        b bVar = b.a;
        return bVar.equals(bVar) && this.c == cVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 1083233127) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebViewInsetsConfig(statusBarInsetMode=");
        sb.append(this.a);
        sb.append(", navigationBarInsetMode=");
        sb.append(this.b);
        sb.append(", onFooterShownWebViewBottomMargin=");
        sb.append(b.a);
        sb.append(", webViewConsiderIme=");
        return dfi.j(sb, this.c, ')');
    }
}
