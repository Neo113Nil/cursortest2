package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u2z0 {
    public final String a;
    public final wp2 b;

    public u2z0(String str, wp2 wp2Var) {
        this.a = str;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2z0)) {
            return false;
        }
        u2z0 u2z0Var = (u2z0) obj;
        return jl40.l(this.a, u2z0Var.a) && jl40.l(this.b, u2z0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TicketTextContent(content=" + this.a + ", color=" + this.b + Extension.C_BRAKE;
    }

    public u2z0() {
        this(0);
    }

    public /* synthetic */ u2z0(int i) {
        this("", AppColor$Palette.Text);
    }
}
