package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class tdl implements wdl {
    public final h06 a;
    public final String b;
    public final vdl c;
    public final String d;

    public tdl(h06 h06Var, String str, vdl vdlVar, String str2) {
        str.getClass();
        this.a = h06Var;
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
        if (!(obj instanceof tdl)) {
            return false;
        }
        tdl tdlVar = (tdl) obj;
        return this.a.equals(tdlVar.a) && Intrinsics.d(this.b, tdlVar.b) && this.c.equals(tdlVar.c) && Intrinsics.d(this.d, tdlVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.a.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Concert(concert=" + this.a + ", artistId=" + this.b + ", reference=" + this.c + ", analyticsSegment=" + this.d + ")";
    }
}
