package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.childrouter.api.Animation;

/* loaded from: classes12.dex */
public final class ts11 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Integer e;
    public final Integer f;
    public final Animation g;
    public final Animation h;

    public ts11(boolean z, boolean z2, Integer num, Animation animation, Animation animation2, int i) {
        int i2 = (i & 1) != 0 ? 0 : 8;
        boolean z3 = (i & 2) == 0;
        z = (i & 4) != 0 ? true : z;
        z2 = (i & 16) != 0 ? false : z2;
        num = (i & 32) != 0 ? null : num;
        Integer num2 = (i & 64) != 0 ? null : 0;
        animation = (i & 128) != 0 ? Animation.COMMON : animation;
        animation2 = (i & 256) != 0 ? Animation.COMMON : animation2;
        this.a = i2;
        this.b = z3;
        this.c = z;
        this.d = z2;
        this.e = num;
        this.f = num2;
        this.g = animation;
        this.h = animation2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts11)) {
            return false;
        }
        ts11 ts11Var = (ts11) obj;
        return this.a == ts11Var.a && this.b == ts11Var.b && this.c == ts11Var.c && this.d == ts11Var.d && jl40.l(this.e, ts11Var.e) && jl40.l(this.f, ts11Var.f) && this.g == ts11Var.g && this.h == ts11Var.h;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(unr0.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, false), 31, this.d);
        Integer num = this.e;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiConfig(paddingDp=");
        sb.append(this.a);
        sb.append(", isBackgroundTransparent=");
        sb.append(this.b);
        sb.append(", shouldApplyShadow=");
        nnm.v(", shouldBeGone=false, hidePullBar=", ", collapsedStateTopPaddingDp=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", topWindowInsetsPadding=");
        sb.append(this.f);
        sb.append(", appearAnimation=");
        sb.append(this.g);
        sb.append(", disappearAnimation=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public ts11() {
        this(false, false, null, null, null, 511);
    }
}
