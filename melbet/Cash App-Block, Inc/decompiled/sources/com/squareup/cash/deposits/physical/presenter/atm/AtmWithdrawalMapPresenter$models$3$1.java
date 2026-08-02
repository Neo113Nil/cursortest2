package com.squareup.cash.deposits.physical.presenter.atm;

import androidx.biometric.DeviceUtils;
import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.atm.AtmWithdrawalViewVisibleNearbyRetailers;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.deposits.physical.backend.api.retailer.AtmRetailerLocationManager$Result;
import com.squareup.cash.deposits.physical.screens.PhysicalDepositErrorScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmMarkerLocation;
import com.squareup.cash.maps.viewmodels.CashMapViewEvent;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.scannerview.SizeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AtmWithdrawalMapPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $atmLocations$delegate;
    public final /* synthetic */ MutableState $mapMovement$delegate;
    public final /* synthetic */ MutableState $searchedLocation$delegate;
    public AtmWithdrawalMapPresenter L$0;
    public MutableState L$1;
    public MutableState L$2;
    public CashMapViewEvent.MapMovementFinished L$3;
    public int label;
    public final /* synthetic */ AtmWithdrawalMapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AtmWithdrawalMapPresenter$models$3$1(MutableState mutableState, AtmWithdrawalMapPresenter atmWithdrawalMapPresenter, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$mapMovement$delegate = mutableState;
        this.this$0 = atmWithdrawalMapPresenter;
        this.$searchedLocation$delegate = mutableState2;
        this.$atmLocations$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AtmWithdrawalMapPresenter$models$3$1(this.$mapMovement$delegate, this.this$0, this.$searchedLocation$delegate, this.$atmLocations$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AtmWithdrawalMapPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CashMapViewEvent.MapMovementFinished mapMovementFinished;
        MutableState mutableState;
        MutableState mutableState2;
        AtmWithdrawalMapPresenter atmWithdrawalMapPresenter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            CashMapViewEvent.MapMovementFinished mapMovementFinished2 = (CashMapViewEvent.MapMovementFinished) this.$mapMovement$delegate.getValue();
            if (mapMovementFinished2 != null) {
                MutableState mutableState3 = this.$searchedLocation$delegate;
                if (((LocationViewModel) mutableState3.getValue()) != null && !DeviceUtils.isDisplayingLocation(mapMovementFinished2, (LocationViewModel) mutableState3.getValue())) {
                    mutableState3.setValue(null);
                }
                AtmWithdrawalMapPresenter atmWithdrawalMapPresenter2 = this.this$0;
                SizeMap sizeMap = atmWithdrawalMapPresenter2.atmLocationManager;
                double d = mapMovementFinished2.lat;
                double d2 = mapMovementFinished2.lng;
                double d3 = mapMovementFinished2.zoomRadiusInMeters;
                this.L$0 = atmWithdrawalMapPresenter2;
                this.L$1 = mutableState3;
                MutableState mutableState4 = this.$atmLocations$delegate;
                this.L$2 = mutableState4;
                this.L$3 = mapMovementFinished2;
                this.label = 1;
                Object retailersNearLocation = sizeMap.retailersNearLocation(d, d2, d3, this);
                if (retailersNearLocation == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mapMovementFinished = mapMovementFinished2;
                mutableState = mutableState3;
                mutableState2 = mutableState4;
                obj = retailersNearLocation;
                atmWithdrawalMapPresenter = atmWithdrawalMapPresenter2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mapMovementFinished = this.L$3;
        mutableState2 = this.L$2;
        mutableState = this.L$1;
        atmWithdrawalMapPresenter = this.L$0;
        SafeTrace.throwOnFailure(obj);
        AtmRetailerLocationManager$Result atmRetailerLocationManager$Result = (AtmRetailerLocationManager$Result) obj;
        if (atmRetailerLocationManager$Result instanceof AtmRetailerLocationManager$Result.Success) {
            if (DeviceUtils.isDisplayingLocation(mapMovementFinished, (LocationViewModel) mutableState.getValue()) && ((AtmRetailerLocationManager$Result.Success) atmRetailerLocationManager$Result).locations.isEmpty()) {
                BetterNavigator.ScreenNavigator screenNavigator = atmWithdrawalMapPresenter.navigator;
                RetailerMapBlocker.MapScreen mapScreen = atmWithdrawalMapPresenter.mapScreen;
                String str = mapScreen.no_nearby_locations_title_text;
                str.getClass();
                String str2 = mapScreen.no_nearby_locations_detail_text;
                str2.getClass();
                String str3 = mapScreen.no_nearby_locations_button_text;
                str3.getClass();
                screenNavigator.goTo(new PhysicalDepositErrorScreen(str, str2, null, str3, null));
            } else {
                List list = ((AtmRetailerLocationManager$Result.Success) atmRetailerLocationManager$Result).locations;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AtmMarkerLocation((GetRetailerLocationsResponse.RetailerLocation) it.next()));
                }
                mutableState2.setValue(arrayList);
                atmWithdrawalMapPresenter.analytics.track(new AtmWithdrawalViewVisibleNearbyRetailers(new Integer(list.size())), null);
            }
        }
        return Unit.INSTANCE;
    }
}
