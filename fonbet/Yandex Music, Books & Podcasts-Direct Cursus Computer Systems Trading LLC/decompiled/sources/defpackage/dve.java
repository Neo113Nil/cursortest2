package defpackage;

/* loaded from: classes5.dex */
public final class dve implements cve {
    public final cve a;

    public dve(cve cveVar) {
        this.a = cveVar;
    }

    public static dve c(cve cveVar) {
        if (cveVar instanceof qd7) {
            return ((qd7) cveVar).a;
        }
        if (cveVar instanceof dve) {
            return (dve) cveVar;
        }
        if (cveVar == null) {
            return null;
        }
        return new dve(cveVar);
    }

    @Override // defpackage.cve
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.cve
    public final int b(pd7 pd7Var, CharSequence charSequence, int i) {
        return this.a.b(pd7Var, charSequence, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dve) {
            return this.a.equals(((dve) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
