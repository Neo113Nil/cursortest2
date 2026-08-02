package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tm01 {
    public final List a;
    public final MoneyEntity b;
    public final String c;
    public final String d;
    public final ActionButtonEntity e;
    public final boolean f;
    public final vm01 g;
    public final List h;

    public tm01(List list, MoneyEntity moneyEntity, String str, String str2, ActionButtonEntity actionButtonEntity, boolean z, vm01 vm01Var, List list2) {
        this.a = list;
        this.b = moneyEntity;
        this.c = str;
        this.d = str2;
        this.e = actionButtonEntity;
        this.f = z;
        this.g = vm01Var;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm01)) {
            return false;
        }
        tm01 tm01Var = (tm01) obj;
        return jl40.l(this.a, tm01Var.a) && jl40.l(this.b, tm01Var.b) && jl40.l(this.c, tm01Var.c) && jl40.l(this.d, tm01Var.d) && jl40.l(this.e, tm01Var.e) && this.f == tm01Var.f && jl40.l(this.g, tm01Var.g) && jl40.l(this.h, tm01Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MoneyEntity moneyEntity = this.b;
        int b = unr0.b((hashCode + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity = this.e;
        int e = unr0.e((hashCode2 + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31, 31, this.f);
        vm01 vm01Var = this.g;
        int hashCode3 = (e + (vm01Var == null ? 0 : vm01Var.hashCode())) * 31;
        List list = this.h;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferPageEntity(agreements=");
        sb.append(this.a);
        sb.append(", defaultMoneyValue=");
        sb.append(this.b);
        sb.append(", agreementsBottomSheetTitle=");
        g8e.D(sb, this.c, ", title=", this.d, ", primaryButton=");
        sb.append(this.e);
        sb.append(", isAmountEditable=");
        sb.append(this.f);
        sb.append(", widgetWithToggle=");
        sb.append(this.g);
        sb.append(", autotopupWhitelistNspkMembersConfirmation=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
