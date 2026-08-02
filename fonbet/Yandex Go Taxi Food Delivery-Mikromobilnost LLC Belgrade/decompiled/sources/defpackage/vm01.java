package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vm01 {
    public final String a;
    public final ColorModel b;
    public final ColorModel c;
    public final ControlState d;
    public final fme e;
    public final zsv f;
    public final MoneyEntity g;
    public final MoneyEntity h;
    public final MoneyEntity i;

    public vm01(String str, ColorModel colorModel, ColorModel colorModel2, ControlState controlState, fme fmeVar, zsv zsvVar, MoneyEntity moneyEntity, MoneyEntity moneyEntity2, MoneyEntity moneyEntity3) {
        this.a = str;
        this.b = colorModel;
        this.c = colorModel2;
        this.d = controlState;
        this.e = fmeVar;
        this.f = zsvVar;
        this.g = moneyEntity;
        this.h = moneyEntity2;
        this.i = moneyEntity3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm01)) {
            return false;
        }
        vm01 vm01Var = (vm01) obj;
        return jl40.l(this.a, vm01Var.a) && this.b.equals(vm01Var.b) && this.c.equals(vm01Var.c) && this.d == vm01Var.d && this.e.equals(vm01Var.e) && this.f.equals(vm01Var.f) && this.g.equals(vm01Var.g) && jl40.l(this.h, vm01Var.h) && jl40.l(this.i, vm01Var.i);
    }

    public final int hashCode() {
        int d = ly3.d(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + vfc.d(this.c, vfc.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31, 31);
        MoneyEntity moneyEntity = this.h;
        int hashCode = (d + (moneyEntity == null ? 0 : moneyEntity.hashCode())) * 31;
        MoneyEntity moneyEntity2 = this.i;
        return hashCode + (moneyEntity2 != null ? moneyEntity2.hashCode() : 0);
    }

    public final String toString() {
        return "TransferPageWidgetWithToggleEntity(title=" + this.a + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", controlState=" + this.d + ", controlColor=" + this.e + ", infoButton=" + this.f + ", autoFundAmount=" + this.g + ", autoTopupAmount=" + this.h + ", autoTopupThreshold=" + this.i + Extension.C_BRAKE;
    }
}
