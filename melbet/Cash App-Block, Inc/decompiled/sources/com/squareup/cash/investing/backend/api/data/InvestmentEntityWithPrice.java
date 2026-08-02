package com.squareup.cash.investing.backend.api.data;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.protos.cash.marketprices.CurrentPrice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestmentEntityWithPrice {

    public final class Following extends InvestmentEntityWithPrice {
        public final Color accentColor;
        public final boolean delisted;
        public final String displayName;
        public final Image icon;
        public final long id;
        public final Money marketCap;
        public final CurrentPrice price;
        public final SyncInvestmentEntity.ReleaseStage releaseStage;
        public final String symbol;
        public final InvestmentEntityToken token;

        public Following(long j, InvestmentEntityToken investmentEntityToken, String str, Image image, CurrentPrice currentPrice, String str2, Color color, boolean z, Money money, SyncInvestmentEntity.ReleaseStage releaseStage) {
            investmentEntityToken.getClass();
            str.getClass();
            str2.getClass();
            color.getClass();
            releaseStage.getClass();
            this.id = j;
            this.token = investmentEntityToken;
            this.displayName = str;
            this.icon = image;
            this.price = currentPrice;
            this.symbol = str2;
            this.accentColor = color;
            this.delisted = z;
            this.marketCap = money;
            this.releaseStage = releaseStage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Following)) {
                return false;
            }
            Following following = (Following) obj;
            return this.id == following.id && Intrinsics.areEqual(this.token, following.token) && Intrinsics.areEqual(this.displayName, following.displayName) && Intrinsics.areEqual(this.icon, following.icon) && Intrinsics.areEqual(this.price, following.price) && Intrinsics.areEqual(this.symbol, following.symbol) && Intrinsics.areEqual(this.accentColor, following.accentColor) && this.delisted == following.delisted && Intrinsics.areEqual(this.marketCap, following.marketCap) && this.releaseStage == following.releaseStage;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Color getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final boolean getDelisted() {
            return this.delisted;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final String getDisplayName() {
            return this.displayName;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Image getIcon() {
            return this.icon;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final long getId() {
            return this.id;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Money getMarketCap() {
            return this.marketCap;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final CurrentPrice getPrice() {
            return this.price;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final SyncInvestmentEntity.ReleaseStage getReleaseStage() {
            return this.releaseStage;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final InvestmentEntityToken getToken() {
            return this.token;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.token.value), 31, this.displayName);
            Image image = this.icon;
            int hashCode = (m + (image == null ? 0 : image.hashCode())) * 31;
            CurrentPrice currentPrice = this.price;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.accentColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (currentPrice == null ? 0 : currentPrice.hashCode())) * 31, 31, this.symbol), 31), 31, this.delisted);
            Money money = this.marketCap;
            return this.releaseStage.hashCode() + ((m2 + (money != null ? money.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Following(id=" + this.id + ", token=" + this.token + ", displayName=" + this.displayName + ", icon=" + this.icon + ", price=" + this.price + ", symbol=" + this.symbol + ", accentColor=" + this.accentColor + ", delisted=" + this.delisted + ", marketCap=" + this.marketCap + ", releaseStage=" + this.releaseStage + ")";
        }
    }

    public final class Owned extends InvestmentEntityWithPrice {
        public final Color accentColor;
        public final SyncInvestmentHolding.DailyGainParams dailyGainParams;
        public final boolean delisted;
        public final String displayName;
        public final Image icon;
        public final long id;
        public final long investedAmount;
        public final Money marketCap;
        public final CurrentPrice price;
        public final SyncInvestmentEntity.ReleaseStage releaseStage;
        public final String symbol;
        public final InvestmentEntityToken token;
        public final String units;

        public Owned(long j, InvestmentEntityToken investmentEntityToken, String str, Image image, CurrentPrice currentPrice, String str2, Color color, String str3, long j2, boolean z, Money money, SyncInvestmentHolding.DailyGainParams dailyGainParams, SyncInvestmentEntity.ReleaseStage releaseStage) {
            investmentEntityToken.getClass();
            str.getClass();
            str2.getClass();
            color.getClass();
            str3.getClass();
            releaseStage.getClass();
            this.id = j;
            this.token = investmentEntityToken;
            this.displayName = str;
            this.icon = image;
            this.price = currentPrice;
            this.symbol = str2;
            this.accentColor = color;
            this.units = str3;
            this.investedAmount = j2;
            this.delisted = z;
            this.marketCap = money;
            this.dailyGainParams = dailyGainParams;
            this.releaseStage = releaseStage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Owned)) {
                return false;
            }
            Owned owned = (Owned) obj;
            return this.id == owned.id && Intrinsics.areEqual(this.token, owned.token) && Intrinsics.areEqual(this.displayName, owned.displayName) && Intrinsics.areEqual(this.icon, owned.icon) && Intrinsics.areEqual(this.price, owned.price) && Intrinsics.areEqual(this.symbol, owned.symbol) && Intrinsics.areEqual(this.accentColor, owned.accentColor) && Intrinsics.areEqual(this.units, owned.units) && this.investedAmount == owned.investedAmount && this.delisted == owned.delisted && Intrinsics.areEqual(this.marketCap, owned.marketCap) && Intrinsics.areEqual(this.dailyGainParams, owned.dailyGainParams) && this.releaseStage == owned.releaseStage;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Color getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final boolean getDelisted() {
            return this.delisted;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final String getDisplayName() {
            return this.displayName;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Image getIcon() {
            return this.icon;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final long getId() {
            return this.id;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Money getMarketCap() {
            return this.marketCap;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final CurrentPrice getPrice() {
            return this.price;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final SyncInvestmentEntity.ReleaseStage getReleaseStage() {
            return this.releaseStage;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final InvestmentEntityToken getToken() {
            return this.token;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.token.value), 31, this.displayName);
            Image image = this.icon;
            int hashCode = (m + (image == null ? 0 : image.hashCode())) * 31;
            CurrentPrice currentPrice = this.price;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.accentColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (currentPrice == null ? 0 : currentPrice.hashCode())) * 31, 31, this.symbol), 31), 31, this.units), 31, this.investedAmount), 31, this.delisted);
            Money money = this.marketCap;
            int hashCode2 = (m2 + (money == null ? 0 : money.hashCode())) * 31;
            SyncInvestmentHolding.DailyGainParams dailyGainParams = this.dailyGainParams;
            return this.releaseStage.hashCode() + ((hashCode2 + (dailyGainParams != null ? dailyGainParams.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Owned(id=");
            sb.append(this.id);
            sb.append(", token=");
            sb.append(this.token);
            sb.append(", displayName=");
            sb.append(this.displayName);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", price=");
            sb.append(this.price);
            sb.append(", symbol=");
            sb.append(this.symbol);
            sb.append(", accentColor=");
            sb.append(this.accentColor);
            sb.append(", units=");
            sb.append(this.units);
            Boxes$$ExternalSyntheticOutline1.m1151m(this.investedAmount, ", investedAmount=", ", delisted=", sb);
            sb.append(this.delisted);
            sb.append(", marketCap=");
            sb.append(this.marketCap);
            sb.append(", dailyGainParams=");
            sb.append(this.dailyGainParams);
            sb.append(", releaseStage=");
            sb.append(this.releaseStage);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Unowned extends InvestmentEntityWithPrice {
        public final Color accentColor;
        public final boolean delisted;
        public final String displayName;
        public final Image icon;
        public final long id;
        public final Money marketCap;
        public final CurrentPrice price;
        public final SyncInvestmentEntity.ReleaseStage releaseStage;
        public final String symbol;
        public final InvestmentEntityToken token;

        public Unowned(long j, InvestmentEntityToken investmentEntityToken, String str, Image image, CurrentPrice currentPrice, String str2, Color color, boolean z, Money money, SyncInvestmentEntity.ReleaseStage releaseStage) {
            str.getClass();
            str2.getClass();
            this.id = j;
            this.token = investmentEntityToken;
            this.displayName = str;
            this.icon = image;
            this.price = currentPrice;
            this.symbol = str2;
            this.accentColor = color;
            this.delisted = z;
            this.marketCap = money;
            this.releaseStage = releaseStage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unowned)) {
                return false;
            }
            Unowned unowned = (Unowned) obj;
            return this.id == unowned.id && this.token.equals(unowned.token) && Intrinsics.areEqual(this.displayName, unowned.displayName) && Intrinsics.areEqual(this.icon, unowned.icon) && Intrinsics.areEqual(this.price, unowned.price) && Intrinsics.areEqual(this.symbol, unowned.symbol) && this.accentColor.equals(unowned.accentColor) && this.delisted == unowned.delisted && Intrinsics.areEqual(this.marketCap, unowned.marketCap) && this.releaseStage == unowned.releaseStage;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Color getAccentColor() {
            return this.accentColor;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final boolean getDelisted() {
            return this.delisted;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final String getDisplayName() {
            return this.displayName;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Image getIcon() {
            return this.icon;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final long getId() {
            return this.id;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final Money getMarketCap() {
            return this.marketCap;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final CurrentPrice getPrice() {
            return this.price;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final SyncInvestmentEntity.ReleaseStage getReleaseStage() {
            return this.releaseStage;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final String getSymbol() {
            return this.symbol;
        }

        @Override // com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice
        public final InvestmentEntityToken getToken() {
            return this.token;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.token.value), 31, this.displayName);
            Image image = this.icon;
            int hashCode = (m + (image == null ? 0 : image.hashCode())) * 31;
            CurrentPrice currentPrice = this.price;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(SVG$Unit$EnumUnboxingLocalUtility.m(this.accentColor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (currentPrice == null ? 0 : currentPrice.hashCode())) * 31, 31, this.symbol), 31), 31, this.delisted);
            Money money = this.marketCap;
            return this.releaseStage.hashCode() + ((m2 + (money != null ? money.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Unowned(id=" + this.id + ", token=" + this.token + ", displayName=" + this.displayName + ", icon=" + this.icon + ", price=" + this.price + ", symbol=" + this.symbol + ", accentColor=" + this.accentColor + ", delisted=" + this.delisted + ", marketCap=" + this.marketCap + ", releaseStage=" + this.releaseStage + ")";
        }
    }

    public abstract Color getAccentColor();

    public abstract boolean getDelisted();

    public abstract String getDisplayName();

    public abstract Image getIcon();

    public abstract long getId();

    public abstract Money getMarketCap();

    public abstract CurrentPrice getPrice();

    public abstract SyncInvestmentEntity.ReleaseStage getReleaseStage();

    public abstract String getSymbol();

    public abstract InvestmentEntityToken getToken();
}
