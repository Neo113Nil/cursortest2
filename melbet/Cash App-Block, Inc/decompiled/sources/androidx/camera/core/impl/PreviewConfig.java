package androidx.camera.core.impl;

import androidx.camera.core.internal.ThreadConfig;

/* loaded from: classes3.dex */
public final class PreviewConfig implements UseCaseConfig, ImageOutputConfig, ThreadConfig {
    public final OptionsBundle mConfig;

    public PreviewConfig(OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    public final Config getConfig() {
        return this.mConfig;
    }

    @Override // androidx.camera.core.impl.ImageInputConfig
    public final int getInputFormat() {
        return ((Integer) retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
    }
}
