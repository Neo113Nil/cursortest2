package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class r4r implements s4r {
    public final ycb0 a;
    public final String b;
    public final q4r c;

    public r4r(ycb0 ycb0Var, String str, q4r q4rVar) {
        this.a = ycb0Var;
        this.b = str;
        this.c = q4rVar;
    }

    public static r4r a(r4r r4rVar, q4r q4rVar) {
        ycb0 ycb0Var = r4rVar.a;
        String str = r4rVar.b;
        r4rVar.getClass();
        return new r4r(ycb0Var, str, q4rVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4r)) {
            return false;
        }
        r4r r4rVar = (r4r) obj;
        return this.a.equals(r4rVar.a) && this.b.equals(r4rVar.b) && this.c.equals(r4rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Feed(sheetTitle=" + this.a + ", associatedFilterId=" + tab0.a(this.b) + ", bottomSheetData=" + this.c + Extension.C_BRAKE;
    }
}
