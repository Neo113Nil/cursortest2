package com.squareup.cash.beacondetection.api;

/* loaded from: classes5.dex */
public enum LocationPermissionLevel {
    ALWAYS("always"),
    WHEN_IN_USE("when_in_use");

    public final String wireValue;

    LocationPermissionLevel(String str) {
        this.wireValue = str;
    }

    public final String getWireValue() {
        return this.wireValue;
    }
}
