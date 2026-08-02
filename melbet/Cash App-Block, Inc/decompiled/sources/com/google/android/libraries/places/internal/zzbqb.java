package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.base.Joiner;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzbqb {
    public static final Joiner zza = new Joiner(String.valueOf(','));
    public static final zzbqb zzb = new zzbqb(zzbpk.zza, false, new zzbqb(new zzbpj(), true, new zzbqb()));
    public final Map zzc;
    public final byte[] zzd;

    public zzbqb(zzbpl zzbplVar, boolean z, zzbqb zzbqbVar) {
        String zza2 = zzbplVar.zza();
        Trace.checkArgument("Comma is currently not allowed in message encoding", !zza2.contains(","));
        int size = zzbqbVar.zzc.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zzbqbVar.zzc.containsKey(zzbplVar.zza()) ? size : size + 1);
        for (zzbqa zzbqaVar : zzbqbVar.zzc.values()) {
            String zza3 = zzbqaVar.zza.zza();
            if (!zza3.equals(zza2)) {
                linkedHashMap.put(zza3, new zzbqa(zzbqaVar.zza, zzbqaVar.zzb));
            }
        }
        linkedHashMap.put(zza2, new zzbqa(zzbplVar, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.zzc = unmodifiableMap;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((zzbqa) entry.getValue()).zzb) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.zzd = zza.join(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    private zzbqb() {
        this.zzc = new LinkedHashMap(0);
        this.zzd = new byte[0];
    }
}
