package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.internal.entities.FundRequestStatusSuccessResponseEntity$ResultScreen$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xps implements zps {
    public final FundRequestStatusSuccessResponseEntity$ResultScreen$Type a;
    public final ThemedImageUrlEntity b;
    public final Text c;
    public final Text d;
    public final ms e;

    public xps(FundRequestStatusSuccessResponseEntity$ResultScreen$Type fundRequestStatusSuccessResponseEntity$ResultScreen$Type, ThemedImageUrlEntity themedImageUrlEntity, Text text, Text text2, ms msVar) {
        this.a = fundRequestStatusSuccessResponseEntity$ResultScreen$Type;
        this.b = themedImageUrlEntity;
        this.c = text;
        this.d = text2;
        this.e = msVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xps)) {
            return false;
        }
        xps xpsVar = (xps) obj;
        return this.a == xpsVar.a && this.b.equals(xpsVar.b) && this.c.equals(xpsVar.c) && jl40.l(this.d, xpsVar.d) && this.e.equals(xpsVar.e);
    }

    public final int hashCode() {
        FundRequestStatusSuccessResponseEntity$ResultScreen$Type fundRequestStatusSuccessResponseEntity$ResultScreen$Type = this.a;
        int c = n.c(this.c, xvz.c(this.b, (fundRequestStatusSuccessResponseEntity$ResultScreen$Type == null ? 0 : fundRequestStatusSuccessResponseEntity$ResultScreen$Type.hashCode()) * 31, 31), 31);
        Text text = this.d;
        return this.e.hashCode() + ((c + (text != null ? text.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultScreen(type=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        ly3.C(sb, this.c, ", subtitle=", this.d, ", button=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
