package defpackage;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes6.dex */
public abstract class wjq extends ndq {
    public static final HashSet e;
    public static final HashSet f;

    static {
        u0j u0jVar = u0j.b;
        e = vop.c(u0jVar);
        f = vop.c(u0jVar, u0j.a);
    }

    @Override // defpackage.ndq
    public pjc b(Context context) {
        context.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(frt.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ujq ujqVar = new ujq(q6k.m(v3g.D((frt) qdcVar.C(I)), new haq(5), q6k.g), 0);
        bdt I2 = hag.I(z66.class);
        qdc qdcVar2 = l18Var.a;
        qdcVar2.getClass();
        return new u21(10, ujqVar, zsd.b0(new ail(28, ((z66) qdcVar2.C(I2)).e(), this)), new ib3(3, 11, null));
    }

    public abstract HashSet d();
}
