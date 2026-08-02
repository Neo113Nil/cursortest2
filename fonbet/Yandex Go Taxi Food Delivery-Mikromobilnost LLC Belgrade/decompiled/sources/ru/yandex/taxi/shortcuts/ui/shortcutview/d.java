package ru.yandex.taxi.shortcuts.ui.shortcutview;

import defpackage.d4s0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ArrayList b;

    public d(vpr vprVar, ArrayList arrayList) {
        this.a = vprVar;
        this.b = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) {
            shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 = (ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = new Pair((d4s0) obj, this.b);
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 = new ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
