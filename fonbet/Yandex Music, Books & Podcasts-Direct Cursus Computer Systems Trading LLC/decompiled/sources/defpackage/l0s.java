package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l0s implements m0s {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public l0s(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0s)) {
            return false;
        }
        l0s l0sVar = (l0s) obj;
        return this.a.equals(l0sVar.a) && this.b.equals(l0sVar.b) && Intrinsics.d(this.c, l0sVar.c) && this.d.equals(l0sVar.d);
    }

    @Override // defpackage.m0s
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.m0s
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ouj.q(f1d.m("Sticky(id=", this.a, ", title=", this.b, ", deeplink="), this.c, ", anchorId=", this.d, ")");
    }
}
