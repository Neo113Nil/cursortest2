package defpackage;

import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class u4q0 extends b5q0 {
    public final Set d;

    public u4q0(Set set) {
        super("order", true, false);
        this.d = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4q0) && jl40.l(this.d, ((u4q0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "OrdersChangedTrigger(orders=" + this.d + Extension.C_BRAKE;
    }
}
