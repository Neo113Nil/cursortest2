package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda18;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.nearby.backend.NearbyIdentifier;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda10;
import com.stripe.android.core.model.StripeJsonUtils;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public abstract class zzadq {
    public static final void BenefitsComparisonTable(BenefitsComparisonTableViewModel benefitsComparisonTableViewModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1328400421);
        int i3 = i | (gapComposer.changedInstance(benefitsComparisonTableViewModel) ? 4 : 2);
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        } else if (benefitsComparisonTableViewModel instanceof BenefitsComparisonTableViewModel.Loading) {
            gapComposer.startReplaceGroup(-987514273);
            gapComposer.end(false);
            i2 = 1;
        } else {
            if (!(benefitsComparisonTableViewModel instanceof BenefitsComparisonTableViewModel.Loaded)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -987514838, false);
            }
            gapComposer.startReplaceGroup(-548136173);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(Modifier.Companion.$$INSTANCE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            BenefitsComparisonTableViewModel.Loaded loaded = (BenefitsComparisonTableViewModel.Loaded) benefitsComparisonTableViewModel;
            i2 = 1;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).headlineSmall, (TextLineBalancing) null, loaded.title, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            BenefitsComparisonTableContent(loaded, gapComposer, i3 & 14);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BenefitsHomeViewKt$$ExternalSyntheticLambda18(benefitsComparisonTableViewModel, i, i2);
        }
    }

    public static final void BenefitsComparisonTableContent(BenefitsComparisonTableViewModel.Loaded loaded, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-816873740);
        int i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Iterator it = loaded.rows.iterator();
            if (!it.hasNext()) {
                a$$ExternalSyntheticBUOutline0.m();
                return;
            }
            int size = ((BenefitsComparisonTableViewModel.BenefitsComparisonTableRow) it.next()).cells.size();
            while (it.hasNext()) {
                int size2 = ((BenefitsComparisonTableViewModel.BenefitsComparisonTableRow) it.next()).cells.size();
                if (size < size2) {
                    size = size2;
                }
            }
            Updater.CompositionLocalProvider(CompositionLocalsKt.LocalDensity.defaultProvidedValue$runtime(StripeJsonUtils.nonLinearScalingDensity(gapComposer, 0)), Expect_jvmKt.rememberComposableLambda(372867636, new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(size, loaded, 9), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashtagViewKt$$ExternalSyntheticLambda10(loaded, i, 8);
        }
    }

    public static final SnapshotStateMap discoverNearby$default(NearbyIdentifier nearbyIdentifier, RealNearbyManager realNearbyManager, Composer composer) {
        nearbyIdentifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1745669629);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new SnapshotStateMap();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        SnapshotStateMap snapshotStateMap = (SnapshotStateMap) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(realNearbyManager);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new RealMRIFactory$sign$2(snapshotStateMap, realNearbyManager, (Continuation) null, 5);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        boolean changedInstance2 = gapComposer.changedInstance(realNearbyManager) | gapComposer.changedInstance(nearbyIdentifier);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda39(13, realNearbyManager, nearbyIdentifier, snapshotStateMap);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.DisposableEffect(nearbyIdentifier, (Function1) rememberedValue3, gapComposer);
        gapComposer.end(false);
        return snapshotStateMap;
    }

    /* renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m2016rememberPullRefreshStateUuyPYSY(boolean z, Function0 function0, Composer composer, int i) {
        if (Dp.m1036compareTo0680j_4(80.0f, RecyclerView.DECELERATION_RATE) <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("The refresh trigger must be greater than zero!");
            return null;
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(function0, gapComposer);
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
        ref$FloatRef.element = density.mo236toPx0680j_4(80.0f);
        ref$FloatRef2.element = density.mo236toPx0680j_4(56.0f);
        boolean changed = gapComposer.changed(coroutineScope);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == obj) {
            rememberedValue2 = new PullRefreshState(coroutineScope, rememberUpdatedState, ref$FloatRef2.element, ref$FloatRef.element);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        PullRefreshState pullRefreshState = (PullRefreshState) rememberedValue2;
        boolean changedInstance = gapComposer.changedInstance(pullRefreshState) | ((((i & 14) ^ 6) > 4 && gapComposer.changed(z)) || (i & 6) == 4) | gapComposer.changed(ref$FloatRef.element) | gapComposer.changed(ref$FloatRef2.element);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == obj) {
            Object shiftListViewKt$$ExternalSyntheticLambda10 = new ShiftListViewKt$$ExternalSyntheticLambda10(pullRefreshState, z, ref$FloatRef, ref$FloatRef2, 1);
            gapComposer.updateRememberedValue(shiftListViewKt$$ExternalSyntheticLambda10);
            rememberedValue3 = shiftListViewKt$$ExternalSyntheticLambda10;
        }
        Updater.SideEffect((Function0) rememberedValue3, gapComposer);
        return pullRefreshState;
    }
}
