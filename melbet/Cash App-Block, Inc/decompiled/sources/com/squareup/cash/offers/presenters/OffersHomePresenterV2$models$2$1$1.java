package com.squareup.cash.offers.presenters;

import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.BoostAction;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.cdf.offers.OfferUpdateType;
import com.squareup.cash.cdf.offers.OffersBrowseViewItem;
import com.squareup.cash.cdf.offers.Screen;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$RewardMetadata;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.backend.real.RealOffersInflightStateManager;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreenV2;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreenV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import com.squareup.cash.screens.Back;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class OffersHomePresenterV2$models$2$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ LocalHomePresenter this$0;

    public OffersHomePresenterV2$models$2$1$1(LocalHomePresenter localHomePresenter) {
        this.this$0 = localHomePresenter;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        final LocalHomePresenter localHomePresenter = this.this$0;
        switch (i) {
            case 0:
                BoostAction boostAction = (BoostAction) obj;
                if (!(boostAction instanceof BoostAction.Blockers)) {
                    if (!(boostAction instanceof BoostAction.Error)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) localHomePresenter.navigator).goTo(((BoostAction.Blockers) boostAction).screen);
                }
                break;
            default:
                RealBoostRepository realBoostRepository = (RealBoostRepository) localHomePresenter.store;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                RealOffersAnalyticsV2 realOffersAnalyticsV2 = (RealOffersAnalyticsV2) localHomePresenter.localHomeGeoPresenterFactory;
                final OffersHomeViewEventV2 offersHomeViewEventV2 = (OffersHomeViewEventV2) obj;
                if (!(offersHomeViewEventV2 instanceof OffersHomeViewEventV2.BackClicked)) {
                    if (!(offersHomeViewEventV2 instanceof OffersHomeViewEventV2.OfferClicked)) {
                        if (!(offersHomeViewEventV2 instanceof OffersHomeViewEventV2.OfferAdded)) {
                            if (!(offersHomeViewEventV2 instanceof OffersHomeViewEventV2.OfferRemoved)) {
                                if (!(offersHomeViewEventV2 instanceof OffersHomeViewEventV2.OfferViewed)) {
                                    if (!(offersHomeViewEventV2 instanceof OffersHomeViewEventV2.GreenStatusClicked)) {
                                        if (!(offersHomeViewEventV2 instanceof OffersHomeViewEventV2.UrlClicked)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            ((RealRouter) localHomePresenter.embeddedMapEnabled$delegate).route(new RoutingParams(OffersScreen$OffersHomeScreenV2.INSTANCE, null, null, null, null, null, 510), "https://cash.app/help/6484-cash-app-pay");
                                        }
                                    } else {
                                        String str = ((OffersHomeViewEventV2.GreenStatusClicked) offersHomeViewEventV2).offerId;
                                        realOffersAnalyticsV2.trackOffersLockedOfferUpsellOpen(str);
                                        screenNavigator.goTo(new OffersScreen$OffersGreenStatusScreen(str));
                                    }
                                } else {
                                    OffersHomeViewEventV2.OfferViewed offerViewed = (OffersHomeViewEventV2.OfferViewed) offersHomeViewEventV2;
                                    String str2 = offerViewed.offerId;
                                    String str3 = offerViewed.sectionId;
                                    int i2 = offerViewed.sectionRowIndex;
                                    int i3 = offerViewed.rowIndex;
                                    RealOffersAnalyticsHelper realOffersAnalyticsHelper = realOffersAnalyticsV2.offersAnalyticsHelper;
                                    OffersAnalyticsHelper$RewardMetadata offersAnalyticsHelper$RewardMetadata = (OffersAnalyticsHelper$RewardMetadata) realOffersAnalyticsHelper.getRewardMetadataDict().get(str2);
                                    Analytics analytics = realOffersAnalyticsV2.analytics;
                                    String str4 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantToken : null;
                                    String str5 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.merchantName : null;
                                    String str6 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerToken : null;
                                    String str7 = offersAnalyticsHelper$RewardMetadata != null ? offersAnalyticsHelper$RewardMetadata.offerName : null;
                                    String referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
                                    Screen screen = Screen.OFFERS_HOME_V2;
                                    analytics.track(new OffersBrowseViewItem(referrerFlowToken, str3, Integer.valueOf(i2), Integer.valueOf(i3), str4, str5, str6, str7), null);
                                }
                            } else {
                                BlockersData.Flow.INSTANCE.getClass();
                                String generateToken = BlockersData.Flow.Companion.generateToken();
                                String str8 = ((OffersHomeViewEventV2.OfferRemoved) offersHomeViewEventV2).offerId;
                                realOffersAnalyticsV2.trackOffersDetailsOpenUpdateOffer(str8, generateToken, OfferUpdateType.REMOVE);
                                final int i4 = 1;
                                realBoostRepository.removeBoost(str8, generateToken, new Function1() { // from class: com.squareup.cash.offers.presenters.OffersHomePresenterV2$models$3$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        int i5 = i4;
                                        OffersHomeViewEventV2 offersHomeViewEventV22 = offersHomeViewEventV2;
                                        LocalHomePresenter localHomePresenter2 = localHomePresenter;
                                        switch (i5) {
                                            case 0:
                                                ((RealOffersInflightStateManager) localHomePresenter2.tabContentPresenterFactory).updateInflightState(((OffersHomeViewEventV2.OfferAdded) offersHomeViewEventV22).offerId, ((Boolean) obj2).booleanValue());
                                                break;
                                            default:
                                                ((RealOffersInflightStateManager) localHomePresenter2.tabContentPresenterFactory).updateInflightState(((OffersHomeViewEventV2.OfferRemoved) offersHomeViewEventV22).offerId, ((Boolean) obj2).booleanValue());
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                });
                            }
                        } else {
                            BlockersData.Flow.INSTANCE.getClass();
                            String generateToken2 = BlockersData.Flow.Companion.generateToken();
                            OffersHomeViewEventV2.OfferAdded offerAdded = (OffersHomeViewEventV2.OfferAdded) offersHomeViewEventV2;
                            String str9 = offerAdded.offerId;
                            realOffersAnalyticsV2.trackOffersDetailsOpenUpdateOffer(str9, generateToken2, OfferUpdateType.ADD);
                            final int i5 = 0;
                            realBoostRepository.addBoostMultiSelect(str9, generateToken2, new Function1() { // from class: com.squareup.cash.offers.presenters.OffersHomePresenterV2$models$3$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    int i52 = i5;
                                    OffersHomeViewEventV2 offersHomeViewEventV22 = offersHomeViewEventV2;
                                    LocalHomePresenter localHomePresenter2 = localHomePresenter;
                                    switch (i52) {
                                        case 0:
                                            ((RealOffersInflightStateManager) localHomePresenter2.tabContentPresenterFactory).updateInflightState(((OffersHomeViewEventV2.OfferAdded) offersHomeViewEventV22).offerId, ((Boolean) obj2).booleanValue());
                                            break;
                                        default:
                                            ((RealOffersInflightStateManager) localHomePresenter2.tabContentPresenterFactory).updateInflightState(((OffersHomeViewEventV2.OfferRemoved) offersHomeViewEventV22).offerId, ((Boolean) obj2).booleanValue());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, null);
                            if (offerAdded.isCAP) {
                                screenNavigator.goTo(new OffersScreen$OffersDetailsScreenV2(str9, null));
                            }
                        }
                    } else {
                        String str10 = ((OffersHomeViewEventV2.OfferClicked) offersHomeViewEventV2).offerId;
                        realOffersAnalyticsV2.trackOffersDetailsOpenViewOfferDetails(str10);
                        screenNavigator.goTo(new OffersScreen$OffersDetailsScreenV2(str10, null));
                    }
                } else {
                    screenNavigator.goTo(Back.INSTANCE);
                }
                break;
        }
        return null;
    }

    public OffersHomePresenterV2$models$2$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter) {
        this.this$0 = localHomePresenter;
    }
}
