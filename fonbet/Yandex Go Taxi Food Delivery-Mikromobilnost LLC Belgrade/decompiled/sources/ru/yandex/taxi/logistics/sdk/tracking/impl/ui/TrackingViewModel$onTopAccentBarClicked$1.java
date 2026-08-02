package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.mvg;
import defpackage.nr;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yvz0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.models.ClickSource;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel$onTopAccentBarClicked$1", f = "TrackingViewModel.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingViewModel$onTopAccentBarClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ nr $action;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$onTopAccentBarClicked$1(k kVar, nr nrVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
        this.$action = nrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrackingViewModel$onTopAccentBarClicked$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingViewModel$onTopAccentBarClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r4 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
        yvz0 yvz0Var = this.this$0.E;
        nr nrVar = this.$action;
        this.label = 1;
        if (nrVar != null) {
            obj2 = yvz0Var.a.a(nrVar, ClickSource.ACTIONS_BLOCK, this);
        } else {
            yvz0Var.getClass();
        }
        obj2 = zy11Var;
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
