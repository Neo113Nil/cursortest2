package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class utw {
    public final List a;
    public final String b;
    public final PageHeaderEntity c;

    public utw(List list, String str, PageHeaderEntity pageHeaderEntity) {
        this.a = list;
        this.b = str;
        this.c = pageHeaderEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utw)) {
            return false;
        }
        utw utwVar = (utw) obj;
        return this.a.equals(utwVar.a) && this.b.equals(utwVar.b) && this.c.equals(utwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder s = xvz.s("InternetPaymentSelectProviderSuccessState(providers=", this.a, ", filterText=", this.b, ", header=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
