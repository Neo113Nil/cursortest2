package ru.yandex.taxi.maas.impl.ride.common;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.interactor.b;
import com.yandex.go.taxi.tariffs.interactor.k;
import defpackage.a7t0;
import defpackage.arv0;
import defpackage.b8r;
import defpackage.c0l0;
import defpackage.c4r0;
import defpackage.c8r;
import defpackage.d200;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.i000;
import defpackage.jst;
import defpackage.m000;
import defpackage.mi31;
import defpackage.mth;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.urw;
import defpackage.y9y0;
import defpackage.yqv0;
import defpackage.za31;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.deeplinks.e;
import ru.yandex.taxi.maas.impl.ride.c;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes5.dex */
public final class a {
    public final b8r a;
    public final c8r b;
    public final c4r0 c;
    public final arv0 d;
    public final c e;
    public final e f;
    public final d200 g;
    public final b h;
    public final y9y0 i;

    public a(b8r b8rVar, c8r c8rVar, c4r0 c4r0Var, arv0 arv0Var, c cVar, e eVar, d200 d200Var, b bVar, y9y0 y9y0Var) {
        this.a = b8rVar;
        this.b = c8rVar;
        this.c = c4r0Var;
        this.d = arv0Var;
        this.e = cVar;
        this.f = eVar;
        this.g = d200Var;
        this.h = bVar;
        this.i = y9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, m000 m000Var, ContinuationImpl continuationImpl) {
        MaasRouteProcessor$ensureMaasCoupon$1 maasRouteProcessor$ensureMaasCoupon$1;
        Object obj;
        int i;
        d200 d200Var = aVar.g;
        if (continuationImpl instanceof MaasRouteProcessor$ensureMaasCoupon$1) {
            maasRouteProcessor$ensureMaasCoupon$1 = (MaasRouteProcessor$ensureMaasCoupon$1) continuationImpl;
            int i2 = maasRouteProcessor$ensureMaasCoupon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                maasRouteProcessor$ensureMaasCoupon$1.label = i2 - Integer.MIN_VALUE;
                obj = maasRouteProcessor$ensureMaasCoupon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = maasRouteProcessor$ensureMaasCoupon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (evu0.J(m000Var.c)) {
                        ru.yandex.taxi.maas.impl.a aVar2 = (ru.yandex.taxi.maas.impl.a) d200Var;
                        if (evu0.J(((i000) aVar2.i.getValue()).b)) {
                            maasRouteProcessor$ensureMaasCoupon$1.L$0 = null;
                            maasRouteProcessor$ensureMaasCoupon$1.label = 1;
                            obj = kotlinx.coroutines.flow.e.y(aVar2.a(), maasRouteProcessor$ensureMaasCoupon$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((i000) obj).b.length() == 0) {
                    ny61.g("Maas coupon is empty");
                    return null;
                }
                return zy11.a;
            }
        }
        maasRouteProcessor$ensureMaasCoupon$1 = new MaasRouteProcessor$ensureMaasCoupon$1(aVar, continuationImpl);
        obj = maasRouteProcessor$ensureMaasCoupon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = maasRouteProcessor$ensureMaasCoupon$1.label;
        if (i != 0) {
        }
        if (((i000) obj).b.length() == 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, m000 m000Var, ZoneAddress zoneAddress, Address address, sls slsVar, ContinuationImpl continuationImpl) {
        MaasRouteProcessor$setRouteAndOpenSummary$1 maasRouteProcessor$setRouteAndOpenSummary$1;
        int i;
        boolean e;
        y9y0 y9y0Var = aVar.i;
        if (continuationImpl instanceof MaasRouteProcessor$setRouteAndOpenSummary$1) {
            maasRouteProcessor$setRouteAndOpenSummary$1 = (MaasRouteProcessor$setRouteAndOpenSummary$1) continuationImpl;
            int i2 = maasRouteProcessor$setRouteAndOpenSummary$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                maasRouteProcessor$setRouteAndOpenSummary$1.label = i2 - Integer.MIN_VALUE;
                Object obj = maasRouteProcessor$setRouteAndOpenSummary$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = maasRouteProcessor$setRouteAndOpenSummary$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b8r b8rVar = aVar.a;
                    String str = m000Var.b;
                    maasRouteProcessor$setRouteAndOpenSummary$1.L$0 = m000Var;
                    maasRouteProcessor$setRouteAndOpenSummary$1.L$1 = zoneAddress;
                    maasRouteProcessor$setRouteAndOpenSummary$1.L$2 = address;
                    maasRouteProcessor$setRouteAndOpenSummary$1.L$3 = slsVar;
                    maasRouteProcessor$setRouteAndOpenSummary$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(new mth(new k(((com.yandex.go.taxi.tariffs.internal.repository.k) b8rVar.a).i(), str), 6), maasRouteProcessor$setRouteAndOpenSummary$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    slsVar = (sls) maasRouteProcessor$setRouteAndOpenSummary$1.L$3;
                    address = (Address) maasRouteProcessor$setRouteAndOpenSummary$1.L$2;
                    zoneAddress = (ZoneAddress) maasRouteProcessor$setRouteAndOpenSummary$1.L$1;
                    m000Var = (m000) maasRouteProcessor$setRouteAndOpenSummary$1.L$0;
                    kotlin.b.b(obj);
                }
                e = aVar.e((za31) obj, m000Var);
                zy11 zy11Var = zy11.a;
                if (e) {
                    return zy11Var;
                }
                y9y0Var.i(zoneAddress);
                y9y0Var.d(address);
                slsVar.invoke();
                return zy11Var;
            }
        }
        maasRouteProcessor$setRouteAndOpenSummary$1 = new MaasRouteProcessor$setRouteAndOpenSummary$1(aVar, continuationImpl);
        Object obj2 = maasRouteProcessor$setRouteAndOpenSummary$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = maasRouteProcessor$setRouteAndOpenSummary$1.label;
        if (i != 0) {
        }
        e = aVar.e((za31) obj2, m000Var);
        zy11 zy11Var2 = zy11.a;
        if (e) {
        }
    }

    public final c0l0 c(pv0 pv0Var) {
        zzs B;
        Address h = this.i.h();
        if (h != null && (B = h.B()) != null) {
            return new c0l0(B, pv0Var.a.B());
        }
        ny61.r("Source address not set");
        return null;
    }

    public final void d(tse tseVar, m000 m000Var, sls slsVar, tls tlsVar) {
        c0l0 c0l0Var = m000Var.e;
        if (c0l0Var == null) {
            return;
        }
        tje.N(tseVar, null, null, new MaasRouteProcessor$openSummaryWithRoute$2(this, m000Var, c0l0Var, slsVar, tlsVar, null), 3);
    }

    public final boolean e(za31 za31Var, m000 m000Var) {
        this.b.b.getClass();
        mi31 a = urw.a(za31Var);
        if (a == null) {
            jst.e.r("Maas tariff not found", new IllegalStateException());
            return false;
        }
        String str = m000Var.b;
        c cVar = this.e;
        cVar.d = str;
        n0 n0Var = cVar.b;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        String str2 = m000Var.c;
        if (evu0.J(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            cVar.c = str2;
            n0Var.g(zy11Var);
        }
        this.c.a(new gnx0(new fnx0(a, SelectionOrigin.DEEPLINK), true));
        ((a7t0) this.d).b(new yqv0(SummaryUiState$Type.TRAP, m000Var.b));
        return true;
    }
}
