package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zcc0 implements bdc0 {
    public final int a;
    public final boolean b;

    public zcc0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcc0)) {
            return false;
        }
        zcc0 zcc0Var = (zcc0) obj;
        return this.a == zcc0Var.a && this.b == zcc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + oyr.b(25, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "LineBreak(maxLines=" + this.a + ", maxSymbolsPerLine=25, wrapInQuotes=" + this.b + Extension.C_BRAKE;
    }
}
