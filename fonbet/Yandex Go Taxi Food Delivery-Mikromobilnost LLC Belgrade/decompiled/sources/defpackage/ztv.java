package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ztv {
    public final String a;
    public final String b;

    public ztv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztv)) {
            return false;
        }
        ztv ztvVar = (ztv) obj;
        return jl40.l(this.a, ztvVar.a) && jl40.l(this.b, ztvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("InformationButtonDataEntity(text=", this.a, ", action=", this.b, Extension.C_BRAKE);
    }
}
