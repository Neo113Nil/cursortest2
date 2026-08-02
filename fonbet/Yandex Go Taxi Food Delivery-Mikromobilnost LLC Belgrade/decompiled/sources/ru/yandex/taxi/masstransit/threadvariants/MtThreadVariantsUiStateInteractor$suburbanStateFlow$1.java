package ru.yandex.taxi.masstransit.threadvariants;

import defpackage.avj0;
import defpackage.azy0;
import defpackage.b3v0;
import defpackage.dzy0;
import defpackage.ey20;
import defpackage.hj40;
import defpackage.kdc;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nyy0;
import defpackage.oob1;
import defpackage.py6;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.tdu;
import defpackage.up2;
import defpackage.uyy0;
import defpackage.vjx;
import defpackage.vpr;
import defpackage.w211;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Ley20;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.threadvariants.MtThreadVariantsUiStateInteractor$suburbanStateFlow$1", f = "MtThreadVariantsUiStateInteractor.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtThreadVariantsUiStateInteractor$suburbanStateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ azy0 $state;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtThreadVariantsUiStateInteractor$suburbanStateFlow$1(b bVar, azy0 azy0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$state = azy0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtThreadVariantsUiStateInteractor$suburbanStateFlow$1 mtThreadVariantsUiStateInteractor$suburbanStateFlow$1 = new MtThreadVariantsUiStateInteractor$suburbanStateFlow$1(this.this$0, this.$state, continuation);
        mtThreadVariantsUiStateInteractor$suburbanStateFlow$1.L$0 = obj;
        return mtThreadVariantsUiStateInteractor$suburbanStateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtThreadVariantsUiStateInteractor$suburbanStateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dzy0 dzy0Var = this.this$0.b;
            azy0 azy0Var = this.$state;
            avj0 avj0Var = (avj0) dzy0Var.b;
            String h = avj0Var.h(kyh0.mt_travel_options);
            hj40 hj40Var = azy0Var.a;
            String str = hj40Var != null ? hj40Var.a : null;
            if (str == null) {
                str = "";
            }
            tdu b = dzy0Var.b(h, str);
            List<b3v0> list = azy0Var.b;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (b3v0 b3v0Var : list) {
                MtTransportType mtTransportType = b3v0Var.b;
                String str2 = b3v0Var.a;
                kdc kdcVar = b3v0Var.h;
                dzy0 dzy0Var2 = dzy0Var;
                up2 up2Var = new up2(rzo.d(s8o.m(kdcVar, dzy0Var.a)));
                w211 w211Var = b3v0Var.d;
                arrayList.add(new nyy0(mtTransportType, str2, kdcVar, up2Var, w211Var.b, w211Var.a));
                dzy0Var = dzy0Var2;
            }
            hj40 hj40Var2 = azy0Var.a;
            oob1.c(hj40Var2 != null ? hj40Var2.c : null, arrayList);
            vjx vjxVar = azy0Var.c;
            ey20 ey20Var = new ey20(b, arrayList, vjxVar == null ? null : new py6(avj0Var.h(kyh0.mt_suburban_button), new uyy0(vjxVar), false), 4);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(ey20Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
