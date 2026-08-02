package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import com.google.android.gms.cloudmessaging.zzv;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* loaded from: classes4.dex */
public final class zzcho {
    public static final zzbsl zzb$1 = zzbrc.zza(":status", new zzbzi());
    public final /* synthetic */ zzchp zza;
    public final zzcgh zza$1;
    public final int zzb;
    public boolean zzb$2;
    public final Object zzc;
    public zzbtx zzc$1;
    public zzbvt zzc$2;
    public ArrayList zzd;
    public zzbsn zzd$1;
    public zzbqb zzd$2;
    public final zzclo zze;
    public Charset zze$1;
    public boolean zze$2;
    public boolean zzf;
    public boolean zzf$1;
    public zzbuo zzf$2;
    public boolean zzg;
    public volatile boolean zzg$1;
    public boolean zzh;
    public boolean zzh$1;
    public int zzi;
    public boolean zzi$1;
    public int zzj;
    public final zzche zzk;
    public final zzv zzl;
    public final zzchy zzm;
    public boolean zzn;
    public zzcij zzp;
    public int zzq;
    public zzcco zzr;
    public final Object zzs;
    public final zzcgr zzt;
    public final zzcco zzu;
    public int zzv;
    public boolean zzw;
    public boolean zzx;
    public final int zzy;

    public zzcho(zzchp zzchpVar, int i, zzcgh zzcghVar, Object obj, zzche zzcheVar, zzv zzvVar, zzchy zzchyVar, int i2) {
        this.zza = zzchpVar;
        zzcgr zzcgrVar = ((zzbuq) zzchpVar).zzc;
        this.zzs = new Object();
        Trace.checkNotNull(zzcgrVar, "transportTracer");
        this.zzt = zzcgrVar;
        zzcco zzccoVar = new zzcco(this, zzbpk.zza, i, zzcghVar, zzcgrVar);
        this.zzu = zzccoVar;
        this.zzr = zzccoVar;
        this.zzy = 32768;
        this.zzd$2 = zzbqb.zzb;
        this.zze$2 = false;
        this.zza$1 = zzcghVar;
        this.zze$1 = StandardCharsets.UTF_8;
        this.zze = new zzclo();
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzn = true;
        this.zzq = -1;
        Trace.checkNotNull(obj, "lock");
        this.zzc = obj;
        this.zzk = zzcheVar;
        this.zzl = zzvVar;
        this.zzm = zzchyVar;
        this.zzi = i2;
        this.zzj = i2;
        this.zzb = i2;
        int i3 = zzclf.$r8$clinit;
    }

    public static Charset zzF(zzbsn zzbsnVar) {
        String str = (String) zzbsnVar.zzb(zzbzg.zzg);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.UTF_8;
    }

    public final void zzD(int i) {
        int i2 = this.zzj - i;
        this.zzj = i2;
        int i3 = this.zzb;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.zzi += i4;
            this.zzj = i2 + i4;
            this.zzk.zzk(this.zzq, i4);
        }
    }

    public final void zzG(ArrayList arrayList, boolean z) {
        zzbtx zzf;
        zzbsl zzbslVar = zzb$1;
        if (z) {
            byte[][] zzc = zzcin.zzc(arrayList);
            int length = zzc.length >> 1;
            zzbsn zzbsnVar = new zzbsn();
            zzbsnVar.zze = length;
            zzbsnVar.zzd = zzc;
            zzbtx zzbtxVar = this.zzc$1;
            if (zzbtxVar == null && !this.zzf$1) {
                zzbtxVar = zzH(zzbsnVar);
                this.zzc$1 = zzbtxVar;
                if (zzbtxVar != null) {
                    this.zzd$1 = zzbsnVar;
                }
            }
            if (zzbtxVar != null) {
                zzbtx zzf2 = zzbtxVar.zzf("trailers: ".concat(zzbsnVar.toString()));
                this.zzc$1 = zzf2;
                zzP(zzf2, false, this.zzd$1);
                return;
            }
            zzbsl zzbslVar2 = zzbre.zzb;
            zzbtx zzbtxVar2 = (zzbtx) zzbsnVar.zzb(zzbslVar2);
            if (zzbtxVar2 != null) {
                zzf = zzbtxVar2.zze((String) zzbsnVar.zzb(zzbre.zza));
            } else if (this.zzf$1) {
                zzf = zzbtx.zzc.zze("missing GRPC status in response");
            } else {
                Integer num = (Integer) zzbsnVar.zzb(zzbslVar);
                zzf = (num != null ? zzbzg.zza(num.intValue()) : zzbtx.zzh.zze("missing HTTP status code")).zzf("missing GRPC status, inferred error from HTTP status code");
            }
            zzbsnVar.zzd(zzbslVar);
            zzbsnVar.zzd(zzbslVar2);
            zzbsnVar.zzd(zzbre.zza);
            if (this.zzh$1) {
                Logger logger = zzbuq.zzb;
                zzbuq.zzb.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundTrailersReceived", "Received trailers on closed stream:\n {1}\n {2}", new Object[]{zzf, zzbsnVar});
                return;
            }
            int i = 0;
            while (true) {
                zzbub[] zzbubVarArr = this.zza$1.zza;
                if (i >= zzbubVarArr.length) {
                    zzg(zzf, zzbvs.zza, false, zzbsnVar);
                    return;
                } else {
                    i++;
                }
            }
        } else {
            byte[][] zzc2 = zzcin.zzc(arrayList);
            int length2 = zzc2.length >> 1;
            zzbsn zzbsnVar2 = new zzbsn();
            zzbsnVar2.zze = length2;
            zzbsnVar2.zzd = zzc2;
            zzbtx zzbtxVar3 = this.zzc$1;
            if (zzbtxVar3 != null) {
                this.zzc$1 = zzbtxVar3.zzf("headers: ".concat(zzbsnVar2.toString()));
                return;
            }
            try {
                if (this.zzf$1) {
                    this.zzc$1 = zzbtx.zzh.zze("Received headers twice");
                } else {
                    Integer num2 = (Integer) zzbsnVar2.zzb(zzbslVar);
                    if (num2 == null || num2.intValue() < 100 || num2.intValue() >= 200) {
                        this.zzf$1 = true;
                        zzbtx zzH = zzH(zzbsnVar2);
                        this.zzc$1 = zzH;
                        if (zzH != null) {
                            this.zzc$1 = zzH.zzf("headers: ".concat(zzbsnVar2.toString()));
                            this.zzd$1 = zzbsnVar2;
                            this.zze$1 = zzF(zzbsnVar2);
                            return;
                        } else {
                            zzbsnVar2.zzd(zzbslVar);
                            zzbsnVar2.zzd(zzbre.zzb);
                            zzbsnVar2.zzd(zzbre.zza);
                            zzd(zzbsnVar2);
                        }
                    }
                }
                zzbtx zzbtxVar4 = this.zzc$1;
                if (zzbtxVar4 != null) {
                    this.zzc$1 = zzbtxVar4.zzf("headers: ".concat(zzbsnVar2.toString()));
                    this.zzd$1 = zzbsnVar2;
                    this.zze$1 = zzF(zzbsnVar2);
                }
            } finally {
            }
        }
    }

    public final void zzH(int i, zzclo zzcloVar, boolean z) {
        Throwable th;
        boolean z2;
        int i2 = this.zzi - (((int) zzcloVar.zzb) + i);
        this.zzi = i2;
        this.zzj -= i;
        zzbvs zzbvsVar = zzbvs.zza;
        if (i2 < 0) {
            this.zzk.zzb(this.zzq, zzcje.FLOW_CONTROL_ERROR);
            this.zzm.zzo(this.zzq, zzbtx.zzh.zze("Received data size exceeded our receiving window size"), zzbvsVar, false, null, null);
            return;
        }
        zzcie zzcieVar = new zzcie(zzcloVar);
        zzbtx zzbtxVar = this.zzc$1;
        zzclo zzcloVar2 = zzcieVar.zza;
        boolean z3 = false;
        if (zzbtxVar != null) {
            Charset charset = this.zze$1;
            zzcdw zzcdwVar = zzcdx.zzb;
            Trace.checkNotNull(charset, "charset");
            int i3 = (int) zzcloVar2.zzb;
            byte[] bArr = new byte[i3];
            zzcieVar.zzi(0, i3, bArr);
            this.zzc$1 = zzbtxVar.zzf("DATA-----------------------------\n".concat(new String(bArr, charset)));
            zzcieVar.close();
            if (this.zzc$1.zzo.length() > 1000 || z) {
                zzP(this.zzc$1, false, this.zzd$1);
                return;
            }
            return;
        }
        if (!this.zzf$1) {
            zzcieVar.close();
            zzP(zzbtx.zzh.zze("headers not received before payload"), false, new zzbsn());
            return;
        }
        int i4 = (int) zzcloVar2.zzb;
        try {
            if (this.zzh$1) {
                zzbuq.zzb.logp(Level.INFO, "io.grpc.internal.AbstractClientStream$TransportState", "inboundDataReceived", "Received data on closed stream");
                zzcieVar.close();
            } else {
                try {
                    zzcco zzccoVar = this.zzr;
                    zzccoVar.getClass();
                    try {
                        zzbwd zzbwdVar = zzccoVar.zzi;
                        if (zzbwdVar != null && !zzccoVar.zzn) {
                            zzbwdVar.zze(zzcieVar);
                            try {
                                zzccoVar.zzi();
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = false;
                                if (z2) {
                                    zzcieVar.close();
                                }
                                throw th;
                            }
                        }
                        zzcieVar.close();
                    } catch (Throwable th3) {
                        th = th3;
                        z2 = true;
                    }
                } catch (Throwable th4) {
                    try {
                        zzP(zzbtx.zzb(th4), true, new zzbsn());
                    } catch (Throwable th5) {
                        th = th5;
                        if (!z3) {
                            throw th;
                        }
                        zzcieVar.close();
                        throw th;
                    }
                }
            }
            if (z) {
                if (i4 > 0) {
                    this.zzc$1 = zzbtx.zzh.zze("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.zzc$1 = zzbtx.zzh.zze("Received unexpected EOS on empty DATA frame from server");
                }
                zzbsn zzbsnVar = new zzbsn();
                this.zzd$1 = zzbsnVar;
                zzg(this.zzc$1, zzbvsVar, false, zzbsnVar);
            }
        } catch (Throwable th6) {
            th = th6;
            z3 = true;
        }
    }

    public final void zzM(zzclo zzcloVar, boolean z, boolean z2) {
        if (this.zzh) {
            return;
        }
        if (!this.zzn) {
            Trace.checkState("streamId should be set", this.zzq != -1);
            this.zzl.zzc(z, this.zzp, zzcloVar, z2);
        } else {
            this.zze.zzc(zzcloVar, (int) zzcloVar.zzb);
            this.zzf |= z;
            this.zzg |= z2;
        }
    }

    public final void zzN(zzbsn zzbsnVar, String str) {
        int i;
        zzbtx zzbtxVar;
        zzchy zzchyVar = this.zzm;
        int i2 = 0;
        boolean z = zzchyVar.zzJ == null;
        zzcji zzcjiVar = zzchg.zza;
        Trace.checkNotNull(zzbsnVar, "headers");
        zzchp zzchpVar = this.zza;
        String str2 = zzchpVar.zzf;
        zzcho zzchoVar = zzchpVar.zzg;
        Trace.checkNotNull(str2, "authority");
        zzbsnVar.zzd(zzbzg.zzg);
        zzbsnVar.zzd(zzbzg.zzh);
        zzbsh zzbshVar = zzbzg.zzi;
        zzbsnVar.zzd(zzbshVar);
        ArrayList arrayList = new ArrayList(zzbsnVar.zze + 7);
        if (z) {
            arrayList.add(zzchg.zzb);
        } else {
            arrayList.add(zzchg.zza);
        }
        arrayList.add(zzchg.zzc);
        String str3 = zzchpVar.zzd;
        zzcls zzclsVar = zzcji.zze;
        zzcls zzclsVar2 = zzcls.zza;
        arrayList.add(new zzcji(zzclsVar, zzey.zza(str2)));
        arrayList.add(new zzcji(zzcji.zzc, zzey.zza(str)));
        arrayList.add(new zzcji(zzbshVar.zzd, str3));
        arrayList.add(zzchg.zze);
        arrayList.add(zzchg.zzf);
        Logger logger = zzcgn.zza;
        Charset charset = zzbrc.zza;
        int i3 = zzbsnVar.zze;
        int i4 = i3 + i3;
        byte[][] bArr = new byte[i4][];
        Object[] objArr = zzbsnVar.zzd;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i4);
        } else {
            for (int i5 = 0; i5 < zzbsnVar.zze; i5++) {
                Object[] objArr2 = zzbsnVar.zzd;
                int i6 = i5 + i5;
                bArr[i6] = (byte[]) objArr2[i6];
                int i7 = i6 + 1;
                Object obj = objArr2[i7];
                if (!(obj instanceof byte[])) {
                    throw Boxes$$ExternalSyntheticOutline1.m(obj);
                }
                bArr[i7] = (byte[]) obj;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < i4) {
            byte[] bArr2 = bArr[i8];
            byte[] bArr3 = bArr[i8 + 1];
            if (zzcgn.zzc(bArr2, zzcgn.zzb)) {
                bArr[i9] = bArr2;
                bArr[i9 + 1] = zzbrc.zzb.encode(bArr3).getBytes(StandardCharsets.US_ASCII);
                i9 += 2;
            } else {
                int length = bArr3.length;
                for (int i10 = i2; i10 < length; i10++) {
                    byte b = bArr3[i10];
                    if (b < 32 || b > 126) {
                        String str4 = new String(bArr2, StandardCharsets.US_ASCII);
                        Logger logger2 = zzcgn.zza;
                        Level level = Level.WARNING;
                        String arrays = Arrays.toString(bArr3);
                        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + str4.length() + 21 + 34);
                        Boxes$$ExternalSyntheticOutline1.m(sb, "Metadata key=", str4, ", value=", arrays);
                        sb.append(" contains invalid ASCII characters");
                        logger2.logp(level, "io.grpc.internal.TransportFrameUtil", "toHttp2Headers", sb.toString());
                        break;
                    }
                }
                bArr[i9] = bArr2;
                bArr[i9 + 1] = bArr3;
                i9 += 2;
            }
            i8 += 2;
            i2 = 0;
        }
        if (i9 == i4) {
            i = 0;
        } else {
            i = 0;
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i9);
        }
        for (int i11 = i; i11 < bArr.length; i11 += 2) {
            zzcls zzb = zzey.zzb(bArr[i11]);
            byte[] bArr4 = zzb.zzb;
            if (bArr4.length != 0 && bArr4[i] != 58) {
                arrayList.add(new zzcji(zzb, zzey.zzb(bArr[i11 + 1])));
            }
        }
        this.zzd = arrayList;
        String str5 = zzchpVar.zzf;
        boolean z2 = zzchy.zza;
        zzbtx zzbtxVar2 = zzchyVar.zzD;
        if (zzbtxVar2 != null) {
            zzchoVar.zzg(zzbtxVar2, zzbvs.zzd, true, new zzbsn());
            return;
        }
        if ((zzchyVar.zzL instanceof SSLSocket) && !str5.equals(zzchyVar.zzj)) {
            zzchx zzchxVar = zzchyVar.zzT;
            if (zzchxVar.containsKey(str5)) {
                zzbtxVar = (zzbtx) zzchxVar.get(str5);
            } else {
                zzbtx zze = zzchyVar.zzK.verify(str5, ((SSLSocket) zzchyVar.zzL).getSession()) ? zzbtx.zza : zzbtx.zzi.zze("HostNameVerifier verification failed for authority '" + str5 + "'");
                if (!zze.zzj() && !z2) {
                    zzchy.zzf.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport", "verifyAuthority", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HostNameVerifier verification failed for authority '", str5, "'. This will be an error in the future."));
                }
                if (zze.zzj()) {
                    zze = zzbtx.zzi.zze("Could not verify authority '" + str5 + "' for the rpc with no X509TrustManager available");
                }
                zzchxVar.put(str5, zze);
                zzbtxVar = zze;
            }
            if (!zzbtxVar.zzj() && z2) {
                zzchoVar.zzg(zzbtxVar, zzbvs.zza, true, new zzbsn());
                return;
            }
        }
        if (zzchyVar.zzv.size() < zzchyVar.zzM) {
            zzchyVar.zzad(zzchpVar);
            return;
        }
        zzchyVar.zzN.add(zzchpVar);
        if (!zzchyVar.zzH) {
            zzchyVar.zzH = true;
        }
        if (((zzbuq) zzchpVar).zze) {
            zzchyVar.zzU.zza(zzchpVar, true);
        }
    }

    public final void zzP(zzbtx zzbtxVar, boolean z, zzbsn zzbsnVar) {
        if (this.zzh) {
            return;
        }
        this.zzh = true;
        boolean z2 = this.zzn;
        zzbvs zzbvsVar = zzbvs.zza;
        zzchy zzchyVar = this.zzm;
        if (!z2) {
            zzchyVar.zzo(this.zzq, zzbtxVar, zzbvsVar, z, zzcje.CANCEL, zzbsnVar);
            return;
        }
        LinkedList linkedList = zzchyVar.zzN;
        zzchp zzchpVar = this.zza;
        linkedList.remove(zzchpVar);
        zzchyVar.zzai(zzchpVar);
        this.zzd = null;
        zzclo zzcloVar = this.zze;
        zzcloVar.zzt(zzcloVar.zzb);
        this.zzn = false;
        if (zzbsnVar == null) {
            zzbsnVar = new zzbsn();
        }
        zzg(zzbtxVar, zzbvsVar, true, zzbsnVar);
    }

    public final boolean zza() {
        boolean z;
        synchronized (this.zzs) {
            try {
                z = false;
                if (this.zzw && this.zzv < this.zzy && !this.zzx) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final void zzc() {
        boolean zza;
        synchronized (this.zzs) {
            try {
                zza = zza();
                if (!zza) {
                    Logger logger = zzbuu.zza;
                    Level level = Level.FINEST;
                    if (logger.isLoggable(level)) {
                        logger.logp(level, "io.grpc.internal.AbstractStream$TransportState", "notifyIfReady", "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.zzw), Integer.valueOf(this.zzv), Integer.valueOf(this.zzy), Boolean.valueOf(this.zzx)});
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zza) {
            this.zzc$2.zzd();
        }
    }

    public final void zzd(zzbsn zzbsnVar) {
        Trace.checkState("Received headers on closed stream", !this.zzh$1);
        int i = 0;
        while (true) {
            zzbub[] zzbubVarArr = this.zza$1.zza;
            if (i >= zzbubVarArr.length) {
                break;
            }
            i++;
        }
        String str = (String) zzbsnVar.zzb(zzbzg.zzb);
        if (str != null) {
            zzbqa zzbqaVar = (zzbqa) this.zzd$2.zzc.get(str);
            zzbpl zzbplVar = zzbqaVar != null ? zzbqaVar.zza : null;
            if (zzbplVar == null) {
                zzP(zzbtx.zzb(new zzbua(zzbtx.zzh.zze("Can't find decompressor for ".concat(str)))), true, new zzbsn());
                return;
            } else if (zzbplVar != zzbpk.zza) {
                zzcco zzccoVar = this.zzr;
                zzccoVar.getClass();
                zzccoVar.zze = zzbplVar;
            }
        }
        this.zzc$2.zza(zzbsnVar);
    }

    public final void zzg(zzbtx zzbtxVar, zzbvs zzbvsVar, boolean z, zzbsn zzbsnVar) {
        Trace.checkNotNull(zzbtxVar, "status");
        if (this.zzh$1) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        this.zzh$1 = true;
        this.zzi$1 = zzbtxVar.zzj();
        synchronized (this.zzs) {
            this.zzx = true;
        }
        if (this.zze$2) {
            this.zzf$2 = null;
            zzz(zzbtxVar, zzbvsVar, zzbsnVar);
            return;
        }
        this.zzf$2 = new zzbuo(this, zzbtxVar, zzbvsVar, zzbsnVar, 0);
        zzcco zzccoVar = this.zzr;
        if (z) {
            zzccoVar.close();
            return;
        }
        zzbwd zzbwdVar = zzccoVar.zzi;
        if (zzbwdVar == null) {
            return;
        }
        if (zzbwdVar.zzc == 0) {
            zzccoVar.close();
        } else {
            zzccoVar.zzn = true;
        }
    }

    public final void zzz(zzbtx zzbtxVar, zzbvs zzbvsVar, zzbsn zzbsnVar) {
        if (this.zzb$2) {
            return;
        }
        this.zzb$2 = true;
        zzcgh zzcghVar = this.zza$1;
        if (zzcghVar.zzb.compareAndSet(false, true)) {
            for (zzbub zzbubVar : zzcghVar.zza) {
            }
        }
        if (this.zzt != null) {
            zzbtxVar.zzj();
        }
        this.zzc$2.zzc(zzbtxVar, zzbvsVar, zzbsnVar);
    }

    public static final zzbtx zzH(zzbsn zzbsnVar) {
        char charAt;
        Integer num = (Integer) zzbsnVar.zzb(zzb$1);
        if (num == null) {
            return zzbtx.zzh.zze("Missing HTTP status code");
        }
        String str = (String) zzbsnVar.zzb(zzbzg.zzg);
        if (str != null && str.length() >= 16) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return zzbzg.zza(num.intValue()).zzf("invalid content-type: ".concat(String.valueOf(str)));
    }
}
