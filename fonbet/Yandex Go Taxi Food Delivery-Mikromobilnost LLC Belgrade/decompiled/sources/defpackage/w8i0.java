package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class w8i0 {
    public static final /* synthetic */ int c = 0;
    public final v8i0 a;
    public final v8i0 b;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public w8i0(v8i0 v8i0Var, v8i0 v8i0Var2) {
        this.a = v8i0Var;
        this.b = v8i0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8i0)) {
            return false;
        }
        w8i0 w8i0Var = (w8i0) obj;
        return jl40.l(this.a, w8i0Var.a) && jl40.l(this.b, w8i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RatingSelectorItemsDecoration(selectedDecoration=" + this.a + ", unselectedDecoration=" + this.b + Extension.C_BRAKE;
    }
}
