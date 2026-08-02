package androidx.glance.session;

import androidx.compose.material3.SliderState$drag$2;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class TimerScopeKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewActivateCashCard.deepLinkSpecs;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object withTimerOrNull(DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0, PageFetcher$flow$1 pageFetcher$flow$1, ContinuationImpl continuationImpl) {
        TimerScopeKt$withTimerOrNull$1 timerScopeKt$withTimerOrNull$1;
        int i;
        try {
            if (continuationImpl instanceof TimerScopeKt$withTimerOrNull$1) {
                timerScopeKt$withTimerOrNull$1 = (TimerScopeKt$withTimerOrNull$1) continuationImpl;
                int i2 = timerScopeKt$withTimerOrNull$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    timerScopeKt$withTimerOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = timerScopeKt$withTimerOrNull$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = timerScopeKt$withTimerOrNull$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        timerScopeKt$withTimerOrNull$1.L$0 = pageFetcher$flow$1;
                        timerScopeKt$withTimerOrNull$1.label = 1;
                        Object coroutineScope = JobKt.coroutineScope(new SliderState$drag$2(pageFetcher$flow$1, differentialMotionFlingController$$ExternalSyntheticLambda0, (Continuation) null), timerScopeKt$withTimerOrNull$1);
                        return coroutineScope == coroutineSingletons ? coroutineSingletons : coroutineScope;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PageFetcher$flow$1 pageFetcher$flow$12 = timerScopeKt$withTimerOrNull$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
        } catch (TimeoutCancellationException e) {
            if (e.block == pageFetcher$flow$1.hashCode()) {
                return null;
            }
            throw e;
        }
        timerScopeKt$withTimerOrNull$1 = new TimerScopeKt$withTimerOrNull$1(continuationImpl);
        Object obj2 = timerScopeKt$withTimerOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = timerScopeKt$withTimerOrNull$1.label;
    }
}
