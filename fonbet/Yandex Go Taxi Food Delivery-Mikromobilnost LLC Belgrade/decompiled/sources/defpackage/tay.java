package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class tay {
    public final Text.Constant a;
    public final ColorModel b;
    public final ColorModel c;

    public tay(Text.Constant constant, ColorModel colorModel, ColorModel colorModel2) {
        this.a = constant;
        this.b = colorModel;
        this.c = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tay)) {
            return false;
        }
        tay tayVar = (tay) obj;
        return this.a.equals(tayVar.a) && jl40.l(this.b, tayVar.b) && jl40.l(this.c, tayVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ColorModel colorModel = this.b;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.c;
        return hashCode2 + (colorModel2 != null ? colorModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegalAgreementEntity(html=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", linkColor=");
        return n.o(sb, this.c, Extension.C_BRAKE);
    }
}
