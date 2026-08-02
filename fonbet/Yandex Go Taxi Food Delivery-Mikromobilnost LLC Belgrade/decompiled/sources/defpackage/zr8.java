package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class zr8 implements bs8 {
    public final File a;
    public final boolean b;

    public zr8(File file, boolean z) {
        this.a = file;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr8)) {
            return false;
        }
        zr8 zr8Var = (zr8) obj;
        return jl40.l(this.a, zr8Var.a) && this.b == zr8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TakenPhoto(photoFile=" + this.a + ", isAuto=" + this.b + Extension.C_BRAKE;
    }
}
