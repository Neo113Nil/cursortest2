package ru.yandex.taxi.interactors;

import defpackage.no21;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class c implements tpr {
    public final /* synthetic */ ru.yandex.taxi.b a;
    public final /* synthetic */ no21 b;

    public c(ru.yandex.taxi.b bVar, no21 no21Var) {
        this.a = bVar;
        this.b = no21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        UserLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1 userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof UserLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1) {
            userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1 = (UserLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1) continuation;
            int i2 = userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.L$0 = null;
                    userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.L$1 = null;
                    userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.L$2 = null;
                    userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1 = new UserLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userLocationAssetsInteractorImpl$userLocationMapIconStrategyFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
