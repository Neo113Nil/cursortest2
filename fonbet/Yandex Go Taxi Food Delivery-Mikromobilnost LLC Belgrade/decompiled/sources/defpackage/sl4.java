package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sl4 extends xl4 {
    public final String c;

    public sl4(String str) {
        super(BadgeModel$BadgePlace.SINGLE_RIGHT);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sl4) && jl40.l(this.c, ((sl4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("TrailIcon(imageTag=", this.c, Extension.C_BRAKE);
    }
}
