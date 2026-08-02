package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.streamsharing.StreamSharingBuilder;
import bo.app.ng$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public class OptionsBundle implements Config {
    public static final OptionsBundle EMPTY_BUNDLE;
    public static final ng$$ExternalSyntheticLambda0 ID_COMPARE;
    public final TreeMap mOptions;

    static {
        ng$$ExternalSyntheticLambda0 ng__externalsyntheticlambda0 = new ng$$ExternalSyntheticLambda0(1);
        ID_COMPARE = ng__externalsyntheticlambda0;
        EMPTY_BUNDLE = new OptionsBundle(new TreeMap(ng__externalsyntheticlambda0));
    }

    public OptionsBundle(TreeMap treeMap) {
        this.mOptions = treeMap;
    }

    public static OptionsBundle from(Config config) {
        if (OptionsBundle.class.equals(config.getClass())) {
            return (OptionsBundle) config;
        }
        TreeMap treeMap = new TreeMap(ID_COMPARE);
        for (AutoValue_Config_Option autoValue_Config_Option : config.listOptions()) {
            Set<Config.OptionPriority> priorities = config.getPriorities(autoValue_Config_Option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, config.retrieveOptionWithPriority(autoValue_Config_Option, optionPriority));
            }
            treeMap.put(autoValue_Config_Option, arrayMap);
        }
        return new OptionsBundle(treeMap);
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean containsOption(AutoValue_Config_Option autoValue_Config_Option) {
        return this.mOptions.containsKey(autoValue_Config_Option);
    }

    @Override // androidx.camera.core.impl.Config
    public final void findOptions(CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0 captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0) {
        for (Map.Entry entry : this.mOptions.tailMap(new AutoValue_Config_Option("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((AutoValue_Config_Option) entry.getKey()).id.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            AutoValue_Config_Option autoValue_Config_Option = (AutoValue_Config_Option) entry.getKey();
            StreamSharingBuilder streamSharingBuilder = (StreamSharingBuilder) captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0.f$0;
            Config config = (Config) captureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0.f$1;
            autoValue_Config_Option.getClass();
            streamSharingBuilder.mMutableConfig.insertOption(autoValue_Config_Option, config.getOptionPriority(autoValue_Config_Option), config.retrieveOption(autoValue_Config_Option));
        }
    }

    @Override // androidx.camera.core.impl.Config
    public final Config.OptionPriority getOptionPriority(AutoValue_Config_Option autoValue_Config_Option) {
        Map map = (Map) this.mOptions.get(autoValue_Config_Option);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) autoValue_Config_Option, "Option does not exist: ");
        return null;
    }

    @Override // androidx.camera.core.impl.Config
    public final Set getPriorities(AutoValue_Config_Option autoValue_Config_Option) {
        Map map = (Map) this.mOptions.get(autoValue_Config_Option);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final Set listOptions() {
        return Collections.unmodifiableSet(this.mOptions.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final Object retrieveOption(AutoValue_Config_Option autoValue_Config_Option) {
        Map map = (Map) this.mOptions.get(autoValue_Config_Option);
        if (map != null) {
            return map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) autoValue_Config_Option, "Option does not exist: ");
        return null;
    }

    @Override // androidx.camera.core.impl.Config
    public final Object retrieveOptionWithPriority(AutoValue_Config_Option autoValue_Config_Option, Config.OptionPriority optionPriority) {
        Map map = (Map) this.mOptions.get(autoValue_Config_Option);
        if (map == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) autoValue_Config_Option, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(optionPriority)) {
            return map.get(optionPriority);
        }
        Handlers$$ExternalSyntheticBUOutline0.m$1("Option does not exist: ", autoValue_Config_Option, " with priority=", optionPriority);
        return null;
    }

    @Override // androidx.camera.core.impl.Config
    public final Object retrieveOption(AutoValue_Config_Option autoValue_Config_Option, Object obj) {
        Map map = (Map) this.mOptions.get(autoValue_Config_Option);
        return map == null ? obj : map.get((Config.OptionPriority) Collections.min(map.keySet()));
    }
}
