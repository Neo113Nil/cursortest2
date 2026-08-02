package androidx.compose.ui.graphics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ShaderKt {
    public static final void DependentBitcoinDisabledWidget(DependentBitcoinDisabledViewModel dependentBitcoinDisabledViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        DependentBitcoinDisabledViewModel dependentBitcoinDisabledViewModel2;
        GapComposer gapComposer;
        Modifier modifier2;
        Function1 function12 = function1;
        dependentBitcoinDisabledViewModel.getClass();
        function12.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(341183005);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(dependentBitcoinDisabledViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function12) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 20.0f, RecyclerView.DECELERATION_RATE, 20.0f, 20.0f, 2);
            long j = Strings.getColors(gapComposer2).semantic.background.standard;
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m302paddingqDBjuR0$default, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            Strings.getSizes(gapComposer2).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Strings.getSizes(gapComposer2).getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 16.0f, 16.0f, 32.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Icons icons = Icons.InformationFill32;
            Strings.getSizes(gapComposer2).getClass();
            Trace.m1191Iconww6aTOc(icons, (String) null, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 0L, gapComposer2, 54, 8);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, dependentBitcoinDisabledViewModel.title, (Map) null, (Function1) null, false);
            gapComposer2.end(true);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(SpacerKt.m300paddingVpY3zN4$default(m277height3ABfNKs, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer2).base.grey85, ColorKt.RectangleShape), gapComposer2, 0);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment.Companion.CenterHorizontally);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                function12 = function1;
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(1, function12);
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                function12 = function1;
            }
            dependentBitcoinDisabledViewModel2 = dependentBitcoinDisabledViewModel;
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, horizontalAlignElement, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1405909598, new BankingDialogKt$$ExternalSyntheticLambda8(dependentBitcoinDisabledViewModel2, 25), gapComposer2), gapComposer2, 1572864, 60);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            dependentBitcoinDisabledViewModel2 = dependentBitcoinDisabledViewModel;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier2, (Object) dependentBitcoinDisabledViewModel2, function12, i, 3);
        }
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final android.graphics.LinearGradient m712LinearGradientShaderVjE6UOU(long j, long j2, List list, List list2) {
        AndroidShader_androidKt.validateColorStops(list, list2);
        return new android.graphics.LinearGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)), AndroidShader_androidKt.makeTransparentColors(list), list2 != null ? CollectionsKt.toFloatArray(list2) : null, AndroidTileMode_androidKt.m668toAndroidTileMode0vamqd0(0));
    }

    public static final void OffersCategoriesSection(Modifier modifier, OffersHomeListItemViewModel.CategoryTilesSectionViewModel categoryTilesSectionViewModel, LazyGridState lazyGridState, Function1 function1, Composer composer, int i) {
        LazyGridState lazyGridState2;
        int i2;
        LazyGridState rememberLazyGridState;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1534540639);
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(categoryTilesSectionViewModel) ? 32 : 16) | 128 | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                i2 = i3 & (-897);
                rememberLazyGridState = LazyGridStateKt.rememberLazyGridState(0, 3, gapComposer);
            } else {
                gapComposer.skipToGroupEnd();
                i2 = i3 & (-897);
                rememberLazyGridState = lazyGridState;
            }
            gapComposer.endDefaults();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
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
            String str = categoryTilesSectionViewModel.header.title.text;
            if (str == null) {
                str = "";
            }
            int i4 = i2;
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier testTag = TestTagKt.testTag(SizeKt.m279heightInVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 2048.0f, 1), "CategoryTiles");
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            boolean changed = ((i4 & 112) == 32) | gapComposer.changed(rememberLazyGridState) | ((i4 & 7168) == 2048);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(16, categoryTilesSectionViewModel, rememberLazyGridState, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyGridState lazyGridState3 = rememberLazyGridState;
            LazyGridDslKt.LazyVerticalGrid(fixed, testTag, lazyGridState3, null, arrangement$SpacedAligned2, arrangement$SpacedAligned, null, false, null, (Function1) rememberedValue, gapComposer, 100663296, 664);
            gapComposer = gapComposer;
            gapComposer.end(true);
            lazyGridState2 = lazyGridState3;
        } else {
            gapComposer.skipToGroupEnd();
            lazyGridState2 = lazyGridState;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier, categoryTilesSectionViewModel, lazyGridState2, function1, i, 4);
        }
    }
}
