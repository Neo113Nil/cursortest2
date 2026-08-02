package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Device implements JsonStream.Streamable {
    public final String[] cpuAbi;
    public final String id;
    public final Boolean jailbroken;
    public final String locale;
    public final String manufacturer;
    public final String model;
    public final String osVersion;
    public final LinkedHashMap runtimeVersions;
    public final Long totalMemory;

    public Device(DeviceBuildInfo deviceBuildInfo, String[] strArr, Boolean bool, String str, String str2, Long l, LinkedHashMap linkedHashMap) {
        this.cpuAbi = strArr;
        this.jailbroken = bool;
        this.id = str;
        this.locale = str2;
        this.totalMemory = l;
        this.manufacturer = (String) deviceBuildInfo.manufacturer;
        this.model = (String) deviceBuildInfo.model;
        this.osVersion = (String) deviceBuildInfo.osVersion;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue().toString());
        }
        this.runtimeVersions = linkedHashMap2;
    }

    public void serializeFields$bugsnag_android_core_release(JsonStream jsonStream) {
        jsonStream.name("cpuAbi");
        jsonStream.value(this.cpuAbi);
        jsonStream.name("jailbroken");
        jsonStream.value(this.jailbroken);
        jsonStream.name("id");
        jsonStream.value(this.id);
        jsonStream.name("locale");
        jsonStream.value(this.locale);
        jsonStream.name("manufacturer");
        jsonStream.value(this.manufacturer);
        jsonStream.name("model");
        jsonStream.value(this.model);
        jsonStream.name("osName");
        jsonStream.value("android");
        jsonStream.name("osVersion");
        jsonStream.value(this.osVersion);
        jsonStream.name("runtimeVersions");
        jsonStream.value(this.runtimeVersions);
        jsonStream.name("totalMemory");
        jsonStream.value((Number) this.totalMemory);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        jsonStream.beginObject();
        serializeFields$bugsnag_android_core_release(jsonStream);
        jsonStream.endObject();
    }
}
