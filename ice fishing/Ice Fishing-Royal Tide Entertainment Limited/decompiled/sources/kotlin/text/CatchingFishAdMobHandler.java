package kotlin.text;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class CatchingFishAdMobHandler extends Fragment {
    public static final /* synthetic */ int CatchingFishDaggerWebsocket = 0;
    public CatchingFishViewPagerMockk CatchingFishReduxKtor;

    public static final class CatchingFishPagingLibrary implements Application.ActivityLifecycleCallbacks {
        public static final CatchingFishWidgetFABWidget Companion = new CatchingFishWidgetFABWidget();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new CatchingFishPagingLibrary());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
            CatchingFishHiltContext.CatchingFishParcelableFAB(activity, CatchingFishToolbarLiveData.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
            CatchingFishHiltContext.CatchingFishParcelableFAB(activity, CatchingFishToolbarLiveData.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
            CatchingFishHiltContext.CatchingFishParcelableFAB(activity, CatchingFishToolbarLiveData.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
            CatchingFishHiltContext.CatchingFishParcelableFAB(activity, CatchingFishToolbarLiveData.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
            CatchingFishHiltContext.CatchingFishParcelableFAB(activity, CatchingFishToolbarLiveData.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
            CatchingFishHiltContext.CatchingFishParcelableFAB(activity, CatchingFishToolbarLiveData.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
            CatchingFishFirebaseDagger.CatchingFishNavigation(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            CatchingFishFirebaseDagger.CatchingFishNavigation(activity, "activity");
        }
    }

    public final void CatchingFishParcelableFAB(CatchingFishToolbarLiveData catchingFishToolbarLiveData) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(activity, "getActivity(...)");
            CatchingFishHiltContext.CatchingFishParcelableFAB(activity, catchingFishToolbarLiveData);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CatchingFishParcelableFAB(CatchingFishToolbarLiveData.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CatchingFishParcelableFAB(CatchingFishToolbarLiveData.ON_DESTROY);
        this.CatchingFishReduxKtor = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        CatchingFishParcelableFAB(CatchingFishToolbarLiveData.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishReduxKtor;
        if (catchingFishViewPagerMockk != null) {
            ((CatchingFishReduxCardView) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).CatchingFishSnackbar();
        }
        CatchingFishParcelableFAB(CatchingFishToolbarLiveData.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = this.CatchingFishReduxKtor;
        if (catchingFishViewPagerMockk != null) {
            CatchingFishReduxCardView catchingFishReduxCardView = (CatchingFishReduxCardView) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket;
            int i = catchingFishReduxCardView.CatchingFishReduxKtor + 1;
            catchingFishReduxCardView.CatchingFishReduxKtor = i;
            if (i == 1 && catchingFishReduxCardView.CatchingFishViewModelScope) {
                catchingFishReduxCardView.CatchingFishLayout.CatchingFishReduxKtor(CatchingFishToolbarLiveData.ON_START);
                catchingFishReduxCardView.CatchingFishViewModelScope = false;
            }
        }
        CatchingFishParcelableFAB(CatchingFishToolbarLiveData.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        CatchingFishParcelableFAB(CatchingFishToolbarLiveData.ON_STOP);
    }
}
