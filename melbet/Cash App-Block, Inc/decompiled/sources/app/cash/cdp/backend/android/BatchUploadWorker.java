package app.cash.cdp.backend.android;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.work.ListenableWorker;
import app.cash.cdp.backend.jvm.JvmBatchUploadWorker;
import app.cash.cdp.integration.CashCdpConfigProvider;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.workmanager.SandboxedCoroutineWorker;
import com.squareup.util.workmanager.SandboxedWork;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/cdp/backend/android/BatchUploadWorker;", "Lcom/squareup/util/workmanager/SandboxedWork;", "android"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BatchUploadWorker implements SandboxedWork {
    public final JvmBatchUploadWorker jvmWorker;

    public BatchUploadWorker(JvmBatchUploadWorker jvmBatchUploadWorker) {
        this.jvmWorker = jvmBatchUploadWorker;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.util.workmanager.SandboxedWork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object work(SandboxedCoroutineWorker sandboxedCoroutineWorker, ContinuationImpl continuationImpl) {
        BatchUploadWorker$work$1 batchUploadWorker$work$1;
        int i;
        Enum processNextBatches;
        int ordinal;
        if (continuationImpl instanceof BatchUploadWorker$work$1) {
            batchUploadWorker$work$1 = (BatchUploadWorker$work$1) continuationImpl;
            int i2 = batchUploadWorker$work$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                batchUploadWorker$work$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = batchUploadWorker$work$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = batchUploadWorker$work$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    batchUploadWorker$work$1.label = 1;
                    Timber.Forest forest = Timber.Forest;
                    forest.i("CDP BatchUploadWorker starting work", new Object[0]);
                    JvmBatchUploadWorker jvmBatchUploadWorker = this.jvmWorker;
                    CashCdpConfigProvider cashCdpConfigProvider = jvmBatchUploadWorker.cdpConfigProvider;
                    long j = cashCdpConfigProvider.batchSize;
                    if (cashCdpConfigProvider.readyForBatchUploading.get()) {
                        forest.d(Recorder$$ExternalSyntheticOutline2.m(j, "CDP BatchUploadWorker batch size: "), new Object[0]);
                        processNextBatches = jvmBatchUploadWorker.processNextBatches(j, batchUploadWorker$work$1);
                    } else {
                        forest.i("CDP BatchUploadWorker not ready for batch uploading", new Object[0]);
                        processNextBatches = JvmBatchUploadWorker.Result.RETRY;
                    }
                    obj = processNextBatches;
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
                ordinal = ((JvmBatchUploadWorker.Result) obj).ordinal();
                if (ordinal != 0) {
                    return ListenableWorker.Result.success();
                }
                if (ordinal == 1) {
                    return new ListenableWorker.Result.Retry();
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        batchUploadWorker$work$1 = new BatchUploadWorker$work$1(this, continuationImpl);
        Object obj2 = batchUploadWorker$work$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = batchUploadWorker$work$1.label;
        if (i != 0) {
        }
        ordinal = ((JvmBatchUploadWorker.Result) obj2).ordinal();
        if (ordinal != 0) {
        }
    }
}
