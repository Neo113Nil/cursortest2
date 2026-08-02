package defpackage;

/* loaded from: classes4.dex */
public final class qsv implements ssv {
    public final boolean a;
    public final String b;
    public final jsv c;

    public qsv(boolean z, String str, jsv jsvVar) {
        this.a = z;
        this.b = str;
        this.c = jsvVar;
    }

    @Override // defpackage.ssv
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ssv
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsv)) {
            return false;
        }
        qsv qsvVar = (qsv) obj;
        return this.a == qsvVar.a && this.b.equals(qsvVar.b) && this.c.equals(qsvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.c(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "Default(isLiked=" + this.a + ", artistName=" + this.b + ", hintVisibilityMode=" + this.c + ")";
    }
}
