package com.squareup.cash.moneybot.backend.real.managers;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.preferences.KeyValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealMoneybotPreambleManager {
    public final KeyValue moneybotPreambleOverride;

    public RealMoneybotPreambleManager(KeyValue keyValue) {
        this.moneybotPreambleOverride = keyValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object hasPreambleOverride(ContinuationImpl continuationImpl) {
        RealMoneybotPreambleManager$hasPreambleOverride$1 realMoneybotPreambleManager$hasPreambleOverride$1;
        int i;
        if (continuationImpl instanceof RealMoneybotPreambleManager$hasPreambleOverride$1) {
            realMoneybotPreambleManager$hasPreambleOverride$1 = (RealMoneybotPreambleManager$hasPreambleOverride$1) continuationImpl;
            int i2 = realMoneybotPreambleManager$hasPreambleOverride$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realMoneybotPreambleManager$hasPreambleOverride$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realMoneybotPreambleManager$hasPreambleOverride$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realMoneybotPreambleManager$hasPreambleOverride$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realMoneybotPreambleManager$hasPreambleOverride$1.label = 1;
                    obj = this.moneybotPreambleOverride.get(realMoneybotPreambleManager$hasPreambleOverride$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Boolean.valueOf(obj != null);
            }
        }
        realMoneybotPreambleManager$hasPreambleOverride$1 = new RealMoneybotPreambleManager$hasPreambleOverride$1(this, continuationImpl);
        Object obj2 = realMoneybotPreambleManager$hasPreambleOverride$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realMoneybotPreambleManager$hasPreambleOverride$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(obj2 != null);
    }
}
