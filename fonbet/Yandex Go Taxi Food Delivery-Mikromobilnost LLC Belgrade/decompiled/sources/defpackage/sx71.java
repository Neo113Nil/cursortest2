package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.l40;
import yads.m40;

@gsq0
/* loaded from: classes7.dex */
public final class sx71 {
    public static final pu71 Companion = new pu71();
    public static final i3y[] g;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final as71 e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, a.b(lazyThreadSafetyMode, l40.w), null, null, a.b(lazyThreadSafetyMode, m40.w)};
    }

    public sx71(int i, String str, String str2, List list, String str3, as71 as71Var, List list2) {
        if (54 != (i & 54)) {
            qje.Z(i, 54, tl71.b);
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = as71Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx71)) {
            return false;
        }
        sx71 sx71Var = (sx71) obj;
        return jl40.l(this.a, sx71Var.a) && jl40.l(this.b, sx71Var.b) && jl40.l(this.c, sx71Var.c) && jl40.l(this.d, sx71Var.d) && jl40.l(this.e, sx71Var.e) && jl40.l(this.f, sx71Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c(z2a1.a((str == null ? 0 : str.hashCode()) * 31, this.b), 31, this.c);
        String str2 = this.d;
        int hashCode = (c + (str2 == null ? 0 : str2.hashCode())) * 31;
        as71 as71Var = this.e;
        return this.f.hashCode() + ((hashCode + (as71Var != null ? as71Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("DebugPanelAdUnitWaterfallMediation(adapter=", this.a, ", networkName=", this.b, ", waterfallParameters=");
        oyr.D(", networkAdUnitIdName=", this.d, ", currency=", v, this.c);
        v.append(this.e);
        v.append(", cpmFloors=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
