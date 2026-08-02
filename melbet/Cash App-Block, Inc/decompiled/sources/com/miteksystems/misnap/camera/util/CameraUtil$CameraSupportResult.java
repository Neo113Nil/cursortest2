package com.miteksystems.misnap.camera.util;

import com.miteksystems.misnap.core.MiSnapCameraInfo;

/* loaded from: classes4.dex */
public abstract class CameraUtil$CameraSupportResult {

    public final class Success extends CameraUtil$CameraSupportResult {
        public final MiSnapCameraInfo a;

        public Success(MiSnapCameraInfo miSnapCameraInfo) {
            miSnapCameraInfo.getClass();
            this.a = miSnapCameraInfo;
        }
    }
}
