package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.datadog.trace.core.LongRunningTracesTracker;
import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.elements.DropdownFieldUIKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzfq implements zzge {
    public final zzcq zza;
    public final zzea zzb;
    public final boolean zzc;

    public zzfq(zzea zzeaVar, zzcq zzcqVar) {
        zzea zzeaVar2 = zzdv.zza;
        this.zzb = zzeaVar;
        this.zzc = zzcqVar instanceof zzed;
        this.zza = zzcqVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(zzcq zzcqVar) {
        zzgt zzgtVar = ((zzeh) zzcqVar).zzc;
        int i = zzgtVar.zze;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < zzgtVar.zzb; i2++) {
                int i3 = zzgtVar.zzc[i2] >>> 3;
                zzdf zzdfVar = (zzdf) zzgtVar.zzd[i2];
                int zzA = zzdk.zzA(8);
                int zzA2 = zzdk.zzA(i3) + zzdk.zzA(16);
                int zzA3 = zzdk.zzA(24);
                int zzd = zzdfVar.zzd();
                i = JsonLogicResult$Success$$ExternalSyntheticOutline0.m$1(zzA + zzA, zzA2, FillrEnv$EnumUnboxingLocalUtility.m$2(zzd, zzd, zzA3), i);
            }
            zzgtVar.zze = i;
        }
        if (!this.zzc) {
            return i;
        }
        zzgh zzghVar = ((zzed) zzcqVar).zzb.zza;
        int i4 = zzghVar.zzb;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += zzdx.zzo(zzghVar.zzg(i6));
        }
        Iterator it = zzghVar.zzd().iterator();
        while (it.hasNext()) {
            i5 += zzdx.zzo((Map.Entry) it.next());
        }
        return i + i5;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(zzeh zzehVar) {
        int hashCode = zzehVar.zzc.hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        return ((zzed) zzehVar).zzb.zza.hashCode() + (hashCode * 53);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        zzcq zzcqVar = this.zza;
        return zzcqVar instanceof zzeh ? (zzeh) ((zzeh) zzcqVar).zzg(4, null) : ((zzeb) ((zzeh) zzcqVar).zzg(5, null)).zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        this.zzb.getClass();
        zzgt zzgtVar = ((zzeh) obj).zzc;
        if (zzgtVar.zzf) {
            zzgtVar.zzf = false;
        }
        zzea zzeaVar = zzdv.zza;
        ((zzed) obj).zzb.zzg();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzgg.zzp(obj, obj2);
        if (this.zzc) {
            zzea zzeaVar = zzdv.zza;
            zzgg.zzo(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[EDGE_INSN: B:27:0x009c->B:28:0x009c BREAK  A[LOOP:1: B:13:0x005c->B:21:0x005c], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, byte[] bArr, int i, int i2, LongRunningTracesTracker longRunningTracesTracker) {
        int i3;
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar == zzgt.zza) {
            zzgtVar = zzgt.zzf();
            zzehVar.zzc = zzgtVar;
        }
        zzgt zzgtVar2 = zzgtVar;
        zzed zzedVar = (zzed) obj;
        zzdx zzdxVar = zzedVar.zzb;
        if (zzdxVar.zzc) {
            zzedVar.zzb = zzdxVar.clone();
        }
        while (i < i2) {
            int zzj = DropdownFieldUIKt.zzj(bArr, i, longRunningTracesTracker);
            int i4 = longRunningTracesTracker.maxTrackedTraces;
            zzds zzdsVar = (zzds) longRunningTracesTracker.traceArray;
            zzcq zzcqVar = this.zza;
            if (i4 == 11) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                LongRunningTracesTracker longRunningTracesTracker2 = longRunningTracesTracker;
                zzdf zzdfVar = null;
                int i6 = 0;
                while (true) {
                    if (zzj >= i5) {
                        i3 = zzj;
                        break;
                    }
                    i3 = DropdownFieldUIKt.zzj(bArr2, zzj, longRunningTracesTracker2);
                    int i7 = longRunningTracesTracker2.maxTrackedTraces;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3 && i9 == 2) {
                            zzj = DropdownFieldUIKt.zza(bArr2, i3, longRunningTracesTracker2);
                            zzdfVar = (zzdf) longRunningTracesTracker2.healthMetrics;
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            zzj = DropdownFieldUIKt.zzp(i7, bArr2, i3, i5, longRunningTracesTracker2);
                        }
                    } else if (i9 == 0) {
                        zzj = DropdownFieldUIKt.zzj(bArr2, i3, longRunningTracesTracker2);
                        i6 = longRunningTracesTracker2.maxTrackedTraces;
                        zzdsVar.getClass();
                    } else if (i7 != 12) {
                    }
                }
                if (zzdfVar != null) {
                    zzgtVar2.zzj((i6 << 3) | 2, zzdfVar);
                }
                i = i3;
                bArr = bArr2;
                i2 = i5;
                longRunningTracesTracker = longRunningTracesTracker2;
            } else if ((i4 & 7) == 2) {
                zzdsVar.getClass();
                i = DropdownFieldUIKt.zzi(i4, bArr, zzj, i2, zzgtVar2, longRunningTracesTracker);
            } else {
                i = DropdownFieldUIKt.zzp(i4, bArr, zzj, i2, longRunningTracesTracker);
            }
        }
        if (i == i2) {
            return;
        }
        TransportImpl$$ExternalSyntheticLambda0.m("Failed to parse the message.");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzi(Object obj, zzfe zzfeVar) {
        Iterator zzf = ((zzed) obj).zzb.zzf();
        if (zzf.hasNext()) {
            ((zzee) ((Map.Entry) zzf.next()).getKey()).getClass();
            throw null;
        }
        zzgt zzgtVar = ((zzeh) obj).zzc;
        for (int i = 0; i < zzgtVar.zzb; i++) {
            int i2 = zzgtVar.zzc[i] >>> 3;
            Object obj2 = zzgtVar.zzd[i];
            boolean z = obj2 instanceof zzdf;
            zzdk zzdkVar = (zzdk) zzfeVar.zzb;
            if (z) {
                zzdkVar.zzt(11);
                zzdkVar.zzs(2, i2);
                zzdkVar.zze(3, (zzdf) obj2);
                zzdkVar.zzt(12);
            } else {
                zzdkVar.zzt(11);
                zzdkVar.zzs(2, i2);
                zzdkVar.zzt(26);
                zzeh zzehVar = (zzeh) ((zzcq) obj2);
                zzdkVar.zzt(zzehVar.zzF());
                zzehVar.zzab(zzdkVar);
                zzdkVar.zzt(12);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(zzeh zzehVar, zzeh zzehVar2) {
        if (!zzehVar.zzc.equals(zzehVar2.zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzed) zzehVar).zzb.equals(((zzed) zzehVar2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        return ((zzed) obj).zzb.zzk();
    }
}
