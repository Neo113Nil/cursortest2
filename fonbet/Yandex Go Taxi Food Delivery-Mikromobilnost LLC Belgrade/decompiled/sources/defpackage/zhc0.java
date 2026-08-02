package defpackage;

/* loaded from: classes2.dex */
public final class zhc0 implements eic0 {
    public final String a;
    public final String b;

    public zhc0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.eic0
    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhc0)) {
            return false;
        }
        zhc0 zhc0Var = (zhc0) obj;
        return jl40.l(this.a, zhc0Var.a) && jl40.l(this.b, zhc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Deeplink(actionContext=");
        sb.append(this.a);
        sb.append(", deeplink=");
        return b64.p(sb, this.b, ')');
    }
}
