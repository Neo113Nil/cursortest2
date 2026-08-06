package com.yandex.varioqub.config.model;

import C1.a;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ConfigValue {
    public static final boolean BOOLEAN_DEFAULT_VALUE = false;
    public static final double DOUBLE_DEFAULT_VALUE = 0.0d;
    public static final long LONG_DEFAULT_VALUE = 0;
    public static final int SOURCE_DEFAULT = 0;
    public static final int SOURCE_INAPP_DEFAULT = 1;
    public static final int SOURCE_SERVER = 2;
    public static final String STRING_DEFAULT_VALUE = "";

    /* renamed from: a, reason: collision with root package name */
    private final String f2822a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2823b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2824c;
    public static final Companion Companion = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f2821d = Pattern.compile("^(true|false)$", 2);

    public static final class Companion {
        private Companion() {
        }

        public final ConfigValue createDefault$config_release() {
            return new ConfigValue("", 0, 0L, 4, null);
        }

        public final ConfigValue createInappDefault$config_release(String str) {
            return new ConfigValue(str, 1, 0L, 4, null);
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public ConfigValue(String str, int i2, long j2) {
        this.f2822a = str;
        this.f2823b = i2;
        this.f2824c = j2;
    }

    public final boolean asBoolean() {
        if (this.f2823b == 0) {
            return false;
        }
        Pattern pattern = f2821d;
        String str = this.f2822a;
        if (str == null) {
            str = "";
        }
        if (pattern.matcher(str).matches()) {
            return Boolean.parseBoolean(this.f2822a);
        }
        if (this.f2823b == 1) {
            return false;
        }
        throw new IllegalArgumentException(a.k(new StringBuilder("Value "), this.f2822a, " cannot be converted to type Boolean"));
    }

    public final double asDouble() {
        if (this.f2823b == 0) {
            return DOUBLE_DEFAULT_VALUE;
        }
        try {
            String str = this.f2822a;
            return str != null ? Double.parseDouble(str) : DOUBLE_DEFAULT_VALUE;
        } catch (NumberFormatException unused) {
            if (this.f2823b == 1) {
                return DOUBLE_DEFAULT_VALUE;
            }
            throw new IllegalArgumentException(a.k(new StringBuilder("Value "), this.f2822a, " cannot be converted to type Double"));
        }
    }

    public final long asLong() {
        if (this.f2823b == 0) {
            return 0L;
        }
        try {
            String str = this.f2822a;
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0L;
        } catch (NumberFormatException unused) {
            if (this.f2823b == 1) {
                return 0L;
            }
            throw new IllegalArgumentException(a.k(new StringBuilder("Value "), this.f2822a, " cannot be converted to type Long"));
        }
    }

    public final String asString() {
        String str;
        return (this.f2823b == 0 || (str = this.f2822a) == null) ? "" : str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ConfigValue.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.varioqub.config.model.ConfigValue");
        }
        ConfigValue configValue = (ConfigValue) obj;
        return i.a(this.f2822a, configValue.f2822a) && this.f2823b == configValue.f2823b && this.f2824c == configValue.f2824c;
    }

    public final int getSourceType() {
        return this.f2823b;
    }

    public final long getTestId() {
        return this.f2824c;
    }

    public final String getValue() {
        return this.f2822a;
    }

    public int hashCode() {
        String str = this.f2822a;
        return Long.hashCode(this.f2824c) + ((((str != null ? str.hashCode() : 0) * 31) + this.f2823b) * 31);
    }

    public String toString() {
        return "ConfigValue(value='" + this.f2822a + "', sourceType=" + this.f2823b + ", testId=" + this.f2824c + ')';
    }

    public /* synthetic */ ConfigValue(String str, int i2, long j2, int i3, e eVar) {
        this(str, i2, (i3 & 4) != 0 ? -1L : j2);
    }
}
