package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: io.appmetrica.analytics.impl.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0705r2 {

    /* renamed from: a, reason: collision with root package name */
    public final LocationManager f6805a;

    public C0705r2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C0705r2(LocationManager locationManager) {
        this.f6805a = locationManager;
    }
}
