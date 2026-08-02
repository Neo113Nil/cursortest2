package com.squareup.cash.e2ee.signature;

import app.cash.trifle.KeyHandle;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzx;
import com.squareup.cash.e2ee.signature.SignatureFetch;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.signature.validator.SignatureValidator;
import com.squareup.cash.e2ee.signature.validator.SignatureValidityCheck$Invalid;
import com.squareup.cash.e2ee.signature.validator.SignatureValidityCheck$Valid;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.e2ee.trifle.TrifleAction;
import com.squareup.cash.e2ee.trifle.TrifleError;
import com.squareup.cash.e2ee.trifle.TrifleService;
import com.squareup.preferences.KeyValue;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.KeyStore;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealSignatureRepo$retrieveSignature$2 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ RealSignatureRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSignatureRepo$retrieveSignature$2(RealSignatureRepo realSignatureRepo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realSignatureRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealSignatureRepo$retrieveSignature$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealSignatureRepo$retrieveSignature$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RealSignatureRepo realSignatureRepo = this.this$0;
        RealTrifleLogger realTrifleLogger = realSignatureRepo.trifleLogger;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                realTrifleLogger.logAction(TrifleAction.LoadSigningInfo);
                RealLocalSignatureStore realLocalSignatureStore = realSignatureRepo.localSignatureStore;
                this.label = 1;
                obj = ((KeyValue) realLocalSignatureStore.delegate$delegate.getValue()).get(this);
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
            Signature signature = (Signature) obj;
            SignatureValidator signatureValidator = realSignatureRepo.signatureValidator;
            Object obj2 = SignatureValidityCheck$Invalid.InvalidKey.INSTANCE;
            TrifleService trifleService = signatureValidator.trifleService;
            RealTrifleLogger realTrifleLogger2 = signatureValidator.trifleLogger;
            if (signature == null) {
                obj2 = SignatureValidityCheck$Invalid.NoSignature.INSTANCE;
            } else {
                realTrifleLogger2.logAction(TrifleAction.ValidateSigningInfo);
                try {
                    byte[] bArr = signature.key;
                    bArr.getClass();
                    Trifle trifle = ((RealTrifleService) trifleService).trifle;
                    KeyHandle keyHandle = zzx.toKeyHandle(bArr);
                    trifle.getClass();
                    KeyStore keyStore = KeyHandle.KEY_STORE;
                    if (KeyHandle.KEY_STORE.containsAlias(keyHandle.tag)) {
                        try {
                            Object m3522verifyCertsIoAF18A = ((RealTrifleService) trifleService).m3522verifyCertsIoAF18A(signature.certs);
                            Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(m3522verifyCertsIoAF18A);
                            if (m4120exceptionOrNullimpl == null) {
                                obj2 = new SignatureValidityCheck$Valid(signature);
                            } else {
                                obj2 = new SignatureValidityCheck$Invalid.InvalidCerts(m4120exceptionOrNullimpl);
                            }
                        } catch (Exception e) {
                            realTrifleLogger2.logError(TrifleError.SigningInfoValidationFailed.INSTANCE, null);
                            obj2 = new SignatureValidityCheck$Invalid.InvalidCerts(e);
                        }
                    }
                } catch (Exception unused) {
                    realTrifleLogger2.logError(TrifleError.SigningInfoValidationFailed.INSTANCE, null);
                }
            }
            if (obj2 instanceof SignatureValidityCheck$Valid) {
                return new SignatureFetch.Success(((SignatureValidityCheck$Valid) obj2).signature);
            }
            if (obj2 instanceof SignatureValidityCheck$Invalid) {
                return new SignatureFetch.Failure((SignatureValidityCheck$Invalid) obj2);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        } catch (Exception e2) {
            realTrifleLogger.logError(TrifleError.SigningInfoLoadingFailed.INSTANCE, null);
            throw e2;
        }
    }
}
