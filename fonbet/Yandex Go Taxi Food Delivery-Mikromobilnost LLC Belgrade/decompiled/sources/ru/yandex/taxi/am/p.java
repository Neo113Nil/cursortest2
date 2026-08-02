package ru.yandex.taxi.am;

import defpackage.ny61;
import defpackage.r40;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ r b;

    public p(vpr vprVar, r rVar) {
        this.a = vprVar;
        this.b = rVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r7.emit(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AutoLogin$openRetryAutoLogin$$inlined$map$1$2$1 autoLogin$openRetryAutoLogin$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof AutoLogin$openRetryAutoLogin$$inlined$map$1$2$1) {
            autoLogin$openRetryAutoLogin$$inlined$map$1$2$1 = (AutoLogin$openRetryAutoLogin$$inlined$map$1$2$1) continuation;
            int i2 = autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$0 = null;
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$1 = null;
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$2 = null;
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$4 = vprVar2;
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$5 = null;
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$6 = null;
                    autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.label = 1;
                    Object b = r.b(this.b, (r40) obj, autoLogin$openRetryAutoLogin$$inlined$map$1$2$1);
                    if (b != coroutineSingletons) {
                        obj2 = b;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$0 = null;
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$1 = null;
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$2 = null;
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$3 = null;
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$4 = null;
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$5 = null;
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$6 = null;
                autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.label = 2;
            }
        }
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1 = new AutoLogin$openRetryAutoLogin$$inlined$map$1$2$1(this, continuation);
        Object obj22 = autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$0 = null;
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$1 = null;
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$2 = null;
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$3 = null;
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$4 = null;
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$5 = null;
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.L$6 = null;
        autoLogin$openRetryAutoLogin$$inlined$map$1$2$1.label = 2;
    }
}
