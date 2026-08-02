package ru.yandex.taxi.communications.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/communications/model/ConfigurationType;", "", "DIALOGUE", "LIST", "BUBBLE", "TOOLTIP", "MODAL_WINDOW", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfigurationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ConfigurationType[] $VALUES;
    public static final ConfigurationType BUBBLE;
    public static final ConfigurationType DIALOGUE;
    public static final ConfigurationType LIST;
    public static final ConfigurationType MODAL_WINDOW;
    public static final ConfigurationType TOOLTIP;
    public static final ConfigurationType UNKNOWN;

    static {
        ConfigurationType configurationType = new ConfigurationType("DIALOGUE", 0);
        DIALOGUE = configurationType;
        ConfigurationType configurationType2 = new ConfigurationType("LIST", 1);
        LIST = configurationType2;
        ConfigurationType configurationType3 = new ConfigurationType("BUBBLE", 2);
        BUBBLE = configurationType3;
        ConfigurationType configurationType4 = new ConfigurationType("TOOLTIP", 3);
        TOOLTIP = configurationType4;
        ConfigurationType configurationType5 = new ConfigurationType("MODAL_WINDOW", 4);
        MODAL_WINDOW = configurationType5;
        ConfigurationType configurationType6 = new ConfigurationType("UNKNOWN", 5);
        UNKNOWN = configurationType6;
        ConfigurationType[] configurationTypeArr = {configurationType, configurationType2, configurationType3, configurationType4, configurationType5, configurationType6};
        $VALUES = configurationTypeArr;
        $ENTRIES = kotlin.enums.a.a(configurationTypeArr);
    }

    public static ConfigurationType valueOf(String str) {
        return (ConfigurationType) Enum.valueOf(ConfigurationType.class, str);
    }

    public static ConfigurationType[] values() {
        return (ConfigurationType[]) $VALUES.clone();
    }
}
