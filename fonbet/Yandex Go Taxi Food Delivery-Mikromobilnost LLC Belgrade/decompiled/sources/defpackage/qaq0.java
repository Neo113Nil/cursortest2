package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class qaq0 implements x00 {
    public final String a;
    public final Text b;
    public final Text c;
    public final ArrayList w;
    public final Text.Join x;

    public qaq0(String str, Text text, Text text2, ArrayList arrayList, Text.Join join) {
        this.a = str;
        this.b = text;
        this.c = text2;
        this.w = arrayList;
        this.x = join;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaq0)) {
            return false;
        }
        qaq0 qaq0Var = (qaq0) obj;
        return PromoID.m411equalsimpl0(this.a, qaq0Var.a) && jl40.l(this.b, qaq0Var.b) && jl40.l(this.c, qaq0Var.c) && this.w.equals(qaq0Var.w) && this.x.equals(qaq0Var.x);
    }

    public final int hashCode() {
        int c = n.c(this.b, PromoID.m412hashCodeimpl(this.a) * 31, 31);
        Text text = this.c;
        return this.x.hashCode() + ly3.b((c + (text == null ? 0 : text.hashCode())) * 31, 31, this.w);
    }

    public final String toString() {
        return "SelectCashbackButtonItem(promoId=" + PromoID.m413toStringimpl(this.a) + ", title=" + this.b + ", description=" + this.c + ", activeItems=" + this.w + ", activeItemsDescription=" + this.x + Extension.C_BRAKE;
    }
}
