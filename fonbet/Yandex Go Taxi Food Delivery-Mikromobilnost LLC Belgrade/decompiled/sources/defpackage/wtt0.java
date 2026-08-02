package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wtt0 {
    public final rr51 a;
    public final utt0 b;
    public final vtt0 c;

    public wtt0(rr51 rr51Var, utt0 utt0Var, vtt0 vtt0Var) {
        this.a = rr51Var;
        this.b = utt0Var;
        this.c = vtt0Var;
    }

    public static wtt0 a(wtt0 wtt0Var, vtt0 vtt0Var) {
        rr51 rr51Var = wtt0Var.a;
        utt0 utt0Var = wtt0Var.b;
        wtt0Var.getClass();
        return new wtt0(rr51Var, utt0Var, vtt0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtt0)) {
            return false;
        }
        wtt0 wtt0Var = (wtt0) obj;
        return this.a.equals(wtt0Var.a) && this.b.equals(wtt0Var.b) && this.c.equals(wtt0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SplitDepositPageEntity(divData=" + this.a + ", header=" + this.b + ", paymentMethod=" + this.c + Extension.C_BRAKE;
    }
}
