package com.squareup.cash.overlays;

import androidx.compose.runtime.MutableState;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter;
import com.squareup.cash.paymentpad.viewmodels.HomeViewEvent;
import com.squareup.cash.shopping.presenters.ProductSearchPresenter;
import com.squareup.cash.shopping.viewmodels.ShoppingJavascriptViewModel;
import com.squareup.cash.shopping.views.ProductSearchViewState;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class OverlayKt$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda1(ProductSearchPresenter productSearchPresenter, MutableState mutableState) {
        this.$r8$classId = 16;
        this.f$0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterable iterable;
        int i = this.$r8$classId;
        HomeViewEvent.QrCode qrCode = HomeViewEvent.QrCode.INSTANCE;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                ((Function0) mutableState.getValue()).invoke();
                return Unit.INSTANCE;
            case 1:
                return Float.valueOf(((Boolean) mutableState.getValue()).booleanValue() ? RecyclerView.DECELERATION_RATE : 1.0f);
            case 2:
                return ((OffersSearchViewModel) mutableState.getValue()).filterTokens;
            case 3:
                return Boolean.valueOf(((OffersSearchViewModel) mutableState.getValue()).isSearchMode);
            case 4:
                List list = ((FilterGroupSection) mutableState.getValue()).filter_group_items;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    FilterGroupSection.FilterGroupItem.Sheet sheet = ((FilterGroupSection.FilterGroupItem) it.next()).sheet;
                    if (sheet == null || (iterable = sheet.filter_items) == null) {
                        iterable = EmptyList.INSTANCE;
                    }
                    Iterable iterable2 = iterable;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        String str = ((FilterGroupSection.FilterGroupItem.FilterItem) it2.next()).filter_token;
                        if (str == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: FilterGroupItem.filter_token == null");
                            return null;
                        }
                        arrayList2.add(str);
                    }
                    arrayList.add(CollectionsKt.toSet(arrayList2));
                }
                return arrayList;
            case 5:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 6:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 7:
                Iterator it3 = ((DistributionWheelViewModel) mutableState.getValue()).allocations.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i2 = -1;
                    } else if (!(((DistributionWheelViewModel.Allocation) it3.next()).getTreatment() instanceof DistributionWheelViewModel.Allocation.Treatment.InteractableSelected)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            case 8:
                return ((MainPaymentPadPresenter.State) mutableState.getValue()).rawAmount;
            case 9:
                ((Function1) mutableState.getValue()).invoke(qrCode);
                return Unit.INSTANCE;
            case 10:
                ((Function1) mutableState.getValue()).invoke(HomeViewEvent.PayRequestNearby.INSTANCE);
                return Unit.INSTANCE;
            case 11:
                ((Function1) mutableState.getValue()).invoke(qrCode);
                return Unit.INSTANCE;
            case 12:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 13:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 14:
                mutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 16:
                return ProductSearchPresenter.toFiltersProto(((ProductSearchPresenter.State) mutableState.getValue()).filters);
            case 17:
                return ((ShoppingJavascriptViewModel) mutableState.getValue()).paykitInfoToastState;
            case 18:
                mutableState.setValue("");
                return Unit.INSTANCE;
            case 19:
                mutableState.setValue(ProductSearchViewState.copy$default((ProductSearchViewState) mutableState.getValue(), "", false, false, false, 30));
                return Unit.INSTANCE;
            case 20:
                mutableState.setValue(null);
                return Unit.INSTANCE;
            case 21:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 22:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 23:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 24:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 25:
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 26:
                return (ActivityEmbeddedViewModel) ((UiCallbackModel) mutableState.getValue()).model;
            case 27:
                return (ActivityEmbeddedViewModel) ((UiCallbackModel) mutableState.getValue()).model;
            case 28:
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                return (ActivityEmbeddedViewModel) ((UiCallbackModel) mutableState.getValue()).model;
        }
    }

    public /* synthetic */ OverlayKt$$ExternalSyntheticLambda1(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }
}
