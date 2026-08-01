package com.anythink.expressad.videocommon.b;

import com.anythink.core.common.res.b.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f22215a;

    /* renamed from: b, reason: collision with root package name */
    private int f22216b;

    /* renamed from: c, reason: collision with root package name */
    private int f22217c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.res.b.a f22218d;

    public b(String str, int i, int i6) {
        this.f22215a = str;
        this.f22216b = i;
        this.f22217c = i6;
        com.anythink.core.common.res.b.a a9 = com.anythink.core.common.res.b.c.a().a(this.f22215a);
        this.f22218d = a9;
        a9.a(new com.anythink.core.common.res.b.b(i, i6, 0L));
    }

    public final void a(a.b bVar) {
        this.f22218d.a(bVar);
    }

    public final void b() {
        this.f22218d.f();
    }

    public final void a() {
        this.f22218d.e();
    }
}
