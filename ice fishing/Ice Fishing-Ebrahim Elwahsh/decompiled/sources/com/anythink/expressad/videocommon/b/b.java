package com.anythink.expressad.videocommon.b;

import com.anythink.core.common.res.b.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f22373a;

    /* renamed from: b, reason: collision with root package name */
    private int f22374b;

    /* renamed from: c, reason: collision with root package name */
    private int f22375c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.res.b.a f22376d;

    public b(String str, int i, int i4) {
        this.f22373a = str;
        this.f22374b = i;
        this.f22375c = i4;
        com.anythink.core.common.res.b.a a9 = com.anythink.core.common.res.b.c.a().a(this.f22373a);
        this.f22376d = a9;
        a9.a(new com.anythink.core.common.res.b.b(i, i4, 0L));
    }

    public final void a(a.b bVar) {
        this.f22376d.a(bVar);
    }

    public final void b() {
        this.f22376d.f();
    }

    public final void a() {
        this.f22376d.e();
    }
}
