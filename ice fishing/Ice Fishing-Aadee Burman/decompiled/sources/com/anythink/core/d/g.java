package com.anythink.core.d;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17280a = "g";

    /* renamed from: b, reason: collision with root package name */
    private long f17281b = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    private long f17282c = 86400000;

    /* renamed from: d, reason: collision with root package name */
    private List<com.anythink.core.common.i.b> f17283d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f17284e = 1;

    /* renamed from: f, reason: collision with root package name */
    private long f17285f = 28800000;

    private g() {
    }

    private List<com.anythink.core.common.i.b> a() {
        return this.f17283d;
    }

    private boolean b() {
        return System.currentTimeMillis() >= this.f17281b + this.f17282c;
    }

    private long c() {
        return this.f17281b;
    }

    private int d() {
        return this.f17284e;
    }

    private long e() {
        return this.f17285f;
    }

    private void a(long j6) {
        this.f17281b = j6;
    }
}
