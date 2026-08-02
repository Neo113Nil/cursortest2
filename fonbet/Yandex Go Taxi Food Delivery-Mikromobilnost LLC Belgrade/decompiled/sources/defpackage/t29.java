package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.types.CashbackSelectionType;
import com.ybsdk.feature.cashback.impl.entities.types.CategoryID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class t29 implements x00, xm11 {
    public final String a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final rbv w;
    public final String x;
    public final CashbackSelectionType y;

    public t29(String str, Text.Constant constant, Text.Constant constant2, rbv rbvVar, String str2, CashbackSelectionType cashbackSelectionType) {
        this.a = str;
        this.b = constant;
        this.c = constant2;
        this.w = rbvVar;
        this.x = str2;
        this.y = cashbackSelectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t29)) {
            return false;
        }
        t29 t29Var = (t29) obj;
        return CategoryID.m401equalsimpl0(this.a, t29Var.a) && this.b.equals(t29Var.b) && this.c.equals(t29Var.c) && this.w.equals(t29Var.w) && jl40.l(this.x, t29Var.x) && this.y == t29Var.y;
    }

    @Override // defpackage.xm11
    public final CashbackSelectionType getType() {
        return this.y;
    }

    public final int hashCode() {
        return this.y.hashCode() + unr0.b(ly3.c(this.w, xvz.d(this.c, xvz.d(this.b, CategoryID.m402hashCodeimpl(this.a) * 31, 31), 31), 31), 31, this.x);
    }

    public final String toString() {
        return "CashbackCategoryEntity(categoryId=" + CategoryID.m403toStringimpl(this.a) + ", title=" + this.b + ", subtitle=" + this.c + ", image=" + this.w + ", percent=" + this.x + ", type=" + this.y + Extension.C_BRAKE;
    }
}
