package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.feature.qr.payments.api.data.PaymentInfoEntityType$SbpV3$Type;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x1a0 implements z1a0 {
    public final MoneyEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final ThemedImageUrlEntity e;
    public final ArrayList f;
    public final String g;
    public final String h;
    public final PageHeaderEntity i;
    public final PaymentInfoEntityType$SbpV3$Type j;

    public x1a0(MoneyEntity moneyEntity, String str, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, ArrayList arrayList, String str4, String str5, PageHeaderEntity pageHeaderEntity, PaymentInfoEntityType$SbpV3$Type paymentInfoEntityType$SbpV3$Type) {
        this.a = moneyEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = themedImageUrlEntity;
        this.f = arrayList;
        this.g = str4;
        this.h = str5;
        this.i = pageHeaderEntity;
        this.j = paymentInfoEntityType$SbpV3$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1a0)) {
            return false;
        }
        x1a0 x1a0Var = (x1a0) obj;
        return jl40.l(this.a, x1a0Var.a) && jl40.l(this.b, x1a0Var.b) && jl40.l(this.c, x1a0Var.c) && jl40.l(this.d, x1a0Var.d) && this.e.equals(x1a0Var.e) && this.f.equals(x1a0Var.f) && jl40.l(this.g, x1a0Var.g) && jl40.l(this.h, x1a0Var.h) && this.i.equals(x1a0Var.i) && this.j == x1a0Var.j;
    }

    public final int hashCode() {
        MoneyEntity moneyEntity = this.a;
        int hashCode = (moneyEntity == null ? 0 : moneyEntity.hashCode()) * 31;
        String str = this.b;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return this.j.hashCode() + ((this.i.hashCode() + unr0.b(unr0.b(ly3.b(xvz.c(this.e, (b + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31, this.f), 31, this.g), 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SbpV3(money=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", merchantName=");
        g8e.D(sb, this.c, ", merchantDescription=", this.d, ", merchantLogo=");
        sb.append(this.e);
        sb.append(", agreements=");
        sb.append(this.f);
        sb.append(", agreementsSheetTitle=");
        g8e.D(sb, this.g, ", qrcLink=", this.h, ", header=");
        sb.append(this.i);
        sb.append(", type=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
