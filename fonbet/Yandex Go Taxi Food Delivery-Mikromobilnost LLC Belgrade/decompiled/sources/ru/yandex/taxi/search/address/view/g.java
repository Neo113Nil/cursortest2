package ru.yandex.taxi.search.address.view;

import defpackage.eci0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class g implements tpr {
    public final /* synthetic */ tpr a;

    public g(eci0 eci0Var) {
        this.a = eci0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        NoInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1 noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof NoInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1) {
            noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1 = (NoInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1) continuation;
            int i2 = noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = new f(vprVar);
                    noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$0 = null;
                    noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$1 = null;
                    noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$2 = null;
                    noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(fVar, noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1 = new NoInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = noInternetConnectionRouter$onLaunch$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
