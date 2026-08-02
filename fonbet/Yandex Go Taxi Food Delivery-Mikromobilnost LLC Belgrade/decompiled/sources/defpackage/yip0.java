package defpackage;

import flex.feature.sections.action.ScrollPositionSurrogate;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = djp0.class)
/* loaded from: classes9.dex */
public final class yip0 extends kr {
    public static final xip0 Companion = new xip0();
    public final String a;
    public final ScrollPositionSurrogate b;
    public final int c;
    public final boolean d;

    public yip0(String str, ScrollPositionSurrogate scrollPositionSurrogate, int i, boolean z) {
        this.a = str;
        this.b = scrollPositionSurrogate;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yip0.class != obj.getClass()) {
            return false;
        }
        yip0 yip0Var = (yip0) obj;
        return jl40.l(this.a, yip0Var.a) && this.b == yip0Var.b && this.c == yip0Var.c && this.d == yip0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + this.c) * 31);
    }

    public final String toString() {
        return "ScrollToItemAction(itemId=" + this.a + ", scrollPosition=" + this.b + ", offset=" + this.c + ", animated=" + this.d + Extension.C_BRAKE;
    }
}
