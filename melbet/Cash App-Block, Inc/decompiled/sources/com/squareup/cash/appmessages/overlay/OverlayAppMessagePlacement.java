package com.squareup.cash.appmessages.overlay;

import com.google.mlkit.vision.text.zzd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class OverlayAppMessagePlacement {
    public static final /* synthetic */ OverlayAppMessagePlacement[] $VALUES;
    public static final OverlayAppMessagePlacement ActivityTab;
    public static final OverlayAppMessagePlacement BitcoinTab;
    public static final OverlayAppMessagePlacement CardTab;
    public static final zzd Companion;
    public static final OverlayAppMessagePlacement DiscoverTab;
    public static final OverlayAppMessagePlacement InvestingTab;
    public static final OverlayAppMessagePlacement LocalTab;
    public static final OverlayAppMessagePlacement MoneyTab;
    public static final OverlayAppMessagePlacement OffersTab;
    public static final OverlayAppMessagePlacement PaymentPadTab;

    static {
        OverlayAppMessagePlacement overlayAppMessagePlacement = new OverlayAppMessagePlacement("MoneyTab", 0);
        MoneyTab = overlayAppMessagePlacement;
        OverlayAppMessagePlacement overlayAppMessagePlacement2 = new OverlayAppMessagePlacement("CardTab", 1);
        CardTab = overlayAppMessagePlacement2;
        OverlayAppMessagePlacement overlayAppMessagePlacement3 = new OverlayAppMessagePlacement("PaymentPadTab", 2);
        PaymentPadTab = overlayAppMessagePlacement3;
        OverlayAppMessagePlacement overlayAppMessagePlacement4 = new OverlayAppMessagePlacement("InvestingTab", 3);
        InvestingTab = overlayAppMessagePlacement4;
        OverlayAppMessagePlacement overlayAppMessagePlacement5 = new OverlayAppMessagePlacement("ActivityTab", 4);
        ActivityTab = overlayAppMessagePlacement5;
        OverlayAppMessagePlacement overlayAppMessagePlacement6 = new OverlayAppMessagePlacement("BitcoinTab", 5);
        BitcoinTab = overlayAppMessagePlacement6;
        OverlayAppMessagePlacement overlayAppMessagePlacement7 = new OverlayAppMessagePlacement("OffersTab", 6);
        OffersTab = overlayAppMessagePlacement7;
        OverlayAppMessagePlacement overlayAppMessagePlacement8 = new OverlayAppMessagePlacement("DiscoverTab", 7);
        DiscoverTab = overlayAppMessagePlacement8;
        OverlayAppMessagePlacement overlayAppMessagePlacement9 = new OverlayAppMessagePlacement("LocalTab", 8);
        LocalTab = overlayAppMessagePlacement9;
        $VALUES = new OverlayAppMessagePlacement[]{overlayAppMessagePlacement, overlayAppMessagePlacement2, overlayAppMessagePlacement3, overlayAppMessagePlacement4, overlayAppMessagePlacement5, overlayAppMessagePlacement6, overlayAppMessagePlacement7, overlayAppMessagePlacement8, overlayAppMessagePlacement9};
        Companion = new zzd(15);
    }

    public static OverlayAppMessagePlacement valueOf(String str) {
        return (OverlayAppMessagePlacement) Enum.valueOf(OverlayAppMessagePlacement.class, str);
    }

    public static OverlayAppMessagePlacement[] values() {
        return (OverlayAppMessagePlacement[]) $VALUES.clone();
    }
}
