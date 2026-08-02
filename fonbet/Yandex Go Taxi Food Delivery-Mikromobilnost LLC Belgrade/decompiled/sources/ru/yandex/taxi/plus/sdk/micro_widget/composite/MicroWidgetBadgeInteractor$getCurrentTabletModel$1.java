package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import defpackage.dkd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.xe20;
import defpackage.y1d0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldkd0;", "plusSdkContext", "Ly1d0;", "plusCounterModel", "Lpoc0;", "<anonymous>", "(Ldkd0;Ly1d0;)Lpoc0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.composite.MicroWidgetBadgeInteractor$getCurrentTabletModel$1", f = "MicroWidgetBadgeInteractor.kt", l = {83}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MicroWidgetBadgeInteractor$getCurrentTabletModel$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $clientSubSource;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ xe20 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroWidgetBadgeInteractor$getCurrentTabletModel$1(xe20 xe20Var, String str, Continuation continuation) {
        super(3, continuation);
        this.this$0 = xe20Var;
        this.$clientSubSource = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MicroWidgetBadgeInteractor$getCurrentTabletModel$1 microWidgetBadgeInteractor$getCurrentTabletModel$1 = new MicroWidgetBadgeInteractor$getCurrentTabletModel$1(this.this$0, this.$clientSubSource, (Continuation) obj3);
        microWidgetBadgeInteractor$getCurrentTabletModel$1.L$0 = (dkd0) obj;
        microWidgetBadgeInteractor$getCurrentTabletModel$1.L$1 = (y1d0) obj2;
        return microWidgetBadgeInteractor$getCurrentTabletModel$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        dkd0 dkd0Var = (dkd0) this.L$0;
        y1d0 y1d0Var = (y1d0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.taxi.plus.repository.mappers.c cVar = this.this$0.h;
        String str = this.$clientSubSource;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        Object a = cVar.a(dkd0Var, y1d0Var, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
