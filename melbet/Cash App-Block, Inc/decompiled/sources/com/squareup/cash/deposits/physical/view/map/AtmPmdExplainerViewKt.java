package com.squareup.cash.deposits.physical.view.map;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda22;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda23;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewModel;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda3;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.moneybot.genie.SwitchViewKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.util.cash.StringsKt;
import java.io.Serializable;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.bankingbenefits.ui.BenefitExplainerScreen;
import squareup.cash.ui.arcade.elements.ActionableButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ActionableButtonDefault;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonProminence;
import squareup.cash.ui.arcade.elements.CellDefault;
import squareup.cash.ui.arcade.elements.ListUnordered;
import squareup.cash.ui.arcade.elements.PageHeader;
import squareup.cash.ui.arcade.elements.SectionHeader;
import squareup.cash.ui.arcade.elements.WithinSection;

/* loaded from: classes6.dex */
public abstract class AtmPmdExplainerViewKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[BetweenSection.Variant.values().length];
            try {
                iArr[BetweenSection.Variant.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetweenSection.Variant.X_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BetweenSection.Variant.X_LARGE_BELOW_CELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WithinSection.Variant.values().length];
            try {
                iArr2[WithinSection.Variant.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WithinSection.Variant.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ButtonCtaGroup.Direction.values().length];
            try {
                iArr3[ButtonCtaGroup.Direction.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ButtonProminence.values().length];
            try {
                iArr4[ButtonProminence.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr4[ButtonProminence.PROMINENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[ButtonProminence.SUBTLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final void ActionableButton(ActionableButtonDefault actionableButtonDefault, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(944395671);
        int i2 = (gapComposer.changedInstance(actionableButtonDefault) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ButtonCta(actionableButtonDefault, (Function1) rememberedValue, m302paddingqDBjuR0$default, true, gapComposer, (i2 & 14) | 3072, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(actionableButtonDefault, function1, i, 8);
        }
    }

    public static final void AtmPmdExplainerView(AtmPmdExplainerViewModel atmPmdExplainerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        atmPmdExplainerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-179016425);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(atmPmdExplainerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-314719444, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(7, function1, atmPmdExplainerViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(atmPmdExplainerViewModel, function1, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonCta(ActionableButtonDefault actionableButtonDefault, Function1 function1, Modifier modifier, boolean z, Composer composer, int i, int i2) {
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        com.squareup.cash.arcade.components.button.ButtonProminence buttonProminence;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1106241710);
        int i3 = 2;
        int i4 = (gapComposer.changedInstance(actionableButtonDefault) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i4 |= gapComposer.changed(z2) ? 2048 : 1024;
            int i6 = 1;
            if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                z3 = i5 != 0 ? false : z2;
                ActionableButtonDefault.Action action = actionableButtonDefault.action;
                action.getClass();
                ActionableButtonDefault.Action.ClientRouteAction clientRouteAction = action instanceof ActionableButtonDefault.Action.ClientRouteAction ? (ActionableButtonDefault.Action.ClientRouteAction) action : null;
                ActionableButtonDefault.ClientRouteAction value = clientRouteAction != null ? clientRouteAction.getValue() : null;
                value.getClass();
                String str = value.client_route_url;
                str.getClass();
                ButtonDefault buttonDefault = actionableButtonDefault.button;
                buttonDefault.getClass();
                LocalizedString localizedString = buttonDefault.text;
                localizedString.getClass();
                String translated = StringsKt.translated(localizedString);
                ButtonDefault buttonDefault2 = actionableButtonDefault.button;
                buttonDefault2.getClass();
                ButtonProminence buttonProminence2 = buttonDefault2.button_prominence;
                int i7 = buttonProminence2 == null ? -1 : WhenMappings.$EnumSwitchMapping$3[buttonProminence2.ordinal()];
                if (i7 == -1 || i7 == 1) {
                    buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.STANDARD;
                } else if (i7 == 2) {
                    buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.PROMINENT;
                } else {
                    if (i7 != 3) {
                        ButtonDefault buttonDefault3 = actionableButtonDefault.button;
                        throw new NotImplementedError("Button prominence " + (buttonDefault3 != null ? buttonDefault3.button_prominence : null) + " is not supported.");
                    }
                    buttonProminence = com.squareup.cash.arcade.components.button.ButtonProminence.SUBTLE;
                }
                Object obj = Composer.Companion.Empty;
                if (z3) {
                    gapComposer.startReplaceGroup(763390035);
                    boolean changed = ((i4 & 112) == 32) | gapComposer.changed(str);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj) {
                        rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 9);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    SizeKt.ButtonCompact((Function0) rememberedValue, modifier, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-959675845, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(translated, i6), gapComposer), gapComposer, ((i4 >> 3) & 112) | 1572864, 56);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(763554800);
                    boolean changed2 = gapComposer.changed(str) | ((i4 & 112) == 32);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj) {
                        rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 10);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue2, modifier, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(2113719173, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(translated, i3), gapComposer), gapComposer, ((i4 >> 3) & 112) | 1572864, 56);
                    gapComposer.end(false);
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0((Serializable) actionableButtonDefault, (Object) function1, modifier, z3, i, i2, 16);
                return;
            }
            return;
        }
        z2 = z;
        int i62 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CellDefault(CellDefault cellDefault, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-170891701);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(cellDefault) ? 4 : 2) | i;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(488687687, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i4), gapComposer);
            if (cellDefault.body_text != null) {
                gapComposer.startReplaceGroup(-1498239487);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1524316844, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 3), gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1498181083);
                gapComposer.end(false);
                composableLambdaImpl = null;
            }
            ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
            if (cellDefault.icon != null) {
                gapComposer.startReplaceGroup(-1498122214);
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1156913260, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i2), gapComposer), rememberComposableLambda, null, null, false, false, composableLambdaImpl2, null, null, 0L, gapComposer, 54, 3964);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1497656160);
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, null, false, false, composableLambdaImpl2, null, 0L, null, null, gapComposer, 6, 1982);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i, 2);
        }
    }

    public static final void CtaGroup(final ActionableButtonCtaGroup actionableButtonCtaGroup, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1489139468);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(actionableButtonCtaGroup) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2097389427, new ArcadeModal$$ExternalSyntheticLambda5(actionableButtonCtaGroup, i2), gapComposer);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda3(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final Function1 function12 = (Function1) rememberedValue;
            ButtonCtaGroup.Direction direction = actionableButtonCtaGroup.direction;
            int i6 = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$2[direction.ordinal()];
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ComposableLambdaImpl composableLambdaImpl = null;
            if (i6 == 1) {
                gapComposer.startReplaceGroup(237037107);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                ButtonCtaGroupOrientation buttonCtaGroupOrientation = ButtonCtaGroupOrientation.AUTOMATIC;
                boolean areEqual = Intrinsics.areEqual(actionableButtonCtaGroup.show_hairline, Boolean.TRUE);
                if (actionableButtonCtaGroup.disclaimer_text != null) {
                    gapComposer.startReplaceGroup(237223634);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1282269652, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 10), gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(237265112);
                    gapComposer.end(false);
                }
                DimensionKt.ButtonCtaGroup(fillMaxWidth, areEqual, buttonCtaGroupOrientation, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(177557638, new Function3() { // from class: com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = i4;
                        ActionableButtonCtaGroup actionableButtonCtaGroup2 = actionableButtonCtaGroup;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        switch (i7) {
                            case 0:
                                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                adaptiveStackScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 19) != 18)) {
                                    ActionableButtonDefault actionableButtonDefault = actionableButtonCtaGroup2.primary_button;
                                    Function1 function13 = function12;
                                    if (actionableButtonDefault == null) {
                                        gapComposer2.startReplaceGroup(-1780079735);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1780079734);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault, function13, adaptiveStackScope.horizontalWeight(companion2, 1.0f), false, gapComposer2, 0, 8);
                                        gapComposer2.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault2 = actionableButtonCtaGroup2.secondary_button;
                                    if (actionableButtonDefault2 == null) {
                                        gapComposer2.startReplaceGroup(-1779933911);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1779933910);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault2, function13, adaptiveStackScope.horizontalWeight(companion2, 1.0f), false, gapComposer2, 0, 8);
                                        gapComposer2.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault3 = actionableButtonCtaGroup2.tertiary_button;
                                    if (actionableButtonDefault3 == null) {
                                        gapComposer2.startReplaceGroup(-1779789079);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1779789078);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault3, function13, adaptiveStackScope.horizontalWeight(companion2, 1.0f), false, gapComposer2, 0, 8);
                                        gapComposer2.end(false);
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((AdaptiveStackScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                                    ActionableButtonDefault actionableButtonDefault4 = actionableButtonCtaGroup2.primary_button;
                                    Function1 function14 = function12;
                                    if (actionableButtonDefault4 == null) {
                                        gapComposer3.startReplaceGroup(14049574);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(14049575);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault4, function14, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), false, gapComposer3, MLKEMEngine.KyberPolyBytes, 8);
                                        gapComposer3.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault5 = actionableButtonCtaGroup2.secondary_button;
                                    if (actionableButtonDefault5 == null) {
                                        gapComposer3.startReplaceGroup(14189446);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(14189447);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault5, function14, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), false, gapComposer3, MLKEMEngine.KyberPolyBytes, 8);
                                        gapComposer3.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault6 = actionableButtonCtaGroup2.tertiary_button;
                                    if (actionableButtonDefault6 == null) {
                                        gapComposer3.startReplaceGroup(14328326);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(14328327);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault6, function14, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), false, gapComposer3, MLKEMEngine.KyberPolyBytes, 8);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 24966, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(838954556);
                Modifier fillMaxWidth2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
                boolean areEqual2 = Intrinsics.areEqual(actionableButtonCtaGroup.show_hairline, Boolean.TRUE);
                if (actionableButtonCtaGroup.disclaimer_text != null) {
                    gapComposer.startReplaceGroup(237942834);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-2057117079, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 11), gapComposer);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(237984312);
                    gapComposer.end(false);
                }
                DimensionKt.ButtonCtaGroup(fillMaxWidth2, areEqual2, null, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(275941775, new Function3() { // from class: com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = i5;
                        ActionableButtonCtaGroup actionableButtonCtaGroup2 = actionableButtonCtaGroup;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        switch (i7) {
                            case 0:
                                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                adaptiveStackScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(adaptiveStackScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 19) != 18)) {
                                    ActionableButtonDefault actionableButtonDefault = actionableButtonCtaGroup2.primary_button;
                                    Function1 function13 = function12;
                                    if (actionableButtonDefault == null) {
                                        gapComposer2.startReplaceGroup(-1780079735);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1780079734);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault, function13, adaptiveStackScope.horizontalWeight(companion2, 1.0f), false, gapComposer2, 0, 8);
                                        gapComposer2.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault2 = actionableButtonCtaGroup2.secondary_button;
                                    if (actionableButtonDefault2 == null) {
                                        gapComposer2.startReplaceGroup(-1779933911);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1779933910);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault2, function13, adaptiveStackScope.horizontalWeight(companion2, 1.0f), false, gapComposer2, 0, 8);
                                        gapComposer2.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault3 = actionableButtonCtaGroup2.tertiary_button;
                                    if (actionableButtonDefault3 == null) {
                                        gapComposer2.startReplaceGroup(-1779789079);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1779789078);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault3, function13, adaptiveStackScope.horizontalWeight(companion2, 1.0f), false, gapComposer2, 0, 8);
                                        gapComposer2.end(false);
                                    }
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((AdaptiveStackScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                                    ActionableButtonDefault actionableButtonDefault4 = actionableButtonCtaGroup2.primary_button;
                                    Function1 function14 = function12;
                                    if (actionableButtonDefault4 == null) {
                                        gapComposer3.startReplaceGroup(14049574);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(14049575);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault4, function14, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), false, gapComposer3, MLKEMEngine.KyberPolyBytes, 8);
                                        gapComposer3.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault5 = actionableButtonCtaGroup2.secondary_button;
                                    if (actionableButtonDefault5 == null) {
                                        gapComposer3.startReplaceGroup(14189446);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(14189447);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault5, function14, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), false, gapComposer3, MLKEMEngine.KyberPolyBytes, 8);
                                        gapComposer3.end(false);
                                    }
                                    ActionableButtonDefault actionableButtonDefault6 = actionableButtonCtaGroup2.tertiary_button;
                                    if (actionableButtonDefault6 == null) {
                                        gapComposer3.startReplaceGroup(14328326);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(14328327);
                                        AtmPmdExplainerViewKt.ButtonCta(actionableButtonDefault6, function14, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), false, gapComposer3, MLKEMEngine.KyberPolyBytes, 8);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 24582, 4);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(actionableButtonCtaGroup, function1, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExplainerElement(BenefitExplainerScreen.Element element, Function1 function1, Composer composer, int i) {
        PageHeader pageHeader;
        BetweenSection betweenSection;
        WithinSection withinSection;
        ListUnordered listUnordered;
        SectionHeader sectionHeader;
        ActionableButtonCtaGroup actionableButtonCtaGroup;
        ActionableButtonDefault actionableButtonDefault;
        CellDefault cellDefault;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1292033706);
        int i2 = (gapComposer.changedInstance(element) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element = element.element;
            if (abstractC0086Element != null) {
                BenefitExplainerScreen.Element.AbstractC0086Element.Header header = abstractC0086Element instanceof BenefitExplainerScreen.Element.AbstractC0086Element.Header ? (BenefitExplainerScreen.Element.AbstractC0086Element.Header) abstractC0086Element : null;
                if (header != null) {
                    pageHeader = header.getValue();
                    if (pageHeader == null) {
                        gapComposer.startReplaceGroup(398848495);
                        BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element2 = element.element;
                        abstractC0086Element2.getClass();
                        BenefitExplainerScreen.Element.AbstractC0086Element.Header header2 = abstractC0086Element2 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.Header ? (BenefitExplainerScreen.Element.AbstractC0086Element.Header) abstractC0086Element2 : null;
                        PageHeader value = header2 != null ? header2.getValue() : null;
                        value.getClass();
                        boolean z = (i2 & 112) == 32;
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (z || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new SsnViewKt$$ExternalSyntheticLambda12(20, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        SwitchViewKt.PageHeaderProtoBinding(value, (Function2) rememberedValue, null, null, gapComposer, 0, 12);
                        gapComposer.end(false);
                    } else {
                        BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element3 = element.element;
                        if (abstractC0086Element3 != null) {
                            BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection betweenSection2 = abstractC0086Element3 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection ? (BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) abstractC0086Element3 : null;
                            if (betweenSection2 != null) {
                                betweenSection = betweenSection2.getValue();
                                if (betweenSection == null) {
                                    gapComposer.startReplaceGroup(398854435);
                                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element4 = element.element;
                                    abstractC0086Element4.getClass();
                                    BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection betweenSection3 = abstractC0086Element4 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection ? (BenefitExplainerScreen.Element.AbstractC0086Element.BetweenSection) abstractC0086Element4 : null;
                                    BetweenSection value2 = betweenSection3 != null ? betweenSection3.getValue() : null;
                                    value2.getClass();
                                    SpacerBetweenSection(value2, gapComposer, 0);
                                    gapComposer.end(false);
                                } else {
                                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element5 = element.element;
                                    if (abstractC0086Element5 != null) {
                                        BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection withinSection2 = abstractC0086Element5 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection ? (BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) abstractC0086Element5 : null;
                                        if (withinSection2 != null) {
                                            withinSection = withinSection2.getValue();
                                            if (withinSection == null) {
                                                gapComposer.startReplaceGroup(398857985);
                                                BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element6 = element.element;
                                                abstractC0086Element6.getClass();
                                                BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection withinSection3 = abstractC0086Element6 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection ? (BenefitExplainerScreen.Element.AbstractC0086Element.WithinSection) abstractC0086Element6 : null;
                                                WithinSection value3 = withinSection3 != null ? withinSection3.getValue() : null;
                                                value3.getClass();
                                                SpacerWithinSection(value3, gapComposer, 0);
                                                gapComposer.end(false);
                                            } else {
                                                BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element7 = element.element;
                                                if (abstractC0086Element7 != null) {
                                                    BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered listUnordered2 = abstractC0086Element7 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered ? (BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) abstractC0086Element7 : null;
                                                    if (listUnordered2 != null) {
                                                        listUnordered = listUnordered2.getValue();
                                                        if (listUnordered == null) {
                                                            gapComposer.startReplaceGroup(398861476);
                                                            BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element8 = element.element;
                                                            abstractC0086Element8.getClass();
                                                            BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered listUnordered3 = abstractC0086Element8 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered ? (BenefitExplainerScreen.Element.AbstractC0086Element.ListUnordered) abstractC0086Element8 : null;
                                                            ListUnordered value4 = listUnordered3 != null ? listUnordered3.getValue() : null;
                                                            value4.getClass();
                                                            ListUnordered(value4, function1, gapComposer, i2 & 112);
                                                            gapComposer.end(false);
                                                        } else {
                                                            BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element9 = element.element;
                                                            if (abstractC0086Element9 != null) {
                                                                BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader sectionHeader2 = abstractC0086Element9 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader ? (BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) abstractC0086Element9 : null;
                                                                if (sectionHeader2 != null) {
                                                                    sectionHeader = sectionHeader2.getValue();
                                                                    if (sectionHeader == null) {
                                                                        gapComposer.startReplaceGroup(398865085);
                                                                        BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element10 = element.element;
                                                                        abstractC0086Element10.getClass();
                                                                        BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader sectionHeader3 = abstractC0086Element10 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader ? (BenefitExplainerScreen.Element.AbstractC0086Element.SectionHeader) abstractC0086Element10 : null;
                                                                        SectionHeader value5 = sectionHeader3 != null ? sectionHeader3.getValue() : null;
                                                                        value5.getClass();
                                                                        LocalizedString localizedString = value5.title_text;
                                                                        localizedString.getClass();
                                                                        ViewfinderDefaults.SectionHeader(StringsKt.translated(localizedString), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                                                                        gapComposer = gapComposer;
                                                                        gapComposer.end(false);
                                                                    } else {
                                                                        BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element11 = element.element;
                                                                        if (abstractC0086Element11 != null) {
                                                                            BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup buttonCtaGroup = abstractC0086Element11 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup ? (BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) abstractC0086Element11 : null;
                                                                            if (buttonCtaGroup != null) {
                                                                                actionableButtonCtaGroup = buttonCtaGroup.getValue();
                                                                                if (actionableButtonCtaGroup == null) {
                                                                                    gapComposer.startReplaceGroup(398869505);
                                                                                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element12 = element.element;
                                                                                    abstractC0086Element12.getClass();
                                                                                    BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup buttonCtaGroup2 = abstractC0086Element12 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup ? (BenefitExplainerScreen.Element.AbstractC0086Element.ButtonCtaGroup) abstractC0086Element12 : null;
                                                                                    ActionableButtonCtaGroup value6 = buttonCtaGroup2 != null ? buttonCtaGroup2.getValue() : null;
                                                                                    value6.getClass();
                                                                                    CtaGroup(value6, function1, gapComposer, i2 & 112);
                                                                                    gapComposer.end(false);
                                                                                } else {
                                                                                    BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element13 = element.element;
                                                                                    if (abstractC0086Element13 != null) {
                                                                                        BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton actionableButton = abstractC0086Element13 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton ? (BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) abstractC0086Element13 : null;
                                                                                        if (actionableButton != null) {
                                                                                            actionableButtonDefault = actionableButton.getValue();
                                                                                            if (actionableButtonDefault == null) {
                                                                                                gapComposer.startReplaceGroup(398873098);
                                                                                                BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element14 = element.element;
                                                                                                abstractC0086Element14.getClass();
                                                                                                BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton actionableButton2 = abstractC0086Element14 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton ? (BenefitExplainerScreen.Element.AbstractC0086Element.ActionableButton) abstractC0086Element14 : null;
                                                                                                ActionableButtonDefault value7 = actionableButton2 != null ? actionableButton2.getValue() : null;
                                                                                                value7.getClass();
                                                                                                ActionableButton(value7, function1, gapComposer, i2 & 112);
                                                                                                gapComposer.end(false);
                                                                                            } else {
                                                                                                BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element15 = element.element;
                                                                                                if (abstractC0086Element15 != null) {
                                                                                                    BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault cellDefault2 = abstractC0086Element15 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault ? (BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault) abstractC0086Element15 : null;
                                                                                                    if (cellDefault2 != null) {
                                                                                                        cellDefault = cellDefault2.getValue();
                                                                                                        if (cellDefault != null) {
                                                                                                            gapComposer.startReplaceGroup(398878481);
                                                                                                            gapComposer.end(false);
                                                                                                            OptionalProvider$$ExternalSyntheticLambda0.m((Object) element, (Object) " is not supported on ExplainerView");
                                                                                                            return;
                                                                                                        }
                                                                                                        gapComposer.startReplaceGroup(398876599);
                                                                                                        BenefitExplainerScreen.Element.AbstractC0086Element abstractC0086Element16 = element.element;
                                                                                                        abstractC0086Element16.getClass();
                                                                                                        BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault cellDefault3 = abstractC0086Element16 instanceof BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault ? (BenefitExplainerScreen.Element.AbstractC0086Element.CellDefault) abstractC0086Element16 : null;
                                                                                                        CellDefault value8 = cellDefault3 != null ? cellDefault3.getValue() : null;
                                                                                                        value8.getClass();
                                                                                                        CellDefault(value8, gapComposer, 0);
                                                                                                        gapComposer.end(false);
                                                                                                    }
                                                                                                }
                                                                                                cellDefault = null;
                                                                                                if (cellDefault != null) {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    actionableButtonDefault = null;
                                                                                    if (actionableButtonDefault == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        actionableButtonCtaGroup = null;
                                                                        if (actionableButtonCtaGroup == null) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            sectionHeader = null;
                                                            if (sectionHeader == null) {
                                                            }
                                                        }
                                                    }
                                                }
                                                listUnordered = null;
                                                if (listUnordered == null) {
                                                }
                                            }
                                        }
                                    }
                                    withinSection = null;
                                    if (withinSection == null) {
                                    }
                                }
                            }
                        }
                        betweenSection = null;
                        if (betweenSection == null) {
                        }
                    }
                }
            }
            pageHeader = null;
            if (pageHeader == null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(element, function1, i, 11);
        }
    }

    public static final void ListUnordered(ListUnordered listUnordered, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1858195462);
        int i2 = (gapComposer.changedInstance(listUnordered) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-759678176, new CheckDepositAmountKt$$ExternalSyntheticLambda6(29, (Object) listUnordered, (Object) function1), gapComposer), gapComposer, 196608, 31);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(listUnordered, function1, i, 12);
        }
    }

    public static final void SpacerBetweenSection(BetweenSection betweenSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1083161487);
        int i2 = (gapComposer.changedInstance(betweenSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BetweenSection.Variant variant = betweenSection.variant;
            int i3 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
            if (i3 == 1) {
                gapComposer.startReplaceGroup(-1536100372);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 == 2) {
                gapComposer.startReplaceGroup(-1536098995);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 != 3) {
                gapComposer.startReplaceGroup(-1536095576);
                gapComposer.end(false);
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) betweenSection.variant, "Between Section variant ");
                return;
            } else {
                gapComposer.startReplaceGroup(-1536097226);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda22(betweenSection, i, 2);
        }
    }

    public static final void SpacerWithinSection(WithinSection withinSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(269740917);
        int i2 = (gapComposer.changedInstance(withinSection) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            WithinSection.Variant variant = withinSection.variant;
            int i3 = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$1[variant.ordinal()];
            if (i3 == 1) {
                gapComposer.startReplaceGroup(1522986448);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (i3 != 2) {
                gapComposer.startReplaceGroup(1522989067);
                gapComposer.end(false);
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m((Object) withinSection.variant, "Within Section variant ");
                return;
            } else {
                gapComposer.startReplaceGroup(1522987759);
                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsLeafletViewKt$$ExternalSyntheticLambda23(withinSection, i, 2);
        }
    }
}
