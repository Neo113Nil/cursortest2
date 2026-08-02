package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzaof implements zzanx {
    final /* synthetic */ zzaog zza;
    private final zzfo zzb = new zzfo(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzaof(zzaog zzaogVar, int i) {
        this.zza = zzaogVar;
        this.zze = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        if (r28.zzm() == 21) goto L25;
     */
    @Override // com.google.android.gms.internal.ads.zzanx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzfp zzfpVar) {
        List list;
        SparseArray sparseArray;
        int i;
        zzacx zzacxVar;
        SparseBooleanArray sparseBooleanArray;
        SparseBooleanArray sparseBooleanArray2;
        zzfw zzfwVar;
        int i2;
        zzacx zzacxVar2;
        SparseArray sparseArray2;
        zzfw zzfwVar2;
        int i3;
        int i4;
        SparseBooleanArray sparseBooleanArray3;
        zzaoj zzaojVar;
        zzfw zzfwVar3;
        int i5;
        int i6;
        int i7;
        if (zzfpVar.zzm() != 2) {
            return;
        }
        list = this.zza.zzb;
        zzfw zzfwVar4 = (zzfw) list.get(0);
        if ((zzfpVar.zzm() & 128) != 0) {
            zzfpVar.zzL(1);
            int zzq = zzfpVar.zzq();
            int i8 = 3;
            zzfpVar.zzL(3);
            zzfpVar.zzF(this.zzb, 2);
            this.zzb.zzm(3);
            int i9 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzfpVar.zzF(this.zzb, 2);
            int i10 = 4;
            this.zzb.zzm(4);
            int i11 = 12;
            zzfpVar.zzL(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int zzb = zzfpVar.zzb();
            while (zzb > 0) {
                int i12 = 5;
                zzfpVar.zzF(this.zzb, 5);
                zzfo zzfoVar = this.zzb;
                int zzd = zzfoVar.zzd(8);
                zzfoVar.zzm(i8);
                int zzd2 = this.zzb.zzd(i9);
                this.zzb.zzm(i10);
                int zzd3 = this.zzb.zzd(i11);
                int zzd4 = zzfpVar.zzd();
                int i13 = zzd4 + zzd3;
                ArrayList arrayList = null;
                String str = null;
                int i14 = -1;
                while (true) {
                    if (zzfpVar.zzd() >= i13) {
                        zzfwVar2 = zzfwVar4;
                        i3 = zzq;
                        i4 = i10;
                        break;
                    }
                    int zzm = zzfpVar.zzm();
                    int zzd5 = zzfpVar.zzd() + zzfpVar.zzm();
                    if (zzd5 > i13) {
                        zzfwVar2 = zzfwVar4;
                        i3 = zzq;
                        i4 = 4;
                        break;
                    }
                    if (zzm == i12) {
                        long zzu = zzfpVar.zzu();
                        if (zzu != 1094921523) {
                            if (zzu != 1161904947) {
                                if (zzu != 1094921524) {
                                    if (zzu == 1212503619) {
                                        i7 = 36;
                                        zzfwVar3 = zzfwVar4;
                                        i14 = i7;
                                        i5 = zzq;
                                    }
                                    zzfwVar3 = zzfwVar4;
                                    i5 = zzq;
                                }
                                zzfwVar3 = zzfwVar4;
                                i5 = zzq;
                                i14 = 172;
                            }
                            zzfwVar3 = zzfwVar4;
                            i5 = zzq;
                            i14 = 135;
                        }
                        zzfwVar3 = zzfwVar4;
                        i14 = 129;
                        i6 = 4;
                        i5 = zzq;
                        zzfpVar.zzL(zzd5 - zzfpVar.zzd());
                        i10 = i6;
                        zzfwVar4 = zzfwVar3;
                        zzq = i5;
                        i8 = 3;
                        i12 = 5;
                    } else {
                        if (zzm != 106) {
                            if (zzm != 122) {
                                if (zzm != 127) {
                                    if (zzm == 123) {
                                        i7 = 138;
                                        zzfwVar3 = zzfwVar4;
                                        i14 = i7;
                                        i5 = zzq;
                                    } else if (zzm == 10) {
                                        zzfwVar3 = zzfwVar4;
                                        str = zzfpVar.zzA(i8, zzfwq.zzc).trim();
                                        i5 = zzq;
                                    } else {
                                        if (zzm == 89) {
                                            ArrayList arrayList2 = new ArrayList();
                                            while (zzfpVar.zzd() < zzd5) {
                                                String trim = zzfpVar.zzA(i8, zzfwq.zzc).trim();
                                                int zzm2 = zzfpVar.zzm();
                                                zzfw zzfwVar5 = zzfwVar4;
                                                byte[] bArr = new byte[4];
                                                zzfpVar.zzG(bArr, 0, 4);
                                                arrayList2.add(new zzaoh(trim, zzm2, bArr));
                                                zzfwVar4 = zzfwVar5;
                                                zzq = zzq;
                                                i8 = 3;
                                            }
                                            zzfwVar3 = zzfwVar4;
                                            i5 = zzq;
                                            i6 = 4;
                                            arrayList = arrayList2;
                                            i14 = 89;
                                        } else {
                                            zzfwVar3 = zzfwVar4;
                                            i5 = zzq;
                                            i6 = 4;
                                            if (zzm == 111) {
                                                i14 = 257;
                                            }
                                        }
                                        zzfpVar.zzL(zzd5 - zzfpVar.zzd());
                                        i10 = i6;
                                        zzfwVar4 = zzfwVar3;
                                        zzq = i5;
                                        i8 = 3;
                                        i12 = 5;
                                    }
                                }
                            }
                            zzfwVar3 = zzfwVar4;
                            i5 = zzq;
                            i14 = 135;
                        }
                        zzfwVar3 = zzfwVar4;
                        i14 = 129;
                        i6 = 4;
                        i5 = zzq;
                        zzfpVar.zzL(zzd5 - zzfpVar.zzd());
                        i10 = i6;
                        zzfwVar4 = zzfwVar3;
                        zzq = i5;
                        i8 = 3;
                        i12 = 5;
                    }
                    i6 = 4;
                    zzfpVar.zzL(zzd5 - zzfpVar.zzd());
                    i10 = i6;
                    zzfwVar4 = zzfwVar3;
                    zzq = i5;
                    i8 = 3;
                    i12 = 5;
                }
                zzfpVar.zzK(i13);
                zzaoi zzaoiVar = new zzaoi(i14, str, arrayList, Arrays.copyOfRange(zzfpVar.zzM(), zzd4, i13));
                if (zzd == 6 || zzd == 5) {
                    zzd = zzaoiVar.zza;
                }
                zzb -= zzd3 + 5;
                sparseBooleanArray3 = this.zza.zzh;
                if (!sparseBooleanArray3.get(zzd2)) {
                    zzaojVar = this.zza.zze;
                    zzaol zza = zzaojVar.zza(zzd, zzaoiVar);
                    this.zzd.put(zzd2, zzd2);
                    this.zzc.put(zzd2, zza);
                }
                i10 = i4;
                zzfwVar4 = zzfwVar2;
                zzq = i3;
                i8 = 3;
                i11 = 12;
                i9 = 13;
            }
            zzfw zzfwVar6 = zzfwVar4;
            int i15 = zzq;
            int size = this.zzd.size();
            int i16 = 0;
            while (i16 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzaog zzaogVar = this.zza;
                int keyAt = sparseIntArray.keyAt(i16);
                int valueAt = sparseIntArray.valueAt(i16);
                sparseBooleanArray = zzaogVar.zzh;
                sparseBooleanArray.put(keyAt, true);
                sparseBooleanArray2 = this.zza.zzi;
                sparseBooleanArray2.put(valueAt, true);
                zzaol zzaolVar = (zzaol) this.zzc.valueAt(i16);
                if (zzaolVar != null) {
                    zzacxVar2 = this.zza.zzl;
                    i2 = i15;
                    zzaok zzaokVar = new zzaok(i2, keyAt, 8192);
                    zzfwVar = zzfwVar6;
                    zzaolVar.zzb(zzfwVar, zzacxVar2, zzaokVar);
                    sparseArray2 = this.zza.zzg;
                    sparseArray2.put(valueAt, zzaolVar);
                } else {
                    zzfwVar = zzfwVar6;
                    i2 = i15;
                }
                i16++;
                zzfwVar6 = zzfwVar;
                i15 = i2;
            }
            zzaog zzaogVar2 = this.zza;
            int i17 = this.zze;
            sparseArray = zzaogVar2.zzg;
            sparseArray.remove(i17);
            this.zza.zzm = 0;
            zzaog zzaogVar3 = this.zza;
            i = zzaogVar3.zzm;
            if (i == 0) {
                zzacxVar = zzaogVar3.zzl;
                zzacxVar.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzanx
    public final void zzb(zzfw zzfwVar, zzacx zzacxVar, zzaok zzaokVar) {
    }
}
