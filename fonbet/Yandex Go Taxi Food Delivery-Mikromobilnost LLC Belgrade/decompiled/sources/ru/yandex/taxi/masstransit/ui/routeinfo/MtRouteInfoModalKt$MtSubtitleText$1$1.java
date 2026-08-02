package ru.yandex.taxi.masstransit.ui.routeinfo;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.routeinfo.MtRouteInfoModalKt$MtSubtitleText$1$1", f = "MtRouteInfoModal.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRouteInfoModalKt$MtSubtitleText$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $shouldUseShortText$delegate;
    final /* synthetic */ oz40 $textWasCropped$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteInfoModalKt$MtSubtitleText$1$1(oz40 oz40Var, oz40 oz40Var2, Continuation continuation) {
        super(2, continuation);
        this.$textWasCropped$delegate = oz40Var;
        this.$shouldUseShortText$delegate = oz40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRouteInfoModalKt$MtSubtitleText$1$1(this.$textWasCropped$delegate, this.$shouldUseShortText$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtRouteInfoModalKt$MtSubtitleText$1$1 mtRouteInfoModalKt$MtSubtitleText$1$1 = (MtRouteInfoModalKt$MtSubtitleText$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtRouteInfoModalKt$MtSubtitleText$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (((Boolean) this.$textWasCropped$delegate.getValue()).booleanValue() && !((Boolean) this.$shouldUseShortText$delegate.getValue()).booleanValue()) {
            this.$shouldUseShortText$delegate.setValue(Boolean.TRUE);
        }
        return zy11.a;
    }
}
