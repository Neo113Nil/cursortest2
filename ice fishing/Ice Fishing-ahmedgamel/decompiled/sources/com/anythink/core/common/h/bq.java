package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private String f14528a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14529b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f14530c;

    public bq(String str, boolean z6) {
        this.f14528a = str;
        this.f14529b = z6;
    }

    public final synchronized void a(boolean z6) {
        this.f14530c = Boolean.valueOf(z6);
    }

    public final synchronized boolean b() {
        return this.f14529b;
    }

    public final synchronized Boolean c() {
        return this.f14530c;
    }

    public final synchronized String a() {
        return this.f14528a;
    }
}
