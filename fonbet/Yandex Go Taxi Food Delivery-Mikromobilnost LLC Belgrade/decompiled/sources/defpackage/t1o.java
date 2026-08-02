package defpackage;

import coil3.graphics.EnumC0136DataSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class t1o {
    public final q7v a;
    public final boolean b;
    public final EnumC0136DataSource c;
    public final String d;

    public t1o(q7v q7vVar, boolean z, EnumC0136DataSource enumC0136DataSource, String str) {
        this.a = q7vVar;
        this.b = z;
        this.c = enumC0136DataSource;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1o)) {
            return false;
        }
        t1o t1oVar = (t1o) obj;
        return jl40.l(this.a, t1oVar.a) && this.b == t1oVar.b && this.c == t1oVar.c && jl40.l(this.d, t1oVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + Extension.C_BRAKE;
    }
}
