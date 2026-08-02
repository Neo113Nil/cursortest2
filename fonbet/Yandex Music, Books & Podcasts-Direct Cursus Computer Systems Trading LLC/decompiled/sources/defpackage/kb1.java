package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kb1 implements lb1 {
    public final String a;
    public final sa1 b;
    public final ta1 c;
    public final ra1 d;
    public final va1 e;
    public final ua1 f;

    public kb1(String str, sa1 sa1Var, ta1 ta1Var, ra1 ra1Var, va1 va1Var, ua1 ua1Var) {
        str.getClass();
        this.a = str;
        this.b = sa1Var;
        this.c = ta1Var;
        this.d = ra1Var;
        this.e = va1Var;
        this.f = ua1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb1)) {
            return false;
        }
        kb1 kb1Var = (kb1) obj;
        return Intrinsics.d(this.a, kb1Var.a) && Intrinsics.d(this.b, kb1Var.b) && Intrinsics.d(this.c, kb1Var.c) && Intrinsics.d(this.d, kb1Var.d) && Intrinsics.d(this.e, kb1Var.e) && Intrinsics.d(this.f, kb1Var.f);
    }

    @Override // defpackage.lb1
    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sa1 sa1Var = this.b;
        int hashCode2 = (((hashCode + (sa1Var == null ? 0 : sa1Var.a.hashCode())) * 31) + (this.c == null ? 0 : -1452150841)) * 31;
        ra1 ra1Var = this.d;
        int hashCode3 = (hashCode2 + (ra1Var == null ? 0 : ra1Var.a.hashCode())) * 31;
        va1 va1Var = this.e;
        int hashCode4 = (hashCode3 + (va1Var == null ? 0 : va1Var.a.hashCode())) * 31;
        ua1 ua1Var = this.f;
        return hashCode4 + (ua1Var != null ? ua1Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "Success(title=" + this.a + ", donationsBlock=" + this.b + ", galleryBlock=" + this.c + ", descriptionBlock=" + this.d + ", listenersBlock=" + this.e + ", linksBlock=" + this.f + ")";
    }
}
