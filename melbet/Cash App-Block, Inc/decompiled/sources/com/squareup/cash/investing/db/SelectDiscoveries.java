package com.squareup.cash.investing.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectDiscoveries {
    public final String category;
    public final String category_description;
    public final long category_index;
    public final String color;
    public final boolean delisted;
    public final String display_name;
    public final Color entity_color;
    public final Image icon;
    public final String icon_url;
    public final long id;
    public final boolean in_search_category;
    public final Boolean in_search_suggestion;
    public final Long outstanding_shares;
    public final SyncInvestmentEntity.ReleaseStage release_stage;
    public final String symbol;
    public final String token;

    public SelectDiscoveries(String str, String str2, String str3, String str4, long j, String str5, Boolean bool, boolean z, long j2, String str6, String str7, boolean z2, Color color, Image image, Long l, SyncInvestmentEntity.ReleaseStage releaseStage) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str4, str6);
        this.token = str;
        this.display_name = str2;
        this.icon_url = str3;
        this.category = str4;
        this.category_index = j;
        this.category_description = str5;
        this.in_search_suggestion = bool;
        this.in_search_category = z;
        this.id = j2;
        this.symbol = str6;
        this.color = str7;
        this.delisted = z2;
        this.entity_color = color;
        this.icon = image;
        this.outstanding_shares = l;
        this.release_stage = releaseStage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDiscoveries)) {
            return false;
        }
        SelectDiscoveries selectDiscoveries = (SelectDiscoveries) obj;
        return Intrinsics.areEqual(this.token, selectDiscoveries.token) && Intrinsics.areEqual(this.display_name, selectDiscoveries.display_name) && Intrinsics.areEqual(this.icon_url, selectDiscoveries.icon_url) && Intrinsics.areEqual(this.category, selectDiscoveries.category) && this.category_index == selectDiscoveries.category_index && Intrinsics.areEqual(this.category_description, selectDiscoveries.category_description) && Intrinsics.areEqual(this.in_search_suggestion, selectDiscoveries.in_search_suggestion) && this.in_search_category == selectDiscoveries.in_search_category && this.id == selectDiscoveries.id && Intrinsics.areEqual(this.symbol, selectDiscoveries.symbol) && Intrinsics.areEqual(this.color, selectDiscoveries.color) && this.delisted == selectDiscoveries.delisted && Intrinsics.areEqual(this.entity_color, selectDiscoveries.entity_color) && Intrinsics.areEqual(this.icon, selectDiscoveries.icon) && Intrinsics.areEqual(this.outstanding_shares, selectDiscoveries.outstanding_shares) && this.release_stage == selectDiscoveries.release_stage;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.display_name);
        String str = this.icon_url;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.category), 31, this.category_index);
        String str2 = this.category_description;
        int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.in_search_suggestion;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.in_search_category), 31, this.id), 31, this.symbol);
        String str3 = this.color;
        int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.delisted);
        Color color = this.entity_color;
        int hashCode2 = (m4 + (color == null ? 0 : color.hashCode())) * 31;
        Image image = this.icon;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Long l = this.outstanding_shares;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        SyncInvestmentEntity.ReleaseStage releaseStage = this.release_stage;
        return hashCode4 + (releaseStage != null ? releaseStage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectDiscoveries(token=", this.token, ", display_name=", this.display_name, ", icon_url=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.icon_url, ", category=", this.category, ", category_index=");
        Fragment$5$$ExternalSyntheticOutline0.m(this.category_index, ", category_description=", this.category_description, m);
        m.append(", in_search_suggestion=");
        m.append(this.in_search_suggestion);
        m.append(", in_search_category=");
        m.append(this.in_search_category);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.id, ", id=", ", symbol=", m);
        Boxes$$ExternalSyntheticOutline1.m(m, this.symbol, ", color=", this.color, ", delisted=");
        m.append(this.delisted);
        m.append(", entity_color=");
        m.append(this.entity_color);
        m.append(", icon=");
        m.append(this.icon);
        m.append(", outstanding_shares=");
        m.append(this.outstanding_shares);
        m.append(", release_stage=");
        m.append(this.release_stage);
        m.append(")");
        return m.toString();
    }
}
