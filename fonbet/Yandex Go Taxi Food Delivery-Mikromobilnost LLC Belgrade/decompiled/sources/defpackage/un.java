package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class un extends nr implements tv7 {
    public final String a;
    public final z220 b;
    public final String c;
    public final String d;

    public un(String str, z220 z220Var, String str2, String str3) {
        this.a = str;
        this.b = z220Var;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.nr
    public final String a() {
        return this.c;
    }

    @Override // defpackage.nr
    public final String b() {
        return this.d;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un)) {
            return false;
        }
        un unVar = (un) obj;
        return jl40.l(this.a, unVar.a) && this.b.equals(unVar.b) && jl40.l(this.c, unVar.c) && jl40.l(this.d, unVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionOpenChat(title=");
        sb.append(this.a);
        sb.append(", messengerParams=");
        sb.append(this.b);
        sb.append(", imageTag=");
        return g8e.r(sb, this.c, ", metricaLabel=", this.d, Extension.C_BRAKE);
    }
}
