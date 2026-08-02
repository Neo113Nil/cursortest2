package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.domain.TrackingActionsHandler$onExtendExpirationDateClicked$1", f = "TrackingActionsHandler.kt", l = {249}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingActionsHandler$onExtendExpirationDateClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ sn $action;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingActionsHandler$onExtendExpirationDateClicked$1(l lVar, sn snVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$action = snVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingActionsHandler$onExtendExpirationDateClicked$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingActionsHandler$onExtendExpirationDateClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0.l;
            sn snVar = this.$action;
            ClickSource clickSource = ClickSource.ACTIONS_BLOCK;
            this.label = 1;
            if (jVar.a(snVar, clickSource, this) == coroutineSingletons) {
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
