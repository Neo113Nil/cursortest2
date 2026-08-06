package io.appmetrica.analytics.plugins;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PluginErrorDetails {

    /* renamed from: a, reason: collision with root package name */
    private final String f7523a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7524b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f7525c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7526d;

    /* renamed from: e, reason: collision with root package name */
    private final String f7527e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f7528f;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f7529a;

        /* renamed from: b, reason: collision with root package name */
        private String f7530b;

        /* renamed from: c, reason: collision with root package name */
        private List f7531c;

        /* renamed from: d, reason: collision with root package name */
        private String f7532d;

        /* renamed from: e, reason: collision with root package name */
        private String f7533e;

        /* renamed from: f, reason: collision with root package name */
        private Map f7534f;

        public PluginErrorDetails build() {
            return new PluginErrorDetails(this.f7529a, this.f7530b, (List) WrapUtils.getOrDefault(this.f7531c, new ArrayList()), this.f7532d, this.f7533e, (Map) WrapUtils.getOrDefault(this.f7534f, new HashMap()), 0);
        }

        public Builder withExceptionClass(String str) {
            this.f7529a = str;
            return this;
        }

        public Builder withMessage(String str) {
            this.f7530b = str;
            return this;
        }

        public Builder withPlatform(String str) {
            this.f7532d = str;
            return this;
        }

        public Builder withPluginEnvironment(Map<String, String> map) {
            this.f7534f = map;
            return this;
        }

        public Builder withStacktrace(List<StackTraceItem> list) {
            this.f7531c = list;
            return this;
        }

        public Builder withVirtualMachineVersion(String str) {
            this.f7533e = str;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }

    public /* synthetic */ PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map, int i2) {
        this(str, str2, list, str3, str4, map);
    }

    public String getExceptionClass() {
        return this.f7523a;
    }

    public String getMessage() {
        return this.f7524b;
    }

    public String getPlatform() {
        return this.f7526d;
    }

    public Map<String, String> getPluginEnvironment() {
        return this.f7528f;
    }

    public List<StackTraceItem> getStacktrace() {
        return this.f7525c;
    }

    public String getVirtualMachineVersion() {
        return this.f7527e;
    }

    private PluginErrorDetails(String str, String str2, List list, String str3, String str4, Map map) {
        this.f7523a = str;
        this.f7524b = str2;
        this.f7525c = new ArrayList(list);
        this.f7526d = str3;
        this.f7527e = str4;
        this.f7528f = CollectionUtils.getMapFromList(CollectionUtils.getListFromMap(map));
    }
}
