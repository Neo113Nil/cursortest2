package kotlin.text;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class CatchingFishViewPagerKtor extends CatchingFishFABRobolectric {
    public final /* synthetic */ int CatchingFishStateLiveData = 1;

    public /* synthetic */ CatchingFishViewPagerKtor(Context context) {
        super(context);
    }

    @Override // kotlin.text.CatchingFishFABRobolectric
    public int CatchingFishCoroutine(View view, int i) {
        switch (this.CatchingFishStateLiveData) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 0;
            default:
                return super.CatchingFishCoroutine(view, i);
        }
    }

    @Override // kotlin.text.CatchingFishFABRobolectric
    public float CatchingFishReduxKtor(DisplayMetrics displayMetrics) {
        switch (this.CatchingFishStateLiveData) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.CatchingFishReduxKtor(displayMetrics);
        }
    }

    @Override // kotlin.text.CatchingFishFABRobolectric
    public int CatchingFishSnackbar(View view, int i) {
        switch (this.CatchingFishStateLiveData) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return 0;
            default:
                return super.CatchingFishSnackbar(view, i);
        }
    }

    @Override // kotlin.text.CatchingFishFABRobolectric
    public PointF CatchingFishWorkManager(int i) {
        switch (this.CatchingFishStateLiveData) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return null;
            default:
                return super.CatchingFishWorkManager(i);
        }
    }

    public CatchingFishViewPagerKtor(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
    }
}
