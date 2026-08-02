package androidx.camera.core.internal;

import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.ReadableConfig;

/* loaded from: classes3.dex */
public interface TargetConfig extends ReadableConfig {
    public static final AutoValue_Config_Option OPTION_TARGET_NAME = new AutoValue_Config_Option("camerax.core.target.name", String.class, null);
    public static final AutoValue_Config_Option OPTION_TARGET_CLASS = new AutoValue_Config_Option("camerax.core.target.class", Class.class, null);
}
