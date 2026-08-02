package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ltxd;", "", "Companion", "rxd", "sxd", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class txd {
    public static final sxd Companion = new sxd();
    public final String a;
    public final String b;
    public final Object c;

    public /* synthetic */ txd(String str, String str2, int i, Object obj) {
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
            this.c = null;
        } else {
            this.c = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txd)) {
            return false;
        }
        txd txdVar = (txd) obj;
        return jl40.l(this.a, txdVar.a) && jl40.l(this.b, txdVar.b) && jl40.l(this.c, txdVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Object obj = this.c;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return x4e.h(b64.v("ConditionDto(tariff=", this.a, ", requirementName=", this.b, ", requirementValue="), this.c, Extension.C_BRAKE);
    }

    public txd(int i) {
        this.a = "";
        this.b = "";
        this.c = null;
    }

    public txd() {
        this(0);
    }
}
