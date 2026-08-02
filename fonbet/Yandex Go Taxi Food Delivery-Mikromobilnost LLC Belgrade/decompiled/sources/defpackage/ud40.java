package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ud40 implements xd40 {
    public final CharSequence a;
    public final CharSequence b;
    public final gi40 c;
    public final fi40 d;
    public final ei40 e;
    public final y940 f;

    public ud40(CharSequence charSequence, CharSequence charSequence2, gi40 gi40Var, fi40 fi40Var, ei40 ei40Var, y940 y940Var) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = gi40Var;
        this.d = fi40Var;
        this.e = ei40Var;
        this.f = y940Var;
    }

    public static ud40 a(ud40 ud40Var, fi40 fi40Var, ei40 ei40Var, y940 y940Var, int i) {
        CharSequence charSequence = ud40Var.a;
        CharSequence charSequence2 = ud40Var.b;
        gi40 gi40Var = ud40Var.c;
        if ((i & 8) != 0) {
            fi40Var = ud40Var.d;
        }
        fi40 fi40Var2 = fi40Var;
        if ((i & 16) != 0) {
            ei40Var = ud40Var.e;
        }
        ei40 ei40Var2 = ei40Var;
        if ((i & 32) != 0) {
            y940Var = ud40Var.f;
        }
        ud40Var.getClass();
        return new ud40(charSequence, charSequence2, gi40Var, fi40Var2, ei40Var2, y940Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud40)) {
            return false;
        }
        ud40 ud40Var = (ud40) obj;
        return jl40.l(this.a, ud40Var.a) && jl40.l(this.b, ud40Var.b) && jl40.l(this.c, ud40Var.c) && jl40.l(this.d, ud40Var.d) && jl40.l(this.e, ud40Var.e) && jl40.l(this.f, ud40Var.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Content(title=", ", subtitle=", ", mtTrainTransportState=");
        r.append(this.c);
        r.append(", mtTrainTicketsState=");
        r.append(this.d);
        r.append(", mtTrainTicketsCountState=");
        r.append(this.e);
        r.append(", mtTrainBottomBarState=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
