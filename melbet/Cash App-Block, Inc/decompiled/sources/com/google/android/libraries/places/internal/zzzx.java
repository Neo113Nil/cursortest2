package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzzx extends zzzl {
    public static final zzzv zzd;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzxc.zza, zzyb.zza, zzyc.zza)));
        zzyr zza = zzkf.zza(unmodifiableSet);
        zzmg zzmgVar = new zzmg();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap.putAll((HashMap) zza.zzc);
        hashMap2.putAll((HashMap) zza.zzd);
        zzd = new zzzv(Level.ALL, unmodifiableSet, zzmgVar);
    }

    public zzzx(String str, Level level, Set set, zzmg zzmgVar) {
        super(str);
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String concat = "".concat(str);
        concat.substring(0, Math.min(concat.length(), 23));
    }
}
