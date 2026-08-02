package ru.yandex.taxi.logistics.delivery_form.repository;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.ati;
import defpackage.ex70;
import defpackage.fnx0;
import defpackage.fx70;
import defpackage.igi;
import defpackage.ik31;
import defpackage.ini;
import defpackage.j2i;
import defpackage.l2i;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.nbi;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.r1i;
import defpackage.s1i;
import defpackage.tcc;
import defpackage.u1i;
import defpackage.v1i;
import defpackage.v580;
import defpackage.w1i;
import defpackage.yi70;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzy11;", "offerChangedSignal", "Lik31;", "snapshot", "Lini;", "<anonymous>", "(VLru/yandex/taxi/tariffs/model/verticals/VerticalsSnapshot;)Lru/yandex/taxi/delivery/base/routestats/DeliveryRouteStatsInfo;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.delivery_form.repository.DeliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2", f = "DeliveryRouteStatsProviderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2 deliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2 = new DeliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2(this.this$0, (Continuation) obj3);
        deliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2.L$0 = (ik31) obj2;
        return deliveryRouteStatsProviderImpl$deliveryRouteStatsInfoFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var;
        String str;
        boolean z;
        ex70 ex70Var;
        ex70 ex70Var2;
        v580 v580Var;
        String str2;
        String str3;
        s1i s1iVar;
        mi31 mi31Var2;
        Object obj2;
        ex70 ex70Var3;
        String str4;
        l2i l2iVar;
        nbi nbiVar;
        ik31 ik31Var = (ik31) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = ik31Var.c;
        mi31 mi31Var3 = ik31Var.b;
        boolean z2 = priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING;
        pex0 pex0Var = mi31Var3.a;
        String e = pex0Var.e();
        String str5 = pex0Var.D;
        TariffOrderFlow tariffOrderFlow = pex0Var.u0;
        ati atiVar = pex0Var.Z;
        if (atiVar != null) {
            String str6 = atiVar.a;
            v580Var = atiVar.b;
            igi igiVar = atiVar.k;
            if (igiVar == null || (nbiVar = igiVar.a) == null) {
                str2 = null;
                ex70Var3 = null;
            } else {
                ex70Var3 = nbiVar.a;
                yi70 yi70Var = nbiVar.b;
                str2 = yi70Var != null ? yi70Var.a : null;
            }
            r1i r1iVar = atiVar.g;
            if (r1iVar != null) {
                ex70Var = null;
                w1i w1iVar = this.this$0.f;
                j2i j2iVar = r1iVar.a;
                w1iVar.getClass();
                if (j2iVar != null) {
                    String str7 = j2iVar.a;
                    ArrayList arrayList = j2iVar.b;
                    mi31Var = mi31Var3;
                    str = e;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        u1i u1iVar = (u1i) it.next();
                        arrayList2.add(new v1i(u1iVar.a, u1iVar.b, u1iVar.c));
                        it = it;
                        z2 = z2;
                        str6 = str6;
                    }
                    z = z2;
                    str4 = str6;
                    u1i u1iVar2 = j2iVar.c;
                    l2iVar = new l2i(str7, arrayList2, new v1i(u1iVar2.a, u1iVar2.b, u1iVar2.c), j2iVar.d);
                } else {
                    mi31Var = mi31Var3;
                    str = e;
                    z = z2;
                    str4 = str6;
                    l2iVar = null;
                }
                s1iVar = new s1i(l2iVar, r1iVar.b);
                ex70Var2 = ex70Var3;
            } else {
                mi31Var = mi31Var3;
                str = e;
                z = z2;
                str4 = str6;
                ex70Var = null;
                ex70Var2 = ex70Var3;
                s1iVar = null;
            }
            str3 = str4;
        } else {
            mi31Var = mi31Var3;
            str = e;
            z = z2;
            ex70Var = null;
            ex70Var2 = null;
            v580Var = null;
            str2 = null;
            str3 = null;
            s1iVar = null;
        }
        String str8 = (str2 == null && (str2 = pex0Var.p) == null) ? "" : str2;
        String str9 = str == null ? "" : str;
        fnx0 n = ((k) this.this$0.b).n();
        if (n == null || (mi31Var2 = n.a) == null) {
            mi31Var2 = mi31Var;
        }
        pex0 pex0Var2 = mi31Var2.a;
        TariffOrderFlow tariffOrderFlow2 = pex0Var2.u0;
        TariffOrderFlow tariffOrderFlow3 = TariffOrderFlow.DELIVERY_FLOW;
        boolean z3 = tariffOrderFlow2 == tariffOrderFlow3 && (!pex0Var2.J0.b.b || z);
        boolean z4 = tariffOrderFlow == tariffOrderFlow3;
        this.this$0.getClass();
        if (v580Var != null || ex70Var2 != null) {
            if (ex70Var2 != null) {
                obj2 = new fx70(ex70Var2.a, ex70Var2.b, ex70Var2.c);
            } else {
                ex70 ex70Var4 = v580Var != null ? v580Var.a : ex70Var;
                if (ex70Var4 != null) {
                    obj2 = new fx70(ex70Var4.a, ex70Var4.b, ex70Var4.c);
                }
            }
            return new ini(str9, z, str8, str5, z3, z4, str3, obj2, this.this$0.e.a(pex0Var), pex0Var.r.a, pex0Var.b, s1iVar);
        }
        obj2 = ex70Var;
        return new ini(str9, z, str8, str5, z3, z4, str3, obj2, this.this$0.e.a(pex0Var), pex0Var.r.a, pex0Var.b, s1iVar);
    }
}
