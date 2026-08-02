package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BrowserViewPerformanceScore implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean cash_fill_enabled;
    public final String cash_fill_version;
    public final String cls;
    public final String cls_score;
    public final String entity_name;
    public final String entity_token;
    public final String fcp;
    public final String fcp_score;
    public final String fid;
    public final String fid_score;
    public final Boolean fillr_enabled;
    public final String fillr_widget_version;
    public final InfoContext info_context;
    public final String inp;
    public final String inp_score;
    public final String lcp;
    public final String lcp_score;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String script_version;
    public final String tbt;
    public final String tbt_score;
    public final String ttfb;
    public final String ttfb_score;
    public final String tti;
    public final String tti_score;
    public final String url;

    public BrowserViewPerformanceScore(String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, String str7, InfoContext infoContext, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, BrowserOrigin browserOrigin) {
        str3.getClass();
        infoContext.getClass();
        this.url = str;
        this.referrer_flow_token = str2;
        this.script_version = str3;
        this.cash_fill_enabled = bool;
        this.cash_fill_version = str4;
        this.fillr_enabled = bool2;
        this.fillr_widget_version = str5;
        this.entity_token = str6;
        this.entity_name = str7;
        this.info_context = infoContext;
        this.fcp = str8;
        this.tbt = str9;
        this.cls = str10;
        this.tti = str11;
        this.fid = str12;
        this.inp = str13;
        this.lcp = str14;
        this.ttfb = str15;
        this.fcp_score = str16;
        this.tbt_score = str17;
        this.cls_score = str18;
        this.tti_score = str19;
        this.fid_score = str20;
        this.inp_score = str21;
        this.lcp_score = str22;
        this.ttfb_score = str23;
        this.origin = browserOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 30, "Browser", "cdf_action", "View");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "referrer_flow_token", str2);
        Countries.putSafe(m, "script_version", str3);
        Countries.putSafe(m, "cash_fill_enabled", bool);
        Countries.putSafe(m, "cash_fill_version", str4);
        Countries.putSafe(m, "fillr_enabled", bool2);
        Countries.putSafe(m, "fillr_sdk_version", "11.2.0");
        Countries.putSafe(m, "fillr_widget_version", str5);
        Countries.putSafe(m, "entity_token", str6);
        Countries.putSafe(m, "entity_name", str7);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "fcp", str8);
        Countries.putSafe(m, "tbt", str9);
        Countries.putSafe(m, "cls", str10);
        Countries.putSafe(m, "tti", str11);
        Countries.putSafe(m, "fid", str12);
        Countries.putSafe(m, "inp", str13);
        Countries.putSafe(m, "lcp", str14);
        Countries.putSafe(m, "ttfb", str15);
        Countries.putSafe(m, "fcp_score", str16);
        Countries.putSafe(m, "tbt_score", str17);
        Countries.putSafe(m, "cls_score", str18);
        Countries.putSafe(m, "tti_score", str19);
        Countries.putSafe(m, "fid_score", str20);
        Countries.putSafe(m, "inp_score", str21);
        Countries.putSafe(m, "lcp_score", str22);
        Countries.putSafe(m, "ttfb_score", str23);
        Countries.putSafe(m, "origin", browserOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserViewPerformanceScore)) {
            return false;
        }
        BrowserViewPerformanceScore browserViewPerformanceScore = (BrowserViewPerformanceScore) obj;
        return this.url.equals(browserViewPerformanceScore.url) && Intrinsics.areEqual(this.referrer_flow_token, browserViewPerformanceScore.referrer_flow_token) && Intrinsics.areEqual(this.script_version, browserViewPerformanceScore.script_version) && this.cash_fill_enabled.equals(browserViewPerformanceScore.cash_fill_enabled) && Intrinsics.areEqual(this.cash_fill_version, browserViewPerformanceScore.cash_fill_version) && this.fillr_enabled.equals(browserViewPerformanceScore.fillr_enabled) && Intrinsics.areEqual(this.fillr_widget_version, browserViewPerformanceScore.fillr_widget_version) && Intrinsics.areEqual(this.entity_token, browserViewPerformanceScore.entity_token) && Intrinsics.areEqual(this.entity_name, browserViewPerformanceScore.entity_name) && this.info_context == browserViewPerformanceScore.info_context && this.fcp.equals(browserViewPerformanceScore.fcp) && this.tbt.equals(browserViewPerformanceScore.tbt) && this.cls.equals(browserViewPerformanceScore.cls) && this.tti.equals(browserViewPerformanceScore.tti) && this.fid.equals(browserViewPerformanceScore.fid) && this.inp.equals(browserViewPerformanceScore.inp) && this.lcp.equals(browserViewPerformanceScore.lcp) && this.ttfb.equals(browserViewPerformanceScore.ttfb) && this.fcp_score.equals(browserViewPerformanceScore.fcp_score) && this.tbt_score.equals(browserViewPerformanceScore.tbt_score) && this.cls_score.equals(browserViewPerformanceScore.cls_score) && this.tti_score.equals(browserViewPerformanceScore.tti_score) && this.fid_score.equals(browserViewPerformanceScore.fid_score) && this.inp_score.equals(browserViewPerformanceScore.inp_score) && this.lcp_score.equals(browserViewPerformanceScore.lcp_score) && this.ttfb_score.equals(browserViewPerformanceScore.ttfb_score) && this.origin == browserViewPerformanceScore.origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser View PerformanceScore";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.referrer_flow_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.cash_fill_enabled, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.script_version), 31);
        String str2 = this.cash_fill_version;
        int hashCode2 = (((this.fillr_enabled.hashCode() + ((m + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31) + 1449500838) * 31;
        String str3 = this.fillr_widget_version;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.entity_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entity_name;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.info_context.hashCode() + ((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31, 31, this.fcp), 31, this.tbt), 31, this.cls), 31, this.tti), 31, this.fid), 31, this.inp), 31, this.lcp), 31, this.ttfb), 31, this.fcp_score), 31, this.tbt_score), 31, this.cls_score), 31, this.tti_score), 31, this.fid_score), 31, this.inp_score), 31, this.lcp_score), 31, this.ttfb_score);
        BrowserOrigin browserOrigin = this.origin;
        return m2 + (browserOrigin != null ? browserOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrowserViewPerformanceScore(url=", this.url, ", referrer_flow_token=", this.referrer_flow_token, ", script_version=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.script_version, ", cash_fill_enabled=", this.cash_fill_enabled, ", cash_fill_version=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.cash_fill_version, ", fillr_enabled=", this.fillr_enabled, ", fillr_sdk_version=11.2.0, fillr_widget_version=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.fillr_widget_version, ", entity_token=", this.entity_token, ", entity_name=");
        m.append(this.entity_name);
        m.append(", info_context=");
        m.append(this.info_context);
        m.append(", fcp=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.fcp, ", tbt=", this.tbt, ", cls=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.cls, ", tti=", this.tti, ", fid=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.fid, ", inp=", this.inp, ", lcp=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.lcp, ", ttfb=", this.ttfb, ", fcp_score=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.fcp_score, ", tbt_score=", this.tbt_score, ", cls_score=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.cls_score, ", tti_score=", this.tti_score, ", fid_score=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.fid_score, ", inp_score=", this.inp_score, ", lcp_score=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.lcp_score, ", ttfb_score=", this.ttfb_score, ", origin=");
        m.append(this.origin);
        m.append(")");
        return m.toString();
    }
}
