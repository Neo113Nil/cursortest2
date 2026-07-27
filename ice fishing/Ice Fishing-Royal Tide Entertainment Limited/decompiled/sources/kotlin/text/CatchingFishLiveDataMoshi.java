package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishLiveDataMoshi extends CatchingFishLifecycleGlide {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishViewModelFAB = AtomicIntegerFieldUpdater.newUpdater(CatchingFishLiveDataMoshi.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // kotlin.text.CatchingFishLifecycleGlide, kotlin.text.CatchingFishPicassoView
    public final void CatchingFishDaggerHiltFAB(Object obj) {
        CatchingFishSpannableWidget(obj);
    }

    @Override // kotlin.text.CatchingFishLifecycleGlide, kotlin.text.CatchingFishPicassoView
    public final void CatchingFishSpannableWidget(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = CatchingFishViewModelFAB;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                CatchingFishGsonCardView.CatchingFishJobScheduler(CatchingFishXMLLayoutGlide.CatchingFishFragmentFactory(obj), CatchingFishBiometricBundle.CatchingFishParcelableFlux(this.CatchingFishViewModelScope));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
