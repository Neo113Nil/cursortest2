package com.squareup.cash.bitcoin.viewmodels.applet.widget;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BitcoinWidget {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ BitcoinWidget[] $VALUES;
    public static final BitcoinWidget ACTIVITY;
    public static final BitcoinWidget AUTO_INVEST;
    public static final BitcoinWidget BALANCE;
    public static final BitcoinWidget BITCOIN_MAP_CARD;
    public static final BitcoinWidget BITCOIN_STORIES;
    public static final BitcoinWidget BOOST;
    public static final BitcoinWidget BUTTONS;
    public static final BitcoinWidget DISABLED;
    public static final BitcoinWidget DISCLOSURE;
    public static final BitcoinWidget GRAPH;
    public static final BitcoinWidget KYB_RESTRICTION;
    public static final BitcoinWidget NEWS;
    public static final BitcoinWidget ON_RAMP;
    public static final BitcoinWidget PENDING_IDV;
    public static final BitcoinWidget PERFORMANCE;
    public static final BitcoinWidget STACKING_TOOLS;
    public static final BitcoinWidget STATS_AND_SETTINGS;
    public static final BitcoinWidget WELCOME;

    static {
        BitcoinWidget bitcoinWidget = new BitcoinWidget("WELCOME", 0);
        WELCOME = bitcoinWidget;
        BitcoinWidget bitcoinWidget2 = new BitcoinWidget("GRAPH", 1);
        GRAPH = bitcoinWidget2;
        BitcoinWidget bitcoinWidget3 = new BitcoinWidget("BOOST", 2);
        BOOST = bitcoinWidget3;
        BitcoinWidget bitcoinWidget4 = new BitcoinWidget("ON_RAMP", 3);
        ON_RAMP = bitcoinWidget4;
        BitcoinWidget bitcoinWidget5 = new BitcoinWidget("DISCLOSURE", 4);
        DISCLOSURE = bitcoinWidget5;
        BitcoinWidget bitcoinWidget6 = new BitcoinWidget("BUTTONS", 5);
        BUTTONS = bitcoinWidget6;
        BitcoinWidget bitcoinWidget7 = new BitcoinWidget("NEWS", 6);
        NEWS = bitcoinWidget7;
        BitcoinWidget bitcoinWidget8 = new BitcoinWidget("PENDING_IDV", 7);
        PENDING_IDV = bitcoinWidget8;
        BitcoinWidget bitcoinWidget9 = new BitcoinWidget("STATS_AND_SETTINGS", 8);
        STATS_AND_SETTINGS = bitcoinWidget9;
        BitcoinWidget bitcoinWidget10 = new BitcoinWidget("AUTO_INVEST", 9);
        AUTO_INVEST = bitcoinWidget10;
        BitcoinWidget bitcoinWidget11 = new BitcoinWidget("ACTIVITY", 10);
        ACTIVITY = bitcoinWidget11;
        BitcoinWidget bitcoinWidget12 = new BitcoinWidget("BITCOIN_STORIES", 11);
        BITCOIN_STORIES = bitcoinWidget12;
        BitcoinWidget bitcoinWidget13 = new BitcoinWidget("KYB_RESTRICTION", 12);
        KYB_RESTRICTION = bitcoinWidget13;
        BitcoinWidget bitcoinWidget14 = new BitcoinWidget("STACKING_TOOLS", 13);
        STACKING_TOOLS = bitcoinWidget14;
        BitcoinWidget bitcoinWidget15 = new BitcoinWidget("BALANCE", 14);
        BALANCE = bitcoinWidget15;
        BitcoinWidget bitcoinWidget16 = new BitcoinWidget("PERFORMANCE", 15);
        PERFORMANCE = bitcoinWidget16;
        BitcoinWidget bitcoinWidget17 = new BitcoinWidget("DISABLED", 16);
        DISABLED = bitcoinWidget17;
        BitcoinWidget bitcoinWidget18 = new BitcoinWidget("BITCOIN_MAP_CARD", 17);
        BITCOIN_MAP_CARD = bitcoinWidget18;
        BitcoinWidget[] bitcoinWidgetArr = {bitcoinWidget, bitcoinWidget2, bitcoinWidget3, bitcoinWidget4, bitcoinWidget5, bitcoinWidget6, bitcoinWidget7, bitcoinWidget8, bitcoinWidget9, bitcoinWidget10, bitcoinWidget11, bitcoinWidget12, bitcoinWidget13, bitcoinWidget14, bitcoinWidget15, bitcoinWidget16, bitcoinWidget17, bitcoinWidget18};
        $VALUES = bitcoinWidgetArr;
        $ENTRIES = new EnumEntriesList(bitcoinWidgetArr);
    }

    public static BitcoinWidget valueOf(String str) {
        return (BitcoinWidget) Enum.valueOf(BitcoinWidget.class, str);
    }

    public static BitcoinWidget[] values() {
        return (BitcoinWidget[]) $VALUES.clone();
    }
}
