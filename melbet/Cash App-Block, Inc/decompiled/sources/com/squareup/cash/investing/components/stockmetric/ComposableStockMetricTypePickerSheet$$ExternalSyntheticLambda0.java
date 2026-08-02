package com.squareup.cash.investing.components.stockmetric;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposableStockMetricTypePickerSheet$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ StockMetricTypePickerViewModel f$0;
    public final /* synthetic */ ComposableStockMetricTypePickerSheet f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ ComposableStockMetricTypePickerSheet$$ExternalSyntheticLambda0(ComposableStockMetricTypePickerSheet composableStockMetricTypePickerSheet, StockMetricTypePickerViewModel stockMetricTypePickerViewModel, Function1 function1, int i) {
        this.f$1 = composableStockMetricTypePickerSheet;
        this.f$0 = stockMetricTypePickerViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$2;
        StockMetricTypePickerViewModel stockMetricTypePickerViewModel = this.f$0;
        ComposableStockMetricTypePickerSheet composableStockMetricTypePickerSheet = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = ComposableStockMetricTypePickerSheet.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 30.0f, 7);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 48, 0, 4080, MooncakeTheme.getColors(gapComposer).label, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 6.0f, 30.0f), MooncakeTheme.getTypography(gapComposer).mainTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.investing_components_stock_metric_type_picker_sheet_title), (Map) null, (Function1) null, false);
                    gapComposer.startReplaceGroup(1124305508);
                    List<StockMetricTypePickerViewModel.Option> list = stockMetricTypePickerViewModel != null ? stockMetricTypePickerViewModel.options : null;
                    if (list == null) {
                        list = EmptyList.INSTANCE;
                    }
                    for (StockMetricTypePickerViewModel.Option option : list) {
                        KeypadKt.m3642DivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer, 0, 7);
                        composableStockMetricTypePickerSheet.OptionItem(option, function1, gapComposer, 512);
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int i3 = ComposableStockMetricTypePickerSheet.$r8$clinit;
                composableStockMetricTypePickerSheet.Content(stockMetricTypePickerViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ComposableStockMetricTypePickerSheet$$ExternalSyntheticLambda0(StockMetricTypePickerViewModel stockMetricTypePickerViewModel, ComposableStockMetricTypePickerSheet composableStockMetricTypePickerSheet, Function1 function1) {
        this.f$0 = stockMetricTypePickerViewModel;
        this.f$1 = composableStockMetricTypePickerSheet;
        this.f$2 = function1;
    }
}
