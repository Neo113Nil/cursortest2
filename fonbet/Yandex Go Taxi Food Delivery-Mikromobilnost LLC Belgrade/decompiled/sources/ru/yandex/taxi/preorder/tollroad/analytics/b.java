package ru.yandex.taxi.preorder.tollroad.analytics;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class b implements tpr {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        LastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1 lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1;
        int i;
        if (continuation instanceof LastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1) {
            lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1 = (LastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1) continuation;
            int i2 = lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar);
                    lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.L$0 = null;
                    lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.L$1 = null;
                    lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.L$2 = null;
                    lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(aVar, lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1) == coroutineSingletons) {
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
        lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1 = new LastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1(this, continuation);
        Object obj2 = lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lastSelectedTariffOffersLifecycleListener$onAttach$1$invokeSuspend$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
