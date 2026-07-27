package com.anythink.core.d;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17438a = "g";

    /* renamed from: b, reason: collision with root package name */
    private long f17439b = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    private long f17440c = 86400000;

    /* renamed from: d, reason: collision with root package name */
    private List<com.anythink.core.common.i.b> f17441d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f17442e = 1;

    /* renamed from: f, reason: collision with root package name */
    private long f17443f = 28800000;

    private g() {
    }

    private List<com.anythink.core.common.i.b> a() {
        return this.f17441d;
    }

    private boolean b() {
        return System.currentTimeMillis() >= this.f17439b + this.f17440c;
    }

    private long c() {
        return this.f17439b;
    }

    private int d() {
        return this.f17442e;
    }

    private long e() {
        return this.f17443f;
    }

    private void a(long j9) {
        this.f17439b = j9;
    }
}
