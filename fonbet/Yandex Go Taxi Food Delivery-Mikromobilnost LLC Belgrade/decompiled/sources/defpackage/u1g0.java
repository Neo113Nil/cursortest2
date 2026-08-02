package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class u1g0 {
    public final String a;
    public final Text b;
    public final String c;
    public final int d;

    public u1g0(String str, Text text, String str2, int i) {
        this.a = str;
        this.b = text;
        this.c = str2;
        this.d = i;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1g0)) {
            return false;
        }
        u1g0 u1g0Var = (u1g0) obj;
        return jl40.l(this.a, u1g0Var.a) && jl40.l(this.b, u1g0Var.b) && jl40.l(this.c, u1g0Var.c) && this.d == u1g0Var.d;
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return Integer.hashCode(this.d) + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "PushFeatureNotificationChannel(id=" + this.a + ", name=" + this.b + ", description=" + this.c + ", priority=" + this.d + Extension.C_BRAKE;
    }
}
