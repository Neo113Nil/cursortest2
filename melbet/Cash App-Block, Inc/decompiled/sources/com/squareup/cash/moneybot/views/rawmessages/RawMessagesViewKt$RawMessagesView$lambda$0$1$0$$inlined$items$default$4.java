package com.squareup.cash.moneybot.views.rawmessages;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final class RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4 implements Function4 {
    public final /* synthetic */ List $items;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4(List list, int i) {
        this.$r8$classId = i;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        List list = this.$items;
        switch (i4) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    String str = (String) list.get(intValue);
                    gapComposer.startReplaceGroup(2003654861);
                    LazyListLayoutInfoKt.MessageJsonBlock(str, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    NearbyPayer nearbyPayer = (NearbyPayer) list.get(intValue3);
                    gapComposer2.startReplaceGroup(1510269196);
                    NearbyPayRequestViewKt.NearbyPayerRow(nearbyPayer, gapComposer2, 0);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((GapComposer) composer3).changed(lazyItemScopeImpl3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    ((Number) list.get(intValue5)).intValue();
                    gapComposer3.startReplaceGroup(-262828253);
                    InstitutionPickerScreenKt.InstitutionResultShimmer(SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f), gapComposer3, 6);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
