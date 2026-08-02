package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.entities.types.PromoID;
import com.ybsdk.feature.cashback.impl.entities.types.PromoType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v00 {
    public final String a;
    public final String b;
    public final Text c;
    public final Text.Constant d;
    public final ArrayList e;

    public v00(String str, String str2, Text text, Text.Constant constant, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = text;
        this.d = constant;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v00)) {
            return false;
        }
        v00 v00Var = (v00) obj;
        return PromoID.m411equalsimpl0(this.a, v00Var.a) && PromoType.m421equalsimpl0(this.b, v00Var.b) && jl40.l(this.c, v00Var.c) && this.d.equals(v00Var.d) && this.e.equals(v00Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xvz.d(this.d, n.c(this.c, (PromoType.m422hashCodeimpl(this.b) + (PromoID.m412hashCodeimpl(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActiveCashbackPromoEntity(promoId=", PromoID.m413toStringimpl(this.a), ", promoType=", PromoType.m423toStringimpl(this.b), ", title=");
        v.append(this.c);
        v.append(", subtitle=");
        v.append(this.d);
        v.append(", categories=");
        return b64.n(Extension.C_BRAKE, v, this.e);
    }
}
