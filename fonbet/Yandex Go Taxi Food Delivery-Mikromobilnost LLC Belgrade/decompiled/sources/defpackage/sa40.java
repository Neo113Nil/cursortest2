package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsa40;", "", "Companion", "qa40", "ra40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class sa40 {
    public static final ra40 Companion = new ra40();
    public final ka40 a;
    public final db40 b;
    public final vb40 c;
    public final da40 d;
    public final String e;

    static {
        ca40 ca40Var = da40.Companion;
    }

    public /* synthetic */ sa40(int i, ka40 ka40Var, db40 db40Var, vb40 vb40Var, da40 da40Var, String str) {
        this.a = (i & 1) == 0 ? ma40.INSTANCE : ka40Var;
        if ((i & 2) == 0) {
            this.b = new db40(0);
        } else {
            this.b = db40Var;
        }
        if ((i & 4) == 0) {
            this.c = new vb40(0);
        } else {
            this.c = vb40Var;
        }
        if ((i & 8) == 0) {
            this.d = new da40(0);
        } else {
            this.d = da40Var;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa40)) {
            return false;
        }
        sa40 sa40Var = (sa40) obj;
        return jl40.l(this.a, sa40Var.a) && jl40.l(this.b, sa40Var.b) && jl40.l(this.c, sa40Var.c) && jl40.l(this.d, sa40Var.d) && jl40.l(this.e, sa40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtTrainCheckoutInfoResponse(action=");
        sb.append(this.a);
        sb.append(", mtTrainCheckoutOrderInfoDto=");
        sb.append(this.b);
        sb.append(", screenData=");
        sb.append(this.c);
        sb.append(", analyticsInfo=");
        sb.append(this.d);
        sb.append(", token=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public sa40() {
        ma40 ma40Var = ma40.INSTANCE;
        db40 db40Var = new db40(0);
        vb40 vb40Var = new vb40(0);
        da40 da40Var = new da40(0);
        this.a = ma40Var;
        this.b = db40Var;
        this.c = vb40Var;
        this.d = da40Var;
        this.e = "";
    }
}
