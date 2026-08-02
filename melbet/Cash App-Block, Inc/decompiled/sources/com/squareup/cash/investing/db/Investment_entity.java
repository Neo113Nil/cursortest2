package com.squareup.cash.investing.db;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Investment_entity {
    public final List about_detail_rows;
    public final String about_text;
    public final String color;
    public final boolean delisted;
    public final String display_name;
    public final Color entity_color;
    public final Image icon;
    public final String icon_url;
    public final long id;
    public final Long outstanding_shares;
    public final SyncInvestmentEntity.ReleaseStage release_stage;
    public final Long search_ordering;
    public final InvestmentEntityStatus status;
    public final String symbol;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentEntityType f1153type;

    public Investment_entity(long j, String str, String str2, InvestmentEntityType investmentEntityType, String str3, String str4, Long l, String str5, InvestmentEntityStatus investmentEntityStatus, String str6, List list, Long l2, boolean z, Color color, Image image, SyncInvestmentEntity.ReleaseStage releaseStage) {
        str.getClass();
        str2.getClass();
        investmentEntityType.getClass();
        str3.getClass();
        investmentEntityStatus.getClass();
        this.id = j;
        this.token = str;
        this.symbol = str2;
        this.f1153type = investmentEntityType;
        this.display_name = str3;
        this.icon_url = str4;
        this.outstanding_shares = l;
        this.color = str5;
        this.status = investmentEntityStatus;
        this.about_text = str6;
        this.about_detail_rows = list;
        this.search_ordering = l2;
        this.delisted = z;
        this.entity_color = color;
        this.icon = image;
        this.release_stage = releaseStage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Investment_entity)) {
            return false;
        }
        Investment_entity investment_entity = (Investment_entity) obj;
        return this.id == investment_entity.id && Intrinsics.areEqual(this.token, investment_entity.token) && Intrinsics.areEqual(this.symbol, investment_entity.symbol) && this.f1153type == investment_entity.f1153type && Intrinsics.areEqual(this.display_name, investment_entity.display_name) && Intrinsics.areEqual(this.icon_url, investment_entity.icon_url) && Intrinsics.areEqual(this.outstanding_shares, investment_entity.outstanding_shares) && Intrinsics.areEqual(this.color, investment_entity.color) && this.status == investment_entity.status && Intrinsics.areEqual(this.about_text, investment_entity.about_text) && Intrinsics.areEqual(this.about_detail_rows, investment_entity.about_detail_rows) && Intrinsics.areEqual(this.search_ordering, investment_entity.search_ordering) && this.delisted == investment_entity.delisted && Intrinsics.areEqual(this.entity_color, investment_entity.entity_color) && Intrinsics.areEqual(this.icon, investment_entity.icon) && this.release_stage == investment_entity.release_stage;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getDelisted() {
        return this.delisted;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    public final Color getEntity_color() {
        return this.entity_color;
    }

    public final Image getIcon() {
        return this.icon;
    }

    public final String getIcon_url() {
        return this.icon_url;
    }

    public final long getId() {
        return this.id;
    }

    public final Long getOutstanding_shares() {
        return this.outstanding_shares;
    }

    public final SyncInvestmentEntity.ReleaseStage getRelease_stage() {
        return this.release_stage;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getToken() {
        return this.token;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f1153type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.token), 31, this.symbol)) * 31, 31, this.display_name);
        String str = this.icon_url;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.outstanding_shares;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.color;
        int hashCode3 = (this.status.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.about_text;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.about_detail_rows;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.search_ordering;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.delisted);
        Color color = this.entity_color;
        int hashCode6 = (m2 + (color == null ? 0 : color.hashCode())) * 31;
        Image image = this.icon;
        int hashCode7 = (hashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        SyncInvestmentEntity.ReleaseStage releaseStage = this.release_stage;
        return hashCode7 + (releaseStage != null ? releaseStage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Investment_entity(id=", this.id, ", token=", this.token);
        m.append(", symbol=");
        m.append(this.symbol);
        m.append(", type=");
        m.append(this.f1153type);
        Boxes$$ExternalSyntheticOutline1.m(m, ", display_name=", this.display_name, ", icon_url=", this.icon_url);
        m.append(", outstanding_shares=");
        m.append(this.outstanding_shares);
        m.append(", color=");
        m.append(this.color);
        m.append(", status=");
        m.append(this.status);
        m.append(", about_text=");
        m.append(this.about_text);
        m.append(", about_detail_rows=");
        m.append(this.about_detail_rows);
        m.append(", search_ordering=");
        m.append(this.search_ordering);
        m.append(", delisted=");
        m.append(this.delisted);
        m.append(", entity_color=");
        m.append(this.entity_color);
        m.append(", icon=");
        m.append(this.icon);
        m.append(", release_stage=");
        m.append(this.release_stage);
        m.append(")");
        return m.toString();
    }
}
