package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public final class zzciq {
    public static final zzciq zza;
    public final boolean zzc;
    public final String[] zze;
    public final String[] zzf;

    static {
        zzcio[] zzcioVarArr = {zzcio.TLS_AES_128_GCM_SHA256, zzcio.TLS_AES_256_GCM_SHA384, zzcio.TLS_CHACHA20_POLY1305_SHA256, zzcio.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, zzcio.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, zzcio.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, zzcio.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, zzcio.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, zzcio.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, zzcio.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, zzcio.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, zzcio.TLS_RSA_WITH_AES_128_GCM_SHA256, zzcio.TLS_RSA_WITH_AES_256_GCM_SHA384, zzcio.TLS_RSA_WITH_AES_128_CBC_SHA, zzcio.TLS_RSA_WITH_AES_256_CBC_SHA, zzcio.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        zzcaf zzcafVar = new zzcaf();
        String[] strArr = new String[16];
        for (int i = 0; i < 16; i++) {
            strArr[i] = zzcioVarArr[i].zzbb;
        }
        zzcafVar.zza = strArr;
        zzcjc zzcjcVar = zzcjc.TLS_1_3;
        zzcjc zzcjcVar2 = zzcjc.TLS_1_2;
        zzcjc[] zzcjcVarArr = {zzcjcVar, zzcjcVar2};
        String[] strArr2 = new String[2];
        for (int i2 = 0; i2 < 2; i2++) {
            strArr2[i2] = zzcjcVarArr[i2].zzf;
        }
        zzcafVar.zzc = strArr2;
        zzcafVar.zzb = true;
        zza = new zzciq(zzcafVar);
        zzcjc[] zzcjcVarArr2 = {zzcjcVar, zzcjcVar2, zzcjc.TLS_1_1, zzcjc.TLS_1_0};
        String[] strArr3 = new String[4];
        for (int i3 = 0; i3 < 4; i3++) {
            strArr3[i3] = zzcjcVarArr2[i3].zzf;
        }
    }

    public zzciq(zzcaf zzcafVar) {
        this.zze = (String[]) zzcafVar.zza;
        this.zzf = (String[]) zzcafVar.zzc;
        this.zzc = zzcafVar.zzb;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzciq)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzciq zzciqVar = (zzciq) obj;
        return Arrays.equals(this.zze, zzciqVar.zze) && Arrays.equals(this.zzf, zzciqVar.zzf) && this.zzc == zzciqVar.zzc;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.zze) + 527) * 31) + Arrays.hashCode(this.zzf)) * 31) + (!this.zzc ? 1 : 0);
    }

    public final String toString() {
        List unmodifiableList;
        zzcjc zzcjcVar;
        String[] strArr = this.zze;
        if (strArr == null) {
            unmodifiableList = null;
        } else {
            zzcio[] zzcioVarArr = new zzcio[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                zzcioVarArr[i] = (zzcio) (str.startsWith("SSL_") ? Enum.valueOf(zzcio.class, "TLS_".concat(str.substring(4))) : Enum.valueOf(zzcio.class, str));
            }
            String[] strArr2 = zzcjd.zza;
            unmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) zzcioVarArr.clone()));
        }
        String obj = unmodifiableList == null ? "[use default]" : unmodifiableList.toString();
        String[] strArr3 = this.zzf;
        zzcjc[] zzcjcVarArr = new zzcjc[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                zzcjcVar = zzcjc.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                zzcjcVar = zzcjc.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                zzcjcVar = zzcjc.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                zzcjcVar = zzcjc.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    a$$ExternalSyntheticBUOutline0.m$3("Unexpected TLS version: ".concat(String.valueOf(str2)));
                    return null;
                }
                zzcjcVar = zzcjc.SSL_3_0;
            }
            zzcjcVarArr[i2] = zzcjcVar;
        }
        String[] strArr4 = zzcjd.zza;
        String valueOf = String.valueOf(Collections.unmodifiableList(Arrays.asList((Object[]) zzcjcVarArr.clone())));
        int length = valueOf.length() + String.valueOf(obj).length() + 42;
        boolean z = this.zzc;
        StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(length + 24, 1, String.valueOf(z)));
        sb.append("ConnectionSpec(cipherSuites=");
        sb.append(obj);
        sb.append(", tlsVersions=");
        sb.append(valueOf);
        sb.append(", supportsTlsExtensions=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void zzb(SSLSocket sSLSocket) {
        String[] strArr = this.zze;
        String[] strArr2 = strArr != null ? (String[]) zzcjd.zzb(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) zzcjd.zzb(this.zzf, sSLSocket.getEnabledProtocols());
        zzcaf zzcafVar = new zzcaf(this);
        if (strArr2 == null) {
            zzcafVar.zza = null;
        } else {
            zzcafVar.zza = (String[]) strArr2.clone();
        }
        if (strArr3 == null) {
            zzcafVar.zzc = null;
        } else {
            zzcafVar.zzc = (String[]) strArr3.clone();
        }
        zzciq zzciqVar = new zzciq(zzcafVar);
        sSLSocket.setEnabledProtocols(zzciqVar.zzf);
        String[] strArr4 = zzciqVar.zze;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }
}
