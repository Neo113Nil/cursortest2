package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lxgj0;", "", "Companion", "ugj0", "vgj0", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class xgj0 {
    public static final vgj0 Companion = new vgj0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new zfj0(3))};
    public final String a;
    public final List b;

    public /* synthetic */ xgj0(int i, String str, List list) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.a;
        } else {
            this.b = list;
        }
    }

    public static final /* synthetic */ void b(xgj0 xgj0Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || !jl40.l(xgj0Var.a, "")) {
            yjdVar.o(serialDescriptor, 0, xgj0Var.a);
        }
        if (!yjdVar.F() && jl40.l(xgj0Var.b, EmptyList.a)) {
            return;
        }
        yjdVar.e(serialDescriptor, 1, (KSerializer) c[1].getValue(), xgj0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgj0)) {
            return false;
        }
        xgj0 xgj0Var = (xgj0) obj;
        return jl40.l(this.a, xgj0Var.a) && jl40.l(this.b, xgj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("RequirementGroup(title=", this.a, ", indices=", Extension.C_BRAKE, this.b);
    }

    public xgj0() {
        this.a = "";
        this.b = EmptyList.a;
    }
}
