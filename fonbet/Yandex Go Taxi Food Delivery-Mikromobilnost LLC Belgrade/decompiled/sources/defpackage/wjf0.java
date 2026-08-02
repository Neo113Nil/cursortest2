package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wjf0 extends s4z0 {
    public final bif0 a;
    public final FormattedText b;

    public wjf0(bif0 bif0Var, FormattedText formattedText) {
        this.a = bif0Var;
        this.b = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjf0)) {
            return false;
        }
        wjf0 wjf0Var = (wjf0) obj;
        return jl40.l(this.a, wjf0Var.a) && jl40.l(this.b, wjf0Var.b);
    }

    public final int hashCode() {
        bif0 bif0Var = this.a;
        int hashCode = (bif0Var == null ? 0 : bif0Var.hashCode()) * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText != null ? formattedText.a.hashCode() : 0);
    }

    public final String toString() {
        return "ProgressTileFooterModel(progressBar=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }

    public wjf0() {
        this(null, null);
    }
}
