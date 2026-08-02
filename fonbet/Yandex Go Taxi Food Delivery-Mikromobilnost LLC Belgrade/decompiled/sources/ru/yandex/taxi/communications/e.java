package ru.yandex.taxi.communications;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.ihf;
import defpackage.j73;
import defpackage.ny61;
import defpackage.v40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes5.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1 storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1;
        int i;
        if (continuation instanceof StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1) {
            storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1 = (StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1) continuation;
            int i2 = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    v40 v40Var = (BaseFragment) obj;
                    if (!(v40Var instanceof ihf) || !kotlin.collections.a.G(j73.f0(new Screen[]{Screen.ORDER, Screen.ORDER_DETAILS, Screen.ORDERS_LIST, Screen.ORDER_TRACKING}), ((ihf) v40Var).getScreen())) {
                        storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.L$0 = null;
                        storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.L$1 = null;
                        storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.L$2 = null;
                        storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.L$3 = null;
                        storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.label = 1;
                        if (this.a.emit(obj, storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1) == coroutineSingletons) {
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
        storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1 = new StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1(this, continuation);
        Object obj22 = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$filterNot$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
