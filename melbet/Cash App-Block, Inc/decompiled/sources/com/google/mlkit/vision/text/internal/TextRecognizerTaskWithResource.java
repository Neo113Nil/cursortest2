package com.google.mlkit.vision.text.internal;

import android.os.SystemClock;
import androidx.camera.core.FocusMeteringAction;
import com.android.volley.Response;
import com.fillr.n;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.mlkit_vision_face.zzoe;
import com.google.android.gms.internal.mlkit_vision_text_common.zzdb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.firebase.messaging.SyncTask;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.zzh;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes4.dex */
public final class TextRecognizerTaskWithResource extends MLTask {
    public static final Response taskQueue = new Response(13);
    public static boolean zza = true;
    public final zzm zzc;
    public final zzuc zzd;
    public final zzoe zze;
    public final TextRecognizerOptions zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRecognizerTaskWithResource(zzuc zzucVar, zzm zzmVar, TextRecognizerOptions textRecognizerOptions) {
        super(taskQueue);
        textRecognizerOptions.getClass();
        this.zzd = zzucVar;
        this.zzc = zzmVar;
        this.zze = new zzoe(MlKitContext.getInstance().getApplicationContext(), 1);
        this.zzf = textRecognizerOptions;
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final synchronized void load() {
        this.zzc.zzb();
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final synchronized void release() {
        zza = true;
        this.zzc.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.MLTask
    public final Object run(InputImage inputImage) {
        Text zza2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                zza2 = this.zzc.zza(inputImage);
                zzf(zzou.NO_ERROR, elapsedRealtime, inputImage);
                zza = false;
            } catch (MlKitException e) {
                zzf(e.zza == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR, elapsedRealtime, inputImage);
                throw e;
            }
        }
        return zza2;
    }

    public final void zzf(zzou zzouVar, long j, InputImage inputImage) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        FocusMeteringAction focusMeteringAction = new FocusMeteringAction();
        focusMeteringAction.mMeteringPointsAf = this;
        focusMeteringAction.mAutoCancelDurationInMillis = elapsedRealtime;
        focusMeteringAction.mMeteringPointsAe = zzouVar;
        focusMeteringAction.mMeteringPointsAwb = inputImage;
        this.zzd.zzf(focusMeteringAction, zzov.ON_DEVICE_TEXT_DETECT);
        zzdb zzdbVar = new zzdb();
        zzdbVar.zzc = zzouVar;
        zzdbVar.zzd = Boolean.valueOf(zza);
        n.b bVar = new n.b(24);
        this.zzf.getClass();
        bVar.b = zzsb.LATIN;
        zzdbVar.zze = new zzsd(bVar);
        zzes zzesVar = new zzes(zzdbVar);
        zzr zzrVar = new zzr(this, 0);
        zzov zzovVar = zzov.UNKNOWN_EVENT;
        zzh.zza.execute(new SyncTask(this.zzd, zzesVar, elapsedRealtime, zzrVar));
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - elapsedRealtime;
        zzoe zzoeVar = this.zze;
        int i = this.zzf.getIsThickClient() ? 24317 : 24306;
        int i2 = zzouVar.zzad;
        synchronized (zzoeVar) {
            AtomicLong atomicLong = zzoeVar.zzb;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - zzoeVar.zzb.get() <= 1800000) {
                return;
            }
            zzoeVar.zza.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new HeadersReader(zzoeVar, elapsedRealtime2, 9));
        }
    }
}
