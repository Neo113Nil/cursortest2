package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vv30 {
    public final ArrayList a;
    public final String b;

    public vv30(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv30)) {
            return false;
        }
        vv30 vv30Var = (vv30) obj;
        return this.a.equals(vv30Var.a) && jl40.l(this.b, vv30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SubtitleUiState(parts=" + this.a + ", shortText=" + this.b + Extension.C_BRAKE;
    }
}
