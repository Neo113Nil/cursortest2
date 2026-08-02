package defpackage;

/* loaded from: classes.dex */
public final class z64 extends x2w {
    public final String a;
    public final String b;
    public final String c;

    public z64(String str, String str2, String str3) {
        if (str == null) {
            ny61.t("Null crashlyticsInstallId");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.x2w
    public final String a() {
        return this.a;
    }

    @Override // defpackage.x2w
    public final String b() {
        return this.c;
    }

    @Override // defpackage.x2w
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x2w)) {
            return false;
        }
        x2w x2wVar = (x2w) obj;
        if (!this.a.equals(x2wVar.a())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (x2wVar.c() != null) {
                return false;
            }
        } else if (!str.equals(x2wVar.c())) {
            return false;
        }
        String str2 = this.c;
        return str2 == null ? x2wVar.b() == null : str2.equals(x2wVar.b());
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return oyr.t(sb, this.c, "}");
    }
}
