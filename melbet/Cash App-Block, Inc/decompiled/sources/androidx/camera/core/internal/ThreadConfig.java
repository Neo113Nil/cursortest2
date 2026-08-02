package androidx.camera.core.internal;

import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface ThreadConfig extends ReadableConfig {
    public static final AutoValue_Config_Option OPTION_BACKGROUND_EXECUTOR = new AutoValue_Config_Option("camerax.core.thread.backgroundExecutor", Executor.class, null);
}
