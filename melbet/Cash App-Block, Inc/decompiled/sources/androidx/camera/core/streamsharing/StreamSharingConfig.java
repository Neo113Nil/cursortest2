package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.AutoValue_Config_Option;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;

/* loaded from: classes3.dex */
public final class StreamSharingConfig implements UseCaseConfig, ImageOutputConfig, ThreadConfig {
    public static final AutoValue_Config_Option OPTION_CAPTURE_TYPES = new AutoValue_Config_Option("camerax.core.streamSharing.captureTypes", List.class, null);
    public final OptionsBundle mConfig;

    public StreamSharingConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.mConfig;
    }
}
