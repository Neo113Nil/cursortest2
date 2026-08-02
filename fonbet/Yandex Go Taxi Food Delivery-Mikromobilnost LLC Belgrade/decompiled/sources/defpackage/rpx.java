package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rpx {
    public final Text.Resource a;
    public final Text.Resource b;
    public final Text c;

    public rpx(Text.Resource resource, Text.Resource resource2, Text text) {
        this.a = resource;
        this.b = resource2;
        this.c = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpx)) {
            return false;
        }
        rpx rpxVar = (rpx) obj;
        return this.a.equals(rpxVar.a) && this.b.equals(rpxVar.b) && jl40.l(this.c, rpxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Preview(title=" + this.a + ", prompt=" + this.b + ", subtitle=" + this.c + Extension.C_BRAKE;
    }
}
