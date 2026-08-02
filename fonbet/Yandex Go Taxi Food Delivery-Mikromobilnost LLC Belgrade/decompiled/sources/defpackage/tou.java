package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class tou extends p200 {
    public final int a;
    public final int b;
    public final bg1 c;
    public final ag1 d;

    public tou(int i, int i2, bg1 bg1Var, ag1 ag1Var) {
        this.a = i;
        this.b = i2;
        this.c = bg1Var;
        this.d = ag1Var;
    }

    public final int a() {
        bg1 bg1Var = bg1.G;
        int i = this.b;
        bg1 bg1Var2 = this.c;
        if (bg1Var2 == bg1Var) {
            return i;
        }
        if (bg1Var2 != bg1.D && bg1Var2 != bg1.E && bg1Var2 != bg1.F) {
            ny61.r("Unknown variant");
            return 0;
        }
        return i + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tou)) {
            return false;
        }
        tou touVar = (tou) obj;
        return touVar.a == this.a && touVar.a() == a() && touVar.c == this.c && touVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(tou.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.c);
        sb.append(", hashType: ");
        sb.append(this.d);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append("-byte tags, and ");
        return oyr.m(this.a, "-byte key)", sb);
    }
}
