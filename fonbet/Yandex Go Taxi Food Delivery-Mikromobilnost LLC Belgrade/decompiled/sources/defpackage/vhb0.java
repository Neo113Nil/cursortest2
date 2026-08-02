package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vhb0 implements yhb0 {
    public final File a;
    public final fzd b;

    public vhb0(File file, fzd fzdVar) {
        this.a = file;
        this.b = fzdVar;
    }

    @Override // defpackage.yhb0
    public final File a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhb0)) {
            return false;
        }
        vhb0 vhb0Var = (vhb0) obj;
        return jl40.l(this.a, vhb0Var.a) && this.b.equals(vhb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failed(file=" + this.a + ", step=" + this.b + Extension.C_BRAKE;
    }
}
