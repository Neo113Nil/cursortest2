package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uf6 implements xf6 {
    public final gdq0 a;

    public uf6(gdq0 gdq0Var) {
        this.a = gdq0Var;
    }

    @Override // defpackage.xf6
    public final boolean b() {
        return this.a.a().f == null;
    }

    @Override // defpackage.xf6
    public final gc5 c(Context context, boolean z) {
        gdq0 gdq0Var = this.a;
        String str = gdq0Var.a().a;
        rbv rbvVar = gdq0Var.a().d;
        Text.Constant i = g8e.i(Text.Companion, gdq0Var.a().b);
        String str2 = gdq0Var.a().c;
        return new ddq0(str, rbvVar, i, str2 != null ? new Text.Constant(str2) : null, z ? vng.t(txg0.ybsdk_ic_selected_payment_method, context) : vng.t(txg0.ybsdk_ic_unselected_payment_method, context), gdq0Var, true, z);
    }

    @Override // defpackage.xf6
    public final boolean d(String str) {
        return jl40.l(this.a.a().a, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf6) && this.a.equals(((uf6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Account(item=" + this.a + Extension.C_BRAKE;
    }
}
