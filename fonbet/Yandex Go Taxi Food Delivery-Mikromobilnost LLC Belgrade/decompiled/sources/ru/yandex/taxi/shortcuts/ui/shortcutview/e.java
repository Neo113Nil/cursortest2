package ru.yandex.taxi.shortcuts.ui.shortcutview;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ArrayList b;

    public e(tpr tprVar, ArrayList arrayList) {
        this.a = tprVar;
        this.b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1 shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1) {
            shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1 = (ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1) continuation;
            int i2 = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$0 = null;
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$1 = null;
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.L$2 = null;
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1 = new ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
