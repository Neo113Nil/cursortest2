package ru.yandex.taxi;

import defpackage.g92;
import defpackage.lzu0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class k implements tpr {
    public final /* synthetic */ g92 a;
    public final /* synthetic */ lzu0 b;

    public k(g92 g92Var, lzu0 lzu0Var) {
        this.a = g92Var;
        this.b = lzu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1 superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1) {
            superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1 = (SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1) continuation;
            int i2 = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.L$0 = null;
                    superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.L$1 = null;
                    superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.L$2 = null;
                    superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1) == coroutineSingletons) {
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
        superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1 = new SuperappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1(this, continuation);
        Object obj2 = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappAuthorizerImpl$authorizeWithToken$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
