package defpackage;

import com.yandex.plus.core.data.common.PlusColor;

/* loaded from: classes2.dex */
public final class wj4 {
    public final PlusColor.Color a;
    public final String b;
    public final h2d0 c;

    public wj4(PlusColor.Color color, String str, h2d0 h2d0Var) {
        this.a = color;
        this.b = str;
        this.c = h2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj4)) {
            return false;
        }
        wj4 wj4Var = (wj4) obj;
        return this.a.equals(wj4Var.a) && this.b.equals(wj4Var.b) && jl40.l(this.c, wj4Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        h2d0 h2d0Var = this.c;
        return b + (h2d0Var == null ? 0 : h2d0Var.hashCode());
    }

    public final String toString() {
        return "BadgeContent(backgroundColor=" + this.a + ", text=" + this.b + ", textDrawableHolder=" + this.c + ')';
    }
}
