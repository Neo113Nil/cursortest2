package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.core.impl.TagBundle;
import java.util.HashMap;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import squareup.cash.wires.WiresAccountInfo;

/* loaded from: classes3.dex */
public abstract class TagsKt {
    public static final Metadata.Key CAMERAX_TAG_BUNDLE;
    public static final Metadata.Key USE_CASE_CAMERA_STATE_CUSTOM_TAG;

    static {
        HashMap hashMap = Metadata.Key.keys;
        ReflectionFactory reflectionFactory = Reflection.factory;
        CAMERAX_TAG_BUNDLE = WiresAccountInfo.WiresProfile.create("camerax.tag_bundle", reflectionFactory.getOrCreateKotlinClass(TagBundle.class));
        USE_CASE_CAMERA_STATE_CUSTOM_TAG = WiresAccountInfo.WiresProfile.create("use_case_camera_state.tag", reflectionFactory.getOrCreateKotlinClass(Integer.class));
    }
}
