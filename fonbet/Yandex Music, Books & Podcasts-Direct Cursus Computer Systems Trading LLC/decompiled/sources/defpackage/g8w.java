package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g8w {
    public final String a;
    public final String b;
    public final i8w c;
    public final int d;
    public final String e;

    public g8w(String str, String str2, i8w i8wVar, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i8wVar;
        this.d = i;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8w)) {
            return false;
        }
        g8w g8wVar = (g8w) obj;
        return Intrinsics.d(this.a, g8wVar.a) && this.b.equals(g8wVar.b) && this.c.equals(g8wVar.c) && this.d == g8wVar.d && Intrinsics.d(this.e, g8wVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int a = f1d.a(this.d, (this.c.hashCode() + k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31, 31);
        String str2 = this.e;
        return a + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("YandexBooksBanner(id=", this.a, ", type=", this.b, ", data=");
        m.append(this.c);
        m.append(", position=");
        m.append(this.d);
        m.append(", pageTitle=");
        return su4.o(m, this.e, ")");
    }
}
