package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sbq0 {
    public final List a;
    public final boolean b;

    public sbq0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbq0)) {
            return false;
        }
        sbq0 sbq0Var = (sbq0) obj;
        return jl40.l(this.a, sbq0Var.a) && this.b == sbq0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "SelectFolderUiState(folders=", ", shouldShowCreateFolderButton=", Extension.C_BRAKE, this.b);
    }

    public sbq0() {
        this(0);
    }

    public /* synthetic */ sbq0(int i) {
        this(EmptyList.a, true);
    }
}
