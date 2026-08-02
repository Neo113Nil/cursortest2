package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzajk {
    private static final zzfxr zza = zzfxr.zzc(zzfwp.zzc(':'));
    private static final zzfxr zzb = zzfxr.zzc(zzfwp.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zza(zzacv zzacvVar, zzadr zzadrVar, List list) throws IOException {
        int i;
        char c;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzd = zzacvVar.zzd();
            zzadrVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            char c3 = 2819;
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long zzf = zzacvVar.zzf();
                int zzd2 = (int) ((zzacvVar.zzd() - zzacvVar.zzf()) - this.zze);
                zzfp zzfpVar = new zzfp(zzd2);
                zzacvVar.zzi(zzfpVar.zzM(), 0, zzd2);
                int i4 = 0;
                while (i4 < this.zzc.size()) {
                    zzajj zzajjVar = (zzajj) this.zzc.get(i4);
                    zzfpVar.zzK((int) (zzajjVar.zza - zzf));
                    zzfpVar.zzL(4);
                    int zzi = zzfpVar.zzi();
                    String zzA = zzfpVar.zzA(zzi, zzfwq.zzc);
                    switch (zzA.hashCode()) {
                        case -1711564334:
                            if (zzA.equals("SlowMotion_Data")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1332107749:
                            if (zzA.equals("Super_SlowMotion_Edit_Data")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1251387154:
                            if (zzA.equals("Super_SlowMotion_Data")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -830665521:
                            if (zzA.equals("Super_SlowMotion_Deflickering_On")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1760745220:
                            if (zzA.equals("Super_SlowMotion_BGM")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        c2 = 2192;
                    } else if (c == 1) {
                        c2 = 2816;
                    } else if (c == 2) {
                        c2 = 2817;
                    } else if (c == 3) {
                        c2 = c3;
                    } else {
                        if (c != 4) {
                            throw zzcc.zza("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i5 = zzajjVar.zzb - (zzi + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zzf2 = zzb.zzf(zzfpVar.zzA(i5, zzfwq.zzc));
                        for (int i6 = 0; i6 < zzf2.size(); i6++) {
                            List zzf3 = zza.zzf((CharSequence) zzf2.get(i6));
                            if (zzf3.size() != 3) {
                                throw zzcc.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzahi(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzcc.zza(null, e);
                            }
                        }
                        list.add(new zzahj(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != c3 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i4++;
                    c3 = 2819;
                }
                zzadrVar.zza = 0L;
                return 1;
            }
            long zzd3 = zzacvVar.zzd();
            int i7 = this.zze - 20;
            zzfp zzfpVar2 = new zzfp(i7);
            zzacvVar.zzi(zzfpVar2.zzM(), 0, i7);
            int i8 = 0;
            while (i8 < i7 / 12) {
                zzfpVar2.zzL(i3);
                short zzC = zzfpVar2.zzC();
                if (zzC == s3 || zzC == s2 || zzC == s || zzC == 2819 || zzC == 2820) {
                    i = i7;
                    this.zzc.add(new zzajj(zzC, (zzd3 - this.zze) - zzfpVar2.zzi(), zzfpVar2.zzi()));
                } else {
                    zzfpVar2.zzL(8);
                    i = i7;
                }
                i8++;
                i7 = i;
                i3 = 2;
                s = 2817;
                s2 = 2816;
                s3 = 2192;
            }
            if (this.zzc.isEmpty()) {
                zzadrVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzadrVar.zza = ((zzajj) this.zzc.get(0)).zza;
            }
        } else {
            zzfp zzfpVar3 = new zzfp(8);
            zzacvVar.zzi(zzfpVar3.zzM(), 0, 8);
            this.zze = zzfpVar3.zzi() + 8;
            if (zzfpVar3.zzg() != 1397048916) {
                zzadrVar.zza = 0L;
            } else {
                zzadrVar.zza = zzacvVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
