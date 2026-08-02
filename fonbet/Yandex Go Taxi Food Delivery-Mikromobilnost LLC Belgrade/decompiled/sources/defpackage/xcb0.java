package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.pfm.internal.domain.entities.PfmTextEntity$Amount$SignType;
import java.math.BigDecimal;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xcb0 implements zcb0 {
    public final BigDecimal a;
    public final PfmTextEntity$Amount$SignType b;
    public final String c;
    public final ThemedImageUrlEntity d;
    public final ColorModel e;

    public xcb0(BigDecimal bigDecimal, PfmTextEntity$Amount$SignType pfmTextEntity$Amount$SignType, String str, ThemedImageUrlEntity themedImageUrlEntity, ColorModel colorModel) {
        this.a = bigDecimal;
        this.b = pfmTextEntity$Amount$SignType;
        this.c = str;
        this.d = themedImageUrlEntity;
        this.e = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcb0)) {
            return false;
        }
        xcb0 xcb0Var = (xcb0) obj;
        return jl40.l(this.a, xcb0Var.a) && this.b == xcb0Var.b && jl40.l(this.c, xcb0Var.c) && jl40.l(this.d, xcb0Var.d) && jl40.l(this.e, xcb0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.d;
        int hashCode3 = (hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        ColorModel colorModel = this.e;
        return hashCode3 + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Amount(amount=");
        sb.append(this.a);
        sb.append(", signType=");
        sb.append(this.b);
        sb.append(", currency=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", spoilerColor=");
        return n.o(sb, this.e, Extension.C_BRAKE);
    }
}
