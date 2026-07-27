package kotlin.text;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishPicassoPicasso implements View.OnTouchListener {
    public final /* synthetic */ Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishPicassoPicasso(int i, Object obj) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        CatchingFishHiltGoogleMaps catchingFishHiltGoogleMaps;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishAndroidXService catchingFishAndroidXService = (CatchingFishAndroidXService) this.CatchingFishDaggerWebsocket;
                CatchingFishMVIPayPal catchingFishMVIPayPal = catchingFishAndroidXService.CatchingFishCoroutineFlow;
                Handler handler = catchingFishAndroidXService.CatchingFishGsonAppCompat;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && (catchingFishHiltGoogleMaps = catchingFishAndroidXService.CatchingFishMVPRobolectric) != null && catchingFishHiltGoogleMaps.isShowing() && x >= 0 && x < catchingFishAndroidXService.CatchingFishMVPRobolectric.getWidth() && y >= 0 && y < catchingFishAndroidXService.CatchingFishMVPRobolectric.getHeight()) {
                    handler.postDelayed(catchingFishMVIPayPal, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(catchingFishMVIPayPal);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.CatchingFishDaggerWebsocket).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
