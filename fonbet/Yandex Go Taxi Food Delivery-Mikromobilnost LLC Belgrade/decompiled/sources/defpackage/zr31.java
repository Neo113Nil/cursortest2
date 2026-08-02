package defpackage;

import androidx.fragment.app.Fragment;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class zr31 {
    public final rs31 a;
    public final String b;

    public zr31(Fragment fragment, String str) {
        this.a = fragment;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr31)) {
            return false;
        }
        zr31 zr31Var = (zr31) obj;
        return jl40.l(this.a, zr31Var.a) && jl40.l(this.b, zr31Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ViewModelConfiguration(viewModelStoreOwner=" + this.a + ", viewModelKey=" + this.b + Extension.C_BRAKE;
    }
}
