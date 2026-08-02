package ru.yandex.taxi.linked_order.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/linked_order/interactor/MapFocusType;", "focusEnabled", "", "terminated"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.linked_order.interactor.LinkedOrderMapOverlayDataInteractor$listenMapFocusType$2", f = "LinkedOrderMapOverlayDataInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderMapOverlayDataInteractor$listenMapFocusType$2 extends SuspendLambda implements zls {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        LinkedOrderMapOverlayDataInteractor$listenMapFocusType$2 linkedOrderMapOverlayDataInteractor$listenMapFocusType$2 = new LinkedOrderMapOverlayDataInteractor$listenMapFocusType$2(3, (Continuation) obj3);
        linkedOrderMapOverlayDataInteractor$listenMapFocusType$2.Z$0 = booleanValue;
        linkedOrderMapOverlayDataInteractor$listenMapFocusType$2.Z$1 = booleanValue2;
        return linkedOrderMapOverlayDataInteractor$listenMapFocusType$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return !z ? MapFocusType.NONE : z2 ? MapFocusType.DESTINATION : MapFocusType.ALL;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
