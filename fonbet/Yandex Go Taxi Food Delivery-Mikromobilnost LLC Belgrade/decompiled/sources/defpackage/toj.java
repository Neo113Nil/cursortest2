package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class toj extends n351 {
    public final ArrayList c;
    public final boolean d;

    public toj(ArrayList arrayList, boolean z) {
        super("discount-showcase", false, 14);
        this.c = arrayList;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toj)) {
            return false;
        }
        toj tojVar = (toj) obj;
        return this.c.equals(tojVar.c) && this.d == tojVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "DiscountShowcaseState(coupons=" + this.c + ", isCollapsed=" + this.d + Extension.C_BRAKE;
    }
}
