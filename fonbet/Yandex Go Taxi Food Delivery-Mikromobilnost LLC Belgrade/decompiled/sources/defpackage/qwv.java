package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qwv {
    public final boolean a;
    public final String b;
    public final kao c;

    public qwv(boolean z, String str, kao kaoVar) {
        this.a = z;
        this.b = str;
        this.c = kaoVar;
    }

    public final kao a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwv)) {
            return false;
        }
        qwv qwvVar = (qwv) obj;
        return this.a == qwvVar.a && this.b.equals(qwvVar.b) && jl40.l(this.c, qwvVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        kao kaoVar = this.c;
        return b + (kaoVar == null ? 0 : kaoVar.hashCode());
    }

    public final String toString() {
        StringBuilder v = ly3.v("InitialViewState(showProgress=", ", supportUrl=", this.b, ", errorState=", this.a);
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
