package com.datadog.android.api;

import com.datadog.android.core.InternalSdkCore;
import com.google.android.gms.internal.measurement.zzlj;

/* loaded from: classes.dex */
public interface InternalLogger {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final zzlj UNBOUND = new zzlj((InternalSdkCore) null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Target {
        public static final /* synthetic */ Target[] $VALUES;
        public static final Target MAINTAINER;
        public static final Target TELEMETRY;
        public static final Target USER;

        static {
            Target target = new Target("USER", 0);
            USER = target;
            Target target2 = new Target("MAINTAINER", 1);
            MAINTAINER = target2;
            Target target3 = new Target("TELEMETRY", 2);
            TELEMETRY = target3;
            $VALUES = new Target[]{target, target2, target3};
        }

        public static Target valueOf(String str) {
            return (Target) Enum.valueOf(Target.class, str);
        }

        public static Target[] values() {
            return (Target[]) $VALUES.clone();
        }
    }
}
