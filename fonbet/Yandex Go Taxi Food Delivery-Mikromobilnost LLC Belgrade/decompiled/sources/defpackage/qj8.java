package defpackage;

import android.widget.ImageView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qj8 {
    public final z22 a;
    public final b5n b;
    public final ImageView c;
    public final boolean d;
    public final String e;

    public qj8(z22 z22Var, b5n b5nVar, ImageView imageView, boolean z, String str) {
        this.a = z22Var;
        this.b = b5nVar;
        this.c = imageView;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj8)) {
            return false;
        }
        qj8 qj8Var = (qj8) obj;
        return jl40.l(this.a, qj8Var.a) && jl40.l(this.b, qj8Var.b) && this.c.equals(qj8Var.c) && this.d == qj8Var.d && jl40.l(this.e, qj8Var.e);
    }

    public final int hashCode() {
        z22 z22Var = this.a;
        int hashCode = (z22Var == null ? 0 : z22Var.hashCode()) * 31;
        b5n b5nVar = this.b;
        int e = unr0.e((this.c.hashCode() + ((hashCode + (b5nVar == null ? 0 : b5nVar.hashCode())) * 31)) * 31, 31, this.d);
        String str = this.e;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLoadContext(analytics=");
        sb.append(this.a);
        sb.append(", binWrapper=");
        sb.append(this.b);
        sb.append(", imageView=");
        sb.append(this.c);
        sb.append(", isDynamicBinEnabled=");
        sb.append(this.d);
        sb.append(", trackedIconUrl=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
