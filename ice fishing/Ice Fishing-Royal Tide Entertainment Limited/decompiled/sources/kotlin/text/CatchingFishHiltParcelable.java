package kotlin.text;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishHiltParcelable implements Runnable {
    public final /* synthetic */ CatchingFishViewLayout CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishHiltParcelable(CatchingFishViewLayout catchingFishViewLayout, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishViewLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ViewParent parent = this.CatchingFishDaggerWebsocket.CatchingFishViewModelScope.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                CatchingFishViewLayout catchingFishViewLayout = this.CatchingFishDaggerWebsocket;
                catchingFishViewLayout.CatchingFishParcelableFAB();
                View view = catchingFishViewLayout.CatchingFishViewModelScope;
                if (view.isEnabled() && !view.isLongClickable() && catchingFishViewLayout.CatchingFishCoroutine()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    catchingFishViewLayout.CatchingFishFragmentHandler = true;
                    break;
                }
                break;
        }
    }
}
