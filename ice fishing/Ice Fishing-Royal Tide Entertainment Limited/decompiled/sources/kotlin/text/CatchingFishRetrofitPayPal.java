package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishRetrofitPayPal implements CatchingFishJUnitViewPager {
    public final CatchingFishRetrofitGradle CatchingFishReduxKtor = new CatchingFishRetrofitGradle(0);

    public final boolean CatchingFishDaggerWebsocket(int i) {
        return (i & this.CatchingFishReduxKtor.get()) != 0;
    }

    public final void CatchingFishWorkManager(int i) {
        CatchingFishRetrofitGradle catchingFishRetrofitGradle;
        int i2;
        do {
            catchingFishRetrofitGradle = this.CatchingFishReduxKtor;
            i2 = catchingFishRetrofitGradle.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!catchingFishRetrofitGradle.compareAndSet(i2, i2 | i));
    }
}
