package androidx.camera.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class CaptureBundles$CaptureBundleImpl {
    public final List mCaptureStageList;

    public CaptureBundles$CaptureBundleImpl(List list) {
        if (list == null || list.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.mCaptureStageList = Collections.unmodifiableList(new ArrayList(list));
    }
}
