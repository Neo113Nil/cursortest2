package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzcjq {
    public static final Logger zza = Logger.getLogger(zzcjn.class.getName());
    public static final zzcls zzb;

    static {
        zzcls zzclsVar = zzcls.zza;
        zzb = zzey.zza("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    }

    public static /* synthetic */ int zze(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return i - s;
        }
        zzi("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static /* synthetic */ int zzf(zzcly zzclyVar) {
        return (zzclyVar.zzj() & 255) | ((zzclyVar.zzj() & 255) << 16) | ((zzclyVar.zzj() & 255) << 8);
    }

    public static void zzi(String str, Object... objArr) {
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
