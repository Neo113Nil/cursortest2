package com.squareup.cash.payments.backend.real;

import androidx.work.Data;
import androidx.work.ListenableWorker;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.util.workmanager.SandboxedCoroutineWorker;
import com.squareup.util.workmanager.SandboxedWork;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/payments/backend/real/OfflineWorker;", "Lcom/squareup/util/workmanager/SandboxedWork;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OfflineWorker implements SandboxedWork {
    public final OfflineManager offlineManager;

    public OfflineWorker(OfflineManager offlineManager) {
        offlineManager.getClass();
        this.offlineManager = offlineManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.util.workmanager.SandboxedWork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object work(SandboxedCoroutineWorker sandboxedCoroutineWorker, ContinuationImpl continuationImpl) {
        OfflineWorker$work$1 offlineWorker$work$1;
        int i;
        Object retryPayments;
        if (continuationImpl instanceof OfflineWorker$work$1) {
            offlineWorker$work$1 = (OfflineWorker$work$1) continuationImpl;
            int i2 = offlineWorker$work$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                offlineWorker$work$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = offlineWorker$work$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = offlineWorker$work$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Data inputData = sandboxedCoroutineWorker.getInputData();
                    inputData.getClass();
                    Object obj2 = inputData.values.get("offline_worker_key_job_id");
                    int intValue = ((Number) (obj2 instanceof Integer ? obj2 : -1)).intValue();
                    if (intValue == -1) {
                        a$$ExternalSyntheticBUOutline0.m$3("Unexpected job ID: -1");
                        return null;
                    }
                    Timber.Forest forest = Timber.Forest;
                    forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "Processing job ID: "), new Object[0]);
                    offlineWorker$work$1.label = 1;
                    RealOfflineManager realOfflineManager = (RealOfflineManager) this.offlineManager;
                    if (intValue != 1) {
                        if (intValue != 2) {
                            realOfflineManager.getClass();
                            forest.e(new IllegalArgumentException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "Unknown job id: ")));
                        } else {
                            JobKt.launch$default(realOfflineManager.scope, null, null, new InteractiveCardView$flingTo$1(realOfflineManager, realOfflineManager.clock.millis(), false, (Continuation) null), 3);
                        }
                        retryPayments = Unit.INSTANCE;
                    } else {
                        retryPayments = realOfflineManager.retryPayments(false, offlineWorker$work$1);
                        if (retryPayments != coroutineSingletons) {
                            retryPayments = Unit.INSTANCE;
                        }
                        if (retryPayments != coroutineSingletons) {
                            retryPayments = Unit.INSTANCE;
                        }
                    }
                    if (retryPayments == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return ListenableWorker.Result.success();
            }
        }
        offlineWorker$work$1 = new OfflineWorker$work$1(this, continuationImpl);
        Object obj3 = offlineWorker$work$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = offlineWorker$work$1.label;
        if (i != 0) {
        }
        return ListenableWorker.Result.success();
    }
}
