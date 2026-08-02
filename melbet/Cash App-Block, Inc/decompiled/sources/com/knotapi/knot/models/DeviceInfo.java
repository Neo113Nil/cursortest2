package com.knotapi.knot.models;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public class DeviceInfo {
    long availableMemory;
    long freeSpace;
    long totalMemory;
    long totalSpace;
    long usedSpace;
    String manufacturer = Build.MANUFACTURER;
    String model = Build.MODEL;
    String deviceName = Build.DEVICE;
    int sdkVersion = Build.VERSION.SDK_INT;
    String releaseVersion = Build.VERSION.RELEASE;
    String hardware = Build.HARDWARE;

    public DeviceInfo(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        this.totalMemory = memoryInfo.totalMem;
        this.availableMemory = memoryInfo.availMem;
        StatFs statFs = new StatFs(android.os.Environment.getDataDirectory().getAbsolutePath());
        this.totalSpace = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        this.freeSpace = freeBytes;
        this.usedSpace = this.totalSpace - freeBytes;
    }

    public String toJson() {
        StringBuilder sb = new StringBuilder("{\"manufacturer\":\"");
        sb.append(this.manufacturer);
        sb.append("\", \"model\":\"");
        sb.append(this.model);
        sb.append("\", \"deviceName\":\"");
        sb.append(this.deviceName);
        sb.append("\", \"sdkVersion\":");
        sb.append(this.sdkVersion);
        sb.append(", \"releaseVersion\":\"");
        sb.append(this.releaseVersion);
        sb.append("\", \"hardware\":\"");
        sb.append(this.hardware);
        sb.append("\", \"totalMemory\":");
        sb.append(this.totalMemory);
        sb.append(", \"availableMemory\":");
        sb.append(this.availableMemory);
        sb.append(", \"totalSpace\":");
        sb.append(this.totalSpace);
        sb.append(", \"freeSpace\":");
        sb.append(this.freeSpace);
        sb.append(", \"usedSpace\":");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.usedSpace, '}');
    }
}
