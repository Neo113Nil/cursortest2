package com.squareup.cash.maps.viewmodels;

/* loaded from: classes6.dex */
public abstract class MarkerLocation {
    public final Double latitude;
    public final Double longitude;
    public final String title;
    public final String token;

    public MarkerLocation(Double d, Double d2, String str, String str2) {
        str2.getClass();
        this.token = str;
        this.title = str2;
        this.latitude = d;
        this.longitude = d2;
    }

    public String getTitle() {
        return this.title;
    }

    public String getToken() {
        return this.token;
    }
}
