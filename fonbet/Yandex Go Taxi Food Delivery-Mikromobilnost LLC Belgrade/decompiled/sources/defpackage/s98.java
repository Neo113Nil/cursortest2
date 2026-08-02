package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationInputState;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardCvvValidationResult;
import com.ybsdk.feature.card.internal.presentation.cardactivation.CardNumberValidationResult;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s98 {
    public final String a;
    public final String b;
    public final CardActivationInputState c;
    public final p98 d;
    public final ffb1 e;
    public final CardCvvValidationResult f;
    public final CardNumberValidationResult g;
    public final YBProduct h;
    public final bp8 i;
    public final ColorModel j;
    public final ColorModel k;
    public final ColorModel l;
    public final ColorModel m;
    public final ColorModel n;
    public final String o;

    public s98(String str, String str2, CardActivationInputState cardActivationInputState, p98 p98Var, ffb1 ffb1Var, CardCvvValidationResult cardCvvValidationResult, CardNumberValidationResult cardNumberValidationResult, YBProduct yBProduct, bp8 bp8Var, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, String str3) {
        this.a = str;
        this.b = str2;
        this.c = cardActivationInputState;
        this.d = p98Var;
        this.e = ffb1Var;
        this.f = cardCvvValidationResult;
        this.g = cardNumberValidationResult;
        this.h = yBProduct;
        this.i = bp8Var;
        this.j = colorModel;
        this.k = colorModel2;
        this.l = colorModel3;
        this.m = colorModel4;
        this.n = colorModel5;
        this.o = str3;
    }

    public static s98 a(s98 s98Var, String str, String str2, CardActivationInputState cardActivationInputState, p98 p98Var, ffb1 ffb1Var, CardCvvValidationResult cardCvvValidationResult, CardNumberValidationResult cardNumberValidationResult, YBProduct yBProduct, bp8 bp8Var, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, ColorModel colorModel5, String str3, int i) {
        String str4 = (i & 1) != 0 ? s98Var.a : str;
        String str5 = (i & 2) != 0 ? s98Var.b : str2;
        CardActivationInputState cardActivationInputState2 = (i & 4) != 0 ? s98Var.c : cardActivationInputState;
        p98 p98Var2 = (i & 8) != 0 ? s98Var.d : p98Var;
        ffb1 ffb1Var2 = (i & 16) != 0 ? s98Var.e : ffb1Var;
        CardCvvValidationResult cardCvvValidationResult2 = (i & 32) != 0 ? s98Var.f : cardCvvValidationResult;
        CardNumberValidationResult cardNumberValidationResult2 = (i & 64) != 0 ? s98Var.g : cardNumberValidationResult;
        YBProduct yBProduct2 = (i & 128) != 0 ? s98Var.h : yBProduct;
        bp8 bp8Var2 = (i & 256) != 0 ? s98Var.i : bp8Var;
        ColorModel colorModel6 = (i & 512) != 0 ? s98Var.j : colorModel;
        ColorModel colorModel7 = (i & 1024) != 0 ? s98Var.k : colorModel2;
        ColorModel colorModel8 = (i & 2048) != 0 ? s98Var.l : colorModel3;
        ColorModel colorModel9 = (i & 4096) != 0 ? s98Var.m : colorModel4;
        ColorModel colorModel10 = (i & 8192) != 0 ? s98Var.n : colorModel5;
        String str6 = (i & 16384) != 0 ? s98Var.o : str3;
        s98Var.getClass();
        return new s98(str4, str5, cardActivationInputState2, p98Var2, ffb1Var2, cardCvvValidationResult2, cardNumberValidationResult2, yBProduct2, bp8Var2, colorModel6, colorModel7, colorModel8, colorModel9, colorModel10, str6);
    }

    public final String b() {
        String str;
        String str2 = this.b;
        p98 p98Var = this.d;
        if (p98Var != null && (str = p98Var.c) != null) {
            if (evu0.J(str)) {
                str = null;
            }
            if (str != null) {
                return g8e.p(str, " ", str2);
            }
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s98)) {
            return false;
        }
        s98 s98Var = (s98) obj;
        return this.a.equals(s98Var.a) && this.b.equals(s98Var.b) && this.c == s98Var.c && jl40.l(this.d, s98Var.d) && jl40.l(this.e, s98Var.e) && this.f == s98Var.f && this.g == s98Var.g && this.h == s98Var.h && this.i.equals(s98Var.i) && jl40.l(this.j, s98Var.j) && jl40.l(this.k, s98Var.k) && jl40.l(this.l, s98Var.l) && jl40.l(this.m, s98Var.m) && jl40.l(this.n, s98Var.n) && jl40.l(this.o, s98Var.o);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        p98 p98Var = this.d;
        int hashCode2 = (hashCode + (p98Var == null ? 0 : p98Var.hashCode())) * 31;
        ffb1 ffb1Var = this.e;
        int hashCode3 = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((hashCode2 + (ffb1Var == null ? 0 : ffb1Var.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        ColorModel colorModel = this.j;
        int hashCode4 = (hashCode3 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.k;
        int hashCode5 = (hashCode4 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31;
        ColorModel colorModel3 = this.l;
        int hashCode6 = (hashCode5 + (colorModel3 == null ? 0 : colorModel3.hashCode())) * 31;
        ColorModel colorModel4 = this.m;
        int hashCode7 = (hashCode6 + (colorModel4 == null ? 0 : colorModel4.hashCode())) * 31;
        ColorModel colorModel5 = this.n;
        int hashCode8 = (hashCode7 + (colorModel5 == null ? 0 : colorModel5.hashCode())) * 31;
        String str = this.o;
        return hashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CardActivationState(cardCvv=", this.a, ", cardNumber=", this.b, ", inputState=");
        v.append(this.c);
        v.append(", activationInfo=");
        v.append(this.d);
        v.append(", activationStatus=");
        v.append(this.e);
        v.append(", cvvValidationResult=");
        v.append(this.f);
        v.append(", numberValidationResult=");
        v.append(this.g);
        v.append(", productForSkin=");
        v.append(this.h);
        v.append(", remoteCardSkin=");
        v.append(this.i);
        v.append(", textColor=");
        v.append(this.j);
        v.append(", inputTextColor=");
        smw0.z(v, this.k, ", placeholderColor=", this.l, ", inputLabelColor=");
        smw0.z(v, this.m, ", cardInputBackgroundTint=", this.n, ", operationId=");
        return oyr.t(v, this.o, Extension.C_BRAKE);
    }
}
