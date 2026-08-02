package com.squareup.cash.device;

import android.app.Activity;
import androidx.camera.core.RotationProvider;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public final class RealDeviceOrientationProvider {
    public final StateFlowImpl orientation = FlowKt.MutableStateFlow(DeviceOrientation.UNKNOWN);

    public RealDeviceOrientationProvider(Activity activity) {
        RotationProvider.AnonymousClass1 anonymousClass1 = new RotationProvider.AnonymousClass1(this, activity.getBaseContext());
        if (anonymousClass1.canDetectOrientation()) {
            anonymousClass1.enable();
        }
    }
}
