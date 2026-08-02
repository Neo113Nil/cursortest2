package com.bugsnag.android;

import java.util.Date;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class DeviceWithState extends Device {
    public final Long freeDisk;
    public final Long freeMemory;
    public final String orientation;
    public final Date time;

    public DeviceWithState(DeviceBuildInfo deviceBuildInfo, Boolean bool, String str, String str2, Long l, LinkedHashMap linkedHashMap, Long l2, Long l3, String str3, Date date) {
        super(deviceBuildInfo, (String[]) deviceBuildInfo.cpuAbis, bool, str, str2, l, linkedHashMap);
        this.freeDisk = l2;
        this.freeMemory = l3;
        this.orientation = str3;
        this.time = date;
    }

    @Override // com.bugsnag.android.Device
    public final void serializeFields$bugsnag_android_core_release(JsonStream jsonStream) {
        super.serializeFields$bugsnag_android_core_release(jsonStream);
        jsonStream.name("freeDisk");
        jsonStream.value((Number) this.freeDisk);
        jsonStream.name("freeMemory");
        jsonStream.value((Number) this.freeMemory);
        jsonStream.name("orientation");
        jsonStream.value(this.orientation);
        Date date = this.time;
        if (date != null) {
            jsonStream.name("time");
            jsonStream.value(date);
        }
    }
}
