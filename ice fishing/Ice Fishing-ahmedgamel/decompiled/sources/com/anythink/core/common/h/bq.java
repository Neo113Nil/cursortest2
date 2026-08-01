package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private String f13742a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13743b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f13744c;

    public bq(String str, boolean z3) {
        this.f13742a = str;
        this.f13743b = z3;
    }

    public final synchronized void a(boolean z3) {
        this.f13744c = Boolean.valueOf(z3);
    }

    public final synchronized boolean b() {
        return this.f13743b;
    }

    public final synchronized Boolean c() {
        return this.f13744c;
    }

    public final synchronized String a() {
        return this.f13742a;
    }
}
