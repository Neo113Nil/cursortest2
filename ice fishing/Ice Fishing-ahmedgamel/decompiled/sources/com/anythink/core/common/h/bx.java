package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    long f13835a;

    public bx(long j6, long j9) {
        this.f13835a = j6 + j9;
    }

    public final boolean a() {
        return System.currentTimeMillis() <= this.f13835a;
    }
}
