package defpackage;

import coil3.graphics.EnumC0136DataSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class zct0 implements hwq {
    public final xev a;
    public final String b;
    public final EnumC0136DataSource c;

    public zct0(xev xevVar, String str, EnumC0136DataSource enumC0136DataSource) {
        this.a = xevVar;
        this.b = str;
        this.c = enumC0136DataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zct0)) {
            return false;
        }
        zct0 zct0Var = (zct0) obj;
        return jl40.l(this.a, zct0Var.a) && jl40.l(this.b, zct0Var.b) && this.c == zct0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + Extension.C_BRAKE;
    }
}
