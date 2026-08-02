package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbqm extends zzbto {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final SocketAddress zza;
    public final InetSocketAddress zzb;
    public final Map zzc;
    public final String zzd;
    public final String zze;

    public /* synthetic */ zzbqm(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, Map map, String str, String str2) {
        Trace.checkNotNull(inetSocketAddress, "proxyAddress");
        Trace.checkNotNull(inetSocketAddress2, "targetAddress");
        Trace.checkState("The proxy address %s is not resolved", inetSocketAddress, !inetSocketAddress.isUnresolved());
        this.zza = inetSocketAddress;
        this.zzb = inetSocketAddress2;
        this.zzc = map;
        this.zzd = str;
        this.zze = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbqm)) {
            return false;
        }
        zzbqm zzbqmVar = (zzbqm) obj;
        return Objects.equals(this.zza, zzbqmVar.zza) && Objects.equals(this.zzb, zzbqmVar.zzb) && Objects.equals(this.zzc, zzbqmVar.zzc) && Objects.equals(this.zzd, zzbqmVar.zzd) && Objects.equals(this.zze, zzbqmVar.zze);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzd, this.zze, this.zzc);
    }

    public final String toString() {
        Response stringHelper = Ascii.toStringHelper(this);
        stringHelper.add(this.zza, "proxyAddr");
        stringHelper.add(this.zzb, "targetAddr");
        stringHelper.add(this.zzc, "headers");
        stringHelper.add(this.zzd, "username");
        stringHelper.add("hasPassword", this.zze != null);
        return stringHelper.toString();
    }
}
