package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.measurement.internal.zzjm;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableList;

/* loaded from: classes4.dex */
public abstract class zzc {
    public static final RegularImmutableList zzc;
    public static final RegularImmutableList zzd;
    public static final RegularImmutableList zze;

    static {
        ImmutableSet.of((Object) "_in", (Object) "_xa", (Object) "_xu", (Object) "_aq", (Object) "_aa", (Object) "_ai", (Object[]) new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"});
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        Object[] objArr = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        PlatformKt.checkElementsNotNull(7, objArr);
        zzc = ImmutableList.asImmutableList(7, objArr);
        zzd = ImmutableList.of((Object) "auto", (Object) "app", (Object) "am");
        zze = ImmutableList.of((Object) "_r", (Object) "_dbg");
        ImmutableList.Builder builder = new ImmutableList.Builder(4);
        builder.addAll(15, zzjm.zza$2);
        builder.addAll(15, zzjm.zzb$2);
        builder.build();
        ImmutableList.of((Object) "^_ltv_[A-Z]{3}$", (Object) "^_cc[1-5]{1}$");
    }

    public static boolean zza() {
        return !zzd.contains("fcm");
    }

    public static boolean zzb(Bundle bundle, String str) {
        if (!zzc.contains(str)) {
            RegularImmutableList regularImmutableList = zze;
            int i = regularImmutableList.size;
            int i2 = 0;
            while (i2 < i) {
                boolean containsKey = bundle.containsKey((String) regularImmutableList.get(i2));
                i2++;
                if (containsKey) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean zze(Bundle bundle, String str) {
        if (!"_cmp".equals(str)) {
            return true;
        }
        if (zza()) {
            RegularImmutableList regularImmutableList = zze;
            int i = regularImmutableList.size;
            int i2 = 0;
            while (i2 < i) {
                boolean containsKey = bundle.containsKey((String) regularImmutableList.get(i2));
                i2++;
                if (containsKey) {
                }
            }
            bundle.putString("_cis", "fcm_integration");
            return true;
        }
        return false;
    }
}
