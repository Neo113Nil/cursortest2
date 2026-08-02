package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.CharMatcher$Is;
import com.google.common.net.InetAddresses;

/* loaded from: classes4.dex */
public final class zzbui {
    public String zza;
    public String zzb = "";
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;

    private zzbui() {
    }

    public final void zzb(String str) {
        if (!str.isEmpty()) {
            if (zzbuj.zzb.get(str.charAt(0))) {
                for (int i = 0; i < str.length(); i++) {
                    if (!zzbuj.zzc.get(str.charAt(i))) {
                        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, "Invalid character in scheme at index ", new StringBuilder(String.valueOf(i).length() + 37)));
                        return;
                    }
                }
                this.zza = str;
                return;
            }
        }
        a$$ExternalSyntheticBUOutline0.m$3("Scheme must start with an alphabetic char");
    }

    public final void zzi(String str) {
        int i;
        String str2;
        int indexOf;
        if (str.startsWith("[") && str.endsWith("]") && (indexOf = str.indexOf(37)) > 0) {
            zzbuj.zzl(str.substring(indexOf, str.length() - 1), "scope", zzbuj.zzd, null);
        }
        CharMatcher$Is charMatcher$Is = InetAddresses.IPV4_DELIMITER_MATCHER;
        if (str.startsWith("[") && str.endsWith("]")) {
            str2 = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, str);
            i = 16;
        } else {
            i = 4;
            str2 = str;
        }
        byte[] ipStringToBytes = InetAddresses.ipStringToBytes(str2, null);
        if (((ipStringToBytes == null || ipStringToBytes.length != i) ? null : InetAddresses.bytesToInetAddress(null, ipStringToBytes)) == null) {
            zzbuj.zzl(str, "host", zzbuj.zze, null);
        }
        this.zzf = str;
    }

    public final zzbuj zzk() {
        Trace.checkState("Missing required scheme.", this.zza != null);
        if (this.zzf == null) {
            Trace.checkState("Cannot set port without host.", this.zzg == null);
            Trace.checkState("Cannot set userInfo without host.", this.zze == null);
        }
        return new zzbuj(this);
    }

    public /* synthetic */ zzbui(int i) {
    }
}
