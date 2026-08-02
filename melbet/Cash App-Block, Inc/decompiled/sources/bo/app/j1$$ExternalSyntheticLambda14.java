package bo.app;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.recyclerview.widget.RecyclerView;
import array.SortOrder;
import com.braze.models.outgoing.BrazeProperties;
import com.google.android.gms.internal.common.zzj;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewEvent;
import com.squareup.cash.borrow.viewmodels.LoanSelectorItem;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewEvent;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.protos.cash.discover.api.app.v1.model.HeroImage;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ j1$$ExternalSyntheticLambda14(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i) {
        this.$r8$classId = 0;
        this.f$0 = brazeProperties;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = bigDecimal;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                break;
            case 1:
                AmountSelectorWidgetModel.Item item = (AmountSelectorWidgetModel.Item) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj2;
                MutableState mutableState = (MutableState) obj;
                parcelableSnapshotMutableIntState.setIntValue(i2);
                ((Function1) obj4).invoke(new BorrowAmountPickerViewEvent.SelectQuickAmount(i2));
                if (parcelableSnapshotMutableIntState.getIntValue() != -1 && !(item instanceof LoanSelectorItem.CustomAmount)) {
                    mutableState.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                ScrollState scrollState = (ScrollState) obj3;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) obj;
                int intValue = ((ParcelableSnapshotMutableIntState) obj2).getIntValue() + i2;
                SortOrder sortOrder = ((PromotionDetailsViewModel.DetailsPageData.DetailsPageV1) obj4).details.primary_content;
                HeroImage hero_image = sortOrder != null ? zzj.getHero_image(sortOrder) : null;
                float f2 = RecyclerView.DECELERATION_RATE;
                if (hero_image == null) {
                    f = 1.0f;
                } else {
                    if (intValue != 0) {
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = scrollState._maxValueState;
                        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = scrollState.value$delegate;
                        if (intValue <= parcelableSnapshotMutableIntState3.getIntValue()) {
                            f = Math.max(parcelableSnapshotMutableIntState4.getIntValue() - ((int) (parcelableSnapshotMutableIntState2.getIntValue() * 0.65d)), (parcelableSnapshotMutableIntState4.getIntValue() + intValue) - scrollState._maxValueState.getIntValue()) / intValue;
                        }
                    }
                    f = 0.0f;
                }
                if (Math.abs(f) <= Float.MAX_VALUE) {
                    f2 = RangesKt___RangesKt.coerceIn(f, RecyclerView.DECELERATION_RATE, 1.0f);
                }
                break;
            case 3:
                JobKt.launch$default((CoroutineScope) obj4, null, null, new GovernmentIdFeed$analyze$5((LazyListState) obj3, this.f$4, (ParcelableSnapshotMutableIntState) obj2, (MutableState) obj, (Continuation) null, 5), 3);
                break;
            case 4:
                OffersHomeViewModelV2.Loaded.OfferItem offerItem = (OffersHomeViewModelV2.Loaded.OfferItem) obj3;
                ((Function1) obj4).invoke(new OffersHomeViewEventV2.OfferViewed(offerItem.token, i2, ((List) obj).indexOf(offerItem), ((OffersHomeViewModelV2.Loaded.OffersSection) obj2).sectionId));
                break;
            default:
                Function0 function0 = (Function0) obj;
                ((Function1) obj4).invoke(new AddMoneyViewEvent.AmountPickerItemSelected((AddMoneyViewModel.AtmPicker.AmountPickerItem) obj3));
                if (i2 == ((AddMoneyViewModel.AtmPicker) obj2).amountPickerItems.size() - 1 && function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j1$$ExternalSyntheticLambda14(int i, Object obj, Object obj2, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState, int i2) {
        this.$r8$classId = i2;
        this.f$4 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = parcelableSnapshotMutableIntState;
        this.f$3 = mutableState;
    }

    public /* synthetic */ j1$$ExternalSyntheticLambda14(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$4 = i;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ j1$$ExternalSyntheticLambda14(Function1 function1, OffersHomeViewModelV2.Loaded.OfferItem offerItem, OffersHomeViewModelV2.Loaded.OffersSection offersSection, int i, List list) {
        this.$r8$classId = 4;
        this.f$0 = function1;
        this.f$1 = offerItem;
        this.f$2 = offersSection;
        this.f$4 = i;
        this.f$3 = list;
    }
}
