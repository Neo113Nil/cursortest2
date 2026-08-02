package defpackage;

import com.yandex.messaging.ui.settings.privacy.PrivacyType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w3f0 {
    public final PrivacyType a;
    public final List b;
    public final Integer c;
    public final boolean d;

    public w3f0(PrivacyType privacyType, List list, Integer num, boolean z) {
        this.a = privacyType;
        this.b = list;
        this.c = num;
        this.d = z;
    }

    public static w3f0 a(w3f0 w3f0Var, Integer num, boolean z, int i) {
        PrivacyType privacyType = w3f0Var.a;
        List list = w3f0Var.b;
        if ((i & 4) != 0) {
            num = w3f0Var.c;
        }
        w3f0Var.getClass();
        return new w3f0(privacyType, list, num, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3f0)) {
            return false;
        }
        w3f0 w3f0Var = (w3f0) obj;
        return this.a == w3f0Var.a && jl40.l(this.b, w3f0Var.b) && jl40.l(this.c, w3f0Var.c) && this.d == w3f0Var.d;
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((c + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "PrivacyItem(type=" + this.a + ", options=" + this.b + ", selectedOption=" + this.c + ", showProgress=" + this.d + Extension.C_BRAKE;
    }

    public /* synthetic */ w3f0(PrivacyType privacyType, List list) {
        this(privacyType, list, null, false);
    }
}
