package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class z34 extends c3f {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final c3f.e k;
    public final c3f.d l;
    public final c3f.a m;

    public z34(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, c3f.e eVar, c3f.d dVar, c3f.a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = eVar;
        this.l = dVar;
        this.m = aVar;
    }

    @Override // defpackage.c3f
    public final c3f.a a() {
        return this.m;
    }

    @Override // defpackage.c3f
    public final String b() {
        return this.h;
    }

    @Override // defpackage.c3f
    public final String c() {
        return this.i;
    }

    @Override // defpackage.c3f
    public final String d() {
        return this.j;
    }

    @Override // defpackage.c3f
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c3f)) {
            return false;
        }
        c3f c3fVar = (c3f) obj;
        if (!this.b.equals(c3fVar.k()) || !this.c.equals(c3fVar.g()) || this.d != c3fVar.j() || !this.e.equals(c3fVar.h())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (c3fVar.f() != null) {
                return false;
            }
        } else if (!str.equals(c3fVar.f())) {
            return false;
        }
        String str2 = this.g;
        if (str2 == null) {
            if (c3fVar.e() != null) {
                return false;
            }
        } else if (!str2.equals(c3fVar.e())) {
            return false;
        }
        String str3 = this.h;
        if (str3 == null) {
            if (c3fVar.b() != null) {
                return false;
            }
        } else if (!str3.equals(c3fVar.b())) {
            return false;
        }
        if (!this.i.equals(c3fVar.c()) || !this.j.equals(c3fVar.d())) {
            return false;
        }
        c3f.e eVar = this.k;
        if (eVar == null) {
            if (c3fVar.l() != null) {
                return false;
            }
        } else if (!eVar.equals(c3fVar.l())) {
            return false;
        }
        c3f.d dVar = this.l;
        if (dVar == null) {
            if (c3fVar.i() != null) {
                return false;
            }
        } else if (!dVar.equals(c3fVar.i())) {
            return false;
        }
        c3f.a aVar = this.m;
        return aVar == null ? c3fVar.a() == null : aVar.equals(c3fVar.a());
    }

    @Override // defpackage.c3f
    public final String f() {
        return this.f;
    }

    @Override // defpackage.c3f
    public final String g() {
        return this.c;
    }

    @Override // defpackage.c3f
    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        c3f.e eVar = this.k;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        c3f.d dVar = this.l;
        int hashCode6 = (hashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        c3f.a aVar = this.m;
        return hashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // defpackage.c3f
    public final c3f.d i() {
        return this.l;
    }

    @Override // defpackage.c3f
    public final int j() {
        return this.d;
    }

    @Override // defpackage.c3f
    public final String k() {
        return this.b;
    }

    @Override // defpackage.c3f
    public final c3f.e l() {
        return this.k;
    }

    @Override // defpackage.c3f
    public final y34 m() {
        y34 y34Var = new y34();
        y34Var.a = this.b;
        y34Var.b = this.c;
        y34Var.c = this.d;
        y34Var.d = this.e;
        y34Var.e = this.f;
        y34Var.f = this.g;
        y34Var.g = this.h;
        y34Var.h = this.i;
        y34Var.i = this.j;
        y34Var.j = this.k;
        y34Var.k = this.l;
        y34Var.l = this.m;
        y34Var.m = (byte) 1;
        return y34Var;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ", appQualitySessionId=" + this.h + ", buildVersion=" + this.i + ", displayVersion=" + this.j + ", session=" + this.k + ", ndkPayload=" + this.l + ", appExitInfo=" + this.m + "}";
    }
}
