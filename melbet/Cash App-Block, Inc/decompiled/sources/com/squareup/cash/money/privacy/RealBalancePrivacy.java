package com.squareup.cash.money.privacy;

import android.content.SharedPreferences;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealBalancePrivacy {
    public final SharedPreferencesKeyValue obfuscationEnabled;

    public RealBalancePrivacy(SharedPreferences sharedPreferences) {
        this.obfuscationEnabled = Room.BooleanKeyValue(sharedPreferences, "are_balances_obfuscated", false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r6.set(r7, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object toggleObfuscation(ContinuationImpl continuationImpl) {
        RealBalancePrivacy$toggleObfuscation$1 realBalancePrivacy$toggleObfuscation$1;
        int i;
        SharedPreferencesKeyValue sharedPreferencesKeyValue;
        if (continuationImpl instanceof RealBalancePrivacy$toggleObfuscation$1) {
            realBalancePrivacy$toggleObfuscation$1 = (RealBalancePrivacy$toggleObfuscation$1) continuationImpl;
            int i2 = realBalancePrivacy$toggleObfuscation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBalancePrivacy$toggleObfuscation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBalancePrivacy$toggleObfuscation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBalancePrivacy$toggleObfuscation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    sharedPreferencesKeyValue = this.obfuscationEnabled;
                    realBalancePrivacy$toggleObfuscation$1.L$0 = sharedPreferencesKeyValue;
                    realBalancePrivacy$toggleObfuscation$1.label = 1;
                    obj = sharedPreferencesKeyValue.get(realBalancePrivacy$toggleObfuscation$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sharedPreferencesKeyValue = realBalancePrivacy$toggleObfuscation$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Boolean valueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
                realBalancePrivacy$toggleObfuscation$1.L$0 = null;
                realBalancePrivacy$toggleObfuscation$1.label = 2;
            }
        }
        realBalancePrivacy$toggleObfuscation$1 = new RealBalancePrivacy$toggleObfuscation$1(this, continuationImpl);
        Object obj2 = realBalancePrivacy$toggleObfuscation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBalancePrivacy$toggleObfuscation$1.label;
        if (i != 0) {
        }
        Boolean valueOf2 = Boolean.valueOf(!((Boolean) obj2).booleanValue());
        realBalancePrivacy$toggleObfuscation$1.L$0 = null;
        realBalancePrivacy$toggleObfuscation$1.label = 2;
    }
}
