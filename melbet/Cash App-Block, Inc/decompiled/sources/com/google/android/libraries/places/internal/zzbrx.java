package com.google.android.libraries.places.internal;

import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class zzbrx extends zzbrk {
    public static final zzbsz zza = new zzbsz(new zzbrw());

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(zzd(), "policy");
        stringHelper.addUnconditionalHolder("priority", String.valueOf(5));
        stringHelper.add("available", true);
        return stringHelper.toString();
    }

    public abstract String zzd();

    public zzbsz zze(Map map) {
        return zza;
    }
}
