package ru.yandex.taxi.masstransit.ui.routeinfo;

import defpackage.jv30;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.wv30;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.routeinfo.MtRouteInfoModalKt$MtRouteInfoModal$3$1", f = "MtRouteInfoModal.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtRouteInfoModalKt$MtRouteInfoModal$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onAction;
    final /* synthetic */ wv30 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtRouteInfoModalKt$MtRouteInfoModal$3$1(wv30 wv30Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$state = wv30Var;
        this.$onAction = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MtRouteInfoModalKt$MtRouteInfoModal$3$1(this.$state, this.$onAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MtRouteInfoModalKt$MtRouteInfoModal$3$1 mtRouteInfoModalKt$MtRouteInfoModal$3$1 = (MtRouteInfoModalKt$MtRouteInfoModal$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        mtRouteInfoModalKt$MtRouteInfoModal$3$1.invokeSuspend(zy11Var);
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
        wv30 wv30Var = this.$state;
        String str = wv30Var.e;
        if (str != null) {
            this.$onAction.invoke(new jv30(wv30Var.d, str));
        }
        return zy11.a;
    }
}
