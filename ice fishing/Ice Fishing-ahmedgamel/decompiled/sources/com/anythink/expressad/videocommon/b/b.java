package com.anythink.expressad.videocommon.b;

import com.anythink.core.common.res.b.a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f23002a;

    /* renamed from: b, reason: collision with root package name */
    private int f23003b;

    /* renamed from: c, reason: collision with root package name */
    private int f23004c;

    /* renamed from: d, reason: collision with root package name */
    private com.anythink.core.common.res.b.a f23005d;

    public b(String str, int i, int i4) {
        this.f23002a = str;
        this.f23003b = i;
        this.f23004c = i4;
        com.anythink.core.common.res.b.a a9 = com.anythink.core.common.res.b.c.a().a(this.f23002a);
        this.f23005d = a9;
        a9.a(new com.anythink.core.common.res.b.b(i, i4, 0L));
    }

    public final void a(a.b bVar) {
        this.f23005d.a(bVar);
    }

    public final void b() {
        this.f23005d.f();
    }

    public final void a() {
        this.f23005d.e();
    }
}
