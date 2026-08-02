package com.google.android.gms.internal.mlkit_genai_prompt;

import android.app.Activity;
import android.os.Bundle;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import com.squareup.cash.activity.backend.ActivityFeedGroup;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattingFailedActivityItem;
import com.squareup.cash.activity.presenters.SharedPresenterUtilsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.activity.views.SectionHeaderScope$$ExternalSyntheticLambda1;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda8;
import com.squareup.cash.datetimeformatter.real.RealDateTimeFormatterFactory;
import com.squareup.cash.marketcapabilities.MarketCapabilitiesMapper$WhenMappings;
import com.squareup.cash.marketcapabilities.MarketCapabilityAvailability;
import com.squareup.cash.marketcapabilities.MarketCapabilityName;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.cashabilities.api.CapabilityName;
import com.squareup.protos.cash.cashabilities.api.CapabilityStatus;
import com.squareup.protos.cash.cashabilities.api.MarketCapability;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function4;
import kotlin.reflect.KClass;

/* loaded from: classes6.dex */
public abstract class zzaad {
    public static final void addGroupedActivityItems(List list, List list2, AndroidStringManager androidStringManager, Function4 function4, RealDateTimeFormatterFactory realDateTimeFormatterFactory) {
        list.getClass();
        list2.getClass();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ActivityFeedGroup activityFeedGroup = (ActivityFeedGroup) it.next();
            list.add(new InlineAppMessageKt$$ExternalSyntheticLambda8(2, activityFeedGroup, androidStringManager, realDateTimeFormatterFactory));
            int size = list.size();
            List list3 = activityFeedGroup.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            int i = 0;
            int i2 = 0;
            for (Object obj : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                ActivityItem activityItem = (ActivityItem) obj;
                arrayList.add(activityItem instanceof FormattingFailedActivityItem ? new SharedPresenterUtilsKt$$ExternalSyntheticLambda1((FormattingFailedActivityItem) activityItem, i) : new SectionHeaderScope$$ExternalSyntheticLambda1(function4, activityItem, i2 + size, 9));
                i2 = i3;
            }
            list.addAll(arrayList);
        }
    }

    public static ArrayList convertAndFilterKnownValues(List list) {
        MarketCapabilityName marketCapabilityName;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MarketCapability marketCapability = (MarketCapability) it.next();
            CapabilityName capabilityName = marketCapability.name;
            com.squareup.cash.marketcapabilities.MarketCapability marketCapability2 = null;
            switch (capabilityName == null ? -1 : MarketCapabilitiesMapper$WhenMappings.$EnumSwitchMapping$1[capabilityName.ordinal()]) {
                case -1:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                    marketCapabilityName = null;
                    break;
                case 0:
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                case 1:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_P2P;
                    break;
                case 2:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN;
                    break;
                case 3:
                    marketCapabilityName = MarketCapabilityName.INVESTING;
                    break;
                case 4:
                    marketCapabilityName = MarketCapabilityName.CARDS;
                    break;
                case 5:
                    marketCapabilityName = MarketCapabilityName.BANKING;
                    break;
                case 6:
                    marketCapabilityName = MarketCapabilityName.FIAT_P2P;
                    break;
                case 7:
                    marketCapabilityName = MarketCapabilityName.FIAT_P2P_MULTI_CURRENCY_SELECTION;
                    break;
                case 8:
                    marketCapabilityName = MarketCapabilityName.ONBOARDING_IDV_INTERNATIONAL;
                    break;
                case 9:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_LIGHTNING_DEPOSIT;
                    break;
                case 10:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_LIGHTNING_WITHDRAW;
                    break;
                case 11:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_BUY_MARKET;
                    break;
                case 12:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_SELL_MARKET;
                    break;
                case 13:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_BUY_CUSTOM;
                    break;
                case 14:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_SELL_CUSTOM;
                    break;
                case 15:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_AUTO_INVEST_BUY;
                    break;
                case 16:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_PAYROLL;
                    break;
                case 17:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_ROUNDUP;
                    break;
                case 18:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_BOOSTS;
                    break;
                case 19:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_GIFTING;
                    break;
                case 20:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_DEPOSIT;
                    break;
                case 21:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BITCOIN_WITHDRAW;
                    break;
                case 22:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_XUS;
                    break;
                case 23:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_FIAT_TO_XUS_MARKET;
                    break;
                case 24:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_BTC_TO_XUS_MARKET;
                    break;
                case 25:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_XUS_TO_BTC_MARKET;
                    break;
                case 26:
                    marketCapabilityName = MarketCapabilityName.CRYPTO_XUS_TO_FIAT_MARKET;
                    break;
            }
            if (marketCapabilityName != null) {
                CapabilityStatus capabilityStatus = marketCapability.status;
                int i = capabilityStatus != null ? MarketCapabilitiesMapper$WhenMappings.$EnumSwitchMapping$0[capabilityStatus.ordinal()] : -1;
                MarketCapabilityAvailability marketCapabilityAvailability = i != 1 ? i != 2 ? null : MarketCapabilityAvailability.AVAILABLE : MarketCapabilityAvailability.UNAVAILABLE;
                if (marketCapabilityAvailability != null) {
                    marketCapability2 = new com.squareup.cash.marketcapabilities.MarketCapability(marketCapabilityName, marketCapabilityAvailability);
                }
            }
            if (marketCapability2 != null) {
                arrayList.add(marketCapability2);
            }
        }
        return arrayList;
    }

    public static void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    public static Object unwrapAs(CameraInfo cameraInfo, KClass kClass) {
        cameraInfo.getClass();
        kClass.getClass();
        if (cameraInfo instanceof UnsafeWrapper) {
            return ((UnsafeWrapper) cameraInfo).unwrapAs(kClass);
        }
        if (!(cameraInfo instanceof CameraInfoInternal)) {
            return null;
        }
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        if (cameraInfoInternal.getImplementation() == cameraInfo) {
            return null;
        }
        CameraInfoInternal implementation = cameraInfoInternal.getImplementation();
        implementation.getClass();
        return unwrapAs(implementation, kClass);
    }
}
