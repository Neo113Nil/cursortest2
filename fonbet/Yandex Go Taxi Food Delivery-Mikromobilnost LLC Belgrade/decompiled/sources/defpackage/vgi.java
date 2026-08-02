package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvgi;", "Lxn11;", "Companion", "ugi", "tgi", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class vgi implements xn11 {
    public static final ugi Companion = new ugi();
    public static final vgi e = new vgi(0);
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ vgi(int i, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgi)) {
            return false;
        }
        vgi vgiVar = (vgi) obj;
        return this.b == vgiVar.b && this.c == vgiVar.c && this.d == vgiVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return x4e.i(qv10.u("DeliveryPaidInsuranceExperiment(isEnabled=", ", forceUseSavedState=", ", enabledByDefault=", this.b, this.c), this.d, Extension.C_BRAKE);
    }

    public vgi(int i) {
        this.b = false;
        this.c = false;
        this.d = false;
    }

    public vgi() {
        this(0);
    }
}
