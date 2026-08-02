package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u3b0 {
    public static final u3b0 f = new u3b0(0);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final int e;

    public u3b0(String str, int i, String str2, String str3, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3b0)) {
            return false;
        }
        u3b0 u3b0Var = (u3b0) obj;
        return jl40.l(this.a, u3b0Var.a) && jl40.l(this.b, u3b0Var.b) && jl40.l(this.c, u3b0Var.c) && jl40.l(this.d, u3b0Var.d) && this.e == u3b0Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Integer.hashCode(this.e) + unr0.b(unr0.c((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("PersonalActionPopupViewModel(title=", this.a, ", content=", this.b, ", buttons=");
        oyr.D(", type=", this.d, ", maxShowCount=", v, this.c);
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }

    public u3b0() {
        this(0);
    }

    public /* synthetic */ u3b0(int i) {
        this(null, Integer.MAX_VALUE, null, "", EmptyList.a);
    }
}
