package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wju {
    public final CharSequence a;
    public final CharSequence b;
    public final pjc0 c;

    public wju(String str, String str2, pjc0 pjc0Var) {
        this.a = str;
        this.b = str2;
        this.c = pjc0Var;
    }

    public final pjc0 a() {
        return this.c;
    }

    public final CharSequence b() {
        return this.b;
    }

    public final CharSequence c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wju)) {
            return false;
        }
        wju wjuVar = (wju) obj;
        return jl40.l(this.a, wjuVar.a) && jl40.l(this.b, wjuVar.b) && this.c.equals(wjuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "HintState(title=", ", subtitle=", ", clickAction=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
