package com.squareup.cash.banking.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.banking.backend.api.ConfirmCashOutVersionCode;
import com.squareup.preferences.KeyValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealConfirmCashOutVersionCodeProvider {
    public final KeyValue confirmCashOutVersionCode;

    public RealConfirmCashOutVersionCodeProvider(KeyValue keyValue) {
        this.confirmCashOutVersionCode = keyValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(ContinuationImpl continuationImpl) {
        RealConfirmCashOutVersionCodeProvider$get$1 realConfirmCashOutVersionCodeProvider$get$1;
        int i;
        String str;
        if (continuationImpl instanceof RealConfirmCashOutVersionCodeProvider$get$1) {
            realConfirmCashOutVersionCodeProvider$get$1 = (RealConfirmCashOutVersionCodeProvider$get$1) continuationImpl;
            int i2 = realConfirmCashOutVersionCodeProvider$get$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realConfirmCashOutVersionCodeProvider$get$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realConfirmCashOutVersionCodeProvider$get$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realConfirmCashOutVersionCodeProvider$get$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realConfirmCashOutVersionCodeProvider$get$1.label = 1;
                    obj = this.confirmCashOutVersionCode.get(realConfirmCashOutVersionCodeProvider$get$1);
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
                ConfirmCashOutVersionCode confirmCashOutVersionCode = (ConfirmCashOutVersionCode) obj;
                str = confirmCashOutVersionCode == null ? confirmCashOutVersionCode.versionCode : null;
                if (str != null) {
                    return null;
                }
                return str;
            }
        }
        realConfirmCashOutVersionCodeProvider$get$1 = new RealConfirmCashOutVersionCodeProvider$get$1(this, continuationImpl);
        Object obj2 = realConfirmCashOutVersionCodeProvider$get$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realConfirmCashOutVersionCodeProvider$get$1.label;
        if (i != 0) {
        }
        ConfirmCashOutVersionCode confirmCashOutVersionCode2 = (ConfirmCashOutVersionCode) obj2;
        if (confirmCashOutVersionCode2 == null) {
        }
        if (str != null) {
        }
    }
}
