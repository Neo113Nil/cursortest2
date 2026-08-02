package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.savings.internal.entities.CellType;
import com.ybsdk.feature.savings.internal.entities.SavingProductType;
import com.ybsdk.feature.savings.internal.entities.SavingsDivEntity$ProductType;
import com.ybsdk.widgets.common.ImageScaleTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class scm0 extends gc5 implements aam {
    public final String c;
    public final rr51 d;
    public final String e;
    public final ColorModel f;
    public final ThemedImageUrlEntity g;
    public final ImageScaleTypeEntity h;
    public final CellType i;
    public final SavingsDivEntity$ProductType j;

    public scm0(String str, rr51 rr51Var, String str2, ColorModel colorModel, ThemedImageUrlEntity themedImageUrlEntity, ImageScaleTypeEntity imageScaleTypeEntity, CellType cellType, SavingsDivEntity$ProductType savingsDivEntity$ProductType) {
        super(str == null ? "" : str, "");
        this.c = str;
        this.d = rr51Var;
        this.e = str2;
        this.f = colorModel;
        this.g = themedImageUrlEntity;
        this.h = imageScaleTypeEntity;
        this.i = cellType;
        this.j = savingsDivEntity$ProductType;
    }

    @Override // defpackage.aam
    public final boolean a() {
        return this.i == CellType.EXISTING;
    }

    public final ocm0 c() {
        SavingProductType savingProductType;
        int i = rcm0.a[this.j.ordinal()];
        if (i == 1) {
            savingProductType = SavingProductType.DEPOSIT;
        } else if (i == 2) {
            savingProductType = SavingProductType.INVESTMENT;
        } else {
            if (i != 3 && i != 4) {
                w511.b();
                return null;
            }
            savingProductType = SavingProductType.SAVER;
        }
        return new ocm0(this.d, this.f, this.i, savingProductType, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scm0)) {
            return false;
        }
        scm0 scm0Var = (scm0) obj;
        return jl40.l(this.c, scm0Var.c) && this.d.equals(scm0Var.d) && jl40.l(this.e, scm0Var.e) && jl40.l(this.f, scm0Var.f) && jl40.l(this.g, scm0Var.g) && this.h == scm0Var.h && this.i == scm0Var.i && this.j == scm0Var.j;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (this.d.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.e;
        int d = vfc.d(this.f, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ThemedImageUrlEntity themedImageUrlEntity = this.g;
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((d + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SavingsDivEntity(id=" + this.c + ", div=" + this.d + ", agreementId=" + this.e + ", backgroundColor=" + this.f + ", backgroundImage=" + this.g + ", backgroundImageScaleType=" + this.h + ", cellType=" + this.i + ", productType=" + this.j + Extension.C_BRAKE;
    }
}
