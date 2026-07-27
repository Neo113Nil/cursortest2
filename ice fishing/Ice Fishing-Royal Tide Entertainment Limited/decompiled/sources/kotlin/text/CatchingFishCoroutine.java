package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishCoroutine extends CatchingFishAdMobFAB {
    public final AtomicReferenceFieldUpdater CatchingFishCoroutineFlow;
    public final AtomicReferenceFieldUpdater CatchingFishDaggerHiltFAB;
    public final AtomicReferenceFieldUpdater CatchingFishJetpackCompose;
    public final AtomicReferenceFieldUpdater CatchingFishParcelableFlux;
    public final AtomicReferenceFieldUpdater CatchingFishSpannableWidget;

    public CatchingFishCoroutine(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.CatchingFishJetpackCompose = atomicReferenceFieldUpdater;
        this.CatchingFishCoroutineFlow = atomicReferenceFieldUpdater2;
        this.CatchingFishDaggerHiltFAB = atomicReferenceFieldUpdater3;
        this.CatchingFishSpannableWidget = atomicReferenceFieldUpdater4;
        this.CatchingFishParcelableFlux = atomicReferenceFieldUpdater5;
    }

    @Override // kotlin.text.CatchingFishAdMobFAB
    public final boolean CatchingFishCloudMessaging(CatchingFishAsyncTask catchingFishAsyncTask, CatchingFishMoshi catchingFishMoshi) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.CatchingFishSpannableWidget;
            if (atomicReferenceFieldUpdater.compareAndSet(catchingFishAsyncTask, catchingFishMoshi, CatchingFishMoshi.CatchingFishSnackbar)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(catchingFishAsyncTask) == catchingFishMoshi);
        return false;
    }

    @Override // kotlin.text.CatchingFishAdMobFAB
    public final boolean CatchingFishEspressoTesting(CatchingFishAsyncTask catchingFishAsyncTask, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.CatchingFishParcelableFlux;
            if (atomicReferenceFieldUpdater.compareAndSet(catchingFishAsyncTask, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(catchingFishAsyncTask) == obj);
        return false;
    }

    @Override // kotlin.text.CatchingFishAdMobFAB
    public final void CatchingFishJobScheduler(CatchingFishExoPlayerWidget catchingFishExoPlayerWidget, CatchingFishExoPlayerWidget catchingFishExoPlayerWidget2) {
        this.CatchingFishCoroutineFlow.lazySet(catchingFishExoPlayerWidget, catchingFishExoPlayerWidget2);
    }

    @Override // kotlin.text.CatchingFishAdMobFAB
    public final boolean CatchingFishOkHttp(CatchingFishAsyncTask catchingFishAsyncTask, CatchingFishExoPlayerWidget catchingFishExoPlayerWidget, CatchingFishExoPlayerWidget catchingFishExoPlayerWidget2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.CatchingFishDaggerHiltFAB;
            if (atomicReferenceFieldUpdater.compareAndSet(catchingFishAsyncTask, catchingFishExoPlayerWidget, catchingFishExoPlayerWidget2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(catchingFishAsyncTask) == catchingFishExoPlayerWidget);
        return false;
    }

    @Override // kotlin.text.CatchingFishAdMobFAB
    public final void CatchingFishPayPalService(CatchingFishExoPlayerWidget catchingFishExoPlayerWidget, Thread thread) {
        this.CatchingFishJetpackCompose.lazySet(catchingFishExoPlayerWidget, thread);
    }
}
