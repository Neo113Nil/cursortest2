package com.squareup.cash.offers.views.listing;

import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.cash.offers.viewmodels.viewevents.ItemViewed;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class OffersSearchListingKt$OffersSearchListingBody_gNPyAyM$lambda$2$0$$inlined$itemsWithImpressions$1$2 implements Function0 {
    public final /* synthetic */ Object $item;
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ OffersSearchListingKt$OffersSearchListingBody_gNPyAyM$lambda$2$0$$inlined$itemsWithImpressions$1$2(int i, Object obj, Function1 function1) {
        this.$r8$classId = i;
        this.$item = obj;
        this.$onEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        Object obj = this.$item;
        switch (i) {
            case 0:
                if (obj instanceof ImpressionReportable) {
                    ImpressionReportable impressionReportable = (ImpressionReportable) obj;
                    if (!impressionReportable.getImpressionEventSpecs().isEmpty()) {
                        function1.invoke(new ItemViewed(impressionReportable.getImpressionEventSpecs()));
                    }
                }
                break;
            case 1:
                if (obj instanceof ImpressionReportable) {
                    ImpressionReportable impressionReportable2 = (ImpressionReportable) obj;
                    if (!impressionReportable2.getImpressionEventSpecs().isEmpty()) {
                        function1.invoke(new ItemViewed(impressionReportable2.getImpressionEventSpecs()));
                    }
                }
                break;
            default:
                if (obj instanceof ImpressionReportable) {
                    ImpressionReportable impressionReportable3 = (ImpressionReportable) obj;
                    if (!impressionReportable3.getImpressionEventSpecs().isEmpty()) {
                        function1.invoke(new ItemViewed(impressionReportable3.getImpressionEventSpecs()));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
