package yads;

import defpackage.ki61;
import defpackage.ma71;
import defpackage.ti81;
import defpackage.tls;
import defpackage.w071;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ck0 extends Lambda implements tls {
    public final /* synthetic */ w071 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck0(w071 w071Var, String str) {
        super(1);
        this.b = w071Var;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ma71 ma71Var = (ma71) obj;
        w071 w071Var = this.b;
        String str = this.c;
        ki61 ki61Var = (ki61) w071Var.d.remove(str);
        if (ki61Var != null) {
            w071Var.c.a.put(str, new ti81(ma71Var.a, ma71Var.b));
            w071Var.a(str, ki61Var, ma71Var.a, null);
        }
        return zy11.a;
    }
}
