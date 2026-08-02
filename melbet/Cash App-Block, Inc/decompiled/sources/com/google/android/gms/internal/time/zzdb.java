package com.google.android.gms.internal.time;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class zzdb extends zzdq {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzdb(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.time.zzdq
    public void zza(Iterator it, zzem zzemVar) {
        switch (this.$r8$classId) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.zza;
                    if (!hasNext) {
                        zzemVar.zza(next, str);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        zzemVar.zza(sb.toString(), str);
                        break;
                    }
                }
                break;
            default:
                super.zza(it, zzemVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.time.zzdq
    public void zzb(Object obj, zzem zzemVar) {
        switch (this.$r8$classId) {
            case 1:
                zzgs zzgsVar = (zzgs) obj;
                if (zzgsVar != null) {
                    zzgp zzgpVar = zzgsVar.zzc.zzd;
                    zzgpVar.getClass();
                    int i = 0;
                    while (true) {
                        if (!(i < zzgpVar.zza() - zzgpVar.zzb())) {
                            break;
                        } else if (i >= zzgpVar.zza() - zzgpVar.zzb()) {
                            a$$ExternalSyntheticBUOutline0.m();
                            break;
                        } else {
                            Object obj2 = zzgpVar.zzb.zzb[zzgpVar.zzb() + i];
                            i++;
                            Map.Entry entry = (Map.Entry) obj2;
                            if (((Set) entry.getValue()).isEmpty()) {
                                zzemVar.zza(null, (String) entry.getKey());
                            } else {
                                Iterator it = ((Set) entry.getValue()).iterator();
                                while (it.hasNext()) {
                                    zzemVar.zza(it.next(), (String) entry.getKey());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.zzb(obj, zzemVar);
                break;
        }
    }
}
