package defpackage;

import android.content.Context;
import coil3.a;

/* loaded from: classes.dex */
public final class uci0 {
    public final Context a;
    public final cev b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final a f;

    public uci0(Context context, cev cevVar, i3y i3yVar, i3y i3yVar2, i3y i3yVar3, a aVar) {
        this.a = context;
        this.b = cevVar;
        this.c = i3yVar;
        this.d = i3yVar2;
        this.e = i3yVar3;
        this.f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uci0) {
            uci0 uci0Var = (uci0) obj;
            return jl40.l(this.a, uci0Var.a) && this.b.equals(uci0Var.b) && this.c == uci0Var.c && this.d == uci0Var.d && this.e == uci0Var.e && this.f == uci0Var.f;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((xfo.b.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + xfo.b + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
