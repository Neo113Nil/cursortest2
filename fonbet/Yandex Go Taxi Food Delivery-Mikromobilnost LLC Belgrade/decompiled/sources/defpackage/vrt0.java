package defpackage;

import android.content.Context;
import com.yandex.go.address.search.perf.c;
import com.yandex.go.preorder.suggested.menu.experiment.g;
import com.yandex.go.splash.v2.d;
import com.ybsdk.feature.persistence.api.StorageType;
import com.ybsdk.persistence.b;

/* loaded from: classes8.dex */
public final class vrt0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ vrt0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 1;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new d((rqo) xvf0Var.get());
            case 1:
                return new n1u0((pho) xvf0Var.get());
            case 2:
                return new qc20((l7x0) xvf0Var.get());
            case 3:
                return new d6u0(i5m.a(xvf0Var));
            case 4:
                return new g6u0((Context) xvf0Var.get());
            case 5:
                return new u6u0((vs2) xvf0Var.get());
            case 6:
                return new yo40((u02) xvf0Var.get());
            case 7:
                return new b7u0((Context) xvf0Var.get());
            case 8:
                return new h7u0(i5m.a(xvf0Var));
            case 9:
                return new ppc(((c1b0) ((a1b0) xvf0Var.get())).a(StorageType.COMMON));
            case 10:
                return new b(((c1b0) ((a1b0) xvf0Var.get())).a(StorageType.COMMON_WITHOUT_CLEANUP));
            case 11:
                return new f5o(((c1b0) ((a1b0) xvf0Var.get())).a(StorageType.ENVIRONMENT));
            case 12:
                ((c1b0) ((a1b0) xvf0Var.get())).a(StorageType.SHORTCUTS);
                return new ity();
            case 13:
                return new avi0(((c1b0) ((a1b0) xvf0Var.get())).a(StorageType.REMOTE_CONFIG));
            case 14:
                return new lku0((Context) xvf0Var.get());
            case 15:
                return new o0k0(xvf0Var, i2);
            case 16:
                return new svu0((Context) xvf0Var.get());
            case 17:
                return new r0v0((q0v0) xvf0Var.get());
            case 18:
                return new ru.yandex.taxi.persuggest.experiments.b((rqo) xvf0Var.get());
            case 19:
                return new g((rqo) xvf0Var.get());
            case 20:
                return new e8v0((rqo) xvf0Var.get());
            case 21:
                return new wbv0((rqo) xvf0Var.get());
            case 22:
                return new c((wbv0) xvf0Var.get());
            case 23:
                return new xcv0((pho) xvf0Var.get());
            case 24:
                return new bfv0();
            case 25:
                return new abe((Context) xvf0Var.get(), false, false);
            case 26:
                return new vjv0((Context) xvf0Var.get());
            case 27:
                return new zjv0((xcv0) xvf0Var.get());
            case 28:
                return new pr6((rqo) xvf0Var.get(), 1);
            default:
                return new vkv0((ru.yandex.taxi.maas.impl.ride.c) xvf0Var.get());
        }
    }
}
