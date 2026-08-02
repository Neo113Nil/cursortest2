package ru.yandex.taxi.linked_order.interactor;

import com.yandex.runtime.image.ImageProvider;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s35;
import defpackage.w48;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/yandex/runtime/image/ImageProvider;", "kotlin.jvm.PlatformType", "icon", "Ls35;", "mapInfo", "Lw48;", "<anonymous>", "(Lcom/yandex/runtime/image/ImageProvider;Ls35;)Lw48;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LinkedOrderMapOverlayDataInteractor$listenCarImage$1", f = "LinkedOrderMapOverlayDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderMapOverlayDataInteractor$listenCarImage$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinkedOrderMapOverlayDataInteractor$listenCarImage$1 linkedOrderMapOverlayDataInteractor$listenCarImage$1 = new LinkedOrderMapOverlayDataInteractor$listenCarImage$1(3, (Continuation) obj3);
        linkedOrderMapOverlayDataInteractor$listenCarImage$1.L$0 = (ImageProvider) obj;
        linkedOrderMapOverlayDataInteractor$listenCarImage$1.L$1 = (s35) obj2;
        return linkedOrderMapOverlayDataInteractor$listenCarImage$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ImageProvider imageProvider = (ImageProvider) this.L$0;
        s35 s35Var = (s35) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new w48(imageProvider, s35Var.c, s35Var.d);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
