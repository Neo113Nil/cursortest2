package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsqk0;", "", "Companion", "qqk0", "rqk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class sqk0 {
    public static final rqk0 Companion = new rqk0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ sqk0(int i, String str, String str2, String str3, String str4) {
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
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqk0)) {
            return false;
        }
        sqk0 sqk0Var = (sqk0) obj;
        return jl40.l(this.a, sqk0Var.a) && jl40.l(this.b, sqk0Var.b) && jl40.l(this.c, sqk0Var.c) && jl40.l(this.d, sqk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("RideTimeAppearanceOverride(imageTag=", this.a, ", backgroundColor=", this.b, ", textColor="), this.c, ", iconColor=", this.d, Extension.C_BRAKE);
    }

    public sqk0() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
    }
}
