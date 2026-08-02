package ru.yandex.taxi.am.early_authorization;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.yan;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.AutoLoginState;

/* loaded from: classes5.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, g gVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EarlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1 earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof EarlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1) {
            earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1 = (EarlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1) continuation;
            int i2 = earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = yan.a[((AutoLoginState) obj).ordinal()];
                    Boolean valueOf = Boolean.valueOf(i3 == 1 || i3 == 2);
                    earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.L$0 = null;
                    earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.L$1 = null;
                    earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.L$2 = null;
                    earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.L$3 = null;
                    earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(valueOf, earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1) == coroutineSingletons) {
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
        earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1 = new EarlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1(this, continuation);
        Object obj22 = earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = earlyAuthorizationInteractor$awaitEarlyLoginReady$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
