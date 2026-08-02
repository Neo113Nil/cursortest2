package com.google.android.filament;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.nio.Buffer;
import java.util.List;

/* loaded from: classes6.dex */
public class Material {
    public long mNativeObject;

    /* loaded from: classes4.dex */
    public static class Parameter {
        public static final int[] sTypeValues = CameraSelector$$ExternalSyntheticOutline0.values(24);
        private static final int SAMPLER_OFFSET = 18;
        private static final int SUBPASS_OFFSET = 23;

        private static void add(List<Parameter> list, String str, int i, int i2, int i3) {
            int i4 = sTypeValues[i];
            int i5 = CameraSelector$$ExternalSyntheticOutline0.values(4)[i2];
            list.add(new Parameter());
        }
    }

    public Material(long j) {
        this.mNativeObject = j;
        nGetDefaultInstance(j);
        getNativeObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, Buffer buffer, int i, int i2, int i3, int i4);

    private static native long nCreateInstance(long j);

    private static native long nGetDefaultInstance(long j);

    public final MaterialInstance createInstance() {
        long nCreateInstance = nCreateInstance(getNativeObject());
        if (nCreateInstance == 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Couldn't create MaterialInstance");
            return null;
        }
        MaterialInstance materialInstance = new MaterialInstance();
        getNativeObject();
        materialInstance.mNativeObject = nCreateInstance;
        return materialInstance;
    }

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Material");
        return 0L;
    }
}
