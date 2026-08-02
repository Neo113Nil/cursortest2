package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class upf0 {
    public final String a;
    public final DriveState b;
    public final List c;

    public upf0(String str, DriveState driveState, List list) {
        this.a = str;
        this.b = driveState;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upf0)) {
            return false;
        }
        upf0 upf0Var = (upf0) obj;
        return jl40.l(this.a, upf0Var.a) && this.b == upf0Var.b && this.c.equals(upf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiOrderAnalyticsModel(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", communications=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
