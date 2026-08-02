package com.anythink.core.d;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18067a = "g";

    /* renamed from: b, reason: collision with root package name */
    private long f18068b = System.currentTimeMillis();

    /* renamed from: c, reason: collision with root package name */
    private long f18069c = 86400000;

    /* renamed from: d, reason: collision with root package name */
    private List<com.anythink.core.common.i.b> f18070d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private int f18071e = 1;

    /* renamed from: f, reason: collision with root package name */
    private long f18072f = 28800000;

    private g() {
    }

    private List<com.anythink.core.common.i.b> a() {
        return this.f18070d;
    }

    private boolean b() {
        return System.currentTimeMillis() >= this.f18068b + this.f18069c;
    }

    private long c() {
        return this.f18068b;
    }

    private int d() {
        return this.f18071e;
    }

    private long e() {
        return this.f18072f;
    }

    private void a(long j6) {
        this.f18068b = j6;
    }
}
