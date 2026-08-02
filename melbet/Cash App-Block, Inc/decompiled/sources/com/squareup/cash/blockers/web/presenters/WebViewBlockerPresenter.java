package com.squareup.cash.blockers.web.presenters;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.zxing.Result;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.autofillweb.real.RealAutofillWebManagerProvider;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.web.delegates.WebViewBlockerCookieManager;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerFooterModel;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerHeaderModel;
import com.squareup.cash.blockers.web.viewmodels.WebViewBlockerViewModel;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.WebviewBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class WebViewBlockerPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final BlockersScreens.WebViewBlockerScreen args;
    public final AggregateAutofillWebManager autofillManager;
    public final BlockersDataNavigator blockersDataNavigator;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealUrlAuthenticator urlAuthenticator;
    public final WebViewBlockerCookieManager webBlockerCookieManager;
    public final Result webViewBlockerRepo;

    public WebViewBlockerPresenter(Result result, BlockersDataNavigator blockersDataNavigator, Analytics analytics, WebViewBlockerCookieManager webViewBlockerCookieManager, IntentLauncher intentLauncher, RealUrlAuthenticator realUrlAuthenticator, RealAutofillWebManagerProvider realAutofillWebManagerProvider, BlockersScreens.WebViewBlockerScreen webViewBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        webViewBlockerScreen.getClass();
        this.webViewBlockerRepo = result;
        this.blockersDataNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.webBlockerCookieManager = webViewBlockerCookieManager;
        this.launcher = intentLauncher;
        this.urlAuthenticator = realUrlAuthenticator;
        this.args = webViewBlockerScreen;
        this.navigator = screenNavigator;
        this.autofillManager = realAutofillWebManagerProvider.get(null);
    }

    public static final WebViewBlockerViewModel access$updateLoadingState(WebViewBlockerPresenter webViewBlockerPresenter, WebViewBlockerViewModel webViewBlockerViewModel, boolean z) {
        if (Intrinsics.areEqual(webViewBlockerViewModel, WebViewBlockerViewModel.ErrorUrl.INSTANCE) || Intrinsics.areEqual(webViewBlockerViewModel, WebViewBlockerViewModel.Loading.INSTANCE)) {
            return webViewBlockerViewModel;
        }
        if (webViewBlockerViewModel instanceof WebViewBlockerViewModel.LoadUrl) {
            return WebViewBlockerViewModel.LoadUrl.copy$default((WebViewBlockerViewModel.LoadUrl) webViewBlockerViewModel, null, z, 95);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d2  */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.squareup.protos.franklin.api.BlockerAction$EndFlowAction] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        WebViewBlockerFooterModel webViewBlockerFooterModel;
        String str;
        BlockerAction blockerAction;
        BlockerAction.EndFlowAction endFlowAction;
        BlockerAction blockerAction2;
        String str2;
        BlockerAction blockerAction3;
        BlockerAction.Action action;
        BlockerAction.Action.EndFlowAction endFlowAction2;
        BlockerAction.Action action2;
        BlockerAction.SubmitAction value;
        BlockerAction.Action action3;
        BlockerAction.Action.EndFlowAction endFlowAction3;
        BlockerAction.Action action4;
        Boolean bool;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1969143579);
        Object rememberedValue = gapComposer.rememberedValue();
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj2 = rememberedValue;
        if (rememberedValue == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(mutableStateOf$default);
            obj2 = mutableStateOf$default;
        }
        MutableState mutableState = (MutableState) obj2;
        String str3 = this.args.url;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj3 = rememberedValue2;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            WebViewBlockerPresenter$models$1$1 webViewBlockerPresenter$models$1$1 = new WebViewBlockerPresenter$models$1$1(this, mutableState, null);
            gapComposer.updateRememberedValue(webViewBlockerPresenter$models$1$1);
            obj3 = webViewBlockerPresenter$models$1$1;
        }
        Updater.LaunchedEffect(gapComposer, str3, (Function2) obj3);
        BlockersScreens.WebViewBlockerScreen webViewBlockerScreen = (BlockersScreens.WebViewBlockerScreen) mutableState.getValue();
        if (webViewBlockerScreen == null) {
            gapComposer.end(false);
            return WebViewBlockerViewModel.Loading.INSTANCE;
        }
        WebviewBlocker.NavigationHeader navigationHeader = webViewBlockerScreen.navigationHeader;
        Flow flow2 = this.autofillManager.infoFieldsDetected;
        Updater.LaunchedEffect(gapComposer, flow2, new RealBoostSelector$removeBoost$1(flow2, (Continuation) r2, webViewBlockerScreen, this, 9));
        if (URLUtil.isValidUrl(webViewBlockerScreen.url)) {
            String str4 = webViewBlockerScreen.url;
            String str5 = webViewBlockerScreen.callbackUrl;
            List list = webViewBlockerScreen.cookies;
            boolean z = webViewBlockerScreen.allowPopups;
            WebViewBlockerHeaderModel webViewBlockerHeaderModel = new WebViewBlockerHeaderModel(navigationHeader != null ? navigationHeader.title : null, Uri.parse(str4).getHost(), navigationHeader == null, (navigationHeader == null || (bool = navigationHeader.should_hide_url) == null) ? false : bool.booleanValue());
            WebviewBlocker.NavigationFooter navigationFooter = webViewBlockerScreen.navigationFooter;
            if (navigationFooter != null) {
                BlockerAction blockerAction4 = navigationFooter.primary_action;
                String str6 = blockerAction4 != null ? blockerAction4.text : null;
                if (blockerAction4 != null && (action4 = blockerAction4.action) != null) {
                    BlockerAction.Action.SubmitAction submitAction = action4 instanceof BlockerAction.Action.SubmitAction ? (BlockerAction.Action.SubmitAction) action4 : null;
                    BlockerAction.SubmitAction value2 = submitAction != null ? submitAction.getValue() : null;
                    if (value2 != null) {
                        str = value2.id;
                        blockerAction = navigationFooter.primary_action;
                        if (blockerAction != null && (action3 = blockerAction.action) != null) {
                            endFlowAction3 = !(action3 instanceof BlockerAction.Action.EndFlowAction) ? (BlockerAction.Action.EndFlowAction) action3 : null;
                            if (endFlowAction3 != null) {
                                endFlowAction = endFlowAction3.getValue();
                                boolean z2 = endFlowAction != null;
                                blockerAction2 = navigationFooter.secondary_action;
                                String str7 = blockerAction2 != null ? blockerAction2.text : null;
                                if (blockerAction2 != null && (action2 = blockerAction2.action) != null) {
                                    BlockerAction.Action.SubmitAction submitAction2 = !(action2 instanceof BlockerAction.Action.SubmitAction) ? (BlockerAction.Action.SubmitAction) action2 : null;
                                    value = submitAction2 == null ? submitAction2.getValue() : null;
                                    if (value != null) {
                                        str2 = value.id;
                                        blockerAction3 = navigationFooter.secondary_action;
                                        if (blockerAction3 != null && (action = blockerAction3.action) != null) {
                                            endFlowAction2 = !(action instanceof BlockerAction.Action.EndFlowAction) ? (BlockerAction.Action.EndFlowAction) action : null;
                                            if (endFlowAction2 != null) {
                                                r2 = endFlowAction2.getValue();
                                            }
                                        }
                                        webViewBlockerFooterModel = new WebViewBlockerFooterModel(str6, str, str7, str2, z2, r2 == 0);
                                    }
                                }
                                str2 = null;
                                blockerAction3 = navigationFooter.secondary_action;
                                if (blockerAction3 != null) {
                                    if (!(action instanceof BlockerAction.Action.EndFlowAction)) {
                                    }
                                    if (endFlowAction2 != null) {
                                    }
                                }
                                webViewBlockerFooterModel = new WebViewBlockerFooterModel(str6, str, str7, str2, z2, r2 == 0);
                            }
                        }
                        endFlowAction = null;
                        if (endFlowAction != null) {
                        }
                        blockerAction2 = navigationFooter.secondary_action;
                        if (blockerAction2 != null) {
                        }
                        if (blockerAction2 != null) {
                            if (!(action2 instanceof BlockerAction.Action.SubmitAction)) {
                            }
                            if (submitAction2 == null) {
                            }
                            if (value != null) {
                            }
                        }
                        str2 = null;
                        blockerAction3 = navigationFooter.secondary_action;
                        if (blockerAction3 != null) {
                        }
                        webViewBlockerFooterModel = new WebViewBlockerFooterModel(str6, str, str7, str2, z2, r2 == 0);
                    }
                }
                str = null;
                blockerAction = navigationFooter.primary_action;
                if (blockerAction != null) {
                    if (!(action3 instanceof BlockerAction.Action.EndFlowAction)) {
                    }
                    if (endFlowAction3 != null) {
                    }
                }
                endFlowAction = null;
                if (endFlowAction != null) {
                }
                blockerAction2 = navigationFooter.secondary_action;
                if (blockerAction2 != null) {
                }
                if (blockerAction2 != null) {
                }
                str2 = null;
                blockerAction3 = navigationFooter.secondary_action;
                if (blockerAction3 != null) {
                }
                webViewBlockerFooterModel = new WebViewBlockerFooterModel(str6, str, str7, str2, z2, r2 == 0);
            } else {
                webViewBlockerFooterModel = null;
            }
            obj = new WebViewBlockerViewModel.LoadUrl(str4, str5, list, webViewBlockerHeaderModel, webViewBlockerFooterModel, false, z);
        } else {
            obj = WebViewBlockerViewModel.ErrorUrl.INSTANCE;
        }
        Object rememberedValue3 = gapComposer.rememberedValue();
        Object obj4 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(obj);
            gapComposer.updateRememberedValue(mutableStateOf$default2);
            obj4 = mutableStateOf$default2;
        }
        MutableState mutableState2 = (MutableState) obj4;
        Object rememberedValue4 = gapComposer.rememberedValue();
        Object obj5 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(mutableStateOf$default3);
            obj5 = mutableStateOf$default3;
        }
        MutableState mutableState3 = (MutableState) obj5;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(webViewBlockerScreen) | gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        Object obj6 = rememberedValue5;
        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
            BadgeQueries$$ExternalSyntheticLambda0 badgeQueries$$ExternalSyntheticLambda0 = new BadgeQueries$$ExternalSyntheticLambda0(29, webViewBlockerScreen, this);
            gapComposer.updateRememberedValue(badgeQueries$$ExternalSyntheticLambda0);
            obj6 = badgeQueries$$ExternalSyntheticLambda0;
        }
        Updater.DisposableEffect(unit, (Function1) obj6, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1(flow, (Continuation) null, webViewBlockerScreen, this, mutableState3, mutableState2, 9));
        WebViewBlockerViewModel webViewBlockerViewModel = (WebViewBlockerViewModel) mutableState2.getValue();
        gapComposer.end(false);
        return webViewBlockerViewModel;
    }
}
