package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ag;
import com.anythink.core.common.n.b.x;

/* loaded from: classes.dex */
public final class h extends ag {

    /* renamed from: a, reason: collision with root package name */
    private final String f15065a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15066b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.n.c.e f15067c;

    public h(String str, long j6, com.anythink.core.common.n.c.e eVar) {
        this.f15065a = str;
        this.f15066b = j6;
        this.f15067c = eVar;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final x a() {
        String str = this.f15065a;
        if (str != null) {
            return x.b(str);
        }
        return null;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final long b() {
        return this.f15066b;
    }

    @Override // com.anythink.core.common.n.b.ag
    public final com.anythink.core.common.n.c.e c() {
        return this.f15067c;
    }
}
