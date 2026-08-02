package ru.yandex.taxi;

import defpackage.go60;
import defpackage.lzu0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lzu0 b;

    public j(vpr vprVar, lzu0 lzu0Var) {
        this.a = vprVar;
        this.b = lzu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1 superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1) {
            superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1 = (SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1) continuation;
            int i2 = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.label;
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
                this.b.invoke((go60) obj);
                superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.L$0 = null;
                superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.L$1 = null;
                superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.L$2 = null;
                superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.L$3 = null;
                superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.label = 1;
                return this.a.emit(zy11Var, superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1 = new SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1(this, continuation);
        Object obj22 = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
