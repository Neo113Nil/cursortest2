package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.Metadata;
import java.util.HashMap;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes3.dex */
public abstract class CameraPipeKeys {
    public static final Metadata.Key camera2CaptureRequestTag;
    public static final Metadata.Key camera2ExtensionMode;
    public static final Metadata.Key ignore3ARequiredParameters;

    static {
        HashMap hashMap = Metadata.Key.keys;
        ReflectionFactory reflectionFactory = Reflection.factory;
        camera2ExtensionMode = WiresAccountInfo.WiresProfile.create("androidx.camera.camera2.pipe.extensionMode", reflectionFactory.getOrCreateKotlinClass(Integer.class));
        camera2CaptureRequestTag = WiresAccountInfo.WiresProfile.create("androidx.camera.camera2.pipe.captureRequestTag", reflectionFactory.getOrCreateKotlinClass(Object.class));
        ignore3ARequiredParameters = WiresAccountInfo.WiresProfile.create("androidx.camera.camera2.pipe.ignore3ARequiredParameters", reflectionFactory.getOrCreateKotlinClass(Boolean.class));
    }
}
