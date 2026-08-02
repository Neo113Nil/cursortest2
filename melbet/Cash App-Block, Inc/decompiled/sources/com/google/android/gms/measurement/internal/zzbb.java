package com.google.android.gms.measurement.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzbb extends zzjf {
    public long zza;
    public String zzb;

    @Override // com.google.android.gms.measurement.internal.zzjf
    public final boolean zza() {
        Calendar calendar = Calendar.getInstance();
        this.zza = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.zzb = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long zzb() {
        zzw();
        return this.zza;
    }

    public final String zzc() {
        zzw();
        return this.zzb;
    }
}
