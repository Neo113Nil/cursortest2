package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ql4 extends pl4 {
    public final bl4 c;
    public final int d;

    public ql4(bl4 bl4Var, int i) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_LEFT);
        this.c = bl4Var;
        this.d = i;
    }

    @Override // defpackage.pl4
    public final bl4 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql4)) {
            return false;
        }
        ql4 ql4Var = (ql4) obj;
        return jl40.l(this.c, ql4Var.c) && this.d == ql4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Sticker(base=" + this.c + ", rotationAngle=" + this.d + Extension.C_BRAKE;
    }
}
