package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzxv extends zzyl {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzxv(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.$r8$classId = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public void zza(Iterator it, zzzc zzzcVar) {
        switch (this.$r8$classId) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean hasNext = it.hasNext();
                    String str = this.zza;
                    if (!hasNext) {
                        zzzcVar.zza(next, str);
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        zzzcVar.zza(sb.toString(), str);
                        break;
                    }
                }
                break;
            default:
                super.zza(it, zzzcVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public void zzb(Object obj, zzzc zzzcVar) {
        switch (this.$r8$classId) {
            case 1:
                zzabe zzabeVar = (zzabe) obj;
                if (zzabeVar != null) {
                    zzabb zzabbVar = zzabeVar.zzd.zzd;
                    zzabbVar.getClass();
                    com.google.android.gms.internal.time.zzfg zzfgVar = new com.google.android.gms.internal.time.zzfg(zzabbVar, 1);
                    while (zzfgVar.hasNext()) {
                        Map.Entry entry = (Map.Entry) zzfgVar.next();
                        if (((Set) entry.getValue()).isEmpty()) {
                            zzzcVar.zza(null, (String) entry.getKey());
                        } else {
                            Iterator it = ((Set) entry.getValue()).iterator();
                            while (it.hasNext()) {
                                zzzcVar.zza(it.next(), (String) entry.getKey());
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                super.zzb(obj, zzzcVar);
                break;
        }
    }
}
