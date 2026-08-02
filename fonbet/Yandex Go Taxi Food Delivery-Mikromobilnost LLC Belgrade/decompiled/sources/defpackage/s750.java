package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.navigation.NavigationFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class s750 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ NavigationFragment b;

    public /* synthetic */ s750(NavigationFragment navigationFragment, int i) {
        this.a = i;
        this.b = navigationFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        AppAnalyticsReporter reporter_delegate$lambda$2;
        udp0 childFragmentFactory_delegate$lambda$3;
        kp51 navigator_delegate$lambda$4;
        hs51 ybInsetsHandlingHelper_delegate$lambda$5;
        uvt0 spoilerManager_delegate$lambda$6;
        ctb cicerone_delegate$lambda$7;
        zy11 onViewCreated$lambda$21$lambda$19;
        zy11 onViewCreated$lambda$21$lambda$20;
        NavigationFragment.NavigationFragmentArguments fragmentArguments_delegate$lambda$0;
        tw51 sdkViewComponent_delegate$lambda$1;
        int i = this.a;
        NavigationFragment navigationFragment = this.b;
        switch (i) {
            case 0:
                reporter_delegate$lambda$2 = NavigationFragment.reporter_delegate$lambda$2(navigationFragment);
                return reporter_delegate$lambda$2;
            case 1:
                childFragmentFactory_delegate$lambda$3 = NavigationFragment.childFragmentFactory_delegate$lambda$3(navigationFragment);
                return childFragmentFactory_delegate$lambda$3;
            case 2:
                navigator_delegate$lambda$4 = NavigationFragment.navigator_delegate$lambda$4(navigationFragment);
                return navigator_delegate$lambda$4;
            case 3:
                ybInsetsHandlingHelper_delegate$lambda$5 = NavigationFragment.ybInsetsHandlingHelper_delegate$lambda$5(navigationFragment);
                return ybInsetsHandlingHelper_delegate$lambda$5;
            case 4:
                spoilerManager_delegate$lambda$6 = NavigationFragment.spoilerManager_delegate$lambda$6(navigationFragment);
                return spoilerManager_delegate$lambda$6;
            case 5:
                cicerone_delegate$lambda$7 = NavigationFragment.cicerone_delegate$lambda$7(navigationFragment);
                return cicerone_delegate$lambda$7;
            case 6:
                onViewCreated$lambda$21$lambda$19 = NavigationFragment.onViewCreated$lambda$21$lambda$19(navigationFragment);
                return onViewCreated$lambda$21$lambda$19;
            case 7:
                onViewCreated$lambda$21$lambda$20 = NavigationFragment.onViewCreated$lambda$21$lambda$20(navigationFragment);
                return onViewCreated$lambda$21$lambda$20;
            case 8:
                fragmentArguments_delegate$lambda$0 = NavigationFragment.fragmentArguments_delegate$lambda$0(navigationFragment);
                return fragmentArguments_delegate$lambda$0;
            default:
                sdkViewComponent_delegate$lambda$1 = NavigationFragment.sdkViewComponent_delegate$lambda$1(navigationFragment);
                return sdkViewComponent_delegate$lambda$1;
        }
    }
}
