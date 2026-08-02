package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzakg extends zzake {
    private zzakf zza;
    private int zzb;
    private boolean zzc;
    private zzaef zzd;
    private zzaed zze;

    zzakg() {
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final long zza(zzfp zzfpVar) {
        if ((zzfpVar.zzM()[0] & 1) == 1) {
            return -1L;
        }
        byte b = zzfpVar.zzM()[0];
        zzakf zzakfVar = this.zza;
        zzek.zzb(zzakfVar);
        int i = !zzakfVar.zzd[(b >> 1) & (255 >>> (8 - zzakfVar.zze))].zza ? zzakfVar.zza.zze : zzakfVar.zza.zzf;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzfpVar.zzc() < zzfpVar.zze() + 4) {
            byte[] copyOf = Arrays.copyOf(zzfpVar.zzM(), zzfpVar.zze() + 4);
            zzfpVar.zzI(copyOf, copyOf.length);
        } else {
            zzfpVar.zzJ(zzfpVar.zze() + 4);
        }
        long j = i2;
        byte[] zzM = zzfpVar.zzM();
        zzM[zzfpVar.zze() - 4] = (byte) (j & 255);
        zzM[zzfpVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        zzM[zzfpVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        zzM[zzfpVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    protected final void zzi(long j) {
        super.zzi(j);
        this.zzc = j != 0;
        zzaef zzaefVar = this.zzd;
        this.zzb = zzaefVar != null ? zzaefVar.zze : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzake
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzfp zzfpVar, long j, zzakb zzakbVar) throws IOException {
        zzakf zzakfVar;
        int i;
        int i2;
        int i3;
        int i4;
        zzaef zzaefVar;
        long j2;
        if (this.zza != null) {
            zzakbVar.zza.getClass();
            return false;
        }
        zzaef zzaefVar2 = this.zzd;
        int i5 = 4;
        if (zzaefVar2 == null) {
            zzaeg.zzd(1, zzfpVar, false);
            int zzj = zzfpVar.zzj();
            int zzm = zzfpVar.zzm();
            int zzj2 = zzfpVar.zzj();
            int zzi = zzfpVar.zzi();
            int i6 = zzi <= 0 ? -1 : zzi;
            int zzi2 = zzfpVar.zzi();
            int i7 = zzi2 <= 0 ? -1 : zzi2;
            int zzi3 = zzfpVar.zzi();
            int i8 = zzi3 <= 0 ? -1 : zzi3;
            int zzm2 = zzfpVar.zzm();
            this.zzd = new zzaef(zzj, zzm, zzj2, i6, i7, i8, (int) Math.pow(2.0d, zzm2 & 15), (int) Math.pow(2.0d, (zzm2 & 240) >> 4), 1 == (zzfpVar.zzm() & 1), Arrays.copyOf(zzfpVar.zzM(), zzfpVar.zze()));
        } else {
            zzaed zzaedVar = this.zze;
            if (zzaedVar == null) {
                this.zze = zzaeg.zzc(zzfpVar, true, true);
            } else {
                byte[] bArr = new byte[zzfpVar.zze()];
                System.arraycopy(zzfpVar.zzM(), 0, bArr, 0, zzfpVar.zze());
                int i9 = zzaefVar2.zza;
                int i10 = 5;
                zzaeg.zzd(5, zzfpVar, false);
                int zzm3 = zzfpVar.zzm() + 1;
                zzaec zzaecVar = new zzaec(zzfpVar.zzM());
                zzaecVar.zzc(zzfpVar.zzd() * 8);
                int i11 = 0;
                while (true) {
                    int i12 = 2;
                    int i13 = 16;
                    if (i11 >= zzm3) {
                        zzaef zzaefVar3 = zzaefVar2;
                        int i14 = 6;
                        int zzb = zzaecVar.zzb(6) + 1;
                        for (int i15 = 0; i15 < zzb; i15++) {
                            if (zzaecVar.zzb(16) != 0) {
                                throw zzcc.zza("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i16 = 1;
                        int zzb2 = zzaecVar.zzb(6) + 1;
                        int i17 = 0;
                        while (true) {
                            int i18 = 3;
                            if (i17 < zzb2) {
                                int zzb3 = zzaecVar.zzb(i13);
                                if (zzb3 == 0) {
                                    i3 = zzb2;
                                    int i19 = 8;
                                    zzaecVar.zzc(8);
                                    zzaecVar.zzc(16);
                                    zzaecVar.zzc(16);
                                    zzaecVar.zzc(6);
                                    zzaecVar.zzc(8);
                                    int zzb4 = zzaecVar.zzb(4) + 1;
                                    int i20 = 0;
                                    while (i20 < zzb4) {
                                        zzaecVar.zzc(i19);
                                        i20++;
                                        i19 = 8;
                                    }
                                } else {
                                    if (zzb3 != i16) {
                                        throw zzcc.zza("floor type greater than 1 not decodable: " + zzb3, null);
                                    }
                                    int zzb5 = zzaecVar.zzb(i10);
                                    int[] iArr = new int[zzb5];
                                    int i21 = -1;
                                    for (int i22 = 0; i22 < zzb5; i22++) {
                                        int zzb6 = zzaecVar.zzb(4);
                                        iArr[i22] = zzb6;
                                        if (zzb6 > i21) {
                                            i21 = zzb6;
                                        }
                                    }
                                    int i23 = i21 + 1;
                                    int[] iArr2 = new int[i23];
                                    int i24 = 0;
                                    while (i24 < i23) {
                                        iArr2[i24] = zzaecVar.zzb(i18) + 1;
                                        int zzb7 = zzaecVar.zzb(i12);
                                        if (zzb7 > 0) {
                                            i4 = 8;
                                            zzaecVar.zzc(8);
                                        } else {
                                            i4 = 8;
                                        }
                                        int i25 = zzb2;
                                        int i26 = 0;
                                        for (int i27 = 1; i26 < (i27 << zzb7); i27 = 1) {
                                            zzaecVar.zzc(i4);
                                            i26++;
                                            i4 = 8;
                                        }
                                        i24++;
                                        zzb2 = i25;
                                        i12 = 2;
                                        i18 = 3;
                                    }
                                    i3 = zzb2;
                                    zzaecVar.zzc(i12);
                                    int zzb8 = zzaecVar.zzb(4);
                                    int i28 = 0;
                                    int i29 = 0;
                                    for (int i30 = 0; i30 < zzb5; i30++) {
                                        i28 += iArr2[iArr[i30]];
                                        while (i29 < i28) {
                                            zzaecVar.zzc(zzb8);
                                            i29++;
                                        }
                                    }
                                }
                                i17++;
                                zzb2 = i3;
                                i14 = 6;
                                i12 = 2;
                                i13 = 16;
                                i16 = 1;
                                i10 = 5;
                            } else {
                                int i31 = 1;
                                int zzb9 = zzaecVar.zzb(i14) + 1;
                                int i32 = 0;
                                while (i32 < zzb9) {
                                    if (zzaecVar.zzb(16) > 2) {
                                        throw zzcc.zza("residueType greater than 2 is not decodable", null);
                                    }
                                    zzaecVar.zzc(24);
                                    zzaecVar.zzc(24);
                                    zzaecVar.zzc(24);
                                    int zzb10 = zzaecVar.zzb(i14) + i31;
                                    int i33 = 8;
                                    zzaecVar.zzc(8);
                                    int[] iArr3 = new int[zzb10];
                                    for (int i34 = 0; i34 < zzb10; i34++) {
                                        iArr3[i34] = ((zzaecVar.zzd() ? zzaecVar.zzb(5) : 0) * 8) + zzaecVar.zzb(3);
                                    }
                                    int i35 = 0;
                                    while (i35 < zzb10) {
                                        int i36 = 0;
                                        while (i36 < i33) {
                                            if ((iArr3[i35] & (1 << i36)) != 0) {
                                                zzaecVar.zzc(i33);
                                            }
                                            i36++;
                                            i33 = 8;
                                        }
                                        i35++;
                                        i33 = 8;
                                    }
                                    i32++;
                                    i14 = 6;
                                    i31 = 1;
                                }
                                int zzb11 = zzaecVar.zzb(i14) + 1;
                                for (int i37 = 0; i37 < zzb11; i37++) {
                                    int zzb12 = zzaecVar.zzb(16);
                                    if (zzb12 != 0) {
                                        zzff.zzc("VorbisUtil", "mapping type other than 0 not supported: " + zzb12);
                                    } else {
                                        if (zzaecVar.zzd()) {
                                            i = 1;
                                            i2 = zzaecVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            i2 = 1;
                                        }
                                        if (zzaecVar.zzd()) {
                                            int zzb13 = zzaecVar.zzb(8) + i;
                                            for (int i38 = 0; i38 < zzb13; i38++) {
                                                int i39 = i9 - 1;
                                                zzaecVar.zzc(zzaeg.zza(i39));
                                                zzaecVar.zzc(zzaeg.zza(i39));
                                            }
                                        }
                                        if (zzaecVar.zzb(2) != 0) {
                                            throw zzcc.zza("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (i2 > 1) {
                                            for (int i40 = 0; i40 < i9; i40++) {
                                                zzaecVar.zzc(4);
                                            }
                                        }
                                        for (int i41 = 0; i41 < i2; i41++) {
                                            zzaecVar.zzc(8);
                                            zzaecVar.zzc(8);
                                            zzaecVar.zzc(8);
                                        }
                                    }
                                }
                                int zzb14 = zzaecVar.zzb(6);
                                int i42 = zzb14 + 1;
                                zzaee[] zzaeeVarArr = new zzaee[i42];
                                for (int i43 = 0; i43 < i42; i43++) {
                                    zzaeeVarArr[i43] = new zzaee(zzaecVar.zzd(), zzaecVar.zzb(16), zzaecVar.zzb(16), zzaecVar.zzb(8));
                                }
                                if (!zzaecVar.zzd()) {
                                    throw zzcc.zza("framing bit after modes not set as expected", null);
                                }
                                zzakfVar = new zzakf(zzaefVar3, zzaedVar, bArr, zzaeeVarArr, zzaeg.zza(zzb14));
                            }
                        }
                    } else {
                        if (zzaecVar.zzb(24) != 5653314) {
                            throw zzcc.zza("expected code book to start with [0x56, 0x43, 0x42] at " + zzaecVar.zza(), null);
                        }
                        int zzb15 = zzaecVar.zzb(16);
                        int zzb16 = zzaecVar.zzb(24);
                        if (zzaecVar.zzd()) {
                            zzaecVar.zzc(5);
                            for (int i44 = 0; i44 < zzb16; i44 += zzaecVar.zzb(zzaeg.zza(zzb16 - i44))) {
                            }
                        } else {
                            boolean zzd = zzaecVar.zzd();
                            for (int i45 = 0; i45 < zzb16; i45++) {
                                if (!zzd) {
                                    zzaecVar.zzc(5);
                                } else if (zzaecVar.zzd()) {
                                    zzaecVar.zzc(5);
                                }
                            }
                        }
                        int zzb17 = zzaecVar.zzb(i5);
                        if (zzb17 > 2) {
                            throw zzcc.zza("lookup type greater than 2 not decodable: " + zzb17, null);
                        }
                        if (zzb17 == 1) {
                            i12 = zzb17;
                        } else if (zzb17 != 2) {
                            zzaefVar = zzaefVar2;
                            i11++;
                            zzaefVar2 = zzaefVar;
                            i5 = 4;
                        }
                        zzaecVar.zzc(32);
                        zzaecVar.zzc(32);
                        int zzb18 = zzaecVar.zzb(i5) + 1;
                        zzaecVar.zzc(1);
                        if (i12 != 1) {
                            zzaefVar = zzaefVar2;
                            j2 = zzb15 * zzb16;
                        } else if (zzb15 != 0) {
                            zzaefVar = zzaefVar2;
                            j2 = (long) Math.floor(Math.pow(zzb16, 1.0d / zzb15));
                        } else {
                            zzaefVar = zzaefVar2;
                            j2 = 0;
                        }
                        zzaecVar.zzc((int) (j2 * zzb18));
                        i11++;
                        zzaefVar2 = zzaefVar;
                        i5 = 4;
                    }
                }
            }
        }
        zzakfVar = null;
        this.zza = zzakfVar;
        if (zzakfVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        zzaef zzaefVar4 = zzakfVar.zza;
        arrayList.add(zzaefVar4.zzg);
        arrayList.add(zzakfVar.zzc);
        zzby zzb19 = zzaeg.zzb(zzgaa.zzk(zzakfVar.zzb.zzb));
        zzak zzakVar = new zzak();
        zzakVar.zzW("audio/vorbis");
        zzakVar.zzx(zzaefVar4.zzd);
        zzakVar.zzR(zzaefVar4.zzc);
        zzakVar.zzy(zzaefVar4.zza);
        zzakVar.zzX(zzaefVar4.zzb);
        zzakVar.zzL(arrayList);
        zzakVar.zzP(zzb19);
        zzakbVar.zza = zzakVar.zzac();
        return true;
    }
}
