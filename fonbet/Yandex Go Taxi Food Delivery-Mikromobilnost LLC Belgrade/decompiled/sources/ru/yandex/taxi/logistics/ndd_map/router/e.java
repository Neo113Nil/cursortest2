package ru.yandex.taxi.logistics.ndd_map.router;

import com.yandex.go.address.models.Address;
import com.yandex.go.layers.domain.g;
import com.yandex.go.zone.repository.o;
import com.yandex.mapkit.geometry.Point;
import defpackage.ah00;
import defpackage.ai50;
import defpackage.ak00;
import defpackage.ar0;
import defpackage.atd0;
import defpackage.avj0;
import defpackage.br0;
import defpackage.bvf0;
import defpackage.cdi;
import defpackage.ch50;
import defpackage.ci50;
import defpackage.ck31;
import defpackage.d6z;
import defpackage.dai;
import defpackage.di50;
import defpackage.dj50;
import defpackage.dji;
import defpackage.dt20;
import defpackage.ej50;
import defpackage.f5v0;
import defpackage.fi50;
import defpackage.fif;
import defpackage.fl10;
import defpackage.g18;
import defpackage.gh00;
import defpackage.hi50;
import defpackage.ii50;
import defpackage.ji50;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kyh0;
import defpackage.l56;
import defpackage.li50;
import defpackage.mi50;
import defpackage.mx0;
import defpackage.ny61;
import defpackage.oh50;
import defpackage.pex0;
import defpackage.po21;
import defpackage.pv0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.s8o;
import defpackage.svd0;
import defpackage.th50;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u9i;
import defpackage.uq1;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wnt;
import defpackage.woi;
import defpackage.x8z;
import defpackage.xl10;
import defpackage.yq0;
import defpackage.z81;
import defpackage.zg50;
import defpackage.zq0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.map_object.h0;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.statebar.data.LocationErrorReason;

/* loaded from: classes5.dex */
public final class e {
    public static final ak00 S = new ak00(23);
    public final tse A;
    public final ah00 B;
    public final x8z C;
    public final ru.yandex.taxi.statebar.controller.a D;
    public final di50 E;
    public final fl10 F;
    public final ci50 G;
    public final oh50 H;
    public final dj50 I;
    public final po21 J;
    public pzt0 K;
    public pzt0 L;
    public boolean N;
    public boolean O;
    public boolean P;
    public final ji50 a;
    public final g b;
    public final ai50 c;
    public final fif d;
    public final AddressResolveRepository e;
    public final f5v0 f;
    public final ru.yandex.taxi.logistics.ndd_map.walkroute.b g;
    public final li50 h;
    public final ch50 i;
    public final cdi j;
    public final xl10 k;
    public final ej50 l;
    public final tt2 m;
    public final com.yandex.go.taxi.tariffs.interactor.b n;
    public final woi o;
    public final dt20 p;
    public final uq1 q;
    public final zuj0 r;
    public final k s;
    public final svd0 t;
    public final ck31 u;
    public final pwy0 v;
    public final o w;
    public final u9i x;
    public final wnt y;
    public final fi50 z;
    public g18 M = new dai();
    public final r0 Q = bvf0.c(null);
    public final r0 R = bvf0.c(null);

    public e(boolean z, ji50 ji50Var, g gVar, ai50 ai50Var, l56 l56Var, fif fifVar, AddressResolveRepository addressResolveRepository, f5v0 f5v0Var, ru.yandex.taxi.logistics.ndd_map.walkroute.b bVar, li50 li50Var, ch50 ch50Var, cdi cdiVar, xl10 xl10Var, ej50 ej50Var, tt2 tt2Var, com.yandex.go.taxi.tariffs.interactor.b bVar2, woi woiVar, dt20 dt20Var, uq1 uq1Var, zuj0 zuj0Var, k kVar, svd0 svd0Var, ck31 ck31Var, pwy0 pwy0Var, o oVar, u9i u9iVar, wnt wntVar, fi50 fi50Var, tse tseVar, ah00 ah00Var, x8z x8zVar, ru.yandex.taxi.statebar.controller.a aVar, di50 di50Var, fl10 fl10Var, ci50 ci50Var, oh50 oh50Var, dj50 dj50Var, po21 po21Var) {
        Address address;
        Object value;
        Object value2;
        Object value3;
        this.a = ji50Var;
        this.b = gVar;
        this.c = ai50Var;
        this.d = fifVar;
        this.e = addressResolveRepository;
        this.f = f5v0Var;
        this.g = bVar;
        this.h = li50Var;
        this.i = ch50Var;
        this.j = cdiVar;
        this.k = xl10Var;
        this.l = ej50Var;
        this.m = tt2Var;
        this.n = bVar2;
        this.o = woiVar;
        this.p = dt20Var;
        this.q = uq1Var;
        this.r = zuj0Var;
        this.s = kVar;
        this.t = svd0Var;
        this.u = ck31Var;
        this.v = pwy0Var;
        this.w = oVar;
        this.x = u9iVar;
        this.y = wntVar;
        this.z = fi50Var;
        this.A = tseVar;
        this.B = ah00Var;
        this.C = x8zVar;
        this.D = aVar;
        this.E = di50Var;
        this.F = fl10Var;
        this.G = ci50Var;
        this.H = oh50Var;
        this.I = dj50Var;
        this.J = po21Var;
        li50Var.getClass();
        if (ji50Var instanceof hi50) {
            address = ((hi50) ji50Var).e;
        } else if (ji50Var instanceof ii50) {
            com.yandex.go.route.interactor.c cVar = li50Var.c;
            address = z ? cVar.g() : cVar.d();
        } else {
            address = null;
        }
        mi50 mi50Var = li50Var.b;
        r0 r0Var = mi50Var.a;
        r0 r0Var2 = mi50Var.a;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, mi50.a.a((mi50.a) value, null, z, null, 5)));
        Integer num = li50Var.a;
        do {
            value2 = r0Var2.getValue();
        } while (!r0Var2.k(value2, mi50.a.a((mi50.a) value2, null, false, num, 3)));
        if (address != null) {
            do {
                value3 = r0Var2.getValue();
            } while (!r0Var2.k(value3, mi50.a.a((mi50.a) value3, address, false, null, 6)));
        }
        Address a = this.h.b.a();
        if (this.H.a().a && a == null) {
            f(((gh00) this.B).e.b());
        }
        l56Var.hideBlockedZones();
    }

    public final void a(h0 h0Var) {
        dji djiVar = h0Var.a;
        zzs zzsVar = djiVar.a;
        this.e.b(AddressResolveRepository.State.LOADING);
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = tje.N(this.A, null, null, new NddAddressMapPickerInteractor$applyNddPickupPointAddress$1(djiVar, zzsVar, this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0157, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r6) == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0148, code lost:
    
        if (h(r1, r2, r6) == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0182, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r6) == r7) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pv0 pv0Var, ContinuationImpl continuationImpl) {
        NddAddressMapPickerInteractor$checkPickupPointAddressInfo$1 nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1;
        int i;
        Object obj;
        pv0 pv0Var2 = pv0Var;
        br0 br0Var = br0.a;
        ar0 ar0Var = ar0.a;
        zq0 zq0Var = zq0.a;
        if (continuationImpl instanceof NddAddressMapPickerInteractor$checkPickupPointAddressInfo$1) {
            nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1 = (NddAddressMapPickerInteractor$checkPickupPointAddressInfo$1) continuationImpl;
            int i2 = nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    dt20 dt20Var = this.p;
                    Address address = pv0Var2.a;
                    if (!z81.b(address, ((zg50) dt20Var.b).b)) {
                        zg50 zg50Var = (zg50) dt20Var.b;
                        zg50Var.b = null;
                        zg50Var.a.set(0);
                        ((zg50) dt20Var.b).b = address;
                    }
                    int incrementAndGet = ((zg50) dt20Var.b).a.incrementAndGet();
                    boolean z = address.g0() == GeoObjectType.DELIVERY_PICKUP_POINT;
                    if (!z && incrementAndGet == 1) {
                        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) ((wiq0) dt20Var.w)).m();
                        if (!jl40.l(m != null ? m.b : null, (String) dt20Var.x)) {
                            obj = zq0Var;
                            if (!(obj instanceof yq0)) {
                                this.e.b(AddressResolveRepository.State.LOADED);
                                this.q.a().setMessage(((yq0) obj).a).setPositiveButton(((avj0) this.r).h(kyh0.common_got_it)).show();
                            } else if (obj.equals(zq0Var)) {
                                String c = this.a.c();
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0 = pv0Var2;
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$1 = null;
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label = 1;
                            } else if (obj.equals(ar0Var)) {
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0 = pv0Var2;
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$1 = null;
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label = 4;
                            } else {
                                if (!obj.equals(br0Var)) {
                                    w511.b();
                                    return null;
                                }
                                this.e.b(AddressResolveRepository.State.LOADED);
                            }
                            return zy11.a;
                        }
                    }
                    if (!z && incrementAndGet <= 2) {
                        obj = ar0Var;
                    } else if (z || incrementAndGet <= 2) {
                        zg50 zg50Var2 = (zg50) dt20Var.b;
                        zg50Var2.b = null;
                        zg50Var2.a.set(0);
                        obj = br0Var;
                    } else {
                        zg50 zg50Var3 = (zg50) dt20Var.b;
                        zg50Var3.b = null;
                        zg50Var3.a.set(0);
                        DeliveryPvzExperiment b = ((k) dt20Var.c).b();
                        obj = new yq0(d6z.Y(b, b.q));
                    }
                    if (!(obj instanceof yq0)) {
                    }
                    return zy11.a;
                }
                if (i == 1) {
                    pv0Var2 = (pv0) nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0;
                    kotlin.b.b(obj2);
                    nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0 = pv0Var2;
                    nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$1 = null;
                    nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label = 2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                pv0Var2 = (pv0) nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0;
                                kotlin.b.b(obj2);
                                zzs B = pv0Var2.a.B();
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0 = null;
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$1 = null;
                                nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label = 5;
                                Object d = d(B, nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1);
                                if (d != obj3) {
                                    return d;
                                }
                            } else if (i != 5) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        }
                        kotlin.b.b(obj2);
                        return obj2;
                    }
                    pv0Var2 = (pv0) nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0;
                    kotlin.b.b(obj2);
                    zzs B2 = pv0Var2.a.B();
                    nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$0 = null;
                    nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.L$1 = null;
                    nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label = 3;
                    Object d2 = d(B2, nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1);
                    if (d2 != obj3) {
                        return d2;
                    }
                }
                return obj3;
            }
        }
        nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1 = new NddAddressMapPickerInteractor$checkPickupPointAddressInfo$1(this, continuationImpl);
        Object obj22 = nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddAddressMapPickerInteractor$checkPickupPointAddressInfo$1.label;
        if (i != 0) {
        }
        return obj32;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(6:22|23|(1:25)(1:30)|26|27|(1:29))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        e(r0);
        r5.b(ru.yandex.taxi.address.repository.AddressResolveRepository.State.ERROR);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(zzs zzsVar, ContinuationImpl continuationImpl) {
        NddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1 nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1;
        int i;
        pv0 pv0Var;
        if (continuationImpl instanceof NddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1) {
            nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1 = (NddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1) continuationImpl;
            int i2 = nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.label;
                AddressResolveRepository addressResolveRepository = this.e;
                pv0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ci50 ci50Var = this.G;
                    tpr o = ((i) ci50Var.a).o(zzsVar, "manual", ci50Var.b.b.b() ? RoutePointType.POINT_A : RoutePointType.POINT_B, null, false, null, null);
                    nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.L$0 = null;
                    nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(new jqr(o, new NddAddressMapPickerInteractor$requestAddressInfo$2(this, null, null), 3), nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1);
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
                pv0Var = (pv0) obj;
                if (pv0Var != null) {
                    addressResolveRepository.b(AddressResolveRepository.State.LOADED);
                }
                return zy11.a;
            }
        }
        nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1 = new NddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1(this, continuationImpl);
        Object obj2 = nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddAddressMapPickerInteractor$finalizeAndCheckCourierAddress$1.label;
        AddressResolveRepository addressResolveRepository2 = this.e;
        pv0Var = null;
        if (i != 0) {
        }
        pv0Var = (pv0) obj2;
        if (pv0Var != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(6:29|30|(1:32)(1:37)|33|34|(2:36|26))|19|(1:21)(1:27)|22|(1:24)|12|13))|40|6|7|(0)(0)|19|(0)(0)|22|(0)|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (b(r0, r2) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
    
        e(r0);
        r16.e.b(ru.yandex.taxi.address.repository.AddressResolveRepository.State.ERROR);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(zzs zzsVar, ContinuationImpl continuationImpl) {
        NddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1 nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1;
        int i;
        pv0 pv0Var;
        if (continuationImpl instanceof NddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1) {
            nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1 = (NddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1) continuationImpl;
            int i2 = nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr o = ((i) ((atd0) this.F.a)).o(zzsVar, "manual", this.h.b.b() ? RoutePointType.DELIVERY_NDD_SOURCE : RoutePointType.DELIVERY_NDD_DESTINATION, null, false, null, null);
                    nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.L$0 = null;
                    nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(new jqr(o, new NddAddressMapPickerInteractor$requestAddressInfo$2(this, zzsVar, null), 3), nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                pv0Var = (pv0) obj;
                this.I.a.l(pv0Var == null ? pv0Var.a : null);
                if (pv0Var != null) {
                    nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.L$0 = null;
                    nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.L$1 = null;
                    nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.L$2 = null;
                    nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.label = 2;
                }
                return zy11.a;
            }
        }
        nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1 = new NddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1(this, continuationImpl);
        Object obj3 = nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddAddressMapPickerInteractor$finalizeAndCheckPickupPointAddress$1.label;
        if (i != 0) {
        }
        pv0Var = (pv0) obj3;
        this.I.a.l(pv0Var == null ? pv0Var.a : null);
        if (pv0Var != null) {
        }
        return zy11.a;
    }

    public final void e(Throwable th) {
        boolean A = s8o.A(th);
        x8z x8zVar = this.C;
        if (A) {
            x8zVar.a(LocationErrorReason.LOCATION_MESSAGE_REASON);
        } else {
            x8zVar.c(((avj0) this.r).h(kyh0.address_resolving_error), null, LocationErrorReason.LOCATION_MESSAGE_REASON, null);
        }
    }

    public final void f(zzs zzsVar) {
        this.e.b(AddressResolveRepository.State.LOADING);
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.K = tje.N(this.A, null, null, new NddAddressMapPickerInteractor$requestPinDrop$1(this, zzsVar, null), 3);
    }

    public final void g() {
        r0 r0Var;
        Object value;
        pzt0 pzt0Var = this.K;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        j();
        this.k.a();
        this.h.b(null, null);
        do {
            r0Var = this.R;
            value = r0Var.getValue();
        } while (!r0Var.k(value, null));
        this.e.b(AddressResolveRepository.State.LOADED);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (((ru.yandex.taxi.preorder.source.sourcepointzone.a) r7.t).b(r8, false, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(pv0 pv0Var, String str, ContinuationImpl continuationImpl) {
        NddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1 nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        NddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2 nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2;
        String str2;
        pzt0 a;
        if (continuationImpl instanceof NddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1) {
            nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1 = (NddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1) continuationImpl;
            int i2 = nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$0 = null;
                    nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$1 = str;
                    nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        str2 = (String) nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$1;
                        kotlin.b.b(obj);
                        a = this.o.a(str2);
                        if (a != null) {
                            return zy11.a;
                        }
                        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$0 = null;
                        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$1 = null;
                        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label = 3;
                        Object u0 = a.u0(nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1);
                        return u0 == coroutineSingletons ? coroutineSingletons : u0;
                    }
                    str = (String) nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$1;
                    kotlin.b.b(obj);
                }
                nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2 = new NddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2(this, str, null);
                nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$0 = null;
                nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$1 = str;
                nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label = 2;
                if (kotlinx.coroutines.a.w(1000L, nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2, nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1) != coroutineSingletons) {
                    str2 = str;
                    a = this.o.a(str2);
                    if (a != null) {
                    }
                }
            }
        }
        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1 = new NddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1(this, continuationImpl);
        Object obj2 = nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label;
        if (i != 0) {
        }
        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2 = new NddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2(this, str, null);
        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$0 = null;
        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.L$1 = str;
        nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1.label = 2;
        if (kotlinx.coroutines.a.w(1000L, nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$2, nddAddressMapPickerInteractor$resolveZoneAndEnsureTariff$1) != coroutineSingletons) {
        }
    }

    public final void i(zzs zzsVar, th50 th50Var) {
        Point F = ru.yandex.taxi.map.utils.a.F(zzsVar);
        gh00 gh00Var = (gh00) this.B;
        float j = gh00Var.j();
        if (13.0f >= j) {
            j = 13.0f;
        }
        gh00Var.D(F, j, 500.0f, new mx0(9, th50Var));
    }

    public final void j() {
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g.e.g(zy11.a);
    }

    public final void k() {
        tje.N(this.A, null, null, new NddAddressMapPickerInteractor$zoomToUserLocation$1(this, null), 3);
    }
}
