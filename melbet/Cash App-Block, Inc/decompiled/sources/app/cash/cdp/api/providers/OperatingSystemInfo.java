package app.cash.cdp.api.providers;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OperatingSystemInfo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Name {
        public static final /* synthetic */ Name[] $VALUES;
        public static final Name ANDROID;

        static {
            Name name = new Name("ANDROID", 0);
            ANDROID = name;
            $VALUES = new Name[]{name};
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperatingSystemInfo)) {
            return false;
        }
        Name name = Name.ANDROID;
        String str = Build.VERSION.RELEASE;
        return Intrinsics.areEqual(str, str);
    }

    public final int hashCode() {
        return Build.VERSION.RELEASE.hashCode() + (Name.ANDROID.hashCode() * 31);
    }

    public final String toString() {
        return "OperatingSystemInfo(name=" + Name.ANDROID + ", version=" + Build.VERSION.RELEASE + ")";
    }
}
