package kotlin.text;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class CatchingFishWebsocketBundle implements AbsListView.OnScrollListener {
    public final /* synthetic */ CatchingFishAndroidXService CatchingFishParcelableFAB;

    public CatchingFishWebsocketBundle(CatchingFishAndroidXService catchingFishAndroidXService) {
        this.CatchingFishParcelableFAB = catchingFishAndroidXService;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        CatchingFishAndroidXService catchingFishAndroidXService = this.CatchingFishParcelableFAB;
        CatchingFishMVIPayPal catchingFishMVIPayPal = catchingFishAndroidXService.CatchingFishCoroutineFlow;
        if (i != 1 || catchingFishAndroidXService.CatchingFishMVPRobolectric.getInputMethodMode() == 2 || catchingFishAndroidXService.CatchingFishMVPRobolectric.getContentView() == null) {
            return;
        }
        catchingFishAndroidXService.CatchingFishGsonAppCompat.removeCallbacks(catchingFishMVIPayPal);
        catchingFishMVIPayPal.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
