package com.squareup.cash.offers.presenters;

import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.offers.AppLocation;
import com.squareup.cash.cdf.offers.OffersDismissDetailSheet;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.cdf.offers.SheetDismissOrigin;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEvent;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFilterGroupSheetScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersHomeScreen;
import com.squareup.cash.offers.screens.OffersScreen$OffersTimelineScreen;
import com.squareup.cash.treehouse.analytics.GenericEvent;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.OfferType;
import com.squareup.protos.cash.tax.TaxEnvironment;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes6.dex */
public final class RealOffersAnalytics implements Analytics {
    public final RealAfterpayAppletAnalytics afterpayAppletAnalytics;
    public final Analytics analytics;
    public final AppLocation appLocation;
    public final Screen currentScreen;
    public final boolean isFromAfterpayApplet;
    public final boolean isOnGlobalSearchScreen;
    public final boolean isOnMerchantProfileScreen;
    public final boolean isOnOffersTabScreen;
    public final boolean isOnWalletScreen;
    public final LinkedHashSet loggedImpressionEventHashes;
    public final RealOffersAnalyticsHelper offersAnalyticsHelper;
    public final OffersScreen$OffersDetailsScreen offersDetailsScreen;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnalyticsEvent.ParamType.values().length];
            try {
                TaxEnvironment.Companion companion = AnalyticsEvent.ParamType.Companion;
                iArr[19] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TaxEnvironment.Companion companion2 = AnalyticsEvent.ParamType.Companion;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TaxEnvironment.Companion companion3 = AnalyticsEvent.ParamType.Companion;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TaxEnvironment.Companion companion4 = AnalyticsEvent.ParamType.Companion;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TaxEnvironment.Companion companion5 = AnalyticsEvent.ParamType.Companion;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TaxEnvironment.Companion companion6 = AnalyticsEvent.ParamType.Companion;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TaxEnvironment.Companion companion7 = AnalyticsEvent.ParamType.Companion;
                iArr[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TaxEnvironment.Companion companion8 = AnalyticsEvent.ParamType.Companion;
                iArr[6] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TaxEnvironment.Companion companion9 = AnalyticsEvent.ParamType.Companion;
                iArr[7] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TaxEnvironment.Companion companion10 = AnalyticsEvent.ParamType.Companion;
                iArr[8] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                TaxEnvironment.Companion companion11 = AnalyticsEvent.ParamType.Companion;
                iArr[9] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                TaxEnvironment.Companion companion12 = AnalyticsEvent.ParamType.Companion;
                iArr[10] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                TaxEnvironment.Companion companion13 = AnalyticsEvent.ParamType.Companion;
                iArr[11] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                TaxEnvironment.Companion companion14 = AnalyticsEvent.ParamType.Companion;
                iArr[12] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                TaxEnvironment.Companion companion15 = AnalyticsEvent.ParamType.Companion;
                iArr[13] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                TaxEnvironment.Companion companion16 = AnalyticsEvent.ParamType.Companion;
                iArr[14] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                TaxEnvironment.Companion companion17 = AnalyticsEvent.ParamType.Companion;
                iArr[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                TaxEnvironment.Companion companion18 = AnalyticsEvent.ParamType.Companion;
                iArr[16] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                TaxEnvironment.Companion companion19 = AnalyticsEvent.ParamType.Companion;
                iArr[17] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                TaxEnvironment.Companion companion20 = AnalyticsEvent.ParamType.Companion;
                iArr[18] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                TaxEnvironment.Companion companion21 = AnalyticsEvent.ParamType.Companion;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                TaxEnvironment.Companion companion22 = AnalyticsEvent.ParamType.Companion;
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                TaxEnvironment.Companion companion23 = AnalyticsEvent.ParamType.Companion;
                iArr[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                TaxEnvironment.Companion companion24 = AnalyticsEvent.ParamType.Companion;
                iArr[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                TaxEnvironment.Companion companion25 = AnalyticsEvent.ParamType.Companion;
                iArr[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                TaxEnvironment.Companion companion26 = AnalyticsEvent.ParamType.Companion;
                iArr[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                TaxEnvironment.Companion companion27 = AnalyticsEvent.ParamType.Companion;
                iArr[26] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealOffersAnalytics(Analytics analytics, RealOffersAnalyticsHelper realOffersAnalyticsHelper, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, Screen screen) {
        OfferSheetKey offerSheetKey;
        screen.getClass();
        this.analytics = analytics;
        this.offersAnalyticsHelper = realOffersAnalyticsHelper;
        this.afterpayAppletAnalytics = realAfterpayAppletAnalytics;
        this.currentScreen = screen;
        this.loggedImpressionEventHashes = new LinkedHashSet();
        boolean z = screen instanceof OffersScreen$OffersDetailsScreen;
        Screen screen2 = z ? ((OffersScreen$OffersDetailsScreen) screen).parentScreen : screen instanceof OffersScreen$OffersTimelineScreen ? ((OffersScreen$OffersTimelineScreen) screen).parentScreen : screen;
        this.isOnOffersTabScreen = (screen2 instanceof OffersScreen$OffersHomeScreen) || (screen2 instanceof OffersScreen$OffersFullscreenCollectionScreen) || (screen2 instanceof OffersScreen$OffersFilterGroupSheetScreen);
        this.isOnGlobalSearchScreen = screen2 instanceof GlobalSearchScreen;
        this.isOnMerchantProfileScreen = screen2 instanceof MerchantScreen$MerchantProfileScreen;
        this.isOnWalletScreen = screen2 instanceof WalletHomeScreen;
        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = z ? (OffersScreen$OffersDetailsScreen) screen : null;
        this.offersDetailsScreen = offersScreen$OffersDetailsScreen;
        this.isFromAfterpayApplet = ((offersScreen$OffersDetailsScreen == null || (offerSheetKey = offersScreen$OffersDetailsScreen.offerSheetKey) == null) ? null : offerSheetKey.offer_type) == OfferType.PAY_LATER_INN;
        this.appLocation = screen2 != null ? OffersAnalyticsKt.toAppLocation(screen2, getSearchFlowToken()) : null;
    }

    public static void trackGenericAnalyticsEvent$default(RealOffersAnalytics realOffersAnalytics, OffersAnalyticsEventSpec offersAnalyticsEventSpec) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        realOffersAnalytics.getClass();
        realOffersAnalytics.analytics.track(realOffersAnalytics.createEvent(offersAnalyticsEventSpec, emptyMap), null);
    }

    public static void trackGenericAnalyticsEvents$default(RealOffersAnalytics realOffersAnalytics, List list) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        realOffersAnalytics.trackGenericAnalyticsEvents(list, emptyMap);
    }

    public static void trackImpressionAnalyticsEvents$default(RealOffersAnalytics realOffersAnalytics, List list) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        LinkedHashSet linkedHashSet = realOffersAnalytics.loggedImpressionEventHashes;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = (OffersAnalyticsEventSpec) it.next();
            int hashCode = offersAnalyticsEventSpec.hashCode();
            if (!linkedHashSet.contains(Integer.valueOf(hashCode))) {
                realOffersAnalytics.analytics.track(realOffersAnalytics.createEvent(offersAnalyticsEventSpec, emptyMap), null);
                linkedHashSet.add(Integer.valueOf(hashCode));
            }
        }
    }

    public final void clearCache() {
        this.loggedImpressionEventHashes.clear();
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        this.analytics.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OffersAnalyticsEvent createEvent(OffersAnalyticsEventSpec offersAnalyticsEventSpec, Map map) {
        String referrerFlowToken;
        String flowToken;
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(offersAnalyticsEventSpec.serverParameters);
        boolean z = this.isFromAfterpayApplet;
        boolean z2 = this.isOnGlobalSearchScreen;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.offersAnalyticsHelper;
        boolean z3 = this.isOnOffersTabScreen;
        Origin origin = z3 ? realOffersAnalyticsHelper.origin : z2 ? Origin.DISCO : z ? Origin.AFTERPAY_APPLET : null;
        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = this.offersDetailsScreen;
        if (z3) {
            referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
        } else if (!z2 && !this.isOnMerchantProfileScreen && !this.isOnWalletScreen) {
            referrerFlowToken = z ? this.afterpayAppletAnalytics.afterpayAppletFlowToken : null;
        } else if (offersScreen$OffersDetailsScreen == null || (referrerFlowToken = offersScreen$OffersDetailsScreen.referrerFlowToken) == null) {
            referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
        }
        for (AnalyticsEvent.ClientGeneratedParam clientGeneratedParam : offersAnalyticsEventSpec.clientParameters) {
            String str = clientGeneratedParam.name;
            AnalyticsEvent.ParamType paramType = clientGeneratedParam.f1336type;
            if (str == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Data validation: AnalyticsEvent.ClientGeneratedParam.name == null");
                return null;
            }
            int i = paramType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paramType.ordinal()];
            Screen screen = this.currentScreen;
            switch (i) {
                case -1:
                case 12:
                case 13:
                case 14:
                case 17:
                case 18:
                    flowToken = null;
                    if (flowToken != null) {
                        mutableMap.put(str, flowToken);
                    }
                case 0:
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                case 1:
                    if (z2) {
                        if (offersScreen$OffersDetailsScreen != null) {
                            flowToken = offersScreen$OffersDetailsScreen.shopFlowToken;
                        }
                        flowToken = null;
                    } else {
                        flowToken = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
                    }
                    if (flowToken != null) {
                    }
                    break;
                case 2:
                    flowToken = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BROWSE);
                    if (flowToken != null) {
                    }
                    break;
                case 3:
                    flowToken = referrerFlowToken;
                    if (flowToken != null) {
                    }
                    break;
                case 4:
                    flowToken = getSearchFlowToken();
                    if (flowToken != null) {
                    }
                    break;
                case 5:
                    flowToken = screen instanceof OffersScreen$OffersDetailsScreen ? ((OffersScreen$OffersDetailsScreen) screen).sourceSection : realOffersAnalyticsHelper.searchSourceSection;
                    if (flowToken != null) {
                    }
                    break;
                case 6:
                    flowToken = realOffersAnalyticsHelper.searchSourceFilter;
                    if (flowToken != null) {
                    }
                    break;
                case 7:
                    flowToken = screen instanceof OffersScreen$OffersDetailsScreen ? ((OffersScreen$OffersDetailsScreen) screen).sourceScreen : realOffersAnalyticsHelper.searchSourceScreen;
                    if (flowToken != null) {
                    }
                    break;
                case 8:
                    if (origin != null) {
                        flowToken = origin.name();
                        if (flowToken != null) {
                        }
                    }
                    flowToken = null;
                    if (flowToken != null) {
                    }
                    break;
                case 9:
                    flowToken = (String) realOffersAnalyticsHelper.currentOfferTokenFlow.$$delegate_0.getValue();
                    if (flowToken != null) {
                    }
                    break;
                case 10:
                    flowToken = (String) realOffersAnalyticsHelper.currentMerchantTokenFlow.$$delegate_0.getValue();
                    if (flowToken != null) {
                    }
                    break;
                case 11:
                    flowToken = (String) realOffersAnalyticsHelper.currentMerchantNameFlow.$$delegate_0.getValue();
                    if (flowToken != null) {
                    }
                    break;
                case 15:
                    AppLocation appLocation = this.appLocation;
                    if (appLocation != null) {
                        flowToken = appLocation.toString();
                        if (flowToken != null) {
                        }
                    }
                    flowToken = null;
                    if (flowToken != null) {
                    }
                    break;
                case 16:
                    flowToken = (String) map.get(paramType);
                    if (flowToken != null) {
                    }
                    break;
                case 19:
                    flowToken = (String) map.get(paramType);
                    if (flowToken != null) {
                    }
                    break;
                case 20:
                    flowToken = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BOOST_PLASMA);
                    if (flowToken != null) {
                    }
                    break;
                case 21:
                    flowToken = (String) map.get(paramType);
                    if (flowToken != null) {
                    }
                    break;
                case 22:
                    flowToken = (String) map.get(paramType);
                    if (flowToken != null) {
                    }
                    break;
                case 23:
                    flowToken = (String) map.get(paramType);
                    if (flowToken != null) {
                    }
                    break;
                case 24:
                    if (offersScreen$OffersDetailsScreen != null) {
                        flowToken = offersScreen$OffersDetailsScreen.queryToken;
                        if (flowToken != null) {
                        }
                    }
                    flowToken = null;
                    if (flowToken != null) {
                    }
                    break;
                case 25:
                    throw new NotImplementedError("An operation is not implemented: add support for AFTERPAY_APPLET_FLOW_TOKEN");
                case 26:
                    flowToken = screen instanceof OffersScreen$OffersDetailsScreen ? ((OffersScreen$OffersDetailsScreen) screen).sourceScreen : realOffersAnalyticsHelper.searchSourceScreen;
                    if (flowToken != null) {
                    }
                    break;
                case 27:
                    flowToken = screen instanceof OffersScreen$OffersDetailsScreen ? ((OffersScreen$OffersDetailsScreen) screen).sourceSection : realOffersAnalyticsHelper.searchSourceSection;
                    if (flowToken != null) {
                    }
                    break;
            }
        }
        return new OffersAnalyticsEvent(offersAnalyticsEventSpec.name, mutableMap);
    }

    public final String getSearchFlowToken() {
        if (!this.isOnGlobalSearchScreen) {
            return this.isFromAfterpayApplet ? this.afterpayAppletAnalytics.searchFlowToken : this.offersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SEARCH);
        }
        OffersScreen$OffersDetailsScreen offersScreen$OffersDetailsScreen = this.offersDetailsScreen;
        if (offersScreen$OffersDetailsScreen != null) {
            return offersScreen$OffersDetailsScreen.searchFlowToken;
        }
        return null;
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        event.getClass();
        this.analytics.track(event, l);
    }

    public final void trackDetailsSheetDismissed(SheetDismissOrigin sheetDismissOrigin) {
        RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = this.afterpayAppletAnalytics;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = this.offersAnalyticsHelper;
        boolean z = this.isFromAfterpayApplet;
        String flowToken = z ? realAfterpayAppletAnalytics.shopFlowToken : realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
        String flowToken2 = z ? realAfterpayAppletAnalytics.searchFlowToken : realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SEARCH);
        Origin origin = realOffersAnalyticsHelper.origin;
        String referrerFlowToken = realOffersAnalyticsHelper.getReferrerFlowToken();
        Screen screen = this.currentScreen;
        this.analytics.track(new OffersDismissDetailSheet(origin, referrerFlowToken, flowToken, flowToken2, screen instanceof OffersScreen$OffersDetailsScreen ? ((OffersScreen$OffersDetailsScreen) screen).sourceSection : realOffersAnalyticsHelper.searchSourceSection, (String) realOffersAnalyticsHelper.currentMerchantTokenFlow.$$delegate_0.getValue(), (String) realOffersAnalyticsHelper.currentMerchantNameFlow.$$delegate_0.getValue(), (String) realOffersAnalyticsHelper.currentOfferTokenFlow.$$delegate_0.getValue(), sheetDismissOrigin), null);
    }

    public void trackGenericAnalyticsEvents(List list, Map map) {
        list.getClass();
        map.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = (OffersAnalyticsEventSpec) it.next();
            offersAnalyticsEventSpec.getClass();
            this.analytics.track(createEvent(offersAnalyticsEventSpec, map), null);
        }
    }

    @Override // com.squareup.cash.integration.analytics.Analytics, com.squareup.cash.treehouse.analytics.RawAnalyticsService
    public final void track(GenericEvent genericEvent) {
        this.analytics.track(genericEvent);
    }
}
