package com.squareup.cash.data;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.Signal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SandboxedDataModule$Companion$provideSignOutSignal$1 implements Signal {
    public final /* synthetic */ Flow $signOutFlow;

    public SandboxedDataModule$Companion$provideSignOutSignal$1(Flow flow) {
        this.$signOutFlow = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Continuation continuation) {
        SandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1 sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1;
        int i;
        if (continuation instanceof SandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1) {
            sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1 = (SandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1) continuation;
            int i2 = sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1.label = 1;
                    if (FlowKt.first(this.$signOutFlow, sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1 = new SandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1(this, continuation);
        Object obj2 = sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
