package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class v4b0 {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final boolean f;

    public /* synthetic */ v4b0(String str, String str2, ArrayList arrayList, String str3, String str4, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 4) != 0 ? EmptyList.a : arrayList, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4b0)) {
            return false;
        }
        v4b0 v4b0Var = (v4b0) obj;
        return jl40.l(this.a, v4b0Var.a) && jl40.l(this.b, v4b0Var.b) && jl40.l(this.c, v4b0Var.c) && jl40.l(this.d, v4b0Var.d) && jl40.l(this.e, v4b0Var.e) && this.f == v4b0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.b(unr0.b(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("PersonalGoalsUiState(title=", this.a, ", subtitle=", this.b, ", goals=");
        oyr.D(", buttonText=", this.d, ", acceptRulesText=", v, this.c);
        return nnm.i(this.e, ", isLoading=", Extension.C_BRAKE, v, this.f);
    }

    public v4b0(String str, String str2, String str3, String str4, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public v4b0() {
        this((String) null, (String) null, (ArrayList) null, (String) null, (String) null, 63);
    }
}
