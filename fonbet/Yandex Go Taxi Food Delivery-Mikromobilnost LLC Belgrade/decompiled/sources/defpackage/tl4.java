package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class tl4 extends pl4 {
    public final bl4 c;

    public tl4(bl4 bl4Var) {
        super(BadgeModel$BadgePlace.MULTY_RIGHT);
        this.c = bl4Var;
    }

    @Override // defpackage.pl4
    public final bl4 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl4) && jl40.l(this.c, ((tl4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "TrailLabel(base=" + this.c + Extension.C_BRAKE;
    }
}
