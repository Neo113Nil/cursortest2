package androidx.camera.core.internal;

import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface IoConfig extends ReadableConfig {
    public static final AutoValue_Config_Option OPTION_IO_EXECUTOR = new AutoValue_Config_Option("camerax.core.io.ioExecutor", Executor.class, null);
}
