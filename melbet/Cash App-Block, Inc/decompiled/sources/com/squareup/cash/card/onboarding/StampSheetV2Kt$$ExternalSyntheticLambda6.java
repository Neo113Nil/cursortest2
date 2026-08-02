package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.squareup.cash.directory_ui.views.SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3;
import com.squareup.protos.franklin.common.Stamp;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final /* synthetic */ class StampSheetV2Kt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StampSheetViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ StampSheetV2Kt$$ExternalSyntheticLambda6(int i, StampSheetViewModel stampSheetViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = stampSheetViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        final Function1 function1 = this.f$1;
        final StampSheetViewModel stampSheetViewModel = this.f$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent.getClass();
                final List list = stampSheetViewModel.stamps;
                final int i3 = 0;
                lazyGridIntervalContent.items(list.size(), null, null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list, 13), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.card.onboarding.StampSheetV2Kt$StampSheetV2$lambda$1$0$3$0$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i4;
                        int i5;
                        int i6 = i3;
                        List list2 = list;
                        StampSheetViewModel stampSheetViewModel2 = stampSheetViewModel;
                        switch (i6) {
                            case 0:
                                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj2;
                                int intValue = ((Number) obj3).intValue();
                                Composer composer = (Composer) obj4;
                                int intValue2 = ((Number) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    i4 = intValue2 | (((GapComposer) composer).changed(lazyGridItemScopeImpl) ? 4 : 2);
                                } else {
                                    i4 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i4 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                }
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                                    Stamp stamp = (Stamp) list2.get(intValue);
                                    gapComposer.startReplaceGroup(-1450704079);
                                    boolean contains = stampSheetViewModel2.selectedStamps.contains(stamp);
                                    CanvasKt.StampCellV2(stamp, contains, contains || !stampSheetViewModel2.limitReached, function1, gapComposer, 0);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                LazyGridItemScopeImpl lazyGridItemScopeImpl2 = (LazyGridItemScopeImpl) obj2;
                                int intValue3 = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int intValue4 = ((Number) obj5).intValue();
                                if ((intValue4 & 6) == 0) {
                                    i5 = intValue4 | (((GapComposer) composer2).changed(lazyGridItemScopeImpl2) ? 4 : 2);
                                } else {
                                    i5 = intValue4;
                                }
                                if ((intValue4 & 48) == 0) {
                                    i5 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                                    Stamp stamp2 = (Stamp) list2.get(intValue3);
                                    gapComposer2.startReplaceGroup(-375252526);
                                    boolean contains2 = stampSheetViewModel2.selectedStamps.contains(stamp2);
                                    CanvasKt.Stamp(stamp2, contains2, contains2 || !stampSheetViewModel2.limitReached, function1, gapComposer2, 0);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1117249557));
                break;
            default:
                LazyGridIntervalContent lazyGridIntervalContent2 = (LazyGridIntervalContent) obj;
                lazyGridIntervalContent2.getClass();
                final List list2 = stampSheetViewModel.stamps;
                lazyGridIntervalContent2.items(list2.size(), null, null, new SectionKt$sectionItemsIndexed$$inlined$itemsIndexed$default$3(list2, 11), new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.card.onboarding.StampSheetV2Kt$StampSheetV2$lambda$1$0$3$0$$inlined$items$default$5
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i4;
                        int i5;
                        int i6 = i2;
                        List list22 = list2;
                        StampSheetViewModel stampSheetViewModel2 = stampSheetViewModel;
                        switch (i6) {
                            case 0:
                                LazyGridItemScopeImpl lazyGridItemScopeImpl = (LazyGridItemScopeImpl) obj2;
                                int intValue = ((Number) obj3).intValue();
                                Composer composer = (Composer) obj4;
                                int intValue2 = ((Number) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    i4 = intValue2 | (((GapComposer) composer).changed(lazyGridItemScopeImpl) ? 4 : 2);
                                } else {
                                    i4 = intValue2;
                                }
                                if ((intValue2 & 48) == 0) {
                                    i4 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                                }
                                GapComposer gapComposer = (GapComposer) composer;
                                if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                                    Stamp stamp = (Stamp) list22.get(intValue);
                                    gapComposer.startReplaceGroup(-1450704079);
                                    boolean contains = stampSheetViewModel2.selectedStamps.contains(stamp);
                                    CanvasKt.StampCellV2(stamp, contains, contains || !stampSheetViewModel2.limitReached, function1, gapComposer, 0);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                LazyGridItemScopeImpl lazyGridItemScopeImpl2 = (LazyGridItemScopeImpl) obj2;
                                int intValue3 = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int intValue4 = ((Number) obj5).intValue();
                                if ((intValue4 & 6) == 0) {
                                    i5 = intValue4 | (((GapComposer) composer2).changed(lazyGridItemScopeImpl2) ? 4 : 2);
                                } else {
                                    i5 = intValue4;
                                }
                                if ((intValue4 & 48) == 0) {
                                    i5 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                                    Stamp stamp2 = (Stamp) list22.get(intValue3);
                                    gapComposer2.startReplaceGroup(-375252526);
                                    boolean contains2 = stampSheetViewModel2.selectedStamps.contains(stamp2);
                                    CanvasKt.Stamp(stamp2, contains2, contains2 || !stampSheetViewModel2.limitReached, function1, gapComposer2, 0);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, true, -1117249557));
                break;
        }
        return Unit.INSTANCE;
    }
}
