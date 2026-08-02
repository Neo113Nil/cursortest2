package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import defpackage.b4;
import defpackage.fza0;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe11;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Loe11;", "Lj6s;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.AbandonedCartInteractor$attach$3", f = "AbandonedCartInteractor.kt", l = {60}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AbandonedCartInteractor$attach$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbandonedCartInteractor$attach$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AbandonedCartInteractor$attach$3 abandonedCartInteractor$attach$3 = new AbandonedCartInteractor$attach$3(this.this$0, continuation);
        abandonedCartInteractor$attach$3.L$0 = obj;
        return abandonedCartInteractor$attach$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AbandonedCartInteractor$attach$3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r7 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        oe11 oe11Var = (oe11) pair.getFirst();
        j6s j6sVar = (j6s) pair.getSecond();
        a aVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        aVar.getClass();
        if (oe11Var == null || !oe11Var.a) {
            aVar.j.a.l(null);
        } else {
            b4 b4Var = oe11Var.b;
            if (b4Var != null) {
                List list = ((fza0) aVar.e.c).b(Permission.NOTIFICATION) ? b4Var.a : null;
                if (list != null) {
                    obj2 = aVar.d(list, j6sVar, this);
                }
            }
        }
        obj2 = zy11Var;
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
