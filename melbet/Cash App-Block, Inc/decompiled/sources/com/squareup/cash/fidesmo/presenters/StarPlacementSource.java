package com.squareup.cash.fidesmo.presenters;

/* loaded from: classes6.dex */
public enum StarPlacementSource {
    HARDCODED_MAP("hardcoded_map"),
    HARDCODED_MAP_CENTER_FALLBACK("hardcoded_map_center_fallback"),
    NFC_ANTENNA_INFO("nfc_antenna_info"),
    SAMSUNG_DEFAULT("samsung_default"),
    NONE("none"),
    DISPLAY_METRICS_UNAVAILABLE("display_metrics_unavailable"),
    DEBUG_OVERRIDE("debug_override"),
    AMPLITUDE_VARIANT("amplitude_variant");

    public final String analyticsLabel;

    StarPlacementSource(String str) {
        this.analyticsLabel = str;
    }
}
