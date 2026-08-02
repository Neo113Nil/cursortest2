package androidx.camera.camera2.impl;

import androidx.camera.core.impl.Config;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public interface CapturePipeline {
    CapturePipelineImpl$getCameraCapturePipeline$2 getCameraCapturePipeline(int i, int i2);

    void setTemplate(int i);

    /* renamed from: submitStillCaptures-BvXKQx0 */
    Object mo23submitStillCapturesBvXKQx0(List list, int i, Config config, int i2, int i3, int i4, ContinuationImpl continuationImpl);
}
