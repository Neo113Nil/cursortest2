package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zk4 extends pl4 {
    public final bl4 c;
    public final jzr0 d;

    public zk4(bl4 bl4Var, jzr0 jzr0Var) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_RIGHT);
        this.c = bl4Var;
        this.d = jzr0Var;
    }

    @Override // defpackage.pl4
    public final bl4 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk4)) {
            return false;
        }
        zk4 zk4Var = (zk4) obj;
        return jl40.l(this.c, zk4Var.c) && jl40.l(this.d, zk4Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Advertisement(base=" + this.c + ", info=" + this.d + Extension.C_BRAKE;
    }
}
