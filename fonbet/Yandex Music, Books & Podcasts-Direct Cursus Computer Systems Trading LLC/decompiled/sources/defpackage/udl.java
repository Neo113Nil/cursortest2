package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class udl implements wdl {
    public final zdl a;
    public final String b;
    public final vdl c;
    public final String d;

    public udl(zdl zdlVar, String str, vdl vdlVar, String str2) {
        str.getClass();
        this.a = zdlVar;
        this.b = str;
        this.c = vdlVar;
        this.d = str2;
    }

    @Override // defpackage.wdl
    public final vdl a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udl)) {
            return false;
        }
        udl udlVar = (udl) obj;
        return this.a.equals(udlVar.a) && Intrinsics.d(this.b, udlVar.b) && this.c.equals(udlVar.c) && Intrinsics.d(this.d, udlVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Donation(donation=" + this.a + ", artistId=" + this.b + ", reference=" + this.c + ", analyticsSegment=" + this.d + ")";
    }
}
