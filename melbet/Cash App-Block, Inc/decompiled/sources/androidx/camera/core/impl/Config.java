package androidx.camera.core.impl;

import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public interface Config {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class OptionPriority {
        public static final /* synthetic */ OptionPriority[] $VALUES;
        public static final OptionPriority ALWAYS_OVERRIDE;
        public static final OptionPriority HIGH_PRIORITY_REQUIRED;
        public static final OptionPriority OPTIONAL;
        public static final OptionPriority REQUIRED;

        static {
            OptionPriority optionPriority = new OptionPriority("ALWAYS_OVERRIDE", 0);
            ALWAYS_OVERRIDE = optionPriority;
            OptionPriority optionPriority2 = new OptionPriority("HIGH_PRIORITY_REQUIRED", 1);
            HIGH_PRIORITY_REQUIRED = optionPriority2;
            OptionPriority optionPriority3 = new OptionPriority("REQUIRED", 2);
            REQUIRED = optionPriority3;
            OptionPriority optionPriority4 = new OptionPriority("OPTIONAL", 3);
            OPTIONAL = optionPriority4;
            $VALUES = new OptionPriority[]{optionPriority, optionPriority2, optionPriority3, optionPriority4};
        }

        public static OptionPriority valueOf(String str) {
            return (OptionPriority) Enum.valueOf(OptionPriority.class, str);
        }

        public static OptionPriority[] values() {
            return (OptionPriority[]) $VALUES.clone();
        }
    }

    static OptionsBundle mergeConfigs(Config config, Config config2) {
        if (config == null && config2 == null) {
            return OptionsBundle.EMPTY_BUNDLE;
        }
        MutableOptionsBundle from = config2 != null ? MutableOptionsBundle.from(config2) : MutableOptionsBundle.create();
        if (config != null) {
            Iterator it = config.listOptions().iterator();
            while (it.hasNext()) {
                mergeOptionValue(from, config2, config, (AutoValue_Config_Option) it.next());
            }
        }
        return OptionsBundle.from(from);
    }

    static void mergeOptionValue(MutableOptionsBundle mutableOptionsBundle, Config config, Config config2, AutoValue_Config_Option autoValue_Config_Option) {
        if (!Objects.equals(autoValue_Config_Option, ImageOutputConfig.OPTION_RESOLUTION_SELECTOR)) {
            mutableOptionsBundle.insertOption(autoValue_Config_Option, config2.getOptionPriority(autoValue_Config_Option), config2.retrieveOption(autoValue_Config_Option));
            return;
        }
        ResolutionSelector resolutionSelector = (ResolutionSelector) config2.retrieveOption(autoValue_Config_Option, null);
        ResolutionSelector resolutionSelector2 = (ResolutionSelector) config.retrieveOption(autoValue_Config_Option, null);
        OptionPriority optionPriority = config2.getOptionPriority(autoValue_Config_Option);
        if (resolutionSelector == null) {
            resolutionSelector = resolutionSelector2;
        } else if (resolutionSelector2 != null) {
            AspectRatioStrategy aspectRatioStrategy = resolutionSelector2.mAspectRatioStrategy;
            ResolutionStrategy resolutionStrategy = resolutionSelector2.mResolutionStrategy;
            AspectRatioStrategy aspectRatioStrategy2 = resolutionSelector.mAspectRatioStrategy;
            if (aspectRatioStrategy2 != null) {
                aspectRatioStrategy = aspectRatioStrategy2;
            }
            ResolutionStrategy resolutionStrategy2 = resolutionSelector.mResolutionStrategy;
            if (resolutionStrategy2 != null) {
                resolutionStrategy = resolutionStrategy2;
            }
            resolutionSelector = new ResolutionSelector(aspectRatioStrategy, resolutionStrategy);
        }
        mutableOptionsBundle.insertOption(autoValue_Config_Option, optionPriority, resolutionSelector);
    }

    boolean containsOption(AutoValue_Config_Option autoValue_Config_Option);

    void findOptions(CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0);

    OptionPriority getOptionPriority(AutoValue_Config_Option autoValue_Config_Option);

    Set getPriorities(AutoValue_Config_Option autoValue_Config_Option);

    Set listOptions();

    Object retrieveOption(AutoValue_Config_Option autoValue_Config_Option);

    Object retrieveOption(AutoValue_Config_Option autoValue_Config_Option, Object obj);

    Object retrieveOptionWithPriority(AutoValue_Config_Option autoValue_Config_Option, OptionPriority optionPriority);
}
