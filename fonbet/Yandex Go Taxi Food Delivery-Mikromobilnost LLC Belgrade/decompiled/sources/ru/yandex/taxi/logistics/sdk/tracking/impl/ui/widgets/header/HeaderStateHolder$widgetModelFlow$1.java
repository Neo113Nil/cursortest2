package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header;

import defpackage.aif0;
import defpackage.cbu;
import defpackage.j73;
import defpackage.mvg;
import defpackage.n351;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcbu;", "headerModel", "Laif0;", "progressBarModel", "", "Ln351;", "<anonymous>", "(Lcbu;Laif0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.HeaderStateHolder$widgetModelFlow$1", f = "HeaderStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class HeaderStateHolder$widgetModelFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        HeaderStateHolder$widgetModelFlow$1 headerStateHolder$widgetModelFlow$1 = new HeaderStateHolder$widgetModelFlow$1(3, (Continuation) obj3);
        headerStateHolder$widgetModelFlow$1.L$0 = (cbu) obj;
        headerStateHolder$widgetModelFlow$1.L$1 = (aif0) obj2;
        return headerStateHolder$widgetModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        cbu cbuVar = (cbu) this.L$0;
        aif0 aif0Var = (aif0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return j73.A(new n351[]{cbuVar, aif0Var});
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
