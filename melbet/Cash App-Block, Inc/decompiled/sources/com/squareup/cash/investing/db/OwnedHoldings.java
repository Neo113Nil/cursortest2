package com.squareup.cash.investing.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityStatus;
import com.squareup.protos.franklin.investing.resources.InvestmentEntityType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OwnedHoldings {
    public final List about_detail_rows;
    public final String about_text;
    public final Money average_cost;
    public final String color;
    public final CurrencyCode currency;
    public final SyncInvestmentHolding.DailyGainParams daily_gain_params;
    public final boolean delisted;
    public final String display_name;
    public final Color entity_color;
    public final Image icon;
    public final String icon_url;
    public final long id;
    public final long invested_amount;
    public final Long outstanding_shares;
    public final SyncInvestmentEntity.ReleaseStage release_stage;
    public final Long search_ordering;
    public final SyncInvestmentHolding.InvestmentHoldingState state;
    public final InvestmentEntityStatus status;
    public final String symbol;
    public final String token;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentEntityType f1154type;
    public final String units;

    public OwnedHoldings(String str, String str2, long j, CurrencyCode currencyCode, SyncInvestmentHolding.InvestmentHoldingState investmentHoldingState, SyncInvestmentHolding.DailyGainParams dailyGainParams, Money money, long j2, String str3, InvestmentEntityType investmentEntityType, String str4, String str5, Long l, String str6, InvestmentEntityStatus investmentEntityStatus, String str7, List list, Long l2, boolean z, Color color, Image image, SyncInvestmentEntity.ReleaseStage releaseStage) {
        investmentHoldingState.getClass();
        investmentEntityType.getClass();
        investmentEntityStatus.getClass();
        this.token = str;
        this.units = str2;
        this.invested_amount = j;
        this.currency = currencyCode;
        this.state = investmentHoldingState;
        this.daily_gain_params = dailyGainParams;
        this.average_cost = money;
        this.id = j2;
        this.symbol = str3;
        this.f1154type = investmentEntityType;
        this.display_name = str4;
        this.icon_url = str5;
        this.outstanding_shares = l;
        this.color = str6;
        this.status = investmentEntityStatus;
        this.about_text = str7;
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
        if (!(obj instanceof OwnedHoldings)) {
            return false;
        }
        OwnedHoldings ownedHoldings = (OwnedHoldings) obj;
        return this.token.equals(ownedHoldings.token) && this.units.equals(ownedHoldings.units) && this.invested_amount == ownedHoldings.invested_amount && this.currency == ownedHoldings.currency && this.state == ownedHoldings.state && Intrinsics.areEqual(this.daily_gain_params, ownedHoldings.daily_gain_params) && Intrinsics.areEqual(this.average_cost, ownedHoldings.average_cost) && this.id == ownedHoldings.id && this.symbol.equals(ownedHoldings.symbol) && this.f1154type == ownedHoldings.f1154type && this.display_name.equals(ownedHoldings.display_name) && Intrinsics.areEqual(this.icon_url, ownedHoldings.icon_url) && Intrinsics.areEqual(this.outstanding_shares, ownedHoldings.outstanding_shares) && Intrinsics.areEqual(this.color, ownedHoldings.color) && this.status == ownedHoldings.status && Intrinsics.areEqual(this.about_text, ownedHoldings.about_text) && Intrinsics.areEqual(this.about_detail_rows, ownedHoldings.about_detail_rows) && Intrinsics.areEqual(this.search_ordering, ownedHoldings.search_ordering) && this.delisted == ownedHoldings.delisted && Intrinsics.areEqual(this.entity_color, ownedHoldings.entity_color) && Intrinsics.areEqual(this.icon, ownedHoldings.icon) && this.release_stage == ownedHoldings.release_stage;
    }

    public final String getColor() {
        return this.color;
    }

    public final SyncInvestmentHolding.DailyGainParams getDaily_gain_params() {
        return this.daily_gain_params;
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

    public final long getInvested_amount() {
        return this.invested_amount;
    }

    public final Long getOutstanding_shares() {
        return this.outstanding_shares;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUnits() {
        return this.units;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.units), 31, this.invested_amount);
        CurrencyCode currencyCode = this.currency;
        int hashCode = (this.state.hashCode() + ((m + (currencyCode == null ? 0 : currencyCode.hashCode())) * 31)) * 31;
        SyncInvestmentHolding.DailyGainParams dailyGainParams = this.daily_gain_params;
        int hashCode2 = (hashCode + (dailyGainParams == null ? 0 : dailyGainParams.hashCode())) * 31;
        Money money = this.average_cost;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f1154type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (money == null ? 0 : money.hashCode())) * 31, 31, this.id), 31, this.symbol)) * 31, 31, this.display_name);
        String str = this.icon_url;
        int hashCode3 = (m2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.outstanding_shares;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.color;
        int hashCode5 = (this.status.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.about_text;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.about_detail_rows;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.search_ordering;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.delisted);
        Color color = this.entity_color;
        int hashCode8 = (m3 + (color == null ? 0 : color.hashCode())) * 31;
        Image image = this.icon;
        int hashCode9 = (hashCode8 + (image == null ? 0 : image.hashCode())) * 31;
        SyncInvestmentEntity.ReleaseStage releaseStage = this.release_stage;
        return hashCode9 + (releaseStage != null ? releaseStage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OwnedHoldings(token=", this.token, ", units=", this.units, ", invested_amount=");
        m.append(this.invested_amount);
        m.append(", currency=");
        m.append(this.currency);
        m.append(", state=");
        m.append(this.state);
        m.append(", daily_gain_params=");
        m.append(this.daily_gain_params);
        m.append(", average_cost=");
        m.append(this.average_cost);
        m.append(", id=");
        Fragment$5$$ExternalSyntheticOutline0.m(this.id, ", symbol=", this.symbol, m);
        m.append(", type=");
        m.append(this.f1154type);
        m.append(", display_name=");
        m.append(this.display_name);
        m.append(", icon_url=");
        m.append(this.icon_url);
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
