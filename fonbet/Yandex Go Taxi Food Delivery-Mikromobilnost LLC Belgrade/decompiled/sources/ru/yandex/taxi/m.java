package ru.yandex.taxi;

import defpackage.g92;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class m implements tpr {
    public final /* synthetic */ g92 a;
    public final /* synthetic */ tls b;

    public m(g92 g92Var, tls tlsVar) {
        this.a = g92Var;
        this.b = tlsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1 superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1) {
            superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1 = (SuperappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1) continuation;
            int i2 = superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l lVar = new l(vprVar, this.b);
                    superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.L$0 = null;
                    superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.L$1 = null;
                    superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.L$2 = null;
                    superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(lVar, superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1 = new SuperappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappAuthorizerImpl$getNoAuthorizerFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
