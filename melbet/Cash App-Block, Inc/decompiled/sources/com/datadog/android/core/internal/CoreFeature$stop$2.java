package com.datadog.android.core.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class CoreFeature$stop$2 extends Lambda implements Function0 {
    public static final CoreFeature$stop$2 INSTANCE;
    public static final CoreFeature$stop$2 INSTANCE$1;
    public static final CoreFeature$stop$2 INSTANCE$10;
    public static final CoreFeature$stop$2 INSTANCE$11;
    public static final CoreFeature$stop$2 INSTANCE$12;
    public static final CoreFeature$stop$2 INSTANCE$13;
    public static final CoreFeature$stop$2 INSTANCE$14;
    public static final CoreFeature$stop$2 INSTANCE$2;
    public static final CoreFeature$stop$2 INSTANCE$3;
    public static final CoreFeature$stop$2 INSTANCE$4;
    public static final CoreFeature$stop$2 INSTANCE$5;
    public static final CoreFeature$stop$2 INSTANCE$6;
    public static final CoreFeature$stop$2 INSTANCE$7;
    public static final CoreFeature$stop$2 INSTANCE$8;
    public static final CoreFeature$stop$2 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new CoreFeature$stop$2(i, 1);
        INSTANCE$2 = new CoreFeature$stop$2(i, 2);
        INSTANCE$3 = new CoreFeature$stop$2(i, 3);
        INSTANCE$4 = new CoreFeature$stop$2(i, 4);
        INSTANCE$5 = new CoreFeature$stop$2(i, 5);
        INSTANCE$6 = new CoreFeature$stop$2(i, 6);
        INSTANCE$7 = new CoreFeature$stop$2(i, 7);
        INSTANCE = new CoreFeature$stop$2(i, 0);
        INSTANCE$8 = new CoreFeature$stop$2(i, 8);
        INSTANCE$9 = new CoreFeature$stop$2(i, 9);
        INSTANCE$10 = new CoreFeature$stop$2(i, 10);
        INSTANCE$11 = new CoreFeature$stop$2(i, 11);
        INSTANCE$12 = new CoreFeature$stop$2(i, 12);
        INSTANCE$13 = new CoreFeature$stop$2(i, 13);
        INSTANCE$14 = new CoreFeature$stop$2(i, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreFeature$stop$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Trying to shut down Kronos when it is already not running";
            case 1:
                return "Unable to read your application's version name";
            case 2:
                return "Unable to launch a synchronize local time with an NTP server.";
            case 3:
                return "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
            case 4:
                return "Failed to read Build ID information, de-obfuscation may not work properly.";
            case 5:
                return "Datadog SDK was initialized in a secondary process: although data will still be captured, nothing will be uploaded from this process. Make sure to also initialize the SDK from the main process of your application.";
            case 6:
                return Unit.INSTANCE;
            case 7:
                return "Thread was unable to set its own interrupted state";
            case 8:
                return "Unable to remove shutdown hook, Runtime is already shutting down";
            case 9:
                return "Security Manager denied removing shutdown hook ";
            case 10:
                return "Unable to add shutdown hook, Runtime is already shutting down";
            case 11:
                return "Shutdown hook was rejected";
            case 12:
                return "Security Manager denied adding shutdown hook ";
            case 13:
                return "No need to write last RUM view event: NDK crash reports feature is not enabled and API is below 30.";
            default:
                return "Cannot generate SHA-256 hash.";
        }
    }
}
