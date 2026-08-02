package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class utj implements uni {
    public final FormattedText a;
    public final nsj b;
    public final FormattedText c;
    public final nsj w;

    public utj(FormattedText formattedText, nsj nsjVar, FormattedText formattedText2, nsj nsjVar2) {
        this.a = formattedText;
        this.b = nsjVar;
        this.c = formattedText2;
        this.w = nsjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utj)) {
            return false;
        }
        utj utjVar = (utj) obj;
        return jl40.l(this.a, utjVar.a) && jl40.l(this.b, utjVar.b) && jl40.l(this.c, utjVar.c) && jl40.l(this.w, utjVar.w);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        nsj nsjVar = this.b;
        int c = unr0.c((hashCode + (nsjVar == null ? 0 : nsjVar.hashCode())) * 31, 31, this.c.a);
        nsj nsjVar2 = this.w;
        return c + (nsjVar2 != null ? nsjVar2.hashCode() : 0);
    }

    public final String toString() {
        return "DiscoveryMapArgs(title=" + this.a + ", headerIcon=" + this.b + ", searchFieldTitle=" + this.c + ", searchFieldIcon=" + this.w + Extension.C_BRAKE;
    }
}
