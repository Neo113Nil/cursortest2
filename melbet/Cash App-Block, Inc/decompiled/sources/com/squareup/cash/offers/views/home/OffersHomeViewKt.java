package com.squareup.cash.offers.views.home;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ShowNavigationBack;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModel;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes6.dex */
public abstract class OffersHomeViewKt {
    public static final CubicBezierEasing CustomEasing = new CubicBezierEasing(0.4f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);

    public static final void OffersHome(Modifier modifier, OffersHomeViewModel offersHomeViewModel, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        Object m;
        offersHomeViewModel.getClass();
        UiCallbackModel uiCallbackModel = offersHomeViewModel.searchViewModel;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-236939581);
        int i2 = i | 6 | (gapComposer.changed(offersHomeViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            Transition updateTransition = AnimatableKt.updateTransition(Boolean.valueOf(((OffersSearchViewModel) uiCallbackModel.model).isSearchMode), "Search transition", gapComposer, 48, 0);
            InteractionResult interactionResult = updateTransition.transitionState;
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer, 0, 3);
            Function0 obtainDismissKeyboard = UtilsKt.obtainDismissKeyboard(gapComposer);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1))), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.DpToVector;
            boolean isSeeking = updateTransition.isSeeking();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (isSeeking) {
                m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed = gapComposer.changed(updateTransition);
                m = gapComposer.rememberedValue();
                if (changed || m == neverEqualPolicy) {
                    Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState);
                        m = currentState;
                    } catch (Throwable th) {
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                gapComposer.end(false);
            }
            ((Boolean) m).getClass();
            gapComposer.startReplaceGroup(-2012233442);
            gapComposer.end(false);
            Dp dp = new Dp(RecyclerView.DECELERATION_RATE);
            boolean changed2 = gapComposer.changed(updateTransition);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 20));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ((Boolean) ((State) rememberedValue).getValue()).getClass();
            gapComposer.startReplaceGroup(-2012233442);
            gapComposer.end(false);
            Dp dp2 = new Dp(RecyclerView.DECELERATION_RATE);
            boolean changed3 = gapComposer.changed(updateTransition);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 21));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
            gapComposer.startReplaceGroup(-1052977391);
            TweenSpec tweenCubicBezierEasing$default = tweenCubicBezierEasing$default(400, 6, null);
            gapComposer.end(false);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, ((Dp) AnimatableKt.createTransitionAnimation(updateTransition, dp, dp2, tweenCubicBezierEasing$default, twoWayConverterImpl, gapComposer, 196608).value$delegate.getValue()).value, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            String str = offersHomeViewModel.titleBarTitle;
            String str2 = offersHomeViewModel.searchPlaceholder;
            boolean z = ((OffersSearchViewModel) uiCallbackModel.model).isSearchMode;
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new UtilKt$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            OffersHomeToolbar(m302paddingqDBjuR0$default, str, updateTransition, m382rememberTextFieldStateLepunE, str2, (Function1) rememberedValue3, z, function1, gapComposer, (i2 << 15) & 29360128);
            gapComposer = gapComposer;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new OffersStyledTextKt$$ExternalSyntheticLambda0(12);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            AnimatedContentKt.AnimatedContent(updateTransition, null, (Function1) rememberedValue4, null, null, Expect_jvmKt.rememberComposableLambda(-513541826, new OffersHomeViewKt$$ExternalSyntheticLambda2(offersHomeViewModel, rememberScrollState, function1, m382rememberTextFieldStateLepunE, obtainDismissKeyboard, 0), gapComposer), gapComposer, 196992, 13);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5(i, 29, modifier2, offersHomeViewModel, function1);
        }
    }

    public static final void OffersHomeToolbar(Modifier modifier, String str, Transition transition, TextFieldState textFieldState, String str2, Function1 function1, boolean z, Function1 function12, Composer composer, int i) {
        int i2;
        TextFieldState textFieldState2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1688806808);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(transition) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            textFieldState2 = textFieldState;
            i2 |= gapComposer2.changed(textFieldState2) ? 2048 : 1024;
        } else {
            textFieldState2 = textFieldState;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(str2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(z) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function12) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new OffersStyledTextKt$$ExternalSyntheticLambda0(13);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedVisibility(transition, (Function1) rememberedValue, (Modifier) null, EnterExitTransitionKt.fadeIn$default(tweenCubicBezierEasing$default(400, 6, null), 2).plus(EnterExitTransitionKt.expandVertically$default(tweenCubicBezierEasing$default(400, 6, null), 14)), EnterExitTransitionKt.fadeOut$default(tweenCubicBezierEasing$default(150, 6, null), 2).plus(EnterExitTransitionKt.shrinkVertically$default(tweenCubicBezierEasing$default(400, 6, null), null, 14)), Expect_jvmKt.rememberComposableLambda(-1355899781, new TabContentViewKt$$ExternalSyntheticLambda11(str, function12, 23), gapComposer2), gapComposer2, ((i2 >> 6) & 14) | 196656);
            Modifier onFocusChanged = FocusOwnerImplKt.onFocusChanged(Modifier.Companion.$$INSTANCE, function1);
            ShowNavigationBack showNavigationBack = z ? ShowNavigationBack.Always : ShowNavigationBack.Never;
            boolean z2 = (29360128 & i2) == 8388608;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda0(3, function12);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            SearchBarKt.SearchBar(textFieldState2, str2, rememberSearchBarKeyboardState, onFocusChanged, null, showNavigationBack, (Function0) rememberedValue2, null, null, null, true, null, gapComposer2, (i2 >> 9) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 6, 7056);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda3(modifier, str, transition, textFieldState, str2, function1, z, function12, i);
        }
    }

    public static TweenSpec tweenCubicBezierEasing$default(int i, int i2, Easing easing) {
        if ((i2 & 4) != 0) {
            easing = CustomEasing;
        }
        return new TweenSpec(i, 0, easing);
    }
}
