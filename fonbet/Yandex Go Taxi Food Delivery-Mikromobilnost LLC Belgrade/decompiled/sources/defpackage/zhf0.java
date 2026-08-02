package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zhf0 extends n351 {
    public final dif0 c;
    public final x2s d;
    public final String e;

    public zhf0(dif0 dif0Var, x2s x2sVar, String str) {
        super("progress", false, 14);
        this.c = dif0Var;
        this.d = x2sVar;
        this.e = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhf0)) {
            return false;
        }
        zhf0 zhf0Var = (zhf0) obj;
        return this.c.equals(zhf0Var.c) && this.d.equals(zhf0Var.d) && jl40.l(this.e, zhf0Var.e);
    }

    public final int hashCode() {
        int a = tse0.a(this.d, this.c.hashCode() * 31, 31);
        String str = this.e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarModel(state=");
        sb.append(this.c);
        sb.append(", analyticsData=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
