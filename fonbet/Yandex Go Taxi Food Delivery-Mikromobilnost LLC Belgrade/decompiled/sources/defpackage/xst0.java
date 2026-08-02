package defpackage;

import com.ybsdk.feature.split.deposit.internal.ui.b;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xst0 {
    public final b a;
    public final List b;

    public xst0(b bVar, List list) {
        this.a = bVar;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final b b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xst0)) {
            return false;
        }
        xst0 xst0Var = (xst0) obj;
        return this.a.equals(xst0Var.a) && this.b.equals(xst0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SplitDepositAutoTopupStatusViewState(partnerSelectionProgressViewState=" + this.a + ", divkitLocalVariables=" + this.b + Extension.C_BRAKE;
    }
}
