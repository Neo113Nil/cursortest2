package defpackage;

import android.content.Context;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sn70 extends un70 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sn70(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // defpackage.wn70
    public final Integer D(Context context) {
        return Integer.valueOf(qje.t(xng0.textMain, context));
    }

    @Override // defpackage.wn70
    public final Integer E(Context context) {
        return Integer.valueOf(qje.t(xng0.textMain, context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn70)) {
            return false;
        }
        sn70 sn70Var = (sn70) obj;
        return this.a == sn70Var.a && this.b == sn70Var.b && this.c == sn70Var.c && this.d == sn70Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    @Override // defpackage.wn70
    public final float j(Context context) {
        return tje.w(16, context);
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int l() {
        return this.d;
    }

    @Override // defpackage.wn70
    public final int n(Context context) {
        return qje.t(xng0.bgMinor, context);
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int o() {
        return this.b;
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int t() {
        return this.a;
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", headerSubtitleMaxLines=", Extension.C_BRAKE, b64.s(this.a, this.b, "Long(headerMinHeight=", ", headerDefaultHorizontalPadding=", ", headerTitleMaxLines="));
    }

    @Override // defpackage.un70, defpackage.wn70
    public final int u() {
        return this.c;
    }
}
