package kotlin.text;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishStripeAPIMVI {
    public static final /* synthetic */ AtomicIntegerFieldUpdater CatchingFishSnackbar = AtomicIntegerFieldUpdater.newUpdater(CatchingFishStripeAPIMVI.class, "_handled$volatile");
    public final Throwable CatchingFishParcelableFAB;
    private volatile /* synthetic */ int _handled$volatile;

    public CatchingFishStripeAPIMVI(Throwable th, boolean z) {
        this.CatchingFishParcelableFAB = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.CatchingFishParcelableFAB + ']';
    }
}
