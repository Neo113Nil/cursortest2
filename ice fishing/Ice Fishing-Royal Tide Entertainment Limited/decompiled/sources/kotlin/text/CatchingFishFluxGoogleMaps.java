package kotlin.text;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.catchingfish.fishcatcherpro.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishFluxGoogleMaps extends CatchingFishViewHiltWidget {
    public final Paint CatchingFishParcelableFAB;
    public final List CatchingFishSnackbar;

    public CatchingFishFluxGoogleMaps() {
        Paint paint = new Paint();
        this.CatchingFishParcelableFAB = paint;
        this.CatchingFishSnackbar = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // kotlin.text.CatchingFishViewHiltWidget
    public final void CatchingFishSnackbar(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int CatchingFishMutableLiveData;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.CatchingFishParcelableFAB;
        paint.setStrokeWidth(dimension);
        Iterator it = this.CatchingFishSnackbar.iterator();
        while (it.hasNext()) {
            ((CatchingFishIntentMockk) it.next()).getClass();
            ThreadLocal threadLocal = CatchingFishLiveDataAdMob.CatchingFishParcelableFAB;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int i2 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).CatchingFishLifecycle()) {
                CatchingFishAdMobSnackbar catchingFishAdMobSnackbar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).CatchingFishRoomDatabase;
                switch (catchingFishAdMobSnackbar.CatchingFishSnackbar) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        break;
                    default:
                        i2 = catchingFishAdMobSnackbar.CatchingFishCoroutine.CatchingFishJobScheduler();
                        break;
                }
                float f2 = i2;
                CatchingFishAdMobSnackbar catchingFishAdMobSnackbar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).CatchingFishRoomDatabase;
                switch (catchingFishAdMobSnackbar2.CatchingFishSnackbar) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        i = catchingFishAdMobSnackbar2.CatchingFishCoroutine.CatchingFishAnimationMockk;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = catchingFishAdMobSnackbar2.CatchingFishCoroutine;
                        i = carouselLayoutManager.CatchingFishAnimationMockk - carouselLayoutManager.CatchingFishCustomView();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, i, paint);
            } else {
                canvas2 = canvas;
                CatchingFishAdMobSnackbar catchingFishAdMobSnackbar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).CatchingFishRoomDatabase;
                switch (catchingFishAdMobSnackbar3.CatchingFishSnackbar) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        i2 = catchingFishAdMobSnackbar3.CatchingFishCoroutine.CatchingFishFragmentFactory();
                        break;
                }
                float f3 = i2;
                CatchingFishAdMobSnackbar catchingFishAdMobSnackbar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).CatchingFishRoomDatabase;
                switch (catchingFishAdMobSnackbar4.CatchingFishSnackbar) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        CarouselLayoutManager carouselLayoutManager2 = catchingFishAdMobSnackbar4.CatchingFishCoroutine;
                        CatchingFishMutableLiveData = carouselLayoutManager2.CatchingFishUnitTesting - carouselLayoutManager2.CatchingFishMutableLiveData();
                        break;
                    default:
                        CatchingFishMutableLiveData = catchingFishAdMobSnackbar4.CatchingFishCoroutine.CatchingFishUnitTesting;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, CatchingFishMutableLiveData, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
