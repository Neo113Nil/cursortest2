package com.squareup.cash.activity.views;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.BalanceFeedViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.sheet.SheetKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BalanceFeedKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BalanceFeedViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BalanceFeedKt$$ExternalSyntheticLambda1(BalanceFeedViewModel balanceFeedViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = balanceFeedViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        BalanceFeedViewModel balanceFeedViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 1;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(314910761, new BalanceFeedKt$$ExternalSyntheticLambda1(balanceFeedViewModel, function1, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j, rectangleShapeKt$RectangleShape$1, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m);
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
                    String str = balanceFeedViewModel.title;
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(0, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 48, 108);
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Updater.derivedStateOf(new BalanceFeedKt$$ExternalSyntheticLambda5(0, rememberLazyListState, density));
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    State state = (State) rememberedValue2;
                    String str2 = balanceFeedViewModel.availableBalance;
                    if (str2 == null) {
                        gapComposer2.startReplaceGroup(1459558865);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1459558866);
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(1307373651, new SwipeToDismissKt$$ExternalSyntheticLambda4(12, function1), gapComposer2), null, null, false, false, null, null, 0L, new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(12014814, new LocalHomeViewKt$$ExternalSyntheticLambda1(str2, 13), gapComposer2), 0), null, gapComposer2, 6, 1534);
                        gapComposer2 = gapComposer2;
                        ModalKt.HorizontalDivider(0, 0, gapComposer2, AlphaKt.alpha(companion, ((Number) state.getValue()).floatValue()));
                        gapComposer2.end(false);
                    }
                    AvatarsKt.ActivityScrollableEmbeddedView(balanceFeedViewModel.activityEmbeddedViewModel, SizeKt.fillMaxSize(companion, 1.0f), rememberLazyListState, (PaddingValues) null, (Function3) null, (Function2) null, (Function3) null, gapComposer2, 48, 504);
                    gapComposer2.end(true);
                    BalanceFeedViewModel.InfoSheet infoSheet = balanceFeedViewModel.infoSheet;
                    if (infoSheet == null) {
                        gapComposer2.startReplaceGroup(1300478310);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1300478311);
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda4(24, function1);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        GapComposer gapComposer3 = gapComposer2;
                        SheetKt.Sheet((Function0) rememberedValue3, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1064410398, new BalanceFeedKt$$ExternalSyntheticLambda9(infoSheet, 0), gapComposer2), gapComposer3, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
