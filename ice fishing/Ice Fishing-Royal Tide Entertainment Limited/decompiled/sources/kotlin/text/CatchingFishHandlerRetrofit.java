package kotlin.text;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
public final class CatchingFishHandlerRetrofit extends ContentFrameLayout {
    public final /* synthetic */ CatchingFishMockkWidgetKtor CatchingFishEspressoTesting;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishHandlerRetrofit(CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor, CatchingFishGraphQLManifest catchingFishGraphQLManifest) {
        super(catchingFishGraphQLManifest, null);
        this.CatchingFishEspressoTesting = catchingFishMockkWidgetKtor;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.CatchingFishEspressoTesting.CatchingFish(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = this.CatchingFishEspressoTesting;
                catchingFishMockkWidgetKtor.CatchingFishRoomDatabase(catchingFishMockkWidgetKtor.CatchingFishParcelableFlux(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(CatchingFishLayoutRoomFAB.CatchingFishCustomView(getContext(), i));
    }
}
