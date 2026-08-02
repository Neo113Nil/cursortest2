package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.dag.Provider;

/* loaded from: classes.dex */
public final class AppWithState extends App {
    public final Number duration;
    public final Number durationInForeground;
    public final Boolean inForeground;
    public final Boolean isLaunching;

    public AppWithState(ImmutableConfig immutableConfig, String str, String str2, String str3, String str4, Long l, Long l2, Boolean bool, Boolean bool2) {
        this(str, str2, str3, str4, null, immutableConfig.buildUuid, immutableConfig.appType, immutableConfig.versionCode, l, l2, bool, bool2);
    }

    @Override // com.bugsnag.android.App
    public final void serialiseFields$bugsnag_android_core_release(JsonStream jsonStream) {
        super.serialiseFields$bugsnag_android_core_release(jsonStream);
        jsonStream.name("duration");
        jsonStream.value(this.duration);
        jsonStream.name("durationInForeground");
        jsonStream.value(this.durationInForeground);
        jsonStream.name("inForeground");
        jsonStream.value(this.inForeground);
        jsonStream.name("isLaunching");
        jsonStream.value(this.isLaunching);
    }

    public AppWithState(String str, String str2, String str3, String str4, String str5, Provider provider, String str6, Number number, Number number2, Number number3, Boolean bool, Boolean bool2) {
        super(str, str2, str3, str4, str5, provider, str6, number);
        this.duration = number2;
        this.durationInForeground = number3;
        this.inForeground = bool;
        this.isLaunching = bool2;
    }
}
