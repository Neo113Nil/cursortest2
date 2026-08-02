package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.widgets.common.SuggestView$State$Behaviour;
import com.ybsdk.widgets.common.SuggestView$State$WidthType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class u9v0 {
    public final MoneyEntity a;
    public final String b;
    public final SuggestView$State$Behaviour c;
    public final SuggestView$State$WidthType d;
    public final boolean e;

    public u9v0(MoneyEntity moneyEntity, String str, SuggestView$State$Behaviour suggestView$State$Behaviour, SuggestView$State$WidthType suggestView$State$WidthType, boolean z) {
        this.a = moneyEntity;
        this.b = str;
        this.c = suggestView$State$Behaviour;
        this.d = suggestView$State$WidthType;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9v0)) {
            return false;
        }
        u9v0 u9v0Var = (u9v0) obj;
        return this.a.equals(u9v0Var.a) && jl40.l(this.b, u9v0Var.b) && this.c == u9v0Var.c && this.d == u9v0Var.d && this.e == u9v0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(money=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", behaviour=");
        sb.append(this.c);
        sb.append(", widthType=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
