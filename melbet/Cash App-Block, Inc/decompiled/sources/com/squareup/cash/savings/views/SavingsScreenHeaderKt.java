package com.squareup.cash.savings.views;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FloatTweenSpec;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.ProgressMeter$CompletionBehavior;
import com.squareup.cash.common.composeui.ProgressMeter$ZeroBehavior;
import com.squareup.cash.common.composeui.SegmentedCircle$ContentLayoutPolicy;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.BetweenSection;

/* loaded from: classes7.dex */
public abstract class SavingsScreenHeaderKt {

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BetweenSection.Variant.values().length];
            try {
                iArr[BetweenSection.Variant.X_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BetweenSection.Variant.X_LARGE_BELOW_CELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BalanceHeader(SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, Modifier modifier, Shaker shaker, Function1 function1, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1348239486);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(shaker) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                z3 = i4 != 0 ? false : z2;
                int i5 = z3 ? 3 : 5;
                String str = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.additionalBody;
                if (str == null) {
                    gapComposer.startReplaceGroup(-1129724465);
                    gapComposer.end(false);
                    rememberComposableLambda = null;
                } else {
                    gapComposer.startReplaceGroup(-1129724464);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1682294612, new InfoSectionKt$$ExternalSyntheticLambda7(str, 20), gapComposer);
                    gapComposer.end(false);
                }
                zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(-1604506780, new SavingsScreenHeaderKt$$ExternalSyntheticLambda13(shaker, savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, 0), gapComposer), modifier, i5, Expect_jvmKt.rememberComposableLambda(1773556929, new SheetKt$$ExternalSyntheticLambda6(savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, 4), gapComposer), (Function3) null, Expect_jvmKt.rememberComposableLambda(-679457705, new ShareSheetViewKt$$ExternalSyntheticLambda1(17, (Object) savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, (Object) function1), gapComposer), rememberComposableLambda, gapComposer, (i3 & 112) | 199686, 16);
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance, modifier, shaker, function1, z3, i, i2, 12);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void BetweenSection(SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection betweenSection, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        betweenSection.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1744470370);
        int i4 = (gapComposer.changedInstance(betweenSection) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (gapComposer.changed(modifier) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            int i6 = WhenMappings.$EnumSwitchMapping$0[betweenSection.variant.ordinal()];
            if (i6 == 1) {
                gapComposer.startReplaceGroup(1398784902);
                DBUtil.SpacerBetweenSectionXLarge((i3 >> 3) & 14, 0, gapComposer, modifier);
                gapComposer.end(false);
            } else if (i6 != 2) {
                gapComposer.startReplaceGroup(1398789477);
                DBUtil.SpacerBetweenSectionLarge((i3 >> 3) & 14, 0, gapComposer, modifier);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1398787631);
                DBUtil.SpacerBetweenSectionXLargeBelowCell((i3 >> 3) & 14, 0, gapComposer, modifier);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(betweenSection, modifier, i, i2);
        }
    }

    public static final void GoalFooter(SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer footer, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1223790492);
        int i2 = i | (gapComposer.changedInstance(footer) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = footer instanceof SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalAmountRemaining;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(-758368649);
                boolean changedInstance = gapComposer.changedInstance(footer);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new RealSandboxer$$ExternalSyntheticLambda0(footer, 11);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier2 = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-758359388);
                gapComposer.end(false);
                modifier2 = companion;
            }
            Modifier then = modifier.then(modifier2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            if (footer instanceof SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalMet) {
                gapComposer.startReplaceGroup(-1017615109);
                boolean z2 = ((SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalMet) footer).button.enabled;
                boolean changedInstance2 = ((i2 & 112) == 32) | gapComposer.changedInstance(footer);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ShareSheetViewKt$$ExternalSyntheticLambda5(13, (Object) footer, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SizeKt.ButtonCompact((Function0) rememberedValue2, null, null, false, z2, null, Expect_jvmKt.rememberComposableLambda(1338148482, new ButtonGroupKt$$ExternalSyntheticLambda11(footer, 16), gapComposer), gapComposer, 1572864, 46);
                gapComposer.end(false);
            } else if (z) {
                gapComposer.startReplaceGroup(-1017358677);
                SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalAmountRemaining goalAmountRemaining = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.Footer.GoalAmountRemaining) footer;
                SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.Amount amount = goalAmountRemaining.amount;
                VisibleKt.m3482AnimatedAmountTextJDMA8c0(null, Strings.getTypography(gapComposer).header, Strings.getColors(gapComposer).semantic.text.standard, 3, new AnimatedAmountTextView.Amount(amount.label, amount.rawValue), null, false, 0L, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE);
                String str = goalAmountRemaining.subtitle;
                TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
                long j = Strings.getColors(gapComposer).semantic.text.subtle;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new CelebrationKt$$ExternalSyntheticLambda1(28);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue3), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1016844852);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier, (Object) footer, function1, i, 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    public static final void GoalHeader(SavingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader, Modifier modifier, Shaker shaker, Function1 function1, Function1 function12, Composer composer, int i) {
        GapComposer gapComposer;
        long j;
        ?? r11;
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(171213922);
        int i2 = i | (gapComposer2.changedInstance(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changedInstance(shaker) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024) | (gapComposer2.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            float f = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.progress;
            String str = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.pageHeader;
            Float valueOf = Float.valueOf(f);
            int i3 = 57344 & i2;
            boolean z = i3 == 16384;
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z || rememberedValue == obj) {
                rememberedValue = new TaxAuthorizationView$Content$1$1(function12, (Continuation) null, 10);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue);
            SavingsScreenViewEvent savingsScreenViewEvent = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.onRenderedEvent;
            boolean changedInstance = ((i2 & 7168) == 2048) | gapComposer2.changedInstance(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                rememberedValue2 = new RingtoneView.AnonymousClass1(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader, function1, null, 28);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, savingsScreenViewEvent, (Function2) rememberedValue2);
            float f2 = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.progress;
            FloatTweenSpec floatTweenSpec = new FloatTweenSpec(500, (Easing) null, 6);
            boolean z2 = i3 == 16384;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue3 == obj) {
                rememberedValue3 = new InfoSectionKt$$ExternalSyntheticLambda1(26, function12);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, floatTweenSpec, null, (Function1) rememberedValue3, gapComposer2, 0, 12);
            long j2 = Strings.getColors(gapComposer2).data.portion.full;
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
            if (str == null || StringsKt.isBlank(str)) {
                j = j2;
                r11 = 0;
                gapComposer2.startReplaceGroup(991477814);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(991425920);
                j = j2;
                Countries.PageHeader(str, (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
                r11 = 0;
                gapComposer2.end(false);
            }
            SavingsScreenViewModel.Content.SavingsScreenElement.BetweenSection betweenSection = savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.pageHeaderBottomSpacing;
            if (betweenSection == null) {
                gapComposer2.startReplaceGroup(991517307);
            } else {
                gapComposer2.startReplaceGroup(991517308);
                BetweenSection(betweenSection, null, gapComposer2, r11, 2);
            }
            gapComposer2.end(r11);
            float floatValue = ((Number) animateFloatAsState.getValue()).floatValue();
            long j3 = Strings.getColors(gapComposer2).semantic.border.subtle;
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            m3739GoalProgressqi6gXK8(floatValue, j, j3, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader.progressAccessibilityLabel, Expect_jvmKt.rememberComposableLambda(-1452252886, new SheetKt$$ExternalSyntheticLambda5(10, savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader, shaker, function1), gapComposer2), gapComposer2, 196608);
            GapComposer gapComposer3 = gapComposer2;
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(savingsScreenViewModel$Content$SavingsScreenElement$Header$GoalHeader, modifier, shaker, function1, function12, i);
        }
    }

    /* renamed from: GoalProgress-qi6gXK8, reason: not valid java name */
    public static final void m3739GoalProgressqi6gXK8(float f, long j, long j2, Modifier modifier, String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1032783551);
        int i2 = i | (gapComposer2.changed(f) ? 4 : 2) | (gapComposer2.changed(j) ? 32 : 16) | (gapComposer2.changed(j2) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024) | (gapComposer2.changed(str) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            ProgressMeter$CompletionBehavior progressMeter$CompletionBehavior = ProgressMeter$CompletionBehavior.NONE;
            ProgressMeter$ZeroBehavior progressMeter$ZeroBehavior = ProgressMeter$ZeroBehavior.HIDDEN;
            SegmentedCircle$ContentLayoutPolicy segmentedCircle$ContentLayoutPolicy = SegmentedCircle$ContentLayoutPolicy.INSIDE_EDGE;
            gapComposer = gapComposer2;
            VisibleKt.m3497ProgressMeterUV7SVM(f, j, 8.0f, modifier, j2, 2.0f, 0L, progressMeter$CompletionBehavior, progressMeter$ZeroBehavior, segmentedCircle$ContentLayoutPolicy, segmentedCircle$ContentLayoutPolicy, str, Expect_jvmKt.rememberComposableLambda(-1169377072, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 28), gapComposer2), gapComposer, (i2 & 14) | 918749568 | (i2 & 112) | (i2 & 7168) | ((i2 << 6) & 57344), ((i2 >> 9) & 112) | 390, 64);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SavingsScreenHeaderKt$$ExternalSyntheticLambda18(f, j, j2, modifier, str, composableLambdaImpl, i);
        }
    }

    public static final void IconAndLabel(int i, Composer composer, Modifier modifier, String str, String str2) {
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(70262960);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            if (str == null) {
                gapComposer.startReplaceGroup(-1044801716);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1044801715);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(29);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                VisibleKt.m3489EmojiIconDzVHIIc(str, 44.0f, SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth, (Function1) rememberedValue), null, gapComposer, (i2 & 14) | 48, 8);
                gapComposer.end(false);
            }
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1044634967);
                gapComposer.end(false);
                z = true;
            } else {
                gapComposer.startReplaceGroup(-1044634966);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.subtle;
                z = true;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(str, str2, modifier, i, 7);
        }
    }

    public static final void NoGoalHeader(SavingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader, Modifier modifier, Shaker shaker, Function1 function1, Composer composer, int i) {
        Function1 function12;
        Shaker shaker2;
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1187194065);
        int i2 = (gapComposer.changedInstance(savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(shaker) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changedInstance = gapComposer.changedInstance(savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader) | ((i2 & 7168) == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileCropView.AnonymousClass3(savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader, function1, null, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader, (Function2) rememberedValue);
            BalanceHeader(savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader.balance, modifier, shaker, function1, false, gapComposer, i2 & 8176, 16);
            modifier2 = modifier;
            shaker2 = shaker;
            function12 = function1;
        } else {
            function12 = function1;
            shaker2 = shaker;
            modifier2 = modifier;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(savingsScreenViewModel$Content$SavingsScreenElement$Header$NoGoalHeader, modifier2, shaker2, function12, i);
        }
    }
}
