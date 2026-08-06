package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class InternalModuleEvent {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f7382a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7383b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7384c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f7385d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f7386e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7387f;

    /* renamed from: g, reason: collision with root package name */
    private final List f7388g;

    /* renamed from: h, reason: collision with root package name */
    private final List f7389h;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f7390a;

        /* renamed from: b, reason: collision with root package name */
        private String f7391b;

        /* renamed from: c, reason: collision with root package name */
        private String f7392c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f7393d;

        /* renamed from: e, reason: collision with root package name */
        private Category f7394e;

        /* renamed from: f, reason: collision with root package name */
        private Map f7395f;

        /* renamed from: g, reason: collision with root package name */
        private Map f7396g;

        /* renamed from: h, reason: collision with root package name */
        private Map f7397h;

        public Builder(int i2) {
            this.f7390a = i2;
        }

        public InternalModuleEvent build() {
            return new InternalModuleEvent(this, null);
        }

        public final Map<String, Object> getAttributes() {
            return this.f7397h;
        }

        public final Category getCategory() {
            return this.f7394e;
        }

        public final Map<String, Object> getEnvironment() {
            return this.f7395f;
        }

        public final Map<String, byte[]> getExtras() {
            return this.f7396g;
        }

        public final String getName() {
            return this.f7391b;
        }

        public final Integer getServiceDataReporterType() {
            return this.f7393d;
        }

        public final int getType$modules_api_release() {
            return this.f7390a;
        }

        public final String getValue() {
            return this.f7392c;
        }

        public final void setAttributes(Map<String, ? extends Object> map) {
            this.f7397h = map;
        }

        public final void setCategory(Category category) {
            this.f7394e = category;
        }

        public final void setEnvironment(Map<String, ? extends Object> map) {
            this.f7395f = map;
        }

        public final void setExtras(Map<String, byte[]> map) {
            this.f7396g = map;
        }

        public final void setName(String str) {
            this.f7391b = str;
        }

        public final void setServiceDataReporterType(Integer num) {
            this.f7393d = num;
        }

        public final void setValue(String str) {
            this.f7392c = str;
        }

        public final Builder withAttributes(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f7397h = new HashMap(map);
            }
            return this;
        }

        public final Builder withCategory(Category category) {
            this.f7394e = category;
            return this;
        }

        public final Builder withEnvironment(Map<String, ? extends Object> map) {
            if (map != null) {
                this.f7395f = new HashMap(map);
            }
            return this;
        }

        public final Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f7396g = new HashMap(map);
            }
            return this;
        }

        public final Builder withName(String str) {
            this.f7391b = str;
            return this;
        }

        public final Builder withServiceDataReporterType(int i2) {
            this.f7393d = Integer.valueOf(i2);
            return this;
        }

        public final Builder withValue(String str) {
            this.f7392c = str;
            return this;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Builder newBuilder(int i2) {
            return new Builder(i2);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InternalModuleEvent(Builder builder, e eVar) {
        this(builder);
    }

    public static final Builder newBuilder(int i2) {
        return Companion.newBuilder(i2);
    }

    public final Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f7389h);
    }

    public final Category getCategory() {
        return this.f7386e;
    }

    public final Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f7387f);
    }

    public final Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f7388g);
    }

    public final String getName() {
        return this.f7383b;
    }

    public final Integer getServiceDataReporterType() {
        return this.f7385d;
    }

    public final int getType() {
        return this.f7382a;
    }

    public final String getValue() {
        return this.f7384c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f7382a + ", name='" + this.f7383b + "', value='" + this.f7384c + "', serviceDataReporterType=" + this.f7385d + ", category=" + this.f7386e + ", environment=" + this.f7387f + ", extras=" + this.f7388g + ", attributes=" + this.f7389h + '}';
    }

    private InternalModuleEvent(Builder builder) {
        this.f7382a = builder.getType$modules_api_release();
        this.f7383b = builder.getName();
        this.f7384c = builder.getValue();
        this.f7385d = builder.getServiceDataReporterType();
        this.f7386e = builder.getCategory();
        this.f7387f = CollectionUtils.getListFromMap(builder.getEnvironment());
        this.f7388g = CollectionUtils.getListFromMap(builder.getExtras());
        this.f7389h = CollectionUtils.getListFromMap(builder.getAttributes());
    }
}
