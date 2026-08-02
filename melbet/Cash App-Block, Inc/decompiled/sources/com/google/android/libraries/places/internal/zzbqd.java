package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbqd {
    public static final zzboq zza = new zzboq("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE", 0);
    public static final zzboq zzb = new zzboq("io.grpc.EquivalentAddressGroup.LOCALITY", 0);
    public static final zzboq zzc = new zzboq("io.grpc.EquivalentAddressGroup.ATTR_WEIGHT", 0);
    public final List zzd;
    public final zzbor zze;
    public final int zzf;

    public zzbqd(List list, zzbor zzborVar) {
        Trace.checkArgument("addrs is empty", !list.isEmpty());
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.zzd = unmodifiableList;
        Trace.checkNotNull(zzborVar, "attrs");
        this.zze = zzborVar;
        this.zzf = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbqd)) {
            return false;
        }
        zzbqd zzbqdVar = (zzbqd) obj;
        List list = this.zzd;
        int size = list.size();
        List list2 = zzbqdVar.zzd;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.zze.equals(zzbqdVar.zze);
    }

    public final int hashCode() {
        return this.zzf;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        String valueOf2 = String.valueOf(this.zze);
        StringBuilder sb = new StringBuilder(valueOf.length() + 2 + valueOf2.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "[", valueOf, "/", valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
