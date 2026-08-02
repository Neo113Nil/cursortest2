package ru.yandex.yandexmaps.multiplatform.pin.war.internal.callback;

import defpackage.j2c0;
import defpackage.ny61;
import defpackage.owb0;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.yandexmaps.multiplatform.pin.war.callback.PinInvalidationReason;

/* loaded from: classes7.dex */
public final class a {
    public owb0 a;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PinInvalidationReason pinInvalidationReason, List list, j2c0 j2c0Var, ContinuationImpl continuationImpl) {
        PinInvalidationCallbackManager$dispatchInvalidationResult$1 pinInvalidationCallbackManager$dispatchInvalidationResult$1;
        int i;
        owb0 owb0Var;
        if (continuationImpl instanceof PinInvalidationCallbackManager$dispatchInvalidationResult$1) {
            pinInvalidationCallbackManager$dispatchInvalidationResult$1 = (PinInvalidationCallbackManager$dispatchInvalidationResult$1) continuationImpl;
            int i2 = pinInvalidationCallbackManager$dispatchInvalidationResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinInvalidationCallbackManager$dispatchInvalidationResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinInvalidationCallbackManager$dispatchInvalidationResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinInvalidationCallbackManager$dispatchInvalidationResult$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    owb0Var = this.a;
                    if (owb0Var != null) {
                        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$0 = null;
                        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$1 = null;
                        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$2 = null;
                        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$3 = owb0Var;
                        pinInvalidationCallbackManager$dispatchInvalidationResult$1.label = 1;
                        obj = tje.k0(uyj.a, new PinInvalidationCallbackManagerKt$mapWithCoverage$2(list, pinInvalidationReason, j2c0Var, null), pinInvalidationCallbackManager$dispatchInvalidationResult$1);
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                owb0Var = (owb0) pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$3;
                b.b(obj);
                pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$0 = null;
                pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$1 = null;
                pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$2 = null;
                pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$3 = null;
                pinInvalidationCallbackManager$dispatchInvalidationResult$1.label = 2;
                return owb0Var.invoke(obj, pinInvalidationCallbackManager$dispatchInvalidationResult$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        pinInvalidationCallbackManager$dispatchInvalidationResult$1 = new PinInvalidationCallbackManager$dispatchInvalidationResult$1(this, continuationImpl);
        Object obj2 = pinInvalidationCallbackManager$dispatchInvalidationResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinInvalidationCallbackManager$dispatchInvalidationResult$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$0 = null;
        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$1 = null;
        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$2 = null;
        pinInvalidationCallbackManager$dispatchInvalidationResult$1.L$3 = null;
        pinInvalidationCallbackManager$dispatchInvalidationResult$1.label = 2;
        if (owb0Var.invoke(obj2, pinInvalidationCallbackManager$dispatchInvalidationResult$1) != coroutineSingletons2) {
        }
    }
}
