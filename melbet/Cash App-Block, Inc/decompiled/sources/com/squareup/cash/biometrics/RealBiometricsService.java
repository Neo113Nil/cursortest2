package com.squareup.cash.biometrics;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.biometrics.Biometrics$AuthenticationStatus;
import com.squareup.cash.biometrics.SecureStore$WriteResult;
import com.squareup.cash.treehouse.biometrics.BiometricsService;
import com.squareup.cash.treehouse.biometrics.BiometricsWriteResult;
import com.squareup.util.android.RealIntentFactory;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealBiometricsService implements BiometricsService {
    public final AndroidBiometricsStore biometricsStore;
    public final Context context;

    public RealBiometricsService(AndroidBiometricsStore androidBiometricsStore, Context context, RealIntentFactory realIntentFactory) {
        this.biometricsStore = androidBiometricsStore;
        this.context = context;
    }

    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    public final Object hasStoredValue(String str, Continuation continuation) {
        return this.biometricsStore.hasStoredValue(str, (ContinuationImpl) continuation);
    }

    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    public final boolean isUserEnrolled() {
        return this.biometricsStore.getStatus().biometricsStatus instanceof Biometrics$AuthenticationStatus.BiometricsEnrolled;
    }

    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    public final boolean promptForEnrollment() {
        if (isUserEnrolled()) {
            return false;
        }
        this.context.startActivity(new Intent(Build.VERSION.SDK_INT >= 30 ? "android.settings.BIOMETRIC_ENROLL" : "android.settings.FINGERPRINT_ENROLL"));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.treehouse.biometrics.BiometricsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object write(String str, String str2, ContinuationImpl continuationImpl) {
        RealBiometricsService$write$1 realBiometricsService$write$1;
        int i;
        SecureStore$WriteResult secureStore$WriteResult;
        if (continuationImpl instanceof RealBiometricsService$write$1) {
            realBiometricsService$write$1 = (RealBiometricsService$write$1) continuationImpl;
            int i2 = realBiometricsService$write$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBiometricsService$write$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBiometricsService$write$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBiometricsService$write$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realBiometricsService$write$1.label = 1;
                    obj = this.biometricsStore.write(str, str2, realBiometricsService$write$1);
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
                secureStore$WriteResult = (SecureStore$WriteResult) obj;
                if (secureStore$WriteResult instanceof SecureStore$WriteResult.Failure) {
                    if (Intrinsics.areEqual(secureStore$WriteResult, SecureStore$WriteResult.SecureStoreUnavailable.INSTANCE)) {
                        return BiometricsWriteResult.SecureStoreUnavailable.INSTANCE;
                    }
                    if (Intrinsics.areEqual(secureStore$WriteResult, SecureStore$WriteResult.Success.INSTANCE)) {
                        return BiometricsWriteResult.Success.INSTANCE;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Exception exc = ((SecureStore$WriteResult.Failure) secureStore$WriteResult).cause;
                String message = exc.getMessage();
                if (message == null) {
                    message = Reflection.factory.getOrCreateKotlinClass(exc.getClass()).toString();
                }
                return new BiometricsWriteResult.Unspecified(message);
            }
        }
        realBiometricsService$write$1 = new RealBiometricsService$write$1(this, continuationImpl);
        Object obj2 = realBiometricsService$write$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBiometricsService$write$1.label;
        if (i != 0) {
        }
        secureStore$WriteResult = (SecureStore$WriteResult) obj2;
        if (secureStore$WriteResult instanceof SecureStore$WriteResult.Failure) {
        }
    }
}
