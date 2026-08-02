package com.squareup.cash.elementboundsregistry.core;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public final class ElementBoundsRegistry {
    public final StateFlowImpl elements;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Element {
        public static final /* synthetic */ Element[] $VALUES;
        public static final Element AccountSettingsCashtagDropdown;
        public static final Element ActivityTab;
        public static final Element BalanceAppletTile;
        public static final Element DiscoverTab;
        public static final Element KeypadNearbyButton;
        public static final Element KeypadPoolButton;
        public static final Element KeypadQrButton;
        public static final Element KeypadTapToPayButton;
        public static final Element LocalTab;
        public static final Element MoneyTab;
        public static final Element PersonalizePaymentButton;
        public static final Element SendTab;
        public static final Element ToolbarDiscoverMenuItem;
        public static final Element ToolbarGlobeMenuItem;
        public static final Element ToolbarMoneybotMenuItem;
        public static final Element ToolbarMoneybotOverflowMenuItem;
        public static final Element ToolbarProfileMenuItem;
        public static final Element ToolbarQrMenuItem;
        public static final Element ToolbarSettingsMenuItem;
        public static final Element WalletTab;

        static {
            Element element = new Element("ActivityTab", 0);
            ActivityTab = element;
            Element element2 = new Element("BalanceAppletTile", 1);
            BalanceAppletTile = element2;
            Element element3 = new Element("WalletTab", 2);
            WalletTab = element3;
            Element element4 = new Element("DiscoverTab", 3);
            DiscoverTab = element4;
            Element element5 = new Element("OffersTab", 4);
            Element element6 = new Element("MoneyTab", 5);
            MoneyTab = element6;
            Element element7 = new Element("LocalTab", 6);
            LocalTab = element7;
            Element element8 = new Element("PaymentRequestButton", 7);
            Element element9 = new Element("PersonalizePaymentButton", 8);
            PersonalizePaymentButton = element9;
            Element element10 = new Element("SendTab", 9);
            SendTab = element10;
            Element element11 = new Element("ToolbarQrMenuItem", 10);
            ToolbarQrMenuItem = element11;
            Element element12 = new Element("ToolbarGlobeMenuItem", 11);
            ToolbarGlobeMenuItem = element12;
            Element element13 = new Element("ToolbarSettingsMenuItem", 12);
            ToolbarSettingsMenuItem = element13;
            Element element14 = new Element("ToolbarProfileMenuItem", 13);
            ToolbarProfileMenuItem = element14;
            Element element15 = new Element("ToolbarDiscoverMenuItem", 14);
            ToolbarDiscoverMenuItem = element15;
            Element element16 = new Element("KeypadPoolButton", 15);
            KeypadPoolButton = element16;
            Element element17 = new Element("KeypadQrButton", 16);
            KeypadQrButton = element17;
            Element element18 = new Element("KeypadTapToPayButton", 17);
            KeypadTapToPayButton = element18;
            Element element19 = new Element("KeypadNearbyButton", 18);
            KeypadNearbyButton = element19;
            Element element20 = new Element("AccountSettingsCashtagDropdown", 19);
            AccountSettingsCashtagDropdown = element20;
            Element element21 = new Element("ToolbarMoneybotMenuItem", 20);
            ToolbarMoneybotMenuItem = element21;
            Element element22 = new Element("ToolbarMoneybotOverflowMenuItem", 21);
            ToolbarMoneybotOverflowMenuItem = element22;
            $VALUES = new Element[]{element, element2, element3, element4, element5, element6, element7, element8, element9, element10, element11, element12, element13, element14, element15, element16, element17, element18, element19, element20, element21, element22};
        }

        public static Element valueOf(String str) {
            return (Element) Enum.valueOf(Element.class, str);
        }

        public static Element[] values() {
            return (Element[]) $VALUES.clone();
        }
    }

    public ElementBoundsRegistry() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.elements = FlowKt.MutableStateFlow(emptyMap);
    }

    public final void set(Enum r2, BoundsRegistry$Bounds boundsRegistry$Bounds) {
        StateFlowImpl stateFlowImpl = this.elements;
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap((Map) stateFlowImpl.getValue());
        if (boundsRegistry$Bounds == null) {
            mutableMap.remove(r2);
        } else {
            mutableMap.put(r2, boundsRegistry$Bounds);
        }
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, mutableMap);
    }
}
