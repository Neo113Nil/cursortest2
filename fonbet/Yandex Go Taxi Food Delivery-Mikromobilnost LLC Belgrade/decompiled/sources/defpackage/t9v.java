package defpackage;

import coil3.graphics.EnumC0136DataSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class t9v implements hwq {
    public final q7v a;
    public final boolean b;
    public final EnumC0136DataSource c;

    public t9v(q7v q7vVar, boolean z, EnumC0136DataSource enumC0136DataSource) {
        this.a = q7vVar;
        this.b = z;
        this.c = enumC0136DataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9v)) {
            return false;
        }
        t9v t9vVar = (t9v) obj;
        return this.a.equals(t9vVar.a) && this.b == t9vVar.b && this.c == t9vVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + Extension.C_BRAKE;
    }
}
