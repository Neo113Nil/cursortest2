package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private String f13490a;

    /* renamed from: b, reason: collision with root package name */
    private int f13491b;

    /* renamed from: c, reason: collision with root package name */
    private long f13492c;

    /* renamed from: d, reason: collision with root package name */
    private long f13493d;

    private aj() {
    }

    public static aj a(String str, int i) {
        aj ajVar = new aj();
        ajVar.f13490a = str;
        ajVar.f13491b = i;
        return ajVar;
    }

    public final long b() {
        return this.f13492c;
    }

    public final String c() {
        String str = this.f13490a;
        return str == null ? "" : str;
    }

    public final int d() {
        return this.f13491b;
    }

    public final String toString() {
        return "DynWFAdSourceFilterEntity{adSourceId='" + this.f13490a + "', filterReason=" + this.f13491b + ", reqLimitIntervalTime=" + this.f13492c + ", reqLimitEndTime=" + this.f13493d + '}';
    }

    public final void a(long j6) {
        this.f13492c = j6;
        if (j6 > 0) {
            this.f13493d = System.currentTimeMillis() + j6;
        }
    }

    public final long a() {
        return this.f13493d;
    }
}
