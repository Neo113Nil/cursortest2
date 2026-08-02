package ru.yandex.taxi.maas.impl.ride.metropick;

import android.content.Context;
import com.yandex.go.address.models.Address;
import com.yandex.go.zone.repository.o;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.b2l0;
import defpackage.cv00;
import defpackage.e100;
import defpackage.el00;
import defpackage.et00;
import defpackage.gh00;
import defpackage.iqz0;
import defpackage.jst;
import defpackage.k7x0;
import defpackage.lcw;
import defpackage.leh;
import defpackage.lr00;
import defpackage.m000;
import defpackage.m100;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.oo2;
import defpackage.opz0;
import defpackage.pav;
import defpackage.po21;
import defpackage.q100;
import defpackage.qu;
import defpackage.r100;
import defpackage.rjt0;
import defpackage.rqo;
import defpackage.s100;
import defpackage.sgu0;
import defpackage.t100;
import defpackage.tt2;
import defpackage.u100;
import defpackage.w030;
import defpackage.xi00;
import defpackage.xm00;
import defpackage.xvf0;
import defpackage.y9y0;
import defpackage.zzs;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes5.dex */
public final class b extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final m100 G;
    public final po21 H;
    public final y9y0 I;
    public final xi00 J;
    public final u100 K;
    public s100 L;
    public xm00 M;

    public b(w030 w030Var, m100 m100Var, po21 po21Var, y9y0 y9y0Var, xi00 xi00Var, u100 u100Var) {
        super(null);
        this.F = w030Var;
        this.G = m100Var;
        this.H = po21Var;
        this.I = y9y0Var;
        this.J = xi00Var;
        this.K = u100Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(2:23|(1:25)(2:26|27))(3:9|10|(2:16|(1:18))(1:14))|19|20|21))|7|(0)(0)|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006a, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
    
        if ((r4 instanceof ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        r5 = r4.getFallbackUserLocation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0060, code lost:
    
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0062, code lost:
    
        r4 = r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0067, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0068, code lost:
    
        throw r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0021 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(ContinuationImpl continuationImpl) {
        MaasMetroPickRouter$pinPoint$1 maasMetroPickRouter$pinPoint$1;
        int i;
        zzs B;
        try {
            if (continuationImpl instanceof MaasMetroPickRouter$pinPoint$1) {
                maasMetroPickRouter$pinPoint$1 = (MaasMetroPickRouter$pinPoint$1) continuationImpl;
                int i2 = maasMetroPickRouter$pinPoint$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    maasMetroPickRouter$pinPoint$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = maasMetroPickRouter$pinPoint$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = maasMetroPickRouter$pinPoint$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        Address h = this.I.h();
                        if (h != null && (B = h.B()) != null) {
                            return B;
                        }
                        po21 po21Var = this.H;
                        maasMetroPickRouter$pinPoint$1.label = 1;
                        obj = ((e) po21Var).f(maasMetroPickRouter$pinPoint$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    zzs a = ((mo21) obj).a();
                    return a;
                }
            }
            if (i != 0) {
            }
            zzs a2 = ((mo21) obj).a();
            return a2;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        maasMetroPickRouter$pinPoint$1 = new MaasMetroPickRouter$pinPoint$1(this, continuationImpl);
        Object obj2 = maasMetroPickRouter$pinPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = maasMetroPickRouter$pinPoint$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(q100 q100Var, ContinuationImpl continuationImpl) {
        MaasMetroPickRouter$provideModalView$1 maasMetroPickRouter$provideModalView$1;
        int i;
        q100 q100Var2;
        Object T;
        Throwable a;
        if (continuationImpl instanceof MaasMetroPickRouter$provideModalView$1) {
            maasMetroPickRouter$provideModalView$1 = (MaasMetroPickRouter$provideModalView$1) continuationImpl;
            int i2 = maasMetroPickRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                maasMetroPickRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = maasMetroPickRouter$provideModalView$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = maasMetroPickRouter$provideModalView$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q100Var2 = q100Var;
                    maasMetroPickRouter$provideModalView$1.L$0 = q100Var2;
                    maasMetroPickRouter$provideModalView$1.label = 1;
                    T = T(maasMetroPickRouter$provideModalView$1);
                    if (T == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    q100 q100Var3 = (q100) maasMetroPickRouter$provideModalView$1.L$0;
                    kotlin.b.b(obj);
                    T = ((Result) obj).getValue();
                    q100Var2 = q100Var3;
                }
                a = Result.a(T);
                if (a != null) {
                    jst.e.k(a, "error when location retrieve for open maas");
                    r(new qu(9));
                    T = zzs.f;
                }
                zzs zzsVar = (zzs) T;
                m000 m000Var = q100Var2.a;
                r100 r100Var = new r100();
                ru.yandex.taxi.viewholder.b bVar = (ru.yandex.taxi.viewholder.b) this.J;
                bVar.a(r100Var);
                xm00 p = ((gh00) bVar.c).i.p();
                this.M = p;
                t100 t100Var = this.K.a;
                ah00 ah00Var = (ah00) t100Var.a.get();
                Context context = (Context) t100Var.b.get();
                leh lehVar = (leh) t100Var.c.get();
                b2l0 b2l0Var = (b2l0) t100Var.d.get();
                o oVar = (o) t100Var.e.get();
                el00 el00Var = (el00) t100Var.f.get();
                cv00 cv00Var = (cv00) t100Var.g.get();
                sgu0 sgu0Var = (sgu0) t100Var.h.get();
                com.yandex.go.route.interactor.c cVar = (com.yandex.go.route.interactor.c) t100Var.i.get();
                tt2 tt2Var = (tt2) t100Var.j.get();
                lr00 lr00Var = (lr00) t100Var.k.get();
                et00 et00Var = (et00) t100Var.l.get();
                s100 s100Var = new s100(tt2Var, lehVar, (rqo) t100Var.m.get(), ah00Var, el00Var, p, lr00Var, et00Var, cv00Var, b2l0Var, (rjt0) t100Var.p.get(), sgu0Var, (opz0) t100Var.n.get(), (iqz0) t100Var.o.get(), context, cVar, oVar);
                s100Var.attach();
                this.L = s100Var;
                e100 e100Var = new e100(i3, this, r100Var, m000Var);
                MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = m000Var.d;
                oo2 oo2Var = this.G.a;
                return new MaasMetroPickModalView((Context) ((xvf0) oo2Var.a).get(), (k7x0) ((xvf0) oo2Var.b).get(), (pav) ((xvf0) oo2Var.c).get(), zzsVar, multiTransportChooseStationCardAnalytics$OpenReasonV2, e100Var, (a) ((lcw) oo2Var.w).get(), (a3v) ((xvf0) oo2Var.x).get());
            }
        }
        maasMetroPickRouter$provideModalView$1 = new MaasMetroPickRouter$provideModalView$1(this, continuationImpl);
        Object obj3 = maasMetroPickRouter$provideModalView$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = maasMetroPickRouter$provideModalView$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        a = Result.a(T);
        if (a != null) {
        }
        zzs zzsVar2 = (zzs) T;
        m000 m000Var2 = q100Var2.a;
        r100 r100Var2 = new r100();
        ru.yandex.taxi.viewholder.b bVar2 = (ru.yandex.taxi.viewholder.b) this.J;
        bVar2.a(r100Var2);
        xm00 p2 = ((gh00) bVar2.c).i.p();
        this.M = p2;
        t100 t100Var2 = this.K.a;
        ah00 ah00Var2 = (ah00) t100Var2.a.get();
        Context context2 = (Context) t100Var2.b.get();
        leh lehVar2 = (leh) t100Var2.c.get();
        b2l0 b2l0Var2 = (b2l0) t100Var2.d.get();
        o oVar2 = (o) t100Var2.e.get();
        el00 el00Var2 = (el00) t100Var2.f.get();
        cv00 cv00Var2 = (cv00) t100Var2.g.get();
        sgu0 sgu0Var2 = (sgu0) t100Var2.h.get();
        com.yandex.go.route.interactor.c cVar2 = (com.yandex.go.route.interactor.c) t100Var2.i.get();
        tt2 tt2Var2 = (tt2) t100Var2.j.get();
        lr00 lr00Var2 = (lr00) t100Var2.k.get();
        et00 et00Var2 = (et00) t100Var2.l.get();
        s100 s100Var2 = new s100(tt2Var2, lehVar2, (rqo) t100Var2.m.get(), ah00Var2, el00Var2, p2, lr00Var2, et00Var2, cv00Var2, b2l0Var2, (rjt0) t100Var2.p.get(), sgu0Var2, (opz0) t100Var2.n.get(), (iqz0) t100Var2.o.get(), context2, cVar2, oVar2);
        s100Var2.attach();
        this.L = s100Var2;
        e100 e100Var2 = new e100(i32, this, r100Var2, m000Var2);
        MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV22 = m000Var2.d;
        oo2 oo2Var2 = this.G.a;
        return new MaasMetroPickModalView((Context) ((xvf0) oo2Var2.a).get(), (k7x0) ((xvf0) oo2Var2.b).get(), (pav) ((xvf0) oo2Var2.c).get(), zzsVar2, multiTransportChooseStationCardAnalytics$OpenReasonV22, e100Var2, (a) ((lcw) oo2Var2.w).get(), (a3v) ((xvf0) oo2Var2.x).get());
    }
}
