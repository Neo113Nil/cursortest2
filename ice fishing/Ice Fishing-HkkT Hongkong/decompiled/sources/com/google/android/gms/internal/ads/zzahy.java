package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzahy implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzahu
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i = zzada.zza;
            zzadb zzadbVar = zzahy.zza;
            return new zzacu[]{new zzahy(0)};
        }
    };
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private zzahx zzB;
    private boolean zzC;
    private int zzD;
    private long zzE;
    private boolean zzF;
    private long zzG;
    private long zzH;
    private long zzI;
    private zzfg zzJ;
    private zzfg zzK;
    private boolean zzL;
    private boolean zzM;
    private int zzN;
    private long zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private int[] zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private int zzZ;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private byte zzag;
    private boolean zzah;
    private zzacx zzai;
    private final zzaht zzh;
    private final zzaia zzi;
    private final SparseArray zzj;
    private final boolean zzk;
    private final zzfp zzl;
    private final zzfp zzm;
    private final zzfp zzn;
    private final zzfp zzo;
    private final zzfp zzp;
    private final zzfp zzq;
    private final zzfp zzr;
    private final zzfp zzs;
    private final zzfp zzt;
    private final zzfp zzu;
    private ByteBuffer zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        int i = zzfy.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zzfwq.zzc);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(hashMap);
    }

    public zzahy() {
        this(0);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzn(zzacv zzacvVar, zzahx zzahxVar, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzahxVar.zzb)) {
            zzv(zzacvVar, zzb, i);
            int i3 = this.zzaa;
            zzu();
            return i3;
        }
        if ("S_TEXT/ASS".equals(zzahxVar.zzb)) {
            zzv(zzacvVar, zzd, i);
            int i4 = this.zzaa;
            zzu();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(zzahxVar.zzb)) {
            zzv(zzacvVar, zze, i);
            int i5 = this.zzaa;
            zzu();
            return i5;
        }
        zzaea zzaeaVar = zzahxVar.zzW;
        if (!this.zzac) {
            if (zzahxVar.zzg) {
                this.zzV &= -1073741825;
                if (!this.zzad) {
                    ((zzack) zzacvVar).zzn(this.zzn.zzM(), 0, 1, false);
                    this.zzZ++;
                    if ((this.zzn.zzM()[0] & 128) == 128) {
                        throw zzcc.zza("Extension bit is set in signal byte", null);
                    }
                    this.zzag = this.zzn.zzM()[0];
                    this.zzad = true;
                }
                byte b = this.zzag;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.zzV |= 1073741824;
                    if (!this.zzah) {
                        ((zzack) zzacvVar).zzn(this.zzs.zzM(), 0, 8, false);
                        this.zzZ += 8;
                        this.zzah = true;
                        this.zzn.zzM()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.zzn.zzK(0);
                        zzaeaVar.zzs(this.zzn, 1, 1);
                        this.zzaa++;
                        this.zzs.zzK(0);
                        zzaeaVar.zzs(this.zzs, 8, 1);
                        this.zzaa += 8;
                    }
                    if (i6 == 2) {
                        if (!this.zzae) {
                            ((zzack) zzacvVar).zzn(this.zzn.zzM(), 0, 1, false);
                            this.zzZ++;
                            this.zzn.zzK(0);
                            this.zzaf = this.zzn.zzm();
                            this.zzae = true;
                        }
                        int i7 = this.zzaf * 4;
                        this.zzn.zzH(i7);
                        ((zzack) zzacvVar).zzn(this.zzn.zzM(), 0, i7, false);
                        this.zzZ += i7;
                        int i8 = (this.zzaf >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzv;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.zzv = ByteBuffer.allocate(i9);
                        }
                        this.zzv.position(0);
                        this.zzv.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.zzaf;
                            if (i10 >= i2) {
                                break;
                            }
                            int zzp = this.zzn.zzp();
                            int i12 = zzp - i11;
                            if (i10 % 2 == 0) {
                                this.zzv.putShort((short) i12);
                            } else {
                                this.zzv.putInt(i12);
                            }
                            i10++;
                            i11 = zzp;
                        }
                        int i13 = (i - this.zzZ) - i11;
                        if ((i2 & 1) == 1) {
                            this.zzv.putInt(i13);
                        } else {
                            this.zzv.putShort((short) i13);
                            this.zzv.putInt(0);
                        }
                        this.zzt.zzI(this.zzv.array(), i9);
                        zzaeaVar.zzs(this.zzt, i9, 1);
                        this.zzaa += i9;
                    }
                }
            } else {
                byte[] bArr = zzahxVar.zzh;
                if (bArr != null) {
                    this.zzq.zzI(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(zzahxVar.zzb) ? zzahxVar.zzf > 0 : z) {
                this.zzV |= 268435456;
                this.zzu.zzH(0);
                int zze2 = (this.zzq.zze() + i) - this.zzZ;
                this.zzn.zzH(4);
                this.zzn.zzM()[0] = (byte) ((zze2 >> 24) & 255);
                this.zzn.zzM()[1] = (byte) ((zze2 >> 16) & 255);
                this.zzn.zzM()[2] = (byte) ((zze2 >> 8) & 255);
                this.zzn.zzM()[3] = (byte) (zze2 & 255);
                zzaeaVar.zzs(this.zzn, 4, 2);
                this.zzaa += 4;
            }
            this.zzac = true;
        }
        int zze3 = i + this.zzq.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzahxVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzahxVar.zzb)) {
            if (zzahxVar.zzT != null) {
                zzek.zzf(this.zzq.zze() == 0);
                zzahxVar.zzT.zzd(zzacvVar);
            }
            while (true) {
                int i14 = this.zzZ;
                if (i14 >= zze3) {
                    break;
                }
                int zzo = zzo(zzacvVar, zzaeaVar, zze3 - i14);
                this.zzZ += zzo;
                this.zzaa += zzo;
            }
        } else {
            byte[] zzM = this.zzm.zzM();
            zzM[0] = 0;
            zzM[1] = 0;
            zzM[2] = 0;
            int i15 = zzahxVar.zzX;
            int i16 = 4 - i15;
            while (this.zzZ < zze3) {
                int i17 = this.zzab;
                if (i17 == 0) {
                    int min = Math.min(i15, this.zzq.zzb());
                    ((zzack) zzacvVar).zzn(zzM, i16 + min, i15 - min, false);
                    if (min > 0) {
                        this.zzq.zzG(zzM, i16, min);
                    }
                    this.zzZ += i15;
                    this.zzm.zzK(0);
                    this.zzab = this.zzm.zzp();
                    this.zzl.zzK(0);
                    zzady.zzb(zzaeaVar, this.zzl, 4);
                    this.zzaa += 4;
                } else {
                    int zzo2 = zzo(zzacvVar, zzaeaVar, i17);
                    this.zzZ += zzo2;
                    this.zzaa += zzo2;
                    this.zzab -= zzo2;
                }
            }
        }
        if ("A_VORBIS".equals(zzahxVar.zzb)) {
            this.zzo.zzK(0);
            zzady.zzb(zzaeaVar, this.zzo, 4);
            this.zzaa += 4;
        }
        int i18 = this.zzaa;
        zzu();
        return i18;
    }

    private final int zzo(zzacv zzacvVar, zzaea zzaeaVar, int i) throws IOException {
        int zzb2 = this.zzq.zzb();
        if (zzb2 <= 0) {
            return zzady.zza(zzaeaVar, zzacvVar, i, false);
        }
        int min = Math.min(i, zzb2);
        zzady.zzb(zzaeaVar, this.zzq, min);
        return min;
    }

    private final long zzp(long j) throws zzcc {
        long j2 = this.zzy;
        if (j2 != -9223372036854775807L) {
            return zzfy.zzs(j, j2, 1000L, RoundingMode.FLOOR);
        }
        throw zzcc.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i) throws zzcc {
        if (this.zzJ == null || this.zzK == null) {
            throw zzcc.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzr(int i) throws zzcc {
        if (this.zzB != null) {
            return;
        }
        throw zzcc.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[EDGE_INSN: B:50:0x00e0->B:49:0x00e0 BREAK  A[LOOP:0: B:42:0x00c5->B:46:0x00dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzs(zzahx zzahxVar, long j, int i, int i2, int i3) {
        char c;
        byte[] zzw;
        int i4;
        int zzd2;
        int zze2;
        zzaeb zzaebVar = zzahxVar.zzT;
        if (zzaebVar != null) {
            zzaebVar.zzc(zzahxVar.zzW, j, i, i2, i3, zzahxVar.zzi);
        } else {
            if ("S_TEXT/UTF8".equals(zzahxVar.zzb) || "S_TEXT/ASS".equals(zzahxVar.zzb) || "S_TEXT/WEBVTT".equals(zzahxVar.zzb)) {
                if (this.zzR > 1) {
                    zzff.zzf("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.zzP;
                    if (j2 == -9223372036854775807L) {
                        zzff.zzf("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = zzahxVar.zzb;
                        byte[] zzM = this.zzr.zzM();
                        int hashCode = str.hashCode();
                        if (hashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                c = 1;
                                if (c != 0) {
                                }
                                System.arraycopy(zzw, 0, zzM, i4, zzw.length);
                                zzd2 = this.zzr.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzr.zze()) {
                                    }
                                    zzd2++;
                                }
                                zzaea zzaeaVar = zzahxVar.zzW;
                                zzfp zzfpVar = this.zzr;
                                zzady.zzb(zzaeaVar, zzfpVar, zzfpVar.zze());
                                zze2 = i2 + this.zzr.zze();
                                if ((i & 268435456) != 0) {
                                }
                                zzahxVar.zzW.zzt(j, i, zze2, i3, zzahxVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzw, 0, zzM, i4, zzw.length);
                            zzd2 = this.zzr.zzd();
                            while (true) {
                                if (zzd2 >= this.zzr.zze()) {
                                }
                                zzd2++;
                            }
                            zzaea zzaeaVar2 = zzahxVar.zzW;
                            zzfp zzfpVar2 = this.zzr;
                            zzady.zzb(zzaeaVar2, zzfpVar2, zzfpVar2.zze());
                            zze2 = i2 + this.zzr.zze();
                            if ((i & 268435456) != 0) {
                            }
                            zzahxVar.zzW.zzt(j, i, zze2, i3, zzahxVar.zzi);
                        } else if (hashCode != 1045209816) {
                            if (hashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                c = 0;
                                if (c != 0) {
                                    zzw = zzw(j2, "%02d:%02d:%02d,%03d", 1000L);
                                    i4 = 19;
                                } else if (c == 1) {
                                    zzw = zzw(j2, "%01d:%02d:%02d:%02d", WorkRequest.MIN_BACKOFF_MILLIS);
                                    i4 = 21;
                                } else {
                                    if (c != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    zzw = zzw(j2, "%02d:%02d:%02d.%03d", 1000L);
                                    i4 = 25;
                                }
                                System.arraycopy(zzw, 0, zzM, i4, zzw.length);
                                zzd2 = this.zzr.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzr.zze()) {
                                        break;
                                    }
                                    if (this.zzr.zzM()[zzd2] == 0) {
                                        this.zzr.zzJ(zzd2);
                                        break;
                                    }
                                    zzd2++;
                                }
                                zzaea zzaeaVar22 = zzahxVar.zzW;
                                zzfp zzfpVar22 = this.zzr;
                                zzady.zzb(zzaeaVar22, zzfpVar22, zzfpVar22.zze());
                                zze2 = i2 + this.zzr.zze();
                                if ((i & 268435456) != 0) {
                                    if (this.zzR > 1) {
                                        this.zzu.zzH(0);
                                    } else {
                                        int zze3 = this.zzu.zze();
                                        zzahxVar.zzW.zzs(this.zzu, zze3, 2);
                                        zze2 += zze3;
                                    }
                                }
                                zzahxVar.zzW.zzt(j, i, zze2, i3, zzahxVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzw, 0, zzM, i4, zzw.length);
                            zzd2 = this.zzr.zzd();
                            while (true) {
                                if (zzd2 >= this.zzr.zze()) {
                                }
                                zzd2++;
                            }
                            zzaea zzaeaVar222 = zzahxVar.zzW;
                            zzfp zzfpVar222 = this.zzr;
                            zzady.zzb(zzaeaVar222, zzfpVar222, zzfpVar222.zze());
                            zze2 = i2 + this.zzr.zze();
                            if ((i & 268435456) != 0) {
                            }
                            zzahxVar.zzW.zzt(j, i, zze2, i3, zzahxVar.zzi);
                        } else {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                c = 2;
                                if (c != 0) {
                                }
                                System.arraycopy(zzw, 0, zzM, i4, zzw.length);
                                zzd2 = this.zzr.zzd();
                                while (true) {
                                    if (zzd2 >= this.zzr.zze()) {
                                    }
                                    zzd2++;
                                }
                                zzaea zzaeaVar2222 = zzahxVar.zzW;
                                zzfp zzfpVar2222 = this.zzr;
                                zzady.zzb(zzaeaVar2222, zzfpVar2222, zzfpVar2222.zze());
                                zze2 = i2 + this.zzr.zze();
                                if ((i & 268435456) != 0) {
                                }
                                zzahxVar.zzW.zzt(j, i, zze2, i3, zzahxVar.zzi);
                            }
                            c = 65535;
                            if (c != 0) {
                            }
                            System.arraycopy(zzw, 0, zzM, i4, zzw.length);
                            zzd2 = this.zzr.zzd();
                            while (true) {
                                if (zzd2 >= this.zzr.zze()) {
                                }
                                zzd2++;
                            }
                            zzaea zzaeaVar22222 = zzahxVar.zzW;
                            zzfp zzfpVar22222 = this.zzr;
                            zzady.zzb(zzaeaVar22222, zzfpVar22222, zzfpVar22222.zze());
                            zze2 = i2 + this.zzr.zze();
                            if ((i & 268435456) != 0) {
                            }
                            zzahxVar.zzW.zzt(j, i, zze2, i3, zzahxVar.zzi);
                        }
                    }
                }
            }
            zze2 = i2;
            if ((i & 268435456) != 0) {
            }
            zzahxVar.zzW.zzt(j, i, zze2, i3, zzahxVar.zzi);
        }
        this.zzM = true;
    }

    private final void zzt(zzacv zzacvVar, int i) throws IOException {
        if (this.zzn.zze() >= i) {
            return;
        }
        if (this.zzn.zzc() < i) {
            zzfp zzfpVar = this.zzn;
            int zzc2 = zzfpVar.zzc();
            zzfpVar.zzE(Math.max(zzc2 + zzc2, i));
        }
        zzfp zzfpVar2 = this.zzn;
        ((zzack) zzacvVar).zzn(zzfpVar2.zzM(), zzfpVar2.zze(), i - zzfpVar2.zze(), false);
        this.zzn.zzJ(i);
    }

    private final void zzu() {
        this.zzZ = 0;
        this.zzaa = 0;
        this.zzab = 0;
        this.zzac = false;
        this.zzad = false;
        this.zzae = false;
        this.zzaf = 0;
        this.zzag = (byte) 0;
        this.zzah = false;
        this.zzq.zzH(0);
    }

    private final void zzv(zzacv zzacvVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        if (this.zzr.zzc() < i2) {
            zzfp zzfpVar = this.zzr;
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            zzfpVar.zzI(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzr.zzM(), 0, length);
        }
        ((zzack) zzacvVar).zzn(this.zzr.zzM(), length, i, false);
        this.zzr.zzK(0);
        this.zzr.zzJ(i2);
    }

    private static byte[] zzw(long j, String str, long j2) {
        zzek.zzd(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer valueOf = Integer.valueOf(i);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer valueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(locale, str, valueOf, valueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zzfy.zza;
        return format.getBytes(zzfwq.zzc);
    }

    private static int[] zzx(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) throws IOException {
        this.zzM = false;
        while (!this.zzM) {
            if (!this.zzh.zzc(zzacvVar)) {
                for (int i = 0; i < this.zzj.size(); i++) {
                    zzahx zzahxVar = (zzahx) this.zzj.valueAt(i);
                    zzahxVar.zzW.getClass();
                    zzaeb zzaebVar = zzahxVar.zzT;
                    if (zzaebVar != null) {
                        zzaebVar.zza(zzahxVar.zzW, zzahxVar.zzi);
                    }
                }
                return -1;
            }
            long zzf2 = zzacvVar.zzf();
            if (this.zzF) {
                this.zzH = zzf2;
                zzadrVar.zza = this.zzG;
                this.zzF = false;
                return 1;
            }
            if (this.zzC) {
                long j = this.zzH;
                if (j != -1) {
                    zzadrVar.zza = j;
                    this.zzH = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzai = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j, long j2) {
        this.zzI = -9223372036854775807L;
        this.zzN = 0;
        this.zzh.zzb();
        this.zzi.zze();
        zzu();
        for (int i = 0; i < this.zzj.size(); i++) {
            zzaeb zzaebVar = ((zzahx) this.zzj.valueAt(i)).zzT;
            if (zzaebVar != null) {
                zzaebVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) throws IOException {
        return new zzahz().zza(zzacvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01e6, code lost:
    
        if (r5.equals("V_MPEGH/ISO/HEVC") != false) goto L188;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzh(int i) throws zzcc {
        int i2;
        int i3;
        zzadu zzadtVar;
        int i4;
        zzek.zzb(this.zzai);
        char c = '\b';
        if (i == 160) {
            if (this.zzN == 2) {
                zzahx zzahxVar = (zzahx) this.zzj.get(this.zzT);
                zzahxVar.zzW.getClass();
                if (this.zzY > 0 && "A_OPUS".equals(zzahxVar.zzb)) {
                    zzfp zzfpVar = this.zzu;
                    byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzY).array();
                    zzfpVar.zzI(array, array.length);
                }
                int i5 = 0;
                for (int i6 = 0; i6 < this.zzR; i6++) {
                    i5 += this.zzS[i6];
                }
                int i7 = 0;
                while (i7 < this.zzR) {
                    long j = this.zzO + ((zzahxVar.zze * i7) / 1000);
                    int i8 = this.zzV;
                    if (i7 == 0) {
                        if (!this.zzX) {
                            i8 |= 1;
                        }
                        i3 = i8;
                        i2 = 0;
                    } else {
                        i2 = i7;
                        i3 = i8;
                    }
                    int i9 = this.zzS[i2];
                    int i10 = i5 - i9;
                    zzs(zzahxVar, j, i3, i9, i10);
                    i7 = i2 + 1;
                    i5 = i10;
                }
                this.zzN = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i11 = this.zzD;
                if (i11 != -1) {
                    long j2 = this.zzE;
                    if (j2 != -1) {
                        if (i11 == 475249515) {
                            this.zzG = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzcc.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                zzr(i);
                zzahx zzahxVar2 = this.zzB;
                if (zzahxVar2.zzg) {
                    if (zzahxVar2.zzi == null) {
                        throw zzcc.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    zzahxVar2.zzk = new zzae(null, new zzad(zzo.zza, null, "video/webm", this.zzB.zzi.zzb));
                    return;
                }
                return;
            }
            if (i == 28032) {
                zzr(i);
                zzahx zzahxVar3 = this.zzB;
                if (zzahxVar3.zzg && zzahxVar3.zzh != null) {
                    throw zzcc.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = 1000000L;
                }
                long j3 = this.zzz;
                if (j3 != -9223372036854775807L) {
                    this.zzA = zzp(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.zzj.size() == 0) {
                    throw zzcc.zza("No valid tracks were found", null);
                }
                this.zzai.zzD();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.zzC) {
                zzacx zzacxVar = this.zzai;
                zzfg zzfgVar = this.zzJ;
                zzfg zzfgVar2 = this.zzK;
                if (this.zzx == -1 || this.zzA == -9223372036854775807L || zzfgVar == null || zzfgVar.zza() == 0 || zzfgVar2 == null || zzfgVar2.zza() != zzfgVar.zza()) {
                    zzadtVar = new zzadt(this.zzA, 0L);
                } else {
                    int zza2 = zzfgVar.zza();
                    int[] iArr = new int[zza2];
                    long[] jArr = new long[zza2];
                    long[] jArr2 = new long[zza2];
                    long[] jArr3 = new long[zza2];
                    for (int i12 = 0; i12 < zza2; i12++) {
                        jArr3[i12] = zzfgVar.zzb(i12);
                        jArr[i12] = this.zzx + zzfgVar2.zzb(i12);
                    }
                    int i13 = 0;
                    while (true) {
                        i4 = zza2 - 1;
                        if (i13 >= i4) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArr[i13] = (int) (jArr[i14] - jArr[i13]);
                        jArr2[i13] = jArr3[i14] - jArr3[i13];
                        i13 = i14;
                    }
                    iArr[i4] = (int) ((this.zzx + this.zzw) - jArr[i4]);
                    long j4 = this.zzA - jArr3[i4];
                    jArr2[i4] = j4;
                    if (j4 <= 0) {
                        zzff.zzf("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArr = Arrays.copyOf(iArr, i4);
                        jArr = Arrays.copyOf(jArr, i4);
                        jArr2 = Arrays.copyOf(jArr2, i4);
                        jArr3 = Arrays.copyOf(jArr3, i4);
                    }
                    zzadtVar = new zzaci(iArr, jArr, jArr2, jArr3);
                }
                zzacxVar.zzO(zzadtVar);
                this.zzC = true;
            }
            this.zzJ = null;
            this.zzK = null;
            return;
        }
        zzahx zzahxVar4 = this.zzB;
        zzek.zzb(zzahxVar4);
        String str = zzahxVar4.zzb;
        if (str == null) {
            throw zzcc.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 30:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
            case ' ':
                zzahxVar4.zze(this.zzai, zzahxVar4.zzc);
                this.zzj.put(zzahxVar4.zzc, zzahxVar4);
                break;
        }
        this.zzB = null;
    }

    protected final void zzk(int i, long j, long j2) throws zzcc {
        zzek.zzb(this.zzai);
        if (i == 160) {
            this.zzX = false;
            this.zzY = 0L;
            return;
        }
        if (i == 174) {
            this.zzB = new zzahx();
            return;
        }
        if (i == 187) {
            this.zzL = false;
            return;
        }
        if (i == 19899) {
            this.zzD = -1;
            this.zzE = -1L;
            return;
        }
        if (i == 20533) {
            zzr(i);
            this.zzB.zzg = true;
            return;
        }
        if (i == 21968) {
            zzr(i);
            this.zzB.zzx = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.zzx;
            if (j3 != -1 && j3 != j) {
                throw zzcc.zza("Multiple Segment elements not supported", null);
            }
            this.zzx = j;
            this.zzw = j2;
            return;
        }
        if (i == 475249515) {
            this.zzJ = new zzfg(32);
            this.zzK = new zzfg(32);
        } else if (i == 524531317 && !this.zzC) {
            if (this.zzk && this.zzG != -1) {
                this.zzF = true;
            } else {
                this.zzai.zzO(new zzadt(this.zzA, 0L));
                this.zzC = true;
            }
        }
    }

    public zzahy(int i) {
        zzahr zzahrVar = new zzahr();
        this.zzx = -1L;
        this.zzy = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzG = -1L;
        this.zzH = -1L;
        this.zzI = -9223372036854775807L;
        this.zzh = zzahrVar;
        zzahrVar.zza(new zzahw(this, null));
        this.zzk = true;
        this.zzi = new zzaia();
        this.zzj = new SparseArray();
        this.zzn = new zzfp(4);
        this.zzo = new zzfp(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzp = new zzfp(4);
        this.zzl = new zzfp(zzgm.zza);
        this.zzm = new zzfp(4);
        this.zzq = new zzfp();
        this.zzr = new zzfp();
        this.zzs = new zzfp(8);
        this.zzt = new zzfp();
        this.zzu = new zzfp();
        this.zzS = new int[1];
    }

    protected final void zzl(int i, String str) throws zzcc {
        if (i == 134) {
            zzr(i);
            this.zzB.zzb = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcc.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            zzr(i);
            this.zzB.zza = str;
        } else {
            if (i != 2274716) {
                return;
            }
            zzr(i);
            this.zzB.zzZ = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x028d, code lost:
    
        throw com.google.android.gms.internal.ads.zzcc.zza("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzg(int i, int i2, zzacv zzacvVar) throws IOException {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i;
        Throwable th = null;
        int i12 = 1;
        if (i11 != 161 && i11 != 163) {
            if (i11 == 165) {
                if (this.zzN != 2) {
                    return;
                }
                zzahx zzahxVar = (zzahx) this.zzj.get(this.zzT);
                if (this.zzW != 4 || !"V_VP9".equals(zzahxVar.zzb)) {
                    ((zzack) zzacvVar).zzo(i2, false);
                    return;
                }
                this.zzu.zzH(i2);
                ((zzack) zzacvVar).zzn(this.zzu.zzM(), 0, i2, false);
                return;
            }
            if (i11 == 16877) {
                zzr(i);
                zzahx zzahxVar2 = this.zzB;
                i9 = zzahxVar2.zzY;
                if (i9 != 1685485123) {
                    i10 = zzahxVar2.zzY;
                    if (i10 != 1685480259) {
                        ((zzack) zzacvVar).zzo(i2, false);
                        return;
                    }
                }
                zzahxVar2.zzN = new byte[i2];
                ((zzack) zzacvVar).zzn(zzahxVar2.zzN, 0, i2, false);
                return;
            }
            if (i11 == 16981) {
                zzr(i);
                zzahx zzahxVar3 = this.zzB;
                zzahxVar3.zzh = new byte[i2];
                ((zzack) zzacvVar).zzn(zzahxVar3.zzh, 0, i2, false);
                return;
            }
            if (i11 == 18402) {
                byte[] bArr = new byte[i2];
                ((zzack) zzacvVar).zzn(bArr, 0, i2, false);
                zzr(i);
                this.zzB.zzi = new zzadz(1, bArr, 0, 0);
                return;
            }
            if (i11 == 21419) {
                Arrays.fill(this.zzp.zzM(), (byte) 0);
                ((zzack) zzacvVar).zzn(this.zzp.zzM(), 4 - i2, i2, false);
                this.zzp.zzK(0);
                this.zzD = (int) this.zzp.zzu();
                return;
            }
            if (i11 == 25506) {
                zzr(i);
                zzahx zzahxVar4 = this.zzB;
                zzahxVar4.zzj = new byte[i2];
                ((zzack) zzacvVar).zzn(zzahxVar4.zzj, 0, i2, false);
                return;
            }
            if (i11 != 30322) {
                throw zzcc.zza("Unexpected id: " + i11, null);
            }
            zzr(i);
            zzahx zzahxVar5 = this.zzB;
            zzahxVar5.zzv = new byte[i2];
            ((zzack) zzacvVar).zzn(zzahxVar5.zzv, 0, i2, false);
            return;
        }
        if (this.zzN == 0) {
            this.zzT = (int) this.zzi.zzd(zzacvVar, false, true, 8);
            this.zzU = this.zzi.zza();
            this.zzP = -9223372036854775807L;
            this.zzN = 1;
            this.zzn.zzH(0);
        }
        zzahx zzahxVar6 = (zzahx) this.zzj.get(this.zzT);
        if (zzahxVar6 == null) {
            ((zzack) zzacvVar).zzo(i2 - this.zzU, false);
            this.zzN = 0;
            return;
        }
        zzahxVar6.zzW.getClass();
        if (this.zzN == 1) {
            zzt(zzacvVar, 3);
            int i13 = (this.zzn.zzM()[2] & 6) >> 1;
            byte b = 255;
            if (i13 == 0) {
                this.zzR = 1;
                int[] zzx = zzx(this.zzS, 1);
                this.zzS = zzx;
                zzx[0] = (i2 - this.zzU) - 3;
            } else {
                zzt(zzacvVar, 4);
                int i14 = (this.zzn.zzM()[3] & 255) + 1;
                this.zzR = i14;
                int[] zzx2 = zzx(this.zzS, i14);
                this.zzS = zzx2;
                if (i13 == 2) {
                    int i15 = (i2 - this.zzU) - 4;
                    int i16 = this.zzR;
                    Arrays.fill(zzx2, 0, i16, i15 / i16);
                } else if (i13 == 1) {
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 4;
                    while (true) {
                        i5 = this.zzR - 1;
                        if (i17 >= i5) {
                            break;
                        }
                        this.zzS[i17] = 0;
                        while (true) {
                            i6 = i19 + 1;
                            zzt(zzacvVar, i6);
                            int i20 = this.zzn.zzM()[i19] & 255;
                            int[] iArr = this.zzS;
                            i7 = iArr[i17] + i20;
                            iArr[i17] = i7;
                            if (i20 != 255) {
                                break;
                            } else {
                                i19 = i6;
                            }
                        }
                        i18 += i7;
                        i17++;
                        i19 = i6;
                    }
                    this.zzS[i5] = ((i2 - this.zzU) - i19) - i18;
                } else {
                    if (i13 != 3) {
                        throw zzcc.zza("Unexpected lacing value: 2", null);
                    }
                    int i21 = 0;
                    int i22 = 0;
                    int i23 = 4;
                    while (true) {
                        int i24 = this.zzR - 1;
                        if (i21 >= i24) {
                            this.zzS[i24] = ((i2 - this.zzU) - i23) - i22;
                            break;
                        }
                        this.zzS[i21] = 0;
                        int i25 = i23 + 1;
                        zzt(zzacvVar, i25);
                        if (this.zzn.zzM()[i23] == 0) {
                            throw zzcc.zza("No valid varint length mask found", th);
                        }
                        int i26 = 0;
                        while (true) {
                            if (i26 >= 8) {
                                j = 0;
                                i4 = i25;
                                break;
                            }
                            int i27 = i12 << (7 - i26);
                            if ((this.zzn.zzM()[i23] & i27) != 0) {
                                int i28 = i25 + i26;
                                zzt(zzacvVar, i28);
                                j = this.zzn.zzM()[i23] & b & (~i27);
                                int i29 = i23 + 1;
                                while (i29 < i28) {
                                    j = (j << 8) | (this.zzn.zzM()[i29] & b);
                                    i29++;
                                    i28 = i28;
                                    b = 255;
                                }
                                i4 = i28;
                                if (i21 > 0) {
                                    j -= (1 << ((i26 * 7) + 6)) - 1;
                                }
                            } else {
                                i26++;
                                i12 = 1;
                                b = 255;
                            }
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            break;
                        }
                        int[] iArr2 = this.zzS;
                        int i30 = (int) j;
                        if (i21 != 0) {
                            i30 += iArr2[i21 - 1];
                        }
                        iArr2[i21] = i30;
                        i22 += i30;
                        i21++;
                        i23 = i4;
                        th = null;
                        i12 = 1;
                        b = 255;
                    }
                }
            }
            this.zzO = this.zzI + zzp((this.zzn.zzM()[0] << 8) | (this.zzn.zzM()[1] & 255));
            if (zzahxVar6.zzd != 2) {
                if (i11 != 163) {
                    i8 = 0;
                } else if ((this.zzn.zzM()[2] & 128) == 128) {
                    i11 = 163;
                } else {
                    i8 = 0;
                    i11 = 163;
                }
                this.zzV = i8;
                this.zzN = 2;
                this.zzQ = 0;
                i3 = 163;
            }
            i8 = 1;
            this.zzV = i8;
            this.zzN = 2;
            this.zzQ = 0;
            i3 = 163;
        } else {
            i3 = 163;
        }
        if (i11 == i3) {
            while (true) {
                int i31 = this.zzQ;
                if (i31 >= this.zzR) {
                    this.zzN = 0;
                    return;
                }
                zzs(zzahxVar6, ((this.zzQ * zzahxVar6.zze) / 1000) + this.zzO, this.zzV, zzn(zzacvVar, zzahxVar6, this.zzS[i31], false), 0);
                this.zzQ++;
            }
        } else {
            while (true) {
                int i32 = this.zzQ;
                if (i32 >= this.zzR) {
                    return;
                }
                int[] iArr3 = this.zzS;
                iArr3[i32] = zzn(zzacvVar, zzahxVar6, iArr3[i32], true);
                this.zzQ++;
            }
        }
    }

    protected final void zzi(int i, double d) throws zzcc {
        if (i == 181) {
            zzr(i);
            this.zzB.zzQ = (int) d;
            return;
        }
        if (i == 17545) {
            this.zzz = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                zzr(i);
                this.zzB.zzD = (float) d;
                break;
            case 21970:
                zzr(i);
                this.zzB.zzE = (float) d;
                break;
            case 21971:
                zzr(i);
                this.zzB.zzF = (float) d;
                break;
            case 21972:
                zzr(i);
                this.zzB.zzG = (float) d;
                break;
            case 21973:
                zzr(i);
                this.zzB.zzH = (float) d;
                break;
            case 21974:
                zzr(i);
                this.zzB.zzI = (float) d;
                break;
            case 21975:
                zzr(i);
                this.zzB.zzJ = (float) d;
                break;
            case 21976:
                zzr(i);
                this.zzB.zzK = (float) d;
                break;
            case 21977:
                zzr(i);
                this.zzB.zzL = (float) d;
                break;
            case 21978:
                zzr(i);
                this.zzB.zzM = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        zzr(i);
                        this.zzB.zzs = (float) d;
                        break;
                    case 30324:
                        zzr(i);
                        this.zzB.zzt = (float) d;
                        break;
                    case 30325:
                        zzr(i);
                        this.zzB.zzu = (float) d;
                        break;
                }
        }
    }

    protected final void zzj(int i, long j) throws zzcc {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzcc.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzcc.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                zzr(i);
                this.zzB.zzd = (int) j;
                return;
            case 136:
                z = j == 1;
                zzr(i);
                this.zzB.zzV = z;
                return;
            case 155:
                this.zzP = zzp(j);
                return;
            case 159:
                zzr(i);
                this.zzB.zzO = (int) j;
                return;
            case 176:
                zzr(i);
                this.zzB.zzl = (int) j;
                return;
            case 179:
                zzq(i);
                this.zzJ.zzc(zzp(j));
                return;
            case 186:
                zzr(i);
                this.zzB.zzm = (int) j;
                return;
            case 215:
                zzr(i);
                this.zzB.zzc = (int) j;
                return;
            case 231:
                this.zzI = zzp(j);
                return;
            case 238:
                this.zzW = (int) j;
                return;
            case 241:
                if (this.zzL) {
                    return;
                }
                zzq(i);
                this.zzK.zzc(j);
                this.zzL = true;
                return;
            case 251:
                this.zzX = true;
                return;
            case 16871:
                zzr(i);
                this.zzB.zzY = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzcc.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzcc.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzcc.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzcc.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzcc.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.zzE = j + this.zzx;
                return;
            case 21432:
                int i2 = (int) j;
                zzr(i);
                if (i2 == 0) {
                    this.zzB.zzw = 0;
                    return;
                }
                if (i2 == 1) {
                    this.zzB.zzw = 2;
                    return;
                } else if (i2 == 3) {
                    this.zzB.zzw = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.zzB.zzw = 3;
                    return;
                }
            case 21680:
                zzr(i);
                this.zzB.zzo = (int) j;
                return;
            case 21682:
                zzr(i);
                this.zzB.zzq = (int) j;
                return;
            case 21690:
                zzr(i);
                this.zzB.zzp = (int) j;
                return;
            case 21930:
                z = j == 1;
                zzr(i);
                this.zzB.zzU = z;
                return;
            case 21938:
                zzr(i);
                zzahx zzahxVar = this.zzB;
                zzahxVar.zzx = true;
                zzahxVar.zzn = (int) j;
                return;
            case 21998:
                zzr(i);
                this.zzB.zzf = (int) j;
                return;
            case 22186:
                zzr(i);
                this.zzB.zzR = j;
                return;
            case 22203:
                zzr(i);
                this.zzB.zzS = j;
                return;
            case 25188:
                zzr(i);
                this.zzB.zzP = (int) j;
                return;
            case 30114:
                this.zzY = j;
                return;
            case 30321:
                int i3 = (int) j;
                zzr(i);
                if (i3 == 0) {
                    this.zzB.zzr = 0;
                    return;
                }
                if (i3 == 1) {
                    this.zzB.zzr = 1;
                    return;
                } else if (i3 == 2) {
                    this.zzB.zzr = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.zzB.zzr = 3;
                    return;
                }
            case 2352003:
                zzr(i);
                this.zzB.zze = (int) j;
                return;
            case 2807729:
                this.zzy = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        zzr(i);
                        if (i4 == 1) {
                            this.zzB.zzA = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.zzB.zzA = 1;
                            return;
                        }
                    case 21946:
                        zzr(i);
                        int zzb2 = zzt.zzb((int) j);
                        if (zzb2 != -1) {
                            this.zzB.zzz = zzb2;
                            return;
                        }
                        return;
                    case 21947:
                        zzr(i);
                        this.zzB.zzx = true;
                        int zza2 = zzt.zza((int) j);
                        if (zza2 != -1) {
                            this.zzB.zzy = zza2;
                            return;
                        }
                        return;
                    case 21948:
                        zzr(i);
                        this.zzB.zzB = (int) j;
                        return;
                    case 21949:
                        zzr(i);
                        this.zzB.zzC = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }
}
