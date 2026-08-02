package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fsu implements hsu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public fsu(String str, String str2, String str3, String str4) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.hsu
    public final String a() {
        return this.c;
    }

    @Override // defpackage.hsu
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsu)) {
            return false;
        }
        fsu fsuVar = (fsu) obj;
        return this.a.equals(fsuVar.a) && Intrinsics.d(this.b, fsuVar.b) && Intrinsics.d(this.c, fsuVar.c) && Intrinsics.d(this.d, fsuVar.d);
    }

    @Override // defpackage.hsu
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.hsu
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ouj.q(f1d.m("Disabled(id=", this.a, ", name=", this.b, ", userImageUrl="), this.c, ", otherUserImageUrl=", this.d, ")");
    }
}
