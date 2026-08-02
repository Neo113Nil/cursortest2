package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cev {
    public final String a;
    public final String b;
    public final Object c;

    public cev(String str, String str2, Object obj) {
        obj.getClass();
        this.a = str;
        this.b = str2;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cev)) {
            return false;
        }
        cev cevVar = (cev) obj;
        return this.a.equals(cevVar.a) && this.b.equals(cevVar.b) && Intrinsics.d(this.c, cevVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WebViewJsBridge(bridgeObjectName=", this.a, ", bridgeInjection=", this.b, ", bridgeInstance=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
