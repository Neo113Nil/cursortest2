package ru.yandex.taxi.linked_order.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s35;
import defpackage.zls;
import defpackage.zy11;
import defpackage.zzz0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls35;", "info", "", ClidProvider.APP_ACTIVE, "Lzzz0;", "<anonymous>", "(Ls35;Z)Lzzz0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LinkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1", f = "LinkedOrderMapOverlayDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        LinkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1 linkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1 = new LinkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1(3, (Continuation) obj3);
        linkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1.L$0 = (s35) obj;
        linkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1.Z$0 = booleanValue;
        return linkedOrderMapOverlayDataInteractor$listenCarGeometry$trackInfo$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s35 s35Var = (s35) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new zzz0(s35Var.j, z && !s35Var.d && s35Var.g);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
