package ru.yandex.taxi.logistics.common;

import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.c;
import com.yandex.go.models.SummaryRedirectActionModel;
import defpackage.c4w0;
import defpackage.d4w0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ssi;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.common.DeliverySummaryRouterImpl$openSummary$openSummaryJob$1", f = "DeliverySummaryRouterImpl.kt", l = {187}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliverySummaryRouterImpl$openSummary$openSummaryJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ ssi $model;
    final /* synthetic */ SummaryRedirectActionModel $shortcutAction;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliverySummaryRouterImpl$openSummary$openSummaryJob$1(a aVar, SummaryRedirectActionModel summaryRedirectActionModel, ssi ssiVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$shortcutAction = summaryRedirectActionModel;
        this.$model = ssiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliverySummaryRouterImpl$openSummary$openSummaryJob$1(this.this$0, this.$shortcutAction, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliverySummaryRouterImpl$openSummary$openSummaryJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c4w0 c4w0Var = this.this$0.q;
            SummaryRedirectActionModel summaryRedirectActionModel = this.$shortcutAction;
            ssi ssiVar = this.$model;
            this.label = 1;
            c cVar = (c) c4w0Var;
            if (cVar.e(summaryRedirectActionModel, ssiVar, new d4w0(cVar, cVar.d(summaryRedirectActionModel), 0), this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
