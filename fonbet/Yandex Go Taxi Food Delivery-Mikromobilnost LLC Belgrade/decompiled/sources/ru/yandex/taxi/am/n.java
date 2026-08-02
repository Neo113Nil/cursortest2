package ru.yandex.taxi.am;

import defpackage.ny61;
import defpackage.pne;
import defpackage.ua41;
import defpackage.xfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public abstract class n {
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, String str, ContinuationImpl continuationImpl) {
        AuthorizationUrlInteractorKt$wrapToAuthorizationUrl$1 authorizationUrlInteractorKt$wrapToAuthorizationUrl$1;
        int i;
        ua41 ua41Var;
        if (continuationImpl instanceof AuthorizationUrlInteractorKt$wrapToAuthorizationUrl$1) {
            authorizationUrlInteractorKt$wrapToAuthorizationUrl$1 = (AuthorizationUrlInteractorKt$wrapToAuthorizationUrl$1) continuationImpl;
            int i2 = authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AuthType authType = AuthType.COOKIES;
                    authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.L$0 = null;
                    authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.L$1 = null;
                    authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.label = 1;
                    obj = oVar.b(str, authType, authorizationUrlInteractorKt$wrapToAuthorizationUrl$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ua41Var = (ua41) obj;
                if (!(ua41Var instanceof pne)) {
                    return ((pne) ua41Var).a;
                }
                xfo.g(ua41Var);
                return null;
            }
        }
        authorizationUrlInteractorKt$wrapToAuthorizationUrl$1 = new AuthorizationUrlInteractorKt$wrapToAuthorizationUrl$1(continuationImpl);
        Object obj3 = authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = authorizationUrlInteractorKt$wrapToAuthorizationUrl$1.label;
        if (i != 0) {
        }
        ua41Var = (ua41) obj3;
        if (!(ua41Var instanceof pne)) {
        }
    }
}
