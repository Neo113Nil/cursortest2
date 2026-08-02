package com.squareup.cash.cdf.appsflyerinstallattribution;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.appsflyer.AFInAppEventParameterName;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AppsFlyerInstallAttributionConversionDataReceived implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String ad_id;
    public final String ad_name;
    public final String adset;
    public final String adset_id;
    public final String af_android_url;
    public final String af_channel;
    public final String af_dp;
    public final String af_id;
    public final String af_keywords;
    public final String af_siteid;
    public final AfStatus af_status;
    public final String af_sub1;
    public final String af_sub2;
    public final String af_sub3;
    public final String af_sub4;
    public final String af_sub5;
    public final String af_web_dp;
    public final String agency;
    public final String atid;
    public final String campaign_id;
    public final String campaign_name;
    public final String click_time;
    public final String deep_link_sub1;
    public final String deep_link_value;
    public final String http_referrer;
    public final String install_time;
    public final Boolean is_first_launch;
    public final String media_source;
    public final LinkedHashMap parameters;
    public final String retargeting_conversion_type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AfStatus {
        public static final /* synthetic */ AfStatus[] $VALUES;
        public static final AfStatus NON_ORGANIC;
        public static final AfStatus ORGANIC;
        public static final AfStatus UNKNOWN;

        static {
            AfStatus afStatus = new AfStatus("ORGANIC", 0);
            ORGANIC = afStatus;
            AfStatus afStatus2 = new AfStatus("NON_ORGANIC", 1);
            NON_ORGANIC = afStatus2;
            AfStatus afStatus3 = new AfStatus("UNKNOWN", 2);
            UNKNOWN = afStatus3;
            $VALUES = new AfStatus[]{afStatus, afStatus2, afStatus3};
        }

        public static AfStatus valueOf(String str) {
            return (AfStatus) Enum.valueOf(AfStatus.class, str);
        }

        public static AfStatus[] values() {
            return (AfStatus[]) $VALUES.clone();
        }
    }

    public AppsFlyerInstallAttributionConversionDataReceived(AfStatus afStatus, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27) {
        this.af_status = afStatus;
        this.is_first_launch = bool;
        this.media_source = str;
        this.campaign_name = str2;
        this.campaign_id = str3;
        this.adset = str4;
        this.adset_id = str5;
        this.ad_name = str6;
        this.ad_id = str7;
        this.af_channel = str8;
        this.af_keywords = str9;
        this.click_time = str10;
        this.install_time = str11;
        this.af_id = str12;
        this.af_dp = str13;
        this.af_web_dp = str14;
        this.af_android_url = str15;
        this.http_referrer = str16;
        this.deep_link_value = str17;
        this.deep_link_sub1 = str18;
        this.af_sub1 = str19;
        this.af_sub2 = str20;
        this.af_sub3 = str21;
        this.af_sub4 = str22;
        this.af_sub5 = str23;
        this.atid = str24;
        this.af_siteid = str25;
        this.agency = str26;
        this.retargeting_conversion_type = str27;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 32, "AppsFlyerInstallAttribution", "cdf_action", "ConversionData");
        Countries.putSafe(m, "af_status", afStatus);
        Countries.putSafe(m, "is_first_launch", bool);
        Countries.putSafe(m, "media_source", str);
        Countries.putSafe(m, "campaign_name", str2);
        Countries.putSafe(m, "campaign_id", str3);
        Countries.putSafe(m, "adset", str4);
        Countries.putSafe(m, "adset_id", str5);
        Countries.putSafe(m, "ad_name", str6);
        Countries.putSafe(m, "ad_id", str7);
        Countries.putSafe(m, AFInAppEventParameterName.AF_CHANNEL, str8);
        Countries.putSafe(m, "af_keywords", str9);
        Countries.putSafe(m, "click_time", str10);
        Countries.putSafe(m, "install_time", str11);
        Countries.putSafe(m, "af_id", str12);
        Countries.putSafe(m, "af_dp", str13);
        Countries.putSafe(m, "af_web_dp", str14);
        Countries.putSafe(m, "af_android_url", str15);
        Countries.putSafe(m, "http_referrer", str16);
        Countries.putSafe(m, "deep_link_value", str17);
        Countries.putSafe(m, "deep_link_sub1", str18);
        Countries.putSafe(m, "af_sub1", str19);
        Countries.putSafe(m, "af_sub2", str20);
        Countries.putSafe(m, "af_sub3", str21);
        Countries.putSafe(m, "af_sub4", str22);
        Countries.putSafe(m, "af_sub5", str23);
        Countries.putSafe(m, "atid", str24);
        Countries.putSafe(m, "af_siteid", str25);
        Countries.putSafe(m, "agency", str26);
        Countries.putSafe(m, "retargeting_conversion_type", str27);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsFlyerInstallAttributionConversionDataReceived)) {
            return false;
        }
        AppsFlyerInstallAttributionConversionDataReceived appsFlyerInstallAttributionConversionDataReceived = (AppsFlyerInstallAttributionConversionDataReceived) obj;
        return this.af_status == appsFlyerInstallAttributionConversionDataReceived.af_status && this.is_first_launch.equals(appsFlyerInstallAttributionConversionDataReceived.is_first_launch) && Intrinsics.areEqual(this.media_source, appsFlyerInstallAttributionConversionDataReceived.media_source) && Intrinsics.areEqual(this.campaign_name, appsFlyerInstallAttributionConversionDataReceived.campaign_name) && Intrinsics.areEqual(this.campaign_id, appsFlyerInstallAttributionConversionDataReceived.campaign_id) && Intrinsics.areEqual(this.adset, appsFlyerInstallAttributionConversionDataReceived.adset) && Intrinsics.areEqual(this.adset_id, appsFlyerInstallAttributionConversionDataReceived.adset_id) && Intrinsics.areEqual(this.ad_name, appsFlyerInstallAttributionConversionDataReceived.ad_name) && Intrinsics.areEqual(this.ad_id, appsFlyerInstallAttributionConversionDataReceived.ad_id) && Intrinsics.areEqual(this.af_channel, appsFlyerInstallAttributionConversionDataReceived.af_channel) && Intrinsics.areEqual(this.af_keywords, appsFlyerInstallAttributionConversionDataReceived.af_keywords) && Intrinsics.areEqual(this.click_time, appsFlyerInstallAttributionConversionDataReceived.click_time) && Intrinsics.areEqual(this.install_time, appsFlyerInstallAttributionConversionDataReceived.install_time) && Intrinsics.areEqual(this.af_id, appsFlyerInstallAttributionConversionDataReceived.af_id) && Intrinsics.areEqual(this.af_dp, appsFlyerInstallAttributionConversionDataReceived.af_dp) && Intrinsics.areEqual(this.af_web_dp, appsFlyerInstallAttributionConversionDataReceived.af_web_dp) && Intrinsics.areEqual(this.af_android_url, appsFlyerInstallAttributionConversionDataReceived.af_android_url) && Intrinsics.areEqual(this.http_referrer, appsFlyerInstallAttributionConversionDataReceived.http_referrer) && Intrinsics.areEqual(this.deep_link_value, appsFlyerInstallAttributionConversionDataReceived.deep_link_value) && Intrinsics.areEqual(this.deep_link_sub1, appsFlyerInstallAttributionConversionDataReceived.deep_link_sub1) && Intrinsics.areEqual(this.af_sub1, appsFlyerInstallAttributionConversionDataReceived.af_sub1) && Intrinsics.areEqual(this.af_sub2, appsFlyerInstallAttributionConversionDataReceived.af_sub2) && Intrinsics.areEqual(this.af_sub3, appsFlyerInstallAttributionConversionDataReceived.af_sub3) && Intrinsics.areEqual(this.af_sub4, appsFlyerInstallAttributionConversionDataReceived.af_sub4) && Intrinsics.areEqual(this.af_sub5, appsFlyerInstallAttributionConversionDataReceived.af_sub5) && Intrinsics.areEqual(this.atid, appsFlyerInstallAttributionConversionDataReceived.atid) && Intrinsics.areEqual(this.af_siteid, appsFlyerInstallAttributionConversionDataReceived.af_siteid) && Intrinsics.areEqual(this.agency, appsFlyerInstallAttributionConversionDataReceived.agency) && Intrinsics.areEqual(this.retargeting_conversion_type, appsFlyerInstallAttributionConversionDataReceived.retargeting_conversion_type);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "AppsFlyerInstallAttribution ConversionData Received";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_first_launch, this.af_status.hashCode() * 31, 31);
        String str = this.media_source;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.campaign_name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaign_id;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.adset;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.adset_id;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.ad_name;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ad_id;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.af_channel;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.af_keywords;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.click_time;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.install_time;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.af_id;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.af_dp;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.af_web_dp;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.af_android_url;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 961;
        String str16 = this.http_referrer;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.deep_link_value;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.deep_link_sub1;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.af_sub1;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.af_sub2;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.af_sub3;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.af_sub4;
        int hashCode22 = (hashCode21 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.af_sub5;
        int hashCode23 = (hashCode22 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.atid;
        int hashCode24 = (hashCode23 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.af_siteid;
        int hashCode25 = (hashCode24 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.agency;
        int hashCode26 = (hashCode25 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.retargeting_conversion_type;
        return hashCode26 + (str27 != null ? str27.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsFlyerInstallAttributionConversionDataReceived(af_status=");
        sb.append(this.af_status);
        sb.append(", is_first_launch=");
        sb.append(this.is_first_launch);
        sb.append(", media_source=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.media_source, ", campaign_name=", this.campaign_name, ", campaign_id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.campaign_id, ", adset=", this.adset, ", adset_id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.adset_id, ", ad_name=", this.ad_name, ", ad_id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.ad_id, ", af_channel=", this.af_channel, ", af_keywords=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.af_keywords, ", click_time=", this.click_time, ", install_time=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.install_time, ", af_id=", this.af_id, ", af_dp=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.af_dp, ", af_web_dp=", this.af_web_dp, ", af_android_url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.af_android_url, ", af_ios_url=null, http_referrer=", this.http_referrer, ", deep_link_value=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.deep_link_value, ", deep_link_sub1=", this.deep_link_sub1, ", af_sub1=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.af_sub1, ", af_sub2=", this.af_sub2, ", af_sub3=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.af_sub3, ", af_sub4=", this.af_sub4, ", af_sub5=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.af_sub5, ", atid=", this.atid, ", af_siteid=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.af_siteid, ", agency=", this.agency, ", retargeting_conversion_type=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.retargeting_conversion_type, ")");
    }
}
