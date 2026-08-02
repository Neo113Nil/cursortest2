package com.squareup.cash.family.familyhub.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
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
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.earnings.views.home.EarningsHomeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyMultiplePendingRequestsRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestRowModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsSection;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda5;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class FamilyHomeViewKt {
    public static final void FamilyHome(FamilyHomeViewModel familyHomeViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        familyHomeViewModel.getClass();
        function1.getClass();
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(549971781);
        int i2 = (gapComposer.changedInstance(familyHomeViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            FamilyPendingRequestsSection familyPendingRequestsSection = familyHomeViewModel.pendingRequestsSection;
            if ((familyPendingRequestsSection instanceof FamilyPendingRequestsSection.OnePendingRequest) && (((FamilyPendingRequestsSection.OnePendingRequest) familyPendingRequestsSection).row instanceof FamilyPendingRequestRowModel.Loading)) {
                familyPendingRequestsSection = null;
            }
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(modifier), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(401402447, new FamilyHomeViewKt$$ExternalSyntheticLambda3(familyHomeViewModel, function1, i3), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(familyHomeViewModel) | ((i2 & 112) == 32) | gapComposer.changedInstance(familyPendingRequestsSection);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda3(6, familyPendingRequestsSection, familyHomeViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScreenScaffoldKt.ScreenScaffoldLazy(m177backgroundbw27NRU, rememberLazyListState, null, rememberComposableLambda, null, (Function1) rememberedValue, gapComposer, 3072, 20);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarningsHomeKt$$ExternalSyntheticLambda2(modifier, (Object) familyHomeViewModel, function1, i, 26);
        }
    }

    /* renamed from: FamilyHomeHeader-6a0pyJM, reason: not valid java name */
    public static final void m3535FamilyHomeHeader6a0pyJM(FamilyHomeViewModel familyHomeViewModel, Function1 function1, float f, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        Modifier.Companion companion;
        float f2 = f;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-291748926);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(familyHomeViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(f2) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(companion2, 32.0f, gapComposer2, companion2, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Modifier then = modifier.then(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true));
            String str = familyHomeViewModel.toolbarTitle;
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).pageTitle;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                z = false;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                z = false;
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            boolean z2 = z;
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, then, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            String str2 = familyHomeViewModel.membersSection.headerButtonText;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1001227326);
                gapComposer.end(z2);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-1001227325);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                companion = companion2;
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                boolean z3 = (i2 & 112) == 32 ? true : z2;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-505245914, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str2, 9), gapComposer), gapComposer, 1572864, 62);
                gapComposer = gapComposer;
                gapComposer.end(z2);
            }
            f2 = f;
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, true, companion, f2, gapComposer);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda5(familyHomeViewModel, function1, f2, modifier, i);
        }
    }

    public static final void FamilyHomeView(RealImageLoader realImageLoader, FamilyHomeViewModel familyHomeViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(203410835);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(realImageLoader) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(familyHomeViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (familyHomeViewModel == null) {
            gapComposer.startReplaceGroup(-386530445);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-386530444);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-621119334, new EarningsHomeKt$$ExternalSyntheticLambda2(realImageLoader, familyHomeViewModel, function1, 25), gapComposer), gapComposer, 3072, 7);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda1(realImageLoader, familyHomeViewModel, function1, i, 0);
        }
    }

    public static final void PendingRequestsSection(FamilyPendingRequestsSection familyPendingRequestsSection, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-617234362);
        int i2 = (gapComposer2.changedInstance(familyPendingRequestsSection) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = familyPendingRequestsSection instanceof FamilyPendingRequestsSection.OnePendingRequest;
            Object obj = Composer.Companion.Empty;
            if (z) {
                gapComposer2.startReplaceGroup(-1273689763);
                FamilyPendingRequestRowModel familyPendingRequestRowModel = ((FamilyPendingRequestsSection.OnePendingRequest) familyPendingRequestsSection).row;
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer2.changedInstance(familyPendingRequestRowModel);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == obj) {
                    rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda17(familyPendingRequestRowModel, function1, 0);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                AllowanceViewKt.FamilyPendingRequestRow(familyPendingRequestRowModel, null, (Function0) rememberedValue, gapComposer2, 0, 2);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            } else if (familyPendingRequestsSection instanceof FamilyPendingRequestsSection.MultiplePendingRequests) {
                gapComposer2.startReplaceGroup(-456711411);
                FamilyMultiplePendingRequestsRowModel familyMultiplePendingRequestsRowModel = ((FamilyPendingRequestsSection.MultiplePendingRequests) familyPendingRequestsSection).row;
                boolean changedInstance2 = ((i2 & 112) == 32) | gapComposer2.changedInstance(familyPendingRequestsSection);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj) {
                    rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda4(3, function1, familyPendingRequestsSection);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                AllowanceViewKt.FamilyMultiplePendingRequestsRow(familyMultiplePendingRequestsRowModel, (Function0) rememberedValue2, gapComposer2, 0);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            } else {
                if (!(familyPendingRequestsSection instanceof FamilyPendingRequestsSection.OnePendingActivity)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, -456730014, false);
                }
                gapComposer2.startReplaceGroup(-1272955063);
                UiCallbackModel uiCallbackModel = ((FamilyPendingRequestsSection.OnePendingActivity) familyPendingRequestsSection).activityItemUiCallbackModel;
                ActivityItemViewKt.m2972ActivityItemViewww6aTOc((ActivityItemViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, null, 0L, gapComposer2, 0, 12);
                GapComposer gapComposer3 = gapComposer2;
                gapComposer3.end(false);
                gapComposer = gapComposer3;
            }
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda13(familyPendingRequestsSection, function1, i, 1);
        }
    }

    public static final void PendingRequestsSectionContent(FamilyPendingRequestsSection familyPendingRequestsSection, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-290536593);
        int i2 = (gapComposer.changedInstance(familyPendingRequestsSection) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            PendingRequestsSection(familyPendingRequestsSection, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyHomeViewKt$$ExternalSyntheticLambda13(familyPendingRequestsSection, function1, i, 0);
        }
    }
}
