package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3 implements FlowCollector {
    public final /* synthetic */ MutableState $autoScrolling$delegate;
    public final /* synthetic */ ListIndices $listIndices;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ int $r8$classId = 1;

    public CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3(MutableState mutableState, LazyListState lazyListState, ListIndices listIndices) {
        this.$autoScrolling$delegate = mutableState;
        this.$listState = lazyListState;
        this.$listIndices = listIndices;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        int indexOf;
        switch (this.$r8$classId) {
            case 0:
                return emit(((Number) obj).intValue(), continuation);
            default:
                int intValue = ((Number) obj).intValue();
                LazyListState lazyListState = this.$listState;
                lazyListState.getClass();
                int i = lazyListState.getLayoutInfo().totalItemsCount;
                ListIndices listIndices = this.$listIndices;
                if (i <= 0 || ((LazyListMeasuredItem) CollectionsKt.last(lazyListState.getLayoutInfo().visibleItemsInfo)).index != lazyListState.getLayoutInfo().totalItemsCount - 1) {
                    Iterator it = listIndices.sectionRanges.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((IntRange) obj2).contains(intValue)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    IntRange intRange = (IntRange) obj2;
                    indexOf = intRange != null ? listIndices.sectionRanges.indexOf(intRange) : 0;
                } else {
                    indexOf = listIndices.sectionRanges.size() - 1;
                }
                this.$autoScrolling$delegate.setValue(new Integer(indexOf));
                return Unit.INSTANCE;
        }
    }

    public CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3(ListIndices listIndices, LazyListState lazyListState, MutableState mutableState) {
        this.$listIndices = listIndices;
        this.$listState = lazyListState;
        this.$autoScrolling$delegate = mutableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(int i, Continuation continuation) {
        CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1 cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1;
        int i2;
        if (continuation instanceof CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1) {
            cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1 = (CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1) continuation;
            int i3 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1.label;
                MutableState mutableState = this.$autoScrolling$delegate;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i4 = ((IntRange) this.$listIndices.sectionRanges.get(i)).first;
                    mutableState.setValue(Boolean.TRUE);
                    LazyListState lazyListState = this.$listState;
                    int i5 = -CanvasKt.headerSize(lazyListState);
                    cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1.label = 1;
                    if (lazyListState.animateScrollToItem(i4, i5, cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1(this, continuation);
        Object obj2 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = cardStylePickerViewKt$CardStylePicker$1$1$1$3$1$3$emit$1.label;
        MutableState mutableState2 = this.$autoScrolling$delegate;
        if (i2 != 0) {
        }
        mutableState2.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
