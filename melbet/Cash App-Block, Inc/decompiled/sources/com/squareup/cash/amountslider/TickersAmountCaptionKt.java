package com.squareup.cash.amountslider;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.db.CardMessageQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.themes.HasThemeInfo;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolDescriptionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.savings.views.FullTransferInViewKt$ReadyContent$2$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayKeypadListener;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.util.Strings;
import com.squareup.util.compose.SharedViewEventsKt;
import com.stripe.android.uicore.elements.FormLabelKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public abstract class TickersAmountCaptionKt {

    /* renamed from: lambda$-1982236353, reason: not valid java name */
    public static final ComposableLambdaImpl f141lambda$1982236353 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(25), false, -1982236353);
    public static final ComposableLambdaImpl lambda$663561872 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(26), false, 663561872);

    /* renamed from: lambda$-1068535198, reason: not valid java name */
    public static final ComposableLambdaImpl f140lambda$1068535198 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(27), false, -1068535198);
    public static final ComposableLambdaImpl lambda$1309124231 = new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda5((byte) 0, 13), false, 1309124231);

    /* renamed from: lambda$-2134663296, reason: not valid java name */
    public static final ComposableLambdaImpl f142lambda$2134663296 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(8), false, -2134663296);
    public static final ComposableLambdaImpl lambda$1638561047 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(28), false, 1638561047);

    /* renamed from: lambda$-726175400, reason: not valid java name */
    public static final ComposableLambdaImpl f143lambda$726175400 = new ComposableLambdaImpl(new AfterpaySearchViewKt$$ExternalSyntheticLambda16(29), false, -726175400);
    public static final ComposableLambdaImpl lambda$1204055449 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(1), false, 1204055449);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FullscreenAmountPicker(AmountPickerViewModel amountPickerViewModel, AmountConfig amountConfig, Function1 function1, Modifier modifier, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3 function32;
        GapComposer gapComposer;
        Modifier modifier3;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        ThemeInfo themeInfo;
        Colors m1468withTint4WTKRHQ;
        amountPickerViewModel.getClass();
        amountConfig.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1340825489);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(amountPickerViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? gapComposer2.changed(amountConfig) : gapComposer2.changedInstance(amountConfig) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function32 = function3;
                i3 |= gapComposer2.changedInstance(function32) ? 16384 : PKIFailureInfo.certRevoked;
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i5 != 0) {
                        modifier2 = Modifier.Companion.$$INSTANCE;
                    }
                    Function3 function34 = i4 != 0 ? f140lambda$1068535198 : function32;
                    boolean z = (i3 & 896) == 256;
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (z || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BalanceHomeViewKt$$ExternalSyntheticLambda1(7, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
                    Object obj = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
                    obj.getClass();
                    while (true) {
                        if (!(obj instanceof HasThemeInfo)) {
                            if (!(obj instanceof ContextWrapper)) {
                                themeInfo = null;
                                break;
                            } else {
                                obj = ((ContextWrapper) obj).getBaseContext();
                                obj.getClass();
                            }
                        } else {
                            themeInfo = ((HasThemeInfo) obj).getThemeInfo();
                            break;
                        }
                    }
                    if (themeInfo == null) {
                        gapComposer2.startReplaceGroup(1336689901);
                        m1468withTint4WTKRHQ = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (m1468withTint4WTKRHQ == null) {
                            m1468withTint4WTKRHQ = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1336732960);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        m1468withTint4WTKRHQ = DimensionKt.m1468withTint4WTKRHQ(colors, ColorKt.Color(themeInfo.colorPalette.tint));
                        gapComposer2.end(false);
                    }
                    modifier3 = modifier2;
                    gapComposer = gapComposer2;
                    ArcadeThemeKt.ArcadeTheme(m1468withTint4WTKRHQ, null, null, Expect_jvmKt.rememberComposableLambda(-62093604, new SwipeToDismissKt$$ExternalSyntheticLambda3(amountPickerViewModel, themeInfo, amountConfig, function1, modifier2, function34), gapComposer2), gapComposer, 3072, 6);
                    function33 = function34;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    function33 = function32;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda3((Object) amountPickerViewModel, (Object) amountConfig, (Object) function1, modifier3, (Object) function33, i, i2, 8);
                    return;
                }
                return;
            }
            function32 = function3;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function32 = function3;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void ReadyContent(AmountPickerViewModel.Ready ready, AmountConfig amountConfig, Function1 function1, Modifier modifier, Function3 function3, Composer composer, int i) {
        Function3 function32;
        Object overlayKt$$ExternalSyntheticLambda3;
        Shaker shaker;
        AmountConfig amountConfig2;
        MutableState mutableState;
        RealCashVibrator realCashVibrator;
        int i2;
        Applier applier;
        Shaker shaker2;
        Boolean bool;
        int i3;
        Object obj;
        AmountPickerViewModel.Ready ready2;
        AmountDisplayState amountDisplayState;
        NavigationType navigationType;
        Function1 function12;
        NavigationType navigationType2;
        int i4;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1289487895);
        Applier applier2 = gapComposer.applier;
        int i5 = i | (gapComposer.changedInstance(ready) ? 4 : 2) | (gapComposer.changedInstance(amountConfig) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changedInstance(function3) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            RealCashVibrator realCashVibrator2 = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            int i6 = i5 & 112;
            int i7 = i5 & 896;
            boolean changedInstance = (i6 == 32 || gapComposer.changedInstance(amountConfig)) | (i7 == 256) | gapComposer.changedInstance(realCashVibrator2) | gapComposer.changedInstance(rememberShaker);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj2) {
                shaker = rememberShaker;
                overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(amountConfig, realCashVibrator2, shaker, mutableState2, function1, 10);
                amountConfig2 = amountConfig;
                mutableState = mutableState2;
                realCashVibrator = realCashVibrator2;
                gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
            } else {
                realCashVibrator = realCashVibrator2;
                overlayKt$$ExternalSyntheticLambda3 = rememberedValue2;
                shaker = rememberShaker;
                amountConfig2 = amountConfig;
                mutableState = mutableState2;
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(amountConfig2, null, (Function1) overlayKt$$ExternalSyntheticLambda3, gapComposer, 2);
            boolean changed = gapComposer.changed(rememberAmountDisplayState) | (i6 == 32 || gapComposer.changedInstance(amountConfig2));
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj2) {
                i2 = i5;
                rememberedValue3 = new SearchBarBinding$Content$1$1(rememberAmountDisplayState, amountConfig2, null, 17);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                i2 = i5;
            }
            Updater.LaunchedEffect(gapComposer, amountConfig2, (Function2) rememberedValue3);
            String str = ready.presetAmount;
            Boolean bool2 = (Boolean) mutableState.getValue();
            bool2.getClass();
            boolean changedInstance2 = gapComposer.changedInstance(ready) | gapComposer.changed(rememberAmountDisplayState);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj2) {
                applier = applier2;
                shaker2 = shaker;
                bool = bool2;
                i3 = i2;
                obj = null;
                rememberedValue4 = new FullTransferInViewKt$ReadyContent$2$1(ready, rememberAmountDisplayState, mutableState, null, 1);
                gapComposer.updateRememberedValue(rememberedValue4);
            } else {
                bool = bool2;
                applier = applier2;
                i3 = i2;
                obj = null;
                shaker2 = shaker;
            }
            Updater.LaunchedEffect(str, bool, (Function2) rememberedValue4, gapComposer);
            boolean changed2 = gapComposer.changed(ready.maxAmount) | gapComposer.changed(rememberAmountDisplayState) | (i6 == 32 || gapComposer.changed(amountConfig2));
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue5 == obj2) {
                ready2 = ready;
                CappedKeypadListener cappedKeypadListener = new CappedKeypadListener(new AmountDisplayKeypadListener(rememberAmountDisplayState), rememberAmountDisplayState, amountConfig2, ready.maxAmount, new PoolDescriptionKt$$ExternalSyntheticLambda4(realCashVibrator, shaker2, 1));
                gapComposer.updateRememberedValue(cappedKeypadListener);
                rememberedValue5 = cappedKeypadListener;
            } else {
                ready2 = ready;
            }
            CappedKeypadListener cappedKeypadListener2 = (CappedKeypadListener) rememberedValue5;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            RealCashVibrator realCashVibrator3 = realCashVibrator;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            int ordinal = ready2.closeAction.ordinal();
            if (ordinal != 0) {
                amountDisplayState = rememberAmountDisplayState;
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                navigationType = NavigationType.CLOSE;
            } else {
                amountDisplayState = rememberAmountDisplayState;
                navigationType = NavigationType.BACK;
            }
            boolean z = i7 == 256;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (z || rememberedValue6 == obj2) {
                function12 = function1;
                rememberedValue6 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(9, function12);
                gapComposer.updateRememberedValue(rememberedValue6);
            } else {
                function12 = function1;
            }
            Function0 function0 = (Function0) rememberedValue6;
            if (ready2.showHelpButton) {
                gapComposer.startReplaceGroup(1190514071);
                navigationType2 = navigationType;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1545097391, new BrandSheetViewKt$$ExternalSyntheticLambda6(18, function12), gapComposer);
                i4 = 0;
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
            } else {
                navigationType2 = navigationType;
                i4 = 0;
                gapComposer.startReplaceGroup(1190734171);
                gapComposer.end(false);
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composableLambdaImpl = null;
            }
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = layoutNode$Companion$Constructor$1;
            Shaker shaker3 = shaker2;
            DBUtil.TitleBarSub(lambda$1309124231, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, function0, (Modifier) null, composableLambdaImpl, gapComposer, 6, 44);
            DBUtil.SpacerWithinSectionMedium(i4, 1, gapComposer, null);
            String str2 = ready2.title;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            Pair pair = new Pair(ready2.errorLabel, ready2.subtitle);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == obj2) {
                rememberedValue7 = new CardMessageQueries$$ExternalSyntheticLambda1(24);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            AnimatedContentKt.AnimatedContent(pair, null, (Function1) rememberedValue7, null, null, null, f142lambda$2134663296, gapComposer, 1573248, 58);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Center, horizontal, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(SizeKt.fillMaxWidth(companion, 1.0f), shaker3);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == obj2) {
                rememberedValue8 = new CardMessageQueries$$ExternalSyntheticLambda1(25);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            ConnectionPoolKt.m1177AmountDisplaykNX22eY(amountDisplayState, SemanticsModifierKt.semantics(shakeWith, false, (Function1) rememberedValue8), Strings.getColors(gapComposer).semantic.text.prominent, 0L, 0, 0, gapComposer, 0, 56);
            gapComposer = gapComposer;
            String str3 = ready2.amountCaption;
            if (str3 == null) {
                gapComposer.startReplaceGroup(7109237);
                gapComposer.end(false);
                function32 = function3;
            } else {
                gapComposer.startReplaceGroup(7109238);
                function32 = function3;
                function32.invoke(str3, gapComposer, Integer.valueOf((i3 >> 9) & 112));
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            List list = ready2.showKeypadDecimalSeparator ? KeypadViewModel.keysWithSeparator : KeypadViewModel.keysWithoutSeparator;
            boolean changedInstance3 = gapComposer.changedInstance(cappedKeypadListener2);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue9 == obj2) {
                rememberedValue9 = new yf$$ExternalSyntheticLambda2(cappedKeypadListener2, 29);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            Function0 function02 = (Function0) rememberedValue9;
            boolean changedInstance4 = gapComposer.changedInstance(cappedKeypadListener2);
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue10 == obj2) {
                rememberedValue10 = new ContextKt$$ExternalSyntheticLambda1(cappedKeypadListener2, 16);
                gapComposer.updateRememberedValue(rememberedValue10);
            }
            RelationUtil.m1189KeypadViewww6aTOc(m300paddingVpY3zN4$default, new KeypadViewModel(list, false, function02, (Function1) rememberedValue10, 2), null, Strings.getColors(gapComposer).semantic.text.standard, gapComposer, 0, 4);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1624561039, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(ready2, amountDisplayState, amountConfig, function1, realCashVibrator3, shaker3, 3), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            function32 = function3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(ready, amountConfig, function1, modifier, function32, i);
        }
    }

    public static final void TickersAmountCaption(int i, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        AnnotatedString annotatedString;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2090238245);
        int i2 = ((i & 6) == 0 ? i | (gapComposer.changed(str) ? 4 : 2) : i) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Map map = TickerAdapter.tickerContent;
            if (StringsKt__StringsJVMKt.startsWith(str, Marker.ANY_NON_NULL_MARKER, false)) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                KeyMappingKt.appendInlineContent(builder, "ticker up", "�");
                KeyMappingKt.appendInlineContent(builder, "Spacer", "�");
                builder.append(StringsKt___StringsKt.drop(1, str));
                annotatedString = builder.toAnnotatedString();
            } else if (StringsKt__StringsJVMKt.startsWith(str, "-", false)) {
                AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                KeyMappingKt.appendInlineContent(builder2, "ticker down", "�");
                KeyMappingKt.appendInlineContent(builder2, "Spacer", "�");
                builder2.append(StringsKt___StringsKt.drop(1, str));
                annotatedString = builder2.toAnnotatedString();
            } else {
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(str);
                String sb2 = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add(((AnnotatedString.Builder.MutableRange) arrayList.get(i3)).toRange(sb.length()));
                }
                annotatedString = new AnnotatedString(sb2, (List) arrayList2);
            }
            AnnotatedString annotatedString2 = annotatedString;
            Map map2 = TickerAdapter.tickerContent;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1164Text25TpFw(0, 0, 0, 3, 0, 0, 1776, colors.semantic.text.subtle, (Composer) gapComposer, m300paddingVpY3zN4$default, annotatedString2, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, map2, (Function1) null, false);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormLabelKt$$ExternalSyntheticLambda0(str, modifier2, i, 2, (byte) 0);
        }
    }
}
