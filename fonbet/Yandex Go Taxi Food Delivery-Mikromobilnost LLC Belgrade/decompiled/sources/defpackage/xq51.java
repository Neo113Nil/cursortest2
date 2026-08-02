package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.ResultScreenHeader;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class xq51 implements ar51 {
    public final String a;
    public final ResultScreenHeader b;
    public final String c;

    public xq51(String str, ResultScreenHeader resultScreenHeader, String str2) {
        this.a = str;
        this.b = resultScreenHeader;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq51)) {
            return false;
        }
        xq51 xq51Var = (xq51) obj;
        return jl40.l(this.a, xq51Var.a) && this.b.equals(xq51Var.b) && jl40.l(this.c, xq51Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Found(receiverName=");
        sb.append(this.a);
        sb.append(", resultScreenHeader=");
        sb.append(this.b);
        sb.append(", requestId=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
