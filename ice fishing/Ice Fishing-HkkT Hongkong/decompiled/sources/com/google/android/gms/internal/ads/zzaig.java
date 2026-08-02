package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzaig implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzaie
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i = zzada.zza;
            zzadb zzadbVar = zzaig.zza;
            return new zzacu[]{new zzaig(0)};
        }
    };
    private static final zzago zzb = new zzago() { // from class: com.google.android.gms.internal.ads.zzaif
    };
    private final zzfp zzc;
    private final zzado zzd;
    private final zzadk zze;
    private final zzadm zzf;
    private final zzaea zzg;
    private zzacx zzh;
    private zzaea zzi;
    private zzaea zzj;
    private int zzk;
    private zzby zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzaii zzq;
    private boolean zzr;

    public zzaig() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ce A[ADDED_TO_REGION] */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzf(zzacv zzacvVar) throws IOException {
        int i;
        zzadk zzadkVar;
        zzaii zzh;
        int i2;
        int i3;
        zzby zzbyVar;
        zzaid zzaidVar;
        long j;
        if (this.zzk == 0) {
            try {
                zzk(zzacvVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzq == null) {
            zzfp zzfpVar = new zzfp(this.zzd.zzc);
            zzack zzackVar = (zzack) zzacvVar;
            zzackVar.zzm(zzfpVar.zzM(), 0, this.zzd.zzc, false);
            zzado zzadoVar = this.zzd;
            int i4 = 21;
            if ((zzadoVar.zza & 1) != 0) {
                if (zzadoVar.zze != 1) {
                    i4 = 36;
                }
            } else if (zzadoVar.zze == 1) {
                i4 = 13;
            }
            if (zzfpVar.zze() >= i4 + 4) {
                zzfpVar.zzK(i4);
                i = zzfpVar.zzg();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i == 1447187017) {
                        zzh = zzaij.zzb(zzacvVar.zzd(), zzacvVar.zzf(), this.zzd, zzfpVar);
                        zzackVar.zzo(this.zzd.zzc, false);
                    } else if (i != 1483304551) {
                        zzacvVar.zzj();
                        zzh = null;
                    }
                    zzbyVar = this.zzl;
                    long zzf = zzacvVar.zzf();
                    if (zzbyVar != null) {
                        int zza2 = zzbyVar.zza();
                        for (int i5 = 0; i5 < zza2; i5++) {
                            zzbx zzb2 = zzbyVar.zzb(i5);
                            if (zzb2 instanceof zzagv) {
                                zzagv zzagvVar = (zzagv) zzb2;
                                int zza3 = zzbyVar.zza();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= zza3) {
                                        j = -9223372036854775807L;
                                        break;
                                    }
                                    zzbx zzb3 = zzbyVar.zzb(i6);
                                    if (zzb3 instanceof zzagz) {
                                        zzagz zzagzVar = (zzagz) zzb3;
                                        if (zzagzVar.zzf.equals("TLEN")) {
                                            j = zzfy.zzq(Long.parseLong((String) zzagzVar.zzc.get(0)));
                                            break;
                                        }
                                    }
                                    i6++;
                                }
                                zzaidVar = zzaid.zzb(zzf, zzagvVar, j);
                                if (this.zzr) {
                                    zzh = new zzaih();
                                } else {
                                    if (zzaidVar != null) {
                                        zzh = zzaidVar;
                                    } else if (zzh == null) {
                                        zzh = null;
                                    }
                                    if (zzh != null) {
                                        zzh.zzh();
                                    } else {
                                        zzh = zzh(zzacvVar, false);
                                    }
                                }
                                this.zzq = zzh;
                                this.zzh.zzO(zzh);
                                zzaea zzaeaVar = this.zzj;
                                zzak zzakVar = new zzak();
                                zzakVar.zzW(this.zzd.zzb);
                                zzakVar.zzO(4096);
                                zzakVar.zzy(this.zzd.zze);
                                zzakVar.zzX(this.zzd.zzd);
                                zzakVar.zzF(this.zze.zza);
                                zzakVar.zzG(this.zze.zzb);
                                zzakVar.zzP(this.zzl);
                                zzaeaVar.zzl(zzakVar.zzac());
                                this.zzo = zzacvVar.zzf();
                            }
                        }
                    }
                    zzaidVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzO(zzh);
                    zzaea zzaeaVar2 = this.zzj;
                    zzak zzakVar2 = new zzak();
                    zzakVar2.zzW(this.zzd.zzb);
                    zzakVar2.zzO(4096);
                    zzakVar2.zzy(this.zzd.zze);
                    zzakVar2.zzX(this.zzd.zzd);
                    zzakVar2.zzF(this.zze.zza);
                    zzakVar2.zzG(this.zze.zzb);
                    zzakVar2.zzP(this.zzl);
                    zzaeaVar2.zzl(zzakVar2.zzac());
                    this.zzo = zzacvVar.zzf();
                }
                zzaik zza4 = zzaik.zza(this.zzd, zzfpVar);
                zzadkVar = this.zze;
                if (!zzadkVar.zza() && (i2 = zza4.zzd) != -1 && (i3 = zza4.zze) != -1) {
                    zzadkVar.zza = i2;
                    zzadkVar.zzb = i3;
                }
                zzail zzb4 = zzail.zzb(zzacvVar.zzd(), zza4, zzacvVar.zzf());
                zzackVar.zzo(this.zzd.zzc, false);
                zzh = (zzb4.zzh() && i == 1231971951) ? zzh(zzacvVar, false) : zzb4;
                zzbyVar = this.zzl;
                long zzf2 = zzacvVar.zzf();
                if (zzbyVar != null) {
                }
                zzaidVar = null;
                if (this.zzr) {
                }
                this.zzq = zzh;
                this.zzh.zzO(zzh);
                zzaea zzaeaVar22 = this.zzj;
                zzak zzakVar22 = new zzak();
                zzakVar22.zzW(this.zzd.zzb);
                zzakVar22.zzO(4096);
                zzakVar22.zzy(this.zzd.zze);
                zzakVar22.zzX(this.zzd.zzd);
                zzakVar22.zzF(this.zze.zza);
                zzakVar22.zzG(this.zze.zzb);
                zzakVar22.zzP(this.zzl);
                zzaeaVar22.zzl(zzakVar22.zzac());
                this.zzo = zzacvVar.zzf();
            }
            if (zzfpVar.zze() >= 40) {
                zzfpVar.zzK(36);
                if (zzfpVar.zzg() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    zzaik zza42 = zzaik.zza(this.zzd, zzfpVar);
                    zzadkVar = this.zze;
                    if (!zzadkVar.zza()) {
                        zzadkVar.zza = i2;
                        zzadkVar.zzb = i3;
                    }
                    zzail zzb42 = zzail.zzb(zzacvVar.zzd(), zza42, zzacvVar.zzf());
                    zzackVar.zzo(this.zzd.zzc, false);
                    if (zzb42.zzh()) {
                    }
                    zzbyVar = this.zzl;
                    long zzf22 = zzacvVar.zzf();
                    if (zzbyVar != null) {
                    }
                    zzaidVar = null;
                    if (this.zzr) {
                    }
                    this.zzq = zzh;
                    this.zzh.zzO(zzh);
                    zzaea zzaeaVar222 = this.zzj;
                    zzak zzakVar222 = new zzak();
                    zzakVar222.zzW(this.zzd.zzb);
                    zzakVar222.zzO(4096);
                    zzakVar222.zzy(this.zzd.zze);
                    zzakVar222.zzX(this.zzd.zzd);
                    zzakVar222.zzF(this.zze.zza);
                    zzakVar222.zzG(this.zze.zzb);
                    zzakVar222.zzP(this.zzl);
                    zzaeaVar222.zzl(zzakVar222.zzac());
                    this.zzo = zzacvVar.zzf();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            zzaik zza422 = zzaik.zza(this.zzd, zzfpVar);
            zzadkVar = this.zze;
            if (!zzadkVar.zza()) {
            }
            zzail zzb422 = zzail.zzb(zzacvVar.zzd(), zza422, zzacvVar.zzf());
            zzackVar.zzo(this.zzd.zzc, false);
            if (zzb422.zzh()) {
            }
            zzbyVar = this.zzl;
            long zzf222 = zzacvVar.zzf();
            if (zzbyVar != null) {
            }
            zzaidVar = null;
            if (this.zzr) {
            }
            this.zzq = zzh;
            this.zzh.zzO(zzh);
            zzaea zzaeaVar2222 = this.zzj;
            zzak zzakVar2222 = new zzak();
            zzakVar2222.zzW(this.zzd.zzb);
            zzakVar2222.zzO(4096);
            zzakVar2222.zzy(this.zzd.zze);
            zzakVar2222.zzX(this.zzd.zzd);
            zzakVar2222.zzF(this.zze.zza);
            zzakVar2222.zzG(this.zze.zzb);
            zzakVar2222.zzP(this.zzl);
            zzaeaVar2222.zzl(zzakVar2222.zzac());
            this.zzo = zzacvVar.zzf();
        } else {
            long j2 = this.zzo;
            if (j2 != 0) {
                long zzf3 = zzacvVar.zzf();
                if (zzf3 < j2) {
                    ((zzack) zzacvVar).zzo((int) (j2 - zzf3), false);
                }
            }
        }
        int i7 = this.zzp;
        if (i7 == 0) {
            zzacvVar.zzj();
            if (zzj(zzacvVar)) {
                return -1;
            }
            this.zzc.zzK(0);
            int zzg = this.zzc.zzg();
            if (!zzi(zzg, this.zzk) || zzadp.zzb(zzg) == -1) {
                ((zzack) zzacvVar).zzo(1, false);
                this.zzk = 0;
                return 0;
            }
            this.zzd.zza(zzg);
            if (this.zzm == -9223372036854775807L) {
                this.zzm = this.zzq.zzd(zzacvVar.zzf());
            }
            int i8 = this.zzd.zzc;
            this.zzp = i8;
            zzaii zzaiiVar = this.zzq;
            if (zzaiiVar instanceof zzaic) {
                zzg(this.zzn + r2.zzg);
                throw null;
            }
            i7 = i8;
        }
        int zzf4 = this.zzj.zzf(zzacvVar, i7, true);
        if (zzf4 == -1) {
            return -1;
        }
        int i9 = this.zzp - zzf4;
        this.zzp = i9;
        if (i9 <= 0) {
            this.zzj.zzt(zzg(this.zzn), 1, this.zzd.zzc, 0, null);
            this.zzn += this.zzd.zzg;
            this.zzp = 0;
            return 0;
        }
        return 0;
    }

    private final long zzg(long j) {
        return this.zzm + ((j * 1000000) / this.zzd.zzd);
    }

    private final zzaii zzh(zzacv zzacvVar, boolean z) throws IOException {
        ((zzack) zzacvVar).zzm(this.zzc.zzM(), 0, 4, false);
        this.zzc.zzK(0);
        this.zzd.zza(this.zzc.zzg());
        return new zzaib(zzacvVar.zzd(), zzacvVar.zzf(), this.zzd, false);
    }

    private static boolean zzi(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzj(zzacv zzacvVar) throws IOException {
        zzaii zzaiiVar = this.zzq;
        if (zzaiiVar != null) {
            long zzc = zzaiiVar.zzc();
            if (zzc != -1 && zzacvVar.zze() > zzc - 4) {
                return true;
            }
        }
        try {
            return !zzacvVar.zzm(this.zzc.zzM(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzk(zzacv zzacvVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        zzacvVar.zzj();
        if (zzacvVar.zzf() == 0) {
            zzby zza2 = this.zzf.zza(zzacvVar, null);
            this.zzl = zza2;
            if (zza2 != null) {
                this.zze.zzb(zza2);
            }
            i = (int) zzacvVar.zze();
            if (!z) {
                ((zzack) zzacvVar).zzo(i, false);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!zzj(zzacvVar)) {
                this.zzc.zzK(0);
                int zzg = this.zzc.zzg();
                if ((i2 == 0 || zzi(zzg, i2)) && (zzb2 = zzadp.zzb(zzg)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzd.zza(zzg);
                        i2 = zzg;
                    }
                    ((zzack) zzacvVar).zzl(zzb2 - 4, false);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        throw zzcc.zza("Searched too many bytes.", null);
                    }
                    if (z) {
                        zzacvVar.zzj();
                        ((zzack) zzacvVar).zzl(i + i5, false);
                    } else {
                        ((zzack) zzacvVar).zzo(1, false);
                    }
                    i2 = 0;
                    i4 = i5;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            ((zzack) zzacvVar).zzo(i + i4, false);
        } else {
            zzacvVar.zzj();
        }
        this.zzk = i2;
        return true;
    }

    public final void zza() {
        this.zzr = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        zzek.zzb(this.zzi);
        int i = zzfy.zza;
        int zzf = zzf(zzacvVar);
        if (zzf == -1 && (this.zzq instanceof zzaic)) {
            if (this.zzq.zza() != zzg(this.zzn)) {
                throw null;
            }
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzh = zzacxVar;
        zzaea zzw = zzacxVar.zzw(0, 1);
        this.zzi = zzw;
        this.zzj = zzw;
        this.zzh.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j, long j2) {
        this.zzk = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzp = 0;
        zzaii zzaiiVar = this.zzq;
        if (zzaiiVar instanceof zzaic) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) throws IOException {
        return zzk(zzacvVar, true);
    }

    public zzaig(int i) {
        this.zzc = new zzfp(10);
        this.zzd = new zzado();
        this.zze = new zzadk();
        this.zzm = -9223372036854775807L;
        this.zzf = new zzadm();
        zzact zzactVar = new zzact();
        this.zzg = zzactVar;
        this.zzj = zzactVar;
    }
}
