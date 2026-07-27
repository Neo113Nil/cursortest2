package kotlin.text;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class CatchingFishLifecycleOkHttp extends CatchingFishRetrofitAdMob {
    final /* synthetic */ CatchingFishReduxCardView this$0;

    public static final class CatchingFishPagingLibrary extends CatchingFishRetrofitAdMob {
        final /* synthetic */ CatchingFishReduxCardView this$0;

        public CatchingFishPagingLibrary(CatchingFishReduxCardView catchingFishReduxCardView) {
            this.this$0 = catchingFishReduxCardView;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            this.this$0.CatchingFishSnackbar();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            CatchingFishReduxCardView catchingFishReduxCardView = this.this$0;
            int i = catchingFishReduxCardView.CatchingFishReduxKtor + 1;
            catchingFishReduxCardView.CatchingFishReduxKtor = i;
            if (i == 1 && catchingFishReduxCardView.CatchingFishViewModelScope) {
                catchingFishReduxCardView.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_START);
                catchingFishReduxCardView.CatchingFishViewModelScope = false;
            }
        }
    }

    public CatchingFishLifecycleOkHttp(CatchingFishReduxCardView catchingFishReduxCardView) {
        this.this$0 = catchingFishReduxCardView;
    }

    @Override // kotlin.text.CatchingFishRetrofitAdMob, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            CatchingFishFirebaseDagger.CatchingFishStateLiveData(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((CatchingFishAdMobHandler) findFragmentByTag).CatchingFishReduxKtor = this.this$0.CatchingFishCloudMessaging;
        }
    }

    @Override // kotlin.text.CatchingFishRetrofitAdMob, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        CatchingFishReduxCardView catchingFishReduxCardView = this.this$0;
        int i = catchingFishReduxCardView.CatchingFishDaggerWebsocket - 1;
        catchingFishReduxCardView.CatchingFishDaggerWebsocket = i;
        if (i == 0) {
            Handler handler = catchingFishReduxCardView.CatchingFishViewModelFAB;
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(handler);
            handler.postDelayed(catchingFishReduxCardView.CatchingFishFragmentHandler, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        CatchingFishJUnitFlux.CatchingFishCloudMessaging(activity, new CatchingFishPagingLibrary(this.this$0));
    }

    @Override // kotlin.text.CatchingFishRetrofitAdMob, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        CatchingFishReduxCardView catchingFishReduxCardView = this.this$0;
        int i = catchingFishReduxCardView.CatchingFishReduxKtor - 1;
        catchingFishReduxCardView.CatchingFishReduxKtor = i;
        if (i == 0 && catchingFishReduxCardView.CatchingFishWorkManager) {
            catchingFishReduxCardView.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_STOP);
            catchingFishReduxCardView.CatchingFishViewModelScope = true;
        }
    }
}
