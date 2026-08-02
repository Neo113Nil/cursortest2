package ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain;

import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oe11;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loe11;", ConfigConstants.CONFIG, "Lj6s;", "formState", "Lkotlin/Pair;", "<anonymous>", "(Loe11;Lj6s;)Lkotlin/Pair;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.AbandonedCartInteractor$attach$1", f = "AbandonedCartInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AbandonedCartInteractor$attach$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AbandonedCartInteractor$attach$1 abandonedCartInteractor$attach$1 = new AbandonedCartInteractor$attach$1(3, (Continuation) obj3);
        abandonedCartInteractor$attach$1.L$0 = (oe11) obj;
        abandonedCartInteractor$attach$1.L$1 = (j6s) obj2;
        return abandonedCartInteractor$attach$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oe11 oe11Var = (oe11) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new Pair(oe11Var, j6sVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
