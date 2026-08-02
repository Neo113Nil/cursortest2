package ru.yandex.taxi.surge.interactor;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;

    public h(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1 summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1) {
            summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1 = (SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Screen screen = (Screen) obj;
                    Boolean valueOf = Boolean.valueOf(screen == Screen.SUMMARY || screen == Screen.MOBILITY_HUB);
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1 = new SummaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryWidgetStateInteractor$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
