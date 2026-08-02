package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.common.internal.zzae;
import java.util.Iterator;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public final class zzki implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzlj zzb;

    public /* synthetic */ zzki(zzlj zzljVar, Bundle bundle, int i) {
        this.$r8$classId = i;
        this.zza = bundle;
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Bundle bundle = this.zza;
        zzlj zzljVar = this.zzb;
        switch (i) {
            case 0:
                zzljVar.zzg();
                zzljVar.zzb$1();
                String string2 = bundle.getString("name");
                String string3 = bundle.getString("origin");
                zzae.checkNotEmpty(string2);
                zzae.checkNotEmpty(string3);
                zzae.checkNotNull(bundle.get("value"));
                zzic zzicVar = (zzic) zzljVar.$$delegate_0;
                if (!zzicVar.zzB()) {
                    zzgu zzguVar = zzicVar.zzi;
                    zzic.zzP(zzguVar);
                    zzguVar.zzl.zza("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar = new zzpl(bundle.getLong("triggered_timestamp"), bundle.get("value"), string2, string3);
                    try {
                        zzpp zzppVar = zzicVar.zzl;
                        zzic.zzN(zzppVar);
                        bundle.getString("app_id");
                        zzbh zzaf = zzppVar.zzaf(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string3, 0L, 0L, true);
                        zzic.zzN(zzppVar);
                        bundle.getString("app_id");
                        zzbh zzaf2 = zzppVar.zzaf(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string3, 0L, 0L, true);
                        bundle.getString("app_id");
                        zzicVar.zzt().zzp(new zzah(bundle.getString("app_id"), string3, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), zzaf2, bundle.getLong("trigger_timeout"), zzaf, bundle.getLong("time_to_live"), zzppVar.zzaf(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string3, 0L, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                zzljVar.zzg();
                zzljVar.zzb$1();
                String string4 = bundle.getString("name");
                zzae.checkNotEmpty(string4);
                zzic zzicVar2 = (zzic) zzljVar.$$delegate_0;
                if (!zzicVar2.zzB()) {
                    zzgu zzguVar2 = zzicVar2.zzi;
                    zzic.zzP(zzguVar2);
                    zzguVar2.zzl.zza("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar2 = new zzpl(0L, null, string4, "");
                    try {
                        zzpp zzppVar2 = zzicVar2.zzl;
                        zzic.zzN(zzppVar2);
                        bundle.getString("app_id");
                        zzicVar2.zzt().zzp(new zzah(bundle.getString("app_id"), "", zzplVar2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), zzppVar2.zzaf(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                MemoryCacheService memoryCacheService = zzljVar.zzt;
                zzic zzicVar3 = (zzic) zzljVar.$$delegate_0;
                if (!bundle.isEmpty()) {
                    zzhh zzhhVar = zzicVar3.zzh;
                    zzpp zzppVar3 = zzicVar3.zzl;
                    zzal zzalVar = zzicVar3.zzg;
                    zzgu zzguVar3 = zzicVar3.zzi;
                    zzic.zzN(zzhhVar);
                    Bundle bundle2 = new Bundle(zzhhVar.zzt.zza());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            zzic.zzN(zzppVar3);
                            if (zzpp.zzz(obj)) {
                                zzpp.zzP(memoryCacheService, null, 27, null, null, 0);
                            }
                            zzic.zzP(zzguVar3);
                            zzguVar3.zzi.zzc("Invalid default event parameter type. Name, value", str, obj);
                        } else if (zzpp.zzac(str)) {
                            zzic.zzP(zzguVar3);
                            zzguVar3.zzi.zzb(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            zzic.zzN(zzppVar3);
                            zzalVar.getClass();
                            if (zzppVar3.zzA("param", 500, str, obj)) {
                                zzppVar3.zzO(bundle2, str, obj);
                            }
                        }
                    }
                    zzic.zzN(zzppVar3);
                    zzpp zzppVar4 = ((zzic) zzalVar.$$delegate_0).zzl;
                    zzic.zzN(zzppVar4);
                    int i2 = zzppVar4.zzaj(201500000) ? 100 : 25;
                    if (bundle2.size() > i2) {
                        Iterator it = new TreeSet(bundle2.keySet()).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i3++;
                            if (i3 > i2) {
                                bundle2.remove(str2);
                            }
                        }
                        zzic.zzN(zzppVar3);
                        zzpp.zzP(memoryCacheService, null, 26, null, null, 0);
                        zzic.zzP(zzguVar3);
                        zzguVar3.zzi.zza("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                zzhh zzhhVar2 = zzicVar3.zzh;
                zzic.zzN(zzhhVar2);
                zzhhVar2.zzt.zzb(bundle);
                zzicVar3.zzt().zzH(bundle);
                break;
        }
    }
}
