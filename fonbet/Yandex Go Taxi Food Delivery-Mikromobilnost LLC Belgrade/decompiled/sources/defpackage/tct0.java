package defpackage;

import android.content.Context;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.address.experiment.e;

/* loaded from: classes5.dex */
public final class tct0 {
    public final Context a;
    public final i3y b = a.a(new gas0(16, this));

    public tct0(Context context) {
        this.a = context;
    }

    public final String a(e eVar, mct0 mct0Var, String str, pex0 pex0Var) {
        String str2 = mct0Var.d;
        CharSequence charSequence = mct0Var.g;
        Context context = this.a;
        if (str2 == null || str2.length() == 0) {
            if (jl40.l(charSequence, context.getString(kyh0.select_address_to))) {
                return String.valueOf(charSequence);
            }
            return context.getString(kyh0.select_address_to) + Extension.FIX_SPACE + ((Object) charSequence);
        }
        if (sct0.a[eVar.v.ordinal()] == 1) {
            return oyr.q(context.getString(kyh0.select_address_to), Extension.FIX_SPACE, str2, Extension.FIX_SPACE, str);
        }
        String string = context.getString(kyh0.select_address_to);
        String str3 = mct0Var.e;
        String b = b(pex0Var);
        if (b == null) {
            b = "";
        }
        return oyr.t(oyr.w(string, Extension.FIX_SPACE, str2, " ", str3), Extension.FIX_SPACE, b);
    }

    public final String b(pex0 pex0Var) {
        String str;
        if (pex0Var == null || (str = pex0Var.r.a) == null || evu0.J(str)) {
            return null;
        }
        return xw31.n(this.a) ? str.concat(" • ") : " • ".concat(str);
    }
}
