package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sh50 {
    public static final sh50 c = new sh50(0);
    public final List a;
    public final boolean b;

    public sh50(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh50)) {
            return false;
        }
        sh50 sh50Var = (sh50) obj;
        return jl40.l(this.a, sh50Var.a) && this.b == sh50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "NddAddressFlowSwitchButtonsState(buttons=", ", needRefreshButtons=", Extension.C_BRAKE, this.b);
    }

    public sh50() {
        this(0);
    }

    public /* synthetic */ sh50(int i) {
        this(EmptyList.a, false);
    }
}
