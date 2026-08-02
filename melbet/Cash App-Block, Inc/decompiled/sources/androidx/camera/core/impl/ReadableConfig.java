package androidx.camera.core.impl;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.Config;
import java.util.Set;

/* loaded from: classes3.dex */
public interface ReadableConfig extends Config {
    @Override // androidx.camera.core.impl.Config
    default boolean containsOption(AutoValue_Config_Option autoValue_Config_Option) {
        return getConfig().containsOption(autoValue_Config_Option);
    }

    @Override // androidx.camera.core.impl.Config
    default void findOptions(CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0) {
        getConfig().findOptions(captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0);
    }

    Config getConfig();

    @Override // androidx.camera.core.impl.Config
    default Config.OptionPriority getOptionPriority(AutoValue_Config_Option autoValue_Config_Option) {
        return getConfig().getOptionPriority(autoValue_Config_Option);
    }

    @Override // androidx.camera.core.impl.Config
    default Set getPriorities(AutoValue_Config_Option autoValue_Config_Option) {
        return getConfig().getPriorities(autoValue_Config_Option);
    }

    @Override // androidx.camera.core.impl.Config
    default Set listOptions() {
        return getConfig().listOptions();
    }

    @Override // androidx.camera.core.impl.Config
    default Object retrieveOption(AutoValue_Config_Option autoValue_Config_Option) {
        return getConfig().retrieveOption(autoValue_Config_Option);
    }

    @Override // androidx.camera.core.impl.Config
    default Object retrieveOptionWithPriority(AutoValue_Config_Option autoValue_Config_Option, Config.OptionPriority optionPriority) {
        return getConfig().retrieveOptionWithPriority(autoValue_Config_Option, optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    default Object retrieveOption(AutoValue_Config_Option autoValue_Config_Option, Object obj) {
        return getConfig().retrieveOption(autoValue_Config_Option, obj);
    }
}
