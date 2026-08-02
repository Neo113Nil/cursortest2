package defpackage;

import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public abstract class q39 {
    public static final x49 a(p39 p39Var) {
        Text.Constant i = g8e.i(Text.Companion, p39Var.a);
        Text.Constant constant = new Text.Constant(g8e.p(p39Var.b, " ", p39Var.c));
        rbv f = job1.f(p39Var.d, new jv8(4));
        if (f == null) {
            f = new nbv(vxg0.ybsdk_account_placeholder_gray, null);
        }
        return new x49(i, constant, f);
    }
}
