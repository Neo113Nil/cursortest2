package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class vf6 implements xf6 {
    public final int a;
    public final el0 b;

    public vf6(int i, el0 el0Var) {
        this.a = i;
        this.b = el0Var;
    }

    @Override // defpackage.xf6
    public final boolean b() {
        return false;
    }

    @Override // defpackage.xf6
    public final gc5 c(Context context, boolean z) {
        String i = oyr.i(this.a, "button_");
        el0 el0Var = this.b;
        rbv rbvVar = el0Var.c;
        Text.Constant i2 = g8e.i(Text.Companion, el0Var.a);
        String str = el0Var.b;
        return new ddq0(i, rbvVar, i2, str != null ? new Text.Constant(str) : null, vng.t(txg0.ybsdk_ic_arrow_short_forward, context), new idq0(el0Var), false, false);
    }

    @Override // defpackage.xf6
    public final boolean d(String str) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf6)) {
            return false;
        }
        vf6 vf6Var = (vf6) obj;
        return this.a == vf6Var.a && jl40.l(this.b, vf6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Button(index=" + this.a + ", item=" + this.b + Extension.C_BRAKE;
    }
}
