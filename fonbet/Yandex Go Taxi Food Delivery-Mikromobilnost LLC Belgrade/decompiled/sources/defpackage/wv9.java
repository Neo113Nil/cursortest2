package defpackage;

import com.yandex.go.chargers.discounts.list.ui.ChargersDiscountsListUiState$Content$DiscountsTabType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wv9 {
    public final ChargersDiscountsListUiState$Content$DiscountsTabType a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final List f;

    public wv9(ChargersDiscountsListUiState$Content$DiscountsTabType chargersDiscountsListUiState$Content$DiscountsTabType, CharSequence charSequence, boolean z, boolean z2, int i, List list) {
        this.a = chargersDiscountsListUiState$Content$DiscountsTabType;
        this.b = charSequence;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv9)) {
            return false;
        }
        wv9 wv9Var = (wv9) obj;
        return this.a == wv9Var.a && jl40.l(this.b, wv9Var.b) && this.c == wv9Var.c && this.d == wv9Var.d && this.e == wv9Var.e && this.f.equals(wv9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + oyr.b(this.e, unr0.e(unr0.e(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersDiscountsListTabUiState(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", isSelected=");
        nnm.v(", showBadge=", ", badgeCount=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", items=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
