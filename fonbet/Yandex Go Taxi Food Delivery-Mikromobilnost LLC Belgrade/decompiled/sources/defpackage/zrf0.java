package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zrf0 {
    public static final zrf0 c = new zrf0(EmptyList.a, false);
    public final List a;
    public final boolean b;

    public zrf0(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrf0)) {
            return false;
        }
        zrf0 zrf0Var = (zrf0) obj;
        return this.a.equals(zrf0Var.a) && this.b == zrf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.o(this.a, "PromotionBannersInfo(banners=", ", isAutoScrollEnabled=", Extension.C_BRAKE, this.b);
    }
}
