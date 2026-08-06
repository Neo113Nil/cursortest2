package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class ModuleEvent {

    /* renamed from: a, reason: collision with root package name */
    private final int f3466a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3467b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3468c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3469d;

    /* renamed from: e, reason: collision with root package name */
    private final Category f3470e;

    /* renamed from: f, reason: collision with root package name */
    private final List f3471f;

    /* renamed from: g, reason: collision with root package name */
    private final List f3472g;

    /* renamed from: h, reason: collision with root package name */
    private final List f3473h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final int f3474a;

        /* renamed from: b, reason: collision with root package name */
        private String f3475b;

        /* renamed from: c, reason: collision with root package name */
        private String f3476c;

        /* renamed from: d, reason: collision with root package name */
        private int f3477d;

        /* renamed from: e, reason: collision with root package name */
        private Category f3478e;

        /* renamed from: f, reason: collision with root package name */
        private HashMap f3479f;

        /* renamed from: g, reason: collision with root package name */
        private HashMap f3480g;

        /* renamed from: h, reason: collision with root package name */
        private HashMap f3481h;

        public /* synthetic */ Builder(int i2, int i3) {
            this(i2);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(Map<String, Object> map) {
            if (map != null) {
                this.f3481h = new HashMap(map);
            }
            return this;
        }

        public Builder withCategory(Category category) {
            this.f3478e = category;
            return this;
        }

        public Builder withEnvironment(Map<String, Object> map) {
            if (map != null) {
                this.f3479f = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(Map<String, byte[]> map) {
            if (map != null) {
                this.f3480g = new HashMap(map);
            }
            return this;
        }

        public Builder withName(String str) {
            this.f3475b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i2) {
            this.f3477d = i2;
            return this;
        }

        public Builder withValue(String str) {
            this.f3476c = str;
            return this;
        }

        private Builder(int i2) {
            this.f3477d = 1;
            this.f3478e = Category.GENERAL;
            this.f3474a = i2;
        }
    }

    public enum Category {
        GENERAL,
        SYSTEM
    }

    public /* synthetic */ ModuleEvent(Builder builder, int i2) {
        this(builder);
    }

    public static Builder newBuilder(int i2) {
        return new Builder(i2, 0);
    }

    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f3473h);
    }

    public Category getCategory() {
        return this.f3470e;
    }

    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f3471f);
    }

    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f3472g);
    }

    public String getName() {
        return this.f3467b;
    }

    public int getServiceDataReporterType() {
        return this.f3469d;
    }

    public int getType() {
        return this.f3466a;
    }

    public String getValue() {
        return this.f3468c;
    }

    public String toString() {
        return "ModuleEvent{type=" + this.f3466a + ", name='" + this.f3467b + "', value='" + this.f3468c + "', serviceDataReporterType=" + this.f3469d + ", category=" + this.f3470e + ", environment=" + this.f3471f + ", extras=" + this.f3472g + ", attributes=" + this.f3473h + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f3466a = builder.f3474a;
        this.f3467b = builder.f3475b;
        this.f3468c = builder.f3476c;
        this.f3469d = builder.f3477d;
        this.f3470e = builder.f3478e;
        this.f3471f = CollectionUtils.getListFromMap(builder.f3479f);
        this.f3472g = CollectionUtils.getListFromMap(builder.f3480g);
        this.f3473h = CollectionUtils.getListFromMap(builder.f3481h);
    }
}
