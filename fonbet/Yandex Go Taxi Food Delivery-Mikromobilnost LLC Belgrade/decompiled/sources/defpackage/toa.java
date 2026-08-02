package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class toa implements uoa {
    public final int a;
    public final int b;

    public toa(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toa)) {
            return false;
        }
        toa toaVar = (toa) obj;
        return this.a == toaVar.a && this.b == toaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ManualEnter(numberLength=", ", validNumberMinLength=", Extension.C_BRAKE);
    }
}
