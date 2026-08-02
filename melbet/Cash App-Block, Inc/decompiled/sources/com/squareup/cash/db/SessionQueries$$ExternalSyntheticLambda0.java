package com.squareup.cash.db;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.views.AmountBlockerViewKt;
import com.squareup.cash.blockers.views.CalendarDatePickerKt;
import com.squareup.cash.blockers.views.LabelValueView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$Overlay$contentWithLocals$1;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.home.MoneybotHomeScaffoldContentScope;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.CardRegistry$CardTransition$TransitionType;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$8$1;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.util.compose.StableHolder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$2;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class SessionQueries$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda0(CardRegistry cardRegistry, String str, boolean z, MutableState mutableState, State state, State state2) {
        this.$r8$classId = 6;
        this.f$1 = cardRegistry;
        this.f$0 = str;
        this.f$5 = z;
        this.f$2 = mutableState;
        this.f$3 = state;
        this.f$4 = state2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0359 A[LOOP:0: B:71:0x028e->B:97:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.time.LocalDate] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        TextInputSession textInputSession;
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2;
        Function1 function1;
        ?? r6;
        int i = this.$r8$classId;
        int i2 = 2;
        int i3 = 7;
        final boolean z = false;
        Flow$Type flow$Type = null;
        final boolean z2 = this.f$5;
        int i4 = 1;
        Object obj2 = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$0;
        Object obj6 = this.f$1;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement, 0, (String) obj5, 1, (String) obj6);
                androidStatement.bindString(2, (String) obj4);
                androidStatement.bindString(3, (String) obj3);
                androidStatement.bindLong(4, (Long) obj2);
                androidStatement.bindBoolean(5, Boolean.valueOf(z2));
                return Unit.INSTANCE;
            case 1:
                LegacyTextFieldState legacyTextFieldState = (LegacyTextFieldState) obj5;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = legacyTextFieldState.showCursorHandle$delegate;
                WindowInfo windowInfo = (WindowInfo) obj6;
                TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) obj4;
                TextFieldValue textFieldValue = (TextFieldValue) obj3;
                OffsetMapping offsetMapping = (OffsetMapping) obj2;
                LayoutCoordinates layoutCoordinates3 = (LayoutCoordinates) obj;
                legacyTextFieldState._layoutCoordinates = layoutCoordinates3;
                TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                if (layoutResult != null) {
                    layoutResult.innerTextFieldCoordinates = layoutCoordinates3;
                }
                if (z2) {
                    if (legacyTextFieldState.getHandleState() == HandleState.Selection) {
                        if (((Boolean) legacyTextFieldState.showFloatingToolbar$delegate.getValue()).booleanValue() && ((LazyWindowInfo) windowInfo).isWindowFocused()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation();
                        }
                        legacyTextFieldState.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true)));
                        legacyTextFieldState.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, false)));
                        parcelableSnapshotMutableState.setValue(Boolean.valueOf(TextRange.m987getCollapsedimpl(textFieldValue.selection)));
                    } else if (legacyTextFieldState.getHandleState() == HandleState.Cursor) {
                        parcelableSnapshotMutableState.setValue(Boolean.valueOf(SimpleLayoutKt.isSelectionHandleInVisibleBound(textFieldSelectionManager, true)));
                    }
                    KeyMappingKt.notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    if (layoutResult2 != null && (textInputSession = legacyTextFieldState.inputSession) != null && legacyTextFieldState.getHasFocus() && (layoutCoordinates = layoutResult2.innerTextFieldCoordinates) != null && layoutCoordinates.isAttached() && (layoutCoordinates2 = layoutResult2.decorationBoxCoordinates) != null) {
                        TextLayoutResult textLayoutResult = layoutResult2.value;
                        KClasses$$Lambda$2 kClasses$$Lambda$2 = new KClasses$$Lambda$2(layoutCoordinates, i2);
                        Rect visibleBounds = SimpleLayoutKt.visibleBounds(layoutCoordinates);
                        Rect localBoundingBoxOf = layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false);
                        if (Intrinsics.areEqual((TextInputSession) textInputSession.textInputService._currentInputSession.get(), textInputSession)) {
                            textInputSession.platformTextInputService.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, kClasses$$Lambda$2, visibleBounds, localBoundingBoxOf);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 2:
                StableHolder stableHolder = (StableHolder) obj4;
                StableHolder stableHolder2 = (StableHolder) obj3;
                Function1 function12 = (Function1) obj2;
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new LabelValueView$$ExternalSyntheticLambda0(8), AmountBlockerViewKt.f292lambda$327473385, 5);
                ChronoUnit chronoUnit = ChronoUnit.MONTHS;
                Object obj7 = ((StableHolder) obj5).model;
                long between = chronoUnit.between((Temporal) obj7, (Temporal) ((StableHolder) obj6).model);
                if (0 <= between) {
                    long j = 0;
                    while (true) {
                        LocalDate localDate = (LocalDate) stableHolder.model;
                        LocalDate localDate2 = (LocalDate) obj7;
                        LocalDate plusMonths = localDate2.plusMonths(j);
                        plusMonths.getClass();
                        ?? r18 = stableHolder2 != null ? (LocalDate) stableHolder2.model : flow$Type;
                        LocalDate atDay = CalendarDatePickerKt.getYearMonth(plusMonths).atDay(i4);
                        atDay.getClass();
                        DayOfWeek dayOfWeek = atDay.getDayOfWeek();
                        DayOfWeek dayOfWeek2 = CalendarDatePickerKt.getYearMonth(plusMonths).atEndOfMonth().getDayOfWeek();
                        Object obj8 = obj7;
                        long j2 = j;
                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new LabelValueView$$ExternalSyntheticLambda0(9), new ComposableLambdaImpl(new SsnViewKt$$ExternalSyntheticLambda2(plusMonths, 12), true, 1834813680), 5);
                        dayOfWeek.getClass();
                        int i5 = dayOfWeek.get(ChronoField.DAY_OF_WEEK);
                        if (i5 == 7) {
                            i5 = 0;
                        }
                        if (i5 > 0) {
                            function1 = null;
                            LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new DatePickerKt$$ExternalSyntheticLambda10(i5, 6), AmountBlockerViewKt.f299lambda$548370955, 5);
                        } else {
                            function1 = null;
                        }
                        int i6 = 1;
                        while (true) {
                            int i7 = 7;
                            LazyGridIntervalContent.item$default(lazyGridIntervalContent, function1, function1, new ComposableLambdaImpl(new SheetKt$$ExternalSyntheticLambda4(atDay.withDayOfMonth(i6), (LocalDate) r18, this.f$5, localDate, localDate2, function12), true, 281179854), 7);
                            i6++;
                            if (i6 > plusMonths.lengthOfMonth()) {
                                DayOfWeek dayOfWeek3 = DayOfWeek.SATURDAY;
                                if (dayOfWeek2 != dayOfWeek3) {
                                    ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                                    int i8 = dayOfWeek3.get(chronoField);
                                    if (i8 == 7) {
                                        i8 = 0;
                                    }
                                    dayOfWeek2.getClass();
                                    int i9 = dayOfWeek2.get(chronoField);
                                    if (i9 == 7) {
                                        i9 = 0;
                                    }
                                    int i10 = i8 - i9;
                                    if (i10 > 0) {
                                        r6 = 0;
                                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, null, new DatePickerKt$$ExternalSyntheticLambda10(i10, i7), AmountBlockerViewKt.lambda$526628579, 5);
                                        LazyGridIntervalContent.item$default(lazyGridIntervalContent, r6, r6, AmountBlockerViewKt.f283lambda$1674819175, 7);
                                        if (j2 == between) {
                                            flow$Type = r6;
                                            obj7 = obj8;
                                            i4 = 1;
                                            j = j2 + 1;
                                        }
                                    }
                                }
                                r6 = 0;
                                LazyGridIntervalContent.item$default(lazyGridIntervalContent, r6, r6, AmountBlockerViewKt.f283lambda$1674819175, 7);
                                if (j2 == between) {
                                }
                            } else {
                                function1 = null;
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 3:
                ColorModel colorModel = (ColorModel) obj3;
                BlockersData.MoneybotContext moneybotContext = (BlockersData.MoneybotContext) obj2;
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                RequestContext copy$default = RequestContext.copy$default(blockersData.requestContext, null, null, null, null, null, null, null, null, (ScenarioInitiatorType) obj4, (String) obj5, null, null, 6655);
                try {
                    flow$Type = Flow$Type.valueOf(StringsKt.substringBefore$default((String) obj6, '?'));
                } catch (IllegalArgumentException unused) {
                }
                return BlockersData.copy$default(blockersData, null, null, null, flow$Type, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f$5, null, null, null, null, null, null, colorModel, null, null, null, null, false, copy$default, moneybotContext, null, 2147483639, 40831);
            case 4:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                Request$Priority$EnumUnboxingLocalUtility.m(androidStatement2, 0, (String) obj5, 1, (String) obj6);
                androidStatement2.bindBoolean(2, Boolean.valueOf(z2));
                androidStatement2.bindString(3, (String) obj4);
                androidStatement2.bindBoolean(4, (Boolean) obj2);
                androidStatement2.bindString(5, (String) obj3);
                return Unit.INSTANCE;
            case 5:
                MoneybotHomeViewModel moneybotHomeViewModel = (MoneybotHomeViewModel) obj5;
                final Function1 function13 = (Function1) obj6;
                Density density = (Density) obj4;
                Animatable animatable = (Animatable) obj3;
                Set set = (Set) obj2;
                MoneybotHomeScaffoldContentScope moneybotHomeScaffoldContentScope = (MoneybotHomeScaffoldContentScope) obj;
                moneybotHomeScaffoldContentScope.getClass();
                if (moneybotHomeViewModel instanceof MoneybotHomeViewModel.Error) {
                    LazyListScope.item$default(moneybotHomeScaffoldContentScope, null, null, new ComposableLambdaImpl(new MoneyTabUIKt$$ExternalSyntheticLambda11(i3, (Object) moneybotHomeScaffoldContentScope, (Object) function13), true, 1259143514), 3);
                } else if (moneybotHomeViewModel instanceof MoneybotHomeViewModel.Loading) {
                    if (((MoneybotHomeViewModel.Loading) moneybotHomeViewModel).showAnimation) {
                        LazyListScope.item$default(moneybotHomeScaffoldContentScope, null, null, MoneybotHomeViewKt.f484lambda$616870946, 3);
                    }
                } else {
                    if (!(moneybotHomeViewModel instanceof MoneybotHomeViewModel.Content)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (z2 && ((MoneybotHomeViewModel.Content) moneybotHomeViewModel).animateHomeEntrance) {
                        z = true;
                    }
                    LazyListScope.item$default(moneybotHomeScaffoldContentScope, null, null, new ComposableLambdaImpl(new MoneyTabUIKt$$ExternalSyntheticLambda0(moneybotHomeScaffoldContentScope, moneybotHomeViewModel, density, z, animatable, function13, set), true, 282684258), 3);
                    final ArrayList arrayList = ((MoneybotHomeViewModel.Content) moneybotHomeViewModel).widgets;
                    int i11 = 16;
                    moneybotHomeScaffoldContentScope.$$delegate_0.items(arrayList.size(), new VerifyCheckDepositPresenter$models$3$2(i11, new InsightChartKt$$ExternalSyntheticLambda19(i11), arrayList), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(14, arrayList), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt$MoneybotHomeView$lambda$5$0$6$0$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                            int i12;
                            LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj9;
                            int intValue = ((Number) obj10).intValue();
                            Composer composer = (Composer) obj11;
                            int intValue2 = ((Number) obj12).intValue();
                            if ((intValue2 & 6) == 0) {
                                i12 = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
                            } else {
                                i12 = intValue2;
                            }
                            if ((intValue2 & 48) == 0) {
                                i12 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                            }
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                                MoneybotHomeViewModel.WidgetCard widgetCard = (MoneybotHomeViewModel.WidgetCard) arrayList.get(intValue);
                                gapComposer.startReplaceGroup(-809909762);
                                if (z) {
                                    gapComposer.startReplaceGroup(-809892961);
                                    boolean changed = gapComposer.changed(widgetCard.lazyColumnKey);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    MutableState mutableState = (MutableState) rememberedValue;
                                    String str = widgetCard.lazyColumnKey;
                                    boolean changed2 = gapComposer.changed(mutableState);
                                    Object rememberedValue2 = gapComposer.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new HeroCardViewKt$Render$1$8$1.AnonymousClass3(mutableState, null, 9);
                                        gapComposer.updateRememberedValue(rememberedValue2);
                                    }
                                    Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue2);
                                    AnimatedContentKt.AnimatedVisibility(((Boolean) mutableState.getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 80.0f, null, 5), 2), (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1858793749, new BorrowHomeOverlayKt$Overlay$contentWithLocals$1(1, widgetCard, function13), gapComposer), (Composer) gapComposer, 196992, 26);
                                    gapComposer = gapComposer;
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(-809392745);
                                    boolean z3 = z2;
                                    Modifier modifier = Modifier.Companion.$$INSTANCE;
                                    if (z3) {
                                        modifier = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, modifier);
                                    }
                                    MoneybotHomeViewKt.WidgetCard(modifier, widgetCard, function13, false, gapComposer, 0, 8);
                                    gapComposer.end(false);
                                }
                                gapComposer.end(false);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 802480018));
                }
                return Unit.INSTANCE;
            default:
                CardRegistry cardRegistry = (CardRegistry) obj6;
                String str = (String) obj5;
                State state = (State) obj3;
                State state2 = (State) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                float floatValue = ((Number) cardRegistry.cardAnimation.getValue()).floatValue();
                Offset offset = (Offset) cardRegistry.sourceOffsets.get(str);
                Offset offset2 = (Offset) cardRegistry.targetOffsets.get(str);
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) ((MutableState) obj4).getValue();
                float f = RecyclerView.DECELERATION_RATE;
                if (offset != null) {
                    long j3 = offset.packedValue;
                    if (offset2 != null) {
                        long j4 = offset2.packedValue;
                        if (cardRegistry$CardTransition$TransitionType != null) {
                            int ordinal = cardRegistry$CardTransition$TransitionType.ordinal();
                            if (ordinal == 0) {
                                reusableGraphicsLayerScope.setTranslationX((Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j3 >> 32))) * floatValue);
                                reusableGraphicsLayerScope.setTranslationY((Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax))) * floatValue);
                                if (z2) {
                                    if (floatValue < 0.5f) {
                                        f = 1.0f;
                                    }
                                    reusableGraphicsLayerScope.setAlpha(f);
                                }
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                float f2 = 1.0f - floatValue;
                                reusableGraphicsLayerScope.setTranslationX((Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32))) * f2);
                                reusableGraphicsLayerScope.setTranslationY((Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (j4 & BodyPartID.bodyIdMax))) * f2);
                                if (z2) {
                                    if (floatValue >= 0.5f) {
                                        f = 1.0f;
                                    }
                                    reusableGraphicsLayerScope.setAlpha(f);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }
                if (cardRegistry.getInTransition() && ((Boolean) state.getValue()).booleanValue() && floatValue < 0.5f) {
                    reusableGraphicsLayerScope.setAlpha(RecyclerView.DECELERATION_RATE);
                } else if (z2 && ((Boolean) state2.getValue()).booleanValue()) {
                    reusableGraphicsLayerScope.setAlpha(RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda0(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$5 = z;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
    }

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda0(ScenarioInitiatorType scenarioInitiatorType, String str, RealFlowStarter realFlowStarter, String str2, boolean z, ColorModel colorModel, BlockersData.MoneybotContext moneybotContext) {
        this.$r8$classId = 3;
        this.f$2 = scenarioInitiatorType;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$5 = z;
        this.f$3 = colorModel;
        this.f$4 = moneybotContext;
    }

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda0(StableHolder stableHolder, StableHolder stableHolder2, boolean z, StableHolder stableHolder3, StableHolder stableHolder4, Function1 function1) {
        this.$r8$classId = 2;
        this.f$0 = stableHolder;
        this.f$1 = stableHolder2;
        this.f$5 = z;
        this.f$2 = stableHolder3;
        this.f$3 = stableHolder4;
        this.f$4 = function1;
    }

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda0(String str, String str2, String str3, String str4, Long l, boolean z) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
        this.f$4 = l;
        this.f$5 = z;
    }

    public /* synthetic */ SessionQueries$$ExternalSyntheticLambda0(String str, String str2, boolean z, String str3, Boolean bool, String str4) {
        this.$r8$classId = 4;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$5 = z;
        this.f$2 = str3;
        this.f$4 = bool;
        this.f$3 = str4;
    }
}
