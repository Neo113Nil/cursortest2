package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s8m0 extends e9m0 {
    public final String c;
    public final Text.Constant d;
    public final String e;
    public final ArrayList f;

    public s8m0(String str, Text.Constant constant, String str2, ArrayList arrayList) {
        super(str, 2);
        this.c = str;
        this.d = constant;
        this.e = str2;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8m0)) {
            return false;
        }
        s8m0 s8m0Var = (s8m0) obj;
        return jl40.l(this.c, s8m0Var.c) && this.d.equals(s8m0Var.d) && jl40.l(this.e, s8m0Var.e) && this.f.equals(s8m0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(xvz.d(this.d, this.c.hashCode() * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "Details(id=" + this.c + ", title=" + this.d + ", action=" + this.e + ", buttons=" + this.f + Extension.C_BRAKE;
    }
}
