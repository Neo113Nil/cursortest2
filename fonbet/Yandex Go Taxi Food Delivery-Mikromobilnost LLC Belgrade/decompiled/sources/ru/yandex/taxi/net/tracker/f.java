package ru.yandex.taxi.net.tracker;

import com.yandex.go.taxi.order.net.xiva.n;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.Point;
import defpackage.fel0;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.hby0;
import defpackage.j001;
import defpackage.jl40;
import defpackage.jtq0;
import defpackage.oel0;
import defpackage.tt2;
import defpackage.xzs0;
import defpackage.yvf0;
import defpackage.zay0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public final class f extends e implements zay0 {
    public final AtomicReference U;

    public f(com.yandex.go.taxi.order.net.tracker.e eVar, jtq0 jtq0Var, yvf0 yvf0Var, oel0 oel0Var, h3y h3yVar, h3y h3yVar2, tt2 tt2Var, n nVar) {
        super(eVar, jtq0Var, yvf0Var, oel0Var, h3yVar2, h3yVar, tt2Var, nVar);
        this.U = new AtomicReference();
    }

    @Override // ru.yandex.taxi.net.tracker.e, defpackage.way0
    public final boolean Hc() {
        DriveState driveState = (DriveState) this.U.get();
        return driveState == DriveState.DRIVING || driveState == DriveState.WAITING || driveState == DriveState.TRANSPORTING;
    }

    @Override // defpackage.uay0
    public final void Pf(DrivingRoute drivingRoute) {
        List s5;
        boolean z = this.P == null;
        this.P = drivingRoute;
        if (z || (s5 = s5()) == null || s5.isEmpty()) {
            return;
        }
        j001 j001Var = (j001) kotlin.collections.a.P(s5);
        j001 j001Var2 = (j001) kotlin.collections.a.Z(s5);
        if (jl40.l(j001Var, j001Var2)) {
            return;
        }
        fel0 fel0Var = (fel0) this.y.get();
        List<Point> points = drivingRoute.getGeometry().getPoints();
        fel0Var.getClass();
        List a = fel0.a(j001Var, j001Var2, points);
        ru.yandex.taxi.net.tracker.v2.a aVar = this.C;
        if (aVar != null) {
            aVar.b(a, null, this.L, hby0.b);
        }
        r0 r0Var = this.F;
        r0Var.getClass();
        r0Var.m(null, a);
    }

    @Override // defpackage.uay0
    public final void ng(DriveState driveState) {
        DriveState driveState2 = (DriveState) this.U.getAndSet(driveState);
        if (this.C == null) {
            Bg();
        }
        if (this.S == BaseSmoothMovementTracker$DataOrigin.WEBSOCKET && driveState2 != driveState && !this.R) {
            hbp0.e(this.A, null, null, new BaseSmoothMovementTracker$forceLoadRouteOnce$1(this, null), 3);
        }
        int i = xzs0.a[driveState.ordinal()];
        if (i == 1 || i == 2) {
            TrackerMode trackerMode = TrackerMode.NORMAL;
            this.N = trackerMode;
            ru.yandex.taxi.net.tracker.v2.a aVar = this.C;
            if (aVar != null) {
                aVar.p = trackerMode;
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        TrackerMode trackerMode2 = TrackerMode.FAST;
        this.N = trackerMode2;
        ru.yandex.taxi.net.tracker.v2.a aVar2 = this.C;
        if (aVar2 != null) {
            aVar2.p = trackerMode2;
        }
    }

    @Override // ru.yandex.taxi.net.tracker.e, defpackage.uay0
    public final synchronized void reset() {
        super.reset();
        this.U.set(null);
    }

    @Override // defpackage.uay0
    public final void w4(long j) {
        ru.yandex.taxi.net.tracker.v2.a aVar = this.C;
        if (aVar == null) {
            return;
        }
        if (j <= 0) {
            aVar.m = 0L;
        } else {
            aVar.m = TimeUnit.SECONDS.toMillis(j) + this.b.d();
        }
    }
}
