package com.datadog.android.rum.internal.startup;

import android.app.Activity;
import androidx.emoji2.text.MetadataRepo;
import com.google.android.filament.Box;

/* loaded from: classes4.dex */
public final class RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1 {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ Box $callback;
    public final /* synthetic */ MetadataRepo this$0;

    public RumFirstDrawTimeReporterImpl$subscribeToFirstFrameDrawn$listener$1(MetadataRepo metadataRepo, Activity activity, Box box) {
        this.this$0 = metadataRepo;
        this.$activity = activity;
        this.$callback = box;
    }
}
