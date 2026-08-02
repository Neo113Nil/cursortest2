package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.model.MtAnimationSourceType;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lwn30;", "Lwc30;", "Companion", "un30", "vn30", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class wn30 extends wc30 {
    public static final vn30 Companion = new vn30();
    public final int a;
    public final int b;
    public final double c;
    public final tc30 d;

    public /* synthetic */ wn30(int i, int i2, int i3, double d, tc30 tc30Var) {
        if ((i & 1) == 0) {
            this.a = 0;
        } else {
            this.a = i2;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i3;
        }
        if ((i & 4) == 0) {
            this.c = 0.0d;
        } else {
            this.c = d;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = tc30Var;
        }
    }

    @Override // defpackage.wc30
    public final MtAnimationSourceType a() {
        return MtAnimationSourceType.LOTTIE_ANIMATION;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn30)) {
            return false;
        }
        wn30 wn30Var = (wn30) obj;
        return this.a == wn30Var.a && this.b == wn30Var.b && Double.compare(this.c, wn30Var.c) == 0 && jl40.l(this.d, wn30Var.d);
    }

    public final int hashCode() {
        int a = unr0.a(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        tc30 tc30Var = this.d;
        return a + (tc30Var == null ? 0 : tc30Var.hashCode());
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "MtLottieAnimation(count=", ", tapCount=", ", delay=");
        s.append(this.c);
        s.append(", source=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }

    public wn30() {
        this.a = 0;
        this.b = 0;
        this.c = 0.0d;
        this.d = null;
    }
}
