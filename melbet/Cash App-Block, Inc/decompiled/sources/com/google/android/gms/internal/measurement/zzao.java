package com.google.android.gms.internal.measurement;

import com.fillr.featuretoggle.UnleashContext;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public interface zzao {
    public static final zzat zzf = new zzat();
    public static final zzam zzg = new zzam();
    public static final zzag zzh = new zzag("continue");
    public static final zzag zzi = new zzag("break");
    public static final zzag zzj = new zzag("return");
    public static final zzaf zzk = new zzaf(Boolean.TRUE);
    public static final zzaf zzl = new zzaf(Boolean.FALSE);
    public static final zzas zzm = new zzas("");

    String zzc();

    zzao zzcG(String str, UnleashContext unleashContext, ArrayList arrayList);

    Double zzd();

    Boolean zze();

    Iterator zzf();

    zzao zzt();
}
