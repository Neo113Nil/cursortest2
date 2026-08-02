package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class tk60 {
    public final int a;
    public final List b;
    public final List c;
    public final List d;

    public tk60(int i, List list, List list2, List list3) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk60)) {
            return false;
        }
        tk60 tk60Var = (tk60) obj;
        return this.a == tk60Var.a && jl40.l(this.b, tk60Var.b) && this.c.equals(tk60Var.c) && jl40.l(this.d, tk60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.c(unr0.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppliedNotifications(removedCount=");
        sb.append(this.a);
        sb.append(", reasons=");
        sb.append(this.b);
        sb.append(", newNotificationsCache=");
        return vfc.p(sb, this.c, ", notificationsToHandle=", this.d, Extension.C_BRAKE);
    }
}
