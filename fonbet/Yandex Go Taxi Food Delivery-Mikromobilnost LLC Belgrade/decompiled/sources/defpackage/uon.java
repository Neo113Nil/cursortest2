package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uon implements won {
    public final boolean a;
    public final hpn b;
    public final jpn c;
    public final ron d;

    public uon(boolean z, hpn hpnVar, jpn jpnVar, ron ronVar) {
        this.a = z;
        this.b = hpnVar;
        this.c = jpnVar;
        this.d = ronVar;
    }

    @Override // defpackage.won
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uon)) {
            return false;
        }
        uon uonVar = (uon) obj;
        return this.a == uonVar.a && jl40.l(this.b, uonVar.b) && this.c.equals(uonVar.c) && jl40.l(this.d, uonVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ly3.b(Boolean.hashCode(this.a) * 31, 31, this.b.a)) * 31;
        ron ronVar = this.d;
        return hashCode + (ronVar == null ? 0 : ronVar.hashCode());
    }

    public final String toString() {
        return "EducationTooltipContentEntity(showCross=" + this.a + ", shadow=" + this.b + ", tooltip=" + this.c + ", scrollBehaviour=" + this.d + Extension.C_BRAKE;
    }
}
