package com.squareup.cash.appmessages;

import com.squareup.cash.appmessages.TooltipAppMessageViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface TooltipAppMessageViewModel {

    public final class Loading implements TooltipAppMessageViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1687585500;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements TooltipAppMessageViewModel {
        public final ArrowPosition arrowPosition;
        public final TooltipAppMessageViewEvent.TooltipDismissed dismiss;
        public final boolean isLocalTooltip;
        public final String messageToken;
        public final Placement placement;
        public final TooltipAppMessageViewEvent.TargetClicked targetClickAction;
        public final String text;
        public final TooltipAppMessageViewEvent.TooltipClicked tooltipClickAction;
        public final TooltipType tooltipType;
        public final TooltipAppMessageViewEvent.TooltipViewed viewed;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ArrowPosition {
            public static final /* synthetic */ ArrowPosition[] $VALUES;
            public static final ArrowPosition BottomCenter;
            public static final ArrowPosition BottomLeft;
            public static final ArrowPosition BottomRight;
            public static final ArrowPosition TopCenter;
            public static final ArrowPosition TopLeft;
            public static final ArrowPosition TopRight;

            static {
                ArrowPosition arrowPosition = new ArrowPosition("BottomLeft", 0);
                BottomLeft = arrowPosition;
                ArrowPosition arrowPosition2 = new ArrowPosition("BottomCenter", 1);
                BottomCenter = arrowPosition2;
                ArrowPosition arrowPosition3 = new ArrowPosition("BottomRight", 2);
                BottomRight = arrowPosition3;
                ArrowPosition arrowPosition4 = new ArrowPosition("TopLeft", 3);
                TopLeft = arrowPosition4;
                ArrowPosition arrowPosition5 = new ArrowPosition("TopCenter", 4);
                TopCenter = arrowPosition5;
                ArrowPosition arrowPosition6 = new ArrowPosition("TopRight", 5);
                TopRight = arrowPosition6;
                $VALUES = new ArrowPosition[]{arrowPosition, arrowPosition2, arrowPosition3, arrowPosition4, arrowPosition5, arrowPosition6};
            }

            public static ArrowPosition valueOf(String str) {
                return (ArrowPosition) Enum.valueOf(ArrowPosition.class, str);
            }

            public static ArrowPosition[] values() {
                return (ArrowPosition[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes5.dex */
        public final class Placement {
            public static final /* synthetic */ Placement[] $VALUES;
            public static final Placement AccountSettingsCashtagDropdown;
            public static final Placement ActivityBottomNavigationTab;
            public static final Placement BalanceAppletTile;
            public static final Placement BankingBottomNavigationTab;
            public static final Placement DiscoverBottomNavigationTab;
            public static final Placement DiscoverToolbarMenuItem;
            public static final Placement GlobeToolbarMenuItem;
            public static final Placement KeypadTabNearbyButton;
            public static final Placement KeypadTabPoolButton;
            public static final Placement KeypadTabQrButton;
            public static final Placement KeypadTabTapToPayButton;
            public static final Placement MoneybotSavedToMemoryLabel;
            public static final Placement MoneybotToolbarMenuItem;
            public static final Placement ProfileToolbarMenuItem;
            public static final Placement QrToolbarMenuItem;
            public static final Placement RecipientSelectorPersonalizePaymentButton;
            public static final Placement SettingToolbarMenuItem;
            public static final Placement WalletBottomNavigationTab;

            static {
                Placement placement = new Placement("BalanceAppletTile", 0);
                BalanceAppletTile = placement;
                Placement placement2 = new Placement("QrToolbarMenuItem", 1);
                QrToolbarMenuItem = placement2;
                Placement placement3 = new Placement("GlobeToolbarMenuItem", 2);
                GlobeToolbarMenuItem = placement3;
                Placement placement4 = new Placement("DiscoverToolbarMenuItem", 3);
                DiscoverToolbarMenuItem = placement4;
                Placement placement5 = new Placement("SettingToolbarMenuItem", 4);
                SettingToolbarMenuItem = placement5;
                Placement placement6 = new Placement("ProfileToolbarMenuItem", 5);
                ProfileToolbarMenuItem = placement6;
                Placement placement7 = new Placement("BankingBottomNavigationTab", 6);
                BankingBottomNavigationTab = placement7;
                Placement placement8 = new Placement("WalletBottomNavigationTab", 7);
                WalletBottomNavigationTab = placement8;
                Placement placement9 = new Placement("DiscoverBottomNavigationTab", 8);
                DiscoverBottomNavigationTab = placement9;
                Placement placement10 = new Placement("ActivityBottomNavigationTab", 9);
                ActivityBottomNavigationTab = placement10;
                Placement placement11 = new Placement("RecipientSelectorPersonalizePaymentButton", 10);
                RecipientSelectorPersonalizePaymentButton = placement11;
                Placement placement12 = new Placement("KeypadTabPoolButton", 11);
                KeypadTabPoolButton = placement12;
                Placement placement13 = new Placement("KeypadTabQrButton", 12);
                KeypadTabQrButton = placement13;
                Placement placement14 = new Placement("KeypadTabTapToPayButton", 13);
                KeypadTabTapToPayButton = placement14;
                Placement placement15 = new Placement("KeypadTabNearbyButton", 14);
                KeypadTabNearbyButton = placement15;
                Placement placement16 = new Placement("AccountSettingsCashtagDropdown", 15);
                AccountSettingsCashtagDropdown = placement16;
                Placement placement17 = new Placement("MoneybotToolbarMenuItem", 16);
                MoneybotToolbarMenuItem = placement17;
                Placement placement18 = new Placement("MoneybotSavedToMemoryLabel", 17);
                MoneybotSavedToMemoryLabel = placement18;
                $VALUES = new Placement[]{placement, placement2, placement3, placement4, placement5, placement6, placement7, placement8, placement9, placement10, placement11, placement12, placement13, placement14, placement15, placement16, placement17, placement18};
            }

            public static Placement valueOf(String str) {
                return (Placement) Enum.valueOf(Placement.class, str);
            }

            public static Placement[] values() {
                return (Placement[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes5.dex */
        public final class TooltipType {
            public static final /* synthetic */ TooltipType[] $VALUES;
            public static final TooltipType ACCOUNT_SETTINGS;
            public static final TooltipType BALANCE_APPLET_TILE;
            public static final TooltipType BOTTOM_NAVIGATION_TAB;
            public static final TooltipType KEYPAD_BUTTON;
            public static final TooltipType KEYPAD_QR_BUTTON;
            public static final TooltipType KEYPAD_TOOLBAR_ICON;
            public static final TooltipType TOOLBAR_DISCOVER_MENU_ITEM;
            public static final TooltipType TOOLBAR_MENU;
            public static final TooltipType TOOLBAR_MONEYBOT_MENU_ITEM;
            public static final TooltipType TOOLBAR_MONEYBOT_MENU_ITEM_HOME;

            static {
                TooltipType tooltipType = new TooltipType("TOOLBAR_DISCOVER_MENU_ITEM", 0);
                TOOLBAR_DISCOVER_MENU_ITEM = tooltipType;
                TooltipType tooltipType2 = new TooltipType("TOOLBAR_MENU", 1);
                TOOLBAR_MENU = tooltipType2;
                TooltipType tooltipType3 = new TooltipType("BOTTOM_NAVIGATION_TAB", 2);
                BOTTOM_NAVIGATION_TAB = tooltipType3;
                TooltipType tooltipType4 = new TooltipType("BALANCE_APPLET_TILE", 3);
                BALANCE_APPLET_TILE = tooltipType4;
                TooltipType tooltipType5 = new TooltipType("KEYPAD_BUTTON", 4);
                KEYPAD_BUTTON = tooltipType5;
                TooltipType tooltipType6 = new TooltipType("KEYPAD_QR_BUTTON", 5);
                KEYPAD_QR_BUTTON = tooltipType6;
                TooltipType tooltipType7 = new TooltipType("KEYPAD_TOOLBAR_ICON", 6);
                KEYPAD_TOOLBAR_ICON = tooltipType7;
                TooltipType tooltipType8 = new TooltipType("ACCOUNT_SETTINGS", 7);
                ACCOUNT_SETTINGS = tooltipType8;
                TooltipType tooltipType9 = new TooltipType("TOOLBAR_MONEYBOT_MENU_ITEM", 8);
                TOOLBAR_MONEYBOT_MENU_ITEM = tooltipType9;
                TooltipType tooltipType10 = new TooltipType("TOOLBAR_MONEYBOT_MENU_ITEM_HOME", 9);
                TOOLBAR_MONEYBOT_MENU_ITEM_HOME = tooltipType10;
                $VALUES = new TooltipType[]{tooltipType, tooltipType2, tooltipType3, tooltipType4, tooltipType5, tooltipType6, tooltipType7, tooltipType8, tooltipType9, tooltipType10, new TooltipType("MONEYBOT_MEMORY_LABEL", 10)};
            }

            public static TooltipType valueOf(String str) {
                return (TooltipType) Enum.valueOf(TooltipType.class, str);
            }

            public static TooltipType[] values() {
                return (TooltipType[]) $VALUES.clone();
            }
        }

        public Ready(String str, String str2, Placement placement, ArrowPosition arrowPosition, TooltipType tooltipType, TooltipAppMessageViewEvent.TargetClicked targetClicked, TooltipAppMessageViewEvent.TooltipClicked tooltipClicked, TooltipAppMessageViewEvent.TooltipDismissed tooltipDismissed, TooltipAppMessageViewEvent.TooltipViewed tooltipViewed, boolean z) {
            str.getClass();
            str2.getClass();
            placement.getClass();
            arrowPosition.getClass();
            tooltipType.getClass();
            this.messageToken = str;
            this.text = str2;
            this.placement = placement;
            this.arrowPosition = arrowPosition;
            this.tooltipType = tooltipType;
            this.targetClickAction = targetClicked;
            this.tooltipClickAction = tooltipClicked;
            this.dismiss = tooltipDismissed;
            this.viewed = tooltipViewed;
            this.isLocalTooltip = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.messageToken, ready.messageToken) && Intrinsics.areEqual(this.text, ready.text) && this.placement == ready.placement && this.arrowPosition == ready.arrowPosition && this.tooltipType == ready.tooltipType && this.targetClickAction.equals(ready.targetClickAction) && this.tooltipClickAction.equals(ready.tooltipClickAction) && this.dismiss.equals(ready.dismiss) && this.viewed.equals(ready.viewed) && this.isLocalTooltip == ready.isLocalTooltip;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isLocalTooltip) + ((this.viewed.hashCode() + ((this.dismiss.hashCode() + ((this.tooltipClickAction.hashCode() + ((this.targetClickAction.hashCode() + ((this.tooltipType.hashCode() + ((this.arrowPosition.hashCode() + ((this.placement.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.messageToken.hashCode() * 31, 31, this.text)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ready(messageToken=", this.messageToken, ", text=", this.text, ", placement=");
            m.append(this.placement);
            m.append(", arrowPosition=");
            m.append(this.arrowPosition);
            m.append(", tooltipType=");
            m.append(this.tooltipType);
            m.append(", targetClickAction=");
            m.append(this.targetClickAction);
            m.append(", tooltipClickAction=");
            m.append(this.tooltipClickAction);
            m.append(", dismiss=");
            m.append(this.dismiss);
            m.append(", viewed=");
            m.append(this.viewed);
            m.append(", isLocalTooltip=");
            m.append(this.isLocalTooltip);
            m.append(")");
            return m.toString();
        }
    }
}
