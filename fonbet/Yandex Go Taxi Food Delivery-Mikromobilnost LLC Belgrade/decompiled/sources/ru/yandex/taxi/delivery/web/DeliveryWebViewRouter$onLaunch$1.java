package ru.yandex.taxi.delivery.web;

import defpackage.bhh;
import defpackage.dg41;
import defpackage.ff41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scg;
import defpackage.tse;
import defpackage.wls;
import defpackage.wui;
import defpackage.wvi;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.web.DeliveryWebViewRouter$onLaunch$1", f = "DeliveryWebViewRouter.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryWebViewRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ wvi $payload;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryWebViewRouter$onLaunch$1(wvi wviVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = wviVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryWebViewRouter$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryWebViewRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object P;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.$payload.e.invoke();
            b bVar = this.this$0;
            wvi wviVar = this.$payload;
            String str = wviVar.a;
            boolean z = wviVar.b;
            boolean z2 = wviVar.c;
            boolean z3 = wviVar.d;
            bhh bhhVar = new bhh(29, bVar);
            this.label = 1;
            P = b.P(bVar, str, z, z2, z3, bhhVar, this);
            if (P == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            P = obj;
        }
        UiWebViewConfig uiWebViewConfig = (UiWebViewConfig) P;
        b bVar2 = this.this$0;
        bVar2.A(((scg) ((ff41) bVar2.G.getValue())).b(), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), new wui(this.this$0, 1));
        this.$payload.f.invoke();
        return zy11.a;
    }
}
