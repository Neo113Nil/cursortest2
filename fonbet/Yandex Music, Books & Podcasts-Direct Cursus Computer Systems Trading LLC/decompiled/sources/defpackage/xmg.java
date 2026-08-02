package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xmg {
    public final img a;
    public final Exception b;
    public final String c;

    public xmg(img imgVar, Exception exc, String str) {
        this.a = imgVar;
        this.b = exc;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmg)) {
            return false;
        }
        xmg xmgVar = (xmg) obj;
        return this.a == xmgVar.a && this.b.equals(xmgVar.b) && Intrinsics.d(this.c, xmgVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorState(error=");
        sb.append(this.a);
        sb.append(", throwable=");
        sb.append(this.b);
        sb.append(", message=");
        return su4.o(sb, this.c, ")");
    }
}
