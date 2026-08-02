package ru.yandex.taxi.am;

import defpackage.ny61;
import defpackage.owx;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AccountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1 accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof AccountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1) {
            accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1 = (AccountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    String str = ((owx) obj).l;
                    accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1 = new AccountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountActivityLifecycleInteractor$onActivityCreate$2$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
