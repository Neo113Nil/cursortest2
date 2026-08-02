package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzahx {
    public byte[] zzN;
    public zzaeb zzT;
    public boolean zzU;
    public zzaea zzW;
    public int zzX;
    private int zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzadz zzi;
    public byte[] zzj;
    public zzae zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private String zzZ = "eng";

    protected zzahx() {
    }

    private static Pair zzf(zzfp zzfpVar) throws zzcc {
        try {
            zzfpVar.zzL(16);
            long zzs = zzfpVar.zzs();
            if (zzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (zzs == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (zzs != 826496599) {
                zzff.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int zzd = zzfpVar.zzd() + 20;
            byte[] zzM = zzfpVar.zzM();
            while (true) {
                int length = zzM.length;
                if (zzd >= length - 4) {
                    throw zzcc.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = zzd + 1;
                if (zzM[zzd] == 0 && zzM[i] == 0 && zzM[zzd + 2] == 1 && zzM[zzd + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzM, zzd, length)));
                }
                zzd = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzcc {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzfp zzfpVar) throws zzcc {
        try {
            int zzk = zzfpVar.zzk();
            if (zzk == 1) {
                return true;
            }
            if (zzk == 65534) {
                zzfpVar.zzK(24);
                if (zzfpVar.zzt() == zzahy.zzf.getMostSignificantBits()) {
                    if (zzfpVar.zzt() == zzahy.zzf.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzcc {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzcc.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03e0  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzacx zzacxVar, int i) throws zzcc {
        char c;
        List singletonList;
        List list;
        String str;
        String str2;
        int i2;
        List zzg;
        int i3;
        String str3;
        zzak zzakVar;
        zzt zztVar;
        byte[] bArr;
        int i4;
        zzacq zza;
        String str4 = this.zzb;
        int i5 = 1;
        int i6 = 4;
        int i7 = 0;
        int i8 = -1;
        switch (str4.hashCode()) {
            case -2095576542:
                if (str4.equals("V_MPEG4/ISO/AP")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -2095575984:
                if (str4.equals("V_MPEG4/ISO/SP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1985379776:
                if (str4.equals("A_MS/ACM")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1784763192:
                if (str4.equals("A_TRUEHD")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1730367663:
                if (str4.equals("A_VORBIS")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1482641358:
                if (str4.equals("A_MPEG/L2")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -1482641357:
                if (str4.equals("A_MPEG/L3")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1373388978:
                if (str4.equals("V_MS/VFW/FOURCC")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -933872740:
                if (str4.equals("S_DVBSUB")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case -538363189:
                if (str4.equals("V_MPEG4/ISO/ASP")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -538363109:
                if (str4.equals("V_MPEG4/ISO/AVC")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -425012669:
                if (str4.equals("S_VOBSUB")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case -356037306:
                if (str4.equals("A_DTS/LOSSLESS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 62923557:
                if (str4.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 62923603:
                if (str4.equals("A_AC3")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 62927045:
                if (str4.equals("A_DTS")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 82318131:
                if (str4.equals("V_AV1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 82338133:
                if (str4.equals("V_VP8")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82338134:
                if (str4.equals("V_VP9")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99146302:
                if (str4.equals("S_HDMV/PGS")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            case 444813526:
                if (str4.equals("V_THEORA")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 542569478:
                if (str4.equals("A_DTS/EXPRESS")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 635596514:
                if (str4.equals("A_PCM/FLOAT/IEEE")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 725948237:
                if (str4.equals("A_PCM/INT/BIG")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 725957860:
                if (str4.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 738597099:
                if (str4.equals("S_TEXT/ASS")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 855502857:
                if (str4.equals("V_MPEGH/ISO/HEVC")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1045209816:
                if (str4.equals("S_TEXT/WEBVTT")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1422270023:
                if (str4.equals("S_TEXT/UTF8")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1809237540:
                if (str4.equals("V_MPEG2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1950749482:
                if (str4.equals("A_EAC3")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1950789798:
                if (str4.equals("A_FLAC")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1951062397:
                if (str4.equals("A_OPUS")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str5 = "audio/raw";
        switch (c) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null && (zza = zzacq.zza(new zzfp(this.zzN))) != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                int i9 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                    zzakVar.zzy(this.zzO);
                    zzakVar.zzX(this.zzQ);
                    zzakVar.zzQ(i6);
                } else if (zzcb.zzh(str3)) {
                    if (this.zzq == 0) {
                        int i10 = this.zzo;
                        if (i10 == -1) {
                            i10 = this.zzl;
                        }
                        this.zzo = i10;
                        int i11 = this.zzp;
                        if (i11 == -1) {
                            i11 = this.zzm;
                        }
                        this.zzp = i11;
                    }
                    float f = (this.zzo == -1 || (i4 = this.zzp) == -1) ? -1.0f : (this.zzm * r6) / (this.zzl * i4);
                    if (this.zzx) {
                        if (this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f || this.zzM == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            order.put((byte) 0);
                            order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            order.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            order.putShort((short) (this.zzL + 0.5f));
                            order.putShort((short) (this.zzM + 0.5f));
                            order.putShort((short) this.zzB);
                            order.putShort((short) this.zzC);
                        }
                        zzr zzrVar = new zzr();
                        zzrVar.zzc(this.zzy);
                        zzrVar.zzb(this.zzA);
                        zzrVar.zzd(this.zzz);
                        zzrVar.zze(bArr);
                        zzrVar.zzf(this.zzn);
                        zzrVar.zza(this.zzn);
                        zztVar = zzrVar.zzg();
                    } else {
                        zztVar = null;
                    }
                    if (this.zza != null && zzahy.zzg.containsKey(this.zza)) {
                        i8 = ((Integer) zzahy.zzg.get(this.zza)).intValue();
                    }
                    if (this.zzr == 0 && Float.compare(this.zzs, 0.0f) == 0 && Float.compare(this.zzt, 0.0f) == 0) {
                        if (Float.compare(this.zzu, 0.0f) != 0) {
                            if (Float.compare(this.zzu, 90.0f) == 0) {
                                i7 = 90;
                            } else if (Float.compare(this.zzu, -180.0f) == 0 || Float.compare(this.zzu, 180.0f) == 0) {
                                i7 = 180;
                            } else if (Float.compare(this.zzu, -90.0f) == 0) {
                                i7 = 270;
                            }
                        }
                        zzakVar.zzab(this.zzl);
                        zzakVar.zzI(this.zzm);
                        zzakVar.zzS(f);
                        zzakVar.zzV(i7);
                        zzakVar.zzT(this.zzv);
                        zzakVar.zzZ(this.zzw);
                        zzakVar.zzA(zztVar);
                        i5 = 2;
                    }
                    i7 = i8;
                    zzakVar.zzab(this.zzl);
                    zzakVar.zzI(this.zzm);
                    zzakVar.zzS(f);
                    zzakVar.zzV(i7);
                    zzakVar.zzT(this.zzv);
                    zzakVar.zzZ(this.zzw);
                    zzakVar.zzA(zztVar);
                    i5 = 2;
                } else {
                    if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzcc.zza("Unexpected MIME type.", null);
                    }
                    i5 = 3;
                }
                if (this.zza != null && !zzahy.zzg.containsKey(this.zza)) {
                    zzakVar.zzM(this.zza);
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac = zzakVar.zzac();
                zzaea zzw = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw;
                zzw.zzl(zzac);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                    str2 = zza.zza;
                    str5 = "video/dolby-vision";
                    break;
                }
                str3 = str5;
                int i92 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                    zzakVar.zzM(this.zza);
                    break;
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2 = zzakVar.zzac();
                zzaea zzw2 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2;
                zzw2.zzl(zzac2);
                return;
            case 2:
                str5 = "video/av01";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22 = zzakVar.zzac();
                zzaea zzw22 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22;
                zzw22.zzl(zzac22);
                return;
            case 3:
                str5 = "video/mpeg2";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222 = zzakVar.zzac();
                zzaea zzw222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222;
                zzw222.zzl(zzac222);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str5 = "video/mp4v-es";
                list = singletonList;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222 = zzakVar.zzac();
                zzaea zzw2222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222;
                zzw2222.zzl(zzac2222);
                return;
            case 7:
                zzabz zza2 = zzabz.zza(new zzfp(zzi(this.zzb)));
                list = zza2.zza;
                this.zzX = zza2.zzb;
                str = zza2.zzk;
                str5 = "video/avc";
                str2 = str;
                i2 = -1;
                i6 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222 = zzakVar.zzac();
                zzaea zzw22222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222;
                zzw22222.zzl(zzac22222);
                return;
            case '\b':
                zzadl zza3 = zzadl.zza(new zzfp(zzi(this.zzb)));
                list = zza3.zza;
                this.zzX = zza3.zzb;
                str = zza3.zzi;
                str5 = "video/hevc";
                str2 = str;
                i2 = -1;
                i6 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222 = zzakVar.zzac();
                zzaea zzw222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222;
                zzw222222.zzl(zzac222222);
                return;
            case '\t':
                Pair zzf = zzf(new zzfp(zzi(this.zzb)));
                str5 = (String) zzf.first;
                singletonList = (List) zzf.second;
                list = singletonList;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222 = zzakVar.zzac();
                zzaea zzw2222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222;
                zzw2222222.zzl(zzac2222222);
                return;
            case '\n':
                str5 = "video/x-unknown";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222222 = zzakVar.zzac();
                zzaea zzw22222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222222;
                zzw22222222.zzl(zzac22222222);
                return;
            case 11:
                zzg = zzg(zzi(str4));
                i3 = 8192;
                str5 = "audio/vorbis";
                list = zzg;
                i6 = -1;
                i2 = i3;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222 = zzakVar.zzac();
                zzaea zzw222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222;
                zzw222222222.zzl(zzac222222222);
                return;
            case '\f':
                zzg = new ArrayList(3);
                zzg.add(zzi(this.zzb));
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzR).array());
                zzg.add(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzS).array());
                i3 = 5760;
                str5 = "audio/opus";
                list = zzg;
                i6 = -1;
                i2 = i3;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222222 = zzakVar.zzac();
                zzaea zzw2222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222222;
                zzw2222222222.zzl(zzac2222222222);
                return;
            case '\r':
                List singletonList2 = Collections.singletonList(zzi(str4));
                zzabr zza4 = zzabs.zza(this.zzj);
                this.zzQ = zza4.zza;
                this.zzO = zza4.zzb;
                str5 = "audio/mp4a-latm";
                str2 = zza4.zzc;
                i6 = -1;
                list = singletonList2;
                i2 = -1;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222222222 = zzakVar.zzac();
                zzaea zzw22222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222222222;
                zzw22222222222.zzl(zzac22222222222);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                i6 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222222 = zzakVar.zzac();
                zzaea zzw222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222222;
                zzw222222222222.zzl(zzac222222222222);
                return;
            case 15:
                str5 = "audio/mpeg";
                i6 = -1;
                i2 = 4096;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222222222 = zzakVar.zzac();
                zzaea zzw2222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222222222;
                zzw2222222222222.zzl(zzac2222222222222);
                return;
            case 16:
                str5 = "audio/ac3";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222222222222 = zzakVar.zzac();
                zzaea zzw22222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222222222222;
                zzw22222222222222.zzl(zzac22222222222222);
                return;
            case 17:
                str5 = "audio/eac3";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222222222 = zzakVar.zzac();
                zzaea zzw222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222222222;
                zzw222222222222222.zzl(zzac222222222222222);
                return;
            case 18:
                this.zzT = new zzaeb();
                str5 = "audio/true-hd";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222222222222 = zzakVar.zzac();
                zzaea zzw2222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222222222222;
                zzw2222222222222222.zzl(zzac2222222222222222);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222222222222222 = zzakVar.zzac();
                zzaea zzw22222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222222222222222;
                zzw22222222222222222.zzl(zzac22222222222222222);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222222222222 = zzakVar.zzac();
                zzaea zzw222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222222222222;
                zzw222222222222222222.zzl(zzac222222222222222222);
                return;
            case 22:
                singletonList = Collections.singletonList(zzi(str4));
                str5 = "audio/flac";
                list = singletonList;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222222222222222 = zzakVar.zzac();
                zzaea zzw2222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222222222222222;
                zzw2222222222222222222.zzl(zzac2222222222222222222);
                return;
            case 23:
                if (zzh(new zzfp(zzi(this.zzb)))) {
                    i6 = zzfy.zzk(this.zzP);
                    if (i6 == 0) {
                        zzff.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    }
                    i2 = -1;
                    list = null;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                    zzakVar = new zzak();
                    if (!zzcb.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzakVar.zzJ(i);
                    zzakVar.zzW(str3);
                    zzakVar.zzO(i2);
                    zzakVar.zzN(this.zzZ);
                    zzakVar.zzY(i922222222222222222222);
                    zzakVar.zzL(list);
                    zzakVar.zzz(str2);
                    zzakVar.zzE(this.zzk);
                    zzam zzac22222222222222222222 = zzakVar.zzac();
                    zzaea zzw22222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                    this.zzW = zzw22222222222222222222;
                    zzw22222222222222222222.zzl(zzac22222222222222222222);
                    return;
                }
                zzff.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                i2 = -1;
                i6 = -1;
                str5 = "audio/x-unknown";
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222222222222222 = zzakVar.zzac();
                zzaea zzw222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222222222222222;
                zzw222222222222222222222.zzl(zzac222222222222222222222);
                return;
            case 24:
                i6 = zzfy.zzk(this.zzP);
                if (i6 == 0) {
                    zzff.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    i6 = -1;
                    str5 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i92222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                    zzakVar = new zzak();
                    if (!zzcb.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzakVar.zzJ(i);
                    zzakVar.zzW(str3);
                    zzakVar.zzO(i2);
                    zzakVar.zzN(this.zzZ);
                    zzakVar.zzY(i92222222222222222222222);
                    zzakVar.zzL(list);
                    zzakVar.zzz(str2);
                    zzakVar.zzE(this.zzk);
                    zzam zzac2222222222222222222222 = zzakVar.zzac();
                    zzaea zzw2222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                    this.zzW = zzw2222222222222222222222;
                    zzw2222222222222222222222.zzl(zzac2222222222222222222222);
                    return;
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222222222222222222222 = zzakVar.zzac();
                zzaea zzw22222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222222222222222222222;
                zzw22222222222222222222222.zzl(zzac22222222222222222222222);
                return;
            case 25:
                int i12 = this.zzP;
                if (i12 == 8) {
                    i6 = 3;
                } else if (i12 == 16) {
                    i6 = 268435456;
                } else if (i12 == 24) {
                    i6 = 1342177280;
                } else {
                    if (i12 != 32) {
                        zzff.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i12 + ". Setting mimeType to audio/x-unknown");
                        i2 = -1;
                        i6 = -1;
                        str5 = "audio/x-unknown";
                        list = null;
                        str2 = null;
                        if (this.zzN != null) {
                        }
                        str3 = str5;
                        int i9222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                        zzakVar = new zzak();
                        if (!zzcb.zzg(str3)) {
                        }
                        if (this.zza != null) {
                        }
                        zzakVar.zzJ(i);
                        zzakVar.zzW(str3);
                        zzakVar.zzO(i2);
                        zzakVar.zzN(this.zzZ);
                        zzakVar.zzY(i9222222222222222222222222);
                        zzakVar.zzL(list);
                        zzakVar.zzz(str2);
                        zzakVar.zzE(this.zzk);
                        zzam zzac222222222222222222222222 = zzakVar.zzac();
                        zzaea zzw222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                        this.zzW = zzw222222222222222222222222;
                        zzw222222222222222222222222.zzl(zzac222222222222222222222222);
                        return;
                    }
                    i6 = 1610612736;
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222222222222222222222 = zzakVar.zzac();
                zzaea zzw2222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222222222222222222222;
                zzw2222222222222222222222222.zzl(zzac2222222222222222222222222);
                return;
            case 26:
                int i13 = this.zzP;
                if (i13 != 32) {
                    zzff.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i13 + ". Setting mimeType to audio/x-unknown");
                    i2 = -1;
                    i6 = -1;
                    str5 = "audio/x-unknown";
                    list = null;
                    str2 = null;
                    if (this.zzN != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                    zzakVar = new zzak();
                    if (!zzcb.zzg(str3)) {
                    }
                    if (this.zza != null) {
                    }
                    zzakVar.zzJ(i);
                    zzakVar.zzW(str3);
                    zzakVar.zzO(i2);
                    zzakVar.zzN(this.zzZ);
                    zzakVar.zzY(i922222222222222222222222222);
                    zzakVar.zzL(list);
                    zzakVar.zzz(str2);
                    zzakVar.zzE(this.zzk);
                    zzam zzac22222222222222222222222222 = zzakVar.zzac();
                    zzaea zzw22222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                    this.zzW = zzw22222222222222222222222222;
                    zzw22222222222222222222222222.zzl(zzac22222222222222222222222222);
                    return;
                }
                i2 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222222222222222222222 = zzakVar.zzac();
                zzaea zzw222222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222222222222222222222;
                zzw222222222222222222222222222.zzl(zzac222222222222222222222222222);
                return;
            case 27:
                i2 = -1;
                i6 = -1;
                str5 = "application/x-subrip";
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222222222222222222222222 = zzakVar.zzac();
                zzaea zzw2222222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222222222222222222222222;
                zzw2222222222222222222222222222.zzl(zzac2222222222222222222222222222);
                return;
            case 28:
                list = zzgaa.zzn(zzahy.zzc, zzi(this.zzb));
                i2 = -1;
                i6 = -1;
                str5 = "text/x-ssa";
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222222222222222222222222222 = zzakVar.zzac();
                zzaea zzw22222222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222222222222222222222222222;
                zzw22222222222222222222222222222.zzl(zzac22222222222222222222222222222);
                return;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                str5 = "text/vtt";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222222222222222222222222 = zzakVar.zzac();
                zzaea zzw222222222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222222222222222222222222;
                zzw222222222222222222222222222222.zzl(zzac222222222222222222222222222222);
                return;
            case 30:
                singletonList = zzgaa.zzm(zzi(str4));
                str5 = "application/vobsub";
                list = singletonList;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i92222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i92222222222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac2222222222222222222222222222222 = zzakVar.zzac();
                zzaea zzw2222222222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw2222222222222222222222222222222;
                zzw2222222222222222222222222222222.zzl(zzac2222222222222222222222222222222);
                return;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                str5 = "application/pgs";
                i2 = -1;
                i6 = -1;
                list = null;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i922222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i922222222222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac22222222222222222222222222222222 = zzakVar.zzac();
                zzaea zzw22222222222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw22222222222222222222222222222222;
                zzw22222222222222222222222222222222.zzl(zzac22222222222222222222222222222222);
                return;
            case ' ':
                byte[] bArr3 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr3, 0, 4);
                singletonList = zzgaa.zzm(bArr3);
                str5 = "application/dvbsubs";
                list = singletonList;
                i2 = -1;
                i6 = -1;
                str2 = null;
                if (this.zzN != null) {
                }
                str3 = str5;
                int i9222222222222222222222222222222222 = (this.zzV ? 1 : 0) | (true == this.zzU ? 0 : 2);
                zzakVar = new zzak();
                if (!zzcb.zzg(str3)) {
                }
                if (this.zza != null) {
                }
                zzakVar.zzJ(i);
                zzakVar.zzW(str3);
                zzakVar.zzO(i2);
                zzakVar.zzN(this.zzZ);
                zzakVar.zzY(i9222222222222222222222222222222222);
                zzakVar.zzL(list);
                zzakVar.zzz(str2);
                zzakVar.zzE(this.zzk);
                zzam zzac222222222222222222222222222222222 = zzakVar.zzac();
                zzaea zzw222222222222222222222222222222222 = zzacxVar.zzw(this.zzc, i5);
                this.zzW = zzw222222222222222222222222222222222;
                zzw222222222222222222222222222222222.zzl(zzac222222222222222222222222222222222);
                return;
            default:
                throw zzcc.zza("Unrecognized codec identifier.", null);
        }
    }
}
