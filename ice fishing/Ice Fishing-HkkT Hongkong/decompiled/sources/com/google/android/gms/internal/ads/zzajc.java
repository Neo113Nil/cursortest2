package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzajc implements zzacu {

    @Deprecated
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaiy
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i = zzada.zza;
            zzadb zzadbVar = zzajc.zza;
            return new zzacu[]{new zzajc()};
        }
    };
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzam zzc;
    private int zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private zzacx zzE;
    private zzaea[] zzF;
    private zzaea[] zzG;
    private boolean zzH;
    private final zzakp zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzfp zzg;
    private final zzfp zzh;
    private final zzfp zzi;
    private final byte[] zzj;
    private final zzfp zzk;
    private final zzafu zzl;
    private final zzfp zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private int zzp;
    private int zzq;
    private long zzr;
    private int zzs;
    private zzfp zzt;
    private long zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private zzajb zzz;

    static {
        zzak zzakVar = new zzak();
        zzakVar.zzW("application/x-emsg");
        zzc = zzakVar.zzac();
    }

    @Deprecated
    public zzajc() {
        this(zzakp.zza, 32, null, null, zzgaa.zzl(), null);
    }

    private static int zza(int i) throws zzcc {
        if (i >= 0) {
            return i;
        }
        throw zzcc.zza("Unexpected negative value: " + i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzae zzf(List list) {
        zzaji zzajiVar;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzain zzainVar = (zzain) list.get(i);
            if (zzainVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzM = zzainVar.zza.zzM();
                zzfp zzfpVar = new zzfp(zzM);
                if (zzfpVar.zze() >= 32) {
                    zzfpVar.zzK(0);
                    if (zzfpVar.zzg() == zzfpVar.zzb() + 4 && zzfpVar.zzg() == 1886614376) {
                        int zze = zzaio.zze(zzfpVar.zzg());
                        if (zze > 1) {
                            zzff.zzf("PsshAtomUtil", "Unsupported pssh version: " + zze);
                        } else {
                            UUID uuid2 = new UUID(zzfpVar.zzt(), zzfpVar.zzt());
                            if (zze == 1) {
                                zzfpVar.zzL(zzfpVar.zzp() * 16);
                            }
                            int zzp = zzfpVar.zzp();
                            if (zzp == zzfpVar.zzb()) {
                                byte[] bArr = new byte[zzp];
                                zzfpVar.zzG(bArr, 0, zzp);
                                zzajiVar = new zzaji(uuid2, zze, bArr);
                                uuid = zzajiVar != null ? null : zzajiVar.zza;
                                if (uuid != null) {
                                    zzff.zzf("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                } else {
                                    arrayList.add(new zzad(uuid, null, "video/mp4", zzM));
                                }
                            }
                        }
                    }
                }
                zzajiVar = null;
                if (zzajiVar != null) {
                }
                if (uuid != null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzae(arrayList);
    }

    private final void zzg() {
        this.zzp = 0;
        this.zzs = 0;
    }

    private static void zzh(zzfp zzfpVar, int i, zzajo zzajoVar) throws zzcc {
        zzfpVar.zzK(i + 8);
        int zzg = zzfpVar.zzg();
        if ((zzg & 1) != 0) {
            throw zzcc.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzg & 2) != 0;
        int zzp = zzfpVar.zzp();
        if (zzp == 0) {
            Arrays.fill(zzajoVar.zzl, 0, zzajoVar.zze, false);
            return;
        }
        int i2 = zzajoVar.zze;
        if (zzp != i2) {
            throw zzcc.zza("Senc sample count " + zzp + " is different from fragment sample count" + i2, null);
        }
        Arrays.fill(zzajoVar.zzl, 0, zzp, z);
        zzajoVar.zza(zzfpVar.zzb());
        zzfp zzfpVar2 = zzajoVar.zzn;
        zzfpVar.zzG(zzfpVar2.zzM(), 0, zzfpVar2.zze());
        zzajoVar.zzn.zzK(0);
        zzajoVar.zzo = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x030a, code lost:
    
        if (r8 < r5.zze) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzi(long j) throws zzcc {
        zzajc zzajcVar;
        SparseArray sparseArray;
        zzaim zzaimVar;
        int i;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        boolean z;
        int i6;
        zzaim zzaimVar2;
        byte[] bArr4;
        zzajo zzajoVar;
        List list;
        int i7;
        int i8;
        zzaim zzaimVar3;
        int i9;
        int i10;
        boolean z2;
        long j2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        zzaix zzaixVar;
        int i18;
        long[] jArr;
        final zzajc zzajcVar2 = this;
        while (!zzajcVar2.zzn.isEmpty() && ((zzaim) zzajcVar2.zzn.peek()).zza == j) {
            zzaim zzaimVar4 = (zzaim) zzajcVar2.zzn.pop();
            int i19 = zzaimVar4.zzd;
            int i20 = 12;
            int i21 = 8;
            if (i19 == 1836019574) {
                zzae zzf = zzf(zzaimVar4.zzb);
                zzaim zza2 = zzaimVar4.zza(1836475768);
                zza2.getClass();
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = -9223372036854775807L;
                int i22 = 0;
                while (i22 < size) {
                    zzain zzainVar = (zzain) zza2.zzb.get(i22);
                    int i23 = zzainVar.zzd;
                    if (i23 == 1953654136) {
                        zzfp zzfpVar = zzainVar.zza;
                        zzfpVar.zzK(i20);
                        Pair create = Pair.create(Integer.valueOf(zzfpVar.zzg()), new zzaix(zzfpVar.zzg() - 1, zzfpVar.zzg(), zzfpVar.zzg(), zzfpVar.zzg()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaix) create.second);
                    } else if (i23 == 1835362404) {
                        zzfp zzfpVar2 = zzainVar.zza;
                        zzfpVar2.zzK(8);
                        j3 = zzaio.zze(zzfpVar2.zzg()) == 0 ? zzfpVar2.zzu() : zzfpVar2.zzv();
                    }
                    i22++;
                    i20 = 12;
                }
                List zzd = zzaiw.zzd(zzaimVar4, new zzadk(), j3, zzf, false, false, new zzfws() { // from class: com.google.android.gms.internal.ads.zzaiz
                    @Override // com.google.android.gms.internal.ads.zzfws
                    public final Object apply(Object obj) {
                        return (zzajm) obj;
                    }
                });
                int size2 = zzd.size();
                if (zzajcVar2.zzf.size() == 0) {
                    for (int i24 = 0; i24 < size2; i24++) {
                        zzajp zzajpVar = (zzajp) zzd.get(i24);
                        zzajm zzajmVar = zzajpVar.zza;
                        zzajcVar2.zzf.put(zzajmVar.zza, new zzajb(zzajcVar2.zzE.zzw(i24, zzajmVar.zzb), zzajpVar, zzj(sparseArray2, zzajmVar.zza)));
                        zzajcVar2.zzx = Math.max(zzajcVar2.zzx, zzajmVar.zze);
                    }
                    zzajcVar2.zzE.zzD();
                } else {
                    zzek.zzf(zzajcVar2.zzf.size() == size2);
                    for (int i25 = 0; i25 < size2; i25++) {
                        zzajp zzajpVar2 = (zzajp) zzd.get(i25);
                        zzajm zzajmVar2 = zzajpVar2.zza;
                        ((zzajb) zzajcVar2.zzf.get(zzajmVar2.zza)).zzh(zzajpVar2, zzj(sparseArray2, zzajmVar2.zza));
                    }
                }
            } else {
                if (i19 == 1836019558) {
                    SparseArray sparseArray3 = zzajcVar2.zzf;
                    byte[] bArr5 = zzajcVar2.zzj;
                    int size3 = zzaimVar4.zzc.size();
                    int i26 = 0;
                    while (i26 < size3) {
                        zzaim zzaimVar5 = (zzaim) zzaimVar4.zzc.get(i26);
                        if (zzaimVar5.zzd == 1953653094) {
                            zzain zzb2 = zzaimVar5.zzb(1952868452);
                            zzb2.getClass();
                            zzfp zzfpVar3 = zzb2.zza;
                            zzfpVar3.zzK(i21);
                            int zzg = zzfpVar3.zzg();
                            zzajb zzajbVar = (zzajb) sparseArray3.get(zzfpVar3.zzg());
                            if (zzajbVar == null) {
                                zzajbVar = null;
                            } else {
                                if ((zzg & 1) != 0) {
                                    long zzv = zzfpVar3.zzv();
                                    zzajo zzajoVar2 = zzajbVar.zzb;
                                    zzajoVar2.zzb = zzv;
                                    zzajoVar2.zzc = zzv;
                                }
                                zzaix zzaixVar2 = zzajbVar.zze;
                                zzajbVar.zzb.zza = new zzaix((zzg & 2) != 0 ? zzfpVar3.zzg() - 1 : zzaixVar2.zza, (zzg & 8) != 0 ? zzfpVar3.zzg() : zzaixVar2.zzb, (zzg & 16) != 0 ? zzfpVar3.zzg() : zzaixVar2.zzc, (zzg & 32) != 0 ? zzfpVar3.zzg() : zzaixVar2.zzd);
                            }
                            if (zzajbVar != null) {
                                zzajo zzajoVar3 = zzajbVar.zzb;
                                long j4 = zzajoVar3.zzp;
                                boolean z4 = zzajoVar3.zzq;
                                zzajbVar.zzi();
                                zzajbVar.zzl = true;
                                zzain zzb3 = zzaimVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzfp zzfpVar4 = zzb3.zza;
                                    zzfpVar4.zzK(i21);
                                    zzajoVar3.zzp = zzaio.zze(zzfpVar4.zzg()) == 1 ? zzfpVar4.zzv() : zzfpVar4.zzu();
                                    zzajoVar3.zzq = true;
                                } else {
                                    zzajoVar3.zzp = j4;
                                    zzajoVar3.zzq = z4;
                                }
                                List list2 = zzaimVar5.zzb;
                                int size4 = list2.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i27 >= size4) {
                                        break;
                                    }
                                    zzain zzainVar2 = (zzain) list2.get(i27);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzainVar2.zzd == 1953658222) {
                                        zzfp zzfpVar5 = zzainVar2.zza;
                                        zzfpVar5.zzK(12);
                                        int zzp = zzfpVar5.zzp();
                                        if (zzp > 0) {
                                            i29 += zzp;
                                            i28++;
                                        }
                                    }
                                    i27++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzajbVar.zzh = 0;
                                zzajbVar.zzg = 0;
                                zzajbVar.zzf = 0;
                                zzajo zzajoVar4 = zzajbVar.zzb;
                                zzajoVar4.zzd = i28;
                                zzajoVar4.zze = i29;
                                if (zzajoVar4.zzg.length < i28) {
                                    zzajoVar4.zzf = new long[i28];
                                    zzajoVar4.zzg = new int[i28];
                                }
                                if (zzajoVar4.zzh.length < i29) {
                                    int i30 = (i29 * 125) / 100;
                                    zzajoVar4.zzh = new int[i30];
                                    zzajoVar4.zzi = new long[i30];
                                    zzajoVar4.zzj = new boolean[i30];
                                    zzajoVar4.zzl = new boolean[i30];
                                }
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (i31 < size4) {
                                    zzain zzainVar3 = (zzain) list2.get(i31);
                                    if (zzainVar3.zzd == i4) {
                                        int i34 = i32 + 1;
                                        zzfp zzfpVar6 = zzainVar3.zza;
                                        zzfpVar6.zzK(8);
                                        int zzg2 = zzfpVar6.zzg();
                                        list = list2;
                                        zzajm zzajmVar3 = zzajbVar.zzd.zza;
                                        i7 = size3;
                                        zzajo zzajoVar5 = zzajbVar.zzb;
                                        i9 = size4;
                                        zzaix zzaixVar3 = zzajoVar5.zza;
                                        int i35 = zzfy.zza;
                                        zzajoVar5.zzg[i32] = zzfpVar6.zzp();
                                        long[] jArr2 = zzajoVar5.zzf;
                                        zzaimVar2 = zzaimVar4;
                                        bArr4 = bArr5;
                                        long j5 = zzajoVar5.zzb;
                                        jArr2[i32] = j5;
                                        if ((zzg2 & 1) != 0) {
                                            i6 = i31;
                                            jArr2[i32] = j5 + zzfpVar6.zzg();
                                        } else {
                                            i6 = i31;
                                        }
                                        boolean z5 = (zzg2 & 4) != 0;
                                        int i36 = zzaixVar3.zzd;
                                        if (z5) {
                                            i36 = zzfpVar6.zzg();
                                        }
                                        int i37 = zzg2 & 256;
                                        int i38 = zzg2 & 512;
                                        int i39 = zzg2 & 1024;
                                        int i40 = zzg2 & 2048;
                                        int i41 = i36;
                                        long[] jArr3 = zzajmVar3.zzh;
                                        if (jArr3 != null) {
                                            i8 = i26;
                                            zzaimVar3 = zzaimVar5;
                                            if (jArr3.length != 1 || (jArr = zzajmVar3.zzi) == null) {
                                                z2 = z5;
                                                i10 = i40;
                                            } else {
                                                long j6 = jArr3[0];
                                                if (j6 == 0) {
                                                    z2 = z5;
                                                    i10 = i40;
                                                } else {
                                                    long zzs = zzfy.zzs(j6 + jArr[0], 1000000L, zzajmVar3.zzd, RoundingMode.FLOOR);
                                                    z2 = z5;
                                                    i10 = i40;
                                                }
                                                j2 = zzajmVar3.zzi[0];
                                                int[] iArr = zzajoVar5.zzh;
                                                long[] jArr4 = zzajoVar5.zzi;
                                                boolean[] zArr = zzajoVar5.zzj;
                                                i11 = zzajoVar5.zzg[i32] + i33;
                                                zzajo zzajoVar6 = zzajoVar3;
                                                long j7 = zzajmVar3.zzc;
                                                zzajoVar = zzajoVar6;
                                                long j8 = zzajoVar5.zzp;
                                                while (i33 < i11) {
                                                    if (i37 != 0) {
                                                        i12 = i37;
                                                        i13 = zzfpVar6.zzg();
                                                    } else {
                                                        i12 = i37;
                                                        i13 = zzaixVar3.zzb;
                                                    }
                                                    zza(i13);
                                                    if (i38 != 0) {
                                                        i14 = i38;
                                                        i15 = zzfpVar6.zzg();
                                                    } else {
                                                        i14 = i38;
                                                        i15 = zzaixVar3.zzc;
                                                    }
                                                    zza(i15);
                                                    if (i39 != 0) {
                                                        i16 = i11;
                                                        i17 = zzfpVar6.zzg();
                                                    } else {
                                                        i16 = i11;
                                                        if (i33 == 0) {
                                                            if (z2) {
                                                                i17 = i41;
                                                                i33 = 0;
                                                            } else {
                                                                i33 = 0;
                                                            }
                                                        }
                                                        i17 = zzaixVar3.zzd;
                                                    }
                                                    if (i10 != 0) {
                                                        z3 = z2;
                                                        zzaixVar = zzaixVar3;
                                                        i18 = zzfpVar6.zzg();
                                                    } else {
                                                        z3 = z2;
                                                        zzaixVar = zzaixVar3;
                                                        i18 = 0;
                                                    }
                                                    long zzs2 = zzfy.zzs((i18 + j8) - j2, 1000000L, j7, RoundingMode.FLOOR);
                                                    jArr4[i33] = zzs2;
                                                    long j9 = j7;
                                                    if (!zzajoVar5.zzq) {
                                                        jArr4[i33] = zzs2 + zzajbVar.zzd.zzh;
                                                    }
                                                    iArr[i33] = i15;
                                                    zArr[i33] = 1 == (((i17 >> 16) & 1) ^ 1);
                                                    j8 += i13;
                                                    i33++;
                                                    j7 = j9;
                                                    i37 = i12;
                                                    i38 = i14;
                                                    i11 = i16;
                                                    z2 = z3;
                                                    zzaixVar3 = zzaixVar;
                                                }
                                                int i42 = i11;
                                                zzajoVar5.zzp = j8;
                                                i32 = i34;
                                                i33 = i42;
                                            }
                                        } else {
                                            i8 = i26;
                                            i10 = i40;
                                            zzaimVar3 = zzaimVar5;
                                            z2 = z5;
                                        }
                                        j2 = 0;
                                        int[] iArr2 = zzajoVar5.zzh;
                                        long[] jArr42 = zzajoVar5.zzi;
                                        boolean[] zArr2 = zzajoVar5.zzj;
                                        i11 = zzajoVar5.zzg[i32] + i33;
                                        zzajo zzajoVar62 = zzajoVar3;
                                        long j72 = zzajmVar3.zzc;
                                        zzajoVar = zzajoVar62;
                                        long j82 = zzajoVar5.zzp;
                                        while (i33 < i11) {
                                        }
                                        int i422 = i11;
                                        zzajoVar5.zzp = j82;
                                        i32 = i34;
                                        i33 = i422;
                                    } else {
                                        i6 = i31;
                                        zzaimVar2 = zzaimVar4;
                                        bArr4 = bArr5;
                                        zzajoVar = zzajoVar3;
                                        list = list2;
                                        i7 = size3;
                                        i8 = i26;
                                        zzaimVar3 = zzaimVar5;
                                        i9 = size4;
                                    }
                                    i31 = i6 + 1;
                                    list2 = list;
                                    size3 = i7;
                                    size4 = i9;
                                    zzaimVar4 = zzaimVar2;
                                    bArr5 = bArr4;
                                    i26 = i8;
                                    zzaimVar5 = zzaimVar3;
                                    zzajoVar3 = zzajoVar;
                                    i4 = 1953658222;
                                }
                                zzaimVar = zzaimVar4;
                                byte[] bArr6 = bArr5;
                                zzajo zzajoVar7 = zzajoVar3;
                                i = size3;
                                i3 = i26;
                                zzaim zzaimVar6 = zzaimVar5;
                                zzajm zzajmVar4 = zzajbVar.zzd.zza;
                                zzaix zzaixVar4 = zzajoVar7.zza;
                                zzaixVar4.getClass();
                                zzajn zza3 = zzajmVar4.zza(zzaixVar4.zza);
                                zzain zzb4 = zzaimVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    zza3.getClass();
                                    zzfp zzfpVar7 = zzb4.zza;
                                    zzfpVar7.zzK(8);
                                    if ((zzfpVar7.zzg() & 1) == 1) {
                                        zzfpVar7.zzL(8);
                                    }
                                    int zzm = zzfpVar7.zzm();
                                    int zzp2 = zzfpVar7.zzp();
                                    int i43 = zzajoVar7.zze;
                                    if (zzp2 > i43) {
                                        throw zzcc.zza("Saiz sample count " + zzp2 + " is greater than fragment sample count" + i43, null);
                                    }
                                    int i44 = zza3.zzd;
                                    if (zzm == 0) {
                                        boolean[] zArr3 = zzajoVar7.zzl;
                                        i5 = 0;
                                        for (int i45 = 0; i45 < zzp2; i45++) {
                                            int zzm2 = zzfpVar7.zzm();
                                            i5 += zzm2;
                                            zArr3[i45] = zzm2 > i44;
                                        }
                                        z = false;
                                    } else {
                                        boolean z6 = zzm > i44;
                                        i5 = zzm * zzp2;
                                        z = false;
                                        Arrays.fill(zzajoVar7.zzl, 0, zzp2, z6);
                                    }
                                    Arrays.fill(zzajoVar7.zzl, zzp2, zzajoVar7.zze, z);
                                    if (i5 > 0) {
                                        zzajoVar7.zza(i5);
                                    }
                                }
                                zzain zzb5 = zzaimVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzfp zzfpVar8 = zzb5.zza;
                                    zzfpVar8.zzK(8);
                                    int zzg3 = zzfpVar8.zzg();
                                    if ((zzg3 & 1) == 1) {
                                        zzfpVar8.zzL(8);
                                    }
                                    int zzp3 = zzfpVar8.zzp();
                                    if (zzp3 != 1) {
                                        throw zzcc.zza("Unexpected saio entry count: " + zzp3, null);
                                    }
                                    zzajoVar7.zzc += zzaio.zze(zzg3) == 0 ? zzfpVar8.zzu() : zzfpVar8.zzv();
                                }
                                zzain zzb6 = zzaimVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzajoVar7);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzfp zzfpVar9 = null;
                                zzfp zzfpVar10 = null;
                                for (int i46 = 0; i46 < zzaimVar6.zzb.size(); i46++) {
                                    zzain zzainVar4 = (zzain) zzaimVar6.zzb.get(i46);
                                    zzfp zzfpVar11 = zzainVar4.zza;
                                    int i47 = zzainVar4.zzd;
                                    if (i47 == 1935828848) {
                                        zzfpVar11.zzK(12);
                                        if (zzfpVar11.zzg() == 1936025959) {
                                            zzfpVar9 = zzfpVar11;
                                        }
                                    } else if (i47 == 1936158820) {
                                        zzfpVar11.zzK(12);
                                        if (zzfpVar11.zzg() == 1936025959) {
                                            zzfpVar10 = zzfpVar11;
                                        }
                                    }
                                }
                                if (zzfpVar9 != null && zzfpVar10 != null) {
                                    zzfpVar9.zzK(8);
                                    int zze = zzaio.zze(zzfpVar9.zzg());
                                    zzfpVar9.zzL(4);
                                    if (zze == 1) {
                                        zzfpVar9.zzL(4);
                                    }
                                    if (zzfpVar9.zzg() != 1) {
                                        throw zzcc.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzfpVar10.zzK(8);
                                    int zze2 = zzaio.zze(zzfpVar10.zzg());
                                    zzfpVar10.zzL(4);
                                    if (zze2 == 1) {
                                        if (zzfpVar10.zzu() == 0) {
                                            throw zzcc.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zze2 >= 2) {
                                        zzfpVar10.zzL(4);
                                    }
                                    if (zzfpVar10.zzu() != 1) {
                                        throw zzcc.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    zzfpVar10.zzL(1);
                                    int zzm3 = zzfpVar10.zzm();
                                    int i48 = (zzm3 & 240) >> 4;
                                    int i49 = zzm3 & 15;
                                    if (zzfpVar10.zzm() == 1) {
                                        int zzm4 = zzfpVar10.zzm();
                                        byte[] bArr7 = new byte[16];
                                        zzfpVar10.zzG(bArr7, 0, 16);
                                        if (zzm4 == 0) {
                                            int zzm5 = zzfpVar10.zzm();
                                            byte[] bArr8 = new byte[zzm5];
                                            zzfpVar10.zzG(bArr8, 0, zzm5);
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        zzajoVar7.zzk = true;
                                        zzajoVar7.zzm = new zzajn(true, str, zzm4, bArr7, i48, i49, bArr3);
                                    }
                                }
                                int size5 = zzaimVar6.zzb.size();
                                int i50 = 0;
                                while (i50 < size5) {
                                    zzain zzainVar5 = (zzain) zzaimVar6.zzb.get(i50);
                                    if (zzainVar5.zzd == 1970628964) {
                                        zzfp zzfpVar12 = zzainVar5.zza;
                                        zzfpVar12.zzK(8);
                                        bArr2 = bArr6;
                                        zzfpVar12.zzG(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzfpVar12, 16, zzajoVar7);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i50++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                i2 = 8;
                                i21 = i2;
                                bArr5 = bArr;
                                size3 = i;
                                zzaimVar4 = zzaimVar;
                                i26 = i3 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzaimVar = zzaimVar4;
                        i = size3;
                        i2 = i21;
                        i3 = i26;
                        bArr = bArr5;
                        i21 = i2;
                        bArr5 = bArr;
                        size3 = i;
                        zzaimVar4 = zzaimVar;
                        i26 = i3 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzae zzf2 = zzf(zzaimVar4.zzb);
                    zzajcVar = this;
                    if (zzf2 != null) {
                        int size6 = zzajcVar.zzf.size();
                        for (int i51 = 0; i51 < size6; i51++) {
                            zzajb zzajbVar2 = (zzajb) zzajcVar.zzf.valueAt(i51);
                            zzajm zzajmVar5 = zzajbVar2.zzd.zza;
                            zzaix zzaixVar5 = zzajbVar2.zzb.zza;
                            int i52 = zzfy.zza;
                            zzajn zza4 = zzajmVar5.zza(zzaixVar5.zza);
                            zzae zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzak zzb8 = zzajbVar2.zzd.zza.zzf.zzb();
                            zzb8.zzE(zzb7);
                            zzajbVar2.zza.zzl(zzb8.zzac());
                        }
                    }
                    if (zzajcVar.zzw != -9223372036854775807L) {
                        int size7 = zzajcVar.zzf.size();
                        for (int i53 = 0; i53 < size7; i53++) {
                            zzajb zzajbVar3 = (zzajb) zzajcVar.zzf.valueAt(i53);
                            long j10 = zzajcVar.zzw;
                            int i54 = zzajbVar3.zzf;
                            while (true) {
                                zzajo zzajoVar8 = zzajbVar3.zzb;
                                if (i54 < zzajoVar8.zze && zzajoVar8.zzi[i54] <= j10) {
                                    if (zzajoVar8.zzj[i54]) {
                                        zzajbVar3.zzi = i54;
                                    }
                                    i54++;
                                }
                            }
                        }
                        zzajcVar.zzw = -9223372036854775807L;
                    }
                } else {
                    zzajcVar = zzajcVar2;
                    if (!zzajcVar.zzn.isEmpty()) {
                        ((zzaim) zzajcVar.zzn.peek()).zzc(zzaimVar4);
                    }
                }
                zzajcVar2 = zzajcVar;
            }
        }
        zzg();
    }

    private static final zzaix zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaix) sparseArray.valueAt(0);
        }
        zzaix zzaixVar = (zzaix) sparseArray.get(i);
        zzaixVar.getClass();
        return zzaixVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:307:0x0099, code lost:
    
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x009c, code lost:
    
        if (r33.zzp != 3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009e, code lost:
    
        r3 = r2.zzb();
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x00a8, code lost:
    
        if (r2.zzf >= r2.zzi) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00aa, code lost:
    
        ((com.google.android.gms.internal.ads.zzack) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00b3, code lost:
    
        if (r1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00b6, code lost:
    
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00bc, code lost:
    
        if (r1 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00be, code lost:
    
        r3.zzL(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00c9, code lost:
    
        if (r2.zzb.zzb(r2.zzf) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00cb, code lost:
    
        r3.zzL(r3.zzq() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00d7, code lost:
    
        if (r2.zzk() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00d9, code lost:
    
        r33.zzz = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00db, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0296, code lost:
    
        r33.zzp = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0299, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00e4, code lost:
    
        if (r2.zzd.zza.zzg != 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00e6, code lost:
    
        r33.zzA = r3 - 8;
        ((com.google.android.gms.internal.ads.zzack) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0100, code lost:
    
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0102, code lost:
    
        r33.zzB = r2.zzc(r33.zzA, 7);
        com.google.android.gms.internal.ads.zzaby.zzb(r33.zzA, r33.zzk);
        r2.zza.zzr(r33.zzk, 7);
        r3 = r33.zzB + 7;
        r33.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0127, code lost:
    
        r33.zzA += r3;
        r33.zzp = 4;
        r33.zzC = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x011f, code lost:
    
        r3 = r2.zzc(r33.zzA, 0);
        r33.zzB = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0131, code lost:
    
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r10 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x013d, code lost:
    
        if (r6 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x013f, code lost:
    
        r3 = r33.zzB;
        r4 = r33.zzA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0143, code lost:
    
        if (r3 >= r4) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0145, code lost:
    
        r33.zzB += r5.zzf(r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0234, code lost:
    
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x023c, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x023e, code lost:
    
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0245, code lost:
    
        r5.zzt(r10, r20, r33.zzA, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0258, code lost:
    
        if (r33.zzo.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x025a, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaja) r33.zzo.removeFirst();
        r33.zzv -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x026d, code lost:
    
        if (r1.zzb == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x026f, code lost:
    
        r3 = r3 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0270, code lost:
    
        r5 = r33.zzF;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0274, code lost:
    
        if (r8 >= r6) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0276, code lost:
    
        r5[r8].zzt(r3, 1, r1.zzc, r33.zzv, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0291, code lost:
    
        if (r2.zzk() != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0293, code lost:
    
        r33.zzz = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0295, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0243, code lost:
    
        r23 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0150, code lost:
    
        r13 = r33.zzh.zzM();
        r13[0] = 0;
        r13[1] = 0;
        r13[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0166, code lost:
    
        if (r33.zzB >= r33.zzA) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0168, code lost:
    
        r12 = r33.zzC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x016c, code lost:
    
        if (r12 != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x016e, code lost:
    
        ((com.google.android.gms.internal.ads.zzack) r34).zzn(r13, r6, r14, r9);
        r33.zzh.zzK(r9);
        r12 = r33.zzh.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x017f, code lost:
    
        if (r12 <= 0) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0181, code lost:
    
        r33.zzC = r12 - 1;
        r33.zzg.zzK(r9);
        r5.zzr(r33.zzg, 4);
        r5.zzr(r33.zzh, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0198, code lost:
    
        if (r33.zzG.length <= 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x019a, code lost:
    
        r12 = r3.zzf.zzm;
        r17 = r13[4];
        r9 = com.google.android.gms.internal.ads.zzgm.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01a8, code lost:
    
        if ("video/avc".equals(r12) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01ac, code lost:
    
        if ((r17 & com.google.common.base.Ascii.US) == r4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x01af, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01c0, code lost:
    
        r33.zzD = r9;
        r33.zzB += 5;
        r33.zzA += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0230, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x01b5, code lost:
    
        if ("video/hevc".equals(r12) == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x01bc, code lost:
    
        if (((r17 & 126) >> r8) != 39) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x01bf, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x01d4, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x01d7, code lost:
    
        if (r33.zzD == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x01d9, code lost:
    
        r33.zzi.zzH(r12);
        ((com.google.android.gms.internal.ads.zzack) r34).zzn(r33.zzi.zzM(), 0, r33.zzC, false);
        r5.zzr(r33.zzi, r33.zzC);
        r4 = r33.zzC;
        r8 = r33.zzi;
        r8 = com.google.android.gms.internal.ads.zzgm.zzb(r8.zzM(), r8.zze());
        r33.zzi.zzK("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzi.zzJ(r8);
        com.google.android.gms.internal.ads.zzach.zza(r10, r33.zzi, r33.zzG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0224, code lost:
    
        r33.zzB += r4;
        r33.zzC -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x021e, code lost:
    
        r4 = r5.zzf(r34, r12, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        boolean z;
        boolean z2;
        long zzs;
        long zzs2;
        String str;
        String str2;
        long zzu;
        long j;
        long zzv;
        long zzv2;
        while (true) {
            int i = this.zzp;
            int i2 = 1;
            ?? r9 = 0;
            if (i == 0) {
                if (this.zzs == 0) {
                    if (!zzacvVar.zzn(this.zzm.zzM(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzs = 8;
                    this.zzm.zzK(0);
                    this.zzr = this.zzm.zzu();
                    this.zzq = this.zzm.zzg();
                }
                long j2 = this.zzr;
                if (j2 == 1) {
                    ((zzack) zzacvVar).zzn(this.zzm.zzM(), 8, 8, false);
                    this.zzs += 8;
                    this.zzr = this.zzm.zzv();
                } else if (j2 == 0) {
                    long zzd = zzacvVar.zzd();
                    if (zzd == -1) {
                        zzd = !this.zzn.isEmpty() ? ((zzaim) this.zzn.peek()).zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzr = (zzd - zzacvVar.zzf()) + this.zzs;
                    }
                }
                long j3 = this.zzr;
                long j4 = this.zzs;
                if (j3 < j4) {
                    throw zzcc.zzc("Atom size less than header length (unsupported).");
                }
                long zzf = zzacvVar.zzf() - j4;
                int i3 = this.zzq;
                if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzH) {
                    this.zzE.zzO(new zzadt(this.zzx, zzf));
                    this.zzH = true;
                }
                if (this.zzq == 1836019558) {
                    int size = this.zzf.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        zzajo zzajoVar = ((zzajb) this.zzf.valueAt(i4)).zzb;
                        zzajoVar.zzc = zzf;
                        zzajoVar.zzb = zzf;
                    }
                }
                int i5 = this.zzq;
                if (i5 == 1835295092) {
                    this.zzz = null;
                    this.zzu = zzf + this.zzr;
                    this.zzp = 2;
                } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                    long zzf2 = (zzacvVar.zzf() + this.zzr) - 8;
                    this.zzn.push(new zzaim(i5, zzf2));
                    if (this.zzr == this.zzs) {
                        zzi(zzf2);
                    } else {
                        zzg();
                    }
                } else if (i5 == 1751411826 || i5 == 1835296868 || i5 == 1836476516 || i5 == 1936286840 || i5 == 1937011556 || i5 == 1937011827 || i5 == 1668576371 || i5 == 1937011555 || i5 == 1937011578 || i5 == 1937013298 || i5 == 1937007471 || i5 == 1668232756 || i5 == 1937011571 || i5 == 1952867444 || i5 == 1952868452 || i5 == 1953196132 || i5 == 1953654136 || i5 == 1953658222 || i5 == 1886614376 || i5 == 1935763834 || i5 == 1935763823 || i5 == 1936027235 || i5 == 1970628964 || i5 == 1935828848 || i5 == 1936158820 || i5 == 1701606260 || i5 == 1835362404 || i5 == 1701671783) {
                    if (this.zzs != 8) {
                        throw zzcc.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.zzr > 2147483647L) {
                        throw zzcc.zzc("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    zzfp zzfpVar = new zzfp((int) this.zzr);
                    System.arraycopy(this.zzm.zzM(), 0, zzfpVar.zzM(), 0, 8);
                    this.zzt = zzfpVar;
                    this.zzp = 1;
                } else {
                    if (this.zzr > 2147483647L) {
                        throw zzcc.zzc("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.zzt = null;
                    this.zzp = 1;
                }
            } else if (i != 1) {
                long j5 = Long.MAX_VALUE;
                if (i != 2) {
                    zzajb zzajbVar = this.zzz;
                    if (zzajbVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zzf;
                    int size2 = sparseArray.size();
                    long j6 = Long.MAX_VALUE;
                    zzajb zzajbVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzajb zzajbVar3 = (zzajb) sparseArray.valueAt(i6);
                        z = zzajbVar3.zzl;
                        if (z || zzajbVar3.zzf != zzajbVar3.zzd.zzb) {
                            z2 = zzajbVar3.zzl;
                            if (!z2 || zzajbVar3.zzh != zzajbVar3.zzb.zzd) {
                                long zzd2 = zzajbVar3.zzd();
                                if (zzd2 < j6) {
                                    zzajbVar2 = zzajbVar3;
                                    j6 = zzd2;
                                }
                            }
                        }
                    }
                    if (zzajbVar2 == null) {
                        int zzf3 = (int) (this.zzu - zzacvVar.zzf());
                        if (zzf3 < 0) {
                            throw zzcc.zza("Offset to end of mdat was negative.", null);
                        }
                        ((zzack) zzacvVar).zzo(zzf3, false);
                        zzg();
                    } else {
                        int zzd3 = (int) (zzajbVar2.zzd() - zzacvVar.zzf());
                        if (zzd3 < 0) {
                            zzff.zzf("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zzd3 = 0;
                        }
                        ((zzack) zzacvVar).zzo(zzd3, false);
                        this.zzz = zzajbVar2;
                        zzajbVar = zzajbVar2;
                    }
                } else {
                    int size3 = this.zzf.size();
                    zzajb zzajbVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzajo zzajoVar2 = ((zzajb) this.zzf.valueAt(i7)).zzb;
                        if (zzajoVar2.zzo) {
                            long j7 = zzajoVar2.zzc;
                            if (j7 < j5) {
                                zzajbVar4 = (zzajb) this.zzf.valueAt(i7);
                                j5 = j7;
                            }
                        }
                    }
                    if (zzajbVar4 == null) {
                        this.zzp = 3;
                    } else {
                        int zzf4 = (int) (j5 - zzacvVar.zzf());
                        if (zzf4 < 0) {
                            throw zzcc.zza("Offset to encryption data was negative.", null);
                        }
                        zzack zzackVar = (zzack) zzacvVar;
                        zzackVar.zzo(zzf4, false);
                        zzajo zzajoVar3 = zzajbVar4.zzb;
                        zzfp zzfpVar2 = zzajoVar3.zzn;
                        zzackVar.zzn(zzfpVar2.zzM(), 0, zzfpVar2.zze(), false);
                        zzajoVar3.zzn.zzK(0);
                        zzajoVar3.zzo = false;
                    }
                }
            } else {
                int i8 = ((int) this.zzr) - this.zzs;
                zzfp zzfpVar3 = this.zzt;
                if (zzfpVar3 != null) {
                    ((zzack) zzacvVar).zzn(zzfpVar3.zzM(), 8, i8, false);
                    zzain zzainVar = new zzain(this.zzq, zzfpVar3);
                    long zzf5 = zzacvVar.zzf();
                    if (this.zzn.isEmpty()) {
                        int i9 = zzainVar.zzd;
                        if (i9 == 1936286840) {
                            zzfp zzfpVar4 = zzainVar.zza;
                            zzfpVar4.zzK(8);
                            int zze = zzaio.zze(zzfpVar4.zzg());
                            zzfpVar4.zzL(4);
                            long zzu2 = zzfpVar4.zzu();
                            if (zze == 0) {
                                zzv = zzfpVar4.zzu();
                                zzv2 = zzfpVar4.zzu();
                            } else {
                                zzv = zzfpVar4.zzv();
                                zzv2 = zzfpVar4.zzv();
                            }
                            long j8 = zzf5 + zzv2;
                            long zzs3 = zzfy.zzs(zzv, 1000000L, zzu2, RoundingMode.FLOOR);
                            zzfpVar4.zzL(2);
                            int zzq = zzfpVar4.zzq();
                            int[] iArr = new int[zzq];
                            long[] jArr = new long[zzq];
                            long[] jArr2 = new long[zzq];
                            long[] jArr3 = new long[zzq];
                            long j9 = zzs3;
                            int i10 = 0;
                            while (i10 < zzq) {
                                int zzg = zzfpVar4.zzg();
                                if ((zzg & Integer.MIN_VALUE) != 0) {
                                    throw zzcc.zza("Unhandled indirect reference", null);
                                }
                                long zzu3 = zzfpVar4.zzu();
                                iArr[i10] = zzg & Integer.MAX_VALUE;
                                jArr[i10] = j8;
                                jArr3[i10] = j9;
                                long j10 = zzv + zzu3;
                                long[] jArr4 = jArr3;
                                int i11 = i10;
                                long[] jArr5 = jArr2;
                                j9 = zzfy.zzs(j10, 1000000L, zzu2, RoundingMode.FLOOR);
                                jArr5[i11] = j9 - jArr4[i11];
                                zzfpVar4.zzL(4);
                                j8 += r3[i11];
                                i10 = i11 + 1;
                                iArr = iArr;
                                jArr2 = jArr5;
                                jArr3 = jArr4;
                                zzv = j10;
                                jArr = jArr;
                            }
                            Pair create = Pair.create(Long.valueOf(zzs3), new zzaci(iArr, jArr, jArr2, jArr3));
                            this.zzy = ((Long) create.first).longValue();
                            this.zzE.zzO((zzadu) create.second);
                            this.zzH = true;
                        } else if (i9 == 1701671783) {
                            zzfp zzfpVar5 = zzainVar.zza;
                            if (this.zzF.length != 0) {
                                zzfpVar5.zzK(8);
                                int zze2 = zzaio.zze(zzfpVar5.zzg());
                                if (zze2 == 0) {
                                    String zzx = zzfpVar5.zzx((char) 0);
                                    zzx.getClass();
                                    String zzx2 = zzfpVar5.zzx((char) 0);
                                    zzx2.getClass();
                                    long zzu4 = zzfpVar5.zzu();
                                    zzs = zzfy.zzs(zzfpVar5.zzu(), 1000000L, zzu4, RoundingMode.FLOOR);
                                    long j11 = this.zzy;
                                    long j12 = j11 != -9223372036854775807L ? j11 + zzs : -9223372036854775807L;
                                    zzs2 = zzfy.zzs(zzfpVar5.zzu(), 1000L, zzu4, RoundingMode.FLOOR);
                                    str = zzx;
                                    str2 = zzx2;
                                    zzu = zzfpVar5.zzu();
                                    j = j12;
                                } else if (zze2 != 1) {
                                    zzff.zzf("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + zze2);
                                } else {
                                    long zzu5 = zzfpVar5.zzu();
                                    long zzs4 = zzfy.zzs(zzfpVar5.zzv(), 1000000L, zzu5, RoundingMode.FLOOR);
                                    long zzs5 = zzfy.zzs(zzfpVar5.zzu(), 1000L, zzu5, RoundingMode.FLOOR);
                                    long zzu6 = zzfpVar5.zzu();
                                    String zzx3 = zzfpVar5.zzx((char) 0);
                                    zzx3.getClass();
                                    String zzx4 = zzfpVar5.zzx((char) 0);
                                    zzx4.getClass();
                                    zzs2 = zzs5;
                                    zzu = zzu6;
                                    str = zzx3;
                                    str2 = zzx4;
                                    j = zzs4;
                                    zzs = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzfpVar5.zzb()];
                                zzfpVar5.zzG(bArr, 0, zzfpVar5.zzb());
                                zzfp zzfpVar6 = new zzfp(this.zzl.zza(new zzaft(str, str2, zzs2, zzu, bArr)));
                                int zzb2 = zzfpVar6.zzb();
                                for (zzaea zzaeaVar : this.zzF) {
                                    zzfpVar6.zzK(0);
                                    zzaeaVar.zzr(zzfpVar6, zzb2);
                                }
                                if (j == -9223372036854775807L) {
                                    this.zzo.addLast(new zzaja(zzs, true, zzb2));
                                    this.zzv += zzb2;
                                } else if (this.zzo.isEmpty()) {
                                    for (zzaea zzaeaVar2 : this.zzF) {
                                        zzaeaVar2.zzt(j, 1, zzb2, 0, null);
                                    }
                                } else {
                                    this.zzo.addLast(new zzaja(j, false, zzb2));
                                    this.zzv += zzb2;
                                }
                            }
                        }
                    } else {
                        ((zzaim) this.zzn.peek()).zzd(zzainVar);
                    }
                } else {
                    ((zzack) zzacvVar).zzo(i8, false);
                }
                zzi(zzacvVar.zzf());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzE = zzacxVar;
        zzg();
        zzaea[] zzaeaVarArr = new zzaea[2];
        this.zzF = zzaeaVarArr;
        int i = 0;
        zzaea[] zzaeaVarArr2 = (zzaea[]) zzfy.zzL(zzaeaVarArr, 0);
        this.zzF = zzaeaVarArr2;
        for (zzaea zzaeaVar : zzaeaVarArr2) {
            zzaeaVar.zzl(zzc);
        }
        this.zzG = new zzaea[this.zze.size()];
        int i2 = 100;
        while (i < this.zzG.length) {
            int i3 = i2 + 1;
            zzaea zzw = this.zzE.zzw(i2, 3);
            zzw.zzl((zzam) this.zze.get(i));
            this.zzG[i] = zzw;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j, long j2) {
        int size = this.zzf.size();
        for (int i = 0; i < size; i++) {
            ((zzajb) this.zzf.valueAt(i)).zzi();
        }
        this.zzo.clear();
        this.zzv = 0;
        this.zzw = j2;
        this.zzn.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) throws IOException {
        return zzajl.zza(zzacvVar);
    }

    public zzajc(zzakp zzakpVar, int i, zzfw zzfwVar, zzajm zzajmVar, List list, zzaea zzaeaVar) {
        this.zzd = zzakpVar;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzafu();
        this.zzm = new zzfp(16);
        this.zzg = new zzfp(zzgm.zza);
        this.zzh = new zzfp(5);
        this.zzi = new zzfp();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzfp(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzx = -9223372036854775807L;
        this.zzw = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzE = zzacx.zza;
        this.zzF = new zzaea[0];
        this.zzG = new zzaea[0];
    }
}
