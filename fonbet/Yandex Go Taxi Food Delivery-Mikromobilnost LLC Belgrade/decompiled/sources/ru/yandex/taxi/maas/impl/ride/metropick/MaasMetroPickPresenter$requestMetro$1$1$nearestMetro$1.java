package ru.yandex.taxi.maas.impl.ride.metropick;

import defpackage.ahy;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.ga0;
import defpackage.hdu;
import defpackage.hnm;
import defpackage.ik50;
import defpackage.j7u0;
import defpackage.jl40;
import defpackage.knm;
import defpackage.lmo;
import defpackage.m7u0;
import defpackage.mcp0;
import defpackage.mk50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pud0;
import defpackage.q5z;
import defpackage.rmo;
import defpackage.ssd0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.uk50;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.maas.api.MaasApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lik50;", "<anonymous>", "(Ltse;)Lik50;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.maas.impl.ride.metropick.MaasMetroPickPresenter$requestMetro$1$1$nearestMetro$1", f = "MaasMetroPickPresenter.kt", l = {HProv.PP_FAST_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MaasMetroPickPresenter$requestMetro$1$1$nearestMetro$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $pinPoint;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaasMetroPickPresenter$requestMetro$1$1$nearestMetro$1(a aVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$pinPoint = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MaasMetroPickPresenter$requestMetro$1$1$nearestMetro$1(this.this$0, this.$pinPoint, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MaasMetroPickPresenter$requestMetro$1$1$nearestMetro$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mk50 mk50Var;
        Object a;
        Object obj2;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj4 = null;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            mk50Var = aVar.y;
            MaasApi maasApi = (MaasApi) aVar.E.getValue();
            zzs zzsVar = this.$pinPoint;
            cmt<uk50> a2 = maasApi.a(zzsVar.a, zzsVar.b);
            this.L$0 = mk50Var;
            this.label = 1;
            a = a2.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mk50 mk50Var2 = (mk50) this.L$0;
            kotlin.b.b(obj);
            mk50Var = mk50Var2;
            a = obj;
        }
        uk50 uk50Var = (uk50) ((fmt) a).a;
        mk50Var.getClass();
        List list = uk50Var.a;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                mcp0 mcp0Var = uk50Var.d;
                ga0 ga0Var = new ga0(mcp0Var.a, mcp0Var.b, false);
                mcp0 mcp0Var2 = uk50Var.e;
                return new ik50(arrayList, ga0Var, new ga0(mcp0Var2.a, mcp0Var2.b, false));
            }
            m7u0 m7u0Var = (m7u0) it.next();
            List list2 = m7u0Var.a;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, i2));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                rmo rmoVar = (rmo) it2.next();
                pud0 pud0Var = rmoVar.a;
                ssd0 ssd0Var = new ssd0(pud0Var.a, pud0Var.b);
                Iterator it3 = uk50Var.b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = obj4;
                        break;
                    }
                    obj3 = it3.next();
                    if (jl40.l(((knm) obj3).a, rmoVar.b)) {
                        break;
                    }
                }
                knm knmVar = (knm) obj3;
                if (knmVar == null) {
                    knmVar = new knm(i3);
                }
                pud0 pud0Var2 = knmVar.b;
                arrayList2.add(new lmo(ssd0Var, new hnm(new ssd0(pud0Var2.a, pud0Var2.b), knmVar.c), rmoVar.c));
                it2 = it2;
                obj4 = null;
                i3 = 0;
            }
            String str = m7u0Var.b;
            String str2 = m7u0Var.c;
            Iterator it4 = uk50Var.c.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it4.next();
                if (jl40.l(((ahy) obj2).a, m7u0Var.d)) {
                    break;
                }
            }
            ahy ahyVar = (ahy) obj2;
            if (ahyVar == null) {
                ahyVar = new ahy(0);
            }
            arrayList.add(new j7u0(arrayList2, str, str2, new hdu(q5z.S(ahyVar.b), ahyVar.e.a)));
            obj4 = null;
            i2 = 10;
        }
    }
}
