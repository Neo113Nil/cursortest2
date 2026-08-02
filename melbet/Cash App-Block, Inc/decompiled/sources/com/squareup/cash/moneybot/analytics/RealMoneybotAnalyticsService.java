package com.squareup.cash.moneybot.analytics;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.moneybot.MoneybotActionCardTap;
import com.squareup.cash.cdf.moneybot.MoneybotErrorChatError;
import com.squareup.cash.cdf.moneybot.MoneybotOverflowMenuOpen;
import com.squareup.cash.cdf.moneybot.MoneybotSurface;
import com.squareup.cash.cdf.moneybot.MoneybotTemplateCardFieldEditCommit;
import com.squareup.cash.cdf.moneybothome.HomeItemType;
import com.squareup.cash.cdf.moneybothome.MoneybotHomeBrowseSelectItem;
import com.squareup.cash.cdf.moneybothome.TapElement;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.analytics.UtilsKt;
import java.util.Arrays;
import kotlin.Pair;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes.dex */
public final class RealMoneybotAnalyticsService {
    public final Analytics analytics;
    public String chatId = re$$ExternalSyntheticOutline0.m();

    public RealMoneybotAnalyticsService(Analytics analytics, RealUuidGenerator realUuidGenerator) {
        this.analytics = analytics;
    }

    public static void submitOverflowMenuOpen$default(RealMoneybotAnalyticsService realMoneybotAnalyticsService, MoneybotSurface moneybotSurface, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        realMoneybotAnalyticsService.analytics.track(new MoneybotOverflowMenuOpen(moneybotSurface, realMoneybotAnalyticsService.chatId, str, str2), null);
    }

    public final void submitActionCardTap(String str, String str2) {
        this.analytics.track(new MoneybotActionCardTap(str, str2), null);
    }

    public final void submitCdfEvent(CdfEvent cdfEvent, Pair... pairArr) {
        cdfEvent.getClass();
        this.analytics.track(UtilsKt.toCdfEvent(cdfEvent, (Pair[]) Arrays.copyOf(pairArr, pairArr.length)), null);
    }

    public final void submitChatError(String str, String str2, String str3) {
        this.analytics.track(new MoneybotErrorChatError(str, this.chatId, str2, str3), null);
    }

    public final void submitHomeBrowseSelectItem(String str, HomeItemType homeItemType, String str2, String str3, TapElement tapElement) {
        str2.getClass();
        this.analytics.track(new MoneybotHomeBrowseSelectItem(str, homeItemType, str2, str3, tapElement), null);
    }

    public final void submitTemplateCardFieldEditCommit(String str, String str2, String str3, TemplateCardInputFieldAnalyticsData templateCardInputFieldAnalyticsData, String str4) {
        this.analytics.track(new MoneybotTemplateCardFieldEditCommit(str, str2, str3, templateCardInputFieldAnalyticsData.getPlaceholderKey(), templateCardInputFieldAnalyticsData.getFieldType(), templateCardInputFieldAnalyticsData.getPickerKind(), templateCardInputFieldAnalyticsData.getPickerPlacement(), str4), null);
    }
}
