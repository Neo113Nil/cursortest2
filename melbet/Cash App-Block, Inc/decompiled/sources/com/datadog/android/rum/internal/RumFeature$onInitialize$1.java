package com.datadog.android.rum.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RumFeature$onInitialize$1 extends Lambda implements Function0 {
    public static final RumFeature$onInitialize$1 INSTANCE;
    public static final RumFeature$onInitialize$1 INSTANCE$1;
    public static final RumFeature$onInitialize$1 INSTANCE$10;
    public static final RumFeature$onInitialize$1 INSTANCE$2;
    public static final RumFeature$onInitialize$1 INSTANCE$3;
    public static final RumFeature$onInitialize$1 INSTANCE$4;
    public static final RumFeature$onInitialize$1 INSTANCE$5;
    public static final RumFeature$onInitialize$1 INSTANCE$6;
    public static final RumFeature$onInitialize$1 INSTANCE$7;
    public static final RumFeature$onInitialize$1 INSTANCE$8;
    public static final RumFeature$onInitialize$1 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new RumFeature$onInitialize$1(i, 1);
        INSTANCE$2 = new RumFeature$onInitialize$1(i, 2);
        INSTANCE$3 = new RumFeature$onInitialize$1(i, 3);
        INSTANCE$4 = new RumFeature$onInitialize$1(i, 4);
        INSTANCE$5 = new RumFeature$onInitialize$1(i, 5);
        INSTANCE$6 = new RumFeature$onInitialize$1(i, 6);
        INSTANCE$7 = new RumFeature$onInitialize$1(i, 7);
        INSTANCE$8 = new RumFeature$onInitialize$1(i, 8);
        INSTANCE$9 = new RumFeature$onInitialize$1(i, 9);
        INSTANCE$10 = new RumFeature$onInitialize$1(i, 10);
        INSTANCE = new RumFeature$onInitialize$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RumFeature$onInitialize$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Developer mode enabled, setting RUM sample rate to 100%.";
            case 1:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
            case 2:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
            case 3:
                return "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
            case 4:
                return "Last known exit reason has no trace information attached, cannot report fatal ANR.";
            case 5:
                return "Cannot open trace for the last known exit reason.";
            case 6:
                return "RUM feature received a log event where mandatory message field is either missing or has a wrong type.";
            case 7:
                return "RUM feature received a log event with stacktrace where mandatory message field is either missing or has a wrong type.";
            case 8:
                return "No last known RUM view event found, skipping fatal ANR reporting.";
            case 9:
                return "Couldn't get historical exit reasons";
            default:
                return "Slow frames monitoring enabled.";
        }
    }
}
