package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class w1j0 {
    public final File a;
    public final Throwable b;
    public final j57 c;

    public w1j0(File file, Throwable th, j57 j57Var, int i) {
        file = (i & 1) != 0 ? null : file;
        th = (i & 2) != 0 ? null : th;
        j57Var = (i & 4) != 0 ? null : j57Var;
        this.a = file;
        this.b = th;
        this.c = j57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1j0)) {
            return false;
        }
        w1j0 w1j0Var = (w1j0) obj;
        return jl40.l(this.a, w1j0Var.a) && jl40.l(this.b, w1j0Var.b) && jl40.l(this.c, w1j0Var.c);
    }

    public final int hashCode() {
        File file = this.a;
        int hashCode = (file == null ? 0 : file.hashCode()) * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        j57 j57Var = this.c;
        return hashCode2 + (j57Var != null ? j57Var.hashCode() : 0);
    }

    public final String toString() {
        return "ReportDataEntity(file=" + this.a + ", error=" + this.b + ", buttonsGroup=" + this.c + Extension.C_BRAKE;
    }

    public w1j0() {
        this(null, null, null, 7);
    }
}
