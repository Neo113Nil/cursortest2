package com.datadog.trace.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class ConfigSetting {
    public static final HashSet CONFIG_FILTER_LIST = new HashSet(Arrays.asList("DD_API_KEY", "dd.api-key", "dd.profiling.api-key", "dd.profiling.apikey"));
    public final String key;
    public final int origin;
    public final Object value;

    public ConfigSetting(String str, int i, String str2) {
        this.key = str;
        this.value = CONFIG_FILTER_LIST.contains(str) ? "<hidden>" : str2;
        this.origin = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConfigSetting.class != obj.getClass()) {
            return false;
        }
        ConfigSetting configSetting = (ConfigSetting) obj;
        return this.key.equals(configSetting.key) && Objects.equals(this.value, configSetting.value) && this.origin == configSetting.origin;
    }

    public final int hashCode() {
        int i = this.origin;
        return Objects.hash(this.key, this.value, i == 0 ? null : Integer.valueOf(i - 1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigSetting{key='");
        sb.append(this.key);
        sb.append("', value=");
        sb.append(this.value);
        sb.append(", origin=");
        int i = this.origin;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DEFAULT" : "JVM_PROP" : "REMOTE" : "ENV");
        sb.append('}');
        return sb.toString();
    }
}
