package ru.yandex.taxi.masstransit.geopayment.modal;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import defpackage.as6;
import defpackage.bms;
import defpackage.e010;
import defpackage.ft20;
import defpackage.i3y;
import defpackage.k26;
import defpackage.lx4;
import defpackage.m950;
import defpackage.mu5;
import defpackage.n26;
import defpackage.na1;
import defpackage.pgd;
import defpackage.pk30;
import defpackage.pzt0;
import defpackage.r26;
import defpackage.s14;
import defpackage.s26;
import defpackage.sls;
import defpackage.sy00;
import defpackage.tje;
import defpackage.tse;
import defpackage.u26;
import defpackage.uk30;
import defpackage.w030;
import defpackage.wfd;
import defpackage.zk30;
import defpackage.zy11;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes6.dex */
public final class e extends pgd implements m950 {
    public final Context F;
    public final w030 G;
    public final s14 H;
    public final Lifecycle I;
    public final bms J;
    public final i3y K;
    public final i3y L;
    public final i3y M;
    public final pk30 N;
    public final mu5 O;

    public e(Context context, w030 w030Var, s14 s14Var, Lifecycle lifecycle, bms bmsVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = s14Var;
        this.I = lifecycle;
        this.J = bmsVar;
        this.K = kotlin.a.a(new e010(this, 1));
        this.L = kotlin.a.a(new e010(this, 2));
        this.M = kotlin.a.a(new e010(this, 3));
        this.N = new pk30(this, 1);
        this.O = new mu5(new ft20(16, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        u26 u26Var;
        zk30 zk30Var = (zk30) obj;
        super.G(zk30Var);
        tje.N(o(), null, null, new MtGeoPaymentModalRouterImpl$onAttach$1(this, zk30Var, null), 3);
        final uk30 uk30Var = (uk30) this.M.getValue();
        n26 n26Var = zk30Var.a;
        final tse o = o();
        ru.yandex.taxi.masstransit.geopayment.adapter.a aVar = uk30Var.b;
        final int i = 1;
        ((com.yandex.go.permission.b) aVar.a).c(1, new s26(1, new sls() { // from class: ru.yandex.taxi.masstransit.geopayment.modal.a
            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                zy11 zy11Var = zy11.a;
                uk30 uk30Var2 = uk30Var;
                tse tseVar = o;
                switch (i2) {
                    case 0:
                        tje.N(tseVar, null, null, new MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1(uk30Var2, null), 3);
                        break;
                    default:
                        tje.N(tseVar, null, null, new MtGeoPaymentLifecycleListener$subscribeToLocationPermission$1$1(uk30Var2, null), 3);
                        break;
                }
                return zy11Var;
            }
        }));
        final int i2 = 0;
        ((com.yandex.go.permission.b) aVar.a).c(11, new s26(0, new sls() { // from class: ru.yandex.taxi.masstransit.geopayment.modal.a
            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                zy11 zy11Var = zy11.a;
                uk30 uk30Var2 = uk30Var;
                tse tseVar = o;
                switch (i22) {
                    case 0:
                        tje.N(tseVar, null, null, new MtGeoPaymentLifecycleListener$subscribeToBluetoothScanPermission$1$1(uk30Var2, null), 3);
                        break;
                    default:
                        tje.N(tseVar, null, null, new MtGeoPaymentLifecycleListener$subscribeToLocationPermission$1$1(uk30Var2, null), 3);
                        break;
                }
                return zy11Var;
            }
        }));
        tje.N(o, null, null, new MtGeoPaymentLifecycleListener$subscribeToActivityResultFlow$1(uk30Var, null), 3);
        uk30Var.f.a(new b(o, uk30Var));
        tje.N(o, null, null, new MtGeoPaymentLifecycleListener$collectPermissionsFlow$1(uk30Var, n26Var, o, null), 3);
        tje.N(o, null, null, new MtGeoPaymentLifecycleListener$collectConnectivityRestored$1(uk30Var, n26Var, o, null), 3);
        sy00 sy00Var = uk30Var.a.a;
        lx4 lx4Var = sy00Var.a;
        ((na1) sy00Var.b).getClass();
        ((j) lx4Var).v(as6.G());
        r26 r26Var = n26Var.a;
        k26 k26Var = r26Var != null ? r26Var.b : null;
        if (k26Var == null || (u26Var = k26Var.f) == null || !u26Var.a) {
            return;
        }
        uk30Var.g.a.e(u26Var, o);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((zk30) obj);
        ru.yandex.taxi.masstransit.geopayment.repository.d dVar = ((ru.yandex.taxi.masstransit.geopayment.domain.c) this.H.e).a;
        pzt0 pzt0Var = dVar.o;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.o = null;
        dVar.b.a();
        dVar.c.a();
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.O;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
