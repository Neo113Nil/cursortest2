package com.squareup.cash.banking.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class BankingTabBadgeCounter implements Flow {
    public final SyncValueReader syncValueReader;

    public BankingTabBadgeCounter(SyncValueReader syncValueReader) {
        this.syncValueReader = syncValueReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        BankingTabBadgeCounter$collect$1 bankingTabBadgeCounter$collect$1;
        int i;
        if (continuation instanceof BankingTabBadgeCounter$collect$1) {
            bankingTabBadgeCounter$collect$1 = (BankingTabBadgeCounter$collect$1) continuation;
            int i2 = bankingTabBadgeCounter$collect$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bankingTabBadgeCounter$collect$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bankingTabBadgeCounter$collect$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bankingTabBadgeCounter$collect$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow singleValueOrDefault = this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.BankingTab, new Long(0L), new SvgDecoder$$ExternalSyntheticLambda0(this, 23));
                    bankingTabBadgeCounter$collect$1.label = 1;
                    if (singleValueOrDefault.collect(flowCollector, bankingTabBadgeCounter$collect$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
                return null;
            }
        }
        bankingTabBadgeCounter$collect$1 = new BankingTabBadgeCounter$collect$1(this, continuation);
        Object obj2 = bankingTabBadgeCounter$collect$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bankingTabBadgeCounter$collect$1.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
        return null;
    }
}
