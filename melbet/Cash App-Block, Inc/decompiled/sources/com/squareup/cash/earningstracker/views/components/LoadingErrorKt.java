package com.squareup.cash.earningstracker.views.components;

import android.icu.text.MessageFormat;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountchooser.views.AtmPickerGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.earningstracker.viewmodels.AvatarViewModel;
import com.squareup.cash.earningstracker.viewmodels.CustomerViewModel;
import com.squareup.cash.earningstracker.viewmodels.EarningsTrackerViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.pools.views.PoolErrorViewKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class LoadingErrorKt {
    public static final ComposableLambdaImpl lambda$1467587907 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(20), false, 1467587907);
    public static final ComposableLambdaImpl lambda$475718138 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(21), false, 475718138);
    public static final ComposableLambdaImpl lambda$1054484283 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(22), false, 1054484283);

    /* renamed from: lambda$-683504610, reason: not valid java name */
    public static final ComposableLambdaImpl f400lambda$683504610 = new ComposableLambdaImpl(new AllowanceViewKt$$ExternalSyntheticLambda3(23), false, -683504610);

    /* renamed from: lambda$-2012926973, reason: not valid java name */
    public static final ComposableLambdaImpl f399lambda$2012926973 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(26), false, -2012926973);
    public static final ComposableLambdaImpl lambda$326579864 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(27), false, 326579864);

    /* renamed from: lambda$-1506405885, reason: not valid java name */
    public static final ComposableLambdaImpl f398lambda$1506405885 = new ComposableLambdaImpl(new EarningsHeaderKt$$ExternalSyntheticLambda0(28), false, -1506405885);

    public static final void EarningsBarChartShimmer(DateFilter dateFilter, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2139424470);
        int i2 = (gapComposer.changedInstance(dateFilter) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            VisibleKt.ShimmerBox(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, null, Expect_jvmKt.rememberComposableLambda(-1650923877, new ArcadeModal$$ExternalSyntheticLambda3(dateFilter, 11), gapComposer), gapComposer, 3072, 6);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(dateFilter, modifier, i, 24);
        }
    }

    public static final void KeyStatsSection(EarningsTrackerViewModel.Loaded loaded, Function0 function0, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        loaded.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(823488319);
        int i4 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier3, 1.0f);
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
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.earnings_tracker_key_stats_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            Modifier modifier4 = modifier3;
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$1467587907, null, null, false, false, null, null, 0L, new CellDefaultAccessory.Label(loaded.formattedTotalEarnings, 0), null, gapComposer, 6, 1534);
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$475718138, null, function0, false, false, Expect_jvmKt.rememberComposableLambda(-2145278668, new ArcadeModal$$ExternalSyntheticLambda5(loaded, 9), gapComposer), null, 0L, new CellDefaultAccessory.Label(loaded.formattedNetEarnings, 0), null, gapComposer, ((i3 << 3) & 896) | 1572870, 1466);
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(lambda$1054484283, null, null, false, false, null, null, 0L, new CellDefaultAccessory.Label(String.valueOf(loaded.numberOfCashAppPayments), 0), null, gapComposer, 6, 1534);
            if (loaded.shouldShowTapToPayPayments) {
                gapComposer.startReplaceGroup(-776008305);
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(f400lambda$683504610, null, null, false, false, null, null, 0L, new CellDefaultAccessory.Label(String.valueOf(loaded.numberOfTapToPayPayments), 0), null, gapComposer, 6, 1534);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-775733459);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = modifier4;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(loaded, function0, modifier2, i, i2, 27);
        }
    }

    public static final void KeyStatsShimmer(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1526765194);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer2, R.string.earnings_tracker_key_stats_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
            VisibleKt.ShimmerBox(null, false, null, f399lambda$2012926973, gapComposer2, 3072, 7);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier, i, i2, 5);
        }
    }

    public static final void LoadingError(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        Function0 function02;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1946193350);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 32.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            ImageKt.Image(Countries.painterResource(Strings.getColors(gapComposer).isLight ? R.drawable.coffee_spill_light_mode : R.drawable.coffee_spill_dark_mode, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            gapComposer = gapComposer;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3830, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.earnings_tracker_loading_error_title), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.earnings_tracker_loading_error_body), (Map) null, (Function1) null, false);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, lambda$326579864, gapComposer, (i3 & 14) | 1572864, 62);
            function02 = function0;
            gapComposer.end(true);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolErrorViewKt$$ExternalSyntheticLambda0(function02, modifier, i, 3);
        }
    }

    public static final void NoCustomer(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1752639705);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(fillMaxWidth, 32.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, false, null), Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, Strings.getColors(gapComposer).semantic.text.standard, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777214), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.earnings_tracker_no_top_customers_cell_subtitle), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, Strings.getColors(gapComposer).semantic.text.subtle, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.earnings_tracker_no_top_customers_cell_body), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AllowanceViewKt$$ExternalSyntheticLambda3(i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void TopCustomersSection(int i, int i2, Composer composer, Modifier modifier, List list, Function1 function1) {
        int i3;
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        GapComposer gapComposer;
        Modifier modifier4;
        boolean z;
        GapComposer gapComposer2;
        list.getClass();
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(90709349);
        final int i5 = 2;
        if ((i & 6) == 0) {
            i3 = i | (gapComposer3.changedInstance(list) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = 32;
        if ((i & 48) == 0) {
            i3 |= gapComposer3.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i3 | (gapComposer3.changed(modifier2) ? 256 : 128);
        }
        final int i8 = 0;
        final int i9 = 1;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Modifier modifier5 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier5, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer3, R.string.earnings_tracker_top_customers_cell_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer3, 0, 30);
            if (list.isEmpty()) {
                gapComposer3.startReplaceGroup(-1581077043);
                NoCustomer(gapComposer3, 0);
                gapComposer3.end(false);
                z = true;
                modifier4 = modifier5;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(-1581012315);
                Iterator it = list.iterator();
                GapComposer gapComposer4 = gapComposer3;
                while (it.hasNext()) {
                    final CustomerViewModel customerViewModel = (CustomerViewModel) it.next();
                    CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(customerViewModel.formattedSalesAmount, i5);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-566875184, new Function2() { // from class: com.squareup.cash.earningstracker.views.components.TopCustomersSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str;
                            Color m;
                            long j;
                            int i10 = i8;
                            CustomerViewModel customerViewModel2 = customerViewModel;
                            switch (i10) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                        AvatarSize avatarSize = AvatarSize.Size48;
                                        AvatarViewModel avatarViewModel = customerViewModel2.avatar;
                                        Character ch = avatarViewModel.monogram;
                                        if (ch == null || (str = String.valueOf(ch.charValue())) == null) {
                                            str = "";
                                        }
                                        String str2 = str;
                                        ColorModel colorModel = avatarViewModel.backgroundColor;
                                        if (colorModel == null) {
                                            gapComposer5.startReplaceGroup(33006983);
                                            gapComposer5.end(false);
                                            m = null;
                                        } else {
                                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, 693801402, colorModel, gapComposer5, false);
                                        }
                                        if (m == null) {
                                            gapComposer5.startReplaceGroup(693803669);
                                            Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                            } else {
                                                gapComposer5.startReplaceGroup(-1762997739);
                                                gapComposer5.end(false);
                                            }
                                            j = colors.semantic.background.brand;
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.startReplaceGroup(693800445);
                                            gapComposer5.end(false);
                                            j = m.value;
                                        }
                                        String str3 = avatarViewModel.photoUrl;
                                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j, (String) null, (Modifier) null, (AvatarImage) (str3 != null ? new AvatarImage.Remote.Image(str3, false, null, 0L, new EarningsHeaderKt$$ExternalSyntheticLambda0(29), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer5, 3078, 0, 2000);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, customerViewModel2.cashtag, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer4;
                                    if (gapComposer7.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        String format2 = new MessageFormat(Room.stringResource(gapComposer7, R.string.earnings_tracker_top_customers_transactions_count)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(customerViewModel2.sales), "count"));
                                        format2.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(658790609, new Function2() { // from class: com.squareup.cash.earningstracker.views.components.TopCustomersSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str;
                            Color m;
                            long j;
                            int i10 = i9;
                            CustomerViewModel customerViewModel2 = customerViewModel;
                            switch (i10) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                        AvatarSize avatarSize = AvatarSize.Size48;
                                        AvatarViewModel avatarViewModel = customerViewModel2.avatar;
                                        Character ch = avatarViewModel.monogram;
                                        if (ch == null || (str = String.valueOf(ch.charValue())) == null) {
                                            str = "";
                                        }
                                        String str2 = str;
                                        ColorModel colorModel = avatarViewModel.backgroundColor;
                                        if (colorModel == null) {
                                            gapComposer5.startReplaceGroup(33006983);
                                            gapComposer5.end(false);
                                            m = null;
                                        } else {
                                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer5, 693801402, colorModel, gapComposer5, false);
                                        }
                                        if (m == null) {
                                            gapComposer5.startReplaceGroup(693803669);
                                            Colors colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                                            } else {
                                                gapComposer5.startReplaceGroup(-1762997739);
                                                gapComposer5.end(false);
                                            }
                                            j = colors.semantic.background.brand;
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.startReplaceGroup(693800445);
                                            gapComposer5.end(false);
                                            j = m.value;
                                        }
                                        String str3 = avatarViewModel.photoUrl;
                                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j, (String) null, (Modifier) null, (AvatarImage) (str3 != null ? new AvatarImage.Remote.Image(str3, false, null, 0L, new EarningsHeaderKt$$ExternalSyntheticLambda0(29), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer5, 3078, 0, 2000);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, customerViewModel2.cashtag, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer4;
                                    if (gapComposer7.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        String format2 = new MessageFormat(Room.stringResource(gapComposer7, R.string.earnings_tracker_top_customers_transactions_count)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(customerViewModel2.sales), "count"));
                                        format2.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4);
                    int i10 = ((i4 & 112) == i6 ? i9 : i8) | (gapComposer4.changedInstance(customerViewModel) ? 1 : 0);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (i10 != 0 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ArcadeModal2Kt$$ExternalSyntheticLambda2(23, function1, customerViewModel);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    GapComposer gapComposer5 = gapComposer4;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(-577149225, new Function2() { // from class: com.squareup.cash.earningstracker.views.components.TopCustomersSectionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str;
                            Color m;
                            long j;
                            int i102 = i5;
                            CustomerViewModel customerViewModel2 = customerViewModel;
                            switch (i102) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer52 = (GapComposer) composer2;
                                    if (gapComposer52.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                        AvatarSize avatarSize = AvatarSize.Size48;
                                        AvatarViewModel avatarViewModel = customerViewModel2.avatar;
                                        Character ch = avatarViewModel.monogram;
                                        if (ch == null || (str = String.valueOf(ch.charValue())) == null) {
                                            str = "";
                                        }
                                        String str2 = str;
                                        ColorModel colorModel = avatarViewModel.backgroundColor;
                                        if (colorModel == null) {
                                            gapComposer52.startReplaceGroup(33006983);
                                            gapComposer52.end(false);
                                            m = null;
                                        } else {
                                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer52, 693801402, colorModel, gapComposer52, false);
                                        }
                                        if (m == null) {
                                            gapComposer52.startReplaceGroup(693803669);
                                            Colors colors = (Colors) gapComposer52.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer52, -1762997026, gapComposer52, false);
                                            } else {
                                                gapComposer52.startReplaceGroup(-1762997739);
                                                gapComposer52.end(false);
                                            }
                                            j = colors.semantic.background.brand;
                                            gapComposer52.end(false);
                                        } else {
                                            gapComposer52.startReplaceGroup(693800445);
                                            gapComposer52.end(false);
                                            j = m.value;
                                        }
                                        String str3 = avatarViewModel.photoUrl;
                                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, str2, j, (String) null, (Modifier) null, (AvatarImage) (str3 != null ? new AvatarImage.Remote.Image(str3, false, null, 0L, new EarningsHeaderKt$$ExternalSyntheticLambda0(29), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer52, 3078, 0, 2000);
                                    } else {
                                        gapComposer52.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, customerViewModel2.cashtag, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer4;
                                    if (gapComposer7.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        String format2 = new MessageFormat(Room.stringResource(gapComposer7, R.string.earnings_tracker_top_customers_transactions_count)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(customerViewModel2.sales), "count"));
                                        format2.getClass();
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4), null, label, 0L, null, gapComposer5, 12582966, 0, 3444);
                    i8 = i8;
                    gapComposer4 = gapComposer5;
                    i5 = i5;
                    i4 = i4;
                    modifier5 = modifier5;
                    i6 = i6;
                    i9 = 1;
                }
                modifier4 = modifier5;
                gapComposer4.end(i8);
                z = true;
                gapComposer2 = gapComposer4;
            }
            gapComposer2.end(z);
            modifier3 = modifier4;
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            modifier3 = modifier2;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AtmPickerGridKt$$ExternalSyntheticLambda2(list, function1, modifier3, i, i2, 2);
        }
    }

    public static final void TopCustomersShimmer(int i, int i2, Composer composer, Modifier modifier) {
        int i3;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-734132854);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer2, R.string.earnings_tracker_top_customers_cell_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
            VisibleKt.ShimmerBox(null, false, null, f398lambda$1506405885, gapComposer2, 3072, 7);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier, i, i2, 6);
        }
    }
}
