package ru.yandex.taxi.preorder.source.domain;

import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.tariffs.model.TariffSource;

/* loaded from: classes6.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;

    public k(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShowDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1 showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof ShowDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1) {
            showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1 = (ShowDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
            int i2 = showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((pex0) obj).a == TariffSource.ZONE_INFO_AND_FULL_ROUTE_STATS) {
                        showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.L$0 = null;
                        showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.L$1 = null;
                        showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.L$2 = null;
                        showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.L$3 = null;
                        showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1 = new ShowDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = showDuePickerInteractorImpl$tryShowDuePicker$1$invokeSuspend$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
