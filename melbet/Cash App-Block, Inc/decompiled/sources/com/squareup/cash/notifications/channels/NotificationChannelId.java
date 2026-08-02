package com.squareup.cash.notifications.channels;

import com.squareup.ecr.BuildConfig;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NotificationChannelId {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ NotificationChannelId[] $VALUES;
    public static final NotificationChannelId AccountChanges;
    public static final NotificationChannelId AccountSecurity;
    public static final NotificationChannelId BitcoinPriceAlerts;
    public static final NotificationChannelId CashAppNews;
    public static final NotificationChannelId Exclusives;
    public static final NotificationChannelId Families;
    public static final NotificationChannelId GeneralAndPromotions;
    public static final NotificationChannelId Notices;
    public static final NotificationChannelId Offers;
    public static final NotificationChannelId StocksFollowedEarningsIpo;
    public static final NotificationChannelId StocksFollowedPriceAlerts;
    public static final NotificationChannelId StocksOwnedEarningReport;
    public static final NotificationChannelId StocksOwnedPriceAlerts;
    public static final NotificationChannelId TaxMarketing;
    public static final NotificationChannelId TaxesMarketing;
    public static final NotificationChannelId Transactions;
    public final NotificationChannelGroupId group;
    public final String id;

    static {
        NotificationChannelGroupId notificationChannelGroupId = NotificationChannelGroupId.Payments;
        NotificationChannelId notificationChannelId = new NotificationChannelId("PaymentReceived", 0, "payments-cash", notificationChannelGroupId);
        NotificationChannelId notificationChannelId2 = new NotificationChannelId("PaymentRequested", 1, "payments-bill", notificationChannelGroupId);
        NotificationChannelId notificationChannelId3 = new NotificationChannelId("InternationalPaymentStatus", 2, "INTERNATIONAL_PAYMENT_STATUS", notificationChannelGroupId);
        NotificationChannelId notificationChannelId4 = new NotificationChannelId("Borrow", 3, "LENDING_BORROW", NotificationChannelGroupId.Lending);
        NotificationChannelGroupId notificationChannelGroupId2 = NotificationChannelGroupId.Tax;
        NotificationChannelId notificationChannelId5 = new NotificationChannelId("TaxDocuments", 4, "TAX_DOCUMENTS", notificationChannelGroupId2);
        NotificationChannelId notificationChannelId6 = new NotificationChannelId("TaxMarketing", 5, "TAX_MARKETING", notificationChannelGroupId2);
        TaxMarketing = notificationChannelId6;
        NotificationChannelGroupId notificationChannelGroupId3 = NotificationChannelGroupId.Bitcoin;
        NotificationChannelId notificationChannelId7 = new NotificationChannelId("BitcoinGeneral", 6, "BITCOIN_GENERAL", notificationChannelGroupId3);
        NotificationChannelId notificationChannelId8 = new NotificationChannelId("BitcoinTransactions", 7, "BITCOIN_TRANSACTIONS", notificationChannelGroupId3);
        NotificationChannelId notificationChannelId9 = new NotificationChannelId("BitcoinTrading", 8, "INVESTMENT_BITCOIN_TRADING", notificationChannelGroupId3);
        NotificationChannelId notificationChannelId10 = new NotificationChannelId("BitcoinPerformance", 9, "INVESTMENT_BITCOIN_PERFORMANCE", notificationChannelGroupId3);
        NotificationChannelGroupId notificationChannelGroupId4 = NotificationChannelGroupId.Stock;
        NotificationChannelId notificationChannelId11 = new NotificationChannelId("OwnedStocksPerformance", 10, "INVESTMENT_STOCKS_OWNED_PERFORMANCE", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId12 = new NotificationChannelId("OwnedStocksEarningsReport", 11, "INVESTMENT_STOCKS_OWNED_EARNINGS", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId13 = new NotificationChannelId("FollowedStocksPerformance", 12, "INVESTMENT_STOCKS_FOLLOWED_PERFORMANCE", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId14 = new NotificationChannelId("FollowedStocksEarningsReport", 13, "INVESTMENT_STOCKS_FOLLOWED_EARNINGS", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId15 = new NotificationChannelId("FollowedStocksIpo", 14, "INVESTMENT_STOCKS_FOLLOWED_IPO", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId16 = new NotificationChannelId("PortfolioActivity", 15, "INVESTMENT_PORTFOLIO_ACTIVITY", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId17 = new NotificationChannelId("OrderActivity", 16, "INVESTMENT_ORDER_ACTIVITY", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId18 = new NotificationChannelId("MarketActivity", 17, "INVESTMENT_MARKET_ACTIVITY", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId19 = new NotificationChannelId("AccountActivity", 18, "INVESTMENT_ACCOUNT_ACTIVITY", notificationChannelGroupId4);
        NotificationChannelId notificationChannelId20 = new NotificationChannelId("SupportMessages", 19, "SUPPORT_MESSAGES", NotificationChannelGroupId.Support);
        NotificationChannelGroupId notificationChannelGroupId5 = NotificationChannelGroupId.CashCard;
        NotificationChannelId notificationChannelId21 = new NotificationChannelId("InvestingRoundUps", 20, "AUTO_INVESTMENT", notificationChannelGroupId5);
        NotificationChannelId notificationChannelId22 = new NotificationChannelId("CashAppCard", 21, "CASH_APP_CARD", notificationChannelGroupId5);
        NotificationChannelId notificationChannelId23 = new NotificationChannelId("LegacyAccountSecurity", 22, "ACCOUNT_SECURITY", NotificationChannelGroupId.Security);
        NotificationChannelGroupId notificationChannelGroupId6 = NotificationChannelGroupId.Other;
        NotificationChannelId notificationChannelId24 = new NotificationChannelId("GeneralAndPromotions", 23, "general", notificationChannelGroupId6);
        GeneralAndPromotions = notificationChannelId24;
        NotificationChannelId notificationChannelId25 = new NotificationChannelId("Debug", 24, BuildConfig.BUILD_TYPE, notificationChannelGroupId6);
        NotificationChannelId notificationChannelId26 = new NotificationChannelId("AccountSecurity", 25, "NOTIFICATION_CATEGORY_ACCOUNT_SECURITY", notificationChannelGroupId6);
        AccountSecurity = notificationChannelId26;
        NotificationChannelId notificationChannelId27 = new NotificationChannelId("Notices", 26, "NOTIFICATION_CATEGORY_ACCOUNT_NOTICES", notificationChannelGroupId6);
        Notices = notificationChannelId27;
        NotificationChannelId notificationChannelId28 = new NotificationChannelId("AccountChanges", 27, "NOTIFICATION_CATEGORY_ACCOUNT_CHANGES", notificationChannelGroupId6);
        AccountChanges = notificationChannelId28;
        NotificationChannelId notificationChannelId29 = new NotificationChannelId("Transactions", 28, "NOTIFICATION_CATEGORY_ACTIVITY_TRANSACTIONS", notificationChannelGroupId6);
        Transactions = notificationChannelId29;
        NotificationChannelGroupId notificationChannelGroupId7 = NotificationChannelGroupId.StocksOwned;
        NotificationChannelId notificationChannelId30 = new NotificationChannelId("StocksOwnedPriceAlerts", 29, "NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_PRICE_CHANGES", notificationChannelGroupId7);
        StocksOwnedPriceAlerts = notificationChannelId30;
        NotificationChannelId notificationChannelId31 = new NotificationChannelId("StocksOwnedEarningReport", 30, "NOTIFICATION_CATEGORY_INVESTING_OWNED_STOCK_EARNINGS_REPORTS", notificationChannelGroupId7);
        StocksOwnedEarningReport = notificationChannelId31;
        NotificationChannelGroupId notificationChannelGroupId8 = NotificationChannelGroupId.StocksFollowed;
        NotificationChannelId notificationChannelId32 = new NotificationChannelId("StocksFollowedPriceAlerts", 31, "NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_PRICE_CHANGES", notificationChannelGroupId8);
        StocksFollowedPriceAlerts = notificationChannelId32;
        NotificationChannelId notificationChannelId33 = new NotificationChannelId("StocksFollowedEarningsIpo", 32, "NOTIFICATION_CATEGORY_INVESTING_FOLLOWED_STOCK_EARNINGS_REPORTS", notificationChannelGroupId8);
        StocksFollowedEarningsIpo = notificationChannelId33;
        NotificationChannelId notificationChannelId34 = new NotificationChannelId("BitcoinPriceAlerts", 33, "NOTIFICATION_CATEGORY_BITCOIN_PRICE_ALERTS", notificationChannelGroupId6);
        BitcoinPriceAlerts = notificationChannelId34;
        NotificationChannelId notificationChannelId35 = new NotificationChannelId("Families", 34, "NOTIFICATION_CATEGORY_FAMILY", notificationChannelGroupId6);
        Families = notificationChannelId35;
        NotificationChannelGroupId notificationChannelGroupId9 = NotificationChannelGroupId.NewsAndExclusives;
        NotificationChannelId notificationChannelId36 = new NotificationChannelId("Offers", 35, "NOTIFICATION_CATEGORY_MARKETING_OFFERS", notificationChannelGroupId9);
        Offers = notificationChannelId36;
        NotificationChannelId notificationChannelId37 = new NotificationChannelId("CashAppNews", 36, "NOTIFICATION_CATEGORY_MARKETING_CASH_APP_NEWS", notificationChannelGroupId9);
        CashAppNews = notificationChannelId37;
        NotificationChannelId notificationChannelId38 = new NotificationChannelId("Exclusives", 37, "NOTIFICATION_CATEGORY_MARKETING_EXCLUSIVES", notificationChannelGroupId9);
        Exclusives = notificationChannelId38;
        NotificationChannelId notificationChannelId39 = new NotificationChannelId("TaxesMarketing", 38, "NOTIFICATION_CATEGORY_CASH_APP_TAXES", notificationChannelGroupId6);
        TaxesMarketing = notificationChannelId39;
        NotificationChannelId[] notificationChannelIdArr = {notificationChannelId, notificationChannelId2, notificationChannelId3, notificationChannelId4, notificationChannelId5, notificationChannelId6, notificationChannelId7, notificationChannelId8, notificationChannelId9, notificationChannelId10, notificationChannelId11, notificationChannelId12, notificationChannelId13, notificationChannelId14, notificationChannelId15, notificationChannelId16, notificationChannelId17, notificationChannelId18, notificationChannelId19, notificationChannelId20, notificationChannelId21, notificationChannelId22, notificationChannelId23, notificationChannelId24, notificationChannelId25, notificationChannelId26, notificationChannelId27, notificationChannelId28, notificationChannelId29, notificationChannelId30, notificationChannelId31, notificationChannelId32, notificationChannelId33, notificationChannelId34, notificationChannelId35, notificationChannelId36, notificationChannelId37, notificationChannelId38, notificationChannelId39};
        $VALUES = notificationChannelIdArr;
        $ENTRIES = new EnumEntriesList(notificationChannelIdArr);
    }

    public NotificationChannelId(String str, int i, String str2, NotificationChannelGroupId notificationChannelGroupId) {
        this.id = str2;
        this.group = notificationChannelGroupId;
    }

    public static EnumEntriesList getEntries() {
        return $ENTRIES;
    }

    public static NotificationChannelId valueOf(String str) {
        return (NotificationChannelId) Enum.valueOf(NotificationChannelId.class, str);
    }

    public static NotificationChannelId[] values() {
        return (NotificationChannelId[]) $VALUES.clone();
    }

    public final NotificationChannelGroupId getGroup() {
        return this.group;
    }

    public final String getId() {
        return this.id;
    }
}
