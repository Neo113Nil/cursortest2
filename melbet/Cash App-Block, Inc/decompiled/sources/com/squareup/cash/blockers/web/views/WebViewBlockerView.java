package com.squareup.cash.blockers.web.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.webkit.WebView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerBridge;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerBridge$Factory$Impl;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerCookieManager;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.blockers.web.viewmodels.WebViewScraping;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class WebViewBlockerView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final WebViewBlockerBridge$Factory$Impl webBlockerBridgeFactory;
    public final WebViewScraping webViewScraping;
    public final boolean xWebCompatibilityEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewBlockerView(Context context, WebViewBlockerBridge$Factory$Impl webViewBlockerBridge$Factory$Impl, WebViewScraping webViewScraping, boolean z) {
        super(context);
        context.getClass();
        this.webBlockerBridgeFactory = webViewBlockerBridge$Factory$Impl;
        this.webViewScraping = webViewScraping;
        this.xWebCompatibilityEnabled = z;
    }

    public final void Content(WebViewBlockerViewModel webViewBlockerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Object obj;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1209255198);
        int i3 = i | (gapComposer.changedInstance(webViewBlockerViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (webViewBlockerViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = new WebView(new ContextThemeWrapper(getContext(), R.style.Theme_Cash_WebView_Dialog));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            WebView webView = (WebView) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj2) {
                boolean z = this.webViewScraping != WebViewScraping.DISABLED;
                WebViewBlockerBridge$Factory$Impl webViewBlockerBridge$Factory$Impl = this.webBlockerBridgeFactory;
                webViewBlockerBridge$Factory$Impl.getClass();
                coroutineScope.getClass();
                webView.getClass();
                RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = webViewBlockerBridge$Factory$Impl.delegateFactory;
                WebViewBlockerCookieManager webViewBlockerCookieManager = (WebViewBlockerCookieManager) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
                RealAutofillWebManagerProvider realAutofillWebManagerProvider = (RealAutofillWebManagerProvider) realYouPresenter$MetroFactory.passcodeProvider.invoke();
                webViewBlockerCookieManager.getClass();
                featureFlagManager.getClass();
                realAutofillWebManagerProvider.getClass();
                rememberedValue3 = new WebViewBlockerBridge(coroutineScope, webView, z, this.xWebCompatibilityEnabled, webViewBlockerCookieManager, featureFlagManager, realAutofillWebManagerProvider);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            WebViewBlockerBridge webViewBlockerBridge = (WebViewBlockerBridge) rememberedValue3;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z2 || rememberedValue4 == obj2) {
                rememberedValue4 = new BorrowHomeKt$$ExternalSyntheticLambda3(5, function1);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue4, gapComposer, 0, 1);
            if (webViewBlockerViewModel instanceof WebViewBlockerViewModel.LoadUrl) {
                gapComposer.startReplaceGroup(-1263414091);
                WebViewBlockerViewModel.LoadUrl loadUrl = (WebViewBlockerViewModel.LoadUrl) webViewBlockerViewModel;
                boolean z3 = loadUrl.allowPopups;
                WebView webView2 = webViewBlockerBridge.webView;
                webView2.getSettings().setSupportMultipleWindows(z3);
                webView2.getSettings().setJavaScriptCanOpenWindowsAutomatically(z3);
                if (webView.getUrl() == null) {
                    webViewBlockerBridge.loadUrl(loadUrl.url, loadUrl.cookies);
                }
                boolean changedInstance = gapComposer.changedInstance(webViewBlockerBridge);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue5 == obj2) {
                    rememberedValue5 = new SsnViewKt$$ExternalSyntheticLambda4(webViewBlockerBridge, 7);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                int i5 = (i3 & 14) | ((i3 << 3) & 896);
                i2 = i4;
                WebViewBlockerViewKt.WebViewBlocker(loadUrl, webView, function1, (Function0) rememberedValue5, null, gapComposer, i5);
                gapComposer.end(false);
            } else {
                i2 = i4;
                if (webViewBlockerViewModel instanceof WebViewBlockerViewModel.Loading) {
                    gapComposer.startReplaceGroup(-1841858558);
                    gapComposer.end(false);
                } else {
                    if (!(webViewBlockerViewModel instanceof WebViewBlockerViewModel.ErrorUrl)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1841871617, false);
                    }
                    gapComposer.startReplaceGroup(-1841857726);
                    gapComposer.end(false);
                }
            }
            Object obj3 = webViewBlockerBridge.webEvents;
            boolean changedInstance2 = gapComposer.changedInstance(obj3) | gapComposer.changedInstance(this) | (i2 == 32);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == obj2) {
                obj = obj3;
                Object fileBlockerView$6$2$2 = new FileBlockerView$6$2$2(obj, this, function1, null, 23);
                gapComposer.updateRememberedValue(fileBlockerView$6$2$2);
                rememberedValue6 = fileBlockerView$6$2$2;
            } else {
                obj = obj3;
            }
            Updater.LaunchedEffect(gapComposer, obj, (Function2) rememberedValue6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9((Object) this, (Object) webViewBlockerViewModel, function1, i, 11);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((WebViewBlockerViewModel) obj, function1, gapComposer, 0);
    }
}
