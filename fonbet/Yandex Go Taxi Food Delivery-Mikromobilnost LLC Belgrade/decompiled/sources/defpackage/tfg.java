package defpackage;

/* loaded from: classes4.dex */
public final class tfg {
    public final String a;
    public final String b;
    public final String c;

    public tfg(String str, String str2) {
        this.a = str;
        this.b = null;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tfg.class != obj.getClass()) {
            return false;
        }
        tfg tfgVar = (tfg) obj;
        if (this.a.equals(tfgVar.a)) {
            return this.c.equals(tfgVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.a);
        sb.append(", function: ");
        return oyr.t(sb, this.c, " )");
    }

    public tfg(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
