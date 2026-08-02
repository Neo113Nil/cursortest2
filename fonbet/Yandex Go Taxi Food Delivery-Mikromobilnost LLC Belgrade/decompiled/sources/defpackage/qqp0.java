package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class qqp0 extends crp0 {
    public final String c;
    public final Throwable d;
    public final Object e;

    public qqp0(String str, Throwable th, String str2) {
        super("PartialResponseParsing");
        this.c = str;
        this.d = th;
        this.e = str2;
    }

    @Override // defpackage.crp0
    public final Throwable b() {
        return this.d;
    }

    @Override // defpackage.crp0
    public final Object c() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqp0)) {
            return false;
        }
        qqp0 qqp0Var = (qqp0) obj;
        return jl40.l(this.c, qqp0Var.c) && jl40.l(this.d, qqp0Var.d) && jl40.l(this.e, qqp0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        Object obj = this.e;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartialResponseParsing(message=");
        sb.append(this.c);
        sb.append(", exception=");
        sb.append(this.d);
        sb.append(", payload=");
        return x4e.h(sb, this.e, Extension.C_BRAKE);
    }

    public /* synthetic */ qqp0(Throwable th) {
        this("failed to parse part of response PollingConfig", th, null);
    }
}
