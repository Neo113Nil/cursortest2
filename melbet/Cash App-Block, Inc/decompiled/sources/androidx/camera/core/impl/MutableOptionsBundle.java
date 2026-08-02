package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class MutableOptionsBundle extends OptionsBundle {
    public static MutableOptionsBundle create() {
        return new MutableOptionsBundle(new TreeMap(OptionsBundle.ID_COMPARE));
    }

    public static MutableOptionsBundle from(Config config) {
        TreeMap treeMap = new TreeMap(OptionsBundle.ID_COMPARE);
        for (AutoValue_Config_Option autoValue_Config_Option : config.listOptions()) {
            Set<Config.OptionPriority> priorities = config.getPriorities(autoValue_Config_Option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, config.retrieveOptionWithPriority(autoValue_Config_Option, optionPriority));
            }
            treeMap.put(autoValue_Config_Option, arrayMap);
        }
        return new MutableOptionsBundle(treeMap);
    }

    public final void insertOption(AutoValue_Config_Option autoValue_Config_Option, Config.OptionPriority optionPriority, Object obj) {
        Config.OptionPriority optionPriority2;
        TreeMap treeMap = this.mOptions;
        Map map = (Map) treeMap.get(autoValue_Config_Option);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(autoValue_Config_Option, arrayMap);
            arrayMap.put(optionPriority, obj);
            return;
        }
        Config.OptionPriority optionPriority3 = (Config.OptionPriority) Collections.min(map.keySet());
        if (Objects.equals(map.get(optionPriority3), obj) || optionPriority3 != (optionPriority2 = Config.OptionPriority.REQUIRED) || optionPriority != optionPriority2) {
            map.put(optionPriority, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(autoValue_Config_Option.id);
        sb.append(", existing value (");
        sb.append(optionPriority3);
        Object obj2 = map.get(optionPriority3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(optionPriority);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void removeOption(AutoValue_Config_Option autoValue_Config_Option) {
        this.mOptions.remove(autoValue_Config_Option);
    }

    public final void insertOption(AutoValue_Config_Option autoValue_Config_Option, Object obj) {
        insertOption(autoValue_Config_Option, Config.OptionPriority.OPTIONAL, obj);
    }
}
