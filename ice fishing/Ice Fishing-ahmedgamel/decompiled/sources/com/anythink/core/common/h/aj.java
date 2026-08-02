package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private String f14276a;

    /* renamed from: b, reason: collision with root package name */
    private int f14277b;

    /* renamed from: c, reason: collision with root package name */
    private long f14278c;

    /* renamed from: d, reason: collision with root package name */
    private long f14279d;

    private aj() {
    }

    public static aj a(String str, int i) {
        aj ajVar = new aj();
        ajVar.f14276a = str;
        ajVar.f14277b = i;
        return ajVar;
    }

    public final long b() {
        return this.f14278c;
    }

    public final String c() {
        String str = this.f14276a;
        return str == null ? "" : str;
    }

    public final int d() {
        return this.f14277b;
    }

    public final String toString() {
        return "DynWFAdSourceFilterEntity{adSourceId='" + this.f14276a + "', filterReason=" + this.f14277b + ", reqLimitIntervalTime=" + this.f14278c + ", reqLimitEndTime=" + this.f14279d + '}';
    }

    public final void a(long j6) {
        this.f14278c = j6;
        if (j6 > 0) {
            this.f14279d = System.currentTimeMillis() + j6;
        }
    }

    public final long a() {
        return this.f14279d;
    }
}
