package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class w98 extends ffb1 {
    public final Throwable a;
    public final String b;
    public final boolean c;

    public w98(int i, String str, Throwable th) {
        str = (i & 2) != 0 ? null : str;
        boolean z = str != null;
        this.a = th;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w98)) {
            return false;
        }
        w98 w98Var = (w98) obj;
        return this.a.equals(w98Var.a) && jl40.l(this.b, w98Var.b) && this.c == w98Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollingError(throwable=");
        sb.append(this.a);
        sb.append(", applicationId=");
        sb.append(this.b);
        sb.append(", canRepeatPolling=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
