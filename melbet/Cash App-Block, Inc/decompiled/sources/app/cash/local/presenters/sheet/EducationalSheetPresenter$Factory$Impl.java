package app.cash.local.presenters.sheet;

import app.cash.broadway.navigation.Navigator;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.screens.app.LocalEducationalSheet;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;

/* loaded from: classes.dex */
public final class EducationalSheetPresenter$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public EducationalSheetPresenter$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final EducationalSheetPresenter create(LocalEducationalSheet localEducationalSheet, Navigator navigator) {
        localEducationalSheet.getClass();
        navigator.getClass();
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        RealLocalLauncher realLocalLauncher = (RealLocalLauncher) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        Analytics analytics = (Analytics) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        SessionManager sessionManager = (SessionManager) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        realLocalLauncher.getClass();
        analytics.getClass();
        sessionManager.getClass();
        return new EducationalSheetPresenter(realLocalLauncher, analytics, sessionManager, localEducationalSheet, navigator);
    }
}
