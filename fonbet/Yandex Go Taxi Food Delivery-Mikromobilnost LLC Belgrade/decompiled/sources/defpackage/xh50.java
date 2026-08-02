package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class xh50 {
    public final boolean a;
    public final ji50 b;
    public final Integer c;
    public final tls d;
    public final tls e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ xh50(boolean z, ji50 ji50Var, bhh bhhVar, rx3 rx3Var, int i) {
        this(z, ji50Var, (Integer) null, (i & 8) != 0 ? new ej40(r1) : bhhVar, (i & 16) != 0 ? new ej40(r1) : rx3Var);
        int i2 = 25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh50)) {
            return false;
        }
        xh50 xh50Var = (xh50) obj;
        return this.a == xh50Var.a && jl40.l(this.b, xh50Var.b) && jl40.l(this.c, xh50Var.c) && jl40.l(this.d, xh50Var.d) && jl40.l(this.e, xh50Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        return this.e.hashCode() + ly3.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        return "NddAddressPickerPayload(isSource=" + this.a + ", origin=" + this.b + ", pointIndex=" + this.c + ", onConfirm=" + this.d + ", onDrop=" + this.e + Extension.C_BRAKE;
    }

    public xh50(boolean z, ji50 ji50Var, Integer num, tls tlsVar, tls tlsVar2) {
        this.a = z;
        this.b = ji50Var;
        this.c = num;
        this.d = tlsVar;
        this.e = tlsVar2;
    }
}
