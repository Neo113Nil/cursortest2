package androidx.compose.ui.node;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinInstrumentRecommendationViewModel;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.transfer.BitcoinInstrumentRecommendationViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModelV2;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class DistanceAndFlags {
    public static final void BitcoinInstrumentRecommendationView(BitcoinInstrumentRecommendationViewModel bitcoinInstrumentRecommendationViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        bitcoinInstrumentRecommendationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(830251596);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinInstrumentRecommendationViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1617751265, new SetPinViewKt$$ExternalSyntheticLambda2(i3, (Object) bitcoinInstrumentRecommendationViewModel, function1), gapComposer), gapComposer, 3072, 7);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AtmPickerAmountBlockerKt$$ExternalSyntheticLambda3(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(bitcoinInstrumentRecommendationViewModel, function1, i, 13);
        }
    }

    public static final void Content(Modifier modifier, BitcoinInstrumentRecommendationViewModel bitcoinInstrumentRecommendationViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        BitcoinInstrumentRecommendationViewModel bitcoinInstrumentRecommendationViewModel2 = bitcoinInstrumentRecommendationViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1116583983);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(bitcoinInstrumentRecommendationViewModel2) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long j = Strings.getColors(gapComposer).semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier, j, rectangleShapeKt$RectangleShape$1), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 56.0f), RoundedCornerShapeKt.CircleShape), Strings.getColors(gapComposer).semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            gapComposer = gapComposer;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Trace.m1191Iconww6aTOc(Icons.BankLinked24, (String) null, SpacerKt.m298padding3ABfNKs(companion, 16.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 438, 0);
            gapComposer.end(true);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, bitcoinInstrumentRecommendationViewModel.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Strings.getSizes(gapComposer).getClass();
            bitcoinInstrumentRecommendationViewModel2 = bitcoinInstrumentRecommendationViewModel;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, bitcoinInstrumentRecommendationViewModel2.body, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1147098295, new BitcoinInstrumentRecommendationViewKt$$ExternalSyntheticLambda4(function12, bitcoinInstrumentRecommendationViewModel2), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0((Object) modifier, (Object) bitcoinInstrumentRecommendationViewModel2, function12, i, 24);
        }
    }

    public static final void OffersTimelineSheetV2(OffersTimelineViewModelV2 offersTimelineViewModelV2, Function1 function1, Composer composer, int i) {
        int i2;
        offersTimelineViewModelV2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1349593577);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(offersTimelineViewModelV2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1485296596, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(24, function1, offersTimelineViewModelV2), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(offersTimelineViewModelV2, function1, i, 13);
        }
    }

    public static final void OffersTimelineV2(OffersTimelineViewModelV2 offersTimelineViewModelV2, Modifier modifier, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        offersTimelineViewModelV2.getClass();
        modifier.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1274823019);
        int i2 = i | (gapComposer2.changedInstance(offersTimelineViewModelV2) ? 4 : 2) | (gapComposer2.changed(modifier) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(NestedScrollModifierKt.nestedScroll(SizeKt.fillMaxWidth(modifier, 1.0f), zzagn.rememberNestedScrollInteropConnection(gapComposer2), null), ImageKt.rememberScrollState(gapComposer2), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
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
            String str = offersTimelineViewModelV2.title;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal2)).header.m996getColor0d7_KjU(), (Composer) gapComposer2, m300paddingVpY3zN4$default, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal2)).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            boolean changedInstance = gapComposer2.changedInstance(offersTimelineViewModelV2);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Overlay$$ExternalSyntheticLambda0(offersTimelineViewModelV2, 29);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            ListOrderedKt.ListOrderedStandard(0, 1, gapComposer2, (Modifier) null, (Function1) rememberedValue);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda0(9, function12);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                function12 = function1;
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, m299paddingVpY3zN4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(202622576, new P2PListViewKt$$ExternalSyntheticLambda12(offersTimelineViewModelV2, 17), gapComposer2), gapComposer2, 1573248, 56);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(offersTimelineViewModelV2, modifier, function12, i, 8);
        }
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m865compareTo9YPOF3E(long j, long j2) {
        boolean m868isInLayerimpl = m868isInLayerimpl(j);
        if (m868isInLayerimpl != m868isInLayerimpl(j2)) {
            return m868isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m866getDistanceimpl(j), m866getDistanceimpl(j2)) >= RecyclerView.DECELERATION_RATE && m867isInExpandedBoundsimpl(j) != m867isInExpandedBoundsimpl(j2)) ? m867isInExpandedBoundsimpl(j) ? -1 : 1 : (int) Math.signum(m866getDistanceimpl(j) - m866getDistanceimpl(j2));
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m866getDistanceimpl(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m867isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m868isInLayerimpl(long j) {
        return (j & 1) != 0;
    }
}
