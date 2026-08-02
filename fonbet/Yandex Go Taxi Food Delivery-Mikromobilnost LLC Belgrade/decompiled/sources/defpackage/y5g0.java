package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.json.d;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class y5g0 {
    public static final x5g0 Companion = new x5g0();
    public static final i3y[] g = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(23)), null, null, null};
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final d e;
    public final d f;

    public /* synthetic */ y5g0(int i, String str, String str2, List list, String str3, d dVar, d dVar2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, w5g0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = "M";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = qcx.b(Double.valueOf(0.6d));
        } else {
            this.e = dVar;
        }
        if ((i & 32) == 0) {
            this.f = qcx.b(Double.valueOf(1.0d));
        } else {
            this.f = dVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5g0)) {
            return false;
        }
        y5g0 y5g0Var = (y5g0) obj;
        return jl40.l(this.a, y5g0Var.a) && jl40.l(this.b, y5g0Var.b) && jl40.l(this.c, y5g0Var.c) && jl40.l(this.d, y5g0Var.d) && jl40.l(this.e, y5g0Var.e) && jl40.l(this.f, y5g0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("QrCodeCustomProps(color=", this.a, ", value=", this.b, ", cutouts=");
        oyr.D(", errorCorrectionLevel=", this.d, ", finderCornerRadius=", v, this.c);
        v.append(this.e);
        v.append(", moduleCornerRadius=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
