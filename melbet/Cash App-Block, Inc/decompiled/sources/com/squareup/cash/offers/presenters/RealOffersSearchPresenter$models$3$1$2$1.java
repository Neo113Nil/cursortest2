package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.ClipOp;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewEvent$Retry;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.limits.backend.api.LimitsPageletStore$VersionedLimitsPagelet;
import com.squareup.cash.limits.viewmodels.LimitsInlineMessageViewEvent;
import com.squareup.cash.limits.viewmodels.UnifiedInlineMessageButton$Network;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.maps.viewmodels.SearchLocation;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class RealOffersSearchPresenter$models$3$1$2$1 implements FlowCollector {
    public final /* synthetic */ MutableState $lastResponse$delegate;
    public final /* synthetic */ MutableState $listViewModel$delegate;
    public final /* synthetic */ int $r8$classId;

    public RealOffersSearchPresenter$models$3$1$2$1(MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 0;
        this.$lastResponse$delegate = mutableState;
        this.$listViewModel$delegate = mutableState2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        UnifiedInlineMessageButton$Network unifiedInlineMessageButton$Network = null;
        MutableState mutableState = this.$listViewModel$delegate;
        MutableState mutableState2 = this.$lastResponse$delegate;
        switch (i) {
            case 0:
                String str = (String) obj;
                OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) mutableState2.getValue();
                if (offersTabSearchResponse != null) {
                    mutableState.setValue(new OffersSearchViewModel.OffersSearchListViewModel.Loaded(ClipOp.toSearchListItems(offersTabSearchResponse, str)));
                }
                return Unit.INSTANCE;
            case 1:
                if (((OnboardingInternalRouteViewEvent$Retry) obj) == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                OnboardingInternalRouteViewModel onboardingInternalRouteViewModel = (OnboardingInternalRouteViewModel) mutableState2.getValue();
                String str2 = onboardingInternalRouteViewModel.errorTitle;
                String str3 = onboardingInternalRouteViewModel.errorBody;
                String str4 = onboardingInternalRouteViewModel.errorButton;
                str2.getClass();
                str3.getClass();
                str4.getClass();
                mutableState2.setValue(new OnboardingInternalRouteViewModel(true, str2, str3, str4));
                mutableState.setValue(new Object());
                return Unit.INSTANCE;
            case 2:
                LimitsInlineMessageViewEvent limitsInlineMessageViewEvent = (LimitsInlineMessageViewEvent) obj;
                if (limitsInlineMessageViewEvent instanceof LimitsInlineMessageViewEvent.PrimaryButtonClicked) {
                    LimitsPageletStore$VersionedLimitsPagelet limitsPageletStore$VersionedLimitsPagelet = (LimitsPageletStore$VersionedLimitsPagelet) mutableState2.getValue();
                    limitsPageletStore$VersionedLimitsPagelet.getClass();
                    GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton = limitsPageletStore$VersionedLimitsPagelet.inlineMessageSource.message.primary_button;
                    if (limitsHubInlineMessageButton != null) {
                        unifiedInlineMessageButton$Network = new UnifiedInlineMessageButton$Network(limitsHubInlineMessageButton);
                    }
                } else {
                    if (!(limitsInlineMessageViewEvent instanceof LimitsInlineMessageViewEvent.SecondaryButtonClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    LimitsPageletStore$VersionedLimitsPagelet limitsPageletStore$VersionedLimitsPagelet2 = (LimitsPageletStore$VersionedLimitsPagelet) mutableState2.getValue();
                    limitsPageletStore$VersionedLimitsPagelet2.getClass();
                    GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton2 = limitsPageletStore$VersionedLimitsPagelet2.inlineMessageSource.message.secondary_button;
                    if (limitsHubInlineMessageButton2 != null) {
                        unifiedInlineMessageButton$Network = new UnifiedInlineMessageButton$Network(limitsHubInlineMessageButton2);
                    }
                }
                mutableState.setValue(unifiedInlineMessageButton$Network);
                return Unit.INSTANCE;
            default:
                LocationViewModel locationViewModel = (LocationViewModel) obj;
                if (locationViewModel != null) {
                    SearchLocation searchLocation = new SearchLocation(locationViewModel.lat, locationViewModel.lng);
                    mutableState2.setValue(locationViewModel);
                    mutableState.setValue(searchLocation);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ RealOffersSearchPresenter$models$3$1$2$1(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, int i) {
        this.$r8$classId = i;
        this.$lastResponse$delegate = mutableState;
        this.$listViewModel$delegate = mutableState2;
    }
}
