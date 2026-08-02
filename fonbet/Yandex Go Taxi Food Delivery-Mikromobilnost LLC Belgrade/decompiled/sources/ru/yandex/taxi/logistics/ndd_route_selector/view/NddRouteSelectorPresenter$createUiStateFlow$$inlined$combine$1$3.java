package ru.yandex.taxi.logistics.ndd_route_selector.view;

import com.yandex.go.address.models.Address;
import defpackage.aj50;
import defpackage.avj0;
import defpackage.bi50;
import defpackage.bj50;
import defpackage.cd70;
import defpackage.cj50;
import defpackage.d43;
import defpackage.d6z;
import defpackage.ed70;
import defpackage.evu0;
import defpackage.gh00;
import defpackage.hi50;
import defpackage.ii50;
import defpackage.jd70;
import defpackage.ji50;
import defpackage.jl40;
import defpackage.kf60;
import defpackage.kyh0;
import defpackage.kyx;
import defpackage.lh50;
import defpackage.mh50;
import defpackage.mi50;
import defpackage.mvg;
import defpackage.nh50;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.rh50;
import defpackage.scc;
import defpackage.sh50;
import defpackage.tcc;
import defpackage.uc4;
import defpackage.vpr;
import defpackage.w511;
import defpackage.yi50;
import defpackage.zi50;
import defpackage.zls;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.object.GeoObjectType;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;
import ru.yandex.taxi.logistics.experiments.NddRouteType;
import ru.yandex.taxi.logistics.experiments.j;
import ru.yandex.taxi.logistics.experiments.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3", f = "NddRouteSelectorPresenter.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class NddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ yi50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3(yi50 yi50Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = yi50Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3 nddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3 = new NddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3(this.this$0, (Continuation) obj3);
        nddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        nddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return nddRouteSelectorPresenter$createUiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0325 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        k kVar;
        boolean z;
        ji50 ji50Var;
        boolean z2;
        zuj0 zuj0Var;
        boolean z3;
        cj50 cj50Var;
        sh50 sh50Var;
        boolean z4;
        String Y;
        String Y2;
        zi50 zi50Var;
        uc4 uc4Var;
        ed70 ed70Var;
        boolean z5;
        jd70 jd70Var;
        List list;
        NddRouteType nddRouteType;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            nh50 nh50Var = (nh50) objArr[7];
            boolean booleanValue = ((Boolean) obj8).booleanValue();
            cd70 cd70Var = (cd70) obj7;
            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
            boolean booleanValue3 = ((Boolean) obj5).booleanValue();
            AddressResolveRepository.State state = (AddressResolveRepository.State) obj4;
            mi50.a aVar = (mi50.a) obj3;
            DeliveryPvzExperiment deliveryPvzExperiment = (DeliveryPvzExperiment) obj2;
            yi50 yi50Var = this.this$0;
            aj50 aj50Var = yi50Var.R;
            zi50 zi50Var2 = yi50Var.S;
            cj50 cj50Var2 = zi50Var2.d;
            sh50 sh50Var2 = zi50Var2.e;
            d43 d43Var = new d43(((gh00) yi50Var.A).e.b(), (zzs) ((gh00) this.this$0.A).i().b, (zzs) ((gh00) this.this$0.A).i().c);
            k kVar2 = aj50Var.c;
            zuj0 zuj0Var2 = aj50Var.b;
            ji50 ji50Var2 = aj50Var.a;
            Address address = aVar.a;
            String F = address != null ? q5z.F(address) : null;
            Address address2 = aVar.a;
            if (address2 != null) {
                kVar = kVar2;
                if (address2.g0() == GeoObjectType.DELIVERY_PICKUP_POINT) {
                    z = true;
                    if (!(ji50Var2 instanceof ii50) || (ji50Var2 instanceof hi50)) {
                        ji50Var = ji50Var2;
                        z2 = z;
                        zuj0Var = zuj0Var2;
                        z3 = booleanValue;
                        cj50Var = cj50.c;
                    } else {
                        List list2 = kVar.b().r;
                        ji50Var = ji50Var2;
                        HashSet hashSet = new HashSet();
                        z2 = z;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            Object next = it2.next();
                            zuj0 zuj0Var3 = zuj0Var2;
                            if (hashSet.add(((DeliveryPvzExperiment.b) next).a)) {
                                arrayList.add(next);
                            }
                            it = it2;
                            zuj0Var2 = zuj0Var3;
                        }
                        zuj0Var = zuj0Var2;
                        if (arrayList.size() < 2) {
                            list = EmptyList.a;
                        } else {
                            List list3 = kVar.b().r;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                DeliveryPvzExperiment.b bVar = (DeliveryPvzExperiment.b) it3.next();
                                Iterator it4 = it3;
                                int i2 = j.a[bVar.a.ordinal()];
                                boolean z6 = booleanValue;
                                if (i2 == 1) {
                                    nddRouteType = NddRouteType.SOURCE;
                                } else {
                                    if (i2 != 2) {
                                        w511.b();
                                        return null;
                                    }
                                    nddRouteType = NddRouteType.DESTINATION;
                                }
                                arrayList2.add(new bj50(nddRouteType, d6z.Y(kVar.b(), bVar.b)));
                                it3 = it4;
                                booleanValue = z6;
                            }
                            list = arrayList2;
                        }
                        z3 = booleanValue;
                        cj50Var = new cj50(list, !jl40.l(cj50Var2.a, list));
                    }
                    if (ji50Var.a()) {
                        sh50Var = sh50.c;
                    } else {
                        DeliveryPvzExperiment b = kVar.b();
                        String Y3 = d6z.Y(b, b.t.b);
                        if (evu0.J(Y3)) {
                            Y3 = null;
                        }
                        if (Y3 == null) {
                            Y3 = ((avj0) zuj0Var).h(kyh0.delivery_ndd_address_flow_pickup_point_button);
                        }
                        rh50 rh50Var = new rh50(Y3, mh50.c);
                        DeliveryPvzExperiment b2 = kVar.b();
                        String Y4 = d6z.Y(b2, b2.t.a);
                        if (evu0.J(Y4)) {
                            Y4 = null;
                        }
                        if (Y4 == null) {
                            Y4 = ((avj0) zuj0Var).h(kyh0.delivery_ndd_address_flow_courier_button);
                        }
                        sh50Var = new sh50(scc.g(rh50Var, new rh50(Y4, lh50.c)), !jl40.l(sh50Var2.a, r4));
                    }
                    kyx kyxVar = kyx.e;
                    if (cd70Var != null && (uc4Var = cd70Var.a) != null && (ed70Var = cd70Var.d) != null && ((z5 = ed70Var instanceof jd70)) && !z3) {
                        jd70Var = !z5 ? (jd70) ed70Var : null;
                        if (jd70Var != null) {
                            kyxVar = new kyx(true, jd70Var.a, jd70Var.c.a, uc4Var);
                        }
                    }
                    boolean z7 = aVar.b;
                    z4 = nh50Var.b;
                    AddressResolveRepository.State state2 = AddressResolveRepository.State.LOADING;
                    boolean z8 = state != state2;
                    boolean z9 = (z4 || deliveryPvzExperiment.f == null) ? false : true;
                    if (sh50Var.a.isEmpty()) {
                        Y = ((avj0) zuj0Var).h(kyh0.delivery_ndd_address_flow_title);
                    } else if (cj50Var.a.isEmpty()) {
                        Y = ((avj0) zuj0Var).h(z7 ? kyh0.delivery_ndd_pod_from_title : kyh0.delivery_ndd_pod_to_title);
                    } else {
                        Y = F != null ? d6z.Y(deliveryPvzExperiment, deliveryPvzExperiment.p) : d6z.Y(deliveryPvzExperiment, deliveryPvzExperiment.o);
                    }
                    String str = Y;
                    avj0 avj0Var = (avj0) zuj0Var;
                    String h = avj0Var.h(z4 ? kyh0.delivery_ndd_courier_to_address_title : z7 ? kyh0.delivery_ndd_pod_from_address_title : kyh0.delivery_ndd_pod_to_address_title);
                    boolean z10 = state != state2 && (z4 ? !(!z2 || F == null || evu0.J(F) || booleanValue3) : !(F == null || evu0.J(F)));
                    if (z4 && (F == null || evu0.J(F))) {
                        Y2 = avj0Var.h(kyh0.delivery_ndd_courier_to_title);
                    } else if (!z4) {
                        Y2 = ((avj0) zuj0Var).h(z7 ? kyh0.delivery_ndd_pod_from_button : kyh0.delivery_ndd_pod_to_button);
                    } else if (F == null || evu0.J(F)) {
                        Y2 = d6z.Y(deliveryPvzExperiment, deliveryPvzExperiment.m);
                    } else {
                        Y2 = ((avj0) zuj0Var).h(z7 ? kyh0.delivery_ndd_pod_from_button : kyh0.delivery_ndd_pod_to_button);
                    }
                    zi50Var = new zi50(F, z9, z8, cj50Var, sh50Var, z7, z4, str, h, new bi50(z10, Y2), new kf60((z4 || booleanValue2 || !booleanValue3 || kyxVar.a) ? false : true, d6z.Y(deliveryPvzExperiment, deliveryPvzExperiment.n)), kyxVar, d43Var);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (vprVar.emit(zi50Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                kVar = kVar2;
            }
            z = false;
            if (ji50Var2 instanceof ii50) {
            }
            ji50Var = ji50Var2;
            z2 = z;
            zuj0Var = zuj0Var2;
            z3 = booleanValue;
            cj50Var = cj50.c;
            if (ji50Var.a()) {
            }
            kyx kyxVar2 = kyx.e;
            if (cd70Var != null) {
                if (!z5) {
                }
                if (jd70Var != null) {
                }
            }
            boolean z72 = aVar.b;
            z4 = nh50Var.b;
            AddressResolveRepository.State state22 = AddressResolveRepository.State.LOADING;
            if (state != state22) {
            }
            if (z4) {
            }
            if (sh50Var.a.isEmpty()) {
            }
            String str2 = Y;
            avj0 avj0Var2 = (avj0) zuj0Var;
            String h2 = avj0Var2.h(z4 ? kyh0.delivery_ndd_courier_to_address_title : z72 ? kyh0.delivery_ndd_pod_from_address_title : kyh0.delivery_ndd_pod_to_address_title);
            if (state != state22) {
                if (z4) {
                }
                if (!z4) {
                }
                zi50Var = new zi50(F, z9, z8, cj50Var, sh50Var, z72, z4, str2, h2, new bi50(z10, Y2), new kf60((z4 || booleanValue2 || !booleanValue3 || kyxVar2.a) ? false : true, d6z.Y(deliveryPvzExperiment, deliveryPvzExperiment.n)), kyxVar2, d43Var);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (vprVar.emit(zi50Var, this) == coroutineSingletons) {
                }
            }
            if (z4) {
            }
            if (!z4) {
            }
            zi50Var = new zi50(F, z9, z8, cj50Var, sh50Var, z72, z4, str2, h2, new bi50(z10, Y2), new kf60((z4 || booleanValue2 || !booleanValue3 || kyxVar2.a) ? false : true, d6z.Y(deliveryPvzExperiment, deliveryPvzExperiment.n)), kyxVar2, d43Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(zi50Var, this) == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
