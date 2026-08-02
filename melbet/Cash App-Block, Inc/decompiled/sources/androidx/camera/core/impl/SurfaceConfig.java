package androidx.camera.core.impl;

import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes3.dex */
public final class SurfaceConfig {
    public static final LinkedHashMap CONFIG_TYPES_BY_IMAGE_FORMAT;
    public static final StreamUseCase DEFAULT_STREAM_USE_CASE = StreamUseCase.DEFAULT;
    public static final ConfigSize[] FEATURE_COMBO_QUERY_SUPPORTED_SIZES = {ConfigSize.S720P_16_9, ConfigSize.S1080P_4_3, ConfigSize.S1080P_16_9, ConfigSize.S1440P_16_9, ConfigSize.UHD, ConfigSize.X_VGA};
    public static final Map IMAGE_FORMATS_BY_CONFIG_TYPE;
    public final ConfigSize configSize;
    public final ConfigType configType;
    public final int imageFormat;
    public final StreamUseCase streamUseCase;

    public enum ConfigSize {
        VGA(0, new Size(640, 480)),
        X_VGA(1, new Size(1024, 768)),
        S720P_16_9(2, new Size(1280, 720)),
        PREVIEW(3, null),
        S1080P_4_3(4, new Size(1440, 1080)),
        S1080P_16_9(5, new Size(1920, 1080)),
        S1440P_4_3(6, new Size(1920, 1440)),
        S1440P_16_9(7, new Size(2560, 1440)),
        UHD(8, new Size(3840, 2160)),
        RECORD(9, null),
        MAXIMUM(10, null),
        MAXIMUM_4_3(11, null),
        MAXIMUM_16_9(12, null),
        ULTRA_MAXIMUM(13, null),
        NOT_SUPPORT(14, null);

        public final int id;
        public final Size relatedFixedSize;

        ConfigSize(int i, Size size) {
            this.id = i;
            this.relatedFixedSize = size;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ConfigSource {
        public static final /* synthetic */ ConfigSource[] $VALUES;
        public static final ConfigSource CAPTURE_SESSION_TABLES;
        public static final ConfigSource FEATURE_COMBINATION_TABLE;

        static {
            ConfigSource configSource = new ConfigSource("FEATURE_COMBINATION_TABLE", 0);
            FEATURE_COMBINATION_TABLE = configSource;
            ConfigSource configSource2 = new ConfigSource("CAPTURE_SESSION_TABLES", 1);
            CAPTURE_SESSION_TABLES = configSource2;
            $VALUES = new ConfigSource[]{configSource, configSource2};
        }

        public static ConfigSource valueOf(String str) {
            return (ConfigSource) Enum.valueOf(ConfigSource.class, str);
        }

        public static ConfigSource[] values() {
            return (ConfigSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ConfigType {
        public static final /* synthetic */ ConfigType[] $VALUES;
        public static final ConfigType JPEG;
        public static final ConfigType JPEG_R;
        public static final ConfigType PRIV;
        public static final ConfigType RAW;
        public static final ConfigType YUV;

        static {
            ConfigType configType = new ConfigType("PRIV", 0);
            PRIV = configType;
            ConfigType configType2 = new ConfigType("YUV", 1);
            YUV = configType2;
            ConfigType configType3 = new ConfigType("JPEG", 2);
            JPEG = configType3;
            ConfigType configType4 = new ConfigType("JPEG_R", 3);
            JPEG_R = configType4;
            ConfigType configType5 = new ConfigType("RAW", 4);
            RAW = configType5;
            $VALUES = new ConfigType[]{configType, configType2, configType3, configType4, configType5};
        }

        public static ConfigType valueOf(String str) {
            return (ConfigType) Enum.valueOf(ConfigType.class, str);
        }

        public static ConfigType[] values() {
            return (ConfigType[]) $VALUES.clone();
        }
    }

    static {
        Map mapOf = MapsKt__MapsKt.mapOf(new Pair(ConfigType.YUV, 35), new Pair(ConfigType.JPEG, 256), new Pair(ConfigType.JPEG_R, 4101), new Pair(ConfigType.RAW, 32), new Pair(ConfigType.PRIV, 34));
        IMAGE_FORMATS_BY_CONFIG_TYPE = mapOf;
        Set<Map.Entry> entrySet = mapOf.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (ConfigType) entry.getKey());
        }
        CONFIG_TYPES_BY_IMAGE_FORMAT = linkedHashMap;
    }

    public SurfaceConfig(ConfigType configType, ConfigSize configSize, StreamUseCase streamUseCase) {
        configSize.getClass();
        streamUseCase.getClass();
        this.configType = configType;
        this.configSize = configSize;
        this.streamUseCase = streamUseCase;
        Integer num = (Integer) IMAGE_FORMATS_BY_CONFIG_TYPE.get(configType);
        this.imageFormat = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceConfig)) {
            return false;
        }
        SurfaceConfig surfaceConfig = (SurfaceConfig) obj;
        return this.configType == surfaceConfig.configType && this.configSize == surfaceConfig.configSize && this.streamUseCase == surfaceConfig.streamUseCase;
    }

    public final int hashCode() {
        return this.streamUseCase.hashCode() + ((this.configSize.hashCode() + (this.configType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.configType + ", configSize=" + this.configSize + ", streamUseCase=" + this.streamUseCase + ')';
    }
}
