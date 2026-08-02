package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* loaded from: classes4.dex */
public final class zzle {
    public final SimpleArrayMap zza;

    public zzle(SimpleArrayMap simpleArrayMap) {
        this.zza = simpleArrayMap;
    }

    public final String zza(Uri uri, String str) {
        SimpleArrayMap simpleArrayMap = uri != null ? (SimpleArrayMap) this.zza.get(uri.toString()) : null;
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get(str);
    }
}
