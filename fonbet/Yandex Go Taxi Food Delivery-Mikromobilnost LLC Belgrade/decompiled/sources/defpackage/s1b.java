package defpackage;

import com.yandex.messaging.core.net.entities.GetStaffDataParam;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class s1b implements x08 {
    public static final /* synthetic */ kgx[] b;
    public final op3 a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("staffDataRequest", 0, "getStaffDataRequest()Lcom/yandex/messaging/Cancelable;", s1b.class);
        qoi0.a.getClass();
        b = new kgx[]{mutablePropertyReference1Impl};
    }

    public s1b(u1b u1bVar, String str) {
        op3 op3Var = new op3();
        this.a = op3Var;
        to3 to3Var = u1bVar.y.f;
        io9 io9Var = new io9(u1bVar);
        to3Var.getClass();
        GetStaffDataParam getStaffDataParam = new GetStaffDataParam();
        getStaffDataParam.nickname = str;
        xo3 a = to3Var.a.a(new io3(14, to3Var, getStaffDataParam, io9Var));
        kgx kgxVar = b[0];
        op3Var.b(a);
    }

    @Override // defpackage.x08
    public final void cancel() {
        kgx kgxVar = b[0];
        this.a.b(null);
    }
}
