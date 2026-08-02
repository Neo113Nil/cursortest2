package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xud {
    public final String a;
    public final hfs b;
    public final hfs c;
    public final String d;

    public xud(hfs hfsVar, hfs hfsVar2, String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = hfsVar;
        this.c = hfsVar2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xud)) {
            return false;
        }
        xud xudVar = (xud) obj;
        return Intrinsics.d(this.a, xudVar.a) && this.b.equals(xudVar.b) && Intrinsics.d(this.c, xudVar.c) && this.d.equals(xudVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hfs hfsVar = this.c;
        return this.d.hashCode() + ((hashCode + (hfsVar == null ? 0 : hfsVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Button(text=" + this.a + ", buttonColor=" + this.b + ", textColor=" + this.c + ", deeplink=" + this.d + ")";
    }
}
