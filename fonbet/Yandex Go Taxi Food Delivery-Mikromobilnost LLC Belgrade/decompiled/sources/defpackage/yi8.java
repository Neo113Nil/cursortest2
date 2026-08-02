package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yi8 implements zi8 {
    public final boolean a;
    public final Integer b;

    public yi8(boolean z, Integer num) {
        this.a = z;
        this.b = num;
    }

    @Override // defpackage.zi8
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi8)) {
            return false;
        }
        yi8 yi8Var = (yi8) obj;
        return this.a == yi8Var.a && jl40.l(this.b, yi8Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "WrapContentHeight(isSlideable=" + this.a + ", skeletonHeight=" + this.b + Extension.C_BRAKE;
    }
}
