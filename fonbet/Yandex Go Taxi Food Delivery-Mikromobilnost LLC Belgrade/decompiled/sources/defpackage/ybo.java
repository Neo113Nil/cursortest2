package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ybo {
    public static final ybo d = new ybo(0, "", false);
    public final int a;
    public final String b;
    public final boolean c;

    public ybo(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybo)) {
            return false;
        }
        ybo yboVar = (ybo) obj;
        return this.a == yboVar.a && this.b.equals(yboVar.b) && this.c == yboVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(unr0.v(this.a, "EstimatedWaiting(timeInMinutes=", ", text=", this.b, ", useDefaultEtaIcon="), this.c, Extension.C_BRAKE);
    }
}
