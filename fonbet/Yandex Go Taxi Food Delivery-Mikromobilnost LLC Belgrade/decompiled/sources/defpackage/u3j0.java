package defpackage;

import com.ybsdk.feature.pdf.internal.network.dto.ReportStatusTypeDto;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class u3j0 {
    public final String a;
    public final String b;
    public final ReportStatusTypeDto c;
    public final List d;

    public u3j0(String str, String str2, ReportStatusTypeDto reportStatusTypeDto, List list) {
        this.a = str;
        this.b = str2;
        this.c = reportStatusTypeDto;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3j0)) {
            return false;
        }
        u3j0 u3j0Var = (u3j0) obj;
        return jl40.l(this.a, u3j0Var.a) && jl40.l(this.b, u3j0Var.b) && this.c == u3j0Var.c && this.d.equals(u3j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ReportStatus(id=", this.a, ", type=", this.b, ", status=");
        v.append(this.c);
        v.append(", files=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
