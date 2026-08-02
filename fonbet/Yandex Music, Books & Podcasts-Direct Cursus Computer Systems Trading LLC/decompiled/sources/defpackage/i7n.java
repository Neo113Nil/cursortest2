package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i7n extends k7n {
    public final String a;
    public final String b;
    public final n7n c;
    public final boolean d;
    public final boolean e;

    public i7n(String str, String str2, n7n n7nVar, boolean z, boolean z2) {
        n7nVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = n7nVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.k7n
    public final String a() {
        return this.b;
    }

    @Override // defpackage.k7n
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7n)) {
            return false;
        }
        i7n i7nVar = (i7n) obj;
        return this.a.equals(i7nVar.a) && Intrinsics.d(this.b, i7nVar.b) && Intrinsics.d(this.c, i7nVar.c) && this.d == i7nVar.d && this.e == i7nVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + k5r.e((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Item(title=", this.a, ", description=", this.b, ", model=");
        m.append(this.c);
        m.append(", inPlayer=");
        m.append(this.d);
        m.append(", isPlaying=");
        return ouj.r(m, this.e, ")");
    }
}
