package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.models.data.experiment.StepType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxn0;", "", "Companion", "vn0", "wn0", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class xn0 {
    public static final wn0 Companion = new wn0();
    public static final i3y[] f = {a.b(LazyThreadSafetyMode.PUBLICATION, new ar(23)), null, null, null, null};
    public final StepType a;
    public final String b;
    public final String c;
    public final String d;
    public final cfi e;

    public xn0(int i, StepType stepType, String str, String str2, String str3, cfi cfiVar) {
        this.a = (i & 1) == 0 ? StepType.SOURCE : stepType;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) != 0) {
            this.e = cfiVar;
        } else {
            cfi.Companion.getClass();
            this.e = cfi.b;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn0)) {
            return false;
        }
        xn0 xn0Var = (xn0) obj;
        return this.a == xn0Var.a && jl40.l(this.b, xn0Var.b) && jl40.l(this.c, xn0Var.c) && jl40.l(this.d, xn0Var.d) && jl40.l(this.e, xn0Var.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdditionalStepConfig(type=");
        sb.append(this.a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", placeholder=", this.d, ", options=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public xn0() {
        StepType stepType = StepType.SOURCE;
        cfi.Companion.getClass();
        cfi cfiVar = cfi.b;
        this.a = stepType;
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = cfiVar;
    }
}
