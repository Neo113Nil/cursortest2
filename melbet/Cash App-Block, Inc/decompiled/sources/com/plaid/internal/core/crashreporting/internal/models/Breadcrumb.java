package com.plaid.internal.core.crashreporting.internal.models;

import com.google.gson.annotations.SerializedName;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.plaid.internal.C0322x;
import com.squareup.ecr.BuildConfig;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002&'BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fHÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb;", "", "type", "Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;", "timestamp", "Ljava/util/Date;", "level", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "message", "", "category", "data", "", "(Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;Ljava/util/Date;Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getCategory", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "getLevel", "()Lcom/plaid/internal/core/crashreporting/internal/models/CrashLogLevel;", "getMessage", "getTimestamp", "()Ljava/util/Date;", "getType", "()Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Level", "Type", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Breadcrumb {

    @SerializedName("category")
    private final String category;

    @SerializedName("data")
    private final Map<String, String> data;

    @SerializedName("level")
    private final CrashLogLevel level;

    @SerializedName("message")
    private final String message;

    @SerializedName("timestamp")
    private final Date timestamp;

    @SerializedName("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Level;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Level {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;

        @SerializedName("value")
        private final String value;
        public static final Level DEBUG = new Level("DEBUG", 0, BuildConfig.BUILD_TYPE);
        public static final Level INFO = new Level("INFO", 1, "info");
        public static final Level WARNING = new Level("WARNING", 2, "warning");
        public static final Level ERROR = new Level("ERROR", 3, BreadcrumbHelper.Category.ERROR);
        public static final Level CRITICAL = new Level("CRITICAL", 4, "critical");

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{DEBUG, INFO, WARNING, ERROR, CRITICAL};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Level(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/Breadcrumb$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "HTTP", "NAVIGATION", "USER", "USER_ACTION", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type DEFAULT = new Type("DEFAULT", 0, "default");
        public static final Type HTTP = new Type("HTTP", 1, "http");
        public static final Type NAVIGATION = new Type("NAVIGATION", 2, BreadcrumbHelper.Category.NAVIGATION);
        public static final Type USER = new Type("USER", 3, "user");
        public static final Type USER_ACTION = new Type("USER_ACTION", 4, BreadcrumbHelper.Category.USER_ACTION);

        @SerializedName("value")
        private final String value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{DEFAULT, HTTP, NAVIGATION, USER, USER_ACTION};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Type(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Breadcrumb(Type type2, Date date, CrashLogLevel crashLogLevel, String str, String str2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, date, crashLogLevel, str, str2, map);
        type2 = (i & 1) != 0 ? null : type2;
        date = (i & 2) != 0 ? new Date() : date;
        crashLogLevel = (i & 4) != 0 ? CrashLogLevel.INFO : crashLogLevel;
        str = (i & 8) != 0 ? "" : str;
        str2 = (i & 16) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
    }

    public static /* synthetic */ Breadcrumb copy$default(Breadcrumb breadcrumb, Type type2, Date date, CrashLogLevel crashLogLevel, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = breadcrumb.type;
        }
        if ((i & 2) != 0) {
            date = breadcrumb.timestamp;
        }
        if ((i & 4) != 0) {
            crashLogLevel = breadcrumb.level;
        }
        if ((i & 8) != 0) {
            str = breadcrumb.message;
        }
        if ((i & 16) != 0) {
            str2 = breadcrumb.category;
        }
        if ((i & 32) != 0) {
            map = breadcrumb.data;
        }
        String str3 = str2;
        Map map2 = map;
        return breadcrumb.copy(type2, date, crashLogLevel, str, str3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component3, reason: from getter */
    public final CrashLogLevel getLevel() {
        return this.level;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> component6() {
        return this.data;
    }

    public final Breadcrumb copy(Type type2, Date timestamp, CrashLogLevel level, String message, String category, Map<String, String> data) {
        timestamp.getClass();
        level.getClass();
        message.getClass();
        category.getClass();
        data.getClass();
        return new Breadcrumb(type2, timestamp, level, message, category, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Breadcrumb)) {
            return false;
        }
        Breadcrumb breadcrumb = (Breadcrumb) other;
        return this.type == breadcrumb.type && Intrinsics.areEqual(this.timestamp, breadcrumb.timestamp) && this.level == breadcrumb.level && Intrinsics.areEqual(this.message, breadcrumb.message) && Intrinsics.areEqual(this.category, breadcrumb.category) && Intrinsics.areEqual(this.data, breadcrumb.data);
    }

    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> getData() {
        return this.data;
    }

    public final CrashLogLevel getLevel() {
        return this.level;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Date getTimestamp() {
        return this.timestamp;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        Type type2 = this.type;
        return this.data.hashCode() + C0322x.a(this.category, C0322x.a(this.message, (this.level.hashCode() + ((this.timestamp.hashCode() + ((type2 == null ? 0 : type2.hashCode()) * 31)) * 31)) * 31, 31), 31);
    }

    public String toString() {
        return "Breadcrumb(type=" + this.type + ", timestamp=" + this.timestamp + ", level=" + this.level + ", message=" + this.message + ", category=" + this.category + ", data=" + this.data + ")";
    }

    public Breadcrumb(Type type2, Date date, CrashLogLevel crashLogLevel, String str, String str2, Map<String, String> map) {
        date.getClass();
        crashLogLevel.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        this.type = type2;
        this.timestamp = date;
        this.level = crashLogLevel;
        this.message = str;
        this.category = str2;
        this.data = map;
    }

    public Breadcrumb() {
        this(null, null, null, null, null, null, 63, null);
    }
}
