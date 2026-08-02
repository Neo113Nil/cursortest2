package com.squareup.cash.afterpayapplet.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletErrorView;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletPurchasesView;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletPurchasesViewedAllOrders;
import com.squareup.cash.cdf.afterpayapplet.AfterpayAppletScreen;
import com.squareup.cash.cdf.offers.AfterpayFeature;
import com.squareup.cash.cdf.offers.OffersDismissSelectAfterpaySheet;
import com.squareup.cash.cdf.offers.Origin;
import com.squareup.cash.cdf.offers.Screen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.booklet.HeaderSectionKt;
import com.squareup.cash.treehouse.analytics.GenericEvent;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.tax.TaxEnvironment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletAnalytics implements Analytics {
    public String afterpayAppletFlowToken;
    public final Analytics analytics;
    public String lastTileEntrypointReferrerToken;
    public String merchantName;
    public String merchantToken;
    public String searchFlowToken;
    public String shopFlowToken;
    public final LinkedHashSet loggedImpressionEventHashes = new LinkedHashSet();
    public final LinkedHashSet loggedTileEntrypointImpressionHashes = new LinkedHashSet();
    public String query = "";
    public List filterTokens = EmptyList.INSTANCE;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnalyticsEvent.ParamType.values().length];
            try {
                TaxEnvironment.Companion companion = AnalyticsEvent.ParamType.Companion;
                iArr[24] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TaxEnvironment.Companion companion2 = AnalyticsEvent.ParamType.Companion;
                iArr[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TaxEnvironment.Companion companion3 = AnalyticsEvent.ParamType.Companion;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TaxEnvironment.Companion companion4 = AnalyticsEvent.ParamType.Companion;
                iArr[19] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                TaxEnvironment.Companion companion5 = AnalyticsEvent.ParamType.Companion;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                TaxEnvironment.Companion companion6 = AnalyticsEvent.ParamType.Companion;
                iArr[20] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                TaxEnvironment.Companion companion7 = AnalyticsEvent.ParamType.Companion;
                iArr[15] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                TaxEnvironment.Companion companion8 = AnalyticsEvent.ParamType.Companion;
                iArr[25] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                TaxEnvironment.Companion companion9 = AnalyticsEvent.ParamType.Companion;
                iArr[26] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                TaxEnvironment.Companion companion10 = AnalyticsEvent.ParamType.Companion;
                iArr[5] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                TaxEnvironment.Companion companion11 = AnalyticsEvent.ParamType.Companion;
                iArr[3] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                TaxEnvironment.Companion companion12 = AnalyticsEvent.ParamType.Companion;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                TaxEnvironment.Companion companion13 = AnalyticsEvent.ParamType.Companion;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                TaxEnvironment.Companion companion14 = AnalyticsEvent.ParamType.Companion;
                iArr[2] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                TaxEnvironment.Companion companion15 = AnalyticsEvent.ParamType.Companion;
                iArr[13] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealAfterpayAppletAnalytics(Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // app.cash.zipline.ZiplineService, java.lang.AutoCloseable
    public final void close() {
        this.analytics.close();
    }

    public final AfterpayAnalyticsEvent createEvent(AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec, Map map) {
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(afterpayAppletAnalyticsEventsSpec.serverParameters);
        Iterator it = afterpayAppletAnalyticsEventsSpec.clientParameters.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                String str2 = afterpayAppletAnalyticsEventsSpec.eventName;
                if (str2 != null) {
                    return new AfterpayAnalyticsEvent(str2, mutableMap);
                }
                a$$ExternalSyntheticBUOutline0.m$3("eventSpec.name cannot be null");
                return null;
            }
            AnalyticsEvent.ClientGeneratedParam clientGeneratedParam = (AnalyticsEvent.ClientGeneratedParam) it.next();
            String str3 = clientGeneratedParam.name;
            AnalyticsEvent.ParamType paramType = clientGeneratedParam.f1336type;
            if (str3 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("AnalyticsEvent.ClientGeneratedParam.name cannot be null");
                return null;
            }
            switch (paramType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paramType.ordinal()]) {
                case 1:
                    str = this.afterpayAppletFlowToken;
                    break;
                case 2:
                    str = (String) map.get(paramType);
                    break;
                case 3:
                    String str4 = (String) map.get(paramType);
                    if (str4 != null) {
                        str = str4;
                        break;
                    }
                    break;
                case 4:
                    str = this.shopFlowToken;
                    break;
                case 5:
                    str = this.searchFlowToken;
                    break;
                case 6:
                    str = CollectionsKt.joinToString$default(this.filterTokens, ",", null, null, 0, null, null, 62);
                    break;
                case 7:
                    str = this.query;
                    break;
                case 8:
                    str = (String) map.get(paramType);
                    break;
                case 9:
                    str = (String) map.get(paramType);
                    break;
            }
            if (str != null) {
                mutableMap.put(str3, str);
            }
        }
    }

    @Override // com.squareup.cash.integration.analytics.Analytics
    public final void track(Event event, Long l) {
        event.getClass();
        this.analytics.track(event, l);
    }

    public final void trackErrorAnalyticEvent(AfterpayAppletScreen afterpayAppletScreen) {
        this.analytics.track(new AfterpayAppletErrorView(this.afterpayAppletFlowToken, afterpayAppletScreen), null);
    }

    public final void trackEvent(AnalyticsEvent analyticsEvent, Map map) {
        if (analyticsEvent == null) {
            return;
        }
        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = HeaderSectionKt.toAfterpayAppletAnalyticsEventsSpec(analyticsEvent);
        int hashCode = afterpayAppletAnalyticsEventsSpec.hashCode();
        Integer valueOf = Integer.valueOf(hashCode);
        LinkedHashSet linkedHashSet = this.loggedImpressionEventHashes;
        if (linkedHashSet.contains(valueOf)) {
            return;
        }
        linkedHashSet.add(Integer.valueOf(hashCode));
        trackGenericAnalyticsEvents(CollectionsKt__CollectionsJVMKt.listOf(afterpayAppletAnalyticsEventsSpec), map);
    }

    public final void trackGenericAnalyticsEvents(List list, Map map) {
        list.getClass();
        map.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            track(createEvent((AfterpayAppletAnalyticsEventsSpec) it.next(), map), null);
        }
    }

    public final void trackImpressionAnalyticsEvents(List list, Map map) {
        list.getClass();
        map.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = (AfterpayAppletAnalyticsEventsSpec) it.next();
            int hashCode = afterpayAppletAnalyticsEventsSpec.hashCode();
            Integer valueOf = Integer.valueOf(hashCode);
            LinkedHashSet linkedHashSet = this.loggedImpressionEventHashes;
            if (!linkedHashSet.contains(valueOf)) {
                track(createEvent(afterpayAppletAnalyticsEventsSpec, map), null);
                linkedHashSet.add(Integer.valueOf(hashCode));
            }
        }
    }

    public final void trackPurchasesScreenViewed(Long l) {
        String str = this.afterpayAppletFlowToken;
        AfterpayAppletScreen afterpayAppletScreen = AfterpayAppletScreen.ENTRYPOINT;
        this.analytics.track(new AfterpayAppletPurchasesView(str, l), null);
    }

    public final void trackSelectAfterpaySheetDismissed() {
        String str = this.shopFlowToken;
        String str2 = this.searchFlowToken;
        String str3 = this.merchantToken;
        String str4 = this.merchantName;
        Origin origin = Origin.DISCO;
        Screen screen = Screen.OFFERS_HOME_V2;
        AfterpayFeature afterpayFeature = AfterpayFeature.IN_NETWORK;
        this.analytics.track(new OffersDismissSelectAfterpaySheet(str, str2, str3, str4), null);
    }

    public final void trackViewedAllOrders(boolean z) {
        this.analytics.track(new AfterpayAppletPurchasesViewedAllOrders(this.afterpayAppletFlowToken, Boolean.valueOf(z)), null);
    }

    @Override // com.squareup.cash.integration.analytics.Analytics, com.squareup.cash.treehouse.analytics.RawAnalyticsService
    public final void track(GenericEvent genericEvent) {
        this.analytics.track(genericEvent);
    }
}
