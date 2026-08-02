package defpackage;

import com.yandex.fintechsdk.data.config.api.model.RedirectionStrategy;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yru {
    public final List a;
    public final int b;
    public final int c;
    public final String d;
    public final RedirectionStrategy e;

    public yru(List list, int i, int i2, String str, RedirectionStrategy redirectionStrategy) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = redirectionStrategy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yru)) {
            return false;
        }
        yru yruVar = (yru) obj;
        return jl40.l(this.a, yruVar.a) && this.b == yruVar.b && this.c == yruVar.c && jl40.l(this.d, yruVar.d) && this.e == yruVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostApp(fingerprints=");
        sb.append(this.a);
        sb.append(", minAmVersionForRedirect=");
        sb.append(this.b);
        sb.append(", minPaySdkVersionForRedirect=");
        smw0.t(this.c, ", packageName=", this.d, ", redirectionStrategy=", sb);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
