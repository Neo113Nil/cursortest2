package com.squareup.cash.checks;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerBridge$Factory$Impl;
import com.squareup.cash.blockers.web.viewmodels.WebViewScraping;
import com.squareup.cash.blockers.web.views.WebViewBlockerView;
import com.squareup.cash.checks.screens.CaptureCheckFaceScreen;
import com.squareup.cash.checks.screens.CheckDepositAmountScreen;
import com.squareup.cash.checks.screens.ConfirmBackOfCheckScreen;
import com.squareup.cash.checks.screens.ConfirmFrontOfCheckScreen;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.checks.screens.VerifyCheckDialogScreen;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientCommerceArcadeMigrationAutofill;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.autofill.screens.AutofillScreen;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.shopping.autofill.views.AutofillSheetView;
import com.squareup.cash.shopping.autofill.views.AutofillSheetViewKt;
import java.util.Locale;
import java.util.Map;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class CheckDepositUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object vibrator;

    public /* synthetic */ CheckDepositUiFactory(Object obj, int i) {
        this.$r8$classId = i;
        this.vibrator = obj;
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        Boolean booleanStrictOrNull;
        int i = this.$r8$classId;
        Object obj = this.vibrator;
        WebViewScraping webViewScraping = null;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof ConfirmBackOfCheckScreen) {
                    return new UiFactory.ComposeUi(CheckDepositAmountKt.lambda$1776406796);
                }
                if (screen instanceof ConfirmFrontOfCheckScreen) {
                    return new UiFactory.ComposeUi(CheckDepositAmountKt.lambda$1047966365);
                }
                if (screen instanceof CheckDepositAmountScreen) {
                    return new UiFactory.ComposeUi(CheckDepositAmountKt.f353lambda$195282408);
                }
                if (screen instanceof VerifyCheckDepositScreen) {
                    return new UiFactory.ComposeUi(CheckDepositAmountKt.f352lambda$1662906664);
                }
                if (screen instanceof VerifyCheckDialogScreen) {
                    VerifyCheckDialogView verifyCheckDialogView = new VerifyCheckDialogView(context);
                    return new UiFactory.ViewUi(verifyCheckDialogView, verifyCheckDialogView);
                }
                if (screen instanceof CaptureCheckFaceScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 7), true, -873458778));
                }
                return null;
            case 1:
                if (!(screen instanceof BlockersScreens.WebViewBlockerScreen)) {
                    return null;
                }
                Map map = ((BlockersScreens.WebViewBlockerScreen) screen).metadata;
                String str = (String) map.get("webview_scraping");
                if (str != null) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String upperCase = str.toUpperCase(locale);
                    upperCase.getClass();
                    webViewScraping = WebViewScraping.valueOf(upperCase);
                }
                WebViewBlockerBridge$Factory$Impl webViewBlockerBridge$Factory$Impl = (WebViewBlockerBridge$Factory$Impl) obj;
                String str2 = (String) map.get("x_web_compatibility");
                WebViewBlockerView webViewBlockerView = new WebViewBlockerView(context, webViewBlockerBridge$Factory$Impl, webViewScraping, (str2 == null || (booleanStrictOrNull = StringsKt.toBooleanStrictOrNull(str2)) == null) ? false : booleanStrictOrNull.booleanValue());
                return new UiFactory.ViewUi(webViewBlockerView, webViewBlockerView);
            default:
                if (screen instanceof AutofillScreen) {
                    AutofillSheetView autofillSheetView = new AutofillSheetView(context, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).currentValue(AmplitudeExperiments$ClientCommerceArcadeMigrationAutofill.INSTANCE)).enabled());
                    return new UiFactory.ViewUi(autofillSheetView, autofillSheetView);
                }
                if (screen instanceof EditAutofillScreen) {
                    return new UiFactory.LegacySheetComposeUi(new UiFactory.LegacySheetComposeUi.Config(11), AutofillSheetViewKt.lambda$1302010073);
                }
                return null;
        }
    }
}
