package ru.yandex.taxi.summary.requirements.list.recycler;

import defpackage.aij0;
import defpackage.apj0;
import defpackage.aqj0;
import defpackage.bij0;
import defpackage.boj0;
import defpackage.dij0;
import defpackage.eij0;
import defpackage.fij0;
import defpackage.hij0;
import defpackage.hxx;
import defpackage.idj0;
import defpackage.iij0;
import defpackage.jij0;
import defpackage.kij0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.tse;
import defpackage.uhj0;
import defpackage.uhx0;
import defpackage.vhj0;
import defpackage.w511;
import defpackage.whj0;
import defpackage.wiy0;
import defpackage.wls;
import defpackage.xhj0;
import defpackage.yhj0;
import defpackage.yvf0;
import defpackage.zhj0;
import defpackage.zkz0;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;
import ru.yandex.taxi.summary.requirements.list.models.RequirementType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.recycler.RequirementItemsExternalDelegate$handleRequirementClick$1", f = "RequirementItemsExternalDelegate.kt", l = {67}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementItemsExternalDelegate$handleRequirementClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ uhx0 $item;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementItemsExternalDelegate$handleRequirementClick$1(i iVar, uhx0 uhx0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$item = uhx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementItemsExternalDelegate$handleRequirementClick$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementItemsExternalDelegate$handleRequirementClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object value;
        LinkedHashMap linkedHashMap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boj0 boj0Var = this.this$0.c;
        h0 h0Var = (h0) boj0Var.y;
        kij0 kij0Var = (kij0) this.$item;
        this.label = 1;
        if (kij0Var instanceof hij0) {
            hij0 hij0Var = (hij0) kij0Var;
            apj0 apj0Var = hij0Var.a;
            idj0 idj0Var = apj0Var.h;
            String str = apj0Var.a;
            if (idj0Var != null) {
                if (!apj0Var.e) {
                    ((aqj0) boj0Var.x).a(str);
                }
                zkz0 zkz0Var = (zkz0) boj0Var.z;
                r0 r0Var = zkz0Var.b;
                do {
                    value = r0Var.getValue();
                    linkedHashMap = new LinkedHashMap((Map) value);
                    linkedHashMap.put(str, Boolean.valueOf(zkz0Var.a(hij0Var)));
                } while (!r0Var.k(value, linkedHashMap));
            }
            b = h0Var.b(str, this, true);
        } else {
            if (kij0Var instanceof fij0) {
                ((ru.yandex.taxi.summary.requirements.list.interactors.a) boj0Var.w).e.g();
                ((pep0) ((oep0) boj0Var.b)).f((m950) ((yvf0) boj0Var.c).get(), new wiy0(), hxx.a);
            } else if (kij0Var instanceof jij0) {
                b = h0Var.b(((jij0) kij0Var).a.a, this, true);
            } else if (kij0Var instanceof aij0) {
                h0Var.c(RequirementType.ORDER_DUE);
            } else if (kij0Var instanceof zhj0) {
                h0Var.c(RequirementType.INTERCITY_CONTACT);
            } else if (kij0Var instanceof vhj0) {
                h0Var.c(RequirementType.DRIVER_COMMENT);
            } else if (kij0Var instanceof whj0) {
                h0Var.c(RequirementType.COST_CENTER);
            } else if (kij0Var instanceof bij0) {
                h0Var.c(RequirementType.ORDER_FOR_OTHER);
            } else if (kij0Var instanceof xhj0) {
                h0Var.c(RequirementType.EXTRA_PHONE_NUMBER);
            } else if (kij0Var instanceof iij0) {
                h0Var.c(RequirementType.TRANSFER);
            } else if (!(kij0Var instanceof yhj0) && !(kij0Var instanceof uhj0) && !(kij0Var instanceof dij0) && !(kij0Var instanceof eij0)) {
                w511.b();
                return null;
            }
            b = zy11Var;
        }
        return b == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
