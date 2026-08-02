package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferredImpl;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ResultListener implements Request.Listener {
    public final Function1 checker;
    public final CompletableDeferredImpl completeSignal;
    public final long timeLimitNs;
    public volatile Long timestampOfFirstUpdateNs;

    public ResultListener(long j, Function1 function1) {
        function1.getClass();
        this.timeLimitNs = j;
        this.checker = function1;
        this.completeSignal = new CompletableDeferredImpl();
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public final void mo18onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
        if (this.completeSignal.isCompleted() || this.completeSignal.isCancelled()) {
            return;
        }
        AndroidFrameMetadata androidFrameMetadata = androidFrameInfo.result;
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        Long l = (Long) androidFrameMetadata.get(key);
        if (l != null && this.timestampOfFirstUpdateNs == null) {
            this.timestampOfFirstUpdateNs = l;
        }
        Long l2 = this.timestampOfFirstUpdateNs;
        if (this.timeLimitNs == 0 || l2 == null || l == null || l.longValue() - l2.longValue() <= this.timeLimitNs) {
            if (((Boolean) this.checker.invoke(androidFrameInfo)).booleanValue()) {
                this.completeSignal.makeCompleting$kotlinx_coroutines_core(androidFrameInfo);
                return;
            }
            return;
        }
        this.completeSignal.makeCompleting$kotlinx_coroutines_core(null);
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "Wait for capture result timeout, current: " + l.longValue() + " first: " + l2.longValue());
        }
    }
}
