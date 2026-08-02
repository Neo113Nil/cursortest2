package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q8m0 extends e9m0 {
    public final String c;
    public final YbButtonView.a d;
    public final String e;

    public q8m0(String str, YbButtonView.a aVar, String str2) {
        super(str, 2);
        this.c = str;
        this.d = aVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8m0)) {
            return false;
        }
        q8m0 q8m0Var = (q8m0) obj;
        return jl40.l(this.c, q8m0Var.c) && this.d.equals(q8m0Var.d) && jl40.l(this.e, q8m0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Close(id=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", action=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
