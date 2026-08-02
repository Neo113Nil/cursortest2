package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lsf40;", "", "Companion", "qf40", "rf40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class sf40 {
    public static final rf40 Companion = new rf40();
    public final String a;
    public final String b;
    public final boolean c;

    public /* synthetic */ sf40(String str, int i, String str2, boolean z) {
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
            this.c = false;
        } else {
            this.c = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf40)) {
            return false;
        }
        sf40 sf40Var = (sf40) obj;
        return jl40.l(this.a, sf40Var.a) && jl40.l(this.b, sf40Var.b) && this.c == sf40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("MtTrainModalItem(id=", this.a, ", title=", this.b, ", isDefault="), this.c, Extension.C_BRAKE);
    }

    public sf40() {
        this.a = "";
        this.b = "";
        this.c = false;
    }
}
