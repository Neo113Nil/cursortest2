package com.squareup.cash.notifications.channels;

/* loaded from: classes.dex */
public enum NotificationChannelGroupId {
    StocksOwned("stocks-owned"),
    StocksFollowed("stocks-followed"),
    NewsAndExclusives("news-and-exclusives"),
    Payments("payments"),
    Stock("stock"),
    Bitcoin("bitcoin"),
    Lending("lending"),
    Local("local"),
    Support("support"),
    Tax("tax"),
    CashCard("cash_card"),
    Security("security"),
    Other("na");

    public final String id;

    NotificationChannelGroupId(String str) {
        this.id = str;
    }
}
