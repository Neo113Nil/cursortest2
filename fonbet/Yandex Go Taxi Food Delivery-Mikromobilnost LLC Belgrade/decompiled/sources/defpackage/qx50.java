package defpackage;

import androidx.work.NetworkType;
import androidx.work.impl.constraints.controllers.a;

/* loaded from: classes.dex */
public final class qx50 extends a {
    static {
        hgz.o("NetworkNotRoamingCtrlr");
    }

    @Override // defpackage.d7e
    public final boolean a(fa51 fa51Var) {
        return fa51Var.j.a == NetworkType.NOT_ROAMING;
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final int c() {
        return 7;
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final boolean d(Object obj) {
        u060 u060Var = (u060) obj;
        return (u060Var.a && u060Var.d) ? false : true;
    }
}
