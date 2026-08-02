package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzabj extends zzabh {
    public static final Map zza;
    public final zzyz zzb;

    static {
        EnumMap enumMap = new EnumMap(zzyz.class);
        for (zzyz zzyzVar : zzyz.values()) {
            zzabj[] zzabjVarArr = new zzabj[10];
            for (int i = 0; i < 10; i++) {
                zzabjVarArr[i] = new zzabj(i, zzyzVar, zzza.zzb);
            }
            enumMap.put((EnumMap) zzyzVar, (zzyz) zzabjVarArr);
        }
        zza = Collections.unmodifiableMap(enumMap);
    }

    public zzabj(int i, zzyz zzyzVar, zzza zzzaVar) {
        super(zzzaVar, i);
        zzky.zza(zzyzVar, "format char");
        this.zzb = zzyzVar;
        if (zzzaVar.zze()) {
            return;
        }
        int i2 = zzyzVar.zzl;
        i2 = zzzaVar.zzk() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        zzzaVar.zzl(sb);
        sb.append((char) i2);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void zzb(zzyy zzyyVar, Object obj) {
        zzyyVar.zzc(obj, this.zzb, (zzza) super.zzb);
    }
}
