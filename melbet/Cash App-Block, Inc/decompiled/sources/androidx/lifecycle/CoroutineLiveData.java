package androidx.lifecycle;

import androidx.arch.core.internal.SafeIterableMap;
import androidx.paging.PageFetcher$flow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.e0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CoroutineLiveData extends MutableLiveData {
    public e0 blockRunner;
    public final SafeIterableMap mSources = new SafeIterableMap();

    public final Unit clearSource$lifecycle_livedata(ContinuationImpl continuationImpl) {
        CoroutineLiveData$clearSource$1 coroutineLiveData$clearSource$1;
        int i;
        if (continuationImpl instanceof CoroutineLiveData$clearSource$1) {
            coroutineLiveData$clearSource$1 = (CoroutineLiveData$clearSource$1) continuationImpl;
            int i2 = coroutineLiveData$clearSource$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                coroutineLiveData$clearSource$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = coroutineLiveData$clearSource$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = coroutineLiveData$clearSource$1.label;
                if (i != 0 || i == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        coroutineLiveData$clearSource$1 = new CoroutineLiveData$clearSource$1(this, continuationImpl);
        Object obj2 = coroutineLiveData$clearSource$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = coroutineLiveData$clearSource$1.label;
        if (i != 0) {
        }
        SafeTrace.throwOnFailure(obj2);
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        SafeIterableMap.ListIterator listIterator = (SafeIterableMap.ListIterator) this.mSources.iterator();
        Continuation continuation = null;
        if (listIterator.hasNext()) {
            ((MediatorLiveData$Source) ((Map.Entry) listIterator.next()).getValue()).getClass();
            throw null;
        }
        e0 e0Var = this.blockRunner;
        if (e0Var != null) {
            StandaloneCoroutine standaloneCoroutine = (StandaloneCoroutine) e0Var.h;
            if (standaloneCoroutine != null) {
                standaloneCoroutine.cancel(null);
            }
            e0Var.h = null;
            if (((StandaloneCoroutine) e0Var.f) != null) {
                return;
            }
            e0Var.f = JobKt.launch$default((ContextScope) e0Var.c, null, null, new PageFetcher$flow$1(e0Var, continuation, 16), 3);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        SafeIterableMap.ListIterator listIterator = (SafeIterableMap.ListIterator) this.mSources.iterator();
        Continuation continuation = null;
        if (listIterator.hasNext()) {
            ((MediatorLiveData$Source) ((Map.Entry) listIterator.next()).getValue()).getClass();
            throw null;
        }
        e0 e0Var = this.blockRunner;
        if (e0Var != null) {
            if (((StandaloneCoroutine) e0Var.h) != null) {
                a$$ExternalSyntheticBUOutline0.m$1("Cancel call cannot happen without a maybeRun");
                return;
            }
            ContextScope contextScope = (ContextScope) e0Var.c;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            e0Var.h = JobKt.launch$default(contextScope, MainDispatcherLoader.dispatcher.immediate, null, new BlockRunner$cancel$1(e0Var, continuation, 0), 2);
        }
    }
}
