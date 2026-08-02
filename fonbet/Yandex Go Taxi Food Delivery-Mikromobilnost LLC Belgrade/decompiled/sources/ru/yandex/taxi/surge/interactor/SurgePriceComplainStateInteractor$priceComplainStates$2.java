package ru.yandex.taxi.surge.interactor;

import defpackage.aze0;
import defpackage.bvf0;
import defpackage.cze0;
import defpackage.dze0;
import defpackage.gze0;
import defpackage.hmc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q47;
import defpackage.qye0;
import defpackage.rye0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lgze0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgePriceComplainStateInteractor$priceComplainStates$2", f = "SurgePriceComplainStateInteractor.kt", l = {106, 112, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainStateInteractor$priceComplainStates$2 extends SuspendLambda implements wls {
    final /* synthetic */ rye0 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainStateInteractor$priceComplainStates$2(r rVar, rye0 rye0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$state = rye0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SurgePriceComplainStateInteractor$priceComplainStates$2 surgePriceComplainStateInteractor$priceComplainStates$2 = new SurgePriceComplainStateInteractor$priceComplainStates$2(this.this$0, this.$state, continuation);
        surgePriceComplainStateInteractor$priceComplainStates$2.L$0 = obj;
        return surgePriceComplainStateInteractor$priceComplainStates$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgePriceComplainStateInteractor$priceComplainStates$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e7, code lost:
    
        if (r2.emit(r3, r15) != r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object n;
        vpr vprVar;
        aze0 aze0Var;
        String str;
        List list;
        Object d;
        vpr vprVar2;
        String str2;
        aze0 aze0Var2;
        vpr vprVar3 = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r rVar = this.this$0;
            aze0 a = rVar.d.a(r.b(rVar));
            rye0 rye0Var = this.$state;
            String str3 = rye0Var.a;
            r rVar2 = this.this$0;
            ArrayList arrayList = rye0Var.b;
            Set set = a.a;
            this.L$0 = null;
            this.L$1 = a;
            this.L$2 = vprVar3;
            this.L$3 = str3;
            this.label = 1;
            rVar2.getClass();
            n = bvf0.n(new SurgePriceComplainStateInteractor$mapOptions$2(arrayList, rVar2, set, true, null), this);
            if (n != coroutineSingletons) {
                vprVar = vprVar3;
                aze0Var = a;
                str = str3;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            String str4 = (String) this.L$3;
            vpr vprVar4 = (vpr) this.L$2;
            aze0 aze0Var3 = (aze0) this.L$1;
            kotlin.b.b(obj);
            str = str4;
            vprVar = vprVar4;
            aze0Var = aze0Var3;
            n = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            List list2 = (List) this.L$5;
            str2 = (String) this.L$4;
            vprVar2 = (vpr) this.L$3;
            aze0Var2 = (aze0) this.L$1;
            kotlin.b.b(obj);
            list = list2;
            d = obj;
            q47 q47Var = (q47) d;
            hmc hmcVar = this.$state.d;
            gze0 gze0Var = new gze0(str2, list, q47Var, hmcVar == null ? new cze0(new hmc(hmcVar.a, aze0Var2.b)) : dze0.a);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
        }
        list = (List) n;
        qye0 qye0Var = this.$state.c;
        r rVar3 = this.this$0;
        boolean c = r.c(rVar3, aze0Var.a, aze0Var.b);
        this.L$0 = null;
        this.L$1 = aze0Var;
        this.L$2 = null;
        this.L$3 = vprVar;
        this.L$4 = str;
        this.L$5 = list;
        this.label = 2;
        d = rVar3.d(qye0Var, c, true, false, this);
        if (d != coroutineSingletons) {
            vprVar2 = vprVar;
            str2 = str;
            aze0Var2 = aze0Var;
            q47 q47Var2 = (q47) d;
            hmc hmcVar2 = this.$state.d;
            gze0 gze0Var2 = new gze0(str2, list, q47Var2, hmcVar2 == null ? new cze0(new hmc(hmcVar2.a, aze0Var2.b)) : dze0.a);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
