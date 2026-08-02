package app.cash.broadway.ui.compose;

import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material.CardKt;
import androidx.compose.material.InputPhase;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.broadway.ui.UpdatesWindowFlags$Orientation;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.checkout.LocalOpenTabCheckoutViewKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.RealToastIconScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class FullScreenKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ FullScreenKt$$ExternalSyntheticLambda0() {
        this.$r8$classId = 12;
        UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 7;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = 6;
        switch (i) {
            case 0:
                UiScope uiScope = (UiScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                uiScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(uiScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    EnterExitState enterExitState = (EnterExitState) uiScope.$$delegate_0.getTransition().targetState$delegate.getValue();
                    FullScreenAggregator fullScreenAggregator = (FullScreenAggregator) gapComposer.consume(FullScreenKt.LocalFullScreenAggregator);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj4 = rememberedValue;
                    if (rememberedValue == neverEqualPolicy) {
                        enterExitState.getClass();
                        FullScreenNode fullScreenNode = new FullScreenNode();
                        fullScreenNode.targetVisibilityState = enterExitState;
                        gapComposer.updateRememberedValue(fullScreenNode);
                        obj4 = fullScreenNode;
                    }
                    FullScreenNode fullScreenNode2 = (FullScreenNode) obj4;
                    boolean changedInstance = gapComposer.changedInstance(fullScreenNode2) | gapComposer.changed(enterExitState.ordinal()) | gapComposer.changed(true);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new StatusRunnable$$ExternalSyntheticLambda1(3, fullScreenNode2, enterExitState);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Updater.SideEffect((Function0) rememberedValue2, gapComposer);
                    boolean changedInstance2 = gapComposer.changedInstance(fullScreenAggregator) | gapComposer.changedInstance(fullScreenNode2);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new RealBadger2$$ExternalSyntheticLambda0(i3, fullScreenAggregator, fullScreenNode2);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Updater.DisposableEffect(fullScreenAggregator, fullScreenNode2, (Function1) rememberedValue3, gapComposer);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(contextMenuColors) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, ContextMenuSpec.DividerVerticalPadding, 1), 1.0f), ContextMenuSpec.DividerHeight), contextMenuColors.iconColor, ColorKt.RectangleShape), gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Function2 function2 = (Function2) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changedInstance(function2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    function2.invoke(gapComposer3, Integer.valueOf(intValue3 & 14));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Function2 function22 = (Function2) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changedInstance(function22) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    function22.invoke(gapComposer4, Integer.valueOf(intValue4 & 14));
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                SnackbarHostState snackbarHostState = (SnackbarHostState) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(snackbarHostState) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    CardKt.SnackbarHost(snackbarHostState, null, null, gapComposer5, intValue5 & 14);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                SnackbarHostState snackbarHostState2 = (SnackbarHostState) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(snackbarHostState2) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    CardKt.SnackbarHost(snackbarHostState2, null, null, gapComposer6, intValue6 & 14);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                if (obj != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    break;
                } else {
                    Composer composer7 = (Composer) obj2;
                    int intValue7 = ((Integer) obj3).intValue();
                    if ((intValue7 & 6) == 0) {
                        intValue7 |= (intValue7 & 8) == 0 ? ((GapComposer) composer7).changed((Object) null) : ((GapComposer) composer7).changedInstance(null) ? 4 : 2;
                    }
                    GapComposer gapComposer7 = (GapComposer) composer7;
                    if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                        CardKt.m471SnackbarsPrSdHI(null, null, 0L, 0L, 0L, RecyclerView.DECELERATION_RATE, gapComposer7, intValue7 & 14);
                    } else {
                        gapComposer7.skipToGroupEnd();
                    }
                    break;
                }
            case 7:
                MeasureScope measureScope = (MeasureScope) obj;
                int mo230roundToPx0680j_4 = measureScope.mo230roundToPx0680j_4(10.0f);
                int i4 = mo230roundToPx0680j_4 * 2;
                Placeable mo833measureBRTryo0 = ((Measurable) obj2).mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(0, i4, ((Constraints) obj3).value));
                break;
            case 8:
                Transition.Segment segment = (Transition.Segment) obj;
                ((Integer) obj3).getClass();
                GapComposer gapComposer8 = (GapComposer) ((Composer) obj2);
                gapComposer8.startReplaceGroup(1849239065);
                InputPhase inputPhase = InputPhase.Focused;
                InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
                Object tween$default = segment.isTransitioningTo(inputPhase, inputPhase2) ? AnimatableKt.tween$default(67, 0, EasingKt.LinearEasing, 2) : (segment.isTransitioningTo(inputPhase2, inputPhase) || segment.isTransitioningTo(InputPhase.UnfocusedNotEmpty, inputPhase2)) ? new TweenSpec(83, 67, EasingKt.LinearEasing) : AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 7);
                gapComposer8.end(false);
                break;
            case 9:
                MeasureScope measureScope2 = (MeasureScope) obj;
                int mo230roundToPx0680j_42 = measureScope2.mo230roundToPx0680j_4(10.0f);
                int i5 = mo230roundToPx0680j_42 * 2;
                Placeable mo833measureBRTryo02 = ((Measurable) obj2).mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(i5, 0, ((Constraints) obj3).value));
                break;
            case 10:
                MeasureScope measureScope3 = (MeasureScope) obj;
                int mo230roundToPx0680j_43 = measureScope3.mo230roundToPx0680j_4(10.0f);
                int i6 = mo230roundToPx0680j_43 * 2;
                Placeable mo833measureBRTryo03 = ((Measurable) obj2).mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(0, i6, ((Constraints) obj3).value));
                break;
            case 11:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    TextKt.m560Text4IGK_g(null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, gapComposer9, 6);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 12:
                UpdatesWindowFlags$Orientation updatesWindowFlags$Orientation = UpdatesWindowFlags$Orientation.Landscape;
                UiScope uiScope2 = (UiScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                uiScope2.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(uiScope2) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    EnterExitState enterExitState2 = (EnterExitState) uiScope2.$$delegate_0.getTransition().targetState$delegate.getValue();
                    OrientationAggregator orientationAggregator = (OrientationAggregator) gapComposer10.consume(OrientationKt.LocalOrientationAggregator);
                    Object rememberedValue4 = gapComposer10.rememberedValue();
                    Object obj5 = rememberedValue4;
                    if (rememberedValue4 == neverEqualPolicy) {
                        enterExitState2.getClass();
                        OrientationNode orientationNode = new OrientationNode();
                        orientationNode.targetVisibilityState = enterExitState2;
                        gapComposer10.updateRememberedValue(orientationNode);
                        obj5 = orientationNode;
                    }
                    OrientationNode orientationNode2 = (OrientationNode) obj5;
                    boolean changedInstance3 = gapComposer10.changedInstance(orientationNode2) | gapComposer10.changed(enterExitState2.ordinal()) | gapComposer10.changed(0);
                    Object rememberedValue5 = gapComposer10.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new StatusRunnable$$ExternalSyntheticLambda1(orientationNode2, enterExitState2);
                        gapComposer10.updateRememberedValue(rememberedValue5);
                    }
                    Updater.SideEffect((Function0) rememberedValue5, gapComposer10);
                    boolean changedInstance4 = gapComposer10.changedInstance(orientationAggregator) | gapComposer10.changedInstance(orientationNode2);
                    Object rememberedValue6 = gapComposer10.rememberedValue();
                    if (changedInstance4 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new RealBadger2$$ExternalSyntheticLambda0(i2, orientationAggregator, orientationNode2);
                        gapComposer10.updateRememberedValue(rememberedValue6);
                    }
                    Updater.DisposableEffect(orientationAggregator, orientationNode2, (Function1) rememberedValue6, gapComposer10);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.local_views_apply), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.local_views_vehicle_confirm_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ModalKt.HorizontalDivider(6, 0, gapComposer13, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5));
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer14, null);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer15, null);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer16, null);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer17, null);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 20:
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer18, null);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 21:
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    LocalBrandLocationCheckoutViewKt.IdvRequiredRow(gapComposer19, 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 22:
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer20, null);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 23:
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    ModalKt.HorizontalDivider(0, 1, gapComposer21, null);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 24:
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    ModalKt.HorizontalDivider(6, 0, gapComposer22, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, LocalOpenTabCheckoutViewKt.OpenTabCheckoutCompensatedVerticalPadding, 7));
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 25:
                Composer composer22 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "Customize", (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            case 26:
                Composer composer23 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Painter painter = Icons.CategoryRestaurant24.painter(gapComposer24);
                    Colors colors = (Colors) gapComposer24.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer24, -1762997026, gapComposer24, false);
                    } else {
                        gapComposer24.startReplaceGroup(-1762997739);
                        gapComposer24.end(false);
                    }
                    long j = colors.semantic.icon.subtle;
                    ImageKt.Image(painter, null, fillMaxSize, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer24, Painter.$stable | 25008, 40);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 27:
                Composer composer24 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer25, R.string.local_views_retry_load_scheduling_day_times_try_again), (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 28:
                Composer composer25 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer26, R.string.local_views_close), (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            default:
                RealToastIconScope realToastIconScope = (RealToastIconScope) obj;
                Composer composer26 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                realToastIconScope.getClass();
                if ((intValue26 & 6) == 0) {
                    intValue26 |= ((GapComposer) composer26).changed(realToastIconScope) ? 4 : 2;
                }
                GapComposer gapComposer27 = (GapComposer) composer26;
                if (gapComposer27.shouldExecute(intValue26 & 1, (intValue26 & 19) != 18)) {
                    realToastIconScope.Icon(Icons.CheckFill24, null, gapComposer27, ((intValue26 << 9) & 7168) | 390);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FullScreenKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
