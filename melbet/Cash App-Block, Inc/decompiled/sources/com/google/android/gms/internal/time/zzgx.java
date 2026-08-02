package com.google.android.gms.internal.time;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzgx extends zzgv {
    public static final Map zza;
    public final zzej zzb;

    static {
        EnumMap enumMap = new EnumMap(zzej.class);
        for (zzej zzejVar : zzej.values()) {
            zzgx[] zzgxVarArr = new zzgx[10];
            for (int i = 0; i < 10; i++) {
                zzgxVarArr[i] = new zzgx(i, zzejVar, zzek.zzb);
            }
            enumMap.put((EnumMap) zzejVar, (zzej) zzgxVarArr);
        }
        zza = Collections.unmodifiableMap(enumMap);
    }

    public zzgx(int i, zzej zzejVar, zzek zzekVar) {
        super(zzekVar, i);
        zzcw.zza(zzejVar, "format char");
        this.zzb = zzejVar;
        if (zzekVar.zzj()) {
            return;
        }
        int i2 = zzejVar.zzm;
        i2 = zzekVar.zzk() ? i2 & 65503 : i2;
        StringBuilder sb = new StringBuilder("%");
        zzekVar.zzh(sb);
        sb.append((char) i2);
    }

    @Override // com.google.android.gms.internal.time.zzgv
    public final void zzb(zzei zzeiVar, Object obj) {
        zzeiVar.zzd(obj, this.zzb, (zzek) super.zzb);
    }
}
