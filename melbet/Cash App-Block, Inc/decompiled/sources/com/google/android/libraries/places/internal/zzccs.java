package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import okio.Buffer$outputStream$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzccs {
    public final zzbuq zza;
    public zzcig zzc;
    public int zzd;
    public final zzcih zzh;
    public final zzcgh zzi;
    public boolean zzj;
    public int zzk;
    public long zzm;
    public int zzb = -1;
    public zzbpl zze = zzbpk.zza;
    public final Buffer$outputStream$1 zzf = new Buffer$outputStream$1(this, 1);
    public final ByteBuffer zzg = ByteBuffer.allocate(5);

    public zzccs(zzbuq zzbuqVar, zzcih zzcihVar, zzcgh zzcghVar) {
        this.zza = zzbuqVar;
        this.zzh = zzcihVar;
        this.zzi = zzcghVar;
    }

    public static int zzj(zzcjz zzcjzVar, OutputStream outputStream) {
        zzbhz zzbhzVar = zzcjzVar.zza;
        if (zzbhzVar != null) {
            int zzbD = ((zzbjr) zzbhzVar).zzbD();
            zzbhz zzbhzVar2 = zzcjzVar.zza;
            zzbhzVar2.getClass();
            zzbjr zzbjrVar = (zzbjr) zzbhzVar2;
            int zzbD2 = zzbjrVar.zzbD();
            boolean z = zzbiv.zzc;
            if (zzbD2 > 4096) {
                zzbD2 = 4096;
            }
            zzbiu zzbiuVar = new zzbiu(outputStream, zzbD2);
            zzbjrVar.zzbR(zzbiuVar);
            if (zzbiuVar.zze > 0) {
                zzbiuVar.zzM();
            }
            zzcjzVar.zza = null;
            return zzbD;
        }
        ByteArrayInputStream byteArrayInputStream = zzcjzVar.zzc;
        if (byteArrayInputStream == null) {
            return 0;
        }
        zzbjc zzbjcVar = zzckb.zza;
        Trace.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        long j = 0;
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read == -1) {
                int i = (int) j;
                zzcjzVar.zzc = null;
                return i;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public final void zza(zzcjz zzcjzVar) {
        zzcgh zzcghVar;
        int zzj;
        zzbub[] zzbubVarArr;
        if (this.zzj) {
            a$$ExternalSyntheticBUOutline0.m$1("Framer already closed");
            return;
        }
        this.zzk++;
        this.zzm = 0L;
        int i = 0;
        while (true) {
            zzcghVar = this.zzi;
            zzbub[] zzbubVarArr2 = zzcghVar.zza;
            if (i >= zzbubVarArr2.length) {
                break;
            }
            zzbub zzbubVar = zzbubVarArr2[i];
            i++;
        }
        zzbpl zzbplVar = this.zze;
        zzbpk zzbpkVar = zzbpk.zza;
        try {
            int available = zzcjzVar.available();
            if (available != 0 && zzbplVar != zzbpkVar) {
                zzccp zzccpVar = new zzccp(this);
                OutputStream zzb = this.zze.zzb(zzccpVar);
                try {
                    zzj = zzj(zzcjzVar, zzb);
                    zzb.close();
                    int i2 = this.zzb;
                    if (i2 >= 0 && zzj > i2) {
                        zzbtx zzbtxVar = zzbtx.zzf;
                        Locale locale = Locale.US;
                        throw new zzbua(zzbtxVar.zze("message too large " + zzj + " > " + i2));
                    }
                    zzi(zzccpVar, true);
                } catch (Throwable th) {
                    zzb.close();
                    throw th;
                }
            } else if (available != -1) {
                this.zzm = available;
                int i3 = this.zzb;
                if (i3 >= 0 && available > i3) {
                    zzbtx zzbtxVar2 = zzbtx.zzf;
                    Locale locale2 = Locale.US;
                    throw new zzbua(zzbtxVar2.zze("message too large " + available + " > " + i3));
                }
                ByteBuffer byteBuffer = this.zzg;
                byteBuffer.clear();
                byteBuffer.put((byte) 0).putInt(available);
                this.zzd = available + 5;
                zzk(0, byteBuffer.position(), byteBuffer.array());
                zzj = zzj(zzcjzVar, this.zzf);
            } else {
                zzccp zzccpVar2 = new zzccp(this);
                zzj = zzj(zzcjzVar, zzccpVar2);
                zzi(zzccpVar2, false);
            }
            if (available != -1 && zzj != available) {
                throw new zzbua(zzbtx.zzh.zze(Recorder$$ExternalSyntheticOutline2.m("Message length inaccurate ", zzj, available, " != ")));
            }
            int i4 = 0;
            while (true) {
                zzbubVarArr = zzcghVar.zza;
                if (i4 >= zzbubVarArr.length) {
                    break;
                }
                zzbub zzbubVar2 = zzbubVarArr[i4];
                i4++;
            }
            long j = this.zzm;
            for (zzbub zzbubVar3 : zzbubVarArr) {
                zzbubVar3.zza(j);
            }
            for (zzbub zzbubVar4 : zzbubVarArr) {
            }
        } catch (zzbua e) {
            throw e;
        } catch (IOException e2) {
            throw new zzbua(zzbtx.zzh.zze("Failed to frame message").zzd(e2));
        } catch (RuntimeException e3) {
            throw new zzbua(zzbtx.zzh.zze("Failed to frame message").zzd(e3));
        }
    }

    public final void zzi(zzccp zzccpVar, boolean z) {
        ArrayList arrayList = zzccpVar.zzb;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzcig) it.next()).zzc;
        }
        int i2 = this.zzb;
        if (i2 >= 0 && i > i2) {
            zzbtx zzbtxVar = zzbtx.zzf;
            Locale locale = Locale.US;
            throw new zzbua(zzbtxVar.zze("message too large " + i + " > " + i2));
        }
        ByteBuffer byteBuffer = this.zzg;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(i);
        this.zzh.getClass();
        zzcig zza = zzcih.zza(5);
        zza.zza(0, byteBuffer.position(), byteBuffer.array());
        if (i == 0) {
            this.zzc = zza;
            return;
        }
        int i3 = this.zzk - 1;
        zzbuq zzbuqVar = this.zza;
        zzbuqVar.zzj(zza, false, false, i3);
        this.zzk = 1;
        for (int i4 = 0; i4 < arrayList.size() - 1; i4++) {
            zzbuqVar.zzj((zzcig) arrayList.get(i4), false, false, 0);
        }
        this.zzc = (zzcig) arrayList.get(arrayList.size() - 1);
        this.zzm = i;
    }

    public final void zzk(int i, int i2, byte[] bArr) {
        while (i2 > 0) {
            zzcig zzcigVar = this.zzc;
            if (zzcigVar != null && zzcigVar.zzb == 0) {
                this.zzc = null;
                this.zza.zzj(zzcigVar, false, false, this.zzk);
                this.zzk = 0;
            }
            if (this.zzc == null) {
                Trace.checkState("knownLengthPendingAllocation reached 0", this.zzd > 0);
                int i3 = this.zzd;
                this.zzh.getClass();
                zzcig zza = zzcih.zza(i3);
                this.zzc = zza;
                int i4 = this.zzd;
                this.zzd = i4 - Math.min(i4, zza.zzb);
            }
            int min = Math.min(i2, this.zzc.zzb);
            this.zzc.zza(i, min, bArr);
            i += min;
            i2 -= min;
        }
    }
}
