package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iyh {
    public final String a;
    public final jyh b;
    public final int c;

    public iyh(String str, jyh jyhVar, int i) {
        this.a = str;
        this.b = jyhVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyh)) {
            return false;
        }
        iyh iyhVar = (iyh) obj;
        return Intrinsics.d(this.a, iyhVar.a) && this.b.equals(iyhVar.b) && this.c == iyhVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.c) + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuTab(id=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", position=");
        return f1d.i(sb, this.c, ")");
    }
}
