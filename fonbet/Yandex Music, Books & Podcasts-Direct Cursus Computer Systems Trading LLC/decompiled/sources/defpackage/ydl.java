package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ydl {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;

    public ydl(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydl)) {
            return false;
        }
        ydl ydlVar = (ydl) obj;
        return this.a.equals(ydlVar.a) && Intrinsics.d(this.b, ydlVar.b) && this.c == ydlVar.c && this.d.equals(ydlVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PlayerInformerCommonData(linkUrl=", this.a, ", imageUrl=", this.b, ", isTintable=");
        m.append(this.c);
        m.append(", text=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
