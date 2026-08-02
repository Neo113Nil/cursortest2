package defpackage;

import java.io.File;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xqa0 {
    public final boolean a;
    public final Throwable b;
    public final File c;
    public final boolean d;
    public final j57 e;

    public xqa0(boolean z, Throwable th, File file, boolean z2, j57 j57Var) {
        this.a = z;
        this.b = th;
        this.c = file;
        this.d = z2;
        this.e = j57Var;
    }

    public static xqa0 a(xqa0 xqa0Var, Throwable th, File file, j57 j57Var, int i) {
        boolean z = xqa0Var.a;
        boolean z2 = xqa0Var.d;
        if ((i & 16) != 0) {
            j57Var = xqa0Var.e;
        }
        xqa0Var.getClass();
        return new xqa0(z, th, file, z2, j57Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqa0)) {
            return false;
        }
        xqa0 xqa0Var = (xqa0) obj;
        return this.a == xqa0Var.a && jl40.l(this.b, xqa0Var.b) && jl40.l(this.c, xqa0Var.c) && this.d == xqa0Var.d && jl40.l(this.e, xqa0Var.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Throwable th = this.b;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        File file = this.c;
        int e = unr0.e((hashCode2 + (file == null ? 0 : file.hashCode())) * 31, 31, this.d);
        j57 j57Var = this.e;
        return e + (j57Var != null ? j57Var.hashCode() : 0);
    }

    public final String toString() {
        return "PdfLoaderState(isLoading=" + this.a + ", error=" + this.b + ", file=" + this.c + ", isShareButtonEnabled=" + this.d + ", buttonsGroupEntity=" + this.e + Extension.C_BRAKE;
    }

    public /* synthetic */ xqa0(boolean z) {
        this(true, null, null, z, null);
    }
}
