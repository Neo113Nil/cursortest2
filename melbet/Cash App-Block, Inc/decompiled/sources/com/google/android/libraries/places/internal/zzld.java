package com.google.android.libraries.places.internal;

import android.location.Location;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.squareup.scannerview.SizeMap;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public final class zzld extends com.google.android.gms.internal.time.zzbb {
    public final Location zza;
    public final ImmutableList zzb;

    public zzld(com.google.android.libraries.places.api.net.zzn zznVar, Location location, ImmutableList immutableList, Locale locale, String str, zzje zzjeVar) {
        super(zznVar, locale, str, zzjeVar);
        this.zza = location;
        this.zzb = immutableList;
    }

    @Override // com.google.android.gms.internal.time.zzbb
    public final HashMap zza() {
        com.google.android.libraries.places.api.net.zzn zznVar = (com.google.android.libraries.places.api.net.zzn) ((zznk) super.zza);
        HashMap hashMap = new HashMap();
        RegularImmutableMap regularImmutableMap = zzmp.zza;
        Integer num = null;
        Location location = this.zza;
        com.google.android.gms.internal.time.zzbb.zzg(hashMap, "location", location == null ? null : String.format(Locale.US, "%.15f,%.15f", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())));
        StringBuilder sb = new StringBuilder();
        ImmutableList immutableList = this.zzb;
        int size = immutableList.size();
        for (int i = 0; i < size; i++) {
            zzgg zzggVar = (zzgg) immutableList.get(i);
            int length = sb.length();
            StatusLine builder = RegularImmutableMap.builder();
            builder.put("mac", zzggVar.zza);
            builder.put("strength_dbm", Integer.valueOf(zzggVar.zzb));
            builder.put("wifi_auth_type", zzmp.zza.get(zzggVar.zzc));
            builder.put("is_connected", Boolean.valueOf(zzggVar.zzd));
            builder.put("frequency_mhz", Integer.valueOf(zzggVar.zze));
            RegularImmutableMap build = builder.build(true);
            SizeMap sizeMap = new SizeMap(new Joiner(","), 4);
            UnmodifiableIterator it = ((RegularImmutableMap.EntrySet) build.entrySet()).iterator();
            StringBuilder sb2 = new StringBuilder();
            try {
                sizeMap.appendTo(sb2, it);
                String sb3 = sb2.toString();
                int length2 = sb.length();
                String concat = (length > 0 ? "|" : "").concat(sb3);
                if (concat.length() + length2 > 4000) {
                    break;
                }
                sb.append(concat);
            } catch (IOException e) {
                a$$ExternalSyntheticBUOutline0.m$1(e);
                return null;
            }
        }
        com.google.android.gms.internal.time.zzbb.zzg(hashMap, "wifiaccesspoints", sb.toString());
        if (location != null) {
            float accuracy = location.getAccuracy();
            if (location.hasAccuracy() && accuracy > RecyclerView.DECELERATION_RATE) {
                num = Integer.valueOf(Math.round(accuracy * 100.0f));
            }
        }
        com.google.android.gms.internal.time.zzbb.zzg(hashMap, "precision", num);
        com.google.android.gms.internal.time.zzbb.zzg(hashMap, "timestamp", Long.valueOf(location.getTime()));
        com.google.android.gms.internal.time.zzbb.zzg(hashMap, "fields", zzmq.zzb(zznVar.zza));
        return hashMap;
    }

    @Override // com.google.android.gms.internal.time.zzbb
    public final String zzb() {
        return "findplacefromuserlocation/json";
    }
}
