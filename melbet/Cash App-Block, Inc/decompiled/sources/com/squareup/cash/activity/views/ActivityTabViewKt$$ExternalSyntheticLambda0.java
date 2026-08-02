package com.squareup.cash.activity.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.composeui.TextFieldStateInputFieldText;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$SetPin$3$1$1$1;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.ui.AlertBannerKt;
import com.squareup.cash.ui.overlays.viewmodels.AlertBannerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivityTabViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityTabViewModel f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ LazyListState f$3;
    public final /* synthetic */ RealScrollPerformanceTrackerFactory f$4;

    public /* synthetic */ ActivityTabViewKt$$ExternalSyntheticLambda0(ActivityTabViewModel activityTabViewModel, Function1 function1, boolean z, LazyListState lazyListState, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, int i) {
        this.$r8$classId = i;
        this.f$0 = activityTabViewModel;
        this.f$1 = function1;
        this.f$2 = z;
        this.f$3 = lazyListState;
        this.f$4 = realScrollPerformanceTrackerFactory;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        GapComposer gapComposer;
        ActivityTabViewModel activityTabViewModel;
        TextFieldState m382rememberTextFieldStateLepunE;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj3 = Composer.Companion.Empty;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-854275167, new ActivityTabViewKt$$ExternalSyntheticLambda0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, 1), gapComposer2), gapComposer2, 3072, 7);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    ActivityTabViewModel activityTabViewModel2 = this.f$0;
                    AlertBannerViewModel alertBannerViewModel = activityTabViewModel2.alertBannerViewModel;
                    Function1 function1 = this.f$1;
                    boolean changed = gapComposer3.changed(function1);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new BalanceFeedKt$$ExternalSyntheticLambda4(20, function1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    AlertBannerKt.AlertBannerContainer(alertBannerViewModel, fillMaxSize, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-435874665, new ActivityTabViewKt$$ExternalSyntheticLambda0(activityTabViewModel2, function1, this.f$2, this.f$3, this.f$4, 2), gapComposer3), gapComposer3, 24624);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Modifier imePadding = SpacerKt.imePadding(CashInsetsKt.inlineBottomNavigationPadding(gapComposer4, ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors.semantic.background.f1047app, ColorKt.RectangleShape)));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 0);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, imePadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Function1 function12 = this.f$1;
                    boolean z = this.f$2;
                    ActivityTabViewModel activityTabViewModel3 = this.f$0;
                    UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-1657521698, new EducationalSheetKt$$ExternalSyntheticLambda8(function12, z, activityTabViewModel3, 3), gapComposer4), gapComposer4, 6);
                    InputFieldText inputFieldText = activityTabViewModel3.searchQuery;
                    if (inputFieldText instanceof TextFieldStateInputFieldText) {
                        gapComposer4.startReplaceGroup(-179303377);
                        gapComposer4.end(false);
                        m382rememberTextFieldStateLepunE = ((TextFieldStateInputFieldText) inputFieldText).textFieldState;
                        activityTabViewModel = activityTabViewModel3;
                        gapComposer = gapComposer4;
                    } else {
                        gapComposer4.startReplaceGroup(-1274975775);
                        gapComposer4.startMovableGroup(-179302070, inputFieldText);
                        String obj4 = inputFieldText.getValue().toString();
                        gapComposer = gapComposer4;
                        activityTabViewModel = activityTabViewModel3;
                        m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(obj4, 0L, gapComposer, 0, 2);
                        gapComposer.end(false);
                        gapComposer.end(false);
                    }
                    boolean changed2 = gapComposer.changed(m382rememberTextFieldStateLepunE) | gapComposer.changed(function12);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj3) {
                        rememberedValue2 = new SetPinViewKt$SetPin$3$1$1$1(m382rememberTextFieldStateLepunE, function12, null, 4);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer, m382rememberTextFieldStateLepunE, (Function2) rememberedValue2);
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    boolean z2 = activityTabViewModel.isRefreshing;
                    String stringResource = Room.stringResource(gapComposer, R.string.activity_pull_to_refresh_label);
                    boolean changed3 = gapComposer.changed(function12);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue3 == obj3) {
                        rememberedValue3 = new BalanceFeedKt$$ExternalSyntheticLambda4(22, function12);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    GapComposer gapComposer5 = gapComposer;
                    VisibleKt.PullToRefresh(196992, 8, gapComposer5, Expect_jvmKt.rememberComposableLambda(1591870518, new DismissableToastKt$$ExternalSyntheticLambda4(activityTabViewModel, function12, this.f$3, this.f$4, 11), gapComposer), fillMaxSize3, stringResource, (Function0) rememberedValue3, z2, false);
                    gapComposer5.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
