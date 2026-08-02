package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class xm20 {
    public static final wm20 Companion = new wm20();
    public static final i3y[] e = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new um20(0)), null, null};
    public final String a;
    public final List b;
    public final String c;
    public final String d;

    public /* synthetic */ xm20(String str, int i, String str2, String str3, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, vm20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm20)) {
            return false;
        }
        xm20 xm20Var = (xm20) obj;
        return jl40.l(this.a, xm20Var.a) && jl40.l(this.b, xm20Var.b) && jl40.l(this.c, xm20Var.c) && jl40.l(this.d, xm20Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(xvz.r("MobConfigParams(configId=", this.a, ", supportedApiNames=", this.b, ", countryCode="), this.c, ", fcmToken=", this.d, Extension.C_BRAKE);
    }

    public xm20(String str, String str2, String str3, List list) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
    }
}
