package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.experiments.FormType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lzjl0;", "", "Companion", "xjl0", "yjl0", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class zjl0 {
    public static final yjl0 Companion = new yjl0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(11))};
    public final txd a;
    public final FormType b;

    public /* synthetic */ zjl0(int i, txd txdVar, FormType formType) {
        this.a = (i & 1) == 0 ? new txd(0) : txdVar;
        if ((i & 2) == 0) {
            this.b = FormType.UNKNOWN;
        } else {
            this.b = formType;
        }
    }

    public static final /* synthetic */ void b(zjl0 zjl0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(zjl0Var.a, new txd(0))) {
            yjdVar.e(serialDescriptor, 0, rxd.a, zjl0Var.a);
        }
        if (!yjdVar.F() && zjl0Var.b == FormType.UNKNOWN) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), zjl0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjl0)) {
            return false;
        }
        zjl0 zjl0Var = (zjl0) obj;
        return jl40.l(this.a, zjl0Var.a) && this.b == zjl0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RuleDto(condition=" + this.a + ", formType=" + this.b + Extension.C_BRAKE;
    }

    public zjl0() {
        txd txdVar = new txd(0);
        FormType formType = FormType.UNKNOWN;
        this.a = txdVar;
        this.b = formType;
    }
}
