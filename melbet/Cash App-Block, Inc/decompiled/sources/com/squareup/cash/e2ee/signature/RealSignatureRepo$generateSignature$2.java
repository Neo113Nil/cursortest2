package com.squareup.cash.e2ee.signature;

import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.e2ee.signature.generator.SignatureDeleter;
import com.squareup.cash.e2ee.signature.generator.SignatureGenerator$generate$2;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.TrifleAction;
import com.squareup.cash.e2ee.trifle.TrifleError;
import com.squareup.preferences.KeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealSignatureRepo$generateSignature$2 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ RealSignatureRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSignatureRepo$generateSignature$2(RealSignatureRepo realSignatureRepo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realSignatureRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealSignatureRepo$generateSignature$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealSignatureRepo$generateSignature$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r8 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (r9 == r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        if (r9.delete(r8) == r2) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RealSignatureRepo realSignatureRepo = this.this$0;
        RealTrifleLogger realTrifleLogger = realSignatureRepo.trifleLogger;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                SignatureDeleter signatureDeleter = realSignatureRepo.signatureDeleter;
                this.label = 1;
            } else if (i == 1) {
                SafeTrace.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                Signature signature = (Signature) obj;
                realTrifleLogger.logAction(TrifleAction.SaveSigningInfo);
                RealLocalSignatureStore realLocalSignatureStore = realSignatureRepo.localSignatureStore;
                this.label = 3;
                Object obj2 = ((KeyValue) realLocalSignatureStore.delegate$delegate.getValue()).set(signature, this);
                if (obj2 != coroutineSingletons) {
                    obj2 = Unit.INSTANCE;
                }
            }
            SimpleActor simpleActor = realSignatureRepo.signatureGenerator;
            this.label = 2;
            obj = JobKt.withContext((CoroutineContext) simpleActor.remainingMessages, new SignatureGenerator$generate$2(simpleActor, null), this);
        } catch (Exception e) {
            realTrifleLogger.logError(TrifleError.SigningInfoSavingFailed.INSTANCE, null);
            throw e;
        }
    }
}
