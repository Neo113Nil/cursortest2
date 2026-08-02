package com.squareup.cash.shopping.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.molecule.PlatformKt;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.web.WebAppBridge;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingBridgeCommand$BackNavigationCommand;
import com.squareup.cash.shopping.viewmodels.ShoppingBridgeCommand$ForwardNavigationCommand;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.ShoppingWebBridgeEvent;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.viewmodels.WebNavigationFooterViewModel;
import com.squareup.cash.webview.android.WebViewProvider;
import com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.PapaEvent;

/* loaded from: classes7.dex */
public abstract class ShoppingWebContainerViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        PapaEvent.Channel$default(Integer.MAX_VALUE, null, null, 6);
    }

    public static final void AnimatedAutofillSuccessToast(ShoppingViewModel.ValidUrl validUrl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1364168906);
        int i2 = (gapComposer.changedInstance(validUrl) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z = validUrl.showAutofillSuccessToast;
            EnterTransitionImpl slideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, 3);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z, null, slideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default((Function1) rememberedValue), null, ShopErrorKt.lambda$59991484, gapComposer, 1600518, 18);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(validUrl, i, 13);
        }
    }

    public static final void Content(Modifier modifier, ShoppingViewModel shoppingViewModel, String str, String str2, boolean z, Function1 function1, WebViewProvider webViewProvider, boolean z2, Function7 function7, Composer composer, int i) {
        int i2;
        String str3;
        boolean z3;
        Ref$IntRef ref$IntRef;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(886132196);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(shoppingViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= gapComposer.changed(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(webViewProvider) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i3 |= gapComposer.changedInstance(function7) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i3 & 1, (38347923 & i3) != 38347922)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = 0;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ref$IntRef2.element = ((Number) rememberedValue2).intValue();
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).ime;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
            boolean changed = gapComposer.changed(androidWindowInsets) | gapComposer.changed(density);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                ref$IntRef = ref$IntRef2;
                rememberedValue4 = Updater.derivedStateOf(new BasicShieetScope$$ExternalSyntheticLambda10(17, androidWindowInsets, density, parcelableSnapshotMutableIntState));
                gapComposer.updateRememberedValue(rememberedValue4);
            } else {
                ref$IntRef = ref$IntRef2;
            }
            KeyboardState keyboardState = (KeyboardState) ((State) rememberedValue4).getValue();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = "";
                gapComposer.updateRememberedValue("");
            }
            ref$ObjectRef.element = (String) rememberedValue5;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue6;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState2 = (MutableState) rememberedValue7;
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-853018065, new ShoppingWebContainerViewKt$$ExternalSyntheticLambda0(modifier, shoppingViewModel, function1, webViewProvider, keyboardState, ref$ObjectRef, mutableState, mutableState2, (CoroutineScope) rememberedValue8, str, str3, z, ref$IntRef, parcelableSnapshotMutableIntState2, function7), gapComposer), gapComposer, 3072, 7);
            z3 = true;
        } else {
            gapComposer.skipToGroupEnd();
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OTPElementUIKt$$ExternalSyntheticLambda0(modifier, shoppingViewModel, str, str2, z, function1, webViewProvider, z3, function7, i);
        }
    }

    public static final void Footer(ShoppingViewModel shoppingViewModel, Function1 function1, final WebAppBridge webAppBridge, Composer composer, int i) {
        shoppingViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1133914246);
        int i2 = (gapComposer.changedInstance(shoppingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(webAppBridge) ? 256 : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            WebNavigationFooterViewModel footerModel = shoppingViewModel.getFooterModel();
            boolean changedInstance = gapComposer.changedInstance(webAppBridge);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function0() { // from class: com.squareup.cash.shopping.views.ShoppingWebContainerViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = i3;
                        WebAppBridge webAppBridge2 = webAppBridge;
                        switch (i5) {
                            case 0:
                                if (webAppBridge2 != null) {
                                    webAppBridge2.sendWebCommand(ShoppingBridgeCommand$ForwardNavigationCommand.INSTANCE);
                                }
                                break;
                            default:
                                if (webAppBridge2 != null) {
                                    webAppBridge2.sendWebCommand(ShoppingBridgeCommand$BackNavigationCommand.INSTANCE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(webAppBridge);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.shopping.views.ShoppingWebContainerViewKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = i4;
                        WebAppBridge webAppBridge2 = webAppBridge;
                        switch (i5) {
                            case 0:
                                if (webAppBridge2 != null) {
                                    webAppBridge2.sendWebCommand(ShoppingBridgeCommand$ForwardNavigationCommand.INSTANCE);
                                }
                                break;
                            default:
                                if (webAppBridge2 != null) {
                                    webAppBridge2.sendWebCommand(ShoppingBridgeCommand$BackNavigationCommand.INSTANCE);
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ShopErrorKt.WebNavigationFooter(null, footerModel, function1, function0, (Function0) rememberedValue2, gapComposer, (i2 << 3) & 896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(shoppingViewModel, function1, webAppBridge, i, 26);
        }
    }

    public static final void PaykitInfoToast(ShoppingViewModel shoppingViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-361608192);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(shoppingViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            PaykitInfoToastViewModel paykitInfoToastViewModel = shoppingViewModel.getPaykitInfoToastViewModel();
            if (paykitInfoToastViewModel == null) {
                gapComposer.startReplaceGroup(-891527585);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-891527584);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 52.0f));
                int i4 = -((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(10.0f);
                boolean z = shoppingViewModel.getPaykitInfoToastState().showToast;
                boolean changed = gapComposer.changed(i4);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new DatePickerKt$$ExternalSyntheticLambda10(i4, i2);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                EnterTransitionImpl slideInVertically$default = EnterExitTransitionKt.slideInVertically$default(1, (Function1) rememberedValue);
                BiasAlignment.Vertical vertical = Alignment.Companion.Top;
                EnterTransitionImpl plus = slideInVertically$default.plus(EnterExitTransitionKt.expandVertically$default(null, 13));
                boolean changed2 = gapComposer.changed(i4);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new DatePickerKt$$ExternalSyntheticLambda10(i4, i2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z, null, plus, EnterExitTransitionKt.slideOutVertically$default(1, (Function1) rememberedValue2).plus(EnterExitTransitionKt.shrinkVertically$default(null, vertical, 13)), null, Expect_jvmKt.rememberComposableLambda(-923705308, new ButtonGroupKt$$ExternalSyntheticLambda11(paykitInfoToastViewModel, 28), gapComposer), gapComposer, 1572870, 18);
                gapComposer.end(true);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(shoppingViewModel, function1, i, 7);
        }
    }

    public static final void access$Content$handleWebEvents(Function1 function1, ShoppingWebBridgeEvent shoppingWebBridgeEvent, Function1 function12) {
        if (shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.TitleUpdated) {
            function1.invoke(new ShoppingWebViewEvent.TitleUpdated(((ShoppingWebBridgeEvent.TitleUpdated) shoppingWebBridgeEvent).title));
            return;
        }
        if (shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.UrlUpdated) {
            function1.invoke(new ShoppingWebViewEvent.UrlUpdated(((ShoppingWebBridgeEvent.UrlUpdated) shoppingWebBridgeEvent).url));
            return;
        }
        if (shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.ProgressUpdated) {
            ShoppingWebBridgeEvent.ProgressUpdated progressUpdated = (ShoppingWebBridgeEvent.ProgressUpdated) shoppingWebBridgeEvent;
            int i = progressUpdated.progress;
            function1.invoke(new ShoppingWebViewEvent.ProgressUpdated(i, progressUpdated.url));
            function12.invoke(Integer.valueOf(i));
            return;
        }
        if (shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.NavigationStateUpdated) {
            ShoppingWebBridgeEvent.NavigationStateUpdated navigationStateUpdated = (ShoppingWebBridgeEvent.NavigationStateUpdated) shoppingWebBridgeEvent;
            function1.invoke(new ShoppingWebViewEvent.NavigationStateUpdated(navigationStateUpdated.canGoBack, navigationStateUpdated.canGoForward, navigationStateUpdated.isPageFinished, navigationStateUpdated.url));
            return;
        }
        if (shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.AfterpayWebCheckoutFlowJsonEvents) {
            function1.invoke(new ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents(((ShoppingWebBridgeEvent.AfterpayWebCheckoutFlowJsonEvents) shoppingWebBridgeEvent).data));
            return;
        }
        if (shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.WebMonitoringJsonEvents) {
            function1.invoke(new ShoppingWebViewEvent.WebMonitoringJsonEvents(((ShoppingWebBridgeEvent.WebMonitoringJsonEvents) shoppingWebBridgeEvent).data));
            return;
        }
        if (!(shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.PayKitShopBridgeEvent)) {
            if (!(shoppingWebBridgeEvent instanceof ShoppingWebBridgeEvent.NavigationFailed)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            } else {
                ShoppingWebBridgeEvent.NavigationFailed navigationFailed = (ShoppingWebBridgeEvent.NavigationFailed) shoppingWebBridgeEvent;
                function1.invoke(new ShoppingWebViewEvent.NavigationFailed(navigationFailed.error, navigationFailed.statusCode, navigationFailed.errorCode, navigationFailed.url, navigationFailed.isForMainFrame));
                return;
            }
        }
        ShoppingWebBridgeEvent.PayKitShopBridgeEvent payKitShopBridgeEvent = (ShoppingWebBridgeEvent.PayKitShopBridgeEvent) shoppingWebBridgeEvent;
        if (payKitShopBridgeEvent instanceof ShoppingWebBridgeEvent.PayKitShopBridgeEvent.AuthorizeCustomerRequest) {
            function1.invoke(new ShoppingWebViewEvent.PayKitShopViewEvent.AuthorizeCustomerRequest(((ShoppingWebBridgeEvent.PayKitShopBridgeEvent.AuthorizeCustomerRequest) shoppingWebBridgeEvent).url));
        } else if (payKitShopBridgeEvent instanceof ShoppingWebBridgeEvent.PayKitShopBridgeEvent.PromptToAuthorize) {
            function1.invoke(new ShoppingWebViewEvent.PayKitShopViewEvent.PromptToAuthorize(((ShoppingWebBridgeEvent.PayKitShopBridgeEvent.PromptToAuthorize) shoppingWebBridgeEvent).url));
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }
}
