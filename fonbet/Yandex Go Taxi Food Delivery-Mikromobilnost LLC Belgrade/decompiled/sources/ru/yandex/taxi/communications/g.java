package ru.yandex.taxi.communications;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;

    public g(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1 storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1) {
            storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1 = (StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1) continuation;
            int i2 = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.L$0 = null;
                storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.L$1 = null;
                storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.L$2 = null;
                storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.L$3 = null;
                storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.label = 1;
                return this.a.emit(zy11Var, storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1 = new StoryNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1(this, continuation);
        Object obj22 = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storyNavigationChangesInteractor$observeNavigationChanges$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
