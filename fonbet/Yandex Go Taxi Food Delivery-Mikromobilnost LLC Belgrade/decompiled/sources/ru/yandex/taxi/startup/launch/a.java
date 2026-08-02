package ru.yandex.taxi.startup.launch;

import defpackage.i38;
import defpackage.ny61;
import defpackage.t36;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public final ru.yandex.taxi.am.token.a a;
    public final t36 b;
    public final i38 c;

    public a(ru.yandex.taxi.am.token.a aVar, t36 t36Var, i38 i38Var) {
        this.a = aVar;
        this.b = t36Var;
        this.c = i38Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        AuthErrorInteractor$onUnauthorizedError$1 authErrorInteractor$onUnauthorizedError$1;
        int i;
        if (continuationImpl instanceof AuthErrorInteractor$onUnauthorizedError$1) {
            authErrorInteractor$onUnauthorizedError$1 = (AuthErrorInteractor$onUnauthorizedError$1) continuationImpl;
            int i2 = authErrorInteractor$onUnauthorizedError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authErrorInteractor$onUnauthorizedError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authErrorInteractor$onUnauthorizedError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authErrorInteractor$onUnauthorizedError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null) {
                        str = "";
                    }
                    authErrorInteractor$onUnauthorizedError$1.L$0 = null;
                    authErrorInteractor$onUnauthorizedError$1.L$1 = null;
                    authErrorInteractor$onUnauthorizedError$1.label = 1;
                    if (this.a.h(str, authErrorInteractor$onUnauthorizedError$1) == coroutineSingletons) {
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
        authErrorInteractor$onUnauthorizedError$1 = new AuthErrorInteractor$onUnauthorizedError$1(this, continuationImpl);
        Object obj2 = authErrorInteractor$onUnauthorizedError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authErrorInteractor$onUnauthorizedError$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
