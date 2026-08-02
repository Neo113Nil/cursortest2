package com.google.mlkit.vision.common.internal;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.zzae;
import com.google.mlkit.vision.common.InputImage;
import com.squareup.cash.clientroutes.PatternRedaction;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class BitmapInStreamingChecker {
    public static final PatternRedaction zza = new PatternRedaction("StreamingFormatChecker", "");
    public final LinkedList zzb = new LinkedList();
    public long zzc = -1;

    public final void check(InputImage inputImage) {
        if (inputImage.zzg != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long valueOf = Long.valueOf(elapsedRealtime);
        LinkedList linkedList = this.zzb;
        linkedList.add(valueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            zzae.checkNotNull(l);
            if (elapsedRealtime - l.longValue() < 5000) {
                long j = this.zzc;
                if (j == -1 || elapsedRealtime - j >= 5000) {
                    this.zzc = elapsedRealtime;
                    PatternRedaction patternRedaction = zza;
                    if (Log.isLoggable(patternRedaction.pattern, 5)) {
                        Log.w("StreamingFormatChecker", patternRedaction.zza("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}
