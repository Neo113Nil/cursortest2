package defpackage;

import com.yandex.plus.pay.ui.tarifficator.api.PlusTarifficatorPaymentConfiguration$PreferredMode;
import java.util.Map;
import kotlin.collections.EmptySet;

/* loaded from: classes2.dex */
public final class wnd0 {
    public final PlusTarifficatorPaymentConfiguration$PreferredMode a;
    public final Map b;

    public wnd0(PlusTarifficatorPaymentConfiguration$PreferredMode plusTarifficatorPaymentConfiguration$PreferredMode, Map map) {
        this.a = plusTarifficatorPaymentConfiguration$PreferredMode;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnd0)) {
            return false;
        }
        wnd0 wnd0Var = (wnd0) obj;
        EmptySet emptySet = EmptySet.a;
        return emptySet.equals(emptySet) && this.a == wnd0Var.a && jl40.l(this.b, wnd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusTarifficatorPaymentConfiguration(screensToSkip=");
        sb.append(EmptySet.a);
        sb.append(", paymentMethodId=null, preferredMode=");
        sb.append(this.a);
        sb.append(", externalCallerPayload=");
        return smw0.n(sb, this.b, ')');
    }
}
