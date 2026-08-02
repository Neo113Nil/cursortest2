package com.google.android.libraries.places.internal;

import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class zzbtk {
    public static final Logger zza = Logger.getLogger(zzbtk.class.getName());
    public static zzbtk zzb;
    public String zzc;
    public final LinkedHashSet zzd;
    public RegularImmutableMap zze;

    public zzbtk() {
        new zzbth();
        this.zzc = "unknown";
        this.zzd = new LinkedHashSet();
        this.zze = RegularImmutableMap.EMPTY;
    }

    public final zzbtg zzb(String str) {
        RegularImmutableMap regularImmutableMap;
        if (str == null) {
            return null;
        }
        synchronized (this) {
            regularImmutableMap = this.zze;
        }
        return (zzbtg) regularImmutableMap.get(str.toLowerCase(Locale.US));
    }

    public final synchronized void zzg() {
        try {
            HashMap hashMap = new HashMap();
            Iterator it = this.zzd.iterator();
            String str = "unknown";
            char c = 0;
            while (it.hasNext()) {
                zzbtg zzbtgVar = (zzbtg) it.next();
                zzbtgVar.getClass();
                if (((zzbtg) hashMap.get("dns")) == null) {
                    hashMap.put("dns", zzbtgVar);
                }
                if (c < 5) {
                    str = "dns";
                }
                c = 5;
            }
            this.zze = RegularImmutableMap.copyOf((Map) hashMap);
            this.zzc = str;
        } catch (Throwable th) {
            throw th;
        }
    }
}
