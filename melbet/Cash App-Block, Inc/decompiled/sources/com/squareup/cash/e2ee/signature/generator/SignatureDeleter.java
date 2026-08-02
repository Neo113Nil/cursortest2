package com.squareup.cash.e2ee.signature.generator;

import app.cash.trifle.KeyHandle;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzx;
import com.squareup.cash.e2ee.signature.Signature;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.e2ee.trifle.TrifleAction;
import com.squareup.cash.e2ee.trifle.TrifleError;
import com.squareup.cash.e2ee.trifle.TrifleService;
import com.squareup.preferences.KeyValue;
import java.security.KeyStore;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SignatureDeleter {
    public final RealLocalSignatureStore localSignatureStore;
    public final RealTrifleLogger trifleLogger;
    public final TrifleService trifleService;

    public SignatureDeleter(TrifleService trifleService, RealTrifleLogger realTrifleLogger, RealLocalSignatureStore realLocalSignatureStore) {
        this.trifleService = trifleService;
        this.trifleLogger = realTrifleLogger;
        this.localSignatureStore = realLocalSignatureStore;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:23|24))(1:25))(1:36)|26|(5:28|29|(1:31)(1:35)|(4:34|13|14|15)|33)|16|17))|39|6|7|(0)(0)|26|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004c, code lost:
    
        if (r8 == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        r4.logError(com.squareup.cash.e2ee.trifle.TrifleError.SigningInfoDeletingFailed.INSTANCE, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delete(ContinuationImpl continuationImpl) {
        SignatureDeleter$delete$1 signatureDeleter$delete$1;
        int i;
        Signature signature;
        Signature signature2;
        Lazy lazy = this.localSignatureStore.delegate$delegate;
        if (continuationImpl instanceof SignatureDeleter$delete$1) {
            signatureDeleter$delete$1 = (SignatureDeleter$delete$1) continuationImpl;
            int i2 = signatureDeleter$delete$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                signatureDeleter$delete$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = signatureDeleter$delete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = signatureDeleter$delete$1.label;
                RealTrifleLogger realTrifleLogger = this.trifleLogger;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    signatureDeleter$delete$1.label = 1;
                    obj = ((KeyValue) lazy.getValue()).get(signatureDeleter$delete$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        signature2 = signatureDeleter$delete$1.L$1;
                        SafeTrace.throwOnFailure(obj);
                        TrifleService trifleService = this.trifleService;
                        byte[] bArr = signature2.key;
                        RealTrifleService realTrifleService = (RealTrifleService) trifleService;
                        bArr.getClass();
                        RealTrifleLogger realTrifleLogger2 = realTrifleService.trifleLogger;
                        realTrifleLogger2.logAction(TrifleAction.DeleteKeyHandle);
                        try {
                            Trifle trifle = realTrifleService.trifle;
                            KeyHandle keyHandle = zzx.toKeyHandle(bArr);
                            trifle.getClass();
                            KeyStore keyStore = KeyHandle.KEY_STORE;
                            KeyHandle.Companion.deleteTag$trifle_release(keyHandle.getTag());
                            return Unit.INSTANCE;
                        } catch (Exception e) {
                            realTrifleLogger2.logError(TrifleError.KeyHandleDeletionFailed.INSTANCE, null);
                            throw e;
                        }
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                signature = (Signature) obj;
                if (signature != null) {
                    realTrifleLogger.logAction(TrifleAction.DeleteSigningInfo);
                    signatureDeleter$delete$1.L$1 = signature;
                    signatureDeleter$delete$1.label = 2;
                    Object delete = ((KeyValue) lazy.getValue()).delete(signatureDeleter$delete$1);
                    if (delete != coroutineSingletons) {
                        delete = Unit.INSTANCE;
                    }
                    if (delete != coroutineSingletons) {
                        signature2 = signature;
                        TrifleService trifleService2 = this.trifleService;
                        byte[] bArr2 = signature2.key;
                        RealTrifleService realTrifleService2 = (RealTrifleService) trifleService2;
                        bArr2.getClass();
                        RealTrifleLogger realTrifleLogger22 = realTrifleService2.trifleLogger;
                        realTrifleLogger22.logAction(TrifleAction.DeleteKeyHandle);
                        Trifle trifle2 = realTrifleService2.trifle;
                        KeyHandle keyHandle2 = zzx.toKeyHandle(bArr2);
                        trifle2.getClass();
                        KeyStore keyStore2 = KeyHandle.KEY_STORE;
                        KeyHandle.Companion.deleteTag$trifle_release(keyHandle2.getTag());
                    }
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            }
        }
        signatureDeleter$delete$1 = new SignatureDeleter$delete$1(this, continuationImpl);
        Object obj2 = signatureDeleter$delete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = signatureDeleter$delete$1.label;
        RealTrifleLogger realTrifleLogger3 = this.trifleLogger;
        if (i != 0) {
        }
        signature = (Signature) obj2;
        if (signature != null) {
        }
        return Unit.INSTANCE;
    }
}
