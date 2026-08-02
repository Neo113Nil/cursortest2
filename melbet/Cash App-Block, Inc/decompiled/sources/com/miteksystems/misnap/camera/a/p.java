package com.miteksystems.misnap.camera.a;

import android.util.Log;
import androidx.camera.video.VideoRecordEvent;
import androidx.core.util.Consumer;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;

/* loaded from: classes4.dex */
public final class p implements Consumer {
    public final CameraWrapper.e a;
    public boolean b = true;

    public p(CameraWrapper.e eVar) {
        this.a = eVar;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        VideoRecordEvent videoRecordEvent = (VideoRecordEvent) obj;
        if (videoRecordEvent != null) {
            if (this.b) {
                this.a.invoke(videoRecordEvent);
                return;
            }
            Log.w("VideoRecEventsConsumer", "Observer is inactive. Ignoring event: " + videoRecordEvent);
        }
    }
}
