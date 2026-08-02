package ru.yandex.taxi.settings.domain.factory;

import defpackage.e3g0;
import defpackage.g5g0;
import defpackage.l5g0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.szu0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class b {
    public final e3g0 a;
    public final g5g0 b;
    public final tt2 c;

    public b(e3g0 e3g0Var, g5g0 g5g0Var, tt2 tt2Var) {
        this.a = e3g0Var;
        this.b = g5g0Var;
        this.c = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SubscribeParamFactory$subscribeParams$1 subscribeParamFactory$subscribeParams$1;
        int i;
        if (continuationImpl instanceof SubscribeParamFactory$subscribeParams$1) {
            subscribeParamFactory$subscribeParams$1 = (SubscribeParamFactory$subscribeParams$1) continuationImpl;
            int i2 = subscribeParamFactory$subscribeParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                subscribeParamFactory$subscribeParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = subscribeParamFactory$subscribeParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = subscribeParamFactory$subscribeParams$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    subscribeParamFactory$subscribeParams$1.label = 1;
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new SubscribeParamFactory$pushTokensParams$2(this, null), subscribeParamFactory$subscribeParams$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new szu0((l5g0) obj, this.a.a());
            }
        }
        subscribeParamFactory$subscribeParams$1 = new SubscribeParamFactory$subscribeParams$1(this, continuationImpl);
        Object obj2 = subscribeParamFactory$subscribeParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = subscribeParamFactory$subscribeParams$1.label;
        if (i != 0) {
        }
        return new szu0((l5g0) obj2, this.a.a());
    }
}
