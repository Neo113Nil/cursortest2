package com.squareup.cash.deposits.physical.view.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.internal.ProgressBarKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.db2.SyncDetailsQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.deposits.physical.view.PhysicalDepositViewFactory$$ExternalSyntheticLambda8;
import com.squareup.cash.deposits.physical.viewmodels.onboarding.PaperMoneyDepositOnboardingViewModel;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.upsell.views.NullStateCarouselViewKt$NullStateCarouselContent$1$1;
import com.squareup.protos.franklin.api.PaperCashDepositBlocker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositOnboardingViewKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.values().length];
            try {
                iArr[PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.FIND_A_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.SHOW_THE_BARCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.GIVE_CASH_TO_CASHIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaperCashDepositBlocker.TutorialCarousel.Page.Illustration.SWIPE_TO_DEPOSIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void OnboardingPage(PaperCashDepositBlocker.TutorialCarousel.Page page, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Illustrations illustrations;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2069880060);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(page) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(modifier2, 250.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m277height3ABfNKs);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            PaperCashDepositBlocker.TutorialCarousel.Page.Illustration illustration = page.illustration;
            illustration.getClass();
            int i3 = WhenMappings.$EnumSwitchMapping$0[illustration.ordinal()];
            if (i3 == 1) {
                illustrations = Illustrations.MoneyEye;
            } else if (i3 == 2) {
                illustrations = Illustrations.Scanner;
            } else if (i3 == 3) {
                illustrations = Illustrations.HandMoney;
            } else {
                if (i3 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                illustrations = Illustrations.CardReaderOasis;
            }
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(modifier2, illustrations.width, illustrations.height);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            AsyncImageKt.m1438AsyncImage10Xjiaw(colors.isLight ? illustrations.lightUrl : illustrations.darkUrl, null, m287sizeVpY3zN4, null, null, null, gapComposer, 48, 2040);
            gapComposer.end(true);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Updater.CompositionLocalProvider(ArcadeThemeKt.LocalTextAlign.defaultProvidedValue$runtime(new TextAlign(3)), Expect_jvmKt.rememberComposableLambda(-1943502286, new PaperMoneyDepositOnboardingViewKt$$ExternalSyntheticLambda10(page, 0), gapComposer), gapComposer, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(page, modifier2, i, 15);
        }
    }

    public static final void PagerDots(int i, int i2, int i3, Composer composer, Modifier modifier) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1080748838);
        int i4 = (gapComposer.changed(i) ? 4 : 2) | i3 | (gapComposer.changed(i2) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            String stringResource = Room.stringResource(R.string.pmd_onboarding_page_indicator_description, new Object[]{Integer.valueOf(i2 + 1), Integer.valueOf(i)}, gapComposer);
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(modifier, 20.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SyncDetailsQueries$$ExternalSyntheticLambda2(stringResource, 23);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m298padding3ABfNKs, false, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(10.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1634288083);
            for (int i5 = 0; i5 < i; i5++) {
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f);
                if (i2 == i5) {
                    gapComposer.startReplaceGroup(966959747);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.icon.prominent;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(966961797);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.icon.extraSubtle;
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, j, RoundedCornerShapeKt.CircleShape), gapComposer, 0);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ProgressBarKt$$ExternalSyntheticLambda0(i, i2, modifier, i3, 7);
        }
    }

    public static final void PaperMoneyDepositOnboardingView(PaperMoneyDepositOnboardingViewModel paperMoneyDepositOnboardingViewModel, Function1 function1, Composer composer, int i) {
        paperMoneyDepositOnboardingViewModel.getClass();
        int i2 = paperMoneyDepositOnboardingViewModel.page;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(655728552);
        int i3 = (gapComposer.changedInstance(paperMoneyDepositOnboardingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(paperMoneyDepositOnboardingViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ArcadeModal$$ExternalSyntheticLambda2(paperMoneyDepositOnboardingViewModel, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(i2, (Function0) rememberedValue, gapComposer, 0, 2);
            Integer valueOf = Integer.valueOf(i2);
            boolean changed = gapComposer.changed(rememberPagerState) | gapComposer.changedInstance(paperMoneyDepositOnboardingViewModel);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1(rememberPagerState, paperMoneyDepositOnboardingViewModel, (Continuation) null, 24);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            boolean changed2 = gapComposer.changed(rememberPagerState) | ((i3 & 112) == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new NullStateCarouselViewKt$NullStateCarouselContent$1$1(rememberPagerState, function1, null, 1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, rememberPagerState, (Function2) rememberedValue3);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(542584435, new EarningsHomeKt$$ExternalSyntheticLambda2(9, function1, rememberPagerState, paperMoneyDepositOnboardingViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhysicalDepositViewFactory$$ExternalSyntheticLambda8(paperMoneyDepositOnboardingViewModel, function1, i);
        }
    }
}
