package ru.yandex.taxi.logistics.ndd_map.domain;

import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.experiments.k;

/* loaded from: classes9.dex */
public final class c {
    public final com.yandex.go.taxi.tariffs.interactor.g a;
    public final k b;

    public c(com.yandex.go.taxi.tariffs.interactor.g gVar, k kVar) {
        this.a = gVar;
        this.b = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r6.a.a(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1 nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1;
        int i;
        if (continuationImpl instanceof NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1) {
            nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1 = (NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1) continuationImpl;
            int i2 = nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$2 nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$2 = new NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$2(this, null);
                nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.label = 2;
                Object w = kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$2, nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1);
                return w != coroutineSingletons ? coroutineSingletons : w;
            }
        }
        nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1 = new NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1(this, continuationImpl);
        Object obj2 = nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.label;
        if (i != 0) {
        }
        NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$2 nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$22 = new NddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$2(this, null);
        nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1.label = 2;
        Object w2 = kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$22, nddMapEnsureExperimentFetchedInteractorImpl$ensureExperimentFetched$1);
        if (w2 != coroutineSingletons2) {
        }
    }
}
