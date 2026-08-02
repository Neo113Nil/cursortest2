package defpackage;

import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.map.overlay.recenter.a;
import ru.yandex.taxi.analytics.LiveLocationModalAnalytics$ButtonType;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.order.d;
import ru.yandex.taxi.order.i;

/* loaded from: classes6.dex */
public final class zw70 extends y7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zw70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y7, defpackage.q1t
    public void A0(boolean z) {
        switch (this.a) {
            case 0:
                n080 n080Var = ((i) this.b).H0;
                if (n080Var != null) {
                    n080Var.A0(z);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y7, defpackage.q1t
    public void Cc(boolean z) {
        switch (this.a) {
            case 0:
                d dVar = ((i) this.b).C;
                dVar.getClass();
                dVar.d();
                break;
        }
    }

    @Override // defpackage.y7, defpackage.q1t
    public void M4() {
        String str;
        switch (this.a) {
            case 0:
                d dVar = ((i) this.b).C;
                if (d.e(((e0) dVar.e).m())) {
                    str = ((avj0) dVar.g).h(kyh0.location_sharing_unavailable_order_for_other);
                } else if (!dVar.n) {
                    str = ((avj0) dVar.g).h(kyh0.location_sharing_unavailable_distance);
                } else if (dVar.m) {
                    str = ((avj0) dVar.g).h(kyh0.location_sharing_unavailable_during_sharing);
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    ((ww70) ((i) this.b).Dg()).mb(str);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y7, defpackage.q1t
    public void Q(ro21 ro21Var, ro21 ro21Var2) {
        switch (this.a) {
            case 0:
                n080 n080Var = ((i) this.b).H0;
                if (n080Var != null) {
                    n080Var.Q(ro21Var, ro21Var2);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y7, defpackage.q1t
    public void e3(boolean z) {
        switch (this.a) {
            case 0:
                i iVar = (i) this.b;
                final wvy wvyVar = iVar.d0;
                final cx70 cx70Var = new cx70(iVar);
                wjm wjmVar = wvyVar.b;
                d6i d6iVar = wvyVar.c;
                final int i = 1;
                final int i2 = 0;
                if (z) {
                    rvy rvyVar = (rvy) d6iVar.a.b();
                    if (rvyVar.b && rvyVar.c(true)) {
                        wjmVar.A(true, new Runnable() { // from class: uvy
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                wvy wvyVar2 = wvyVar;
                                switch (i3) {
                                    case 0:
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.NOTHING);
                                        break;
                                    default:
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.NOTHING);
                                        break;
                                }
                            }
                        }, new Runnable() { // from class: vvy
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i2;
                                wvy wvyVar2 = wvyVar;
                                cx70 cx70Var2 = cx70Var;
                                switch (i3) {
                                    case 0:
                                        cx70Var2.a(true, false, false);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON_THIS_RIDE);
                                        break;
                                    case 1:
                                        cx70Var2.a(true, false, true);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON);
                                        break;
                                    case 2:
                                        cx70Var2.a(false, false, true);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF);
                                        break;
                                    default:
                                        cx70Var2.a(false, false, false);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF_THIS_RIDE);
                                        break;
                                }
                            }
                        }, new Runnable() { // from class: vvy
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i3 = i;
                                wvy wvyVar2 = wvyVar;
                                cx70 cx70Var2 = cx70Var;
                                switch (i3) {
                                    case 0:
                                        cx70Var2.a(true, false, false);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON_THIS_RIDE);
                                        break;
                                    case 1:
                                        cx70Var2.a(true, false, true);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON);
                                        break;
                                    case 2:
                                        cx70Var2.a(false, false, true);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF);
                                        break;
                                    default:
                                        cx70Var2.a(false, false, false);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF_THIS_RIDE);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                if (!z) {
                    rvy rvyVar2 = (rvy) d6iVar.a.b();
                    if (rvyVar2.b && rvyVar2.c(false)) {
                        final int i3 = 2;
                        final int i4 = 3;
                        wjmVar.A(false, new Runnable() { // from class: vvy
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i32 = i3;
                                wvy wvyVar2 = wvyVar;
                                cx70 cx70Var2 = cx70Var;
                                switch (i32) {
                                    case 0:
                                        cx70Var2.a(true, false, false);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON_THIS_RIDE);
                                        break;
                                    case 1:
                                        cx70Var2.a(true, false, true);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON);
                                        break;
                                    case 2:
                                        cx70Var2.a(false, false, true);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF);
                                        break;
                                    default:
                                        cx70Var2.a(false, false, false);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF_THIS_RIDE);
                                        break;
                                }
                            }
                        }, new Runnable() { // from class: vvy
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i32 = i4;
                                wvy wvyVar2 = wvyVar;
                                cx70 cx70Var2 = cx70Var;
                                switch (i32) {
                                    case 0:
                                        cx70Var2.a(true, false, false);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON_THIS_RIDE);
                                        break;
                                    case 1:
                                        cx70Var2.a(true, false, true);
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.TURN_ON);
                                        break;
                                    case 2:
                                        cx70Var2.a(false, false, true);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF);
                                        break;
                                    default:
                                        cx70Var2.a(false, false, false);
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.TURN_OFF_THIS_RIDE);
                                        break;
                                }
                            }
                        }, new Runnable() { // from class: uvy
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i32 = i;
                                wvy wvyVar2 = wvyVar;
                                switch (i32) {
                                    case 0:
                                        wvyVar2.a.a(true, LiveLocationModalAnalytics$ButtonType.NOTHING);
                                        break;
                                    default:
                                        wvyVar2.a.a(false, LiveLocationModalAnalytics$ButtonType.NOTHING);
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                cx70Var.a(z, true, false);
                break;
        }
    }

    @Override // defpackage.y7, defpackage.q1t
    public void setNextRecenterType(RecenterType recenterType) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                a aVar = (a) obj;
                aVar.k.a(true);
                aVar.g.Xb(true);
                break;
            case 2:
                m6w0 m6w0Var = (m6w0) obj;
                m6w0Var.f.a(true);
                m6w0Var.a(null);
                break;
        }
    }
}
