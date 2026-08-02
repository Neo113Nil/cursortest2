package defpackage;

import com.yandex.mobile.ads.R$style;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class vl71 {
    public final String a;
    public final int b;
    public final int c;

    public vl71(String str, int i) {
        int i2 = R$style.DebugPanelText_Body2;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl71)) {
            return false;
        }
        vl71 vl71Var = (vl71) obj;
        return jl40.l(this.a, vl71Var.a) && this.b == vl71Var.b && this.c == vl71Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fia1.b(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "DebugPanelColoredText(text=", this.a, ", color=", ", style="));
    }

    public vl71(int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
