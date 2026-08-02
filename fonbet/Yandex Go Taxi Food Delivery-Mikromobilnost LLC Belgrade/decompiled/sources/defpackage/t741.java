package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class t741 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;

    public t741(String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t741)) {
            return false;
        }
        t741 t741Var = (t741) obj;
        return jl40.l(this.a, t741Var.a) && jl40.l(this.b, t741Var.b) && jl40.l(this.c, t741Var.c) && jl40.l(this.d, t741Var.d) && jl40.l(this.e, t741Var.e) && jl40.l(this.f, t741Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.c(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("WalkingSectionUiState(title=", this.a, ", titleContentDescription=", this.b, ", duration=");
        g8e.D(v, this.c, ", distance=", this.d, ", routeItems=");
        return n.l(", startButtonText=", this.f, Extension.C_BRAKE, v, this.e);
    }

    public /* synthetic */ t741(int i) {
        this("", "", "", "", "", EmptyList.a);
    }

    public t741() {
        this(0);
    }
}
