package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarModel_androidKt;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000Â\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001aQ\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a[\u0010 \u001a\u00020\u00032\n\u0010!\u001a\u00060\"j\u0002`#2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%\u001aÄ\u0001\u0010&\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u001b2:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,2!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0001022\u0006\u00104\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0003¢\u0006\u0004\b6\u00107\u001a°\u0001\u00108\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152\u0006\u0010)\u001a\u00020\u00152:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,2!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0001022\u0006\u00104\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u00109\u001a°\u0001\u0010:\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<2\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u00152:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,2!\u00101\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0001022\u0006\u00104\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010=\u001ae\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010\u00152\b\u0010A\u001a\u0004\u0018\u00010\u00152:\u0010+\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u00010,H\u0002¢\u0006\u0002\u0010B\u001a#\u0010G\u001a\u00020\u0001*\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0000¢\u0006\u0004\bM\u0010N\u001a.\u0010O\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010\u0002\u001a\u00020<2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020UH\u0002\"\u0014\u0010C\u001a\u00020DX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010F\"\u000e\u0010W\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010X\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010Y\u001a\u00020ZX\u0082\u0004¢\u0006\u0004\n\u0002\u0010[¨\u0006\\"}, d2 = {"DateRangePicker", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "colors", "Landroidx/compose/material3/DatePickerColors;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/DatePickerColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "rememberDateRangePickerState", "initialSelectedStartDateMillis", "", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "yearRange", "Lkotlin/ranges/IntRange;", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "DateRangePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "SwitchableDateEntryContent", "selectedStartDateMillis", "selectedEndDateMillis", "displayedMonthMillis", "displayMode", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "startDateMillis", "endDateMillis", "onDisplayedMonthChange", "Lkotlin/Function1;", "monthInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "SwitchableDateEntryContent-eVtQiho", "(Ljava/lang/Long;Ljava/lang/Long;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "(Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "VerticalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "updateDateSelection", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "(JLjava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "color", "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "DateRangePickerTitlePadding", "DateRangePickerHeadlinePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", "F", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class DateRangePickerKt {
    private static final PaddingValues DateRangePickerHeadlinePadding;
    private static final PaddingValues DateRangePickerTitlePadding;
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(Dp.m9732constructorimpl(24), Dp.m9732constructorimpl(20), 0.0f, Dp.m9732constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = Dp.m9732constructorimpl(60);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$7(DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function2 function2, Function2 function22, boolean z, FocusRequester focusRequester, int i, int i2, Composer composer, int i3) {
        DateRangePicker(dateRangePickerState, modifier, datePickerFormatter, datePickerColors, function2, function22, z, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePickerContent$lambda$2(Long l, Long l2, long j, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        DateRangePickerContent(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchableDateEntryContent_eVtQiho$lambda$2(Long l, Long l2, long j, int i, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, int i2, int i3, Composer composer, int i4) {
        m3001SwitchableDateEntryContenteVtQiho(l, l2, j, i, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float VerticalMonthsList$lambda$1$1$0$0() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float VerticalMonthsList$lambda$1$1$0$1() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$3(LazyListState lazyListState, Long l, Long l2, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i, Composer composer, int i2) {
        VerticalMonthsList(lazyListState, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$1(DateRangePickerState dateRangePickerState, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C105@5060L199:DateRangePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-803011924, i, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:105)");
            }
            DateRangePickerDefaults.INSTANCE.m2992DateRangePickerTitleFNtVw6o(dateRangePickerState.mo3004getDisplayModejFl4v0(), PaddingKt.padding(Modifier.INSTANCE, DateRangePickerTitlePadding), datePickerColors.getTitleContentColor(), composer, 3120, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$2(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C112@5343L369:DateRangePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-331385278, i, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:112)");
            }
            DateRangePickerDefaults.INSTANCE.m2991DateRangePickerHeadlineqS89cEg(dateRangePickerState.getSelectedStartDateMillis(), dateRangePickerState.getSelectedEndDateMillis(), dateRangePickerState.mo3004getDisplayModejFl4v0(), datePickerFormatter, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerHeadlinePadding), datePickerColors.getHeadlineContentColor(), composer, 1597440, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateRangePicker(final DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, FocusRequester focusRequester, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DatePickerColors datePickerColors2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i6;
        boolean z2;
        int i7;
        Composer composer2;
        final DatePickerFormatter datePickerFormatter2;
        final FocusRequester focusRequester2;
        final Modifier modifier3;
        final DatePickerColors datePickerColors3;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        final DatePickerFormatter datePickerFormatter3;
        final DatePickerColors datePickerColors4;
        int i8;
        boolean z4;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function26;
        boolean z5;
        final DatePickerColors datePickerColors5;
        Modifier modifier4;
        int i10;
        FocusRequester focusRequester3;
        CalendarModel createCalendarModel;
        final DatePickerFormatter datePickerFormatter4;
        ComposableLambda composableLambda;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1969726368);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePicker)N(state,modifier,dateFormatter,colors,title,headline,showModeToggle,focusRequester)125@5861L207,149@6756L5,153@6912L1186,132@6073L2025:DateRangePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter)) {
                        i12 = 256;
                        i3 |= i12;
                    }
                }
                i12 = 128;
                i3 |= i12;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    datePickerColors2 = datePickerColors;
                    if (startRestartGroup.changed(datePickerColors2)) {
                        i11 = 2048;
                        i3 |= i11;
                    }
                } else {
                    datePickerColors2 = datePickerColors;
                }
                i11 = 1024;
                i3 |= i11;
            } else {
                datePickerColors2 = datePickerColors;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function23 = function2;
                i3 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function24 = function22;
                    i3 |= startRestartGroup.changedInstance(function24) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(focusRequester) ? 8388608 : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            ComposerKt.sourceInformation(startRestartGroup, "102@4878L47,103@4977L8,104@5026L239,111@5309L409,122@5794L29");
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i2 & 4) != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1173533681, "CC(remember):DateRangePicker.kt#9igjgp");
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = DatePickerDefaults.dateFormatter$default(DatePickerDefaults.INSTANCE, null, null, null, 7, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    datePickerFormatter3 = (DatePickerFormatter) rememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    i3 &= -897;
                                } else {
                                    datePickerFormatter3 = datePickerFormatter;
                                }
                                if ((i2 & 8) != 0) {
                                    datePickerColors4 = DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    datePickerColors4 = datePickerColors2;
                                }
                                if (i4 != 0) {
                                    i8 = i3;
                                    z4 = true;
                                    function23 = ComposableLambdaKt.rememberComposableLambda(-803011924, true, new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DateRangePicker$lambda$1;
                                            DateRangePicker$lambda$1 = DateRangePickerKt.DateRangePicker$lambda$1(DateRangePickerState.this, datePickerColors4, (Composer) obj, ((Integer) obj2).intValue());
                                            return DateRangePicker$lambda$1;
                                        }
                                    }, startRestartGroup, 54);
                                    i9 = 54;
                                } else {
                                    i8 = i3;
                                    z4 = true;
                                    i9 = 54;
                                }
                                if (i5 != 0) {
                                    function24 = ComposableLambdaKt.rememberComposableLambda(-331385278, z4, new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda14
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit DateRangePicker$lambda$2;
                                            DateRangePicker$lambda$2 = DateRangePickerKt.DateRangePicker$lambda$2(DateRangePickerState.this, datePickerFormatter3, datePickerColors4, (Composer) obj, ((Integer) obj2).intValue());
                                            return DateRangePicker$lambda$2;
                                        }
                                    }, startRestartGroup, i9);
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if (i7 != 0) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1173504387, "CC(remember):DateRangePicker.kt#9igjgp");
                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new FocusRequester();
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    DatePickerColors datePickerColors6 = datePickerColors4;
                                    focusRequester3 = (FocusRequester) rememberedValue2;
                                    z5 = z2;
                                    datePickerColors5 = datePickerColors6;
                                    function26 = function23;
                                    modifier4 = modifier2;
                                    i10 = i8;
                                } else {
                                    function26 = function23;
                                    z5 = z2;
                                    datePickerColors5 = datePickerColors4;
                                    modifier4 = modifier2;
                                    i10 = i8;
                                    focusRequester3 = focusRequester;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                datePickerFormatter3 = datePickerFormatter;
                                focusRequester3 = focusRequester;
                                function26 = function23;
                                modifier4 = modifier2;
                                i10 = i3;
                                z5 = z2;
                                datePickerColors5 = datePickerColors2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1969726368, i10, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:123)");
                            }
                            Locale locale = dateRangePickerState.getLocale();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1173502065, "CC(remember):DateRangePicker.kt#9igjgp");
                            boolean changed = startRestartGroup.changed(locale);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                if (dateRangePickerState instanceof BaseDatePickerStateImpl) {
                                    createCalendarModel = ((BaseDatePickerStateImpl) dateRangePickerState).getCalendarModel();
                                } else {
                                    createCalendarModel = CalendarModel_androidKt.createCalendarModel(dateRangePickerState.getLocale());
                                }
                                rememberedValue3 = createCalendarModel;
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            final CalendarModel calendarModel = (CalendarModel) rememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (z5) {
                                startRestartGroup.startReplaceGroup(-2018450762);
                                ComposerKt.sourceInformation(startRestartGroup, "138@6251L364");
                                datePickerFormatter4 = datePickerFormatter3;
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(1343236786, true, new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit DateRangePicker$lambda$5;
                                        DateRangePicker$lambda$5 = DateRangePickerKt.DateRangePicker$lambda$5(DateRangePickerState.this, datePickerColors5, (Composer) obj, ((Integer) obj2).intValue());
                                        return DateRangePicker$lambda$5;
                                    }
                                }, startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                datePickerFormatter4 = datePickerFormatter3;
                                startRestartGroup.startReplaceGroup(-2018063138);
                                startRestartGroup.endReplaceGroup();
                                composableLambda = null;
                            }
                            final FocusRequester focusRequester4 = focusRequester3;
                            final DatePickerColors datePickerColors7 = datePickerColors5;
                            DatePickerFormatter datePickerFormatter5 = datePickerFormatter4;
                            int i14 = i10 >> 9;
                            composer2 = startRestartGroup;
                            DatePickerKt.m2911DateEntryContainerau3_HiA(modifier4, function26, function24, composableLambda, datePickerColors5, TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionHeaderHeadlineFont(), startRestartGroup, 6), Dp.m9732constructorimpl(DatePickerModalTokens.INSTANCE.m5140getRangeSelectionHeaderContainerHeightD9Ej5fM() - HeaderHeightOffset), ComposableLambdaKt.rememberComposableLambda(684885105, true, new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DateRangePicker$lambda$6;
                                    DateRangePicker$lambda$6 = DateRangePickerKt.DateRangePicker$lambda$6(DateRangePickerState.this, calendarModel, datePickerFormatter4, datePickerColors7, focusRequester4, (Composer) obj, ((Integer) obj2).intValue());
                                    return DateRangePicker$lambda$6;
                                }
                            }, startRestartGroup, 54), composer2, ((i10 >> 3) & 14) | 14155776 | (i14 & 112) | (i14 & 896) | (57344 & (i10 << 3)));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            datePickerFormatter2 = datePickerFormatter5;
                            focusRequester2 = focusRequester4;
                            z3 = z5;
                            modifier3 = modifier4;
                            function25 = function26;
                            datePickerColors3 = datePickerColors5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            datePickerFormatter2 = datePickerFormatter;
                            focusRequester2 = focusRequester;
                            modifier3 = modifier2;
                            datePickerColors3 = datePickerColors2;
                            function25 = function23;
                            z3 = z2;
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function27 = function24;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit DateRangePicker$lambda$7;
                                    DateRangePicker$lambda$7 = DateRangePickerKt.DateRangePicker$lambda$7(DateRangePickerState.this, modifier3, datePickerFormatter2, datePickerColors3, function25, function27, z3, focusRequester2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return DateRangePicker$lambda$7;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    z2 = z;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    final Function2 function272 = function24;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function24 = function22;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                final Function2 function2722 = function24;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function23 = function2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function24 = function22;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            final Function2 function27222 = function24;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function23 = function2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function24 = function22;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        final Function2 function272222 = function24;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$5(final DateRangePickerState dateRangePickerState, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C142@6483L50,139@6273L324:DateRangePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1343236786, i, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:139)");
            }
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
            int mo3004getDisplayModejFl4v0 = dateRangePickerState.mo3004getDisplayModejFl4v0();
            ComposerKt.sourceInformationMarkerStart(composer, -1934597276, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changed = composer.changed(dateRangePickerState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DateRangePicker$lambda$5$0$0;
                        DateRangePicker$lambda$5$0$0 = DateRangePickerKt.DateRangePicker$lambda$5$0$0(DateRangePickerState.this, (DisplayMode) obj);
                        return DateRangePicker$lambda$5$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            DatePickerKt.m2915DisplayModeToggleButtoniUJLfQg(padding, mo3004getDisplayModejFl4v0, (Function1) rememberedValue, datePickerColors, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$5$0$0(DateRangePickerState dateRangePickerState, DisplayMode displayMode) {
        dateRangePickerState.mo3005setDisplayModevCnGnXg(displayMode.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$6(final DateRangePickerState dateRangePickerState, CalendarModel calendarModel, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, FocusRequester focusRequester, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C159@7229L468,170@7736L91,154@6922L1170:DateRangePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(684885105, i, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:154)");
            }
            Long selectedStartDateMillis = dateRangePickerState.getSelectedStartDateMillis();
            Long selectedEndDateMillis = dateRangePickerState.getSelectedEndDateMillis();
            long displayedMonthMillis = dateRangePickerState.getDisplayedMonthMillis();
            int mo3004getDisplayModejFl4v0 = dateRangePickerState.mo3004getDisplayModejFl4v0();
            ComposerKt.sourceInformationMarkerStart(composer, 1044600229, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changed = composer.changed(dateRangePickerState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit DateRangePicker$lambda$6$0$0;
                        DateRangePicker$lambda$6$0$0 = DateRangePickerKt.DateRangePicker$lambda$6$0$0(DateRangePickerState.this, (Long) obj, (Long) obj2);
                        return DateRangePicker$lambda$6$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function2 function2 = (Function2) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1044616076, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changed2 = composer.changed(dateRangePickerState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit DateRangePicker$lambda$6$1$0;
                        DateRangePicker$lambda$6$1$0 = DateRangePickerKt.DateRangePicker$lambda$6$1$0(DateRangePickerState.this, ((Long) obj).longValue());
                        return DateRangePicker$lambda$6$1$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            m3001SwitchableDateEntryContenteVtQiho(selectedStartDateMillis, selectedEndDateMillis, displayedMonthMillis, mo3004getDisplayModejFl4v0, function2, (Function1) rememberedValue2, calendarModel, dateRangePickerState.getYearRange(), datePickerFormatter, dateRangePickerState.getSelectableDates(), datePickerColors, focusRequester, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$6$0$0(DateRangePickerState dateRangePickerState, Long l, Long l2) {
        try {
            dateRangePickerState.setSelection(l, l2);
        } catch (IllegalArgumentException unused) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateRangePicker$lambda$6$1$0(DateRangePickerState dateRangePickerState, long j) {
        dateRangePickerState.setDisplayedMonthMillis(j);
        return Unit.INSTANCE;
    }

    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m3003rememberDateRangePickerStateIlFM19s(Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates, Composer composer, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, -2012087461, "C(rememberDateRangePickerState)N(initialSelectedStartDateMillis,initialSelectedEndDateMillis,initialDisplayedMonthMillis,yearRange,initialDisplayMode:c#material3.DisplayMode,selectableDates)284@12718L15,285@12827L476,285@12745L558:DateRangePicker.kt#uh7d8r");
        final Long l4 = (i3 & 1) != 0 ? null : l;
        final Long l5 = (i3 & 2) != 0 ? null : l2;
        final Long l6 = (i3 & 4) != 0 ? l4 : l3;
        final IntRange yearRange = (i3 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        final int m3050getPickerjFl4v0 = (i3 & 16) != 0 ? DisplayMode.INSTANCE.m3050getPickerjFl4v0() : i;
        final SelectableDates allDates = (i3 & 32) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i2, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:283)");
        }
        final Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.INSTANCE.Saver(allDates, defaultLocale);
        ComposerKt.sourceInformationMarkerStart(composer, -880746793, "CC(remember):DateRangePicker.kt#9igjgp");
        boolean z = true;
        boolean changedInstance = ((((i2 & 112) ^ 48) > 32 && composer.changed(l5)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && composer.changed(l4)) || (i2 & 6) == 4) | ((((i2 & 896) ^ 384) > 256 && composer.changed(l6)) || (i2 & 384) == 256) | composer.changedInstance(yearRange) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(m3050getPickerjFl4v0)) || (i2 & 24576) == 16384);
        if ((((458752 & i2) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 || !composer.changed(allDates)) && (i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 131072) {
            z = false;
        }
        boolean changed = changedInstance | z | composer.changed(defaultLocale);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DateRangePickerStateImpl rememberDateRangePickerState_IlFM19s$lambda$0$0;
                    rememberDateRangePickerState_IlFM19s$lambda$0$0 = DateRangePickerKt.rememberDateRangePickerState_IlFM19s$lambda$0$0(l4, l5, l6, yearRange, m3050getPickerjFl4v0, allDates, defaultLocale);
                    return rememberDateRangePickerState_IlFM19s$lambda$0$0;
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m6147rememberSaveable(objArr, (Saver) Saver, (Function0) rememberedValue, composer, 0);
        dateRangePickerStateImpl.setSelectableDates(allDates);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DateRangePickerStateImpl rememberDateRangePickerState_IlFM19s$lambda$0$0(Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates, Locale locale) {
        return new DateRangePickerStateImpl(l, l2, l3, intRange, i, selectableDates, locale, null);
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m3000DateRangePickerStateHVP43zI$default(Locale locale, Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        if ((i2 & 8) != 0) {
            l3 = l;
        }
        if ((i2 & 16) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i2 & 32) != 0) {
            i = DisplayMode.INSTANCE.m3050getPickerjFl4v0();
        }
        if ((i2 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m2999DateRangePickerStateHVP43zI(locale, l, l2, l3, intRange, i, selectableDates);
    }

    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m2999DateRangePickerStateHVP43zI(Locale locale, Long l, Long l2, Long l3, IntRange intRange, int i, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l, l2, l3, intRange, i, selectableDates, locale, null);
    }

    /* renamed from: SwitchableDateEntryContent-eVtQiho, reason: not valid java name */
    private static final void m3001SwitchableDateEntryContenteVtQiho(final Long l, final Long l2, final long j, final int i, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final FocusRequester focusRequester, Composer composer, final int i2, final int i3) {
        int i4;
        Long l3;
        Function2<? super Long, ? super Long, Unit> function22;
        Function1<? super Long, Unit> function12;
        int i5;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(621028059);
        ComposerKt.sourceInformation(startRestartGroup, "C(SwitchableDateEntryContent)N(selectedStartDateMillis,selectedEndDateMillis,displayedMonthMillis,displayMode:c#material3.DisplayMode,onDatesSelectionChange,onDisplayedMonthChange,calendarModel,yearRange,dateFormatter,selectableDates,colors,focusRequester)714@32363L7,716@32422L91,720@32521L1304,712@32259L1566:DateRangePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(l) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            l3 = l2;
            i4 |= startRestartGroup.changed(l3) ? 32 : 16;
        } else {
            l3 = l2;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function22 = function2;
            i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        } else {
            function22 = function2;
        }
        if ((196608 & i2) == 0) {
            function12 = function1;
            i4 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
        } else {
            function12 = function1;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= startRestartGroup.changedInstance(calendarModel) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(intRange) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= (i2 & GroupFlagsKt.HasRecompositionRequiredFlag) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= startRestartGroup.changed(selectableDates) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (startRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        int i6 = i5;
        if (!startRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(621028059, i4, i6, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:708)");
            }
            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -192460170, "CC(remember):DateRangePicker.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit SwitchableDateEntryContent_eVtQiho$lambda$0$0;
                        SwitchableDateEntryContent_eVtQiho$lambda$0$0 = DateRangePickerKt.SwitchableDateEntryContent_eVtQiho$lambda$0$0((SemanticsPropertyReceiver) obj);
                        return SwitchableDateEntryContent_eVtQiho$lambda$0$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Long l4 = l3;
            final Function2<? super Long, ? super Long, Unit> function23 = function22;
            final Function1<? super Long, Unit> function13 = function12;
            composer2 = startRestartGroup;
            CrossfadeKt.Crossfade(DisplayMode.m3042boximpl(i), SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null), (FiniteAnimationSpec<Float>) value, (String) null, ComposableLambdaKt.rememberComposableLambda(-773828161, true, new Function3() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit SwitchableDateEntryContent_eVtQiho$lambda$1;
                    SwitchableDateEntryContent_eVtQiho$lambda$1 = DateRangePickerKt.SwitchableDateEntryContent_eVtQiho$lambda$1(l, l4, j, function23, function13, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, (DisplayMode) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return SwitchableDateEntryContent_eVtQiho$lambda$1;
                }
            }, startRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 24576, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SwitchableDateEntryContent_eVtQiho$lambda$2;
                    SwitchableDateEntryContent_eVtQiho$lambda$2 = DateRangePickerKt.SwitchableDateEntryContent_eVtQiho$lambda$2(l, l2, j, i, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return SwitchableDateEntryContent_eVtQiho$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchableDateEntryContent_eVtQiho$lambda$0$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwitchableDateEntryContent_eVtQiho$lambda$1(Long l, Long l2, long j, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, FocusRequester focusRequester, DisplayMode displayMode, Composer composer, int i) {
        int i2;
        ComposerKt.sourceInformation(composer, "CN(mode:c#material3.DisplayMode):DateRangePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(displayMode.getValue()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-773828161, i2, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:721)");
            }
            int value = displayMode.getValue();
            if (DisplayMode.m3045equalsimpl0(value, DisplayMode.INSTANCE.m3050getPickerjFl4v0())) {
                composer.startReplaceGroup(-619517270);
                ComposerKt.sourceInformation(composer, "723@32603L619");
                DateRangePickerContent(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, 0);
                composer.endReplaceGroup();
            } else if (DisplayMode.m3045equalsimpl0(value, DisplayMode.INSTANCE.m3049getInputjFl4v0())) {
                composer.startReplaceGroup(-619495944);
                ComposerKt.sourceInformation(composer, "736@33272L537");
                DateRangeInputKt.DateRangeInputContent(l, l2, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, focusRequester, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2023979101);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void DateRangePickerContent(final Long l, final Long l2, final long j, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Long l3;
        Function2<? super Long, ? super Long, Unit> function22;
        Function1<? super Long, Unit> function12;
        SelectableDates selectableDates2;
        Object obj;
        DateRangePickerKt$DateRangePickerContent$1$1 dateRangePickerKt$DateRangePickerContent$1$1;
        Composer startRestartGroup = composer.startRestartGroup(-787063721);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangePickerContent)N(selectedStartDateMillis,selectedEndDateMillis,displayedMonthMillis,onDatesSelectionChange,onDisplayedMonthChange,calendarModel,yearRange,dateFormatter,selectableDates,colors)767@34501L64,770@34655L309,770@34628L336,778@34970L649:DateRangePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l3 = l2;
            i2 |= startRestartGroup.changed(l3) ? 32 : 16;
        } else {
            l3 = l2;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function22 = function2;
            i2 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i & 24576) == 0) {
            function12 = function1;
            i2 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            selectableDates2 = selectableDates;
            i2 |= startRestartGroup.changed(selectableDates2) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (!startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-787063721, i2, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:764)");
            }
            int coerceAtLeast = RangesKt.coerceAtLeast(calendarModel.getMonth(j).indexIn(intRange), 0);
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(coerceAtLeast, 0, startRestartGroup, 0, 2);
            Integer valueOf = Integer.valueOf(coerceAtLeast);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -453966964, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(rememberLazyListState) | startRestartGroup.changed(coerceAtLeast);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = null;
                dateRangePickerKt$DateRangePickerContent$1$1 = new DateRangePickerKt$DateRangePickerContent$1$1(rememberLazyListState, coerceAtLeast, null);
                startRestartGroup.updateRememberedValue(dateRangePickerKt$DateRangePickerContent$1$1);
            } else {
                dateRangePickerKt$DateRangePickerContent$1$1 = rememberedValue;
                obj = null;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dateRangePickerKt$DateRangePickerContent$1$1, startRestartGroup, 0);
            Modifier m1203paddingVpY3zN4$default = PaddingKt.m1203paddingVpY3zN4$default(Modifier.INSTANCE, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, obj);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1203paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(startRestartGroup);
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1922743819, "C779@35058L31,780@35098L515:DateRangePicker.kt#uh7d8r");
            DatePickerKt.WeekDays(datePickerColors, calendarModel, startRestartGroup, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            VerticalMonthsList(rememberLazyListState, l, l3, function22, function12, calendarModel, intRange, datePickerFormatter, selectableDates2, datePickerColors, startRestartGroup, ((i2 << 3) & PointerIconCompat.TYPE_TEXT) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (1879048192 & i2));
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit DateRangePickerContent$lambda$2;
                    DateRangePickerContent$lambda$2 = DateRangePickerKt.DateRangePickerContent$lambda$2(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return DateRangePickerContent$lambda$2;
                }
            });
        }
    }

    private static final void VerticalMonthsList(LazyListState lazyListState, final Long l, final Long l2, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Long l3;
        Long l4;
        Function2<? super Long, ? super Long, Unit> function22;
        Object month;
        DateRangePickerKt$VerticalMonthsList$2$1 dateRangePickerKt$VerticalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer startRestartGroup = composer.startRestartGroup(1257365001);
        ComposerKt.sourceInformation(startRestartGroup, "C(VerticalMonthsList)N(lazyListState,selectedStartDateMillis,selectedEndDateMillis,onDatesSelectionChange,onDisplayedMonthChange,calendarModel,yearRange,dateFormatter,selectableDates,colors)815@36348L159,821@36569L5,821@36576L3982,821@36512L4046,902@40593L229,902@40563L259:DateRangePicker.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(lazyListState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l3 = l;
            i2 |= startRestartGroup.changed(l3) ? 32 : 16;
        } else {
            l3 = l;
        }
        if ((i & 384) == 0) {
            l4 = l2;
            i2 |= startRestartGroup.changed(l4) ? 256 : 128;
        } else {
            l4 = l2;
        }
        if ((i & 3072) == 0) {
            function22 = function2;
            i2 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 67108864 : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((805306368 & i) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (!startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i2, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:812)");
            }
            final CalendarDate today = calendarModel.getToday();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1441972168, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changed = startRestartGroup.changed(intRange);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                month = calendarModel.getMonth(intRange.getFirst(), 1);
                startRestartGroup.updateRememberedValue(month);
            } else {
                month = rememberedValue;
            }
            final CalendarMonth calendarMonth = (CalendarMonth) month;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Long l5 = l3;
            final Function2<? super Long, ? super Long, Unit> function23 = function22;
            int i3 = i2;
            final Long l6 = l4;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), startRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalMonthsList$lambda$1;
                    VerticalMonthsList$lambda$1 = DateRangePickerKt.VerticalMonthsList$lambda$1(l5, l6, function23, lazyListState2, intRange, calendarModel, calendarMonth, datePickerFormatter, datePickerColors, today, selectableDates, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalMonthsList$lambda$1;
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1442108078, "CC(remember):DateRangePicker.kt#9igjgp");
            int i4 = i3 & 14;
            boolean changedInstance = (i4 == 4) | ((i3 & 57344) == 16384) | startRestartGroup.changedInstance(calendarModel) | startRestartGroup.changedInstance(intRange);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                lazyListState2 = lazyListState;
                dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState2, function1, calendarModel, intRange, null);
                startRestartGroup.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1);
            } else {
                dateRangePickerKt$VerticalMonthsList$2$1 = rememberedValue2;
                lazyListState2 = lazyListState;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(lazyListState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dateRangePickerKt$VerticalMonthsList$2$1, startRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalMonthsList$lambda$3;
                    VerticalMonthsList$lambda$3 = DateRangePickerKt.VerticalMonthsList$lambda$3(LazyListState.this, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalMonthsList$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$1(final Long l, final Long l2, final Function2 function2, final LazyListState lazyListState, final IntRange intRange, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final DatePickerFormatter datePickerFormatter, final DatePickerColors datePickerColors, final CalendarDate calendarDate, final SelectableDates selectableDates, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C822@36607L24,823@36673L59,824@36770L55,828@37006L318,849@37841L116,853@38004L2548,845@37628L2924:DateRangePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1090773432, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:822)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)N(getContext)616@28039L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(composer, 683736516, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                composer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Strings.Companion companion = Strings.INSTANCE;
            String m4895getString2EP1pXo = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_range_picker_scroll_to_previous_month), composer, 0);
            Strings.Companion companion2 = Strings.INSTANCE;
            String m4895getString2EP1pXo2 = Strings_androidKt.m4895getString2EP1pXo(Strings.m4811constructorimpl(R.string.m3c_date_range_picker_scroll_to_next_month), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, 261262006, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changed = composer.changed(l) | composer.changed(l2) | composer.changed(function2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalMonthsList$lambda$1$0$0;
                        VerticalMonthsList$lambda$1$0$0 = DateRangePickerKt.VerticalMonthsList$lambda$1$0$0(l, l2, function2, ((Long) obj).longValue());
                        return VerticalMonthsList$lambda$1$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            final Function1 function1 = (Function1) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            final List<CustomAccessibilityAction> customScrollActions = customScrollActions(lazyListState, coroutineScope, m4895getString2EP1pXo, m4895getString2EP1pXo2);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 261288524, "CC(remember):DateRangePicker.kt#9igjgp");
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalMonthsList$lambda$1$1$0;
                        VerticalMonthsList$lambda$1$1$0 = DateRangePickerKt.VerticalMonthsList$lambda$1$1$0((SemanticsPropertyReceiver) obj);
                        return VerticalMonthsList$lambda$1$1$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion3, false, (Function1) rememberedValue3, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 261296172, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(intRange) | composer.changedInstance(calendarModel) | composer.changed(calendarMonth) | composer.changedInstance(datePickerFormatter) | composer.changedInstance(customScrollActions) | composer.changed(datePickerColors) | composer.changed(l) | composer.changed(l2) | composer.changed(function1) | composer.changed(calendarDate) | composer.changed(selectableDates) | composer.changed(lazyListState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit VerticalMonthsList$lambda$1$2$0;
                        VerticalMonthsList$lambda$1$2$0 = DateRangePickerKt.VerticalMonthsList$lambda$1$2$0(IntRange.this, calendarModel, calendarMonth, l, l2, function1, calendarDate, datePickerFormatter, selectableDates, datePickerColors, lazyListState, customScrollActions, (LazyListScope) obj2);
                        return VerticalMonthsList$lambda$1$2$0;
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue4 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(semantics$default, lazyListState, null, false, null, null, null, false, null, (Function1) rememberedValue4, composer, 0, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$1$0$0(Long l, Long l2, Function2 function2, long j) {
        updateDateSelection(j, l, l2, function2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$1$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float VerticalMonthsList$lambda$1$1$0$0;
                VerticalMonthsList$lambda$1$1$0$0 = DateRangePickerKt.VerticalMonthsList$lambda$1$1$0$0();
                return Float.valueOf(VerticalMonthsList$lambda$1$1$0$0);
            }
        }, new Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float VerticalMonthsList$lambda$1$1$0$1;
                VerticalMonthsList$lambda$1$1$0$1 = DateRangePickerKt.VerticalMonthsList$lambda$1$1$0$1();
                return Float.valueOf(VerticalMonthsList$lambda$1$1$0$1);
            }
        }, false, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$1$2$0(IntRange intRange, final CalendarModel calendarModel, final CalendarMonth calendarMonth, final Long l, final Long l2, final Function1 function1, final CalendarDate calendarDate, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, final LazyListState lazyListState, final List list, LazyListScope lazyListScope) {
        LazyListScope.CC.items$default(lazyListScope, DatePickerKt.numberOfMonthsInRange(intRange), null, null, ComposableLambdaKt.composableLambdaInstance(682334170, true, new Function4() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Unit VerticalMonthsList$lambda$1$2$0$0;
                VerticalMonthsList$lambda$1$2$0$0 = DateRangePickerKt.VerticalMonthsList$lambda$1$2$0$0(CalendarModel.this, calendarMonth, l, l2, function1, calendarDate, datePickerFormatter, selectableDates, datePickerColors, lazyListState, list, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                return VerticalMonthsList$lambda$1$2$0$0;
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$1$2$0$0(final CalendarModel calendarModel, CalendarMonth calendarMonth, Long l, Long l2, Function1 function1, CalendarDate calendarDate, final DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, final DatePickerColors datePickerColors, LazyListState lazyListState, final List list, LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
        int i3;
        ComposerKt.sourceInformation(composer, "CN(it)856@38171L2357:DateRangePicker.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(682334170, i3, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:855)");
            }
            final CalendarMonth plusMonths = calendarModel.plusMonths(calendarMonth, i);
            SelectedRangeInfo selectedRangeInfo = null;
            Modifier fillParentMaxWidth$default = LazyItemScope.CC.fillParentMaxWidth$default(lazyItemScope, Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)N(content,modifier,measurePolicy)81@3355L27,84@3521L415:Layout.kt#80mrfh");
            int m = UByte$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillParentMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)410@16187L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5864constructorimpl = Updater.m5864constructorimpl(composer);
            Updater.m5872setimpl(m5864constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5872setimpl(m5864constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m5872setimpl(m5864constructorimpl, Integer.valueOf(m), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m5870reconcileimpl(m5864constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m5872setimpl(m5864constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 185127235, "C857@38312L5,857@38319L653,857@38242L730,896@40485L2,883@39764L746:DateRangePicker.kt#uh7d8r");
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont(), composer, 6), ComposableLambdaKt.rememberComposableLambda(-577031469, true, new Function2() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit VerticalMonthsList$lambda$1$2$0$0$0$0;
                    VerticalMonthsList$lambda$1$2$0$0$0$0 = DateRangePickerKt.VerticalMonthsList$lambda$1$2$0$0$0$0(DatePickerFormatter.this, plusMonths, calendarModel, list, datePickerColors, (Composer) obj, ((Integer) obj2).intValue());
                    return VerticalMonthsList$lambda$1$2$0$0$0$0;
                }
            }, composer, 54), composer, 48);
            if (l != null && l2 != null) {
                composer.startReplaceGroup(185956701);
                ComposerKt.sourceInformation(composer, "872@39162L489");
                long longValue = l.longValue();
                long longValue2 = l2.longValue();
                ComposerKt.sourceInformationMarkerStart(composer, 1945662157, "CC(remember):DateRangePicker.kt#9igjgp");
                boolean changed = composer.changed(longValue) | composer.changed(longValue2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SelectedRangeInfo.INSTANCE.calculateRangeInfo(plusMonths, calendarModel.getCanonicalDate(l.longValue()), calendarModel.getCanonicalDate(l2.longValue()));
                    composer.updateRememberedValue(rememberedValue);
                }
                selectedRangeInfo = (SelectedRangeInfo) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(186488258);
                composer.endReplaceGroup();
            }
            SelectedRangeInfo selectedRangeInfo2 = selectedRangeInfo;
            long utcTimeMillis = calendarDate.getUtcTimeMillis();
            Locale locale = calendarModel.getLocale();
            ComposerKt.sourceInformationMarkerStart(composer, 1945704006, "CC(remember):DateRangePicker.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            DatePickerKt.Month(plusMonths, function1, utcTimeMillis, l, l2, selectedRangeInfo2, datePickerFormatter, selectableDates, datePickerColors, locale, lazyListState, null, (Function0) rememberedValue2, composer, 0, 432);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$1$2$0$0$0$0(DatePickerFormatter datePickerFormatter, CalendarMonth calendarMonth, CalendarModel calendarModel, final List list, DatePickerColors datePickerColors, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C866@38814L45,858@38345L605:DateRangePicker.kt#uh7d8r");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577031469, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:858)");
            }
            String formatMonthYear = datePickerFormatter.formatMonthYear(Long.valueOf(calendarMonth.getStartUtcTimeMillis()), calendarModel.getLocale());
            if (formatMonthYear == null) {
                formatMonthYear = "-";
            }
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, CalendarMonthSubheadPadding);
            ComposerKt.sourceInformationMarkerStart(composer, -476444640, "CC(remember):DateRangePicker.kt#9igjgp");
            boolean changedInstance = composer.changedInstance(list);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit VerticalMonthsList$lambda$1$2$0$0$0$0$0$0;
                        VerticalMonthsList$lambda$1$2$0$0$0$0$0$0 = DateRangePickerKt.VerticalMonthsList$lambda$1$2$0$0$0$0$0$0(list, (SemanticsPropertyReceiver) obj);
                        return VerticalMonthsList$lambda$1$2$0$0$0$0$0$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m4292TextNvy7gAk(formatMonthYear, SemanticsModifierKt.semantics$default(padding, false, (Function1) rememberedValue, 1, null), datePickerColors.getSubheadContentColor(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262136);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerticalMonthsList$lambda$1$2$0$0$0$0$0$0(List list, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setCustomActions(semanticsPropertyReceiver, list);
        return Unit.INSTANCE;
    }

    private static final void updateDateSelection(long j, Long l, Long l2, Function2<? super Long, ? super Long, Unit> function2) {
        if ((l == null && l2 == null) || (l != null && l2 != null)) {
            function2.invoke(Long.valueOf(j), null);
        } else if (l != null && j >= l.longValue()) {
            function2.invoke(l, Long.valueOf(j));
        } else {
            function2.invoke(Long.valueOf(j), null);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m3002drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j) {
        float intBitsToFloat;
        float f = contentDrawScope.mo528toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f2 = contentDrawScope.mo528toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float f3 = 2;
        float f4 = (f2 - contentDrawScope.mo528toPx0680j_4(DatePickerModalTokens.INSTANCE.m5133getDateStateLayerHeightD9Ej5fM())) / f3;
        char c = ' ';
        float f5 = 7;
        float intBitsToFloat2 = (Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> 32)) - (f5 * f)) / f5;
        long gridStartCoordinates = selectedRangeInfo.getGridStartCoordinates();
        int m9864getXimpl = IntOffset.m9864getXimpl(gridStartCoordinates);
        int m9865getYimpl = IntOffset.m9865getYimpl(gridStartCoordinates);
        long gridEndCoordinates = selectedRangeInfo.getGridEndCoordinates();
        int m9864getXimpl2 = IntOffset.m9864getXimpl(gridEndCoordinates);
        int m9865getYimpl2 = IntOffset.m9865getYimpl(gridEndCoordinates);
        float f6 = f + intBitsToFloat2;
        float f7 = intBitsToFloat2 / f3;
        float f8 = (m9864getXimpl * f6) + (selectedRangeInfo.getFirstIsSelectionStart() ? f / f3 : 0.0f) + f7;
        float f9 = (m9865getYimpl * f2) + f4;
        float f10 = m9864getXimpl2 * f6;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            f /= f3;
        }
        float f11 = f10 + f + f7;
        float f12 = (m9865getYimpl2 * f2) + f4;
        boolean z = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            f8 = Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> 32)) - f8;
            f11 = Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> 32)) - f11;
        }
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        long m6511constructorimpl = Offset.m6511constructorimpl((Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L));
        if (m9865getYimpl == m9865getYimpl2) {
            intBitsToFloat = f11 - f8;
        } else {
            intBitsToFloat = z ? -f8 : Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> 32)) - f8;
        }
        DrawScope.CC.m7379drawRectnJ9OG0$default(contentDrawScope2, j, m6511constructorimpl, Size.m6579constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        if (m9865getYimpl != m9865getYimpl2) {
            int i = (m9865getYimpl2 - m9865getYimpl) - 1;
            while (i > 0) {
                char c2 = c;
                DrawScope.CC.m7379drawRectnJ9OG0$default(contentDrawScope2, j, Offset.m6511constructorimpl((Float.floatToRawIntBits(0.0f) << c2) | (Float.floatToRawIntBits((i * f2) + f9) & 4294967295L)), Size.m6579constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> c2))) << c2) | (Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
                i--;
                c = c2;
            }
            char c3 = c;
            long m6511constructorimpl2 = Offset.m6511constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> c3))) << c3));
            if (z) {
                f11 -= Float.intBitsToFloat((int) (contentDrawScope.mo7294getSizeNHjbRc() >> c3));
            }
            DrawScope.CC.m7379drawRectnJ9OG0$default(contentDrawScope2, j, m6511constructorimpl2, Size.m6579constructorimpl((Float.floatToRawIntBits(f11) << c3) | (Float.floatToRawIntBits(r3) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        }
    }

    private static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean customScrollActions$lambda$0;
                customScrollActions$lambda$0 = DateRangePickerKt.customScrollActions$lambda$0(LazyListState.this, coroutineScope);
                return Boolean.valueOf(customScrollActions$lambda$0);
            }
        }), new CustomAccessibilityAction(str2, new Function0() { // from class: androidx.compose.material3.DateRangePickerKt$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean customScrollActions$lambda$1;
                customScrollActions$lambda$1 = DateRangePickerKt.customScrollActions$lambda$1(LazyListState.this, coroutineScope);
                return Boolean.valueOf(customScrollActions$lambda$1);
            }
        })});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean customScrollActions$lambda$0(LazyListState lazyListState, CoroutineScope coroutineScope) {
        if (!lazyListState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DateRangePickerKt$customScrollActions$scrollUpAction$1$1(lazyListState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean customScrollActions$lambda$1(LazyListState lazyListState, CoroutineScope coroutineScope) {
        if (!lazyListState.getCanScrollForward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DateRangePickerKt$customScrollActions$scrollDownAction$1$1(lazyListState, null), 3, null);
        return true;
    }

    static {
        float f = 64;
        float f2 = 12;
        DateRangePickerTitlePadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(Dp.m9732constructorimpl(f), 0.0f, Dp.m9732constructorimpl(f2), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m1198PaddingValuesa9UjIt4$default(Dp.m9732constructorimpl(f), 0.0f, Dp.m9732constructorimpl(f2), Dp.m9732constructorimpl(f2), 2, null);
    }
}
