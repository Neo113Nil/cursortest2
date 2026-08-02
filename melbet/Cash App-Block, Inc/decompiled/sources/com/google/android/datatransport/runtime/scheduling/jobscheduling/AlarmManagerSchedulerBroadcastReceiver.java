package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda13;
import androidx.camera.video.internal.encoder.EncoderImpl$$ExternalSyntheticLambda4;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.maps.zzai;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int $r8$clinit = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(context);
        SVG builder = AutoValue_TransportContext.builder();
        builder.setBackendName(queryParameter);
        builder.idToElementMap = PriorityMapping.valueOf(intValue);
        if (queryParameter2 != null) {
            builder.cssRules = Base64.decode(queryParameter2, 0);
        }
        zzai zzaiVar = TransportRuntime.getInstance().uploader;
        ((Executor) zzaiVar.zad).execute(new EncoderImpl$$ExternalSyntheticLambda4(zzaiVar, builder.build(), i, new Recorder$$ExternalSyntheticLambda13(5)));
    }
}
