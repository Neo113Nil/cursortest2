package ru.yandex.yandexmaps.multiplatform.pin.war.internal.logger;

import defpackage.ny61;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zy11 a(ContinuationImpl continuationImpl) {
        PinLegacyLogger$log$1 pinLegacyLogger$log$1;
        int i;
        if (continuationImpl instanceof PinLegacyLogger$log$1) {
            pinLegacyLogger$log$1 = (PinLegacyLogger$log$1) continuationImpl;
            int i2 = pinLegacyLogger$log$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinLegacyLogger$log$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinLegacyLogger$log$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinLegacyLogger$log$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    b.b(obj);
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    if (pinLegacyLogger$log$1.L$1 != null) {
                        ny61.u();
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                if (pinLegacyLogger$log$1.L$3 != null) {
                    ny61.u();
                    return null;
                }
                if (pinLegacyLogger$log$1.L$1 != null) {
                    ny61.u();
                    return null;
                }
                b.b(obj);
                pinLegacyLogger$log$1.L$0 = null;
                pinLegacyLogger$log$1.L$1 = null;
                pinLegacyLogger$log$1.L$2 = null;
                pinLegacyLogger$log$1.L$3 = null;
                pinLegacyLogger$log$1.label = 2;
                throw null;
            }
        }
        pinLegacyLogger$log$1 = new PinLegacyLogger$log$1(this, continuationImpl);
        Object obj2 = pinLegacyLogger$log$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinLegacyLogger$log$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
