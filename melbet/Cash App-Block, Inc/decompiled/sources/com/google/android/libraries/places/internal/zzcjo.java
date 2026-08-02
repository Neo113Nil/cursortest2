package com.google.android.libraries.places.internal;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.cloudmessaging.zzv;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final class zzcjo implements Closeable {
    public final zzcjj zza;
    public final zzcly zzb;
    public final zzcjm zzc;

    public zzcjo(zzcly zzclyVar) {
        this.zzb = zzclyVar;
        zzcjm zzcjmVar = new zzcjm(zzclyVar);
        this.zzc = zzcjmVar;
        this.zza = new zzcjj(zzcjmVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zzb.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(com.google.android.gms.cloudmessaging.zzh zzhVar) {
        int i;
        zzcje zzcjeVar;
        zzcly zzclyVar;
        Throwable th;
        char c;
        short s;
        zzcje zzcjeVar2;
        zzbtx zzbtxVar;
        boolean z;
        zzcij zzcijVar;
        try {
            this.zzb.zzg(9L);
            zzcly zzclyVar2 = this.zzb;
            int zzf = zzcjq.zzf(zzclyVar2);
            Throwable th2 = null;
            if (zzf > 16384) {
                zzcjq.zzi("FRAME_SIZE_ERROR: %s", Integer.valueOf(zzf));
                throw null;
            }
            byte zzj = (byte) (zzclyVar2.zzj() & 255);
            byte zzj2 = (byte) (zzclyVar2.zzj() & 255);
            int zzm = zzclyVar2.zzm() & Integer.MAX_VALUE;
            Logger logger = zzcjq.zza;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                i = Integer.MAX_VALUE;
                logger.logp(level, "io.grpc.okhttp.internal.framed.Http2$Reader", "nextFrame", zzcjn.zza(true, zzm, zzf, zzj, zzj2));
            } else {
                i = Integer.MAX_VALUE;
            }
            char c2 = '\b';
            switch (zzj) {
                case 0:
                    int i2 = zzj2 & 1;
                    if ((zzj2 & PnmConstants.PNM_SEPARATOR) != 0) {
                        zzcjq.zzi("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                        throw null;
                    }
                    int zzj3 = (zzj2 & 8) != 0 ? zzclyVar2.zzj() & 255 : 0;
                    zzhVar.zza(1 == i2, zzm, zzclyVar2, zzcjq.zze(zzf, zzj2, (short) zzj3), zzf);
                    zzclyVar2.zzt(zzj3);
                    return true;
                case 1:
                    if (zzm == 0) {
                        zzcjq.zzi("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                        throw null;
                    }
                    int i3 = zzj2 & 8;
                    int i4 = zzj2 & PnmConstants.PNM_SEPARATOR;
                    int i5 = zzj2 & 1;
                    int zzj4 = i3 != 0 ? zzclyVar2.zzj() & 255 : 0;
                    if (i4 != 0) {
                        zzcly zzclyVar3 = this.zzb;
                        zzclyVar3.zzm();
                        zzclyVar3.zzj();
                        zzf -= 5;
                    }
                    short s2 = (short) zzj4;
                    zzhVar.zzh(1 == i5, zzm, zzb(zzcjq.zze(zzf, zzj2, s2), s2, zzj2, zzm));
                    return true;
                case 2:
                    if (zzf != 5) {
                        zzcjq.zzi("TYPE_PRIORITY length: %d != 5", Integer.valueOf(zzf));
                        throw null;
                    }
                    if (zzm == 0) {
                        zzcjq.zzi("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    zzcly zzclyVar4 = this.zzb;
                    zzclyVar4.zzm();
                    zzclyVar4.zzj();
                    return true;
                case 3:
                    if (zzf != 4) {
                        zzcjq.zzi("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(zzf));
                        throw null;
                    }
                    if (zzm == 0) {
                        zzcjq.zzi("TYPE_RST_STREAM streamId == 0", new Object[0]);
                        throw null;
                    }
                    int zzm2 = zzclyVar2.zzm();
                    zzcje[] values = zzcje.values();
                    int length = values.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            zzcjeVar = values[i6];
                            if (zzcjeVar.zzs != zzm2) {
                                i6++;
                            }
                        } else {
                            zzcjeVar = null;
                        }
                    }
                    if (zzcjeVar != null) {
                        zzhVar.zzb(zzm, zzcjeVar);
                        return true;
                    }
                    zzcjq.zzi("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(zzm2));
                    throw null;
                case 4:
                    if (zzm != 0) {
                        zzcjq.zzi("TYPE_SETTINGS streamId != 0", new Object[0]);
                        throw null;
                    }
                    if ((zzj2 & 1) != 0) {
                        if (zzf != 0) {
                            zzcjq.zzi("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                            throw null;
                        }
                    } else {
                        if (zzf % 6 != 0) {
                            zzcjq.zzi("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(zzf));
                            throw null;
                        }
                        zzcjt zzcjtVar = new zzcjt();
                        int i7 = 0;
                        while (i7 < zzf) {
                            zzclyVar2.zzg(2L);
                            zzclo zzcloVar = zzclyVar2.zzb;
                            if (zzcloVar.zzb >= 2) {
                                zzclz zzclzVar = zzcloVar.zza;
                                zzclzVar.getClass();
                                int i8 = zzclzVar.zzb;
                                c = c2;
                                int i9 = zzclzVar.zzc;
                                if (i9 - i8 < 2) {
                                    s = (short) (((zzcloVar.zzj() & 255) << 8) | (zzcloVar.zzj() & 255));
                                    zzclyVar = zzclyVar2;
                                    th = th2;
                                } else {
                                    byte[] bArr = zzclzVar.zza;
                                    th = th2;
                                    int i10 = (bArr[i8] & 255) << 8;
                                    int i11 = bArr[i8 + 1] & 255;
                                    zzclyVar = zzclyVar2;
                                    zzcloVar.zzb -= 2;
                                    int i12 = i8 + 2;
                                    if (i12 == i9) {
                                        zzcloVar.zza = zzclzVar.zzb();
                                        zzcma.zzb(zzclzVar);
                                    } else {
                                        zzclzVar.zzb = i12;
                                    }
                                    s = (short) (i10 | i11);
                                }
                            } else {
                                zzclyVar = zzclyVar2;
                                th = th2;
                                c = c2;
                                Path$$ExternalSyntheticBUOutline0.m$1();
                                s = 0;
                            }
                            int zzm3 = zzclyVar.zzm();
                            switch (s) {
                                case 1:
                                case 6:
                                    if (s < 10) {
                                        zzcjtVar.zza = (1 << s) | zzcjtVar.zza;
                                        zzcjtVar.zzb[s] = zzm3;
                                    }
                                    i7 += 6;
                                    c2 = c;
                                    th2 = th;
                                    zzclyVar2 = zzclyVar;
                                case 2:
                                    if (zzm3 != 0 && zzm3 != 1) {
                                        zzcjq.zzi("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                        throw th;
                                    }
                                    if (s < 10) {
                                    }
                                    i7 += 6;
                                    c2 = c;
                                    th2 = th;
                                    zzclyVar2 = zzclyVar;
                                    break;
                                case 3:
                                    s = 4;
                                    if (s < 10) {
                                    }
                                    i7 += 6;
                                    c2 = c;
                                    th2 = th;
                                    zzclyVar2 = zzclyVar;
                                    break;
                                case 4:
                                    if (zzm3 < 0) {
                                        zzcjq.zzi("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                        throw th;
                                    }
                                    s = 7;
                                    if (s < 10) {
                                    }
                                    i7 += 6;
                                    c2 = c;
                                    th2 = th;
                                    zzclyVar2 = zzclyVar;
                                    break;
                                case 5:
                                    if (zzm3 < 16384 || zzm3 > 16777215) {
                                        zzcjq.zzi("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(zzm3));
                                        throw th;
                                    }
                                    if (s < 10) {
                                    }
                                    i7 += 6;
                                    c2 = c;
                                    th2 = th;
                                    zzclyVar2 = zzclyVar;
                                    break;
                                default:
                                    i7 += 6;
                                    c2 = c;
                                    th2 = th;
                                    zzclyVar2 = zzclyVar;
                            }
                        }
                        Throwable th3 = th2;
                        zzhVar.zzc(zzcjtVar);
                        int i13 = zzcjtVar.zza;
                        if (((i13 & 2) != 0 ? zzcjtVar.zzb[1] : -1) >= 0) {
                            zzcjj zzcjjVar = this.zza;
                            int i14 = (i13 & 2) != 0 ? zzcjtVar.zzb[1] : -1;
                            zzcjjVar.zzg = i14;
                            zzcjjVar.zzh = i14;
                            int i15 = zzcjjVar.zzd;
                            if (i14 < i15) {
                                if (i14 == 0) {
                                    Arrays.fill(zzcjjVar.zza, th3);
                                    zzcjjVar.zzb = zzcjjVar.zza.length - 1;
                                    zzcjjVar.zzc = 0;
                                    zzcjjVar.zzd = 0;
                                    return true;
                                }
                                zzcjjVar.zzh(i15 - i14);
                            }
                        }
                    }
                    return true;
                case 5:
                    if (zzm == 0) {
                        zzcjq.zzi("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                        throw null;
                    }
                    r2 = (zzj2 & 8) != 0 ? zzclyVar2.zzj() & 255 : 0;
                    int zzm4 = zzclyVar2.zzm() & i;
                    short s3 = (short) r2;
                    ArrayList zzb = zzb(zzcjq.zze(zzf - 4, zzj2, s3), s3, zzj2, zzm);
                    zbc zbcVar = (zbc) zzhVar.zzb;
                    if (zbcVar.zzl()) {
                        Logger logger2 = (Logger) zbcVar.zba;
                        Level level2 = (Level) zbcVar.zbb;
                        String obj = zzb.toString();
                        StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(String.valueOf(zzm).length() + 49, 9, String.valueOf(zzm4)) + obj.length());
                        Fragment$5$$ExternalSyntheticOutline0.m(zzm, zzm4, "INBOUND PUSH_PROMISE: streamId=", " promisedStreamId=", sb);
                        logger2.logp(level2, "io.grpc.okhttp.OkHttpFrameLogger", "logPushPromise", JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, " headers=", obj));
                    }
                    zzchy zzchyVar = (zzchy) zzhVar.zze;
                    synchronized (zzchyVar.zzs) {
                        zzchyVar.zzq.zzb(zzm, zzcje.PROTOCOL_ERROR);
                    }
                    return true;
                case 6:
                    if (zzf != 8) {
                        zzcjq.zzi("TYPE_PING length != 8: %s", Integer.valueOf(zzf));
                        throw null;
                    }
                    if (zzm != 0) {
                        zzcjq.zzi("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    r2 = 1 == (zzj2 & 1) ? 1 : 0;
                    int zzm5 = zzclyVar2.zzm();
                    int zzm6 = zzclyVar2.zzm();
                    zbc zbcVar2 = (zbc) zzhVar.zzb;
                    long j = (zzm5 << 32) | (zzm6 & BodyPartID.bodyIdMax);
                    if (zbcVar2.zzl()) {
                        Logger logger3 = (Logger) zbcVar2.zba;
                        Level level3 = (Level) zbcVar2.zbb;
                        String zza = zzjn.zza(1);
                        StringBuilder sb2 = new StringBuilder(zza.length() + 23 + String.valueOf(j).length());
                        sb2.append(zza);
                        sb2.append(" PING: ack=false bytes=");
                        sb2.append(j);
                        logger3.logp(level3, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb2.toString());
                    }
                    zzchy zzchyVar2 = (zzchy) zzhVar.zze;
                    if (r2 == 0) {
                        synchronized (zzchyVar2.zzs) {
                            zzchyVar2.zzq.zzc(zzm5, zzm6);
                        }
                        return true;
                    }
                    synchronized (zzchyVar2.zzs) {
                        zzchy.zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "ping", "Received unexpected ping ack. No ping outstanding");
                    }
                    return true;
                case 7:
                    if (zzf < 8) {
                        zzcjq.zzi("TYPE_GOAWAY length < 8: %s", Integer.valueOf(zzf));
                        throw null;
                    }
                    if (zzm != 0) {
                        zzcjq.zzi("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int i16 = zzf - 8;
                    int zzm7 = zzclyVar2.zzm();
                    int zzm8 = zzclyVar2.zzm();
                    zzcje[] values2 = zzcje.values();
                    int length2 = values2.length;
                    while (true) {
                        if (r2 < length2) {
                            zzcjeVar2 = values2[r2];
                            if (zzcjeVar2.zzs != zzm8) {
                                r2++;
                            }
                        } else {
                            zzcjeVar2 = null;
                        }
                    }
                    if (zzcjeVar2 == null) {
                        zzcjq.zzi("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(zzm8));
                        throw null;
                    }
                    zzcls zzclsVar = zzcls.zza;
                    if (i16 > 0) {
                        zzclsVar = zzclyVar2.zzn(i16);
                    }
                    zzchy zzchyVar3 = (zzchy) zzhVar.zze;
                    ((zbc) zzhVar.zzb).zzi(1, zzm7, zzcjeVar2, zzclsVar);
                    if (zzcjeVar2 == zzcje.ENHANCE_YOUR_CALM) {
                        String zze = zzclsVar.zze();
                        Map map = zzchy.zze;
                        zzchy.zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport$ClientFrameHandler", "goAway", zzhVar + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + zze);
                        if ("too_many_pings".equals(zze)) {
                            zzchyVar3.zzQ.run();
                        }
                    }
                    long j2 = zzcjeVar2.zzs;
                    zzbze[] zzbzeVarArr = zzbze.zzo;
                    zzbze zzbzeVar = (j2 >= ((long) zzbzeVarArr.length) || j2 < 0) ? null : zzbzeVarArr[(int) j2];
                    if (zzbzeVar == null) {
                        zzbtx zza2 = zzbtx.zza(zzbze.zzc.zzq.zzn.zzr);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(j2).length() + 32);
                        sb3.append("Unrecognized HTTP/2 error code: ");
                        sb3.append(j2);
                        zzbtxVar = zza2.zze(sb3.toString());
                    } else {
                        zzbtxVar = zzbzeVar.zzq;
                    }
                    zzbtx zzf2 = zzbtxVar.zzf("Received Goaway");
                    if (zzclsVar.zzj() > 0) {
                        zzf2 = zzf2.zzf(zzclsVar.zze());
                    }
                    zzchyVar3.zzag(zzm7, null, zzf2);
                    return true;
                case 8:
                    if (zzf != 4) {
                        zzcjq.zzi("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(zzf));
                        throw null;
                    }
                    long zzm9 = zzclyVar2.zzm() & 2147483647L;
                    if (zzm9 == 0) {
                        zzcjq.zzi("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    ((zbc) zzhVar.zzb).zzj(1, zzm, zzm9);
                    zzchy zzchyVar4 = (zzchy) zzhVar.zze;
                    synchronized (zzchyVar4.zzs) {
                        try {
                            if (zzm == 0) {
                                zzchyVar4.zzr.zzb(null, (int) zzm9);
                                return true;
                            }
                            zzchp zzchpVar = (zzchp) zzchyVar4.zzv.get(Integer.valueOf(zzm));
                            if (zzchpVar != null) {
                                zzv zzvVar = zzchyVar4.zzr;
                                zzcho zzchoVar = zzchpVar.zzg;
                                synchronized (zzchoVar.zzc) {
                                    zzcijVar = zzchoVar.zzp;
                                }
                                zzvVar.zzb(zzcijVar, (int) zzm9);
                            } else if (!zzchyVar4.zzp(zzm)) {
                                z = true;
                                if (z) {
                                    zzchy zzchyVar5 = (zzchy) zzhVar.zze;
                                    zzcje zzcjeVar3 = zzcje.PROTOCOL_ERROR;
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(zzm).length() + 43);
                                    sb4.append("Received window_update for unknown stream: ");
                                    sb4.append(zzm);
                                    String sb5 = sb4.toString();
                                    zzchyVar5.getClass();
                                    zzchyVar5.zzag(0, zzcjeVar3, zzchy.zzr(zzcjeVar3).zzf(sb5));
                                    return true;
                                }
                                return true;
                            }
                            z = false;
                            if (z) {
                            }
                            return true;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                default:
                    zzclyVar2.zzt(zzf);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$4(androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1.m(r9, "Invalid dynamic table size update ", new java.lang.StringBuilder(java.lang.String.valueOf(r9).length() + 34)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList zzb(int i, short s, byte b, int i2) {
        int zzd;
        zzcjm zzcjmVar = this.zzc;
        zzcjmVar.zzd = i;
        zzcjmVar.zza = i;
        zzcjmVar.zze = s;
        zzcjmVar.zzb = b;
        zzcjmVar.zzc = i2;
        zzcjj zzcjjVar = this.zza;
        ArrayList arrayList = zzcjjVar.zze;
        while (true) {
            zzcly zzclyVar = zzcjjVar.zzf;
            if (zzclyVar.zzc) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return null;
            }
            zzclo zzcloVar = zzclyVar.zzb;
            if (zzcloVar.zzb == 0 && zzclyVar.zza.zza(zzcloVar, 8192L) == -1) {
                ArrayList arrayList2 = zzcjjVar.zze;
                ArrayList arrayList3 = new ArrayList(arrayList2);
                arrayList2.clear();
                return arrayList3;
            }
            byte zzj = zzclyVar.zzj();
            int i3 = zzj & 255;
            if (i3 == 128) {
                a$$ExternalSyntheticBUOutline0.m$4("index == 0");
                return null;
            }
            if ((zzj & 128) == 128) {
                zzd = zzcjjVar.zzd(i3, 127);
                int i4 = zzd - 1;
                if (i4 >= 0) {
                    zzcji[] zzcjiVarArr = zzcjl.zzb;
                    int length = zzcjiVarArr.length;
                    if (i4 <= 60) {
                        arrayList.add(zzcjiVarArr[i4]);
                    }
                }
                int length2 = zzcjl.zzb.length;
                int i5 = zzcjjVar.zzb + 1 + (zzd - 62);
                if (i5 < 0) {
                    break;
                }
                zzcji[] zzcjiVarArr2 = zzcjjVar.zza;
                if (i5 > zzcjiVarArr2.length - 1) {
                    break;
                }
                arrayList.add(zzcjiVarArr2[i5]);
            } else if (i3 == 64) {
                zzcls zze = zzcjjVar.zze();
                zzcjl.zza(zze);
                zzcjjVar.zzk(new zzcji(zze, zzcjjVar.zze()));
            } else if ((zzj & 64) == 64) {
                zzcjjVar.zzk(new zzcji(zzcjjVar.zzj(zzcjjVar.zzd(i3, 63) - 1), zzcjjVar.zze()));
            } else if ((zzj & PnmConstants.PNM_SEPARATOR) == 32) {
                int zzd2 = zzcjjVar.zzd(i3, 31);
                zzcjjVar.zzh = zzd2;
                if (zzd2 < 0 || zzd2 > zzcjjVar.zzg) {
                    break;
                }
                int i6 = zzcjjVar.zzd;
                if (zzd2 < i6) {
                    if (zzd2 == 0) {
                        Arrays.fill(zzcjjVar.zza, (Object) null);
                        zzcjjVar.zzb = zzcjjVar.zza.length - 1;
                        zzcjjVar.zzc = 0;
                        zzcjjVar.zzd = 0;
                    } else {
                        zzcjjVar.zzh(i6 - zzd2);
                    }
                }
            } else if (i3 == 16 || i3 == 0) {
                zzcls zze2 = zzcjjVar.zze();
                zzcjl.zza(zze2);
                arrayList.add(new zzcji(zze2, zzcjjVar.zze()));
            } else {
                arrayList.add(new zzcji(zzcjjVar.zzj(zzcjjVar.zzd(i3, 15) - 1), zzcjjVar.zze()));
            }
        }
        a$$ExternalSyntheticBUOutline0.m$4(Boxes$$ExternalSyntheticOutline1.m(zzd, "Header index too large ", new StringBuilder(String.valueOf(zzd).length() + 23)));
        return null;
    }
}
