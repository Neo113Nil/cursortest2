package com.google.mlkit.vision.barcode.internal;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.fido.zzfz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.time.zzbw;
import com.google.firebase.messaging.SyncTask;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.BitmapInStreamingChecker;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.workflow1.internal.SubtreeManager;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.http1.HeadersReader;
import org.brotli.dec.HuffmanTreeGroup;

/* loaded from: classes4.dex */
public final class zzl extends MLTask {
    public static boolean zza = true;
    public final BarcodeScannerOptions zzc;
    public final zzm zzd;
    public final zzwp zze;
    public final zzbw zzf;
    public final BitmapInStreamingChecker zzg = new BitmapInStreamingChecker();
    public boolean zzh;

    public zzl(MlKitContext mlKitContext, BarcodeScannerOptions barcodeScannerOptions, zzm zzmVar, zzwp zzwpVar) {
        zzae.checkNotNull(mlKitContext, "MlKitContext can not be null");
        zzae.checkNotNull(barcodeScannerOptions, "BarcodeScannerOptions can not be null");
        this.zzc = barcodeScannerOptions;
        this.zzd = zzmVar;
        this.zze = zzwpVar;
        this.zzf = new zzbw(mlKitContext.getApplicationContext(), 1);
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final synchronized void load() {
        this.zzh = this.zzd.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final synchronized void release() {
        try {
            this.zzd.zzb();
            zza = true;
            SubtreeManager subtreeManager = new SubtreeManager();
            zzra zzraVar = this.zzh ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            zzwp zzwpVar = this.zze;
            subtreeManager.emitActionToParent = zzraVar;
            JWECryptoParts jWECryptoParts = new JWECryptoParts();
            jWECryptoParts.encryptedKey = zzb.zzc(this.zzc);
            subtreeManager.workflowSession = new zzrr(jWECryptoParts);
            com.google.mlkit.common.sdkinternal.zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzwpVar, (Object) new HuffmanTreeGroup(subtreeManager, 0), (Enum) zzrc.ON_DEVICE_BARCODE_CLOSE, zzwpVar.zzj(), 6));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final Object run(InputImage inputImage) {
        zzl zzlVar;
        InputImage inputImage2;
        synchronized (this) {
            try {
                try {
                    BitmapInStreamingChecker bitmapInStreamingChecker = this.zzg;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    bitmapInStreamingChecker.check(inputImage);
                    try {
                        ArrayList zza2 = this.zzd.zza(inputImage);
                        zzlVar = this;
                        inputImage2 = inputImage;
                        try {
                            zzlVar.zzf(zzrb.NO_ERROR, elapsedRealtime, inputImage2, zza2);
                            zza = false;
                            return zza2;
                        } catch (MlKitException e) {
                            e = e;
                            MlKitException mlKitException = e;
                            zzlVar.zzf(mlKitException.zza == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, elapsedRealtime, inputImage2, null);
                            throw mlKitException;
                        }
                    } catch (MlKitException e2) {
                        e = e2;
                        zzlVar = this;
                        inputImage2 = inputImage;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public final void zzf(final zzrb zzrbVar, long j, final InputImage inputImage, List list) {
        final zzfz zzfzVar = new zzfz();
        final zzfz zzfzVar2 = new zzfz();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Barcode barcode = (Barcode) it.next();
                int format2 = barcode.zza.getFormat();
                if (format2 > 4096 || format2 == 0) {
                    format2 = -1;
                }
                zzrn zzrnVar = (zzrn) zzb.zzb.get(format2);
                if (zzrnVar == null) {
                    zzrnVar = zzrn.FORMAT_UNKNOWN;
                }
                zzfzVar.zza$com$google$android$gms$internal$mlkit_vision_barcode$zzcl(zzrnVar);
                zzro zzroVar = (zzro) zzb.zzc.get(barcode.zza.getValueType());
                if (zzroVar == null) {
                    zzroVar = zzro.TYPE_UNKNOWN;
                }
                zzfzVar2.zza$com$google$android$gms$internal$mlkit_vision_barcode$zzcl(zzroVar);
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zze.zzf(new zzwo() { // from class: com.google.mlkit.vision.barcode.internal.zzj
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final HuffmanTreeGroup zza() {
                int limit;
                zzl zzlVar = zzl.this;
                long j2 = elapsedRealtime;
                zzrb zzrbVar2 = zzrbVar;
                zzfz zzfzVar3 = zzfzVar;
                zzfz zzfzVar4 = zzfzVar2;
                InputImage inputImage2 = inputImage;
                JWECryptoParts jWECryptoParts = new JWECryptoParts();
                JWECryptoParts jWECryptoParts2 = new JWECryptoParts();
                jWECryptoParts2.header = Long.valueOf(j2 & Long.MAX_VALUE);
                jWECryptoParts2.encryptedKey = zzrbVar2;
                jWECryptoParts2.iv = Boolean.valueOf(zzl.zza);
                Boolean bool = Boolean.TRUE;
                jWECryptoParts2.cipherText = bool;
                jWECryptoParts2.authenticationTag = bool;
                jWECryptoParts.header = new zzqq(jWECryptoParts2);
                jWECryptoParts.encryptedKey = zzb.zzc(zzlVar.zzc);
                jWECryptoParts.iv = zzfzVar3.zzf();
                jWECryptoParts.cipherText = zzfzVar4.zzf();
                int i = inputImage2.zzg;
                if (i == -1) {
                    Bitmap bitmap = inputImage2.zza;
                    zzae.checkNotNull(bitmap);
                    limit = bitmap.getAllocationByteCount();
                } else if (i == 17 || i == 842094169) {
                    ByteBuffer byteBuffer = inputImage2.zzb;
                    zzae.checkNotNull(byteBuffer);
                    limit = byteBuffer.limit();
                } else if (i != 35) {
                    limit = 0;
                } else {
                    Image.Plane[] planes = inputImage2.getPlanes();
                    zzae.checkNotNull(planes);
                    limit = (planes[0].getBuffer().limit() * 3) / 2;
                }
                zbc zbcVar = new zbc(12, false);
                zbcVar.zba = i != -1 ? i != 35 ? i != 842094169 ? i != 16 ? i != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21 : zzqi.NV16 : zzqi.YV12 : zzqi.YUV_420_888 : zzqi.BITMAP;
                zbcVar.zbb = Integer.valueOf(limit & Integer.MAX_VALUE);
                jWECryptoParts.authenticationTag = new zzqk(zbcVar);
                SubtreeManager subtreeManager = new SubtreeManager();
                subtreeManager.emitActionToParent = zzlVar.zzh ? zzra.TYPE_THICK : zzra.TYPE_THIN;
                subtreeManager.workflowSession = new zzrr(jWECryptoParts);
                return new HuffmanTreeGroup(subtreeManager, 0);
            }
        }, zzrc.ON_DEVICE_BARCODE_DETECT);
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.header = zzrbVar;
        jWECryptoParts.encryptedKey = Boolean.valueOf(zza);
        jWECryptoParts.iv = zzb.zzc(this.zzc);
        jWECryptoParts.cipherText = zzfzVar.zzf();
        jWECryptoParts.authenticationTag = zzfzVar2.zzf();
        zzft zzftVar = new zzft(jWECryptoParts);
        JCAContext jCAContext = new JCAContext(this, 9);
        zzwp zzwpVar = this.zze;
        zzrc zzrcVar = zzrc.UNKNOWN_EVENT;
        com.google.mlkit.common.sdkinternal.zzh.zza.execute(new SyncTask(zzwpVar, zzftVar, elapsedRealtime, jCAContext));
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.zzh;
        long j2 = currentTimeMillis - elapsedRealtime;
        zzbw zzbwVar = this.zzf;
        int i = true != z ? 24301 : 24302;
        int i2 = zzrbVar.zzad;
        synchronized (zzbwVar) {
            AtomicLong atomicLong = zzbwVar.zzb;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - zzbwVar.zzb.get() <= 1800000) {
                return;
            }
            zzbwVar.zza.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new HeadersReader(zzbwVar, elapsedRealtime2, 7));
        }
    }
}
