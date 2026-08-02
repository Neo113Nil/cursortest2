package app.cash.badging.backend;

import androidx.compose.material3.SliderState$drag$2;
import androidx.work.ListenableWorker;
import app.cash.badging.backend.InternalBadger;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.util.workmanager.SandboxedCoroutineWorker;
import com.squareup.util.workmanager.SandboxedWork;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/cash/badging/backend/BadgeClearingWorker;", "Lcom/squareup/util/workmanager/SandboxedWork;", "backend"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BadgeClearingWorker implements SandboxedWork {
    public final InternalBadger badger;

    public BadgeClearingWorker(InternalBadger internalBadger) {
        internalBadger.getClass();
        this.badger = internalBadger;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.util.workmanager.SandboxedWork
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object work(SandboxedCoroutineWorker sandboxedCoroutineWorker, ContinuationImpl continuationImpl) {
        BadgeClearingWorker$work$1 badgeClearingWorker$work$1;
        int i;
        int ordinal;
        if (continuationImpl instanceof BadgeClearingWorker$work$1) {
            badgeClearingWorker$work$1 = (BadgeClearingWorker$work$1) continuationImpl;
            int i2 = badgeClearingWorker$work$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                badgeClearingWorker$work$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = badgeClearingWorker$work$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = badgeClearingWorker$work$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    badgeClearingWorker$work$1.label = 1;
                    RealBadger2 realBadger2 = (RealBadger2) this.badger;
                    obj = !(PlatformKt.getCurrentSessionState(realBadger2.sessionManager) instanceof SessionState.Authenticated) ? InternalBadger.ClearResult.Failure : JobKt.withContext(realBadger2.ioContext, new SliderState$drag$2(realBadger2, continuation, 17), badgeClearingWorker$work$1);
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
                ordinal = ((InternalBadger.ClearResult) obj).ordinal();
                if (ordinal != 0) {
                    return ListenableWorker.Result.success();
                }
                if (ordinal == 1) {
                    return new ListenableWorker.Result.Retry();
                }
                if (ordinal == 2) {
                    return new ListenableWorker.Result.Failure();
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        badgeClearingWorker$work$1 = new BadgeClearingWorker$work$1(this, continuationImpl);
        Object obj2 = badgeClearingWorker$work$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = badgeClearingWorker$work$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        ordinal = ((InternalBadger.ClearResult) obj2).ordinal();
        if (ordinal != 0) {
        }
    }
}
