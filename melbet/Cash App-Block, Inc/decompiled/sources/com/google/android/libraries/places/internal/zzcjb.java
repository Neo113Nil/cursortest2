package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public enum zzcjb {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    public final String zze;

    zzcjb(String str) {
        this.zze = str;
    }

    public static zzcjb zza(String str) {
        if (str.equals("http/1.0")) {
            return HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return HTTP_1_1;
        }
        if (str.equals("h2")) {
            return HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return SPDY_3;
        }
        a$$ExternalSyntheticBUOutline0.m$4("Unexpected protocol: ".concat(str));
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
