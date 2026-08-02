package com.google.android.libraries.places.internal;

import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public final class zzciw extends zzcja {
    public final com.google.android.gms.maps.zzah zzb;
    public final com.google.android.gms.maps.zzah zzc;
    public final com.google.android.gms.maps.zzah zzd;
    public final com.google.android.gms.maps.zzah zze;
    public final int zzf;

    public zzciw(com.google.android.gms.maps.zzah zzahVar, com.google.android.gms.maps.zzah zzahVar2, com.google.android.gms.maps.zzah zzahVar3, com.google.android.gms.maps.zzah zzahVar4, Provider provider, int i) {
        super(provider);
        this.zzb = zzahVar;
        this.zzc = zzahVar2;
        this.zzd = zzahVar3;
        this.zze = zzahVar4;
        this.zzf = i;
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final void zza(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.zzb.zzb(sSLSocket, Boolean.TRUE);
            this.zzc.zzb(sSLSocket, str);
        }
        Class<?> cls = sSLSocket.getClass();
        com.google.android.gms.maps.zzah zzahVar = this.zze;
        if (zzahVar.zzd(cls) != null) {
            zzahVar.zzc(sSLSocket, zzcja.zzg(list));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final String zzb(SSLSocket sSLSocket) {
        byte[] bArr;
        Class<?> cls = sSLSocket.getClass();
        com.google.android.gms.maps.zzah zzahVar = this.zzd;
        if (zzahVar.zzd(cls) == null || (bArr = (byte[]) zzahVar.zzc(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, zzcjd.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzcja
    public final int zzc() {
        return this.zzf;
    }
}
