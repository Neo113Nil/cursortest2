package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private String f13899a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13900b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f13901c;

    public bq(String str, boolean z8) {
        this.f13899a = str;
        this.f13900b = z8;
    }

    public final synchronized void a(boolean z8) {
        this.f13901c = Boolean.valueOf(z8);
    }

    public final synchronized boolean b() {
        return this.f13900b;
    }

    public final synchronized Boolean c() {
        return this.f13901c;
    }

    public final synchronized String a() {
        return this.f13899a;
    }
}
