package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lrk00;", "", "Companion", "pk00", "qk00", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class rk00 {
    public static final qk00 Companion = new qk00();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ rk00(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk00)) {
            return false;
        }
        rk00 rk00Var = (rk00) obj;
        return jl40.l(this.a, rk00Var.a) && jl40.l(this.b, rk00Var.b) && jl40.l(this.c, rk00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("MapKitExperiment(serviceId=", this.a, ", parameter=", this.b, ", value="), this.c, Extension.C_BRAKE);
    }

    public rk00(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public rk00() {
        this("", "", "");
    }
}
