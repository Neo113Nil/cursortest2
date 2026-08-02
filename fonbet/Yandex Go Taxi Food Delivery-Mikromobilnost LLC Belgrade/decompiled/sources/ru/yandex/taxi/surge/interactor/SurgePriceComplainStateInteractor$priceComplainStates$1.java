package ru.yandex.taxi.surge.interactor;

import defpackage.aze0;
import defpackage.bvf0;
import defpackage.bze0;
import defpackage.eze0;
import defpackage.gze0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q47;
import defpackage.qye0;
import defpackage.rye0;
import defpackage.sye0;
import defpackage.tye0;
import defpackage.uye0;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luye0;", "loadingState", "", "Lwt60;", "Laze0;", "stateFlow", "Lgze0;", "<anonymous>", "(Luye0;Ljava/util/Map;)Lgze0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.interactor.SurgePriceComplainStateInteractor$priceComplainStates$1", f = "SurgePriceComplainStateInteractor.kt", l = {59, 65, 82, HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgePriceComplainStateInteractor$priceComplainStates$1 extends SuspendLambda implements zls {
    final /* synthetic */ rye0 $state;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgePriceComplainStateInteractor$priceComplainStates$1(r rVar, rye0 rye0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = rVar;
        this.$state = rye0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SurgePriceComplainStateInteractor$priceComplainStates$1 surgePriceComplainStateInteractor$priceComplainStates$1 = new SurgePriceComplainStateInteractor$priceComplainStates$1(this.this$0, this.$state, (Continuation) obj3);
        surgePriceComplainStateInteractor$priceComplainStates$1.L$0 = (uye0) obj;
        surgePriceComplainStateInteractor$priceComplainStates$1.L$1 = (Map) obj2;
        return surgePriceComplainStateInteractor$priceComplainStates$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        aze0 aze0Var;
        Object n;
        String str;
        Object n2;
        String str2;
        List list;
        Object d;
        String str3;
        List list2;
        Object d2;
        String str4;
        uye0 uye0Var = (uye0) this.L$0;
        Map map = (Map) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            aze0Var = (aze0) map.get(r.b(this.this$0));
            if (aze0Var == null) {
                aze0Var = aze0.c;
            }
            Set set = aze0Var.a;
            if (jl40.l(uye0Var, sye0.a)) {
                rye0 rye0Var = this.$state;
                String str5 = rye0Var.a;
                r rVar = this.this$0;
                ArrayList arrayList = rye0Var.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = aze0Var;
                this.L$3 = str5;
                this.label = 1;
                rVar.getClass();
                n2 = bvf0.n(new SurgePriceComplainStateInteractor$mapOptions$2(arrayList, rVar, set, false, null), this);
                if (n2 != coroutineSingletons) {
                    str2 = str5;
                    list = (List) n2;
                    qye0 qye0Var = this.$state.c;
                    r rVar2 = this.this$0;
                    boolean c = r.c(rVar2, aze0Var.a, aze0Var.b);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = str2;
                    this.L$5 = list;
                    this.label = 2;
                    d = rVar2.d(qye0Var, c, false, true, this);
                    if (d != coroutineSingletons) {
                    }
                }
            } else {
                if (!jl40.l(uye0Var, tye0.a)) {
                    w511.b();
                    return null;
                }
                rye0 rye0Var2 = this.$state;
                String str6 = rye0Var2.a;
                r rVar3 = this.this$0;
                ArrayList arrayList2 = rye0Var2.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = aze0Var;
                this.L$3 = str6;
                this.label = 3;
                rVar3.getClass();
                n = bvf0.n(new SurgePriceComplainStateInteractor$mapOptions$2(arrayList2, rVar3, set, true, null), this);
                if (n != coroutineSingletons) {
                    str = str6;
                    list2 = (List) n;
                    qye0 qye0Var2 = this.$state.c;
                    r rVar4 = this.this$0;
                    boolean c2 = r.c(rVar4, aze0Var.a, aze0Var.b);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = str;
                    this.L$5 = list2;
                    this.label = 4;
                    d2 = rVar4.d(qye0Var2, c2, true, false, this);
                    if (d2 != coroutineSingletons) {
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            String str7 = (String) this.L$3;
            aze0Var = (aze0) this.L$2;
            kotlin.b.b(obj);
            str2 = str7;
            n2 = obj;
            list = (List) n2;
            qye0 qye0Var3 = this.$state.c;
            r rVar22 = this.this$0;
            boolean c3 = r.c(rVar22, aze0Var.a, aze0Var.b);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = str2;
            this.L$5 = list;
            this.label = 2;
            d = rVar22.d(qye0Var3, c3, false, true, this);
            if (d != coroutineSingletons) {
                str3 = str2;
                return new gze0(str3, list, (q47) d, bze0.a);
            }
            return coroutineSingletons;
        }
        if (i == 2) {
            List list3 = (List) this.L$5;
            str3 = (String) this.L$4;
            kotlin.b.b(obj);
            list = list3;
            d = obj;
            return new gze0(str3, list, (q47) d, bze0.a);
        }
        if (i != 3) {
            if (i != 4) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list4 = (List) this.L$5;
            str4 = (String) this.L$4;
            kotlin.b.b(obj);
            list2 = list4;
            d2 = obj;
            return new gze0(str4, list2, (q47) d2, eze0.a);
        }
        String str8 = (String) this.L$3;
        aze0Var = (aze0) this.L$2;
        kotlin.b.b(obj);
        str = str8;
        n = obj;
        list2 = (List) n;
        qye0 qye0Var22 = this.$state.c;
        r rVar42 = this.this$0;
        boolean c22 = r.c(rVar42, aze0Var.a, aze0Var.b);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = str;
        this.L$5 = list2;
        this.label = 4;
        d2 = rVar42.d(qye0Var22, c22, true, false, this);
        if (d2 != coroutineSingletons) {
            str4 = str;
            return new gze0(str4, list2, (q47) d2, eze0.a);
        }
        return coroutineSingletons;
    }
}
