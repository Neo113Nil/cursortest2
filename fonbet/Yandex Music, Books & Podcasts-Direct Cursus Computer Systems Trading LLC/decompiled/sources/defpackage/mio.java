package defpackage;

/* loaded from: classes.dex */
public final class mio {
    public final int a;
    public final int b;
    public final dsc c;
    public final cee d;
    public final String e;

    public mio(dsc dscVar, int i, int i2, vsn vsnVar, String str) {
        this.a = i;
        this.b = i2;
        this.c = dscVar;
        this.d = cee.a(vsnVar);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mio.class != obj.getClass()) {
            return false;
        }
        mio mioVar = (mio) obj;
        if (this.a != mioVar.a || this.b != mioVar.b || !this.c.equals(mioVar.c)) {
            return false;
        }
        cee ceeVar = mioVar.d;
        cee ceeVar2 = this.d;
        ceeVar2.getClass();
        return gdg.v(ceeVar, ceeVar2) && this.e.equals(mioVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((((217 + this.a) * 31) + this.b) * 31)) * 31)) * 31);
    }
}
