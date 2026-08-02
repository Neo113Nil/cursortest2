package defpackage;

import com.ybsdk.core.common.domain.entities.ColoredTextEntity;
import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tw8 {
    public final ColorModel a;
    public final ColoredTextEntity b;
    public final ColoredTextEntity c;
    public final rbv d;
    public final rbv e;
    public final String f;
    public final String g;

    public tw8(ColorModel colorModel, ColoredTextEntity coloredTextEntity, ColoredTextEntity coloredTextEntity2, rbv rbvVar, rbv rbvVar2, String str, String str2) {
        this.a = colorModel;
        this.b = coloredTextEntity;
        this.c = coloredTextEntity2;
        this.d = rbvVar;
        this.e = rbvVar2;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw8)) {
            return false;
        }
        tw8 tw8Var = (tw8) obj;
        return this.a.equals(tw8Var.a) && this.b.equals(tw8Var.b) && this.c.equals(tw8Var.c) && jl40.l(this.d, tw8Var.d) && jl40.l(this.e, tw8Var.e) && jl40.l(this.f, tw8Var.f) && jl40.l(this.g, tw8Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        rbv rbvVar = this.d;
        int hashCode2 = (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        rbv rbvVar2 = this.e;
        int hashCode3 = (hashCode2 + (rbvVar2 == null ? 0 : rbvVar2.hashCode())) * 31;
        String str = this.f;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselCardBackdropEntity(backgroundColor=");
        sb.append(this.a);
        sb.append(", amount=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", actionImage=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", analyticsId=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
