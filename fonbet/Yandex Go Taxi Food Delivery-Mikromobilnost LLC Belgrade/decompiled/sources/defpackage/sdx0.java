package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sdx0 implements bex0 {
    public final fx8 a;

    public sdx0(fx8 fx8Var) {
        this.a = fx8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdx0) && jl40.l(this.a, ((sdx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarouselCellAction(carouselCellUiAction=" + this.a + Extension.C_BRAKE;
    }
}
