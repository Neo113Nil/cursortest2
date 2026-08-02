package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;

/* loaded from: classes15.dex */
public final class us01 {
    public final w530 a;

    public us01(w530 w530Var) {
        this.a = w530Var;
    }

    public static stz0 b(Text text, Text text2, rbv rbvVar) {
        return new stz0(text, text2, null, rbvVar, null, null, false, null, null, null, null, null, 32756);
    }

    public final String a(ns01 ns01Var, Context context) {
        if (!evu0.J(ns01Var.i)) {
            return ns01Var.i;
        }
        int i = ts01.b[ns01Var.n.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "";
            }
            w511.b();
            return null;
        }
        return context.getString(dzh0.ybsdk_transfer_default_error_message, w530.a(this.a, ns01Var.e, ns01Var.f, false, null, false, 60), ns01Var.d, ns01Var.c, ns01Var.a);
    }
}
