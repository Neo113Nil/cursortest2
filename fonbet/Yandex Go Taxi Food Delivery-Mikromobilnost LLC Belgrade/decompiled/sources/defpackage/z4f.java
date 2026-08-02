package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class z4f {
    public final boolean a;
    public final String b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public z4f(boolean z, String str, List list, boolean z2, boolean z3) {
        this.a = z;
        this.b = str;
        this.c = list;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4f)) {
            return false;
        }
        z4f z4fVar = (z4f) obj;
        return this.a == z4fVar.a && this.b.equals(z4fVar.b) && jl40.l(this.c, z4fVar.c) && this.d == z4fVar.d && this.e == z4fVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.e(unr0.c(unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = ly3.v("CreateEditFolderUiState(isEditMode=", ", folderName=", this.b, ", listItems=", this.a);
        nzs.p(v, this.c, ", showConfirmButton=", this.d, ", canCloseScreen=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
