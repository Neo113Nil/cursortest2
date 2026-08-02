package defpackage;

import android.view.View;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class w0w {
    public final View a;
    public final Integer b;
    public final long c;
    public final boolean d;

    public w0w(View view, Integer num, long j, boolean z) {
        this.a = view;
        this.b = num;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0w)) {
            return false;
        }
        w0w w0wVar = (w0w) obj;
        return jl40.l(this.a, w0wVar.a) && jl40.l(this.b, w0wVar.b) && e3n.d(this.c, w0wVar.c) && this.d == w0wVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        o430 o430Var = e3n.b;
        return Boolean.hashCode(this.d) + qv10.c(hashCode2, 31, this.c);
    }

    public final String toString() {
        String p = e3n.p(this.c);
        StringBuilder sb = new StringBuilder("TooltipConfig(anchorView=");
        sb.append(this.a);
        sb.append(", customMessageResId=");
        sb.append(this.b);
        sb.append(", timing=");
        return nnm.i(p, ", markAsShownIfClicked=", Extension.C_BRAKE, sb, this.d);
    }
}
