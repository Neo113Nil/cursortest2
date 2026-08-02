package com.squareup.cash.afterpayapplet.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletRepository$getEntryPointAvailable$3 extends SuspendLambda implements Function3 {
    public final /* synthetic */ MLKitTitleGenerator$prepareModel$1 $emitRemoteAvailability;
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Pair L$1;
    public boolean Z$0;
    public boolean Z$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAfterpayAppletRepository$getEntryPointAvailable$3(MLKitTitleGenerator$prepareModel$1 mLKitTitleGenerator$prepareModel$1, Continuation continuation) {
        super(3, continuation);
        this.$emitRemoteAvailability = mLKitTitleGenerator$prepareModel$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RealAfterpayAppletRepository$getEntryPointAvailable$3 realAfterpayAppletRepository$getEntryPointAvailable$3 = new RealAfterpayAppletRepository$getEntryPointAvailable$3(this.$emitRemoteAvailability, (Continuation) obj3);
        realAfterpayAppletRepository$getEntryPointAvailable$3.L$0 = (FlowCollector) obj;
        realAfterpayAppletRepository$getEntryPointAvailable$3.L$1 = (Pair) obj2;
        return realAfterpayAppletRepository$getEntryPointAvailable$3.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0079, code lost:
    
        if (r4.invoke(r0, r10) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r0.emit(r11, r10) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0.emit(r11, r10) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r4.invoke(r0, r10) == r2) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        boolean booleanValue2;
        FlowCollector flowCollector = this.L$0;
        Pair pair = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MLKitTitleGenerator$prepareModel$1 mLKitTitleGenerator$prepareModel$1 = this.$emitRemoteAvailability;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    booleanValue2 = this.Z$1;
                    booleanValue = this.Z$0;
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.Z$0 = booleanValue;
                    this.Z$1 = booleanValue2;
                    this.label = 3;
                } else if (i != 3 && i != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            SafeTrace.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        SafeTrace.throwOnFailure(obj);
        booleanValue = ((Boolean) pair.first).booleanValue();
        booleanValue2 = ((Boolean) pair.second).booleanValue();
        if (booleanValue && booleanValue2) {
            Boolean bool = Boolean.TRUE;
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = booleanValue;
            this.Z$1 = booleanValue2;
            this.label = 1;
        } else if (booleanValue) {
            Boolean bool2 = Boolean.TRUE;
            this.L$0 = flowCollector;
            this.L$1 = null;
            this.Z$0 = booleanValue;
            this.Z$1 = booleanValue2;
            this.label = 2;
        } else {
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = booleanValue;
            this.Z$1 = booleanValue2;
            this.label = 4;
        }
        return coroutineSingletons;
    }
}
