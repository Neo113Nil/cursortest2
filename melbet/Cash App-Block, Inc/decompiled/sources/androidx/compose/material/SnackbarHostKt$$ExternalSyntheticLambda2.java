package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.avatar.components.BadgedAvatarKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class SnackbarHostKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SnackbarHostKt$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    throw null;
                }
                gapComposer.skipToGroupEnd();
                return Unit.INSTANCE;
            case 1:
                LazyListState lazyListState = (LazyListState) obj2;
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(lazyListState.scrollPosition.index$delegate.getIntValue()), Integer.valueOf(lazyListState.scrollPosition.scrollOffset$delegate.getIntValue())});
            case 2:
                ((Integer) obj2).intValue();
                return new GridItemSpan(BadgedAvatarKt.GridItemSpan(1));
            case 3:
                LazyGridState lazyGridState = (LazyGridState) obj2;
                return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(lazyGridState.scrollPosition.index$delegate.getIntValue()), Integer.valueOf(lazyGridState.scrollPosition.scrollOffset$delegate.getIntValue())});
            case 4:
                Map performSave = ((LazySaveableStateHolder) obj2).performSave();
                if (performSave.isEmpty()) {
                    return null;
                }
                return performSave;
            case 5:
                DefaultPagerState defaultPagerState = (DefaultPagerState) obj2;
                return CollectionsKt__CollectionsKt.listOf(Integer.valueOf(((ParcelableSnapshotMutableIntState) defaultPagerState.scrollPosition.elementTypes).getIntValue()), Float.valueOf(RangesKt___RangesKt.coerceIn(((ParcelableSnapshotMutableFloatState) defaultPagerState.scrollPosition.fieldSortOrder).getFloatValue(), -0.5f, 0.5f)), Integer.valueOf(defaultPagerState.getPageCount()));
            case 6:
                TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj2;
                return CollectionsKt__CollectionsKt.listOf(Float.valueOf(textFieldScrollerPosition.offset$delegate.getFloatValue()), Boolean.valueOf(((Orientation) textFieldScrollerPosition.orientation$delegate.getValue()) == Orientation.Vertical));
            case 7:
                return Long.valueOf(((SelectionRegistrarImpl) obj2).incrementId.get());
            case 8:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (!gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                return (DismissValue) ((DismissState) obj2).currentValue$delegate.getValue();
            case 15:
                return (DrawerValue) ((ParcelableSnapshotMutableState) ((DrawerState) obj2).anchoredDraggableState.currentValue$delegate).getValue();
            case 16:
                return (ModalBottomSheetValue) ((ParcelableSnapshotMutableState) ((ModalBottomSheetState) obj2).anchoredDraggableState.currentValue$delegate).getValue();
            case 17:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            case 18:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            case 19:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            case 20:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            case 21:
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                return Float.valueOf(RecyclerView.DECELERATION_RATE);
            case 22:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicWidth(((Integer) obj2).intValue()));
            case 26:
                DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj2;
                Long selectedDateMillis = datePickerStateImpl.getSelectedDateMillis();
                Long valueOf = Long.valueOf(((CalendarMonth) datePickerStateImpl._displayedMonth.getValue()).startUtcTimeMillis);
                IntRange intRange = datePickerStateImpl.yearRange;
                return CollectionsKt__CollectionsKt.listOf(selectedDateMillis, valueOf, Integer.valueOf(intRange.first), Integer.valueOf(intRange.last), Integer.valueOf(datePickerStateImpl.m529getDisplayModejFl4v0()));
            case 27:
                return Integer.valueOf(((IntrinsicMeasurable) obj).minIntrinsicHeight(((Integer) obj2).intValue()));
            case 28:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicWidth(((Integer) obj2).intValue()));
            default:
                return Integer.valueOf(((IntrinsicMeasurable) obj).maxIntrinsicHeight(((Integer) obj2).intValue()));
        }
    }
}
