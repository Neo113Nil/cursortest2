package com.google.android.libraries.places.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class zzpo {
    public static final Parcelable zza(Bundle bundle, String str, Class cls) {
        bundle.getClass();
        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, cls) : bundle.getParcelable(str);
        if (parcelable != null) {
            return parcelable;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
        return null;
    }
}
