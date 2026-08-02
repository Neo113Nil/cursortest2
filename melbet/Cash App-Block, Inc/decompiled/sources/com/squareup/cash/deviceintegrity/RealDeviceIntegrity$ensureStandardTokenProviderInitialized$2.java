package com.squareup.cash.deviceintegrity;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealDeviceIntegrity$ensureStandardTokenProviderInitialized$2 extends SuspendLambda implements Function2 {
    public int I$0;
    public long J$0;
    public int label;
    public final /* synthetic */ RealDeviceIntegrity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealDeviceIntegrity$ensureStandardTokenProviderInitialized$2(RealDeviceIntegrity realDeviceIntegrity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realDeviceIntegrity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealDeviceIntegrity$ensureStandardTokenProviderInitialized$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealDeviceIntegrity$ensureStandardTokenProviderInitialized$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(5000, r12) == r0) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:7:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        RealDeviceIntegrity realDeviceIntegrity = this.this$0;
        try {
        } catch (IntegrityCheckException e) {
            Timber.Forest.e("Failed to prepare Play Integrity token provider: " + e.getMessage() + ", attempt: " + i, new Object[0]);
            if (!RealDeviceIntegrity.access$shouldRetry(realDeviceIntegrity, e.playIntegrityErrorCode, e.errorType)) {
                return Unit.INSTANCE;
            }
            i++;
            this.I$0 = i;
            this.J$0 = j;
            this.label = 2;
        }
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            j = realDeviceIntegrity.clock.millis();
            i = 0;
        } else {
            if (i == 1) {
                j = this.J$0;
                i = this.I$0;
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.J$0;
            i = this.I$0;
            SafeTrace.throwOnFailure(obj);
        }
        if (i > 3) {
            return Unit.INSTANCE;
        }
        PlayIntegrityClient playIntegrityClient = realDeviceIntegrity.playIntegrityClient;
        this.I$0 = i;
        this.J$0 = j;
        this.label = 1;
        if (((RealPlayIntegrityClient) playIntegrityClient).initializeStandardTokenProvider(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Unit.INSTANCE;
    }
}
