package com.squareup.cash.offers.views.home;

import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfferTileKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ OffersHomeViewModelV2.Loaded.OfferItem f$1;

    public /* synthetic */ OfferTileKt$$ExternalSyntheticLambda2(OffersHomeViewModelV2.Loaded.OfferItem offerItem, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = offerItem;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        OffersHomeViewModelV2.Loaded.OfferItem offerItem = this.f$1;
        switch (i) {
            case 0:
                function1.invoke(new OffersHomeViewEventV2.OfferClicked(offerItem.token));
                break;
            case 1:
                OffersHomeViewEventV2 offersHomeViewEventV2 = offerItem.event;
                if (offersHomeViewEventV2 != null) {
                    function1.invoke(offersHomeViewEventV2);
                }
                break;
            case 2:
                OffersHomeViewEventV2 offersHomeViewEventV22 = offerItem.event;
                if (offersHomeViewEventV22 != null) {
                    function1.invoke(offersHomeViewEventV22);
                }
                break;
            case 3:
                OffersHomeViewEventV2 offersHomeViewEventV23 = offerItem.event;
                if (offersHomeViewEventV23 != null) {
                    function1.invoke(offersHomeViewEventV23);
                }
                break;
            case 4:
                function1.invoke(new OffersHomeViewEventV2.OfferClicked(offerItem.token));
                break;
            case 5:
                OffersHomeViewEventV2 offersHomeViewEventV24 = offerItem.event;
                if (offersHomeViewEventV24 != null) {
                    function1.invoke(offersHomeViewEventV24);
                }
                break;
            case 6:
                OffersHomeViewEventV2 offersHomeViewEventV25 = offerItem.event;
                if (offersHomeViewEventV25 != null) {
                    function1.invoke(offersHomeViewEventV25);
                }
                break;
            default:
                OffersHomeViewEventV2 offersHomeViewEventV26 = offerItem.event;
                if (offersHomeViewEventV26 != null) {
                    function1.invoke(offersHomeViewEventV26);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ OfferTileKt$$ExternalSyntheticLambda2(Function1 function1, OffersHomeViewModelV2.Loaded.OfferItem offerItem, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = offerItem;
    }
}
