package com.yandex.varioqub.analyticadapter.data;

/* loaded from: classes.dex */
public final class ConfigData {

    /* renamed from: a, reason: collision with root package name */
    private final String f2709a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2710b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2711c;

    public ConfigData(String str, String str2, long j2) {
        this.f2709a = str;
        this.f2710b = str2;
        this.f2711c = j2;
    }

    public final long getConfigLoadTimestamp() {
        return this.f2711c;
    }

    public final String getNewConfigVersion() {
        return this.f2710b;
    }

    public final String getOldConfigVersion() {
        return this.f2709a;
    }
}
