package defpackage;

import android.widget.TextView;
import com.ybsdk.core.utils.ext.view.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class xo31 extends yo31 {
    public final TextView a;
    public final int b;
    public final int c;
    public final long d;

    public xo31(TextView textView, int i) {
        int g = b.g(ung0.ybColor_textIcon_secondary, textView);
        this.a = textView;
        this.b = i;
        this.c = g;
        this.d = 300L;
    }

    @Override // defpackage.yo31
    public final void a() {
        exa1.b(this.a, this.c, this.b, this.d);
    }

    @Override // defpackage.yo31
    public final void b() {
        exa1.b(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo31)) {
            return false;
        }
        xo31 xo31Var = (xo31) obj;
        return jl40.l(this.a, xo31Var.a) && this.b == xo31Var.b && this.c == xo31Var.c && this.d == xo31Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "TextColorAnimationTask(view=" + this.a + ", colorFrom=" + this.b + ", colorTo=" + this.c + ", duration=" + this.d + Extension.C_BRAKE;
    }
}
